# Ranged Ops Integer Set

The purpose of this exercise is to train you in implementing Collections.

Estimated workload of this exercise is _60 min_.

### Description

Please, proceed to [RangedOpsIntegerSet](src/main/java/com/epam/autotasks/collections/RangedOpsIntegerSet.java)
and implement its methods.

RangedOpsIntegerSet is a Set of Integer. It has two additional methods:

- `boolean add(int fromInclusive, int toExclusive)`
- `boolean remove(int fromInclusive, int toExclusive)`

These methods are for adding/removing ranges of values.

You need to implement following methods:

- add (*single-value*) - adds a single value into the set
- remove (*single-value*) - removes a single value from the set
- add (*ranged*) - adds a range of values into the set (first argument - inclusive, last argument - exclusive).
  Return `true` if any of range values were actually added.
- remove(*ranged*)- removes a range of values from the list (first argument - inclusive, last argument - exclusive).
  Return `true` if any of range values were actually removed.
- iterator - iterates over elements of the set in natural order.
- size - returns the number of current queue elements

### Examples

```java
RangedOpsIntegerSet set = new RangedOpsIntegerSet();
set.add(1, 5);
for(Integer el : set){
    System.out.println(el);
}
```

```
1
2
3
4
```

---

```java
RangedOpsIntegerSet set = new RangedOpsIntegerSet();
set.add(1, 5);
set.add(9, 11);
for(Integer el : set){
    System.out.println(el);
}
```

```
1
2
3
4
9
10
```

---

```java
RangedOpsIntegerSet set = new RangedOpsIntegerSet();
set.add(1, 15);
set.remove(3, 12);
for(Integer el : set){
    System.out.println(el);
}
```

```
1
2
12
13
14
```

---