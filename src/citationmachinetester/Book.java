package citationmachinetester;

//Imports
import java.util.HashMap;

public class Book extends CitationMachine{

    //Book Subclass Specific Variables
    String cityOfPublication;
    
    //Book Constructor
    public Book( HashMap c ){
        super(c);//Main Constructor
        
        //Citation Formatting
        title = (String)c.get("title");
        if ( title.equals("") || title.equals("Title") )
            title = "";
        else
            title += ". ";
        
        cityOfPublication = (String)c.get("cityOfPublication");
        if ( cityOfPublication.equals("") || cityOfPublication.equals("CityOfPublication") )
            cityOfPublication = "N.p.: ";
        else
            cityOfPublication += ": ";
    }//End of Book Constructor
    
    
    //cite Method
    public String cite(){
        citation = authorLast + authorFirst + title + cityOfPublication 
                + publisher + publishYear + "Print.";
        return citation;
    }//End of cite Method
    
}//End of Book Class
