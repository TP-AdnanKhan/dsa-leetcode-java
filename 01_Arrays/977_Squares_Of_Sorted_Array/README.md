## 📘 LeetCode 977 - Squares of a Sorted Array

### 💡 Idea

Compare squares of elements from both ends of the sorted array and fill the result array from the back with the larger square each time.

---

### 🧠 Approach

* Use two pointers: `left` at start, `right` at end
* Compare `nums[left]^2` and `nums[right]^2`
* Place larger square at the end of result array
* Move corresponding pointer inward
* Repeat until all elements are processed

---

### ⏱ Complexity

* **Time:** O(n)
* **Space:** O(n)

---

### 🧩 Pattern

Two Pointers (Sorted Array Merge from Ends)
