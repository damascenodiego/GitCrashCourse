package id_6c7865d7e47c20ed146eed0b9216118d;
import id_6c7865d7e47c20ed146eed0b9216118d.players.CopyCat;
import id_6c7865d7e47c20ed146eed0b9216118d.players.Crazy;
import id_6c7865d7e47c20ed146eed0b9216118d.players.Dummy;
import id_6c7865d7e47c20ed146eed0b9216118d.players.MeanTitTat;
import id_6c7865d7e47c20ed146eed0b9216118d.players.TitTat;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import br.usp.icmc.ssc01032015.Competitor;


public class Simulation {	
    private int round;
    private int typeCounter;
    private State simState;
    private final PrintWriter logFile;
    private HashMap<Competitor, PlayerInfo> players;    
    
    public enum State { NOT_STARTED, RUNNING, FINISHED, ERROR };

    /**
     * Classe usada para guardar informacoes extras sobre cada jogador durante
     * a simulacao.
     */
    private class PlayerInfo {
        public int Id;
        public int Type;

        public PlayerInfo() {
            this.Id = -1;
            this.Type = -1;
        }

        public PlayerInfo(int type, int id) {
            this.Id = id;
            this.Type = type;
        }
    }

    private class PlayerComparator implements Comparator<Competitor> {
        public int compare(Competitor l, Competitor r) {
            return -Double.compare(l.getTotalCash(), r.getTotalCash());
        }
    }

    public Simulation() {
    	this.logFile = null;
    	this.round = 0;
    	this.typeCounter = 0;
    	this.simState = State.NOT_STARTED;
    	this.players = new HashMap<Competitor, PlayerInfo>();
    }
    
    public Simulation(File logFile) throws FileNotFoundException {
    	if(logFile == null) {
    		throw new FileNotFoundException("Null file!");
    	} else {
    		this.logFile = new PrintWriter(logFile);
    		this.logFile.println("SIMULATION CREATED");
    	}
    	
    	this.round = 0;
    	this.typeCounter = 0;
    	this.simState = State.NOT_STARTED;
    	this.players = new HashMap<Competitor, PlayerInfo>();
	}
    
    /**
     * Imprime o placar atual do jogo.
     */
    public void printScore(PrintWriter out) {
        out.format("SCORE OF %d PLAYERS%n", players.size());
        out.println("ID\tCASH\tTYPE");
    	
        // Cria uma lista com os jogadores
    	List<Competitor> score = new ArrayList<Competitor>(players.keySet());

    	// Ordena os jogadores com base no total de cash
    	Collections.sort(score, new PlayerComparator());

    	// Imprime os resultados
    	for(Competitor c : score) {
    		out.format("%d.%d\t%.2f\t(%s)%n", players.get(c).Type,
                    players.get(c).Id, c.getTotalCash(),
                    c.getClass().getSimpleName());
    	}
        out.flush();
    }
    
    /**
     * Termina a smulacao, fechando os arquivos de log e imprimindo o placar.
     */
    public void finish() {
    	if(logFile != null) {
    		logFile.println("SIMULATION FINISHED\n");
    		printScore(logFile);
    		logFile.close();
    	}
    	
    	simState = State.FINISHED;
    	printScore(new PrintWriter(System.out));
	}
    
    /**
     * Adiciona jogadores na simulacao.
     *
     * Deve ser chamada apenas antes de ser dado inicio a simulacao.
     *
     * @param c Classe do competidor a ser adicionado.
     * @param n Quantas instancias devem ser adicionadas.
     */
    public void addPlayers(Class<? extends Competitor> c, int n) {
    	if(simState != State.NOT_STARTED) {
    		System.err.println("ERROR: Cannot add player after " +
                               "simulation started!");
    		return;
    	}
    	
        for(int i = 0; i < n; ++i) {
            try {
                players.put(c.newInstance(), new PlayerInfo(typeCounter, i));
                if(logFile != null) {
                    logFile.format("ADD PLAYER %d.%d %n", typeCounter, i);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        typeCounter++;
    }
    
    /**
     * Inicia a simulacao, permitindo chamadas subsequentes da funcao step(n)
     */
    public void begin() {
		if(simState != State.NOT_STARTED) {
			System.err.println("ERROR: Simulation already started!");
    		return;
		}
		
		assert(round == 0);
        round = 1;
		
		if(players.size() < 2) {
			System.err.println("WARNING: Begining a simulation " +
                               "with less than 2 players!");
		}
		
		if(logFile != null) {
			logFile.println("SIMULATION STARTED");
		}
		
		simState = State.RUNNING;
	}
    
    /**
     * Executa a quantidade dada de rodadas.
     *
     * @param nSteps Numero de rodadas a serem simuladas
     */
    public void step(int nSteps) {
    	if(simState != State.RUNNING) {
    		System.err.println("ERROR: Can't step a simulation that is not" +
                               " runnig!");
    		return;
    	}
    	
    	for(int i = 0; i < nSteps; ++i) step();
    }
    
    /**
     * Executa uma rodada da simulacao.
     */
    private void step() {
    	ArrayList<Competitor> toInteract = 
            new ArrayList<Competitor>(players.keySet()); 
    	
    	if(logFile != null) {
    		logFile.println("\nROUND " + round);
    	}
    	
    	for(Competitor a : players.keySet()) {
    		toInteract.remove(a); // Impede doacoes para si mesmo
    		
    		for(Competitor b : toInteract) {
    			double atob = a.declareDonationTo(b);
    			double btoa = b.declareDonationTo(a);

                // Limitando os valores de doacao [0, 10]
                atob = atob > 10 ? 10 : atob < 0 ? 0 : atob;
                btoa = btoa > 10 ? 10 : btoa < 0 ? 0 : btoa;
    			
                //TODO: Acompanhar o 'total cash' de cada jogador

    			a.informDonationFrom(b, btoa);
    			b.informDonationFrom(a, atob);
    			
    			a.addCash((10 - atob) + btoa * 2);
    			b.addCash((10 - btoa) + atob * 2);
    			
    			if(logFile != null) {
    				logFile.format("DONATION\t%d.%d\t%d.%d\t%f%n",
    						players.get(a).Type, players.get(a).Id,
    						players.get(b).Type, players.get(b).Id, atob);
    				
    				logFile.format("DONATION\t%d.%d\t%d.%d\t%f%n",
    						players.get(b).Type, players.get(b).Id,
    						players.get(a).Type, players.get(a).Id, btoa);
    			}
    		}
    	}
    	
    	++round;
    }
    
    public static void main(String arg[]) {
    	String [] args = {"10","10","10","10","10","10" };
        try {
            Simulation s;

            if(args.length < 6 || args.length > 7) {
                System.err.println("Argumentos invalidos!");
                System.err.println("Argumentos esperados: <rodadas> <Dummy>" +
                        " <CopyCat> <TitTat> <MeanTitTat> <Crazy> [logFile]");
                return;
            } else if(args.length == 7) {
                s = new Simulation(new File(args[6]));
            } else {
                s = new Simulation();
            }

            s.addPlayers(Dummy.class, Integer.decode(args[1]));
            s.addPlayers(CopyCat.class, Integer.decode(args[2]));
            s.addPlayers(TitTat.class, Integer.decode(args[3]));
            s.addPlayers(MeanTitTat.class, Integer.decode(args[4]));
            s.addPlayers(Crazy.class, Integer.decode(args[5]));

            s.begin();
            s.step(Integer.decode(args[0]));
            s.finish();
        } catch(NumberFormatException e) {
            System.err.println("Argumentos invalidos! Numeros malformados!");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
