public class Conta_Corrente extends Conta{
    private double limite;

    public Conta_Corrente(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    public void setLimite(double limite) {
        limite = limite;
    }

    public double getLimite() {
        return limite;
    }
    public double consultaSaldoTotal(){
        return getSaldo() + getLimite();
    }
}
