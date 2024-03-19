package week3.day2;

public class JavaConnection extends MySQLConnection{

	public void disconnect() {
		
		System.out.println("Disconnect");
	}

	public void executeUpdate() {
		System.out.println("Execute update");
		
	}

	@Override
	public void executeQuery() {
		
		System.out.println("Execute query");
		
	}
	
	public static void main(String[] args) {
		
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeQuery();
		jc.executeUpdate();
	}

}
