/**
 * Fertilizer
 * all i changed was this
 */
public class Fertilizer
{
   //fields
   private double n;
   private double p;
   private double k;
   private String name;
   //Insert formula here to define the npk ratio

   //Constructor
   public Fertilizer(String name, double n, double p, double k)
   {
       this.name = name;
       if(p == 0 && k == 0)
         this.n = n;
         else if (n == 0&& k == 0)
           this.p = p;
             else if (n == 0 && p == 0)
               this.k = k;
               //else some kind of default output
   }


   //Methods

   //getRatio will be defined once we have the algebraic equation to do so
   public double getN()
   {
       return this.n;
   }
   public double getP()
   {
       return this.p;
   }
   public double getK()
   {
       return this.k;
   }
   public String getName()
   {
       return this.name;
   }
}
