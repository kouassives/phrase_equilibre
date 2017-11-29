import java.util.Scanner;

public class Principale {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DONNER LA PHRASE");
		Scanner sc = new Scanner(System.in);
		String phrase = sc.nextLine();
		System.out.println();
		reperage(verification(phrase),phrase);
		
		sc.close();
	}*/
	
	
public static int verification(String phrase) {
	Pile pile=new Pile(100);
	char[] caractere = {'(','[','{','ʻ','"',')',']','}','ʼ','"'};
	
for (int i=0;i<phrase.length();i++){
		if( appartient(phrase.charAt(i),'o') )
			pile.empiler(phrase.charAt(i));
		else if (appartient(phrase.charAt(i),'f')  )
				{
					if(pile.estvide())
					{
						System.out.println("phrase non equilibre");
						return i;
					}else
					{
						int k=0;
						char c=pile.depiler();
						for (int j = 0;j<caractere.length/2;j++)
						{
							
							if(caractere[j]==c)
							{
								k=caractere.length/2+j;
								break;
							}
								
						}
						if ( !(phrase.charAt(i)==caractere[k]) )
						{
							
							System.out.println("phrase non equilibre");
							return i;
						}
						
					}
					
				}
		
		}
	if (!pile.estvide()) 
		{
		System.out.println("phrase non equilibre");
		return -2;
		}
	else System.out.println("phrase equilibre");
	return -1;
	}


public static void reperage(int i,String phrase)
{
	if (i>=0)
	{
		System.out.println(phrase);
		for(int j=0;j<i;j++)
		{
			System.out.print(" ");
		}
		System.out.print('^');
		
	}
}
static boolean appartient(char c,char type){
	char[] caractere = {'(','[','{','ʻ','"',')',']','}','ʼ','"'};
	if(type=='o')
		{
			for (int i=0;i<caractere.length/2;i++)
			{
				if (c==caractere[i])
					return true;
			}
			return false;
		}
	else
	{
		for (int i=caractere.length/2;i<caractere.length;i++)
		{
			if (c==caractere[i])
				return true;
		}
		return false;
	}
		
}
	



}
