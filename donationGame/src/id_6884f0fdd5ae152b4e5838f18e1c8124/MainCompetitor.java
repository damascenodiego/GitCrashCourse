package id_6884f0fdd5ae152b4e5838f18e1c8124;

//classe criada para implementar metodos que s?o iguais para todos os competidores
//todos os competidores estendem essa classe.
public class MainCompetitor implements Comparable<MainCompetitor>, Competitor {
	public double totalCash;
	
	public double declareDonationTo(Competitor c){
		return 0;
	}
    
    public void informDonationFrom(Competitor c, double donation){
    }
	
	public void addCash(double amount){
    	totalCash += amount;
    }
    
    public double getTotalCash(){
    	return totalCash;
    }
    
    //metodo de comparacao de competidores, usado para organizar a classificacao final
	public int compareTo(MainCompetitor c){
		double value = c.getTotalCash();
		
		if(this.getTotalCash() < value){
			return 1;
		}
		else if(this.getTotalCash() == value){
			return 0;
		}
		else
			return -1;
	}
	
	public int getType(){
		return -1;
	}
}