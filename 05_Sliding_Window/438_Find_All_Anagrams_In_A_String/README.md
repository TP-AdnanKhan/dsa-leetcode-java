## 📘 LeetCode 438 - Find All Anagrams in a String

### 💡 Idea

Create frequency maps for the pattern and current window, then slide the window through the string to find matching character frequencies.

---

### 🧠 Approach

* Store character frequencies of `p` in a HashMap
* Create initial window of size `p.length()` from `s`
* Compare window frequency map with pattern map
* Slide the window one character at a time:

  * Add the new character
  * Remove the leftmost character
* If both maps are equal, store the starting index

---

### ⏱ Complexity

* **Time:** O(n)
* **Space:** O(k)

---

### 🧩 Pattern

Sliding Window + HashMap Frequency Counting
