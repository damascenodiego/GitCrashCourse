package id_f48e66ad4d196743b49e55a7fd991109;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

class CompetitorPrototype{
    protected double total=0;
    protected Set<Competitor> opponents = Collections.synchronizedSet(new LinkedHashSet<Competitor>());
	public void addCash(double ammount){
        total += ammount;
        }
    public double getTotalCash(){
        return total;
        }
}
