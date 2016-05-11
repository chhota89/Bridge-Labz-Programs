# Bridge-Labz-Programs


Simple Programs
User Input and Replace String Template “Hello <<UserName>>, How are you?” 
I/P -> Take User Name as Input. Ensure UserName has min 3 char
Logic -> Replace <<UserName>> with the proper name
O/P -> Print the String with User Name 
Flip Coin and print percentage of Heads and Tails
I/P -> The number of times to Flip Coin. Ensure it is positive integer.
Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or heads
O/P -> Percentage of Head vs Tails
Leap Year
I/P -> Year, ensure it is a 4 digit number.
Logic -> Determine if it is a Leap Year.
O/P -> Print the year is a Leap Year or not.
Power of 2 
Desc -> This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
Logic -> repeat until i equals N.
O/P -> Print the year is a Leap Year or not.
Harmonic Number 
Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N (http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
I/P -> The Harmonic Value N. Ensure N != 0
Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
O/P -> Print the Nth Harmonic Value.
tFactors
Desc -> Computes the prime factorization of N using brute force.
I/P -> Number to find the prime factors
Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
O/P -> Print the prime factors of number N.
Gambler
Desc -> Simulates a gambler who start with $stake and place fair $1 bets until he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of times he/she wins and the number of bets he/she makes. Run the experiment N times, averages the results, and prints them out.
I/P -> $Stake, $Goal and Number of times
Logic -> Play till the gambler is broke or has won
O/P -> Print Number of Wins and Percentage of Win and Loss.
Coupon Numbers
Desc -> Given N distinct Coupon Numbers, how many random numbers do you need to generate distinct coupon number? This program simulates this random process.
I/P -> N Distinct Coupon Number
Logic -> repeatedly choose a random number and check whether it's a new one.
O/P -> total random number needed to have all distinct numbers.
Functions => Write Class Static Functions to generate random number and to process distinct coupons.
 2D Array
Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from standard input and printing them out to standard output.
I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
Logic -> create 2 dimensional array in memory to read in M rows and N cols 
O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with OutputStreamWriter to print the output to the screen.
Sum of three Integer adds to ZERO
Desc -> A program with cubic running time. Read in N integers and counts the   number of triples that sum to exactly 0.
I/P -> N number of integer, and N integer input array
Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
O/P -> One Output is number of distinct triplets as well as the second output is to print the distinct trniplets.
Stock Report
Desc -> Write a program to read in Stock Names, Number of Share, Share Price. Print a Stock Report with total value of each Stock and the total value of Stock.
I/P -> N number of Stocks, for Each Stock Read In the Share Name, Number of Share, and Share Price
Logic -> Calculate the value of each stock and the total value
O/P -> Print the Stock Report.
Hint -> Create Stock and Stock Portfolio Class holding the list of Stocks read from the input file. Have functions in the Class to calculate the value of each stock and the value of total stocks
Simulate Stopwatch Program
Desc -> Write a Stopwatch Program for measuring the time that elapses between the start and end clicks
I/P -> Start the Stopwatch and End the Stopwatch
Logic -> Measure the elapsed time between start and end
O/P -> Print the elapsed time.
Question to find your number
Desc -> takes a command-line argument N, asks you to think of a number between 0 and N-1, where N = 2^n, and always guesses the answer with n questions.
I/P -> the Number N and then recursively ask true/false if the number is between a high and low value
Logic -> Use Binary Search to find the number
O/P -> Print the intermediary number and the final answer
Binary Search the Word from Word List
Desc -> Read in a list of words as input. Then prompt the user to enter a word to search the list. The program reports if the search word is found in the list.
I/P -> read in the list words comma separated and then enter the word to be searched
Logic -> Use Arrays to sort the word list and then do the binary search
O/P -> Print the result if the word is found or not
Insertion Sort 
Desc -> Reads in strings from standard input and prints them in sorted order.
Uses insertion sort.
I/P -> read in the list words
Logic -> Use Insertion Sort to sort the words in the String array
O/P -> Print the Sorted List
Bubble Sort 
Desc -> Reads in integers prints them in sorted order using Bubble Sort
I/P -> read in the list ints
O/P -> Print the Sorted List 
Utility Class 
Desc -> Create Utility Class having following methods
binarySearch method for integer
binarySearch method for String
insertionSort method for integer
insertionSort method for String
bubbleSort method for integer
bubbleSort method for String
I/P -> Write main function to call the utility function
Logic -> Check using Stopwatch the Elapsed Time for every method call
O/P -> Output the Search and Sorted List. More importantly print elapsed time performance in descending order
JSON Inventory Data Management of Rice, Pulses and Wheats
Desc -> Create a JSON file having Inventory Details for Rice, Pulses and Wheats with properties name, weight, price per kg. 
Use Library : Java JSON Library, For IOS JSON Library use NSJSONSerialization for parsing the JSON.
I/P -> read in JSON File
Logic -> Get JSON Object in Java or NSDictionary in iOS. Create Inventory Object from JSON. Calculate the value for every Inventory. 
O/P -> Create the JSON from Inventory Object and output the JSON String
Regular Expression Demonstration
Desc -> Read in the following message: Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016. Use Regex to replace name, full name, Mobile#, and Date with proper value.
I/P -> read in the Message
Logic -> Use Regex to do the following
Replace <<name>> by first name of the user ( assume you are the user)
replace <<full name>> by user full name.
replace any occurance of mobile number that should be in format 91-xxxxxxxxxx by your contact number.
replace any date in the format XX/XX/XXXX by current date.
O/P -> Print the Modified Message.


Inventory Management Program
Desc -> Extend the above program to Create InventoryManager to manage the Inventory. The Inventory Manager will use InventoryFactory to create Inventory Object from JSON. The InventoryManager will call each Inventory Object in its list to calculate the Inventory Price and then call the Inventory Object to return the JSON String. The main program will be with InventoryManager
I/P -> read in JSON File
Logic -> Get JSON Object in Java or NSDictionary in iOS. Create Inventory Object from JSON. Calculate the value for every Inventory. 
O/P -> Create the JSON from Inventory Object and output the JSON String.






Object Oriented Programs
Clinique Management Programme. This programme is used to manage a list of Doctors associated with the Clinique. This also manages the list of patients who use the clinique. It manages Doctors by Name, Id, Specialization and Availability (AM,  PM or both). It manages Patients by Name, ID, Mobile Number and Age. The Program allows users to search Doctor by name, id, Specialization or Availability. Also the programs allows users to search patient by name, mobile number or id. The programs allows patients to take appointment with the doctor. A doctor at  any availability time can see only 5 patients. If exceeded the user can take appointment for patient at different date or availability time. Print the Doctor Patient Report. Also show which Specialization is popular in the Clinique as well as which Doctor is popular.
