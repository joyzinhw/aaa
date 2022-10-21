public class Conta { 

    private int numerodaagencia = 0001;

    private int numerodaconta;
    private Double saldo; 
    private Cliente cliente;

    private static int qtdconntas = 0;

/**
     * @param cliente TODO
     */
    public Conta( Cliente cliente){
    this.Cliente = Cliente;
    qtdconntas++;
    this.numerodaconta = qtdconntas;
    this.saldo = (double) 0;
}

   public void Sacar(double valor){

    if (valor > 0  && this.getSaldo() >= 0 ){
        setSaldo(getSaldo()-valor);
        System.out.println("Saque realizado! ");
    }
    else {
        System.out.println("Saque negado!");
    } 
}

   public void Depositar(double valor){

    if (valor > 0){
       setSaldo(getSaldo() + valor);
       System.out.println(" Deposito realizado! ");
    }
    else {
       System.out.println("Deposito negado! ");
    }


} 

    public void Transferencia(Conta ContaParaDeposito, double valor){

    if (valor > 0 && this.getSaldo() > 0){
        setSaldo(getSaldo() - valor );
        ContaParaDeposito.saldo = ContaParaDeposito.getSaldo() + valor;
        System.out.println("Transferencia realizado!");
    }
    
     else{
        System.out.println("Transferencia negada!");
    } 

} 

 
    public int getNumerodaconta() {
        return numerodaconta;
    }
    
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public int getNumerodaagencia() {
        return numerodaagencia;
    }
    /**
     * @return
     */
    public Cliente getCliente() {
        return cliente;
    }



    public String getNomecliente() {
        return this.Cliente.getNome();
    }
    public LocalDate getDatacliente() {
        return this.Cliente.getDatadenas();
    }
    public String getCpfcliente() {
        return this.Cliente.getCpf();
    }
    public String getClienteEnderecocidade() {
        return this.Cliente.getCidadeEndereco();
    }
    public String getClienteEnderecoUf() {
        return this.Cliente.getUfEndereco();
    }
    public String getClienteLogradouroEndereco() {
        return this.Cliente.getLogradouroEndereco();
    }
    public int getClienteNumerodacasaEndereco(){
        return this.Cliente.getNumerodacasaEndereco();
    }
    public String getClienteBairroEndereco(){
        return this.Cliente.getBairroEndereco();
    }

    public String toString() {
        return " Nome Do Usuario: " + getNomecliente() + "\n" +
                " Saldo: " + getSaldo() + "\n" +
                " Numero da conta: " + getNumerodaconta() + "\n" +
                " Data Nascimento: " + getDatadenas() + "\n" +
                " Cpf: " + getCpfcliente() + "\n"  +
                " Endereço: " + "\n-Cidade: " +getClienteEnderecocidade()
                +"\n-Logradouro: " +getClienteLogradouroEndereco() +"\n-Número: "+getClienteNumerodacasaEndereco()
                +"\n-Bairro: "+getClienteBairroEndereco()
                + "\n-Uf: " + getClienteEnderecoUf();
    }
      
}
