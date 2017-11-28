
public class Pile {
	private int nb;
	private char[] pile;
 
	public Pile(int taille) {
		// TODO Auto-generated constructor stub
		nb=0;
		pile=new char[taille];
	}

		public void empiler(char elt){
			pile[nb]=elt;
			nb++;
		}
	 
		public char depiler(){
			if (!estvide())
				return pile[nb--  -1];
			else
				return 'a';
		}
	 
		public boolean estvide(){
			return (nb<=0);
		}
	 
		public int nbelt(){
			return nb;
		}
	 
		public char sommet(){
			if(!estvide())
				return pile[nb-1];
			else
				return 'b';
		}
	 
	
		
	}

