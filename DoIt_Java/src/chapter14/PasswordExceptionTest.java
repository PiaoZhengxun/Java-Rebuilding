package chapter14;

public class PasswordExceptionTest {

	private String userID;

	public void setUserID(String userID) throws PasswordException {
		if(userID == null) {
			throw new PasswordException("xxxxxxxxxxxxxxx");
		}  else if(!userID.matches("[a-zA-Z]+")) {
			throw new PasswordException("¹®ÀÚ¸¸ ¾²¼À");
		} else if(userID.matches("[a-zA-Z]+") && userID.length() >= 5) {
			throw new PasswordException("³Ê¹« ±è");
		}
		this.userID = userID;
	}

	public static void main(String[] args) {
		PasswordExceptionTest t = new PasswordExceptionTest();

		String userID = "a1";

		try {
			t.setUserID(userID);
		} catch (PasswordException e){
			System.out.println(e.getMessage());	
		}
		
		userID="aaaaaa";
		
		try {
			t.setUserID(userID);
		}catch(PasswordException e) {
			System.out.println(e.getMessage());
		}
	}

}
