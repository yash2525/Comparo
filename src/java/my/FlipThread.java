/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

/**
 *
 * @author amitr
 */
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;
import org.jsoup.Jsoup;
public class FlipThread {
    
    String s;
    
    
    
    public FlipThread(String str) throws IOException,UnknownHostException{
        
        
        s = Jsoup.connect("http://www.flipkart.com/search?q="+str.replaceAll(" ","+")+"&as=off&as-show=off&otracker=start").timeout(0).get().html();
    }

    public FlipThread() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public List<product> find(List<product> AP){
        try{
        String[] p  = s.split("<div class=\"pu-visual-section\">",2);
        while(true){
        if(p.length == 1) break;
        p = p[1].split("href=\"",2);
        p = p[1].split("\"",2);
        String link = p[0];
        p = p[1].split("src=\"",2);
        p = p[1].split("\"",2);
        String src = p[0];        
        p = p[1].split("title=\"",2);
        p = p[1].split("\"",2);
        String title = p[0];       
        p = p[1].split("title=\"",2);
        p = p[1].split("\"",2);
        String star = p[0];   
        p = p[1].split("</div>",2);
        p = p[1].split("</div>",2);
        p = p[1].split("<span",2);
        String review = p[0];   
        if(p.length == 1) break;
        p = p[1].split("pu-final\">",2);
        p = p[1].split(">",2);
        p = p[1].split("</span>",2);
        String Price = p[0].substring(p[0].indexOf(".")+2).replaceAll(",", "");   
        AP.add( new product("flipkart","http://www.flipkart.com"+link,Price,src,title,star,review));
        
        p  = p[1].split("<div class=\"pu-visual-section\">",2);
        }
        }
        catch(ArrayIndexOutOfBoundsException ab){
            System.out.print(ab);
        }
        finally{
        return AP;   
        }   
    }

   
    
}
