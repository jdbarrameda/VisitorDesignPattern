## Visitor Design Pattern 

### Problem Description
You are a software developer working on an e-commerce platform that sells various types of furniture (chairs, tables, sofas, etc.). You want to implement a functionality that calculates the shipping cost based on the furniture type and size.

Each furniture type might have its own unique shipping cost calculation logic. For example, chairs might be lightweight and have a flat shipping rate, while sofas might be bulky and require a distance-based shipping cost calculation. Implementing separate shipping logic within each furniture class would lead to tight coupling and difficulty adding new furniture types in the future.

### Solution
Implement a **Visitor Design Pattern** approach to calculate the shipping cost based on furniture type and size. The design should include:
- **Visitor Interface**: Defines methods for calculating shipping costs for different furniture types.
- **Concrete Visitor**: Implements shipping cost calculation logic for each furniture type.
- **Furniture Interface**: Represents furniture items that accept a visitor.
- **Concrete Furniture Classes**: Different furniture types (Chair, Table, Sofa) implementing the interface.
- **Client Code**: Demonstrates the use of the visitor pattern to calculate shipping costs dynamically.

### Constraints
- Do **not** use abstract classes.
- Ensure that adding new furniture types does **not** require modifying existing furniture classes.
- Maintain separation of concerns by keeping shipping logic outside the furniture classes.

  
![Blank diagram (1)](https://github.com/user-attachments/assets/58398381-1744-4816-83ff-ec4386e43775)
