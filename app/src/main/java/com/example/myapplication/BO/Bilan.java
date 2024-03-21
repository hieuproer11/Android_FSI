package com.example.myapplication.BO;

import java.util.Date;

public class Bilan {
    private int idBilan;
    private Date dateVisite;
    private Date dateLimite;
    private float noteEnt;
    private float noteDoss;
    private float noteOral;
    private String remarque;
    private String sujMemoire;
    private Etudiant idEtu;


    public Bilan(int idBilan, Date dateVisite, Date dateLimite, float noteEnt, float noteDoss, float noteOral, String remarque, String sujMemoire, Etudiant idEtu) {
        this.idBilan = idBilan;
        this.dateVisite = dateVisite;
        this.dateLimite = dateLimite;
        this.noteEnt = noteEnt;
        this.noteDoss = noteDoss;
        this.noteOral = noteOral;
        this.remarque = remarque;
        this.sujMemoire = sujMemoire;
        this.idEtu = idEtu;
    }

    public int getIdBilan() {
        return idBilan;
    }

    public void setIdBilan(int idBilan) {
        this.idBilan = idBilan;
    }

    public Date getDateVisite() {
        return dateVisite;
    }

    public void setDateVisite(Date dateVisite) {
        this.dateVisite = dateVisite;
    }

    public Date getDateLimite() {
        return dateLimite;
    }

    public void setDateLimite(Date dateLimite) {
        this.dateLimite = dateLimite;
    }

    public float getNoteEnt() {
        return noteEnt;
    }

    public void setNoteEnt(float noteEnt) {
        this.noteEnt = noteEnt;
    }

    public float getNoteDoss() {
        return noteDoss;
    }

    public void setNoteDoss(float noteDoss) {
        this.noteDoss = noteDoss;
    }

    public float getNoteOral() {
        return noteOral;
    }

    public void setNoteOral(float noteOral) {
        this.noteOral = noteOral;
    }

    public String getRemarque() {
        return remarque;
    }

    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }

    public String getSujMemoire() {
        return sujMemoire;
    }

    public void setSujMemoire(String sujMemoire) {
        this.sujMemoire = sujMemoire;
    }

    public Etudiant getIdEtu() {
        return idEtu;
    }

    public void setIdEtu(Etudiant idEtu) {
        this.idEtu = idEtu;
    }
}
