## 📘 LeetCode 1343 - Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

### 💡 Idea

Maintain a fixed-size window of `k` elements and check if its average satisfies the given threshold.

---

### 🧠 Approach

* Calculate the sum of the first `k` elements
* Check if the current window average meets the threshold
* Slide the window through the array:

  * Add the new element
  * Remove the element leaving the window
* Count every window that satisfies the condition
* Return the total count

---

### ⏱ Complexity

* **Time:** O(n)
* **Space:** O(1)

---

### 🧩 Pattern

Sliding Window (Fixed Size)
