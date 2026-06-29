## 📘 LeetCode 88 - Merge Sorted Array

### 💡 Idea

Merge two sorted arrays by comparing elements one by one and storing the result in a new array, then copy it back to the first array.

---

### 🧠 Approach

* Use two pointers for `nums1` and `nums2`
* Compare current elements from both arrays
* Place the smaller element into a new array
* Copy remaining elements after one array ends
* Copy merged result back into `nums1`

---

### ⏱ Complexity

* **Time:** O(m + n)
* **Space:** O(m + n)

---

### 🧩 Pattern

Two Pointers (Merge using Extra Space)
