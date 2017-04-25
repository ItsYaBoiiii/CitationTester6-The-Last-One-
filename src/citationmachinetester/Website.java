package citationmachinetester;

//Imports
import java.util.ArrayList;
import java.util.HashMap;

public class Website extends CitationMachine{
    
    //Website Subclass Specific Variables
    String websiteTitle, url, displayURL, publisher;
    
    //Website Constructor 
    public Website( HashMap c ) {
        super( c );//Main Constructor
        
        //Citation Formatting
        websiteTitle = (String)c.get("websiteTitle");
        if ( websiteTitle == null || websiteTitle.equals("Title") )
            websiteTitle = "";
        else
            websiteTitle += ". ";
        
        url = (String)c.get("url");
        displayURL = (String)c.get("displayURL");
        if ( url == null || url.equals("URL") || displayURL.equals("no") )
            url = "";
        else
            url = "<" + url + ">.";
        
        publisher = (String)c.get("publisher");
        if ( publisher == null || publisher.equals("Publisher") )
            publisher = ""; 
        else
            publisher += ", ";
    }//End of Website Constructor
   

    //cite Method
    public String cite() {
            citation = authorLast + authorFirst + title + websiteTitle 
                    + publisher + publishDay + publishMonth + publishYear 
                    + "Web. " + accessDay + accessMonth + accessYear + url;       
            return citation;
    }//End of cite Method
    
    
    //Need to Code All Stuff Below
    public String getURL( ArrayList<HashMap> x, String t ) {
        for (int i=0; i<x.size(); i++){
            if ( x.get(i).get(title).equals(t) )
                return (String)x.get(i).get(url);
        }
        return "Does not exist.";
    }
    
    
    public String getSimilarWebsite() {
        return null;
    }
    
}//End of Website Class
