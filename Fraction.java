public class Fraction
{
   private long numerator; 
   private long denominator;
   
   public long getNum()
   {
      return numerator;
   }
   public long getDenom()
   {
      return denominator;   
   }
   
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
   
    public Fraction(int num)
    {
      numerator = num;
      denominator = 1; 
    }


       //WRITE TWO STRING
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


   public Fraction add(Fraction f)
    {
       long num = this.numerator * f.denominator + this.denominator * f.numerator ;
       long denom = this.denominator * f.numerator;
       return new Fraction(num, denom);
 
    }
  
   public Fraction subtract(Fraction f)
   {
       long num = this.numerator * f.denominator - this.denominator * f.numerator ;
       long denom = this.denominator * f.numerator;
       return new Fraction(num,denom );
   }

   public Fraction multiply(Fraction f )
    {
   	 long  num = this.numerator * f.numerator ;
 	    long denom = this.denominator * f.denominator;
       return new Fraction(num,denom);
    }

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

         System.out.println(F2.add(F3));
         System.out.println(F2.subtract(F3));
         System.out.println(F2.multiply(F3));
         System.out.println(F2.divide(F3));
      
         System.out.println(F3.add(F4));
         System.out.println(F3.subtract(F4));
         System.out.println(F3.multiply(F4));
         System.out.println(F3.divide(F4));
      
         System.out.println(F4.add(F5));
         System.out.println(F4.subtract(F5));
         System.out.println(F4.multiply(F5));
         System.out.println(F4.divide(F5));
         
         System.out.println(F5.add(F6));
         System.out.println(F5.subtract(F6));
         System.out.println(F5.multiply(F6));
         System.out.println(F5.divide(F6));
   }
}
