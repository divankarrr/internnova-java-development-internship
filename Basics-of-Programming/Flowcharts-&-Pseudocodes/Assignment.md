# 📝 Assignment 01 – Flowcharts

## 📌 Objective
The objective of this assignment is to strengthen problem-solving skills by designing flowcharts for basic mathematical and logical problems before implementing them in Java.

---

# Question 1: Flowchart to Calculate the Area of a Circle

## Formula

\[
\text{Area} = \pi \times r^2
\]

Where:
- π = 3.14
- r = Radius of the circle

### Algorithm

1. Start
2. Input the radius (r)
3. Calculate Area = 3.14 × r × r
4. Display the area
5. Stop

### Flowchart

```text
        ┌─────────┐
        │  Start  │
        └────┬────┘
             │
             ▼
     ┌────────────────┐
     │ Input Radius r │
     └──────┬─────────┘
            │
            ▼
 ┌────────────────────────┐
 │ Area = 3.14 × r × r    │
 └────────┬───────────────┘
          │
          ▼
 ┌────────────────────────┐
 │ Print Area             │
 └────────┬───────────────┘
          │
          ▼
      ┌─────────┐
      │  Stop   │
      └─────────┘
```

---

# Question 2: Flowchart to Find the Greatest of Two Numbers

### Algorithm

1. Start
2. Input A and B
3. Compare A and B
4. If A > B, print A
5. Else, print B
6. Stop

### Flowchart

```text
        ┌─────────┐
        │  Start  │
        └────┬────┘
             │
             ▼
    ┌────────────────┐
    │ Input A and B  │
    └──────┬─────────┘
           │
           ▼
      ┌────────────┐
      │ A > B ?    │
      └───┬────┬───┘
         Yes    No
          │      │
          ▼      ▼
 ┌────────────┐ ┌────────────┐
 │ Print A    │ │ Print B    │
 └──────┬─────┘ └──────┬─────┘
        │              │
        └──────┬───────┘
               ▼
         ┌─────────┐
         │  Stop   │
         └─────────┘
```

---

# Question 3: Flowchart to Print Even Numbers Between 9 and 100

### Algorithm

1. Start
2. Initialize i = 10
3. Print i
4. Increment i by 2
5. Repeat until i ≤ 100
6. Stop

### Flowchart

```text
        ┌─────────┐
        │  Start  │
        └────┬────┘
             │
             ▼
        ┌──────────┐
        │ i = 10   │
        └────┬─────┘
             │
             ▼
      ┌──────────────┐
      │ i ≤ 100 ?    │
      └───┬────┬─────┘
         Yes   No
          │     │
          ▼     ▼
   ┌──────────────┐
   │ Print i      │
   └──────┬───────┘
          │
          ▼
   ┌──────────────┐
   │ i = i + 2    │
   └──────┬───────┘
          │
          └───────────────┐
                          │
                          ▼
                  (Back to Condition)

               No
               ▼
         ┌─────────┐
         │  Stop   │
         └─────────┘
```

---

# Question 4: Flowchart to Calculate the Average of 25 Exam Scores

## Formula

\[
\text{Average} = \frac{\text{Total Marks}}{25}
\]

### Algorithm

1. Start
2. Initialize Total = 0
3. Initialize Counter = 1
4. Input each exam score
5. Add score to Total
6. Increment Counter
7. Repeat until 25 scores are entered
8. Calculate Average
9. Display Average
10. Stop

### Flowchart

```text
        ┌─────────┐
        │  Start  │
        └────┬────┘
             │
             ▼
 ┌────────────────────┐
 │ Total = 0          │
 │ Counter = 1        │
 └─────────┬──────────┘
           │
           ▼
     ┌──────────────┐
     │ Counter≤25 ? │
     └───┬────┬─────┘
        Yes   No
         │     │
         ▼     ▼
 ┌────────────────────┐
 │ Input Exam Score   │
 └─────────┬──────────┘
           │
           ▼
 ┌────────────────────┐
 │ Total = Total+Mark │
 └─────────┬──────────┘
           │
           ▼
 ┌────────────────────┐
 │ Counter = Counter+1│
 └─────────┬──────────┘
           │
           └──────────────┐
                          │
                          ▼
                  (Back to Condition)

                No
                ▼
 ┌────────────────────┐
 │ Average=Total/25   │
 └─────────┬──────────┘
           │
           ▼
 ┌────────────────────┐
 │ Print Average      │
 └─────────┬──────────┘
           │
           ▼
      ┌─────────┐
      │  Stop   │
      └─────────┘
```

---

# 📚 Concepts Used

- Flowchart Symbols
- Input/Output Operations
- Process Blocks
- Decision Making
- Looping
- Mathematical Formulas

---

# 🎯 Learning Outcomes

- Designed flowcharts for mathematical problems.
- Applied decision-making using comparison operators.
- Understood looping concepts through flowcharts.
- Learned to represent repetitive tasks visually.
- Improved logical thinking before programming.

---

## ✅ Assignment Status

- [x] Area of a Circle
- [x] Greatest of Two Numbers
- [x] Even Numbers Between 9 and 100
- [x] Average of 25 Exam Scores

---

**📅 Internship:** Java Development Internship – Internnova  
**📖 Assignment:** Flowchart Practice – Assignment 01  
**👨‍💻 Author:** Divankar Singh
