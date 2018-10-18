
public class Calculate {
	public int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isOverNumber(int number) {
		if(number >= 0 && number <= 9) {
			return true;
		}
		else {
			return false;
		}
	}
	public String callNumberToMonth() {
			 int number = getNumber();
		        String monthString;
		        switch (number) {
		            case 0:  monthString = "January";
		                     break;
		            case 1:  monthString = "February";
		                     break;
		            case 2:  monthString = "March";
		                     break;
		            case 3:  monthString = "April";
		                     break;
		            case 4:  monthString = "May";
		                     break;
		            case 5:  monthString = "June";
		                     break;
		            case 6:  monthString = "July";
		                     break;
		            case 7:  monthString = "August";
		                     break;
		            case 8:  monthString = "September";
		                     break;
		            case 9: monthString = "October";
		                     break;
		            
		            default: monthString = "Invalid number";
		                     break;
		              
		}
		        return monthString;
	}
	

}
