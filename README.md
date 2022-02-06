# SortManager - yet another Java project
The application features 3 types of sorting: Bubble Sort, Merge Sort and Binary Tree Search, and it will take user input to select one of them.
The application will generate randomly 40 integers to populate the initial array that will need sorting.

**Software & Dependencies**

- IntelliJ IDEA 2021.3.1 (Ultimate Edition)
- Runtime version: 11.0.13+7-b1751.21 amd64
- VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o.
- Linux 5.15.0-kali2-amd64
- Apache Maven
- JUnit Jupiter API version 5.8.2
- Apache log4j 2.17.1

**Tasks**

- [x] Create GitHub repository
- [x] Generate an array of 40 random integers
- [x] Generate a simple user interface
- [x] Implement Bubble Sort
- [x] Implement Merge Sort
- [ ] Implement Binary Search Tree
- [x] Add logging capability
- [x] Timing each sort method
- [x] Add README file


User needs to choose an option from the menu below to start:
```java
            =====================================
            | SELECT THE TYPE OF SORT           |
            =====================================
            | Options:                          |
            |        1. Bubble Sort             |
            |        2. Merge Sort              |
            |        3. Binary Tree Sort        |
            |        4. Compare timings         |
            |        5. Exit                    |
            =====================================
            Select option: 
```
Option 1 will generate a random array of integers, if it's not already generated, sort it using Bubble Sort then insert the timing into its corresponding file.

```java
The sort method took 381892 nanoseconds to run and the result is:
=================================================================================================================================================================================================
[13, 24, 39, 41, 53, 80, 94, 101, 115, 132, 147, 150, 155, 165, 173, 176, 189, 199, 209, 217, 223, 235, 240, 245, 264, 278, 285, 295, 301, 331, 348, 349, 374, 415, 454, 475, 491, 492, 494, 498]
```

Option 2 will generate a random array of integers, if it's not already generated, sort it using Merge Sort then insert the timing into its corresponding file.
```java
The sort method took 549581 nanoseconds to run and the result is:
=================================================================================================================================================================================================
[13, 24, 39, 41, 53, 80, 94, 101, 115, 132, 147, 150, 155, 165, 173, 176, 189, 199, 209, 217, 223, 235, 240, 245, 264, 278, 285, 295, 301, 331, 348, 349, 374, 415, 454, 475, 491, 492, 494, 498]
```
Option 3 will generate a random array of integers, if it's not already generated, sort it using Binary Tree Search then insert the timing into its corresponding file.
```java
The sort method took 867080 nanoseconds to run and the result is:
        =================================================================================================================================================================================================
        [13, 24, 39, 41, 53, 80, 94, 101, 115, 132, 147, 150, 155, 165, 173, 176, 189, 199, 209, 217, 223, 235, 240, 245, 264, 278, 285, 295, 301, 331, 348, 349, 374, 415, 454, 475, 491, 492, 494, 498]
```
Option 4 will read the content of the files where the times are stored and calculate the average runtime for each method.
```java
Average time for Binary Tree Search sort method, based on 9 entries is: 641018 nanoseconds
Average time for Bubble Sort sort method, based on 5 entries is: 364375 nanoseconds
Average time for Merge Sort sort method, based on 7 entries is: 416932 nanoseconds
```
Option 5 it's a mistery.