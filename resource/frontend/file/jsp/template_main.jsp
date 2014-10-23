
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
    <head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <meta charset="utf-8" />
        <title><tiles:insertAttribute name="title" ignore="true" /></title>
	    <meta name="description" content="Static &amp; Dynamic Tables" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
		
        <!-- bootstrap & fontawesome -->
        <link rel="stylesheet" href="css/assets/css/bootstrap.min.css" />
        <link rel="stylesheet" href="css/assets/css/font-awesome.min.css" />

        <!-- page specific plugin styles -->

        <!-- text fonts -->
        <link rel="stylesheet" href="css/assets/css/ace-fonts.css" />

        <!-- ace styles -->
        <link rel="stylesheet" href="css/assets/css/ace.min.css" id="main-ace-style" />

        <!--[if lte IE 9]>
                <link rel="stylesheet" href="css/assets/css/ace-part2.min.css" />
        <![endif]-->
        <link rel="stylesheet" href="css/assets/css/ace-skins.min.css" />
        <link rel="stylesheet" href="css/assets/css/ace-rtl.min.css" />

        <!--[if lte IE 9]>
          <link rel="stylesheet" href="css/assets/css/ace-ie.min.css" />
        <![endif]-->

        <!-- inline styles related to this page -->

        <!-- ace settings handler -->
        <script src="css/assets/js/ace-extra.min.js"></script>

        <!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

        <!--[if lte IE 8]>
        <script src="css/assets/js/html5shiv.min.js"></script>
        <script src="css/assets/js/respond.min.js"></script>
        <![endif]-->
        
    </head>
    <body class="skin-2">

        <!--Header-->
        <tiles:insertAttribute name="header" />

		<div class="main-container" id="main-container">
            <script type="text/javascript">
                try {
                    ace.settings.check('main-container', 'fixed')
                } catch (e) {
                }
            </script>
        <!--SideBar-->
        <tiles:insertAttribute name="sidebar" />

		<!--Body-->
        <tiles:insertAttribute name="body" />
		</div>
		<!--Footer-->
		<tiles:insertAttribute name="footer" />

		<!-- basic scripts -->

		<!--[if !IE]> -->
		<script type="text/javascript">
			window.jQuery || document.write("<script src='css/assets/js/jquery.min.js'>"+"<"+"/script>");
		</script>

		<!-- <![endif]-->

		<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='css/assets/js/jquery1x.min.js'>"+"<"+"/script>");
</script>
<![endif]-->
		<script type="text/javascript">
			if('ontouchstart' in document.documentElement) document.write("<script src='css/assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="css/assets/js/bootstrap.min.js"></script>

		<!-- page specific plugin scripts -->

		<!-- ace scripts -->
		<script src="css/assets/js/ace-elements.min.js"></script>
		<script src="css/assets/js/ace.min.js"></script>

		<!-- inline scripts related to this page -->

		<!-- the following scripts are used in demo only for onpage help and you don't need them -->
		<link rel="stylesheet" href="css/assets/css/ace.onpage-help.css" />
		<link rel="stylesheet" href="css/docs/assets/js/themes/sunburst.css" />

		<script type="text/javascript"> ace.vars['base'] = '..'; </script>
		<script src="css/assets/js/ace/elements.onpage-help.js"></script>
		<script src="css/assets/js/ace/ace.onpage-help.js"></script>
		<script src="css/docs/assets/js/rainbow.js"></script>
		<script src="css/docs/assets/js/language/generic.js"></script>
		<script src="css/docs/assets/js/language/html.js"></script>
		<script src="css/docs/assets/js/language/css.js"></script>
		<script src="css/docs/assets/js/language/javascript.js"></script>
</body>
</html>