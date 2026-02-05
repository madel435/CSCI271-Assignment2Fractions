public class Fraction
{
   private long numerator; 
   private long denominator;
    
   public Fraction(long numerator,long denominator)
    {

        if (denominator == 0)
       {
           this.numerator = Long.signum(numerator);
           this.denominator = 0;  
       }
                
        else if ( numerator == 0 )
        {
           this.numerator = Long.signum(numerator);
           this.denominator = 1 ;  
        }
            
        else if (numerator == denomiator)
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
             if (this.denominator == 0 && this.numerator > 0)
             {
                return "+ Infinity";
             }
             else if (this.denominator && this.numerator < 0)
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



   
    public Fraction(int n)
    {
      numerator = num;
      denominator = 1; 
    }
  public long Getnum()
    {
      
    }
  public long Getdenom()
    {
        return 1;
    }
  public Fraction add(Fraction a , Fraction b )
    {
      return a * b;
    }
  
  public Fraction multiply(Fraction a , Fraction b )
    {
      return numerator * numeator;
    }
  public Fraction divide(Fraction a , Fraction b )
    {
      return a / b ;
    }
  public Fraction negate(Fraction a , Fraction b )
    {
      return |a/b| ;
    }
   public Fraction Reciprocol()
   {
      return new Fraction (denominator, numerator); 
   }
   
      public Fraction pow(Fraction a , Fraction b ){
      for (int i = 1; i <= b ;i++ )
      {
          a*=a;
      }
    }
 
    public Fraction divide(Fraction f )
    { 
      return new Fraction ((this.numerator \ this.denominator ) * f.Reciprocol());
    }

