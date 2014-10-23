
<%-- 
    Document   : sidebar
    Created on : Oct 7, 2014, 5:10:55 PM
    Author     : Surachai
--%>

<div class="wrapper row-offcanvas row-offcanvas-left">
    <!-- Left side column. contains the logo and sidebar -->
    <aside class="left-side sidebar-offcanvas">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- Sidebar user panel -->
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="img/Koala.jpg" class="img-circle" alt="User Image" />
                </div>
                <div class="pull-left info">
                    <p>Hello  ${USER}</p>

                    <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                </div>
            </div>

            <div class="row">

            </div>
            <!-- /.search form -->
            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu">
                <li>
                    <a href="${pageContext.request.contextPath}">
                        <i class="fa fa-dashboard"></i> <span>Home</span>
                    </a>
                </li>
                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-bar-chart-o"></i>
                        <span>Menu1</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="#"><i class="fa fa-angle-double-right"></i> Sub Menu 1</a></li>     
                    </ul>
                    <ul class="treeview-menu">
                        <li><a href="#"><i class="fa fa-angle-double-right"></i> Sub Menu 2</a></li>     
                    </ul>
                </li>
                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-edit"></i> 
                        <span>Menu2</span>
                    </a>
                </li>
                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-table"></i> <span>Menu 3</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="#"><i class="fa fa-angle-double-right"></i>Sub Menu 1  </a></li>       
                    </ul>
                </li>
            </ul>
        </section>
        <!-- /.sidebar -->
    </aside>

   

