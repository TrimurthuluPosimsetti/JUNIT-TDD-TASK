package Test;

public class Junit {
	
	public String removeFisrt2(String s){
		int length=s.length();
		if(length<1)
			return s;
		if(length==1){
			if (s.charAt(0)=='A'){
				return "";
			}
			else{
				return s;
			}
		}
		if(s.charAt(0)=='A' && s.charAt(1)=='A'){
			return s.substring(2,length);
		}
		if(s.charAt(0)=='A'){
			return s.substring(1,length);
		}
		if(s.charAt(1)=='A'){
			return s.charAt(0)+s.substring(2,length);
		}
		return s;
	}
	
}
