## 📘 LeetCode 27 - Remove Element

### 💡 Idea

Scan the array and keep only elements that are not equal to the given value by shifting valid elements into a new position.

---

### 🧠 Approach

* Traverse the array using pointers
* Check each element against the target value
* If element is not equal, copy it forward into result position
* Skip elements equal to the given value
* Return the count of valid elements

---

### ⏱ Complexity

* **Time:** O(n)
* **Space:** O(1)

---

### 🧩 Pattern

Two Pointers (In-place Filtering)
