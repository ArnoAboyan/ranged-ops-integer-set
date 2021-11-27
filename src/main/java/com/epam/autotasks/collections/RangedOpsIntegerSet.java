package com.epam.autotasks.collections;

import java.util.AbstractSet;
import java.util.Iterator;

class RangedOpsIntegerSet extends AbstractSet<Integer> {

    public boolean add(int fromInclusive, int toExclusive) {
        throw new UnsupportedOperationException();
    }

    public boolean remove(int fromInclusive, int toExclusive) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(final Integer integer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(final Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<Integer> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException();
    }
}
