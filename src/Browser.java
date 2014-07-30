import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author hiteshgarg
 * 
 */
public class Browser {

	public static void main(String[] arg){
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     try{  
		 String line = br.readLine();
	        int N = Integer.parseInt(line);
	        List<String> other = new ArrayList();
	        List<String> thisBrowser = new ArrayList<>();
	        for (int i = 0; i < N; i++) {
	            other.add(br.readLine());
	        }
	        
	        
	     for(String str : other){
	    	str = str.substring(4, str.length()-4);
	    	str = str.replaceAll("[AEIOUaeiou]", "")+".com";
	    	System.out.println(str);
	    	thisBrowser.add(str);
	     }
	        
	     for(int i = 0; i<other.size(); i++){
	    	 System.out.println(thisBrowser.get(i).length()+"/"+ other.get(i).length());
	     }
	     
	}catch (Exception e) {
		// TODO: handle exception
	}
	}
}
