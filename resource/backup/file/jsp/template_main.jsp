
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
    <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>        
        <title><tiles:insertAttribute name="title" ignore="true" /></title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="css/font-awesome.min.css" rel="stylesheet" type="text/css" />
        <link href="css/ionicons.min.css" rel="stylesheet" type="text/css" />
        <link href="css/calendar/fullcalendar.css" rel="stylesheet" type="text/css" />
        <link href="css/calendar/fullcalendar.print.css" rel="stylesheet" type="text/css" media='print' />
        <!-- DATA TABLES -->
        <link href="css/datatables/dataTables.bootstrap.css" rel="stylesheet" type="text/css" />
        <!-- Theme style -->
        <link href="css/<%projectname%>.css" rel="stylesheet" type="text/css" />   
        <!-- Right side column. Contains the navbar and content of the page -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <script src="js/jquery-ui.min.js" type="text/javascript"></script>
        <!-- AdminLTE App -->
        <script src="js/AdminLTE/app.js" type="text/javascript"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="js/AdminLTE/demo.js" type="text/javascript"></script>
        <script src="js/plugins/datatables/jquery.dataTables.js" type="text/javascript"></script>
        <script src="js/plugins/datatables/dataTables.bootstrap.js" type="text/javascript"></script>
        <script src="js/plugins/calendar/moment.min.js" type="text/javascript"></script>
        <script src="js/plugins/calendar/fullcalendar.min.js" type="text/javascript"></script>
        
    </head>
    <body class="skin-blue">

        <!--Header-->
        <tiles:insertAttribute name="header" />

        <!--SideBar-->
        <tiles:insertAttribute name="sidebar" />


        <aside class="right-side">
            <tiles:insertAttribute name="body" />
        </aside><!-- /.right-side -->
    </div><!-- ./wrapper -->
            
    <tiles:insertAttribute name="footer" />


</body>
</html>