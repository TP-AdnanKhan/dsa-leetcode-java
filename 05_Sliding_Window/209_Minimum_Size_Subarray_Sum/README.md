## 📘 LeetCode 209 - Minimum Size Subarray Sum

### 💡 Idea

Maintain a sliding window with a running sum and shrink it whenever the current sum reaches the target to find the smallest valid length.

---

### 🧠 Approach

* Use two pointers `l` and `r` to represent current window
* Expand the window by adding elements using `r`
* When sum becomes greater than or equal to target:

  * Update minimum length
  * Remove elements from the left side
* Continue until the array is traversed
* Return minimum length or `0` if no valid subarray exists

---

### ⏱ Complexity

* **Time:** O(n)
* **Space:** O(1)

---

### 🧩 Pattern

Sliding Window (Variable Size)
