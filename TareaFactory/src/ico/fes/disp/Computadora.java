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
public class Computadora implements Disp{
    private String Modelo;
    private String SO;
    private int hilos;
    private int puertos;

    public Computadora() {
    }

    public Computadora(String Modelo, String SO, int hilos, int puertos) {
        this.Modelo = Modelo;
        this.SO = SO;
        this.hilos = hilos;
        this.puertos = puertos;
    }

    public int getPuertos() {
        return puertos;
    }

    public void setPuertos(int puertos) {
        this.puertos = puertos;
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

    public int getHilos() {
        return hilos;
    }

    public void setHilos(int hilos) {
        this.hilos = hilos;
    }

    @Override
    public String toString() {
        return "Computadora{" + "Modelo=" + Modelo + ", SO=" + SO + ", hilos=" + hilos + ", puertos=" + puertos + '}';
    }
    
    
    
}
