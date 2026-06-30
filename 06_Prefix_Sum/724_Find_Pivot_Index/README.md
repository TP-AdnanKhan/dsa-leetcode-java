## 📘 LeetCode 724 - Find Pivot Index

### 💡 Idea

For each index, calculate the sum of elements on its left and right side and return the index where both sums are equal.

---

### 🧠 Approach

* Loop through each index `i`
* Compute left sum from start to `i-1`
* Compute right sum from `i+1` to end
* Compare both sums
* Return index if they are equal
* Return -1 if no pivot exists

---

### ⏱ Complexity

* **Time:** O(n²)
* **Space:** O(1)

---

### 🧩 Pattern

Brute Force (Prefix Sum Simulation)
