package id_f48e66ad4d196743b49e55a7fd991109;


public class Playerdata implements Comparable<Playerdata>{
    public double score;
    public int id;
    public int type;
    public Playerdata(){
    }
    @Override
    public int compareTo(Playerdata p)
        {
        return((int)(p.score - score));
        }
}
