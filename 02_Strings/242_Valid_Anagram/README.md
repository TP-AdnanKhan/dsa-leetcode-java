## 📘 LeetCode 242 - Valid Anagram

### 💡 Idea

Build frequency maps for both strings and compare character counts to check if both strings contain the same characters with the same frequencies.

---

### 🧠 Approach

* If lengths differ, return false immediately
* Traverse both strings together
* Build frequency map for `s` and `t`
* Store unique characters from `s`
* Compare frequency of each stored character in both maps
* If all match, return true; otherwise false

---

### ⏱ Complexity

* **Time:** O(n)
* **Space:** O(n)

---

### 🧩 Pattern

HashMap Frequency Counting
