# Design Pattern: Abstract Factory Method
## Families of cross-platform GUI components and their production
In this example, Buttons and Checkboxes will act as products. They have two variants:
macOS and Windows.

The Abstract Factory defines an interface for creating Buttons and Checkboxes. There are two concrete factories,
which return both products in a single variant.

Client code works with factories and products using abstract interfaces. It majes the asme
client code working with many product variants, depending on the type of factory object.