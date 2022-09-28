package study;

public class Test {
	
	public static void main(String[] args) {
		
	     String[] name = { "아이유", "조보아", "김초아", "사나" };

	      for (int i = 0; i < name.length; i++) {

	         for (int j = 0; j < name.length; j++) {

	            if (name[i] == "아이유" && name[j] == "아이유") {
	               System.out.println(name[j]);
	            }
	            if (name[i] == "조보아" && name[j] == "조보아") {
	               System.out.println(name[j]);
	            }
	            if (name[i] == "김초아" && name[j] == "사나") {
	               System.out.println(name[j]);
	            }
	            if (name[i] == "사나" && name[j] == "김초아") {
	               System.out.println(name[j]);
	            }
	         }

	      }

		
	}

}
