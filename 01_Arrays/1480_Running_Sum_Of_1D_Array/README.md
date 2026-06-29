## 📘 LeetCode 1480 - Running Sum of 1d Array

### 💡 Idea

Build a new array where each position stores the cumulative sum of all elements from index 0 to the current index.

---

### 🧠 Approach

* Initialize a running sum variable
* Traverse the array from left to right
* Add each element to running sum
* Store running sum in a new array at the same index
* Return the new array

---

### ⏱ Complexity

* **Time:** O(n)
* **Space:** O(n)

---

### 🧩 Pattern

Prefix Sum (Running Sum)
