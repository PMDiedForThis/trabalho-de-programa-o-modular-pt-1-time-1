package Terreno;

import Celula.Celula;

public class Terreno {
    private int alturaDoTerreno;
    private int larguraDoTerreno;
    private Celula[][] celulasDoTerreno;

    public int getAltura(){
        return alturaDoTerreno;
    }
    private void setAltura(int altura){
        alturaDoTerreno = altura;
    }

    public int getLargura(){
        return larguraDoTerreno;
    }
    private void setLargura(int largura){
        larguraDoTerreno = largura;
    }

    private void setCelulasTerreno(Celula[][] celulas){
        celulasDoTerreno = celulas;
    }
    public Celula getCelulaAtual(int coordenadaX, int coordenadaY){
        return celulasDoTerreno[coordenadaX][coordenadaY];
    }
    
    public void marcarProspecção(int coordenadaX, int coordenadaY, boolean disponibilidade){
        celulasDoTerreno[coordenadaX][coordenadaY].setDisponibilidade(disponibilidade);
    }

    public Terreno(int alturaDoTerreno, int larguraDoTerreno, Celula[][] celulasdoTerreno){
        setAltura(alturaDoTerreno);
        setLargura(larguraDoTerreno);
        setCelulasTerreno(celulasdoTerreno);
    }
}
