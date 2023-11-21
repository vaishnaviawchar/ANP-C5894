package com.junit.demo;

/*The org.junit package contains many 
interfaces and classes for junit testing such as Assert, Test, Before, After etc.

Annotations for Junit testing
The Junit 4.x framework is annotation based, so let's see the annotations that can be used while writing the test cases.

@Test annotation specifies that method is the test method.

@Test(timeout=1000) annotation specifies that method will be failed if it takes longer than 1000 milliseconds (1 second).

@BeforeClass annotation specifies that method will be invoked only once, before starting all the tests.

@Before annotation specifies that method will be invoked before each test.

@After annotation specifies that method will be invoked after each test.

@AfterClass annotation specifies that method will be invoked only once, after finishing all the tests.

Assert class
The org.junit.Assert class provides methods to assert the program logic.

Methods of Assert class
The common methods of Assert class are as follows:

void assertEquals(boolean expected,boolean actual): checks that two primitives/objects are equal. It is overloaded.
void assertTrue(boolean condition): checks that a condition is true.
void assertFalse(boolean condition): checks that a condition is false.
void assertNull(Object obj): checks that object is null.
void assertNotNull(Object obj): checks that object is not null.


*/

public class Calculator{
	

	 public int add(int a, int b) {
	 
	 int result=a+b;
	 return result; //System.out.println(result);
	 }
	 
	public  int findMax(int arr[]){  
        int max=arr[0];//arr[0] instead of 0  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    }  
	

}
