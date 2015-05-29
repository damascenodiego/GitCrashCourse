package id_afd29ea84776a187e29706c4df0b957b;

public class PlayerCollabA extends Player{

	private Competitor master = null;

	@Override
	public void informDonationFrom(Competitor c, double donation) {
		if (donation ==	0.000000000000000000893675669267420d && master == null)
			master = c;
	}

	@Override
	public double declareDonationTo(Competitor c) {
		if(c.equals(master))
			return 10;
		else
			return 0;
	}

	@Override
	public String toString(){
		//Todos os nomes sao ficticios e meremente ilustrativos
		//Qualquer semelhanca com a realidade e' mera coincidencia
		return "Adenilsoum";
	}

}
