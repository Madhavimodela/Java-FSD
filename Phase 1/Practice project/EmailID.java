package madhu;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailID {
	public static void main(String[] args) {
		ArrayList<String> emails=new ArrayList<String>();
		
		emails.add("madhu@gmail.com");
		emails.add("krish@gmail.com");
		emails.add("ram123@gmail.com");
		emails.add("Ravi564@gmail.com");
		
		emails.add("abc3yahoo.in");
		emails.add("xy$.co.in");
		
		String pattern="[A-Za-z0-9+.]+@(.+)";
		Pattern p=Pattern.compile(pattern);
		
		for(String email:emails) {
		Matcher match=p.matcher(email);
		System.out.println(email+":"+match.matches()+"\n");
		}
	}
}

