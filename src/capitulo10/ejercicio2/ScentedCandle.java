package capitulo10.ejercicio2;

public class ScentedCandle extends Candle{
    private String scent;
    private Integer pricexinch;
    
    public ScentedCandle() {
        this.pricexinch=2;
    }

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }
    
    @Override
    public void setHeight(Double height){
        super.setHeight(height);
    }
}
