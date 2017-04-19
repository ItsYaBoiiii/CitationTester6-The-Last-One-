package citationmachinetester;

/**
 *
 * @author zhuj2423
 */
public class Book extends CitationMachine {
    String publisherTitle;
    String publisherCity;
    String publisherYear;
    
    public Book( String t, String aF, String aL, 
            String pD, String pM, String pY, 
            String aD, String aM, String aY,
            String pbT, String pbC, String pbY){
        super(t, aF, aL, pD, pM, pY, aD, aM, aY);
        this.publisherTitle = pbT;
        this.publisherCity = pbC;
        this.publisherYear = pbY;
        
    }
    
    
    public String getSimilarBooks() {
        return null;
    }
}
