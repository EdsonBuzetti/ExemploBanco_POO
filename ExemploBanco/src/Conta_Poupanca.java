public class Conta_Poupanca extends Conta{
    private double Rendimento;

    public Conta_Poupanca(int numero, double saldo, double rendimento) {
        super(numero, saldo);
        this.Rendimento = rendimento;
    }

    public double getRendimento() {
        return Rendimento;
    }

    public void setRendimento(double rendimento) {
        Rendimento = rendimento;
    }
    public void atualizaRendimento(){
        double atual;
        atual = getSaldo()+(getSaldo()*(this.Rendimento/100));
        setSaldo(atual);
    }
}

