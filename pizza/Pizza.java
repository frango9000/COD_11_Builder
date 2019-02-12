package pizza;
//@author fsancheztemprano

public class Pizza {
    private float grHarina;
    private float mlAgua;
    private float grSal;
    private float mlAceite;
    private String tipoAceite;
    private float grTomate;
    private float grQueso;
    private String tipoQueso;
    private float grPinha;


    public Pizza(float grHarina, float mlAgua, float grSal, float mlAceite, String tipoAceite, float grTomate, float grQueso, String tipoQueso, float grPinha) {
        this.grHarina = grHarina;
        this.mlAgua = mlAgua;
        this.grSal = grSal;
        this.mlAceite = mlAceite;
        this.tipoAceite = tipoAceite;
        this.grTomate = grTomate;
        this.grQueso = grQueso;
        this.tipoQueso = tipoQueso;
        this.grPinha = grPinha;
    }

    @Override
    public String toString() {
        return "Pizza{\n"
                + "grHarina=" + grHarina
                + ",\n mlAgua=" + mlAgua 
                + ",\n grSal=" + grSal 
                + ",\n mlAceite=" + mlAceite 
                + ",\n tipoAceite=" + ( ( tipoAceite != null ) ? "" : tipoAceite )
                + ",\n grTomate=" + grTomate 
                + ",\n grQueso=" + grQueso 
                + ",\n tipoQueso=" + ( ( tipoQueso != null ) ? "" : tipoQueso )
                + ",\n grPinha=" + grPinha 
                + "\n}";
    }
    
    


}
