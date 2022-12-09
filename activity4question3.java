package question3;

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new UserException("Vaibhav");
			}
			catch(UserException e){
			System.out.println(e) ;
			}
			}
			}
			class UserException extends Exception{
			String name;
			UserException(String string) {
				name=string;
			}
			public String toString(){
			return ("array = "+name) ;
			}
			

	}


