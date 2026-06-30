## 📘 LeetCode 169 - Majority Element

### 💡 Idea

Count the frequency of each element and find the element whose occurrence is greater than half of the array size.

---

### 🧠 Approach

* Store frequency of each number using a HashMap
* Traverse the array and update counts
* Traverse the array again
* Check which number has frequency greater than `n/2`
* Return that number

---

### ⏱ Complexity

* **Time:** O(n)
* **Space:** O(n)

---

### 🧩 Pattern

HashMap Frequency Counting
