package com.example.Model;
//dependcylerı eklıcen

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by memojja on 17.07.2016.
 */

@Entity
@Table(name = "fatura")
public class Fatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    protected Long id;
    @Column(name = "saticiUnvan",nullable = false)
    private String saticiUnvan;
    @Column(name = "aliciUnvan",nullable = false)
    private String aliciUnvan;
    @Column(name = "tarih",nullable = false)
    private String tarih;
    @Column(name = "tutar",nullable = false)
    private int tutar;

    public Fatura(){}

    public Fatura(String saticiUnvan, String aliciUnvan, String tarih, int tutar) {
        this.saticiUnvan = saticiUnvan;
        this.aliciUnvan = aliciUnvan;
        this.tarih = tarih;
        this.tutar = tutar;
    }

    public String getSaticiUnvan() {
        return saticiUnvan;
    }

    public void setSaticiUnvan(String saticiUnvan) {
        this.saticiUnvan = saticiUnvan;
    }

    public String getAliciUnvan() {
        return aliciUnvan;
    }

    public void setAliciUnvan(String aliciUnvan) {
        this.aliciUnvan = aliciUnvan;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public int getTutar() {
        return tutar;
    }

    public void setTutar(int tutar) {
        this.tutar = tutar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsim() {
        return saticiUnvan;
    }

    public void setIsim(String isim) {
        this.saticiUnvan = isim;
    }
}