
package id_5F69C25389D743BC2322F8BEB1A3D718;

public class SortCompetitor
{
    private Competitor_Game[] vector;
    
    public SortCompetitor(Competitor_Game[] vector)
    {
        this.vector = vector;
    }
    
    public void sortByAmount()
    {
        quickSort(vector, 0, vector.length - 1);
    }
    
    private void quickSort(Competitor_Game[] arr, int left, int right) 
    {
        int index = partition(arr, left, right);
        if (left < index - 1)
              quickSort(arr, left, index - 1);
        if (index < right)
              quickSort(arr, index, right);
    }
    
    private int partition(Competitor_Game[] arr, int left, int right)
    {
        int i = left, j = right;
        Competitor_Game tmp;
        double pivot = arr[(left + right) / 2].getTotalCash();

        while (i <= j) 
        {
              while (arr[i].getTotalCash() < pivot)
                    i++;
              while (arr[j].getTotalCash() > pivot)
                    j--;
              if (i <= j)
              {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    i++;
                    j--;
              }
        }
        return i;
    }
    
    public void print()
    {
        for (int i = vector.length - 1; i >= 0; i--)
            System.out.printf("player %d (tipo %d) cash: " + DonateGame.double2DecimalPlaces(vector[i].getTotalCash()) 
                              + "\n", vector[i].getID() + 1, vector[i].getType() + 1);
    }
    
}
