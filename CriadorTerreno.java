
package CriadorTerreno;

import Celula.Celula;
import LeitorArqTerreno.LeitorArqTerreno;
import Terreno.Terreno;
import InputTerreno.InputTerreno;
import java.io.File;

public class CriadorTerreno{

    public Terreno criaTerreno(File ArquivoInput){
        Terreno terreno;
        Celula[][] celulasDoTerreno;
        LeitorArqTerreno leitor = new LeitorArqTerreno();
        InputTerreno informaçõesTerreno = leitor.lerArqInput(ArquivoInput);
        int alturaDoTerreno = informaçõesTerreno.getAltura();
        int larguraDoTerreno = informaçõesTerreno.getLargura();
        celulasDoTerreno = new Celula[alturaDoTerreno][larguraDoTerreno];
        double[][] matrizConcentraçãoHélio = informaçõesTerreno.getMatrizConcentraçãoHélio();
        double[][] matrizRugosidade = informaçõesTerreno.getMatrizRugosidade();
        for ( int i = 0; i < alturaDoTerreno; i++){
            for ( int j = 0; j < larguraDoTerreno; j++){
                celulasDoTerreno[i][j] = new Celula();
                celulasDoTerreno[i][j].inicializarValores(matrizRugosidade[i][j], matrizConcentraçãoHélio[i][j]);
            }
        }
        terreno = new Terreno(alturaDoTerreno, larguraDoTerreno, celulasDoTerreno);
        return terreno;
    }
}
