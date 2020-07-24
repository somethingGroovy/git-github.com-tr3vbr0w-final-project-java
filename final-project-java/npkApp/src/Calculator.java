public class Calculator
{
  private double amt;
  public double calcN(double n1, double n2, double mix)
  {
    amt = n2 * mix / n1;
    return amt;
  }
  public double calcP(double p1, double p2, double mix)
  {
    amt = p2 * mix / p1;
    return amt;
  }
  public double calcK(double k1, double k2, double mix)
  {
    amt = k2 * mix / k1;
    return amt;
  }
}
