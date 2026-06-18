# 🚀 OOP Journey: Academic Module Processor

## 🛠️ Key Java Concepts Demonstrated

* **Encapsulation & Data Modeling:** Implemented a structured `Record` class utilizing private state fields, custom overloaded constructors, and public getter/setter accessors.
* **Java Streams API:** Leveraged functional `.stream()`, pipeline `.filter()` conditions, and data `.collect()` reductions to process collection pipelines efficiently instead of relying on resource-heavy sequential `for` loops.
* **Custom Exception Handling:** Built a standalone unchecked `ModuleNotFoundException` to intercept runtime inquiries when records are missing from memory arrays.
* **Defensive Design with Optional Runtimes:** Integrated short-circuit terminal operations (`.findFirst().orElseThrow()`) to handle safe data operations smoothly without risking engine desynchronizations.

---

## 📁 Package Structural Architecture

The code base isolates responsibilities across clean boundaries, matching standard production designs:

```text
src/
├── entity/
│   └── Record.java               # Core Data Carrier Class
├── service/
│   └── ModuleService.java        # Operational Core Business Logic
├── exception/
│   └── ModuleNotFoundException.java # Specialized Runtime Error Interceptor
└── Main.java                     # System Execution Entry point