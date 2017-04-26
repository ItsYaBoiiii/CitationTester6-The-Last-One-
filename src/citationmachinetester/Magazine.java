package citationmachinetester;

//Imports
import java.util.HashMap;

public class Magazine extends CitationMachine{
    
    //Magazine Class Specific Variables
    String magazineTitle, pageStart, pageEnd;
    
    //Magazine Constructor
    public Magazine(HashMap c){
        super( c );//Main Constructor
        
        //Citation Formatting
        magazineTitle = (String)c.get("magazineTitle");
        if ( magazineTitle.equals("") || magazineTitle.equals("MagazineTitle") )
            magazineTitle = "";
        else 
            magazineTitle += " ";
        
        pageStart = (String)c.get("pageStart");
        pageEnd = (String)c.get("pageEnd");
        
        if ( pageStart.equals("") || pageStart.equals("PageStart") &&
                pageEnd.equals("") || pageEnd.equals("PageEnd") ) {
            pageStart = "";
            pageEnd = "";
        } else if ( pageEnd.equals("") || pageEnd.equals("PageEnd") ) {
            pageEnd = ".";
        } else if ( pageStart.equals("") || pageStart.equals("PageStart") ) {
            pageStart = "1-";
            pageEnd += ". ";
        } else {
            pageStart += "-";
            pageEnd += ". ";
        }
    }//End of Magazine Constructor
    
    
    //cite Method
    public String cite(){
        citation = authorLast + authorFirst + title + magazineTitle + publishDay 
                + publishMonth + publishYear + pageStart + pageEnd + " Print.";
        return citation;
    }//End of cite Method

}//End of Magazine Class
