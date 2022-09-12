package com.epam.autotasks.collections;

import java.util.*;


class RangedOpsIntegerSet extends AbstractSet<Integer> {

    public List<Integer> numbers = new ArrayList<>();

    public boolean add(int fromInclusive, int toExclusive) {
        boolean res = false;
        for (int i = fromInclusive; i < toExclusive; i++) {
            boolean result = add(i);
            if (result && !res) res = true;
        }
        return res;
    }

    public boolean remove(int fromInclusive, int toExclusive) {

        Integer counter = 0;
        for (int i = fromInclusive; i < toExclusive; i++) {

            if (numbers.contains(i)) {
                numbers.remove((Integer) i);
                counter++;
            }
        }
        return counter>0;
    }

    public boolean elementCheck(Integer number) {
        for (Integer num : numbers) {
            if (num.equals(number)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(final Integer integer) {

        if (!elementCheck(integer)) {
            numbers.add(integer);
            Collections.sort(numbers);
            return true;
        }
        return false;
    }



    @Override
    public Iterator<Integer> iterator() {

        return  new IntegerIterator();

    }


    class IntegerIterator implements Iterator<Integer> {
     int i = 0;
        @Override
        public boolean hasNext() {
           return numbers.toArray().length > i;
        }

        @Override
        public Integer next() {
            Integer[] arr= numbers.toArray(new Integer[0]);
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return arr[i++];
        }
    }

    @Override
    public int size() {
        return numbers.size();
    }


    public static void main(String[] args) {
        RangedOpsIntegerSet set = new RangedOpsIntegerSet();
        set.add(11, 15);
        set.add(7);
        set.remove(12,14);
        for (Integer num : set) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}