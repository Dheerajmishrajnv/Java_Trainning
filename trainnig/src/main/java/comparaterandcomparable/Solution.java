package comparaterandcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		List<UserData> l = new ArrayList<UserData>();
		UserData e1 = new UserData();
		e1.setName("Dheeraj");
		e1.setEmail("Dheeraj@gmail.com");
		e1.setAddress("Varanasi");
		UserData e2 = new UserData();
		e2.setName("bulbul");
		e2.setEmail("bulbul@gmail.com");
		e2.setAddress("Bhadohi");
		UserData 
		e3 = new UserData();
		e3.setName("Pankaj");
		e3.setEmail("Dheeraj@yahoo.com");
		e3.setAddress("Varanasi");UserData 
		e4 = new UserData();
		e4.setName("Ram");
		e4.setEmail("ramj@gmail.com");
		e4.setAddress("Azamgarh");
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
      
		for(UserData a:l) {
			System.out.println("////////////////The values are //////////////////");
			System.out.println(a.getName());
			System.out.println(a.getAddress());
			System.out.println(a.getEmail());
		}
	}

}
