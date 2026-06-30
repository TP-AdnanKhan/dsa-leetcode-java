## 📘 LeetCode 1207 - Unique Number of Occurrences

### 💡 Idea

Count the frequency of each number and check whether all frequency values are unique.

---

### 🧠 Approach

* Store each number's occurrence count using a HashMap
* Keep track of unique numbers
* Create a list containing all occurrence counts
* Sort the frequency list
* Compare adjacent frequencies to find duplicates
* Return true if all counts are different

---

### ⏱ Complexity

* **Time:** O(n + k log k)
* **Space:** O(n)

---

### 🧩 Pattern

HashMap Frequency Counting + Sorting
