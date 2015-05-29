package id_6884f0fdd5ae152b4e5838f18e1c8124;

//classe para guardar dados relativos as doacoes de um competidor
public class Donations {
	private double totalDonation;
	private int matchups;
	private double averageDonation;
	
	Donations() {
		matchups = 0;
		totalDonation = 0;
		averageDonation = 0;
	}
	
	//calcula a media de doacoes ate o momento
	public void setAverageDonation(double amount){
		totalDonation += amount;
		averageDonation = totalDonation/matchups;
	}
	
	public double getAverageDonation(){
		return averageDonation;
	}
	
	//guarda a quantidade de encontros
	public void incrementMatchup(){
		matchups++;
	}
}