
public class Book implements Comparable<Book>
{
		private String title ;
		private String author ;
		
		public Book( String title, String author )
		{
			this.title = title ;
			this.author = author ;
			//System.out.println("Created "+this.title) ;
		}
		
		public String Get_title()
		{
			return this.title ;			
		}
		
		public void Set_title( String title )
		{
			this.title = title ;			
		}

		// --
				
		public String Get_author()
		{
			return this.author ;			
		}
		
		public void Set_author( String author )
		{
			this.author = author ;			
		}

		@Override
		public int compareTo(Book arg)
		{
			String tit1, tit2, aut1, aut2 ;
			
			tit1 = this.Get_title()  ;
			tit2 = arg.Get_title()  ;
			aut1 = this.Get_author() ;
			aut2 = arg.Get_author() ;
			
			String full1, full2 ;
			full1 = aut1 + ", " + tit1 ;
			full2 = aut2 + ", " + tit2 ;
			
			int i = full1.compareTo(full2) ;
			return i;
		}
}
