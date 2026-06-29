## 📘 LeetCode 1502 - Can Make Arithmetic Progression From Sequence

### 💡 Idea

Sort the array first, then check if the difference between every consecutive pair remains the same throughout.

---

### 🧠 Approach

* Sort the array using bubble sort
* Compute the difference between first two elements
* Traverse the array and compare each consecutive difference
* If any difference mismatch is found, return false
* Otherwise return true

---

### ⏱ Complexity

* **Time:** O(n²)
* **Space:** O(1)

---

### 🧩 Pattern

Sorting + Linear Check
