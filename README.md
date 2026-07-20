
# Longest Valid Parentheses (Java)

A highly efficient Java program to find the length of the longest valid (well-formed) parentheses substring. This solution uses a two-pass scanning algorithm to achieve optimal performance.

## Algorithm Efficiency

* **Time Complexity:** O(n) — The program scans the string exactly twice (left-to-right and right-to-left), where $n$ is the length of the string.
* **Space Complexity:** O(1) — It uses constant auxiliary memory by tracking counters instead of maintaining a memory-heavy stack or dynamic programming table.

---

## Getting Started

### Prerequisites
Make sure you have the Java Development Kit (JDK) installed on your machine.
* **Java 8 or higher** is recommended.

### How to Run

1. **Clone or download** this repository.
2. Open your terminal or command prompt and navigate to the folder containing `Main.java`.
3. **Compile the program:**
   ```bash
   javac Main.java
