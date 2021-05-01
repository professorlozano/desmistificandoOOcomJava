public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String n, int i, double s) {
        super(n, i);
        this.setSalario(s);
        //colocar o super imprimir no construtor e o this imprimir no funcionario
        this.imprimir();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Salario: " + this.salario);
    }
    
}
