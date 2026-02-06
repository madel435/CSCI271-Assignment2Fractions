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


   public Fraction add(Fraction a , Fraction b )
    {
      num = a.numerator + b.numerator;
      return new Fraction(num,denominator);
 
    }
  
   public Fraction subtract(Fraction a, Fraction b )
   {
      num = a.numerator - b.numerator;
      return new Fraction(num,denominator);
   }

   public Fraction multiply(Fraction a , Fraction b )
    {
   	 long  num = a.numerator * b.numerator ;
 	    long denom = a.denominator * b.denominator;
       return new Fraction(num,denom);
    }

   public Fraction divide(Fraction f )
    { 
      return new Fraction ((this.numerator / this.denominator ) * f.Reciprocol());
    }

   public Fraction pow(Fraction a , Fraction b )
    {
      for (int i = 1; i < b; i++)
         {
            a.multiply();
         }
       return a;
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
         
         System.out.println(F1.toString());
         System.out.println(F2.toString());
         System.out.println(F3.toString());
         System.out.println(F4.toString());
         System.out.println(F5.toString());
         System.out.println(F6.toString());
   }
}
