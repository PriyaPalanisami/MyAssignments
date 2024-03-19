package week3.day1;

public class APIClient {

	public void sendRequest(String endPoint) {
		
		System.out.println(endPoint);

	}
	
	public void sendRequest(String endPoint, String requestBody, boolean requestStatus ) {
		System.out.println(endPoint + "   " + requestBody + "   " + requestStatus);

	}
	
	public static void main(String[] args) {
		APIClient cli = new APIClient();
		cli.sendRequest("USERNAME");
		cli.sendRequest("Passowrd", "EnterPassword", false);
	}
}
