<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>EventZilla</title>
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <link href="resources/mytheme/css/bootstrap1.min.css" rel="stylesheet">
    <link href="resources/mytheme/css/lighter.css" rel="stylesheet">
    
    <style type="text/css">
    
    #result{
    margin-left:5px;
	}
    
    #register .short{ color:#FF0000; } #register .weak{ color:#E66C2C; } #register .good{ color:#2D98F3; } #register .strong{ color:#006400; }
    </style>
   
</head>
 
  <body>

      <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand nav-link" href="#top">Event Management System</a>
        </div> <!-- /.navbar-header -->

        <div class="collapse navbar-collapse navbar-ex1-collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#features" class="nav-link">Features</a></li>
            <li><a href="#faqs" class="nav-link">FAQs</a></li>
            <li><a href="#about" class="nav-link">About</a></li>
            <li><a href="#contact">Contact Us</a></li>
            <li><a href="#add-event-modal" role="button" data-target="#myModal1" class="btn" data-toggle="modal">Sign In</a>
            </li>
            
          </ul>
        </div> <!-- /.navbar-collapse -->
      </div> <!-- /.container -->
    </nav> <!-- /.navbar -->

	<form action="xyz.htm" method="get" id="register">   
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  			<div class="modal-dialog">
    		<div class="modal-content">
      			<div class="modal-header">
        		<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
        		<h4 class="modal-title" id="myModalLabel">Sign Up</h4>
      			</div>
      		<div class="modal-body">
       
            <div class="input-group" style="width:340px;text-align:center;margin:0 auto;">
            <input class="form-control input-lg" title="Don't worry. We hate spam, and will not share your email with anyone." placeholder="Enter your email address" name= email type="text">
            </div>
            <br/>
            <div class="input-group" style="width:340px;text-align:center;margin:0 auto;">
            <input class="form-control input-lg" placeholder="Enter your Username" name=username type="text">
            </div>
            <br/>
            <div class="input-group" style="width:340px;text-align:center;margin:0 auto;">
            <input class="form-control input-lg" placeholder="Enter your Password" name=password type="password"><span id="result"></span>
            </div>
            <br/>
            <div class="input-group" style="width:340px;text-align:center;margin:0 auto;">
            <input class="form-control input-lg" placeholder="Re-enter Password" name=repassword type="password">
            </div>
            <br/>
            <div class="input-group" style="width:340px;text-align:center;margin:0 auto;">
            <input class="form-control input-lg" placeholder="Enter your First Name" name=firstName type="text">
            </div>
            <br/>
            <div class="input-group" style="width:340px;text-align:center;margin:0 auto;">
            <input class="form-control input-lg" placeholder="Enter your Last Name" name=lastName type="text">
            </div>
            <br/>
            <div class="input-group" id="qwe" style="text-align:left;margin:0 auto;">
            <input class="form-control input-sm" id="policy" name="policy" type="checkbox"><label>I accept the terms and conditions.</label>
            </div>
              <br/>
      <div class="input-group" id="qwe" style="text-align:left;margin:0 auto;">
       <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Register</button>
      </div>

      </div>
      </div>
  </div>
</div>
</form>

<form action="abc.htm" method="get">
	<div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  	<div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
        <h4 class="modal-title" id="myModalLabel">Sign In</h4>
      </div>
      <div class="modal-body">
       
            
            <div class="input-group" style="width:340px;text-align:center;margin:0 auto;">
            <input class="form-control input-lg" placeholder="Enter your Username" type="text">
            </div>
            <br/>
            <div class="input-group" style="width:340px;text-align:center;margin:0 auto;">
            <input class="form-control input-lg" placeholder="Enter your Password" type="password">
            </div>
            <br/>
                  <div class="input-group" id="qwe" style="text-align:left;margin:0 auto;">
       <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Sign In</button>
      </div>     
      </div>
      </div>
  	</div>
	</div>
</form>


    <div id="top" class="jumbotron">
      <div class="container">
      <div class="row">
      <div class="col-md-7">
      
      <h1>The fox jumps over the lazy dog</h1>
        <h2>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy</h2>
        <p><a class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">Sign Up Today <span class="glyphicon glyphicon-circle-arrow-right"></span></a></p>
      
      </div>
      
      
          <div class="col-md-5">
            <div id="tour" class="carousel slide">
              <ol class="carousel-indicators">
                <li data-target="#tour" data-slide-to="0" class="active"></li>
                <li data-target="#tour" data-slide-to="1"></li>
                <li data-target="#tour" data-slide-to="2"></li>
                <li data-target="#tour" data-slide-to="3"></li>
                <li data-target="#tour" data-slide-to="4"></li>
              </ol>

              <div class="carousel-inner">
                <div class="item active">
                  <img src="img/stock1.jpg">
                  <div class="carousel-caption">
                    Amazing photos provided by <a href="http://unsplash.com">unsplash.com</a>
                  </div>
                </div>
                <div class="item">
                  <img src="img/stock2.jpg">
                  <div class="carousel-caption">
                    Boat in Water
                  </div>
                </div>
                <div class="item">
                  <img src="img/stock3.jpg">
                  <div class="carousel-caption">
                    Millennium Bridge in London
                  </div>
                </div>
                <div class="item">
                  <img src="img/stock4.jpg">
                  <div class="carousel-caption">
                    Blurs
                  </div>
                </div>
                <div class="item">
                  <img src="img/stock5.jpg">
                  <div class="carousel-caption">
                    Santorini Greece
                  </div>
                </div>
              </div>

              <a class="left carousel-control" href="#tour" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left"></span>
              </a>
              <a class="right carousel-control" href="#tour" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right"></span>
              </a>
            </div> <!-- #tour -->
          </div> <!-- /.col-md-12 -->
        </div> <!-- /.row -->
        </div> <!-- /.container -->
    </div> <!-- /.jumbotron -->

    <div class="container">
      <h3 id="features" class="subhead">Features</h3>
      <div class="row benefits">
        <div class="col-md-4 col-sm-6 benefit">
          <div class="benefit-ball">
            <span class="glyphicon glyphicon-home"></span>
          </div>
          <h3>Benefit Title</h3>
          <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna.</p>
        </div> <!-- /.benefit -->

        <div class="col-md-4 col-sm-6 benefit">
          <div class="benefit-ball">
            <span class="glyphicon glyphicon-cloud"></span>
          </div>
          <h3>Benefit Title</h3>
          <p>Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.</p>
        </div> <!-- /.benefit -->

        <div class="col-md-4 col-sm-6 benefit">
          <div class="benefit-ball">
            <span class="glyphicon glyphicon-bell"></span>
          </div>
          <h3>Benefit Title</h3>
          <p>Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu.</p>
        </div> <!-- /.benefit -->
      </div> <!-- /.row -->
    </div> <!-- /.container -->
	
	<div class="container-alternate">
	<div class="container">
	
		<h3 id="features" class="subhead">Events</h3>
		<div class="row">
  		<div class="col-xs-6 col-md-4">
  		
  			<div class="panel panel-info">
  				<div class="panel-heading">xyz, CEO of abc</div>
  				<div class="panel-body">
    			Panel content</div>
  				<div class="panel-footer">Panel footer</div>
  			</div>
  		</div>
  		  		
  		<div class="col-xs-6 col-md-4" offset-4>
  			
  			<div class="panel panel-default">
  			<!-- Default panel contents -->
  			<div class="panel-heading">Upcoming Events</div>
  			<div class="panel-body">
    		<p>Here is a list of events around the world</p>
  			</div>

  			<!-- List group -->
  			<ul class="list-group">
    		<li class="list-group-item">1</li>
    		<li class="list-group-item">2</li>
    		<li class="list-group-item">3</li>
    		<li class="list-group-item">4</li>
    		<li class="list-group-item">5</li>
    		
  			</ul>
  			
  			<div class="panel-footer"><a href="">See More Events</a></div>
			</div>
  		
  		</div>
		
		
		</div><!-- /.row -->
		
		<div class = "row">
		
			<div class="col-xs-6 col-md-4"></div>
			<div class="col-xs-6 col-md-4">veydddddddddddddvfyyyyyyyyyyyyyy</div>
		
		
		
		</div><!-- /.row -->
		
		
	</div><!-- /.container -->
	</div><!-- /.container-alternate -->
	
    <div class="container">
      <h3 id="faqs" class="subhead">Frequently Asked Questions</h3>
      <div class="row faqs">
        <p class="col-md-4 col-sm-6">
          <strong>Lorem ipsum dolor sit amet?</strong><br>
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam
          nonummy nibh euismod tincidunt ut laoreet dolore magna.  Ut wisi enim
          ad minim veniam, quis nostrud exerci tation ullamcorper suscipit
          lobortis nisl ut aliquip ex ea commodo consequat.
        </p>
        <p class="col-md-4 col-sm-6">
          <strong>Lorem ipsum dolor sit amet?</strong><br>
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam
          nonummy nibh euismod tincidunt ut laoreet dolore magna.  Ut wisi enim
          ad minim veniam, quis nostrud exerci tation ullamcorper suscipit
          lobortis nisl ut aliquip ex ea commodo consequat.
        </p>
        <p class="col-md-4 col-sm-6">
          <strong>Lorem ipsum dolor sit amet?</strong><br>
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam
          nonummy nibh euismod tincidunt ut laoreet dolore magna.  Ut wisi enim
          ad minim veniam, quis nostrud exerci tation ullamcorper suscipit
          lobortis nisl ut aliquip ex ea commodo consequat.
        </p>
        <p class="col-md-4 col-sm-6">
          <strong>Lorem ipsum dolor sit amet?</strong><br>
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam
          nonummy nibh euismod tincidunt ut laoreet dolore magna.  Ut wisi enim
          ad minim veniam, quis nostrud exerci tation ullamcorper suscipit
          lobortis nisl ut aliquip ex ea commodo consequat.
        </p>
        <p class="col-md-4 col-sm-6">
          <strong>Lorem ipsum dolor sit amet?</strong><br>
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam
          nonummy nibh euismod tincidunt ut laoreet dolore magna.  Ut wisi enim
          ad minim veniam, quis nostrud exerci tation ullamcorper suscipit
          lobortis nisl ut aliquip ex ea commodo consequat.
        </p>
        <p class="col-md-4 col-sm-6">
          <strong>Lorem ipsum dolor sit amet?</strong><br>
          Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam
          nonummy nibh euismod tincidunt ut laoreet dolore magna.  Ut wisi enim
          ad minim veniam, quis nostrud exerci tation ullamcorper suscipit
          lobortis nisl ut aliquip ex ea commodo consequat.
        </p>
      </div> <!-- /.faqs -->
    </div> <!-- /.container -->

    <div class="container-alternate">
      <div class="container">
        <h3 id="about" class="subhead">About Us</h3>
        <div class="row about">
          <div class="col-md-10 col-md-offset-1 text-center">
            <p>
              Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam
              nonummy nibh euismod tincidunt ut laoreet dolore magna.  Ut wisi
              enim ad minim veniam, quis nostrud exerci tation ullamcorper
              suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis
              autem vel eum iriure dolor in hendrerit in vulputate velit esse
              molestie consequat, vel illum dolore eu feugiat nulla facilisis at
              vero eros et accumsan.
            </p>
            <p>
              Nam liber tempor cum soluta nobis eleifend option congue nihil
              imperdiet doming id quod mazim placerat facer possim assum. Typi non
              habent claritatem insitam; est usus legentis in iis qui facit eorum
              claritatem. Investigationes demonstraverunt lectores legere me lius
              quod ii legunt saepius.
            </p>
          </div> <!-- /.col-md-10 -->
        </div> <!-- /.row -->
      </div> <!-- /.container -->
    </div> <!-- /.container-alternate -->

    <footer>
      <div class="container clearfix">
        <p class="pull-left">
          Copyright &copy; Acme Corp 2013
        </p>
        <p class="pull-right">
          a template from <a href="#">Coverstrap</a>
        </p>
      </div> <!-- /.container -->
    </footer>

    <script src="resources/mytheme/js/jquery.js"></script>
    <script src="resources/mytheme/js/bootstrap.min.js"></script>
    <script>
    $(document).ready(function()
  		  {
      $(".nav-link").click(function(e) {
        e.preventDefault();
        var link = $(this);
        var href = link.attr("href");
        $("html,body").animate({scrollTop: $(href).offset().top - 80}, 500);
        link.closest(".navbar").find(".navbar-toggle:not(.collapsed)").click();
      });
      
   

    		  	$('#password').keyup(function()
    		  	{
    		  		$('#result').html(checkStrength($('#password').val()));
    		  	});	
    		  	
    		  	/*
    		  		checkStrength is function which will do the 
    		  		main password strength checking for us
    		  	*/
    		  	
    		  	function checkStrength(password)
    		  	{
    		  		//initial strength
    		  		var strength = 0;
    		  		
    		  		//if the password length is less than 6, return message.
    		  		if (password.length < 6) { 
    		  			$('#result').removeClass();
    		  			$('#result').addClass('short');
    		  			return 'Too short';
    		  		}
    		  		
    		  		//length is ok, lets continue.
    		  		
    		  		//if length is 8 characters or more, increase strength value
    		  		if (password.length > 7) strength += 1;
    		  		
    		  		//if password contains both lower and uppercase characters, increase strength value
    		  		if (password.match(/([a-z].*[A-Z])|([A-Z].*[a-z])/))  strength += 1;
    		  		
    		  		//if it has numbers and characters, increase strength value
    		  		if (password.match(/([a-zA-Z])/) && password.match(/([0-9])/))  strength += 1; 
    		  		
    		  		//if it has one special character, increase strength value
    		  		if (password.match(/([!,%,&,@,#,$,^,*,?,_,~])/))  strength += 1;
    		  		
    		  		//if it has two special characters, increase strength value
    		  		if (password.match(/(.*[!,%,&,@,#,$,^,*,?,_,~].*[!,%,&,@,#,$,^,*,?,_,~])/)) strength += 1;
    		  		
    		  		//now we have calculated strength value, we can return messages
    		  		
    		  		//if value is less than 2
    		  		if (strength < 2 )
    		  		{
    		  			$('#result').removeClass();
    		  			$('#result').addClass('weak');
    		  			return 'Weak';			
    		  		}
    		  		else if (strength == 2 )
    		  		{
    		  			$('#result').removeClass();
    		  			$('#result').addClass('good');
    		  			return 'Good';		
    		  		}
    		  		else
    		  		{
    		  			$('#result').removeClass();
    		  			$('#result').addClass('strong');
    		  			return 'Strong';
    		  		}
    		  	}
    		  });
    </script>
  </body>
</html>
