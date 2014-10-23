/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.des.session;

import com.des.schemadb.SchemaDB;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Surachai
 */
public class Session { 
    private Map<String, Object> map;
    private static Session instance = null;
    private SchemaDB Schema;
    
    public static Session Getinstance(){
      if(instance == null) {
         instance = new Session();
      }
      return instance;
    }
    
    private Session(){
        map = new HashMap<String,Object>();
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public static Session getInstance() {
        return instance;
    }

    public static void setInstance(Session instance) {
        Session.instance = instance;
    }

    public SchemaDB getSchema() {
        return Schema;
    }

    public void setSchema(SchemaDB Schema) {
        this.Schema = Schema;
    }

    
}
/*
public class ClassicSingleton {
   private static ClassicSingleton instance = null;
   protected ClassicSingleton() {
      // Exists only to defeat instantiation.
   }
   public static ClassicSingleton getInstance() {
      if(instance == null) {
         instance = new ClassicSingleton();
      }
      return instance;
   }
}
*/