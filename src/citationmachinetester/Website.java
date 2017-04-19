
package citationmachinetester;

import java.util.ArrayList;
import java.util.HashMap;

public class Website extends CitationMachine{
    String websiteTitle, url, displayURL, publisher;
    
    
    public Website( HashMap c ) {
        super( c );
        this.websiteTitle = (String)c.get(websiteTitle);
        this.url = (String)c.get(url);
        this.displayURL = (String)c.get(displayURL);
        this.publisher = (String)c.get(publisher);
    }
   

    public String cite() {
            citation = authorLast + ", " + authorFirst + ". '" + title + ".' " 
                    +  websiteTitle + ". " + publisher + ", " + publishDay 
                    + " " + publishMonth + " " + publishYear + ". Web. " 
                    +  accessDay + " " + accessMonth + " " + accessYear + ". <" + url + ">.";       
            return citation;
    }
    
    
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
    
}
