# 2016 — Computer Science

> *"First year, source code"*
> — Fraizer Nxumalo (silentcodeza)

---

## 📖 About

This repository contains all coursework, practicals, and source code completed during **2016** as part of a **Computer Science** programme. The work demonstrates a broadening of skills — spanning Java, Python, HTML, and CSS — and introduces GUI development through **Java Swing (JFrames)**, number theory algorithms, and structured practical assignments.

---

## 🗂️ Repository Structure

```
2016/
├── Code/                       ← General source code exercises
├── First/                      ← First set of programs / introductory work
├── JFrames/                    ← Java Swing GUI applications
├── Prac 4 Q1-2/                ← Practical 4: Questions 1 and 2
├── Prac 5/                     ← Practical 5 assignment
├── Practical 6/                ← Practical 6 assignment
├── Source Code/                ← Additional source code
├── Term 4 Notes/               ← Term 4 study notes and references
├── SieveOfEratosthenes.txt     ← Prime number sieve algorithm
├── LICENSE                     ← MIT License
└── README.md                   ← This file
```

---

## 💻 Languages Used

| Language | Usage |
|----------|-------|
| **Java** | 79.6% — Primary language; OOP, algorithms, GUI |
| **HTML** | 15.8% — Web development exercises |
| **Python** | 4.3% — Scripting and logic exercises |
| **CSS** | 0.3% — Web styling |

---

## 🔬 Key Highlights

### 🔢 Sieve of Eratosthenes
**File:** `SieveOfEratosthenes.txt`

An implementation of one of the oldest and most elegant algorithms in mathematics — the **Sieve of Eratosthenes** — for finding all prime numbers up to a given limit (1000 in this case).

**How it works:**
1. Fills an array with integers from 2 to 999
2. Iterates through the array, eliminating all multiples of each number
3. Any number not eliminated (not set to 0) is prime
4. Handles division-by-zero safely using `ArithmeticException`

```java
public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        // Fill array with 2..999
        for (int i = 2; i < numbers.length; i++) {
            numbers[i - 2] = i;
        }
        // Sieve: eliminate multiples
        while (divisor < Math.sqrt(numbers.length)) {
            for (int i = rootIndex + 1; i < numbers.length; i++) {
                if (numbers[i] != 0 && numbers[i] % numbers[rootIndex] == 0) {
                    numbers[i] = 0;  // mark as composite
                }
            }
            rootIndex++;
            divisor++;
        }
        // Print all remaining primes
        for (int x : numbers) {
            if (x != 0) System.out.print(x + " ");
        }
    }
}
```

**Output:** `2 3 5 7 11 13 17 19 23 29 31 ...` *(all primes up to 999)*

---

### 🖼️ Java Swing GUI — JFrames
**Folder:** `JFrames/`

Introduction to **Java Swing** — building graphical user interfaces (GUIs) with `JFrame`, `JPanel`, `JButton`, `JLabel`, and other Swing components. This marks the transition from console-only programs to **visual, event-driven applications**.

---

### 📋 Structured Practicals
**Folders:** `Prac 4 Q1-2/`, `Prac 5/`, `Practical 6/`

Formal practical assignments submitted as part of the academic programme, covering progressively more complex problems across multiple questions per practical.

---

### 🌐 Web Development
**Language:** HTML 15.8%, CSS 0.3%

Introduction to web technologies — writing structured HTML pages and applying CSS styling. A first look at front-end development alongside the core Java curriculum.

---

### 🐍 Python Scripting
**Language:** Python 4.3%

Python exercises alongside Java — exploring scripting, logic, and comparing language paradigms.

---

### 📓 Term 4 Notes
**Folder:** `Term 4 Notes/`

Study notes and reference materials from Term 4 — useful for revision and understanding the theoretical foundations behind the code.

---

## 📚 Topics Covered

| Topic | Description |
|-------|-------------|
| **Number Theory** | Sieve of Eratosthenes — prime number generation |
| **Java GUI (Swing)** | JFrames, event-driven programming |
| **OOP in Java** | Classes, methods, encapsulation |
| **Web Development** | HTML structure, CSS styling |
| **Python Scripting** | Logic and scripting exercises |
| **Exception Handling** | `ArithmeticException` in Java |
| **Practical Assignments** | Structured problem-solving across Pracs 4, 5, 6 |
| **Algorithm Design** | Iterative sieving, array manipulation |

---

## 🚀 Getting Started

### Prerequisites
- **Java JDK 8+** for Java files
- **Python 3.x** for Python scripts
- Any browser for HTML/CSS files
- IDE: **IntelliJ IDEA**, **Eclipse**, **NetBeans**, or **VS Code**

### Running the Sieve of Eratosthenes

```bash
# Clone the repository
git clone https://github.com/silentcodeza/2016.git
cd 2016

# Rename and compile
cp SieveOfEratosthenes.txt SieveOfEratosthenes.java
javac SieveOfEratosthenes.java
java SieveOfEratosthenes
```

**Expected output:**
```
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 ...
```

### Running Java GUI (JFrames)

```bash
cd JFrames
javac *.java
java <MainClassName>
```

---

## 👨‍💻 Author

**Fraizer Nxumalo**
- GitHub: [@silentcodeza](https://github.com/silentcodeza)
- Year: 2016 — Computer Science

---

## 🔗 Related Repositories

| Year | Repository | Focus |
|------|-----------|-------|
| **2013** | [silentcodeza/2013](https://github.com/silentcodeza/2013) | Java fundamentals |
| **2014** | [silentcodeza/2014](https://github.com/silentcodeza/2014) | First year CS |
| **2015** | [silentcodeza/2015](https://github.com/silentcodeza/2015) | Data structures & CI |
| **2016** | [silentcodeza/2016](https://github.com/silentcodeza/2016) | GUI, algorithms & web ← *You are here* |

---

## 📝 License

This project is licensed under the **MIT License** — see the [LICENSE](LICENSE) file for details.

---

## 🎓 Note

2016 marks an important milestone in this CS journey — the introduction of **graphical user interfaces**, **web technologies**, and **classical algorithms** like the Sieve of Eratosthenes. The work spans four languages (Java, HTML, Python, CSS), reflecting the growing breadth and confidence of a developing programmer.

> *"Any fool can write code that a computer can understand. Good programmers write code that humans can understand."* — Martin Fowler
