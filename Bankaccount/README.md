# 🏦 Bank Management System — OOP in Java

> My first project documenting Object-Oriented Programming concepts as a 3rd year Software Engineering student at SLIIT.

---

## What I Built

A simple console-based ATM simulation where a user can:
- Create a **Savings** or **Current** account
- **Deposit** money into it
- **Withdraw** money from it

Nothing fancy — the goal was to learn and apply the 4 pillars of OOP correctly, not to build a real bank.

---

## What I Learned (The 4 OOP Pillars)

### 1. Encapsulation
> *"Keep your data private. Control how it's accessed."*

All fields in `Account` are `private`. Nobody can touch `balance` directly — they go through `getBalance()` and `setBalance()`. The setter validates the value before accepting it.

```java
private double balance;

public void setBalance(double balance) {
    if (balance >= 0) {
        this.balance = balance;
    } else {
        System.out.println("Balance cannot be negative");
    }
}
```

---

### 2. Abstraction
> *"Show what an object does, hide how it does it."*

`Account` is an **abstract class** — it defines *what* every account must do (`deposit`, `withdraw`) without defining *how*. Each subclass decides the how.

```java
abstract void deposit(double amount);
abstract void withdraw(double amount);
```

---

### 3. Inheritance
> *"Don't repeat yourself. Share common logic through a parent class."*

`SavingsAccount` and `CurrentAccount` both extend `Account`. They inherit shared validation methods (`isValidWithdraw`, `isValidDeposit`) without rewriting them.

```java
public class SavingsAccount extends Account { ... }
public class CurrentAccount extends Account { ... }
```

---

### 4. Polymorphism
> *"One variable, many forms."*

`myAccount` is declared as type `Account`, but it holds either a `SavingsAccount` or `CurrentAccount` at runtime. When `withdraw()` is called, Java runs the correct version automatically.

```java
Account myAccount;

if (choice == 1) {
    myAccount = new SavingsAccount(...);
} else {
    myAccount = new CurrentAccount(...);
}

myAccount.withdraw(amount); // runs the right version
```

---

## Mistakes I Made & Fixed Along the Way

| Mistake | What I Learned |
|---|---|
| Used `protected` fields instead of `private` | Encapsulation means `private` + getters/setters |
| `setBalance()` rejected `0` with `> 0` | Should be `>= 0` to allow zero balance |
| Copy-pasted validation in every subclass | Shared logic belongs in the parent class |
| Used a `Functions` class with `static boolean` flags | Static state breaks across multiple calls — return a `boolean` instead |
| Created a `GetUserDetails` class just to hold input | Unnecessary class; collect input directly where it's needed |
| Two `Scanner` instances on `System.in` | Only ever create one `Scanner` per program |
| Forgot `return` after invalid input | Without `return`, code keeps running and crashes with `NullPointerException` |

---

## Project Structure

```
BankManagementSystem/
├── src/
│   ├── Account.java          # Abstract base class (Abstraction + Encapsulation)
│   ├── SavingsAccount.java   # Extends Account (Inheritance + Polymorphism)
│   ├── CurrentAccount.java   # Extends Account (Inheritance + Polymorphism)
│   ├── BankManagementApp.java # ATM logic and user input
│   └── Main.java             # Entry point
└── README.md
```

---

## How to Run

1. Clone the repo
2. Open in IntelliJ IDEA (or any Java IDE)
3. Run `Main.java`
4. Follow the console prompts

---

*Part of my OOP learning journey — SLIIT, Year 3, Semester 1.*
