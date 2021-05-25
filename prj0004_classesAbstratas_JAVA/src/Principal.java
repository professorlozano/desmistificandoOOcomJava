public class Principal {
    public static void main(String[] args) {
        //Corrente cc = new Corrente("7800","11713-1",1000.00);
        //cc.depositar(500);
        //cc.sacar(1501);
        //System.out.println(cc);
        
        Poupanca cpp = new Poupanca("7800","11713-1",15);
        cpp.depositar(500);
        cpp.sacar(501);
        System.out.println(cpp);
    }
}
