# Array Data Structure

## Linear Search and the Binary Search Algorithms for arrays
- Searching: 
  - Searching is a very common task in computer programming. 
  - Many algorithms and data structures are invented to support fast searching. 
- Searching arrays:
  - Arrays are often used to store a large amount of data.
  - Searching is the process of looking for a specific element in an array.
  - There are two search techniques for arrays: **linear search** and **binary search**. 
> **The Search Problem for Arrays**:
> - For a given search value `key`, find the index of the first array element that contains the search value `key`.
> - Return `-1` when the `key` is not found in the array. 

- Linear Search algorithm:
  - The linear search algorithm compares the search value `key` sequentially with each element in the array.
  - The linear search algorithm continues to do so until the `key` matches an element in the array or the array is exhausted without a match being found. 
  - If a match is made, the linear search returns the index of the element in the array that matches the `key`.
  - If no match is found, the search returns `-1`.

```java
/**
 * The linear search algorithm to find key in the array list
 */ 
public static int linearSearch(int[] list, int key) {
    for (int i = 0; i < list.length, i++>) {
        if (list[i] == key) {
            return i;
        }
    }
    // key is not found in list[]
    return -1;
}
```
- Complexity Analysis:
  - Best case scenario: the first element in the array contains the search key. Running time = 1 step (iteration)
  - Worst case scenario: array does not contain the search key. We run through the whole array. Running time = $N$ steps. 
  - Average case scenario: on average, we will probe half of the array elements. Running time = $\frac{N}{2}$ steps.
- Binary search is a more efficient (faster) search algorithm for arrays.
  - For binary search to work, the elements in the array must already be ordered.
    - For the presentation of the binary search, we assume that the array is in ascending order. 
  - The binary search compares the `key` with the element in the middle of the array. 

```java
/**
 * The binary search algorithm for arrays
 */
public static int binarySearch(int[] list, int key) {
    int low = 0;
    int high = list.length - 1;

    while (low <= high) {
        int mid = (low + high) / 2;
        if (list[mid] == key) {
            return mid;
        } else if (list[mid] < key) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    // If key is not found in the list[]
    return -1;
} 
```

- Complexity Analysis:
  - Best case scenario: the middle element in the array contains the search key. Running time = 1 step (iteration).
  - Worse case scenario: Suppose the binary search takes $k$ iterations to complete, then $\frac{N}{2^k}=1$ (after halving $N$ elements for $k$ times, we get 1). Solving the equation, we get $k=\log(N)+1$. So, running time $\approx\log(N)$ steps.
  - Average case scenario: it is very hard to estimate, but we can use the worse case scenario as an upper bound for the running time in average.

## Adding or Deleting Elements from an Array.
- Adding an element at the end of an array
  - The array size is fixed after its creation.
  - To add a new element to the end of an array:
    - Create a new array with the 1 more element
    - Copy the elements in the original array to the new array.
    - Copy the new value in the last element of the new array.
    - Change the array reference to point to the new array. 
```java
public static int[] addElement(int[] x, int e) {
    int[] temp = new int[x.length + 1];
    for (int i = 0; i < x.length; i++) {// copying
        temp[i] = x[i];
    } 
    temp[temp.length - 1] = e;
    return temp;
}
```
- The algorithm executes $\texttt{x.length}+1$ data copy statements per addition.
- Deleting the last element from an array.
  - The array size is fixed after its creation.
  - To delete the last element from an array:
    - Create a new array with the 1 less element.
    - Copy all except the last elements in the original array to the new array.
    - Change the array reference to point to the new array.
```java
public static int[] deleteElement(int[] x) {
    int[] temp = new int[x.lenght - 1];
    for (int i = 0; i < temp.length; i++) {
        temp[i] = x[i];
    }
    return temp;
}
```
- We can delete an element at a different location with a similar algorithm. 
- A better way to add and delete elements in arrays: Dynamic arrays (aka. `ArrayList` in Java). It consists of
  - A (fixed size) array
  - A count of the actual number of elements stored in the array.
  - The array is increased only when the `add()` operation encounters a full array.
  - The array is reduced when the occupancy drops below a certain threshold. 