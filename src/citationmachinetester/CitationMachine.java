package citationmachinetester;

import java.util.Scanner;

public class CitationMachine {
    String title, authorFirst, authorLast;
    int publishDay, publishMonth, publishYear;
    int accessDay, accessMonth, accessYear;
    
    
    public CitationMachine ( String t, String aF, String aL, 
            int pD, int pM, int pY, 
            int aD, int aM, int aY ) {
        this.title = t; this.authorFirst = aF; this.authorLast = aL;
        this.accessDay = aD; this.accessMonth = aM; this.accessYear = aY;
        this.publishDay = pD; this.publishMonth = pM; this.publishYear = pY;
    }
    
    
    public static void createCitation(){
        Scanner s = new Scanner(System.in);
        String titleTemp = "a";
        authorFirst = "b";
        
                
    }
    
    
    public void cite() {
        
    }
    
    
    public void createBibliography() {
        
    }
    
}
