/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;
import org.jsoup.Jsoup;

/**
 *
 * @author amitr
 */
public class snapThread extends Thread  {
    String s;
    
    
    public snapThread(String str) throws IOException,UnknownHostException{
        
        s = Jsoup.connect("http://www.snapdeal.com/search?keyword="+str.replaceAll(" ", "+")+"&sort=rlvncy").timeout(0).get().html();
    }
   
    public List<product> find(List<product> AP){
        try{
        String[] p  = s.split("class=\"col-xs-6  product-tuple-listing js-tuple \"",2);
        while(true){
            if(p.length == 1) break;
            p = p[1].split("href=\"",2);
        p = p[1].split("\"",2);
        String link = p[0];
        p = p[1].split("src=\"",2);
        p = p[1].split("\"",2);
        String src = p[0];        
        p = p[1].split("<p class=\"product-title\">",2);
        p = p[1].split("<",2);
        String title = p[0];   
        p = p[1].split("data-rating=\"",2);
        p = p[1].split("\"",2);
        String star = p[0];   
        p = p[1].split("<p class=\"product-rating-count\">",2);
        p = p[1].split("<",2); 
        String review = p[0];   
        p = p[1].split("<span class=\"product-price\">",2);
        p = p[1].split("<",2); 
        String Price = p[0].substring(p[0].indexOf(".")+2).replaceAll(",", "");  
        AP.add( new product("snapdeal",link,Price,src,title,star,review));
        
        p    = p[1].split("class=\"col-xs-6  product-tuple-listing js-tuple \"",2);
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
