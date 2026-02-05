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
                
        else if ( numerator == 0 )
        {
           this.numerator = Long.signum(this.numerator);
           this.denominator = 1 ;  
        }
            
        else if (this.numerator == this.denomiator)
      { 
           this.numerator = 1;
           this.denominator = 1;  
      }
      
         else
      {
                long reducedFraction;
                long tempVar = Long.signum(numerator) * Long.signum(denominator);
                this.numerator = Math.abs(numerator);
                this.denominator = Math.abs(denominator);
                this.numerator = this.numerator / gcb(this.numerator,this.demominator);
                this.denominator = this.denominator /gcb(this.numerator,this.denominator) ; 
         
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
                return this.numerator;
             }
             else 
             {
                return Long.toString(this.numerator); 
             }
        
          }

}
