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
import org.jsoup.Jsoup;


public class Products  {
     private static int idx;
     private String[] P;
     private String[] LINK;
     private int[] PRICE;
     private String[] SRC;
     private String[] TITLE;
     private String[] RATING;
     private String[] REVIEW;
     
     public Products(){
         idx = -1;
         P = new String[10000];
         LINK  = new String[10000];
         PRICE = new int[10000];
         SRC = new String[10000];
         TITLE = new String[10000];
         RATING = new String[10000];
         REVIEW = new String[10000];
         
     }
     
     public void findProducts(String keyword) throws IOException{
         String p = keyword.replaceAll(" ", "+");
            String flipkart = "http://www.flipkart.com/search?q="+p+"&as=off&as-show=off&otracker=start";
            String Snapdeal = "http://www.snapdeal.com/search?keyword="+p+"&sort=rlvncy";
            String Amazon = "http://www.amazon.in/s/ref=nb_sb_noss?url=search-mazon.in/s/ref=nb_sb_noss?urlalias%3Daps&field-keywords="+p; 
            getFLIP(flipkart);
            getSNAP(Snapdeal);
            getAMAZ(Amazon);
    }
     
     private void getAMAZ(String Ama) throws IOException{
         try{
        String s = Jsoup.connect(Ama).userAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/535.21 (KHTML, like Gecko) Chrome/19.0.1042.0 Safari/535.21").timeout(0).get().html();
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
        p = p[1].split("\"",2);
        String src = p[0].substring(0,p[0].length()-3);        
        p = p[1].split("<h2 class=\"a-size-medium a-color-null s-inline s-access-title a-text-normal\">",2);
        p = p[1].split("<",2);
        String title = p[0];   
        p = p[1].split("<span class=\"a-size-base a-color-price s-price a-text-bold\"><span class=\"currencyINR\">&nbsp;&nbsp;</span>",2);
        p = p[1].split("</span>",2);        
        String Price = (p[0].substring(0,p[0].indexOf('.'))).replaceAll(",", "");   
        p = p[1].split("<span class=\"a-icon-alt\">",2);
        p = p[1].split("out",2); 
        String star = p[0];   
        p = p[1].split("<a class=\"a-size-small a-link-normal a-text-normal\"",2);
        p = p[1].split(">",2);
        p = p[1].split("</a>",2);
        String review = p[0];   
        idx++;
        P[idx] = "Amazon";
        LINK[idx]=link;
        SRC[idx] =src;
        TITLE[idx]=title;
        RATING[idx]=star;
        REVIEW[idx]=review;
        PRICE[idx] = Integer.parseInt(Price);
        p  = p[1].split("<div class=\"s-item-container\">",2);
        }
        }
        catch(ArrayIndexOutOfBoundsException ai){
            System.out.println(ai);
        }
        catch(UnknownHostException he){
            System.out.println(he);
        }
    }
     
     
     private void getSNAP(String Snap) throws IOException{
         try{
        String s = Jsoup.connect(Snap).userAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/535.21 (KHTML, like Gecko) Chrome/19.0.1042.0 Safari/535.21").timeout(0).get().html();
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
        String review = p[0].substring(1,p[0].length()-1);   
        p = p[1].split("<span class=\"product-price\">",2);
        p = p[1].split("<",2); 
        String Price = p[0].substring(4);   
        idx++;
        P[idx]="SnapDeal";
        LINK[idx]=link;
        SRC[idx] =src;
        TITLE[idx]=title;
        RATING[idx]=star;
        REVIEW[idx]=review;
        PRICE[idx] = Integer.parseInt(Price.replaceAll(",", ""));
        p  = p[1].split("class=\"col-xs-6  product-tuple-listing js-tuple \"",2);
        }
        }
        catch(ArrayIndexOutOfBoundsException ai){
            System.out.println(ai);
        }
        catch(UnknownHostException he){
            System.out.println(he);
        }
     }
     
     private void getFLIP(String flip) throws IOException{
         try{        String s = Jsoup.connect(flip).userAgent("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/535.21 (KHTML, like Gecko) Chrome/19.0.1042.0 Safari/535.21").timeout(0).get().html();
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
        String star = p[0].substring(0,p[0].indexOf(' '));   
        p = p[1].split("</div>",2);
        p = p[1].split("</div>",2);
        p = p[1].split("<span",2);
        String review = p[0].substring(2,p[0].indexOf(' ',2));   
        p = p[1].split("pu-final\">",2);
        p = p[1].split(">",2);
        p = p[1].split("</span>",2);        
        String Price = p[0].substring(p[0].indexOf('.')+2);
        idx++;
        P[idx]="flipkart";
        LINK[idx]="http://www.flipkart.com" + link;
        SRC[idx] =src;
        TITLE[idx]=title;
        RATING[idx]=star;
        REVIEW[idx]=review;
        PRICE[idx] = Integer.parseInt(Price.replaceAll(",", ""));
        p  = p[1].split("<div class=\"pu-visual-section\">",2);
        }
        }
        catch(ArrayIndexOutOfBoundsException ai){
            System.out.println(ai);
        }
        catch(UnknownHostException he){
            System.out.println(he);
        }
     }
     
     public int length(){
         return idx;
     }
     
     public String getLink(int id){return LINK[id];}
     public String getPrice(int id){return PRICE[id]+"";}
     public String getSrc(int id){return SRC[id];}
     public String getTitle(int id){return TITLE[id];}
     public String getRate(int id){return RATING[id];}
     public String getReview(int id){return REVIEW[id];}
     public String getParent(int id){return P[id];}
     
          
}
