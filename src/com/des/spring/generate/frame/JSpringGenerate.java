/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.des.spring.generate.frame;
//test pull
import com.des.generate.GenerateFile;
import com.des.generate.master.MasterTag;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Surachai
 */
public class JSpringGenerate {

    private static final String COMMANDPATH = "resource/command.xml";
    GenerateFile g;

    public JSpringGenerate() {
        this.g = new GenerateFile();
    }

    public void setupproject(Map<String, Object> map) throws IOException {
        List<String> command = new LinkedList<String>();

        /*
        
         Ajaxservlet
         Ajaxservice
         AbstractBeanPackage
         ViewPackage
         AjaxCombopackage
         CreateAjaxService
         CreateAbstractAjaxServlet
         CreateAjaxServlet
         CreateAjaxPageServlet
         CreateAbstractAJAXServlet
         CreateAbstractBean
         CreateSelectOption
         CreateAJAXBean
         AddTagBeanRef
         AddTagAJAXServlet
        
         */
        command.add("basiclib");
        command.add("reportlib");
        command.add("spring3.2.7");
        command.add("css");
        command.add("img");
        command.add("js");
        command.add("template");
        command.add("templatelogin");
        command.add("templatemain");
        command.add("header");
        command.add("sidebar");
        command.add("footer");
        command.add("projectcss");
        command.add("tiles");
        command.add("spring-bean");
        command.add("spring-connect");
        command.add("spring-query");
        command.add("jasper");
        command.add("springSQL");
        command.add("dispatcher-servlet");
        command.add("web");
        command.add("redirect");
        command.add("common");
        command.add("controller");
        command.add("report");
        command.add("bean");
        command.add("entity");
        command.add("query");
        command.add("service");
        command.add("filterFolder");
        command.add("master");
        command.add("servlet");
        command.add("ProjectSQL");
        command.add("maincontroller");
        command.add("Filter");
        command.add("IndexController");
        command.add("LoginController");
        command.add("LogOutController");
        command.add("SystemUser");
        command.add("jspFolder");
        command.add("indexjsp");
        command.add("loginjsp");
        /* Admin LTE
         command.add("basiclib");
         command.add("reportlib");
         command.add("spring3.2.7");
         command.add("css");
         command.add("img");
         command.add("js");
         command.add("template");
         command.add("templatelogin");
         command.add("templatemain");
         command.add("fonts");
         command.add("HighChart");
         command.add("less");
         command.add("header");
         command.add("sidebar");  
         command.add("projectcss");
         command.add("tiles");
         command.add("spring-bean");
         command.add("spring-connect");
         command.add("spring-query");
         command.add("jasper");
         command.add("springSQL");
         command.add("dispatcher-servlet");
         command.add("web");
         command.add("redirect");
         command.add("common");
         command.add("controller");
         command.add("report");
         command.add("bean");
         command.add("entity");
         command.add("query");
         command.add("service");
         command.add("filterFolder");
         command.add("master");
         command.add("servlet");
         command.add("ProjectSQL");
         command.add("maincontroller");
         command.add("Filter");
         command.add("IndexController");
         command.add("LoginController");
         command.add("LogOutController");
         command.add("SystemUser");
         command.add("jspFolder");
         command.add("indexjsp");
         command.add("loginjsp");
         */
        /*
         command.add("basiclib");
         command.add("reportlib");
         command.add("spring3.2.7");
         command.add("datatable");
         command.add("img");
         command.add("js");
         command.add("jquery");
         command.add("template");
         command.add("img");
         command.add("header");
         command.add("css");
         command.add("projectcss");
         command.add("tiles");
         command.add("spring-bean");
         command.add("spring-connect");
         command.add("spring-query");
         command.add("jasper");
         command.add("springSQL");
         command.add("dispatcher-servlet");
         command.add("web");
         command.add("redirect");
         command.add("common");
         command.add("controller");
         command.add("report");
         command.add("bean");
         command.add("entity");
         command.add("query");
         command.add("service");
         command.add("filterFolder");
         command.add("master");
         command.add("servlet");
         command.add("Conection");
         command.add("AbstractQuery");
         command.add("JTDSConection");
         command.add("ProjectSQL");
         command.add("maincontroller");
         command.add("Filter");
         command.add("IndexController");
         command.add("LoginController");
         command.add("LogOutController");
         command.add("SystemUserBean");
         command.add("SystemUser");
         command.add("SystemUserService");
         command.add("SystemUserQuery");
         command.add("jspFolder");
         command.add("indexjsp");
         command.add("loginjsp");
         */
        g.RunListCommand(COMMANDPATH, command, map, true);
    }

    public String GenerateFromTag(String name, Map<String, Object> map, boolean flagOverWrite) throws IOException {
        List<String> command = new LinkedList<String>();
        command.add(name);
        return g.RunListCommand(COMMANDPATH, command, map, flagOverWrite);
    }

}
