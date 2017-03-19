import java.util.Arrays;

public class Zad3
{

	public static void main(String[] args)
	{
		//Book book = new Book("HPMOR") ;
		
		
		
		Book books[] = new Book[5] ;
		
		
		
		/*for(int i = 0 ; i<books.length ; i++)
		{
			String num = String.valueOf(i);
			
			books[i] = new Book("Title_"+num,"author");			
		}*/
		
		books[0] = new Book ("HPMOR","Eliezer Yudkowsky") ;
		books[1] = new Book ("Mein Kampf","Mister Rogers") ;
		books[2] = new Book ("My life with Marylin Monroe","Marylin Monroe") ;
		books[3] = new Book ("My name is Frank","Bob") ;
		books[4] = new Book ("Hammer of Eden","Ken Follet") ;
		
		Arrays.sort(books);
		
		
		
		
		Library lib = new Library(books) ;
		
		lib.Display();
		
		/*lib.Sort_author_first();
		
		System.out.println();

		Display AFTER sorting
		lib.Display();*/
		
		
	}
	
	
	
}

