## 📘 LeetCode 643 - Maximum Average Subarray I

### 💡 Idea

Calculate the sum of the first window and slide it through the array by adding the new element and removing the old one.

---

### 🧠 Approach

* Calculate sum of the first `k` elements
* Store it as the initial maximum sum
* Move the window one step at a time:

  * Add the new element
  * Remove the element leaving the window
* Update maximum sum found
* Divide maximum sum by `k` to get the average

---

### ⏱ Complexity

* **Time:** O(n)
* **Space:** O(1)

---

### 🧩 Pattern

Sliding Window (Fixed Size)
