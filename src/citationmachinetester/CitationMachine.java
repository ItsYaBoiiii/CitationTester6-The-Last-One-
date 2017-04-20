package citationmachinetester;

import java.util.ArrayList;
import java.util.HashMap;

public class CitationMachine {
    String title, authorFirst, authorLast;
    String publishDay, publishMonth, publishYear;
    String accessDay, accessMonth, accessYear;
    String citation, citationType;
    
    public CitationMachine ( HashMap c ) {
        this.citationType = (String)c.get("citationType");
        this.title = (String)c.get("title");
        this.authorFirst = (String)c.get("authorFirst"); 
        this.authorLast = (String)c.get("authorLast"); ;
        this.accessDay = (String)c.get("accDay"); 
        this.accessMonth = (String)c.get("accMonth"); 
        this.accessYear = (String)c.get("accYear"); 
        this.publishDay = (String)c.get("pubDay"); 
        this.publishMonth = (String)c.get("pubMonth"); 
        this.publishYear = (String)c.get("pubYear"); 
    }
 
    public void createCitation() {
    }
    
    
    public void createBibliography() {
        
    }
    
}
