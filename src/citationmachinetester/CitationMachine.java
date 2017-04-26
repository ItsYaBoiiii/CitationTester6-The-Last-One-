package citationmachinetester;

//Imports
import java.util.HashMap;

public class CitationMachine {
    
    //CitationMachine Global Variables
    String title, authorFirst, authorLast;
    String publishDay, publishMonth, publishYear, publisher;
    String citation;
    
    //CitationMachine Constructor
    public CitationMachine ( HashMap c ) {
        
        //Citation Formatting
        title = (String)c.get("title");
        if ( title.equals("") || title.equals("Title") )
            title = "";
        else
            title = "'" + title + ".' ";
        
        authorFirst = (String)c.get("authorFirst"); 
        if ( authorFirst.equals("") || authorFirst.equals("FirstName") )
            authorFirst = "";
        else if(authorFirst.equals("") )
            authorLast += ". ";
        else
            authorFirst += ". ";
        
        authorLast = (String)c.get("authorLast");
        if ( authorLast.equals("") ||authorLast.equals("LastName") )
            authorLast = "";
        else
            authorLast += ", ";

        publishDay = (String)c.get("pubDay");
        publishMonth = (String)c.get("pubMonth");         
        publishYear = (String)c.get("pubYear");
        
        if ( publishYear == null || publishYear.equals("") || publishYear.equals("Year") ) {
            publishDay = "";
            publishMonth = "";
            publishYear = "n.d. ";
        } else if ( publishMonth == null || publishMonth.equals("Month") ) {
            publishDay = "";
            publishMonth = "";
            publishYear += ". ";
        } else if ( publishDay == null || publishDay.equals("") || publishDay.equals("Day") ) {
            publishDay = "";
            publishMonth += " ";
            publishYear += ". ";
        } else {
            publishDay += " ";
            publishMonth += " ";
            publishYear += ". ";            
        }
        
        publisher = (String)c.get("publisher");
        if ( publisher == null || publisher.equals("") || publisher.equals("Publisher") )
            publisher = "N.p., "; 
        else
            publisher += ", ";
    }//End of Constructor
    
}//End of CitationMachine Class
