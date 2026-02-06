/*************************************************************************
* Project 1 for CSCI 271-001 Spring 2026
*
* Author: Madeline Adelstone
* OS: Windows 11 
* Compiler: javac 25.0.1
* Date: February 2, 2026
*
* Purpose
* This program takes in fractions simplifies them then does math on them. 
*
*************************************************************************
2. Declaration
Every submission MUST INCLUDE the following header in each source code files or scripts submitted
for assignments or projects. Please adhere to this policy.*/
*******************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet, either
* modified or unmodified.
* - If any source code or documentation used in my program was
* obtained from other sources, like a text book or course notes,
* I have clearly indicated that with a proper citation in the
* comments of my program.
* - I have not designed this program in such a way as to defeat or
* interfere with the normal operation of the supplied grading code.
*
* Madeline Adelstone
*
********************************************************************/

public class Fraction
{
   private long numerator; 
   private long denominator;

/*****************************<getNum>****************************
* Description: This function takes in the numerator value and returns it.
*
* Parameters: a list each parameter the function takes
*
* Pre: list the preconditions; i.e., the things that must be true
* before the function is called. Usually these involve whether
* and how parameters must be initialised before the call, etc.
*
* Post: List the postconditions; i.e., the things that are guaranteed
* to be true when the function finishes, assuming that the
* listed preconditions are satisfied.
*
* Returns:  This returns the numerator 
*
* Called by: Numerator referenced by : 
* Calls: N/A
************************************************************************/
	
   public long getNum()
   {
      return numerator;
   }
/*****************************<getDenom>****************************
* Description: a brief description of what the function does.
*
* Parameters: a list each parameter the function takes
*
* Pre: list the preconditions; i.e., the things that must be true
* before the function is called. Usually these involve whether
* and how parameters must be initialised before the call, etc.
*
* Post: List the postconditions; i.e., the things that are guaranteed
* to be true when the function finishes, assuming that the
* listed preconditions are satisfied.
*
* Returns: Describe what value the function returns, if any.
*
* Called by: list the name(s) of the function(s) that call this one.
* Calls: list the name(s) of the function(s) that this one calls.
************************************************************************/
   public long getDenom()
   {
      return denominator;   
   }

/*****************************<gcd>****************************
* Description: a brief description of what the function does.
*
* Parameters: a list each parameter the function takes
*
* Pre: list the preconditions; i.e., the things that must be true
* before the function is called. Usually these involve whether
* and how parameters must be initialised before the call, etc.
*
* Post: List the postconditions; i.e., the things that are guaranteed
* to be true when the function finishes, assuming that the
* listed preconditions are satisfied.
*
* Returns: Describe what value the function returns, if any.
*
* Called by: list the name(s) of the function(s) that call this one.
* Calls: list the name(s) of the function(s) that this one calls.
************************************************************************/
   public long gcd(long num,long denom)
      {
         long remainder;
         
         if ( num < 0 )
            {
            num = -num; // to avoid sign problems
            }
         
         while (denom != 0)
         {
            remainder = num % denom;
            num = denom;
            denom = remainder;
               
            if (num == 0)
               {
                num = 1;
               }
         }
         
         return num;
      }
/*****************************<Fraction>****************************
* Description: a brief description of what the function does.
*
* Parameters: a list each parameter the function takes
*
* Pre: list the preconditions; i.e., the things that must be true
* before the function is called. Usually these involve whether
* and how parameters must be initialised before the call, etc.
*
* Post: List the postconditions; i.e., the things that are guaranteed
* to be true when the function finishes, assuming that the
* listed preconditions are satisfied.
*
* Returns: Describe what value the function returns, if any.
*
* Called by: list the name(s) of the function(s) that call this one.
* Calls: list the name(s) of the function(s) that this one calls.
************************************************************************/
	//Fraction 
   public Fraction(long numerator,long denominator)
    {
      this.numerator = numerator; 
      this.denominator = denominator;
       
        if (this.denominator == 0)
       {
           this.numerator = Long.signum(this.numerator);
           this.denominator = 0;  
       }
                
        else if ( this.numerator == 0 )
        {
           this.numerator = Long.signum(this.numerator);
           this.denominator = 1 ;  
        }
            
        else if (this.numerator == this.denominator)
      { 
           this.numerator = 1;
           this.denominator = 1;  
      }
      
         else
      {
                long reducedFraction;
                long tempVar = Long.signum(this.numerator) * Long.signum(this.denominator);
                this.numerator = Math.abs(numerator);
                this.denominator = Math.abs(denominator);
                this.numerator = this.numerator / gcd(numerator,denominator);
                this.denominator = this.denominator /gcd(numerator,denominator) ; 
         
                this.numerator *= Long.signum(tempVar) ;    
        }

    }
/*****************************<Function Name>****************************
* Description: a brief description of what the function does.
*
* Parameters: a list each parameter the function takes
*
* Pre: The numerator must be set if not it won't be correct 
*
* Post: The denom is set and the numerator is set. 
*
* Returns: N/A
*
* Called by: list the name(s) of the function(s) that call this one.
* Calls: list the name(s) of the function(s) that this one calls.
************************************************************************/
	//Fraction function 
    public Fraction(int num)
    {
      numerator = num; //Sets num
      denominator = 1; //Sets denom 
    }

/*****************************<toString>****************************
* Description: This string changes the long to a string 
*
* Parameters: a list each parameter the function takes
*
* Pre: list the preconditions; i.e., the things that must be true
* before the function is called. Usually these involve whether
* and how parameters must be initialised before the call, etc.
*
* Post: List the postconditions; i.e., the things that are guaranteed
* to be true when the function finishes, assuming that the
* listed preconditions are satisfied.
*
* Returns: Describe what value the function returns, if any.
*
* Called by: list the name(s) of the function(s) that call this one.
* Calls: list the name(s) of the function(s) that this one calls.
************************************************************************/
   //Long->String Function 
   public String toString()
          {
             String fractionOut = "";
             if ((this.denominator == 0) && (this.numerator > 0))
             {
                return "+ Infinity";
             }
             else if ((this.denominator == 0) && (this.numerator < 0))
             {
                return "- Infinity";
             }
             else if (this.denominator == 0)
             {
                return Long.toString(numerator) ; 
             }
             else 
             {
                return numerator + "/" + denominator; 
             }
          }

/*****************************<add>****************************
* Description: This function adds the Fractions and outputs them 
*
* Parameters: a list each parameter the function takes
*
* Pre: list the preconditions; i.e., the things that must be true
* before the function is called. Usually these involve whether
* and how parameters must be initialised before the call, etc.
*
* Post: List the postconditions; i.e., the things that are guaranteed
* to be true when the function finishes, assuming that the
* listed preconditions are satisfied.
*
* Returns: Describe what value the function returns, if any.
*
* Called by: list the name(s) of the function(s) that call this one.
* Calls: list the name(s) of the function(s) that this one calls.
************************************************************************/
	//Add function 
   public Fraction add(Fraction f)
    {
       long num = this.numerator * f.denominator + this.denominator * f.numerator ;
       long denom = this.denominator * f.numerator;
       return new Fraction(num, denom);
 
    }
	
/*****************************<subtract>****************************
* Description: a brief description of what the function does.
*
* Parameters: a list each parameter the function takes
*
* Pre: list the preconditions; i.e., the things that must be true
* before the function is called. Usually these involve whether
* and how parameters must be initialised before the call, etc.
*
* Post: List the postconditions; i.e., the things that are guaranteed
* to be true when the function finishes, assuming that the
* listed preconditions are satisfied.
*
* Returns: Describe what value the function returns, if any.
*
* Called by: list the name(s) of the function(s) that call this one.
* Calls: list the name(s) of the function(s) that this one calls.
************************************************************************/
   public Fraction subtract(Fraction f)
   {
       long num = this.numerator * f.denominator - this.denominator * f.numerator ;
       long denom = this.denominator * f.numerator;
       return new Fraction(num,denom );
   }
/*****************************<multiply>****************************
* Description: This function multiplies the fraction together 
* Parameters: a list each parameter the function takes
*
* Pre: list the preconditions; i.e., the things that must be true
* before the function is called. Usually these involve whether
* and how parameters must be initialised before the call, etc.
*
* Post: List the postconditions; i.e., the things that are guaranteed
* to be true when the function finishes, assuming that the
* listed preconditions are satisfied.
*
* Returns: Describe what value the function returns, if any.
*
* Called by: list the name(s) of the function(s) that call this one.
* Calls: list the name(s) of the function(s) that this one calls.
************************************************************************/
	//Multiply function 
   public Fraction multiply(Fraction f )
    {
   	 long  num = this.numerator * f.numerator ; 
 	    long denom = this.denominator * f.denominator;
       return new Fraction(num,denom);
    }
/*****************************<divide>****************************
* Description:This function divides the function 
*
* Parameters: a list each parameter the function takes
*
* Pre: list the preconditions; i.e., the things that must be true
* before the function is called. Usually these involve whether
* and how parameters must be initialised before the call, etc.
*
* Post: List the postconditions; i.e., the things that are guaranteed
* to be true when the function finishes, assuming that the
* listed preconditions are satisfied.
*
* Returns: Describe what value the function returns, if any.
*
* Called by: list the name(s) of the function(s) that call this one.
* Calls: list the name(s) of the function(s) that this one calls.
************************************************************************/
   public Fraction divide(Fraction f)
    { 
      long num = this.numerator * f.numerator;
      long denom = this.denominator * f.denominator;
      return new Fraction(num,denom);
    }

  public Fraction Reciprocol()
   {
      return new Fraction (denominator, numerator); 
   }
/*****************************<pow>****************************
* Description: a brief description of what the function does.
*
* Parameters: a list each parameter the function takes
*
* Pre: list the preconditions; i.e., the things that must be true
* before the function is called. Usually these involve whether
* and how parameters must be initialised before the call, etc.
*
* Post: List the postconditions; i.e., the things that are guaranteed
* to be true when the function finishes, assuming that the
* listed preconditions are satisfied.
*
* Returns: Describe what value the function returns, if any.
*
* Called by: list the name(s) of the function(s) that call this one.
* Calls: list the name(s) of the function(s) that this one calls.
************************************************************************/
 public Fraction pow(Fraction a , Fraction b )
    {
       int bottom = a;
	   int top = b;
	   long result = 1;
       
       for (int i = 1; i < bottom; i++)
         {
           result = multiply(bottom);
         }
       return result;
    }
/*****************************<main>****************************
* Description: This is the main 
*
* Parameters: a list each parameter the function takes
*
* Pre: list the preconditions; i.e., the things that must be true
* before the function is called. Usually these involve whether
* and how parameters must be initialised before the call, etc.
*
* Post: List the postconditions; i.e., the things that are guaranteed
* to be true when the function finishes, assuming that the
* listed preconditions are satisfied.
*
* Returns: Describe what value the function returns, if any.
*
* Called by: list the name(s) of the function(s) that call this one.
* Calls: list the name(s) of the function(s) that this one calls.
************************************************************************/
   
   //Main function 
   public static void main(String[] args)
   {
         Fraction F1 = new Fraction(3,4);
         Fraction F2 = new Fraction(5,10);
         Fraction F3 = new Fraction(0,9);
         Fraction F4 = new Fraction(4,0);
         Fraction F5 = new Fraction(6,9);
         Fraction F6 = new Fraction(10,20);
         
         System.out.println(F1.add(F2));
         System.out.println(F1.subtract(F2));
         System.out.println(F1.multiply(F2));
         System.out.println(F1.divide(F2));
         System.out.println(F1.pow(F2));
      
         System.out.println(F2.add(F3));
         System.out.println(F2.subtract(F3));
         System.out.println(F2.multiply(F3));
         System.out.println(F2.divide(F3));
         System.out.println(F2.pow(F3));
      
         System.out.println(F3.add(F4));
         System.out.println(F3.subtract(F4));
         System.out.println(F3.multiply(F4));
         System.out.println(F3.divide(F4));
         System.out.println(F3.pow(F4));
         
         System.out.println(F4.add(F5));
         System.out.println(F4.subtract(F5));
         System.out.println(F4.multiply(F5));
         System.out.println(F4.divide(F5));
         System.out.println(F4.pow(F5));
      
         System.out.println(F5.add(F6));
         System.out.println(F5.subtract(F6));
         System.out.println(F5.multiply(F6));
         System.out.println(F5.divide(F6));
         System.out.println(F5.pow(F6));
   }
}
