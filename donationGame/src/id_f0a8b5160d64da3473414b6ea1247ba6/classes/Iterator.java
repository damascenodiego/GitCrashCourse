package id_f0a8b5160d64da3473414b6ea1247ba6.classes;

public class Iterator {
	
	public Iterator() {
	}
	
	public void round(Player p1, Player p2) {
		 double donation1 = p1.declareDonationTo(p2);
		 double donation2 = p2.declareDonationTo(p1);
	
		 p1.informDonationFrom(p2, p1.getDonated());
		 p2.informDonationFrom(p1, p2.getDonated());
		 
		 double value1 = (10d - donation1) + (2d * p1.getDonated());
		 double value2 = (10d - donation2) + (2d * p2.getDonated());
		 
		 p1.addCash(value1);
		 p2.addCash(value2);
	}
}
