
public class Library
{
	private Book books[] ;
	
	public Library( Book[] books )
	{
		this.books = books;
	}
	
	public void Display()
	{
		for(int i = 0 ; i<this.books.length;i++) System.out.println("\""+books[i].Get_title()+"\" by "+books[i].Get_author()) ;
	}
	
	
	
	private boolean Books_Are_Equal( Book book1, Book book2 )
	{
		if(  book1.Get_title() != book2.Get_title()  ) return false ;
		if( book1.Get_author() != book2.Get_author() ) return false ;
		
		return true ;			
	}
	
	private  int Compare_Books_author_first( Book book1, Book book2 )
	{
		String fullName1 = book1.Get_author() + ", " + book1.Get_title() ;
		String fullName2 = book1.Get_author() + ", " + book2.Get_title() ;
		
		int i = fullName1.compareTo(fullName2) ;
		//System.out.println(i);
		return i ;
	}
	
	private  int Compare_Books_title_first( Book book1, Book book2 )
	{
		String fullName1 = book1.Get_title() + ", " + book1.Get_author() ;
		String fullName2 = book1.Get_title() + ", " + book2.Get_author() ;
		
		int i = fullName1.compareTo(fullName2) ;
		//System.out.println(i);
		return i ;
	}
	
	public void Sort_author_first()
	{
		for( int i = 0 ; i<books.length-1;i++)
		{
			for( int j = i+1 ; j<books.length ; j++ )
			{
				if( Compare_Books_author_first(books[i],books[j]) > 0 ) Swap_Books(books[i],books[j]) ;
			}
		}
	}
	
	private void Swap_Books( Book book1, Book book2)
	{
		Book temp = book1 ;
		book1 = book2 ;
		book2 = temp ;
		
		System.out.println("Swapped: \"" +book1.Get_title() + "\" and \"" + book2.Get_title() + "\".") ;
	}
}
