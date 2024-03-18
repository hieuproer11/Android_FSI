package com.example.myapplication.BO;

public class Etudiant {
    private int idEtu;
    private String nom;
    private String prenom;
    private String adresse;
    private String mail;
    private String speci;
    private Bilan idBilan;

    public Etudiant(int idEtu, String nom, String prenom, String adresse, String mail, String speci, Bilan idBilan) {
        this.idEtu = idEtu;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.mail = mail;
        this.speci = speci;
        this.idBilan = idBilan;
    }

    public int getIdEtu() {
        return idEtu;
    }

    public void setIdEtu(int idEtu) {
        this.idEtu = idEtu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSpeci() {
        return speci;
    }

    public void setSpeci(String speci) {
        this.speci = speci;
    }

    public Bilan getIdBilan() {
        return idBilan;
    }

    public void setIdBilan(Bilan idBilan) {
        this.idBilan = idBilan;
    }
}
