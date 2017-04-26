package citationmachinetester;

//Imports
import java.util.HashMap;

public class Website extends CitationMachine{
    
    //Website Subclass Specific Variables
    String websiteTitle, url, displayURL;
    String accessDay, accessMonth, accessYear;
    
    //Website Constructor 
    public Website( HashMap c ) {
        super( c );//Main Constructor
        
        //Citation Formatting
        accessDay = (String)c.get("accDay");
        accessMonth = (String)c.get("accMonth");
        accessYear = (String)c.get("accYear");
        
        if ( accessMonth == null || accessMonth.equals("Month") 
                || accessYear.equals("") || accessYear.equals("Year") ) {
            accessDay = "";
            accessMonth = "";
            accessYear = "";
        } else if ( accessDay.equals("") || accessDay.equals("Day")) {
            accessDay = "";
            accessMonth += " ";
            accessYear += ". ";
        } else {
            accessDay += " ";
            accessMonth += " ";
            accessYear += ". ";
        }
        
        websiteTitle = (String)c.get("websiteTitle");
        if ( websiteTitle.equals("") || websiteTitle.equals("Title") )
            websiteTitle = "";
        else
            websiteTitle += ". ";
        
        url = (String)c.get("url");
        displayURL = (String)c.get("displayURL");
        if ( url.equals("") || url.equals("URL") || displayURL.equals("no") )
            url = "";
        else
            url = "<" + url + ">."; 
    }//End of Website Constructor
   

    //cite Method
    public String cite() {
            citation = authorLast + authorFirst + title + websiteTitle 
                    + publisher + publishDay + publishMonth + publishYear 
                    + "Web. " + accessDay + accessMonth + accessYear + url;       
            return citation;
    }//End of cite Method
    
}//End of Website Class
