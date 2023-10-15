package edu.iphone;

import edu.iphone.funcionalidades.AparelhoTelefonico;
import edu.iphone.funcionalidades.NavegadorInternet;
import edu.iphone.funcionalidades.RepodutorMusicial;

public class Iphone implements RepodutorMusicial, AparelhoTelefonico, NavegadorInternet {
    //Atribustos Reprodutor de Música
    private boolean tocar = false;
    private boolean pausar = false;

    //Atributos Aparelho Telefônico
    private boolean ligar = false;
    private boolean atender = false;

    //Atributos Navegador de Internet
    
    
    
    public boolean isTocar() {
        return tocar;
    }

    public void setTocar(boolean tocar) {
        this.tocar = tocar;
    }

    public boolean isPausar() {
        return pausar;
    }

    public void setPausar(boolean pausar) {
        this.pausar = pausar;
    }
    
    public boolean isLigar() {
        return ligar;
    }

    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }

    public boolean isAtender() {
        return atender;
    }

    public void setAtender(boolean atender) {
        this.atender = atender;
    }


    @Override
    public void pausarMusica() {
        if (isPausar() == false) {
            setTocar(false);
            System.out.println("Pausando música");
        }else{
            System.out.println("música pausada");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        if (isTocar() == false) {
            setTocar(true);
            System.out.println("tocando música seleciona: " + musica);
        }else{
            System.out.println("tocando música seleciona: " + musica);
        }
    }

    @Override
    public void tocarMusica() {
        if (isTocar() == false) {
            setTocar(true);
            System.out.println("tocando música"); 
        }else {
            System.out.println("tocando música"); 
        }
    }

    @Override
    public void atenderLigação() {
        if (isAtender() == true) {
            System.out.println("Atendo a ligação");
        }
    }
    
    @Override
    public void iniciarCorreioVoz() {
        if(isLigar() == true) {
            fazerLigacao();
            System.out.println("Chamando...");
            System.out.println("Chamando...");
            System.out.println("Chamando...");
            System.out.println("Chamando...");
            setLigar(false);
            System.out.println("Ligação não atendida");
            System.out.println("Iniciando corrêio de voz...");
        }
    }

    @Override
    public void fazerLigacao() {
        if (isLigar() == true) {
            System.out.println("Ligando...");
        }
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adiconada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }

    @Override
    public void exibirPagina() {
        System.out.println("exibindo página...");
    }


}
