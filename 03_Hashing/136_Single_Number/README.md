## 📘 LeetCode 136 - Single Number

### 💡 Idea

Count the occurrences of each number and return the number that appears only once.

---

### 🧠 Approach

* Create a HashMap to store frequency of elements
* Traverse the array and update count for each number
* Traverse the array again
* Check which number has frequency `1`
* Return that number

---

### ⏱ Complexity

* **Time:** O(n)
* **Space:** O(n)

---

### 🧩 Pattern

HashMap Frequency Counting
