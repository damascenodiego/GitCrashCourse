package id_c5b7ce60bf5c77af02586d7614010e80;

public abstract class AbstractCompetitor implements Competitor
{

    double totalCash;

    public AbstractCompetitor()
    {
        totalCash = 0.0;
    }

    @Override
    public abstract double declareDonationTo(Competitor c);

    @Override
    public abstract void informDonationFrom(Competitor c, double donation);

    @Override
    public void addCash(double amount)
    {
        totalCash += amount;
    }

    @Override
    public double getTotalCash()
    {
        return totalCash;
    }

    @Override
    public String toString()
    {
        return getClass().getSimpleName() + " R$ " + String.format("%.2f", getTotalCash());
    }
}
