
public class Maventest {
	static int EXIT_STATUS_PARAMETER_TYPE_WRONG = 1;
	static int EXIT_STATUS_PARAMETER_VALUE_WRONG = 2;
	static int num = 0;
	public static void main(String [] args) {
		if(args.length >= 1) {
			try {
				num = Integer.valueOf(args[0]);
			} catch(NumberFormatException e) {
				System.err.println("Please enter integer value only");
				System.exit(EXIT_STATUS_PARAMETER_TYPE_WRONG);
			}
		}
		
	}
	public String EnteredValueCheck(int num){
		if(num == 0 || num == 1){			
			System.out.println("You entered correct number==>" + num);
			return "true";
		} else {
			System.out.println("Entered number can be either 0 or 1. You entered==>" + num);
			return "false";			
		}
	}
}
