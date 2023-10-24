package Celula;

import java.util.Random;


public class Celula{
    // variaveis
    private double rugosidade;
    private double concentraçãoDeHelio;
    private double[] coeficientesDeErro = new double[2];
    private boolean estáOcupada;
    private boolean estáDisponívelParaProspecção;

    //get e set da rugosidade
    public double getRugosidade(){
        return rugosidade;
    }
    private void inicializaRugosidade(double rugosidadeLocal){
        this.rugosidade = rugosidadeLocal;
    }
    
    //funcoes da concentracao de helio
    public double getConcentraçãoDeHelio() {
        return concentraçãoDeHelio;
    }
    private void inicializaConcentracaoDeHelio(double concentraçãoHelioLocal){
        this.concentraçãoDeHelio = concentraçãoHelioLocal;
    }
    public void esvaziaHelio(){
        this.concentraçãoDeHelio = 0;
    }

    //get e set da concentracao de helio
    public double[] getCoeficientesDeErro() {
        return coeficientesDeErro;
    }
    private void inicializaCoeficientesDeErro(){
        Random aleatorizadorDeCoeficiente = new Random();
        double maximo = 1.1;
        this.coeficientesDeErro[0] = (maximo * aleatorizadorDeCoeficiente.nextDouble())/10;
        this.coeficientesDeErro[1] = (maximo * aleatorizadorDeCoeficiente.nextDouble())/10;
    }

    
    public void mudarOcupação(boolean estáOcupada){
        this.estáOcupada = estáOcupada;
    }
    public boolean estáSendoOcupada(){
        return estáOcupada;
    }

    public void setDisponibilidade(boolean estáDisponível){
        this.estáDisponívelParaProspecção = estáDisponível;
    }
    public boolean estáDisponível(){
        return estáDisponívelParaProspecção;
    }


    public void inicializarValores(double rugosidadeLocal, double concentraçãoHelioLocal){
        inicializaRugosidade(rugosidadeLocal);
        inicializaCoeficientesDeErro();
        inicializaConcentracaoDeHelio(concentraçãoHelioLocal);
        this.estáOcupada = false;
        this.estáDisponívelParaProspecção = true;
    }
}