import java.math.BigDecimal;
public class Circle
{
      public BigDecimal findCircleArea(double r)
   {  
      BigDecimal radius = new BigDecimal(r);
     
      BigDecimal p = new BigDecimal("3.14159");
      BigDecimal rad = new BigDecimal(r).pow(2);
      BigDecimal area = p.multiply(rad);
      return(area);
   }
}