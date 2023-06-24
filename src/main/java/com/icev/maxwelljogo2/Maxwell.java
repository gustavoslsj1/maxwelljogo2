/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.icev.maxwelljogo2;

/**
 *
 * @author ezpac
 */
public class Maxwell {
    //aqui, declaramos as variáveis base do maxwell.
    private String posAtual;
    public int limiarJoia;
    private int poderJoia;
    private boolean isMorto;
    
    private void checarJoia(){
        if (poderJoia<0){
            poderJoia = 0;
        }
    }

    public String getPosAtual() {
        return posAtual;
    }

    public void setPosAtual(String posAtual) {
        this.posAtual = posAtual;
    }

    public int getLimiarJoia() {
        return limiarJoia;
    }

    public void setLimiarJoia(int limiarJoia) {
        this.limiarJoia = limiarJoia;
    }

    public int getPoderJoia() {
        return poderJoia;
    }

    public void setPoderJoia(int poderJoia) {
        this.poderJoia = poderJoia;
    }

    public boolean isIsMorto() {
        return isMorto;
    }

    public void setIsMorto(boolean isMorto) {
        this.isMorto = isMorto;
    }
    
    
}
