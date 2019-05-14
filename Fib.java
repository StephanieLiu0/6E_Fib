/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
	if (n<=2)    // decision between base case and recursive case
	    return 1;    // solution to base case
	else if (n>2)    // solution to recursive case
	    return fib_recurrence(n-1)+ fib_recurrence(n-2);
	    // recursive abstraction + combining operator + recursive abstraction
        return -2; // invalid Fibonacci number
    }
     /* These are class / instance methods because...
	method is not operating on a Fib object.
    */


    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
	int num, first, second;
	for (num = 1, first = 1, second = 1;
	     num < n;
	     num++, second+=first, first=second) {
	}
	return second;
    }
    /* Time complexity:
       Consider the size of the problem to be ... linear
       
       As the proxy for the time required, count... additions of first and second
       
       Then cost of the grade8 algorithm
       grows linearly
       as the size of the problem increases,
       because we add the previous two terms for each n value
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
	double phi = (1+Math.sqrt(5))/2;
	double psi = (1-Math.sqrt(5))/2;

	return ( (Math.pow(phi,n)) - (Math.pow(psi,n))) / Math.sqrt(5);
    }
    /* Time complexity:
       Consider the size of the problem to be ... constant
       
       As the proxy for the time required, count... calculations
       
       Then cost of the Binet's formula algorithm
       stays the same
       as the size of the problem increases,
       because we plug in once and get an answer
     */
}
