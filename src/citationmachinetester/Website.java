
package citationmachinetester;

public class Website extends CitationMachine{
    String websiteTitle, url;
    boolean displayURL;
    
    public Website( String t, String autF, String autL, 
            int pubD, int pubM, int pubY, 
            int accD, int accM, int accY, 
            String webT, String url, boolean disURL ) {
        super(t, autF, autL, pubD, pubM, pubY, accD, accM, accY);
        this.websiteTitle = webT;
        this.url = url;
        this.displayURL = disURL;
    }
    
    
    public void cite() {
        
    }
    
    
    public void createBibliography() {
        
    }
    
    
    public void getURL( String x ) {
        
    }
    
    
    public String getSimilarWebsite() {
        return null;
    }
    
}
