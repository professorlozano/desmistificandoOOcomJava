public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.setSalario(salario);
    }

    public Funcionario(String nome, int idade) {
        super(nome, idade);
    }
    
    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularReajuste(double porcentagem){
        return this.salario + (this.salario * porcentagem / 100);
    }
    
    public double calcularReajuste(double porcentagem, double bonus){
        return this.salario + (this.salario * porcentagem / 100) + bonus;
    }
    
    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Salario: " + this.getSalario());
    }
}
