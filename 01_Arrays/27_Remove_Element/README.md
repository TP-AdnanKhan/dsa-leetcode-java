## 📘 LeetCode 27 - Remove Element

### 💡 Idea

Filter out all occurrences of the given value into a temporary array, then overwrite the original array with the remaining elements.

---

### 🧠 Approach

* Traverse the input array
* Check each element against `val`
* If not equal, store it in a new array `nums1`
* Keep track of valid count `k`
* Copy filtered elements back into original array
* Return `k` as new length

---

### ⏱ Complexity

* **Time:** O(n)
* **Space:** O(n)

---

### 🧩 Pattern

Two Pointers
