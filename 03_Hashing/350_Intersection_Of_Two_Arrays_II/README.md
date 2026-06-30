## 📘 LeetCode 350 - Intersection of Two Arrays II

### 💡 Idea

Store frequencies of elements from the first array and match them while traversing the second array to find common elements.

---

### 🧠 Approach

* Create a HashMap to store frequency of `nums1` elements
* Traverse `nums2`
* If element exists and count is available:

  * Add it to result list
  * Decrease its frequency
* Convert result list into an array
* Return the intersection array

---

### ⏱ Complexity

* **Time:** O(n + m)
* **Space:** O(n)

---

### 🧩 Pattern

HashMap Frequency Counting / Array Intersection
