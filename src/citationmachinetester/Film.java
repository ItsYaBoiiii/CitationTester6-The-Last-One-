package citationmachinetester;

//Imports
import java.util.HashMap;

public class Film extends CitationMachine{
    
    //Film Subclass Specific Variables
    String mainPerformers, studio, yearRelease;
    
    //Film Constructor
    public Film ( HashMap c ){
        super( c );//Main Constructor
        
        //Citation Formatting
        title = (String)c.get("title");
        if ( title == null || title.equals("Title") )
            title = "";
        else
            title += ". ";
        
        authorLast = (String)c.get("authorLast");
        if ( authorLast == null || authorLast.equals("LastName") )
            authorLast = "";
        else
            authorLast += ". ";
        
        authorFirst = (String)c.get("authorFirst"); 
        if ( authorFirst == null || authorFirst.equals("FirstName") )
            authorFirst = "";
        else if ( authorLast.equals("") )
            authorFirst += ". ";
        else
            authorFirst += " ";
            
        mainPerformers = (String)c.get("mainPerformers");
        if ( mainPerformers == null || mainPerformers.equals("MainPerformers") )
            mainPerformers = "";
        else 
            mainPerformers += ". ";
        
        yearRelease = (String)c.get("yearRelease");
        if ( yearRelease == null || yearRelease.equals("YearReleased") )
            yearRelease = "";
        else 
            yearRelease += ". ";
        
        studio = (String)c.get("studio");
        if ( studio == null || studio.equals("Studio") )
            studio = "";
        else if ( yearRelease.equals("") )
            studio += ". ";
        else 
            studio += ", ";
    }//End of Film Constructor

    
    //cite Method
    public String cite(){ 
        citation = title + "Dir. " + authorFirst + authorLast + "Perf. " + mainPerformers 
                + studio + yearRelease;
                return citation;
    }//End of cite Method
    

    //Need to Code All Stuff Below
    public String getSimilarFilm(){
        return null;
    }
    
}//End of Film Class
