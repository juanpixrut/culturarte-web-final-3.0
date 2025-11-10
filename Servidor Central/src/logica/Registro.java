/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Juanpi
 */
@Entity
public class Registro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Basic
    private String ip;
    private String url;
    private String browser;
    private String so;

    @Temporal(TemporalType.DATE)
    private Date fecha = Date.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault()).toInstant());

    public Registro() {

    }

    public Registro(String ip, String url, String browser, String so) {
        this.ip = ip;
        this.url = url;
        this.browser = browser;
        this.so = so;
    }

    public int getId() {
        return this.id;
    }

    public String getIp() {
        return this.ip;
    }

    public String getUrl() {
        return this.url;
    }

    public String getBrowser() {
        return this.browser;
    }

    public String getSo() {
        return this.so;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public Date getFecha(){
    return this.fecha;
    }

}
