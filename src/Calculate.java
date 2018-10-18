
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
		        String numString;
		        switch (number) {
		            case 0:  numString = "zero";
		                     break;
		            case 1:  numString = "one";
		                     break;
		            case 2:  numString = "two";
		                     break;
		            case 3:  numString = "three";
		                     break;
		            case 4:  numString = "four";
		                     break;
		            case 5:  numString = "five";
		                     break;
		            case 6:  numString = "six";
		                     break;
		            case 7:  numString = "seven";
		                     break;
		            case 8:  numString = "eight";
		                     break;
		            case 9: numString = "nine";
		                     break;
		            
		            default: numString = "Invalid number";
		                     break;
		              
		}
		        return numString;
	}
	

}
