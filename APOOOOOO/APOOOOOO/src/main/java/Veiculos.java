
public class Veiculos {
    private String placa = "";
    private String cor = "";
    private String combustivel = "";
    private float preco = 0;
    private String renavam = "";
 
    public Veiculos() {
        this.placa = "";
        this.cor = "";
        this.combustivel = "";
        this.preco = 0;
        this.renavam = "";
    }

    public Veiculos(String placa, String cor, String combustivel, float preco,String renavam) {
        this.placa = placa;
        this.cor = cor;
        this.combustivel = combustivel;
        this.preco = preco;
    
    }
    
    public String getPlaca() {
        return placa;
    }
    public String getCor() {
        return cor;
    }
    public String getCombustivel() {
        return combustivel;
    }
    public float getPreco() {
        return preco;
    }
    public String getRenavam() {
        return renavam;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }
 
}

