

package com.mycompany.singleton;

public class Singleton {
    private String usuario;
    private String token;

        private static Singleton instance = null;
    
    public static Singleton getInstance() {
        if (instance == null) {
        instance = new Singleton();
        }
        return instance;
        }
    
    
    private Singleton(){
    }

    public Singleton(String usuario, String token) {
        this.usuario = usuario;
        this.token = token;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Singleton{" + "usuario=" + usuario + ", token=" + token + '}';
    }
}