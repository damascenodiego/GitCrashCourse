package id_7fe6515401ffafcde31d3afe0bfefd08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//import java.util.List;
//import java.util.ArrayList;

import br.usp.icmc.ssc01032015.Competitor;

public class Tournament
{
	int matches;
	List<Competitor> competitors = new ArrayList<Competitor>();
	
	public Tournament( String args[] )
	{
		//n??mero de rodadas ?? o primeiro argumento
		matches = Integer.parseInt(args[0]);
		
		//define os tipos de competidores
		for( int i = 1; i <= 5; i++)
		{
			int competitorType = Integer.parseInt(args[i]);
			
			while( competitorType > 0 )
			{
				switch( i )
				{
					case 1:
						competitors.add( new CompetitorDonateAll( i ) );
						break;
					case 2:
						competitors.add( new CompetitorDonateFormula( i ) );
						break;
					case 3:
						competitors.add( new CompetitorDonate23( i ) );
						break;
					case 4:
						competitors.add( new CompetitorDonateNothing( i ) );
						break;
					case 5:
						competitors.add( new CompetitorDonateLastRecieved( i ) );
				}
				
				competitorType--;
			}
		}
	}
	
	public void match( )
	{
		//roda todas as rodadas
		while( matches > 0 )
		{	
			//nas rodadas cada jogador joga uma unica vez com todos os outros
			for( int i = 0; i < competitors.size() - 1; i++ )
			{
				for( int j = i + 1; j < competitors.size(); j++ )
				{
					encounter( competitors.get(i), competitors.get(j) );		
				}
			}

			matches--;
		}
	}
	
	void encounter( Competitor p1, Competitor p2 )
	{
		//realiza os encontros
		double p1Donation;
		double p2Donation;
		
		p1Donation = p1.declareDonationTo( p2 );
		p2Donation = p2.declareDonationTo( p1 );
		
		p1.informDonationFrom( p2, p2Donation );
		p2.informDonationFrom( p1, p1Donation );
		
		double p1newAmount = 10.00 - p1Donation + 2 * p2Donation;
    	double p2newAmount = 10.00 - p2Donation + 2 * p1Donation;
    	
    	p1.addCash( p1newAmount );
    	p2.addCash( p2newAmount );
	}
	

	public void rank()
	{
		//monta o ranking
//		Collections.sort(competitors);		
	}
	
	public void printRanking( )
	{
		//imprime os resultados
		for( int i = 0; i < competitors.size(); i++ )
		{
			System.out.println( (i+1) + "??" );
//			System.out.println( "strategy: " + competitors.get(i).getStrategy() );
			System.out.println(	"cash: " + competitors.get(i).getTotalCash() );
			System.out.println( );
		}
	} 
}
