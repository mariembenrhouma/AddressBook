# AddressBook
1. Objectives:

o Create an Address Book to:
▪ Store
▪ Retrieve
▪ Update
addresses from a binary file.
 
2.Activity List:

Activity:
1. Create an AddressBookPane class as shown in the figure below.
Assume that the size of the variables name, street, city, state, and zip is 32, 32, 20, 2, 5 bytes, respectively.
(To set the column size for each text field, use the setPrefColumnCount(value) method, the values are
respectively 23, 23, 8, 2, 4)

- Use the AddressBookPane class to write a program that adds, updates, retrieves addresses as shown in
the figure below. (Use random access file for reading and writing an address).


Steps for solution:
- In order to write an address to file, create a method called “write” that would be
invoked in creating the event of “Add” and “Update” buttons.
- Write a method called “read” that reads an address from file, this method would be
invoked in creating the event of “First”, “Next”, “Previous” and “Last” buttons.
