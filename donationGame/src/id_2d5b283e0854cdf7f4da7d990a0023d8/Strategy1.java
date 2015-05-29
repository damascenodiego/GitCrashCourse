package id_2d5b283e0854cdf7f4da7d990a0023d8;

import br.usp.icmc.ssc01032015.Competitor;

//Autores: Danilo Marques A. dos Santos (8598670)
//         Luiz Massao Miyazaki         (8937080)

public class Strategy1 extends Player {
    
    @Override
    public int strategy_type() {
        return 1;
    }

    @Override
    public double declareDonationTo(Competitor c) {
        return 0.0;
    }

    @Override
    public void informDonationFrom(Competitor c, double donation) {
        
    }
    
}