package com.example.myapplication;

public class Utilisateur {
    private String idLogin;
    private String Mdp;

    public Utilisateur(String idLogin, String mdp) {
        this.idLogin = idLogin;
        Mdp = mdp;
    }

    public String getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(String idLogin) {
        this.idLogin = idLogin;
    }

    public String getMdp() {
        return Mdp;
    }

    public void setMdp(String mdp) {
        Mdp = mdp;
    }
}
