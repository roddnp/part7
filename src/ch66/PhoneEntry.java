package ch66;

public class PhoneEntry 
{
	private String firstName;    // name of a person
	private String lastName;
	  private String phone;   // their phone number

	  public PhoneEntry( String n, String ln, String p )
	  {
	    firstName = n; phone = p; lastName = ln;
	  }
	  
	  public String getFirstName()  {return firstName;}
	  public String getLastName() {return lastName;}
	  public String getPhone() {return phone;}
	}

	class PhoneBook
	{ 
	  private PhoneEntry[] phoneBook; 

	  public PhoneBook()    // constructor
	  {
	    phoneBook = new PhoneEntry[ 5 ] ;

	    phoneBook[0] = new PhoneEntry( "James", "Barclay", "(418) 665-1223" );
	    phoneBook[1] = new PhoneEntry( "Grace" ,"Dunbar", "(860) 399-3044" );
	    phoneBook[2] = new PhoneEntry( "Paul" ," Kratides", "(815) 439-9271" );
	    phoneBook[3] = new PhoneEntry( "Violet" ,"Smith", "(312) 223-1937" );
	    phoneBook[4] = new PhoneEntry( "John" ,"Wood", "(913) 883-2874" );

	  }

	  public PhoneEntry search( String targetFirstName, String targetLastName )  
	  {
	    for ( int j=0; j < phoneBook.length; j++ )
	    {
	      if ( phoneBook[ j] != null && phoneBook[ j ].getFirstName().equals( targetFirstName ) )
	        return phoneBook[ j ];
	     if( phoneBook[ j] != null && phoneBook[ j ].getLastName().equals( targetLastName ) )
	        return phoneBook[ j ];
	    }

	    return null;
	  }
	}

	public class PhoneBookTester
	{
	  public static void main ( String[] args )
	  {
		  
		
	    PhoneBook pb = new PhoneBook();  
	  
	    // search for "Violet Smith"
	    
	    //enter first name
	    System.out.println("enter first name");
	    String firstName = Scan.nextline();
	    //enter last name
	    System.out.println("Enter last name");
	    //if ( string.equals(firstname, quit) || string.equals(lastname,quit)
	   

	    PhoneEntry entry = pb.search( "Violet", "Smith" ); 

	    if ( entry != null )
	      System.out.println( entry.getFirstName() + ": " + entry.getPhone() );
	    else
	      System.out.println("Name not found" );

	  }
}
