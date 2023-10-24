package InputTerreno;

public class InputTerreno {
    private int altura;
    private int largura;
    private double[][] matrizRugosidade;
    private double[][] matrizConcentraçãoHélio;

    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }


    public int getLargura() {
        return largura;
    }
    public void setLargura(int largura) {
        this.largura = largura;
    }


    public double[][] getMatrizRugosidade() {
        return matrizRugosidade;
    }
    public void setMatrizRugosidade(double[][] matrizDeRugosidades) {
        this.matrizRugosidade = matrizDeRugosidades;
    }

    public double[][] getMatrizConcentraçãoHélio() {
        return matrizConcentraçãoHélio;
    }
    public void setMatrizConcentraçãoHélio(double[][] matrizDeHelios) {
        this.matrizConcentraçãoHélio = matrizDeHelios;
    }
}
