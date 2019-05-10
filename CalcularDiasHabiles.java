...
import java.util.Calendar;

/**
* Get the number of days in total that must elapse according to a number of working days
* 
* @param start
* @param numDays
* @return
*/
private int addSaturdayAndMonday(Date startDay, Integer numDays) {

	int workingDay = 0;
	int nonWorkDay = 0;
	Calendar start = Calendar.getInstance();
	start.setTime(startDay);
	
	while (workingDay<numDays) {
		if (start.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY && start.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
            workingDay++;
        } else {
        	nonWorkDay++;
        }
		start.add(Calendar.DATE, 1);
	}
	
	numDays = workingDay+nonWorkDay;
	
	return numDays;
}
