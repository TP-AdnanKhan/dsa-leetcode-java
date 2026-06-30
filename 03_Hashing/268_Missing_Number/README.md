## 📘 LeetCode 268 - Missing Number

### 💡 Idea

Sort the array and check each index to find the first position where the value does not match the expected number.

---

### 🧠 Approach

* Sort the array in ascending order
* Traverse the array with index values
* Compare each element with its expected value
* Return the index when mismatch is found
* If all values match, return array length

---

### ⏱ Complexity

* **Time:** O(n log n)
* **Space:** O(1)

---

### 🧩 Pattern

Sorting + Linear Search
