package domain.model;

public class Telefoon {
    private int id;
    private String naam;
    private int prijs;
    private int productiejaar;

    public Telefoon(){

    }

    public Telefoon(String naam, int prijs, int productiejaar) {
        setNaam(naam);
        setPrijs(prijs);
        setProductiejaar(productiejaar);
    }

    public void setId(int id){
        if( id < 0) {
            throw new IllegalArgumentException("id must be positive");
        }
        this.id = id;
    }

    public int getId() { return id; }

    public String getNaam() {
        return naam;
    }

    public int getPrijs() {
        return prijs;
    }

    public int getProductiejaar() {
        return productiejaar;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    public void setProductiejaar(int productiejaar) {
        this.productiejaar = productiejaar;
    }
}

