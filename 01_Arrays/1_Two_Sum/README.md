## 📘 LeetCode 1 - Two Sum

### 💡 Idea

Check every pair of numbers in the array and return the first pair whose sum equals the target.

---

### 🧠 Approach

* Iterate through array using first index `i`
* For each `i`, check all next elements `j > i`
* If `nums[i] + nums[j] == target`, store indices
* Break once pair is found and return result

---

### ⏱ Complexity

* **Time:** O(n²)
* **Space:** O(1)

---

### 🧩 Pattern

Brute Force (Nested Loop Search)
