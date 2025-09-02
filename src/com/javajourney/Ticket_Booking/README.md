# OOP Project: Ticket Booking System

This project is a command-line application designed to practice and demonstrate core Object-Oriented Programming (OOP) principles in Java. It models a simple booking system capable of handling different types of tickets, such as for flights and movies.

---
## ## Key Concepts Demonstrated

This project was built to showcase a solid understanding of the five fundamental concepts of OOP:

* **Encapsulation:** All class fields are `private`, with access controlled through public `getter` and `setter` methods. This protects the integrity of the object's data.
* **Inheritance:** A base `abstract class Ticket` is used as a blueprint, with specific ticket types like `FlightTicket` and `MovieTicket` extending it.
* **Abstraction:** The `Ticket` class is `abstract`, defining a contract with `abstract` methods (`getTicketDetails`, `getJourneyDetails`) that all subclasses must implement.
* **Polymorphism:** The `Main` class uses a `List<Ticket>` to hold different subclass objects. When methods like `getTicketDetails()` are called in a loop, Java's polymorphism ensures the correct, overridden version of the method is executed for each object.
* **Interfaces:** A `Cancellable` interface is used to add shared functionality (like `cancel()` and `getCancellationFee()`) to different classes, enforcing a common contract.

---
## ## Future Improvements & Learning Log

This section documents areas for future improvement and refactoring. It serves as a personal log to track what can be done to elevate the project to the next level.

* **[1] Use `super()` in Constructors:** Refactor the constructors in `FlightTicket` and `MovieTicket` to call the parent `Ticket` class's constructor using `super()` to initialize common fields (`ticketId`, `passengerName`). This is a more robust and standard way of initializing inherited objects.
* **[2] Implement Concrete Logic in Overridden Methods:** The `cancel()` and `getCancellationFee()` methods in the `Cancellable` interface currently have placeholder logic. Implement concrete logic (e.g., calculate a 20% cancellation fee for flights).
* **[3] Enhance Console Output:** Improve the user output in the `Main` class by adding `System.out.println()` to display the details returned by the getter methods. Add separators to make the output for each ticket more readable.
* **[4] Adopt a Naming Convention:** Review all variable names to ensure they follow the standard Java camelCase convention (e.g., `Name` should be `name` or `passengerName`).