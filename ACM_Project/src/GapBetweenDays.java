import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class GapBetweenDays {

	public static void main(String[] args) throws ParseException {
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			String[] inputString = input.nextLine().split(" ");
			String year = inputString[0];
			String month = inputString[1];
			String day = inputString[2];
			String inputDate = year+ "-" + month + "-" + day;
			String baseDate = year + "-" + "01" + "-01";		
	        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
	        Date d1= sdf.parse(inputDate);  
	        Date d2= sdf.parse(baseDate);
	        Calendar cal = Calendar.getInstance();    
	        cal.setTime(d1);    
	        long time1 = cal.getTimeInMillis();                 
	        cal.setTime(d2);    
	        long time2 = cal.getTimeInMillis();         
	        long between_days=(time1-time2)/(1000*3600*24); 
	        System.out.println(String.valueOf(between_days+1));

		}
	}
 
}
