###Step 1
Create a simple String calculator with a method signature:

    Integer add(string numbers)
The method can take up to two numbers, separated by commas, and will return their sum.

For example “” or “1” or “1,2” as inputs.

For an empty string it will return 0.

###Step 2
Allow the Add method to handle an unknown amount of numbers.

###Step 3
Allow the Add method to handle new lines between numbers (instead of commas):

The following input is ok: “1\n2,3” (will equal 6)

The following input is NOT ok: “1,a” 

###Step 5
Calling Add with a negative number will throw an exception “negatives not allowed” - and the negative that was passed.

If there are multiple negatives, show all of them in the exception message.

###Step 6
Numbers bigger than 1000 should be ignored example "1,2,3,1001,4" should return 10
