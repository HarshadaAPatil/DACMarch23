package org.cdac;

public class DateCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateOperation dtOp=new DateOperation();
		int ch;
		dtOp.acceptDate();
		while((ch=dtOp.menuList())!=0) {
			switch(ch) {
			case 1: System.out.println(dtOp.isValid());
				break;
			case 2: dtOp.getDayOfWeek();
				break;
			case 3: System.out.println(dtOp.isLeapYear());
				break;
			case 4: dtOp.getNextDay();
				break;
			case 5: dtOp.getPreviousDay();
				break;
			default:System.out.println("Invalid choice ");
			}
		}

	}

}
