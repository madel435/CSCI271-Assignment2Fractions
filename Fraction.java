public class Fraction
{
   private long numerator; 
   private long denominator;
    
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
                this.numerator = this.numerator / gcd(this.numerator,this.denominator);
                this.denominator = this.denominator /gcd(this.numerator,this.denominator) ; 
         
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
             else if ((this.denominator) && (this.numerator < 0))
             {
                return "- Infinity";
             }
             else if (this.denominator == 0)
             {
                return numerator ; 
             }
             else 
             {
                return numerator + "/" + denominator; 
             }
        
          }

}
