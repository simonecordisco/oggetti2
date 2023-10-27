//Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata,
// targa, marca e modello.
//Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
//Nel main dichiarare un oggetto di tipo Auto.
public class auto {
    private String cilindrata;
    private String targa;


    private String marca;

    private String modello;

    //costruttore
    public auto(String cilindrata, String targa, String marca, String modello){
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
    }
//getters
    private String getTarga(){

        return targa;
    }

    @Override
    public String toString() {
        return "auto{" +
                "cilindrata='" + cilindrata + '\''+
                "targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }

}


