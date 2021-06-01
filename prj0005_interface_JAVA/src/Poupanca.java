public class Poupanca extends Conta implements Regras{
    private int aniversario;

    public Poupanca(String a, String c, int an) {
        super(a, c);
        this.setAniversario(an);
    }

    
    public int getAniversario() {
        return aniversario;
    }

    public void setAniversario(int aniversario) {
        this.aniversario = aniversario;
    }
    
    @Override
    public void sacar(double valor){
        if(valor <= super.getSaldo())
            super.setSaldo(super.getSaldo() - valor);
        else
            System.out.println("Saldo insuficiente");
    }
    
    @Override
    public String toString(){
        String texto = super.toString();
        texto += "\nAniversario: "+ this.getAniversario();
        return texto;
    }
    
}
