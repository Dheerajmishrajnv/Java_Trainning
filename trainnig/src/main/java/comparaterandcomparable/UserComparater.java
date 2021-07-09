package comparaterandcomparable;

import java.util.Comparator;

public class UserComparater implements Comparator<UserData> {
	public int compare(UserData a, UserData b) {
		return a.getAddress().compareTo(b.getAddress());
		
	}
}
