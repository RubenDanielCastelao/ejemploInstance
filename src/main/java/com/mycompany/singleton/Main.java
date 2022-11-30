
package com.mycompany.singleton;

public class Main {
    
    public static void main(String[] args){
    Singleton obx1 = Singleton.getInstance();
    obx1.setToken("1234");
    obx1.setUsuario("Pepe");
    Singleton obx2 = Singleton.getInstance();
    obx2.setToken("Cambio");
  }
}
