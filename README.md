# Ranged Ops Integer Set

The purpose of this exercise is to train you in implementing Collections.

Estimated workload of this exercise is _60 min_.

### Description

Please, proceed to [RangedOpsIntegerSet](src/main/java/com/epam/autotasks/collections/RangedOpsIntegerSet.java)
and implement its methods.



A median queue must return its median element.\
Median here is an element than is less than 50% of the items in the queue and more than 50% of the items in the queue.
Median represents middle value of the collection.    
For instance, if you put `1, 2, 3, 4, 5` to the queue and then pull an element of it, queue will return `3`.\
If there is even amount of elements, there are two possible values to return. Return a lower one.\

You need to implement following methods:

- offer - pushes an element to a queue
- poll - pulls an element out of the queue
- peek - get the first element on the top of the queue (just gets, without pulling it out)
- iterator - iterates over elements of a queue (no need to keep order)
- size - just presents the number of current queue elements

You must not use arrays, Lists or Sets in your implementation.

### Examples:

- `1, 10, 100` &rightarrow; `10`
- `100, 10, 1` &rightarrow; `10`
- `100, 1, 10` &rightarrow; `10`
- `1, 987, 2` &rightarrow; `2`
- `1, 987, 2, 3` &rightarrow; `2`
- `1, 987, 4, 2, 3` &rightarrow; `3`
- `1, 2, 3, 3, 3` &rightarrow; `3`
