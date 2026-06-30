## 📘 LeetCode 1004 - Max Consecutive Ones III

### 💡 Idea

Maintain a window that contains at most `k` zeros and find the maximum length possible by expanding and shrinking the window.

---

### 🧠 Approach

* Use two pointers `l` and `r` to maintain current window
* Expand window using `r`
* Count zeros inside the window
* If zeros exceed `k`, move `l` forward until the window becomes valid again
* Update maximum window length

---

### ⏱ Complexity

* **Time:** O(n)
* **Space:** O(1)

---

### 🧩 Pattern

Sliding Window (Variable Size)
