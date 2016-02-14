/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import java.util.Comparator;

/**
 *
 * @author amitr
 */
public class product implements Comparator<product>{
   
    
     private String P;
     private String LINK;
     private String PRICE;
     private String SRC;
     private String TITLE;
     private String RATING;
     private String REVIEW;

    public product() {
        this.P = new String();
        this.LINK = new String();
        this.PRICE = new String();
        this.SRC = new String();
        this.TITLE = new String();
        this.RATING = new String();
        this.REVIEW = new String();
    }

    public product(String P, String LINK, String PRICE, String SRC, String TITLE, String RATING, String REVIEW) {
        this.P = P;
        this.LINK = LINK;
        this.PRICE = PRICE;
        this.SRC = SRC;
        this.TITLE = TITLE;
        this.RATING = RATING;
        this.REVIEW = REVIEW;
    }
     
        public String getP() {
        return P;
    }

    public void setP(String P) {
        this.P = P;
    }

    public String getLINK() {
        return LINK;
    }

    public void setLINK(String LINK) {
        this.LINK = LINK;
    }

    public String getPRICE() {
        return PRICE;
    }

    public void setPRICE(String PRICE) {
        this.PRICE = PRICE;
    }

    public String getSRC() {
        return SRC;
    }

    public void setSRC(String SRC) {
        this.SRC = SRC;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getRATING() {
        return RATING;
    }

    public void setRATING(String RATING) {
        this.RATING = RATING;
    }

    public String getREVIEW() {
        return REVIEW;
    }

    public void setREVIEW(String REVIEW) {
        this.REVIEW = REVIEW;
    }
    @Override
    public int compare(product o1, product o2) {
        if(Integer.parseInt(o1.getPRICE()) < Integer.parseInt(o2.getPRICE())){
            return 1;
        }
        else{
            return -1;
        }
    }
    
}
