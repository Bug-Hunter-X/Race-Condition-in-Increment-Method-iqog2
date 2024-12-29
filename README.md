# Race Condition Bug in Java

This repository demonstrates a race condition bug in a simple Java program. The `MyClass` class has an `incrementX()` method that increments an integer variable `x`. When multiple threads call `incrementX()` concurrently, the final value of `x` may not be what is expected due to race conditions. 

The `BuggyIncrement.java` file shows the problematic code, while `FixedIncrement.java` demonstrates the corrected version using synchronization.