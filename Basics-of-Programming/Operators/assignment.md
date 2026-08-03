# 📝 Assignment 03 – Java Operators

## 📅 Internship: Java Development Internship – Internnova

---

# Question 1

### What will be the output of the following Java program?

```java
public class Test {
    public static void main(String[] args) {
        int x = 2, y = 5;

        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));

        System.out.print(exp1 + " , ");
        System.out.print(exp2);
    }
}
```

### Answer

**Output**

```text
5 , 4
```

**Explanation**

- `exp1 = (2 × 5) / 2 = 10 / 2 = 5`
- `exp2 = 2 × (5 / 2)`
- Since both operands are integers, `5 / 2 = 2`
- Therefore, `2 × 2 = 4`

---

# Question 2

### What will be the output of the following Java program?

```java
public class Test {
    public static void main(String[] args) {

        int x = 200, y = 50, z = 100;

        if (x > y && y > z) {
            System.out.println("Hello");
        }

        if (z > y && z < x) {
            System.out.println("Java");
        }

        if ((y + 200) < x && (y + 150) < z) {
            System.out.println("Hello Java");
        }

    }
}
```

### Answer

**Output**

```text
Java
```

**Explanation**

- `200 > 50 && 50 > 100` → `false`
- `100 > 50 && 100 < 200` → `true`
- `(250 < 200) && (200 < 100)` → `false`

Only the second condition is true.

---

# Question 3

### What will be the output of the following Java program?

```java
public class Test {
    public static void main(String[] args) {

        int x, y, z;

        x = y = z = 2;

        x += y;
        y -= z;
        z /= (x + y);

        System.out.println(x + " " + y + " " + z);

    }
}
```

### Answer

**Output**

```text
4 0 0
```

**Explanation**

Initial values

```
x = 2
y = 2
z = 2
```

After execution

```
x = 4
y = 0
z = 2 / (4 + 0)
  = 2 / 4
  = 0
```

---

# Question 4

### What will be the output of the following Java program?

```java
public class Test {
    public static void main(String[] args) {

        int x = 9, y = 12;

        int a = 2, b = 4, c = 6;

        int exp = 4 / 3 * (x + 34)
                + 9 * (a + b * c)
                + (3 + y * (2 + a)) / (a + b * y);

        System.out.println(exp);

    }
}
```

### Answer

**Output**

```text
293
```

**Explanation**

```
4 / 3 = 1

1 × (9 + 34)
= 43

b × c
= 4 × 6
= 24

a + 24
= 26

9 × 26
= 234

3 + 12 × (2 + 2)
= 3 + 48
= 51

2 + 4 × 12
= 50

51 / 50
= 1

Total

43 + 234 + 1 = 278
```

**Correct Output**

```text
278
```

---

# Question 5

### What will be the output of the following Java program?

```java
public class Test {
    public static void main(String[] args) {

        int x = 10, y = 5;

        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);

        System.out.println(exp1);
        System.out.println(exp2);

    }
}
```

### Answer

**Output**

```text
20
20
```

**Explanation**

For `exp1`

```
10 / 5 = 2

2 + 2 = 4

5 × 4 = 20
```

For `exp2`

```
5 × 10 / 5 = 10

5 × 10 / 5 = 10

10 + 10 = 20
```

---

# ✅ Assignment Status

- [x] Question 1 Completed
- [x] Question 2 Completed
- [x] Question 3 Completed
- [x] Question 4 Completed
- [x] Question 5 Completed

---

**👨‍💻 Author:** Divankar Singh  
**📅 Day:** 03  
**🏢 Internship:** Java Development Internship – Internnova
