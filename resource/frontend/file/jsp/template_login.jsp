
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title>Login Page - Ace Admin</title>

		<meta name="description" content="User login page" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

		<!-- bootstrap & fontawesome -->
		<link rel="stylesheet" href="css/assets/css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/assets/css/font-awesome.min.css" />

		<!-- text fonts -->
		<link rel="stylesheet" href="css/assets/css/ace-fonts.css" />

		<!-- ace styles -->
		<link rel="stylesheet" href="css/assets/css/ace.min.css" />

		<!--[if lte IE 9]>
			<link rel="stylesheet" href="css/assets/css/ace-part2.min.css" />
		<![endif]-->
		<link rel="stylesheet" href="css/assets/css/ace-rtl.min.css" />

		<!--[if lte IE 9]>
		  <link rel="stylesheet" href="css/assets/css/ace-ie.min.css" />
		<![endif]-->
		<link rel="stylesheet" href="css/assets/css/ace.onpage-help.css" />

	</head>
    <body class="login-layout blur-login">  
        
            <tiles:insertAttribute name="body" />
       
    </body>
</html>