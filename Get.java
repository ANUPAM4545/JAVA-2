import java.time.LocalDate;
public class Get
{
  public static void main(String[] args)
  {
    LocalDate d=LocalDate.of(2024,10,16);
    System.out.println("Current_year:"+d.getYear());
    System.out.println("Current_month name:"+d.getMonth());
    System.out.println("Current_month :"+d.getMonthValue());
    System.out.println("Current_Day :"+d.getDayOfMonth());
    System.out.println("Current_Week name:"+d.getDayOfWeek());
    System.out.println("Current_Year:"+d.getDayOfYear());
    System.out.println("Current_month length:"+d.lengthOfMonth());
    System.out.println("Current_length year:"+d.lengthOfYear());


// MANIPULATION METHOD;

    System.out.println("Current_Day:"+d.plusDays(6));
    System.out.println("Current_Day:"+d.plusMonths(6));
    System.out.println("Current_Day:"+d.plusYears(6));
    System.out.println("Current_Day:"+d.minusDays(6));
    System.out.println("Current_Day:"+d.minusMonths(6));
    System.out.println("Current_Day:"+d.minusYears(6));
  }
}
  

