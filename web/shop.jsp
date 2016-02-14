<%@page import="java.util.Arrays"%>
<!DOCTYPE html>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Startup village</title>
    
    <!-- Google Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>
    
    <!-- Bootstrap -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    
    <!-- Font Awesome -->
    <link rel="stylesheet" href="css/font-awesome.min.css">
    
    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/owl.carousel.css">
    <link rel="stylesheet" href="style.css">
       <link href="css2/style.css" rel="stylesheet" type="text/css" media="all" />
<link href="css2/form.css" rel="stylesheet" type="text/css" media="all" />
    <link rel="stylesheet" href="css/responsive.css">
    <style>
        @decimal-format myNum{
            grouping-separator :",";
            decimal-seoarator: "."
        }
        </style>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
   
 <!--   <div class="header-area">
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <div class="user-menu">
                        <ul>
                            <li><a href="#"><i class="fa fa-user"></i> My Account</a></li>
                            <li><a href="#"><i class="fa fa-heart"></i> Wishlist</a></li>
                            <li><a href="cart.html"><i class="fa fa-user"></i> My Cart</a></li>
                            <li><a href="checkout.html"><i class="fa fa-user"></i> Checkout</a></li>
                            <li><a href="#"><i class="fa fa-user"></i> Login</a></li>
                        </ul>
                    </div>
                </div>
                
                <div class="col-md-4">
                    <div class="header-right">
                        <ul class="list-unstyled list-inline">
                            <li class="dropdown dropdown-small">
                                <a data-toggle="dropdown" data-hover="dropdown" class="dropdown-toggle" href="#"><span class="key">currency :</span><span class="value">USD </span><b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">USD</a></li>
                                    <li><a href="#">INR</a></li>
                                    <li><a href="#">GBP</a></li>
                                </ul>
                            </li>

                            <li class="dropdown dropdown-small">
                                <a data-toggle="dropdown" data-hover="dropdown" class="dropdown-toggle" href="#"><span class="key">language :</span><span class="value">English </span><b class="caret"></b></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">English</a></li>
                                    <li><a href="#">French</a></li>
                                    <li><a href="#">German</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End header area -->
    
   <!-- <div class="site-branding-area">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                 
                </div>
                
                <!--<div class="col-sm-6">
                    <div class="shopping-item">
                        <a href="cart.html">Cart - <span class="cart-amunt">$100</span> <i class="fa fa-shopping-cart"></i> <span class="product-count">5</span></a>
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End site branding area -->
    
   <div class="mainmenu-area" style="background-color: rgb(250, 204, 46);padding: 8px 8px 8px 8px;">
        <div class="container">
            <div class="row">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div> 
                 
            <!--</div>
        </div>
    </div>  <!-- End mainmenu area -->
    
    <!--<div class="mainmenu-area" style="background-color: #fff">
        <div class="container">
            <div class="row">-->
                <div class="col-md-12">
                    
                    <div class="navbar-collapse collapse" style="">
                         
                    
                    <form method="GET" action="myresults">
                        
                       <!-- <h1 style="font-family: 'Open Sans';color: #5a88ca;padding:10px 10px 10px 10px; ">SV E-Commerce</h1>-->
                       <a href="index.html"><h1> <span class="logo" style="padding-top: 0px;font-family: 'Open Sans';color:#fff;font-size: 25px">COMPARO</span></h1></a>
                            <input type="submit" value="Search" style="float:right;background-color:#FAAC58" onsubmit="myresults">
                            
                            <input type="text" class="" style="width:50%;float:right;" placeholder="What are u looking..." name="search">
                            
                        </form>
                        
                </div> 
                </div>
            </div>
        </div>
    </div>
                <div class="mainmenu-area">
                <div class="col-md-12" style="padding: 10px 10px 10px 10px;margin-left:auto ">
                    <%
                            String search = request.getParameter("search");
                            String str= search.replaceAll(" ", "+");
                            String ll = request.getParameter("from");
                            String ul = request.getParameter("to");
                            product[] pr = (product[])request.getAttribute("products");
                            %>
                    <div class="navbar-collapse collapse" style="">
                         
                    
                    <form method="GET" class="form-horizontal" action="myresults">
                        <div class="control-group" style="align-content: center;padding: 5px 5px 5px 5px;">
                            <div class="controls form-inline" style="margin-left:6.5%">
                        <input type="hidden" id="thisField" name="search" value="<%=str%>">
                       <!-- <h1 style="font-family: 'Open Sans';color: #5a88ca;padding:10px 10px 10px 10px; ">SV 'E-Commerce</h1>-->
                       <!----
                       <input class="checkbox-inline" type="checkbox" value="amazon" name="chk" /><span style="font-weight: bold">Amazon&nbsp;&nbsp;</span>
                       <input class="checkbox-inline" type="checkbox" value="flipkart" name="chk" /><span style="font-weight: bold">Flipkart&nbsp;&nbsp;</span>
                   <input class="checkbox-inline" type="checkbox" value="snapd" name="chk"  />
                     <span style="font-weight: bold">Snapdeal&nbsp;&nbsp;</span>                       <label class=""><span style="font-weight: bold">Sort&nbsp;&nbsp;</span></label> 
                       <select class=" form-control" style="width:20%" >
                            <option >
                                 High to Low
                             </option>
                             <option>
                                 Low to High
                             </option>
      </select>         --->
                     <label><span style="font-weight: bold; color: #FACC2E;">&nbsp; Filter&nbsp;: </span></label>
                        <input type="text" name="from" class="form-control" placeholder="From.." style="width:auto"/>
                        <label><span style="font-weight: bold; color: #FACC2E;">&nbsp;to&nbsp;</span></label>
                        <input type="text" name="to" class="form-control" placeholder="To..." style="width:auto"/>
                        <input type="submit" class="btn-md btn-primary" Value="Filter"  onsubmit="myresults"/></div></div>
                        </form>

                </div> 
                </div>
                </div>
    
    
    
    <div class="single-product-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
               <%@page import="my.product" %>
               
        <%
        if(ul ==null && ll == null){ ul=pr[0].getPRICE();ll=pr[pr.length-1].getPRICE();}
        if(request.getRequestURI().contains("chk")){%>
        <h1>hello</h1>
        <%}
        for(int i=0;i<pr.length;i++)
        {
            String pri = pr[i].getPRICE();
            String re = pr[i].getREVIEW();
            String rat = pr[i].getRATING();
            String pa = pr[i].getP();
            String ti = pr[i].getTITLE();
            String src= pr[i].getSRC();
            String link = pr[i].getLINK();
            int o =Integer.parseInt(pri) ;
            int upl = Integer.parseInt(ul);
            int lol =Integer.parseInt(ll);
            if(o<=upl && o>=lol){
        %>
                
                 <div class="col-md-3 col-sm-6">
                     <div class="single-product"  style="height: 350px;padding: 20px 20px 20px 20px">
						
			
                                        
                                        <div class="product-carousel-price" style="padding-bottom:  10%;font-size: 14px;height: 30%">
                                            <a href=" " style="font-weight: bold; color: #FACC2E;"><%=ti%></a><br/><br/><span style="color:#58D3F7;"><b>Rating: <%= rat%> / 5</b> </span>
                                            <span class="myNum" style="color: #A9BCF5; float: right;"><b>Rs. <%= pri %></b></span>
                           
                           <!-- <ins></ins> <del>Rs. getprice</del>-->
                        </div>  
                           <div class="single-shop-product">		
                        <div class="product-upper" style="float: center;">
                            <img src="<%=src%> "  style="position: absolute;margin: auto;top: 40%;bottom: 4%;left: 0;right: 0" alt="">
                             <div class="product-hover">
                                 <a href="<%=link%>" class="add-to-cart-link" target="_blank"><i class="fa">
                                         <% if(pa == "flipkart"){%>
                                         <img src="img/flip.png " style="width: 65px;height: 25px;" /></i></a>
                                         <%
                                             } else if(pa == "snapdeal"){%>
                                             <img src="img/SD.png " style="width: 65px;height: 25px;" /></i></a>
    <% }else if(pa=="amazon"){ %>
                             <img src="img/amzo.png " style="width: 65px;height: 25px;" /></i></a>
    <% } %>
                             
                                             
                                        <a href="<%=link%>" class="view-details-link" ><i class="fa fa-link">ADD TO CART</i> </a>
                                       
                                               
                             </div>
                                        
                        </div>
                        </div>
                     <!--   <div class="product-option-shop">
                            <a class="add_to_cart_button" data-quantity="1" data-product_sku="" data-product_id="70" rel="nofollow" href="/canvas/shop/?add-to-cart=70">Add to cart</a>
                        </div>  -->                     
                    </div>
                 </div>
                           <%}
                                }
%>
            
            
        </div>
    </div>


   <!-- <div class="footer-top-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-3 col-sm-6">
                    <div class="footer-about-us">
                        <h2>u<span>Stora</span></h2>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Perferendis sunt id doloribus vero quam laborum quas alias dolores blanditiis iusto consequatur, modi aliquid eveniet eligendi iure eaque ipsam iste, pariatur omnis sint! Suscipit, debitis, quisquam. Laborum commodi veritatis magni at?</p>
                        <div class="footer-social">
                            <a href="#" target="_blank"><i class="fa fa-facebook"></i></a>
                            <a href="#" target="_blank"><i class="fa fa-twitter"></i></a>
                            <a href="#" target="_blank"><i class="fa fa-youtube"></i></a>
                            <a href="#" target="_blank"><i class="fa fa-linkedin"></i></a>
                        </div>
                    </div>
                </div>
                
                <div class="col-md-3 col-sm-6">
                    <div class="footer-menu">
                        <h2 class="footer-wid-title">User Navigation </h2>
                        <ul>
                            <li><a href="">My account</a></li>
                            <li><a href="">Order history</a></li>
                            <li><a href="">Wishlist</a></li>
                            <li><a href="">Vendor contact</a></li>
                            <li><a href="">Front page</a></li>
                        </ul>                        
                    </div>
                </div>
                
                <div class="col-md-3 col-sm-6">
                    <div class="footer-menu">
                        <h2 class="footer-wid-title">Categories</h2>
                        <ul>
                            <li><a href="">Mobile Phone</a></li>
                            <li><a href="">Home accesseries</a></li>
                            <li><a href="">LED TV</a></li>
                            <li><a href="">Computer</a></li>
                            <li><a href="">Gadets</a></li>
                        </ul>                        
                    </div>
                </div>
                
                <div class="col-md-3 col-sm-6">
                    <div class="footer-newsletter">
                        <h2 class="footer-wid-title">Newsletter</h2>
                        <p>Sign up to our newsletter and get exclusive deals you wont find anywhere else straight to your inbox!</p>
                        <div class="newsletter-form">
                            <input type="email" placeholder="Type your email">
                            <input type="submit" value="Subscribe">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>-->
       <div class="footer-bottom-area" style="float: bottom;margin-top: 6.5%;height: 80px;background-color: #F7D358; margin-bottom: 5%;">
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <div class="copyright">
                        <p>&copy; 2016 COMPARO. All Rights Reserved. <a href="#" style="color:white" target="_blank">COMPARO.com</a></p>
                    </div>
                </div>
                
                <div class="col-md-4">
                    <div class="footer-card-icon">
                      <!--  <i class=""><img src="img/amzo.png" style="height:40px;width: 40px;padding-top: 2%" /></i>
                        <i class=""><img src="img/flip.png" style="height:40px;width: 40px;padding-top: 2%" /></i>
                        <i class=""><img src="img/SD.png" style="height:40px;width: 40px;padding-top: 2%" /></i>
                        <!--<i class="fa fa-cc-visa"></i>-->
                    </div>
                </div>
            </div>
        </div>
    </div> <!-- End footer bottom area -->
   
   
    <!-- Latest jQuery form server -->
    <script src="https://code.jquery.com/jquery.min.js"></script>
    
    <!-- Bootstrap JS form CDN -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
    
    <!-- jQuery sticky menu -->
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/jquery.sticky.js"></script>
    
    <!-- jQuery easing -->
    <script src="js/jquery.easing.1.3.min.js"></script>
    
    <!-- Main Script -->
    <script src="js/main.js"></script>
  </body>
</html>