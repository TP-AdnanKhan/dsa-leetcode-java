## 📘 LeetCode 217 - Contains Duplicate

### 💡 Idea

Store visited numbers in a HashMap and immediately return true if a number appears again.

---

### 🧠 Approach

* Create a HashMap to track seen elements
* Traverse the array
* Check if current element already exists
* If duplicate is found, return true
* Add new elements to the map
* Return false if no duplicate exists

---

### ⏱ Complexity

* **Time:** O(n)
* **Space:** O(n)

---

### 🧩 Pattern

HashMap (Frequency / Presence Checking)
