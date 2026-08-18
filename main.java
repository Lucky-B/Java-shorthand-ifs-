public class Main 
{
  public static void main(String[] args) 
  {
    int time = 17;
    String greeting;
    String mealoffer;
    greeting = 	time < 12 ? morningGreeting(): 
    			time < 16 ? afternoonGreeting(): eveningGreeting();
    mealoffer = greeting ==  "Good morning" ? offerbreakfast(): 
    			greeting ==  "Good afternoon" ?  offerLunch(): offerDinner();
    System.out.println(greeting);
    System.out.println(mealoffer);
  }
  
  static String morningGreeting()
  {
  	String text = "Good morning";
    return text;
  }
  
  static String afternoonGreeting()
  {
  	String text ="Good afternoon";
    return text;
  }
  
  static String eveningGreeting()
  {
  	String text ="Good evening";
    return text;
  }
  
  static String offerbreakfast()
  {
  	String text = "Would you like break fast ?";
    return text;
  }
  
  static String offerLunch()
  {
  	String text = "Would you like Lunch ?";
    return text;
  }
   static String offerDinner()
  {
  	String text = "Would you like Dinner ?";
    return text;
  }
  
}
