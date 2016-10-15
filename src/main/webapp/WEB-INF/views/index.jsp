<!DOCTYPE html>
<html>
<head>
  <title>Party Fund Management Tool</title>
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
  <script src="resources/js/jquery.squeezing_header.js"></script>
  <script>
    $(document).on('ready', function() {
      return $('.header').squeezingHeader(
        [
          {
            element: '.title',
            mins: {
              fontSize: 20,
              height  : 20,
              width   : 200
            }
          }
        ]
      );
    });
  </script>
  
  <style>
	body {
		background: url(resources/img/bg.jpg) center;
		margin: 0 auto;
		width: 960px;
		padding-top: 50px
	}
	
	.footer {
		margin-top: 50px;
		text-align: center;
		color: #666;
		font: bold 14px Arial
	}
	
	.footer a {
		color: #999;
		text-decoration: none
	}
</style>
  
</head>

<body style="text-align: center; margin: 0;">

  <div class="header" style="color: white; border: 2px solid white; background: purple; position: fixed; top: 0; right: 0; left: 0;">
    <h1 class='title' style='height: 100px;'>Party Fund Management Tool</h1>
  </div>

  <div class="content" style="height: 2000px;">
    <h3>Scroll down, then up.</h3>
  </div>

</body>
</html>