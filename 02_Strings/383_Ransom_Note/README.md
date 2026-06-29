## 📘 LeetCode 383 - Ransom Note

### 💡 Idea

Use character frequency mapping of the magazine and try to “consume” characters required for the ransom note.

---

### 🧠 Approach

* Build a frequency map for all characters in `magazine`
* Traverse `ransomNote`
* For each character, check if it exists in the map with positive count
* If yes, decrease its count
* If not available, return false
* If all characters are satisfied, return true

---

### ⏱ Complexity

* **Time:** O(n + m)
* **Space:** O(1) (fixed character set)

---

### 🧩 Pattern

HashMap Frequency Counting / Greedy Consumption
