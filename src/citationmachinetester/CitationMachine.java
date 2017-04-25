package citationmachinetester;

import java.util.HashMap;

public class CitationMachine {
    
    //CitationMachine Global Variables
    String title, authorFirst, authorLast;
    String publishDay, publishMonth, publishYear;
    String accessDay, accessMonth, accessYear;
    String citation;
    
    //CitationMachine Constructor
    public CitationMachine ( HashMap c ) {
        
        //Citation Formatting
        title = (String)c.get("title");
        if ( title.equals("")|| title.equals("Title") )
            title = "";
        else
            title = "'" + title + ".' ";
        
        authorFirst = (String)c.get("authorFirst"); 
        if ( authorFirst.equals("")|| authorFirst.equals("FirstName") )
            authorFirst = "";
        else
            authorFirst += ". ";
        
        authorLast = (String)c.get("authorLast"); ;
        if ( authorLast.equals("")|| authorLast.equals("LastName") )
            authorLast = "";
        else
            authorLast += ", ";
        
        accessDay = (String)c.get("accDay");
        accessMonth = (String)c.get("accMonth");
        accessYear = (String)c.get("accYear");
        
        if ( accessMonth == null|| accessMonth.equals("Month") 
                || accessYear.equals("")|| accessYear.equals("Year") ) {
            accessDay = "";
            accessMonth = "";
            accessYear = "";
        } else if ( accessDay.equals("")|| accessDay.equals("Day")) {
            accessDay = "";
            accessMonth += " ";
            accessYear += ". ";
        } else {
            accessDay += " ";
            accessMonth += " ";
            accessYear += ". ";
        }

        publishDay = (String)c.get("pubDay");
        publishMonth = (String)c.get("pubMonth");         
        publishYear = (String)c.get("pubYear");
        
        if ( publishYear.equals("")|| publishYear.equals("Year") ) {
            publishDay = "";
            publishMonth = "";
            publishYear = "n.d. ";
        } else if ( publishMonth == null|| publishMonth.equals("Month") ) {
            publishDay = "";
            publishMonth = "";
            publishYear += ". ";
        } else if ( publishDay.equals("")|| publishDay.equals("Day") ) {
            publishDay = "";
            publishMonth += " ";
            publishYear += ". ";
        } else {
            publishDay += " ";
            publishMonth += " ";
            publishYear += ". ";            
        }
    }//End of Constructor
    
}//End of CitationMachine Class
