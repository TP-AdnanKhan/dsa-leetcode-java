## 📘 LeetCode 26 - Remove Duplicates from Sorted Array

### 💡 Idea

Scan the sorted array and collect only the first occurrence of each new value into a separate array while skipping duplicates.

---

### 🧠 Approach

* Use two pointers to traverse the array
* Maintain a new array to store unique elements
* Compare adjacent values to detect duplicates
* Add only different values to result array
* Copy result back to original array

---

### ⏱ Complexity

* **Time:** O(n)
* **Space:** O(n)

---

### 🧩 Pattern

Two Pointers (with extra array)
