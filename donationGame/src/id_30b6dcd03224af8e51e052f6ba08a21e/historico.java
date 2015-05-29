package id_30b6dcd03224af8e51e052f6ba08a21e;

import br.usp.icmc.ssc01032015.Competitor;

public class historico {
	private Competitor from;
	private double receive;
	
	public historico (){
	}
	
	public Competitor getFrom (){
		return this.from;
	}

	public void setFrom(Competitor x){
		this.from = x;
	}
	
	public double getReceive (){
		return this.receive;
	}
	
	public void setReceive(double x){
		this.receive = x;
	}
}
