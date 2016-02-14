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
public class amazThread {
    String s;
    
    
    
    public amazThread(String str) throws IOException,UnknownHostException{
        
        
        s = Jsoup.connect("http://www.amazon.in/s/ref=nb_sb_noss?url=search-alias%3Daps&field-keywords="+str.replaceAll(" ", "+")).timeout(0).get().html();    
    }  
    public List<product> find(List<product> AP){
        try{
        String[] p  = s.split("<div class=\"s-item-container\">",2);
        while(true){
            if(p.length == 1) break;
            if(p[1].contains("<h5 class=\"a-spacing-none a-color-tertiary s-sponsored-list-header a-text-normal\">")){
                p  = p[1].split("<div class=\"s-item-container\">",2);
            }
        p = p[1].split("href=\"",2);
        p = p[1].split("\"",2);
        String link = p[0];
        p = p[1].split("set=\"",2);
        p = p[1].split(",",2);
        String src = p[0].substring(0,p[0].indexOf(" "));        
        p = p[1].split("<h2 class=\"a-size-medium a-color-null s-inline s-access-title a-text-normal\">",2);
        p = p[1].split("<",2);
        String title = p[0];   
        p = p[1].split("<span class=\"a-size-base a-color-price s-price a-text-bold\"><span class=\"currencyINR\">&nbsp;&nbsp;</span>",2);
        p = p[1].split("</span>",2);        
        String Price =(p[0].substring(0,p[0].indexOf('.'))).replaceAll(",", "");   
        p = p[1].split("<span class=\"a-icon-alt\">",2);
        p = p[1].split("out",2); 
        String star = p[0];   
        p = p[1].split("<a class=\"a-size-small a-link-normal a-text-normal\"",2);
        p = p[1].split(">",2);
        p = p[1].split("</a>",2);
        String review =p[0]; 
        AP.add( new product("amazon",link,Price,src,title,star,review));
        
        p  = p[1].split("<div class=\"s-item-container\">",2);
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
