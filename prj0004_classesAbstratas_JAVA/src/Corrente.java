public class Corrente extends Conta{
    private double limite;

    public Corrente(String a, String c, double l) {
        super(a, c);
        this.setLimite(l);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
    public void sacar(double valor){
        if(valor <= (super.getSaldo() + this.limite))
            super.setSaldo(super.getSaldo() - valor);
        else
            System.out.println("Saldo e limite insuficientes");
    }
    
    @Override
    public String toString(){
        String texto = super.toString();
        texto += "\nLimite: "+ this.getLimite();
        return texto;
    }
}
