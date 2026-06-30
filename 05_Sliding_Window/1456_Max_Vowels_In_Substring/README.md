## 📘 LeetCode 1456 - Maximum Number of Vowels in a Substring of Given Length

### 💡 Idea

Use a fixed-size window to count vowels in each substring and keep track of the maximum vowel count found.

---

### 🧠 Approach

* Count vowels in the first `k` characters
* Store this as the initial maximum count
* Slide the window through the string:

  * Add the new character if it is a vowel
  * Remove the outgoing character if it is a vowel
* Update maximum vowel count after each window shift
* Return the maximum value

---

### ⏱ Complexity

* **Time:** O(n)
* **Space:** O(1)

---

### 🧩 Pattern

Sliding Window (Fixed Size)
