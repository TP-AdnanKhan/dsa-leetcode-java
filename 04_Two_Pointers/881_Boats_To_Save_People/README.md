## 📘 LeetCode 881 - Boats to Save People

### 💡 Idea

Sort the people by weight and try to pair the lightest person with the heaviest person whenever possible.

---

### 🧠 Approach

* Sort the array of weights
* Use two pointers:

  * `l` at the lightest person
  * `r` at the heaviest person
* Check if both can fit in one boat
* If yes, move both pointers
* Otherwise, send the heaviest person alone
* Count each boat used

---

### ⏱ Complexity

* **Time:** O(n log n)
* **Space:** O(1)

---

### 🧩 Pattern

Two Pointers + Greedy (Sorted Array)
