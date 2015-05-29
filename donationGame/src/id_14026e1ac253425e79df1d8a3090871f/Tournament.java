/*	
	Mateus Abrahao Cardoso 		NUSP: 8658332
	Sabrina Faceroli Tridico	NUSP: 9066452
*/
package id_14026e1ac253425e79df1d8a3090871f;
	
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Tournament
{
	//Fun????????????es auxiliares.
	private static void Meeting(SimpleCompetitor competitor1, SimpleCompetitor competitor2)
	{
		double quantoDoaCompet1 = competitor1.declareDonationTo(competitor2);
		double quantoDoaCompet2 = competitor2.declareDonationTo(competitor1);
		//Recebo quanto doa cada competidor para o outro.

		competitor1.informDonationFrom(competitor2, quantoDoaCompet2);
		competitor2.informDonationFrom(competitor1, quantoDoaCompet1);
		//Informo a cada um dos competidores quanto o outro doou.

		competitor1.addCash(((10.0 - quantoDoaCompet1) + 2 * quantoDoaCompet2));
		competitor2.addCash(((10.0 - quantoDoaCompet2) + 2 * quantoDoaCompet1));
		//Adiciono o dinheiro a cada um deles, descontando o quanto doaram e dobrando o que recebem.
	}

	public static void main(String[] args)
	{
		int rodadas = 0;

		rodadas = Integer.parseInt(args[0]);
		int jogadores1 = Integer.parseInt(args[1]);
		int jogadores2 = Integer.parseInt(args[2]);
		int jogadores3 = Integer.parseInt(args[3]);
		int jogadores4 = Integer.parseInt(args[4]);
		int jogadores5 = Integer.parseInt(args[5]);
		//Recebendo os argumentos passados por comando.

		PlayerType1 _J1[] = new PlayerType1[jogadores1];
		PlayerType2 _J2[] = new PlayerType2[jogadores2];
		PlayerType3 _J3[] = new PlayerType3[jogadores3];
		PlayerType4 _J4[] = new PlayerType4[jogadores4];
		PlayerType5 _J5[] = new PlayerType5[jogadores5];
		//Inicializando arrays de jogadores. Pq Arrays? Pra conseguir inicializar eles usando for (pelo indice).

		List<SimpleCompetitor> lista = new ArrayList<SimpleCompetitor>();

		for(int i = 0; i < jogadores1; i++)
		{
			_J1[i] = new PlayerType1(i);
			lista.add(_J1[i]);
		}

		for(int i = 0; i < jogadores2; i++)
		{
			_J2[i] = new PlayerType2(i);
			lista.add(_J2[i]);		
		}

		for(int i = 0; i < jogadores3; i++)
		{
			_J3[i] = new PlayerType3(i);
			lista.add(_J3[i]);
		}

		for(int i = 0; i < jogadores4; i++)
		{
			_J4[i] = new PlayerType4(i);
			lista.add(_J4[i]);
		}

		for(int i = 0; i < jogadores5; i++)
		{
			_J5[i] = new PlayerType5(i);
			lista.add(_J5[i]);
		}
		//For's instanciando os jogadores. E logo depois adicionando na lista para come??????ar as itera????????????es.

		for(int i = 0; i < rodadas; i++) //Pelo n??????mero de rodadas.
		{
			if(!lista.isEmpty())//Se tiverem jogadores na lista.
			{
				for(int j = 0; j < lista.size(); j++) //Pegue cada um dos jogadores J.
				{
					for(int l = (j+1); l < lista.size(); l++) //Pegue cada um dos jogadores pra frente de J. Sem repetir.
						Meeting(lista.get(j), lista.get(l)); //Encontro entre eles.
				}
			}
		}

		Collections.sort(lista);
		//Como a classe SimpleCompetitor extends Comparable, n??????s pudemos dar um Override em compareTo e fazer um personalizado
		// para a nossa classe, para que ele consiga ordenar pelo cash de cada jogador. Tendo isso implementado em SimpleCompetitor
		// aqui foi simplemente pedir para ordenar(sendo ele um ArrayList).

		for(SimpleCompetitor c : lista) //Para cada competidor, depois de todos se encontrarem
		{
			System.out.println(c); //Cada um printa seu id, seu tipo de Player e seu cash, para sabermos quem ganhou!
		}
	}
}
