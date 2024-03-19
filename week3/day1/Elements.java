package week3.day1;

public class Elements extends Button{
	
	public void setElements() {
		
		System.out.println("set elements - executing class");

	}

	public static void main(String[] args) {
		Elements ele = new Elements();
		ele.click();
		ele.setText("Pri");
		ele.submit();
		ele.setElements();
	}

	}
