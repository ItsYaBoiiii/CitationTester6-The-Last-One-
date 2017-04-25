package citationmachinetester;

import java.util.HashMap;

public class Magazine extends CitationMachine{
    String magazineTitle, pageStart, pageEnd;
    
    public Magazine(HashMap c){
        super( c );
        
        magazineTitle = (String)c.get("magazineTitle");
        if ( magazineTitle == null|| magazineTitle.equals("MagazineTitle") )
            magazineTitle = "";
        else 
            magazineTitle += " ";
        
        pageStart = (String)c.get("pageStart");
        pageEnd = (String)c.get("pageEnd");
        
        if ( pageStart.equals("")|| pageStart.equals("PageStart") &&
                pageEnd == null || pageEnd.equals("PageEnd") ) {
            pageStart = "";
            pageEnd = "";
        } else if ( pageEnd.equals("")|| pageEnd.equals("PageEnd") ) {
            pageEnd = ".";
        } else if ( pageStart.equals("")|| pageStart.equals("PageStart") ) {
            pageStart = "1-";
            pageEnd += ". ";
        } else {
            pageStart += "-";
            pageEnd += ". ";
        }
    
    }
    
    public String cite(){
        citation = authorLast + authorFirst + title + magazineTitle + publishDay 
                + publishMonth + publishYear + pageStart + pageEnd + " Print.";
        return citation;
    }
    
    public String getSimilarMagazine(){
        return null;
    }
    
}
