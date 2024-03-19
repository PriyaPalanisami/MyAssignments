package week3.day2;

public class ConcreteClass implements DataBaseConnection {

	public void connect() {
		
		System.out.println("Connect");
		
	}

	public void disconnect() {
		
		System.out.println("Disconnect");
	}

	public void executeUpdate() {
		
		System.out.println("Execute update");
	}
	
	public static void main(String[] args) {
		
		ConcreteClass cc = new ConcreteClass();
		cc.connect();
		cc.disconnect();
		cc.executeUpdate();
		
	}
}
