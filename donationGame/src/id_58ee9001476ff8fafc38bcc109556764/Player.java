package id_58ee9001476ff8fafc38bcc109556764;

import br.usp.icmc.ssc01032015.Competitor;

public class Player implements Competitor, Comparable<Player>{

    private double total_cash;
    public double donate;
    private double received;

    // Set how much this player received from donation
    public void setReceived(double received){
        this.received = received;
    }
    // Indicates how much to donate to Competitor c
    public double declareDonationTo(Competitor c){
        return donate;
    }
    // Indicates how much was donated from Competitor c
    public void informDonationFrom(Competitor c, double donation){
        setReceived(donation);
    }
    // Adds the amount of cash
    public void addCash(double amount){
        total_cash += amount;
    }
    // Get the amount of cash this competitor has
    public double getTotalCash(){
        return total_cash;
    }
    // Override the compareTo method to sort the array
    public int compareTo(Player p){
        return new Double(p.total_cash).compareTo(new Double(this.total_cash));
    }
}
