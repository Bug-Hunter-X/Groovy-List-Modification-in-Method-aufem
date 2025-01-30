# Groovy List Modification Surprise

This example demonstrates a subtle point about list handling in Groovy.  Because lists are passed by reference, changes within a method can affect the original list. However, the example might lead to unexpected results if the developer doesn't understand this behavior.

The `bug.groovy` file contains the code exhibiting this behavior.  The `bugSolution.groovy` file shows how to resolve it by explicitly creating a copy of the list.