package id_f0a8b5160d64da3473414b6ea1247ba6.classes;

import java.util.Comparator;
import java.util.Map;

public class CustomComparator implements Comparator<Map.Entry<String, Player>> {

	public CustomComparator() {
	
	}
	
	public int compare(Map.Entry<String, Player> m1, Map.Entry<String, Player> m2) {
		Double cp1 = (Double)(m1.getValue().getCash());
		Double cp2 = (Double)(m2.getValue().getCash());
		
		return cp2.compareTo(cp1);
	}
}
