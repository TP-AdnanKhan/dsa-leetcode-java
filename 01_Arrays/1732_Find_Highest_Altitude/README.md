## 📘 LeetCode 1732 - Find the Highest Altitude

### 💡 Idea

Keep tracking the cumulative altitude while iterating and store the maximum altitude reached at any point.

---

### 🧠 Approach

* Start from altitude `0`
* Traverse the `gain` array
* Continuously add each gain to current altitude
* Update maximum altitude whenever current value increases
* Return the maximum value found

---

### ⏱ Complexity

* **Time:** O(n)
* **Space:** O(1)

---

### 🧩 Pattern

Prefix Sum (Running Maximum)
