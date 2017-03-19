import java.util.Comparator;

public class BookComparator implements Comparator<Book>
{

	@Override
	public int compare(Book o1, Book o2)
	{
		/*String tit1, tit2, aut1, aut2 ;
		
		tit1 = o1.Get_title()  ;
		tit2 = o2.Get_title()  ;
		aut1 = o1.Get_author() ;
		aut2 = o2.Get_author() ;
		
		String full1, full2 ;
		full1 = aut1 + ", " + tit1 ;
		full2 = aut2 + ", " + tit2 ;*/
		
		int i = o1.compareTo(o2) ;
		
		System.out.println(i);
		
		return i ;
		
	}

}
