## 📘 LeetCode 75 - Sort Colors

### 💡 Idea

Use three pointers to divide the array into three sections: `0s`, `1s`, and `2s`, while rearranging elements in-place.

---

### 🧠 Approach

* Maintain three pointers:

  * `l` for position of next `0`
  * `p` for current element
  * `r` for position of next `2`
* If current element is `0`, swap with `l` and move both pointers
* If current element is `1`, move forward
* If current element is `2`, swap with `r` and reduce `r`
* Continue until all elements are arranged

---

### ⏱ Complexity

* **Time:** O(n)
* **Space:** O(1)

---

### 🧩 Pattern

Two Pointers (Dutch National Flag Algorithm)
