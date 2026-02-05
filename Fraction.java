public class Fraction
{
   private long numerator; 
   private long denominator;

   public long gcd( this.numerator , this.denominator )
      {
         if ( this.numerator < 0 )
            {
            then numerator = -numerator // to avoid sign problems
            }
         
         while (this.denominator != 0)
         {
            remainder = this.numerator % this.denominator;
            this.numerator = this.denominator;
            this.denominator = remainder
               
            if (this.numerator == 0)
               {
               this.numerator = 1
               }
         }
         
         return this.numerator;
      }
      
   public Fraction(long numerator,long denominator)
    {

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
                this.numerator = Math.abs(this.numerator);
                this.denominator = Math.abs(this.denominator);
                this.numerator = this.numerator / gcd(numerator,denominator);
                this.denominator = this.denominator /gcd(numerator,denominator) ; 
         
                this.numerator *= Long.signum(tempVar) ;    
        }

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
   
