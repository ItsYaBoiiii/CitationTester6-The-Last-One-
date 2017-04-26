package citationmachinetester;

//Imports
import java.util.HashMap;

public class Film extends CitationMachine{
    
    //Film Subclass Specific Variables
    String mainPerformers, studio, yearReleased;
    
    //Film Constructor
    public Film ( HashMap c ){
        super( c );//Main Constructor
        
        //Citation Formatting
        title = (String)c.get("title");
        if ( title.equals("") || title.equals("Title") )
            title = "";
        else
            title += ". ";
        
        authorLast = (String)c.get("authorLast");
        if ( authorLast.equals("") || authorLast.equals("LastName") )
            authorLast = "";
        else
            authorLast += ". ";
        
        authorFirst = (String)c.get("authorFirst");
        if ( ( authorFirst.equals("") || authorFirst.equals("FirstName") ) && !authorLast.equals("") )
            authorFirst = "Dir. ";
        else if ( authorFirst.equals("") || authorFirst.equals("FirstName") )
            authorFirst = "";
        else if ( authorLast.equals("") )
            authorFirst = "Dir. " + authorFirst + ". ";
        else
            authorFirst = "Dir. " + authorFirst + " ";
            
        mainPerformers = (String)c.get("mainPerformers");
        if ( mainPerformers.equals("") || mainPerformers.equals("MainPerformers") )
            mainPerformers = "";
        else 
            mainPerformers = "Perf. " + mainPerformers +  ". ";
        
        yearReleased = (String)c.get("yearReleased");
        if ( yearReleased.equals("") || yearReleased.equals("YearReleased") )
            yearReleased = "";
        else 
            yearReleased += ". ";
        
        studio = (String)c.get("studio");
        if ( studio.equals("") || studio.equals("Studio") )
            studio = "";
        else if ( yearReleased.equals("") )
            studio += ". ";
        else 
            studio += ", ";
    }//End of Film Constructor

    
    //cite Method
    public String cite(){ 
        citation = title + authorFirst + authorLast + mainPerformers + studio + yearReleased;
                return citation;
    }//End of cite Method

}//End of Film Class
