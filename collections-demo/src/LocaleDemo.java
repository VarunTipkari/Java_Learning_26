import java.util.Locale;
import java.util.ResourceBundle;		//is an implementation of map

public class LocaleDemo {
	
	public static void main(String[] args) {
		
		ResourceBundle bundle = ResourceBundle.getBundle("msgs",Locale.of("tl"));
		
		//ResourceBundle bundle = ResourceBundle.getBundle("msgs",Locale.FRANCE);
		
		//ResourceBundle bundle = ResourceBundle.getBundle("msgs");
		
		System.out.println(bundle.getString("greeting"));
		System.out.println(bundle.getString("message"));
		
	}
	
}
