## 📘 LeetCode 567 - Permutation in String

### 💡 Idea

Maintain a window of the same size as `s1` in `s2` and compare character frequencies to check if a permutation exists.

---

### 🧠 Approach

* Create a frequency map for characters of `s1`
* Create the initial window map from the first `s1.length()` characters of `s2`
* Compare both maps
* Slide the window through `s2`:

  * Add the new character
  * Remove the outgoing character
* If both frequency maps match, return true

---

### ⏱ Complexity

* **Time:** O(n)
* **Space:** O(k)

---

### 🧩 Pattern

Sliding Window + HashMap Frequency Counting
