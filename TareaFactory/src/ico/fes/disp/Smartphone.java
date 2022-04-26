/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.disp;

import ico.fes.disp.factory.Disp;

/**
 *
 * @author fabia
 */
public class Smartphone implements Disp{
    private String Modelo;
    private String SO;
    private boolean Wifi;
    private boolean Bl;

    public Smartphone() {
    }

    public Smartphone(String Modelo, String SO, boolean Wifi, boolean Bl) {
        this.Modelo = Modelo;
        this.SO = SO;
        this.Wifi = Wifi;
        this.Bl = Bl;
    }

    public boolean isBl() {
        return Bl;
    }

    public void setBl(boolean Bl) {
        this.Bl = Bl;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public boolean isWifi() {
        return Wifi;
    }

    public void setWifi(boolean Wifi) {
        this.Wifi = Wifi;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "Modelo=" + Modelo + ", SO=" + SO + ", Wifi=" + Wifi + ", Bl=" + Bl + '}';
    }
    
    
    
}
