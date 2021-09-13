package chapter14;

public class IDFormatTest {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException {
		if(userID == null ) {
			throw new IDFormatException("null XX");
		} else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("XXXX");
		}
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		String userID = null;
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
		
		userID = "123224525";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
