package citationmachinetester;

import java.util.HashMap;

public class Book extends CitationMachine{
    String cityOfPublication, publisher;
    
    public Book( HashMap c ){
        super(c);
        
        title = (String)c.get("title");
        if ( title == null || title.equals("Title") )
            title = "";
        else
            title += ". ";
        
        cityOfPublication = (String)c.get("cityOfPublication");
        if ( cityOfPublication == null || cityOfPublication.equals("CityOfPublication") )
            cityOfPublication = "";
        else
            cityOfPublication += ". ";
        
        publisher = (String)c.get(publisher);
        if ( publisher == null || publisher.equals("Publisher") )
            publisher = "";
        else
            publisher += ". ";
        

        

            
    }
    
    public String cite(){
        citation = authorLast + authorFirst + title + cityOfPublication 
                + publisher + publishYear + "Print.";
        
        return citation;
    }
    
}
