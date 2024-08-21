# Design Pattern: Factory Method
## Production of Cross-Platform GUI Elements
In this example, Buttons play a producst role and dialogs act as creators.

Different types of dialogs require their own types of elements. That's why we create a subclass for each dialog type and override their factory methods.

Now, each dialog type will instantiate proper button classes. Base dialog works with products using their common interface, that's why its code remains functional after all changes.