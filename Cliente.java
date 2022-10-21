package banco;

import java.time.LocalDate;

public class Cliente {
    
    private String nome;
    private final String cpf;
    private final LocalDate datadenas;
    /**
     *
     */
    private Endereco endereco; 
 
    
    public Cliente(String nome, String cpf, LocalDate datadenas, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.datadenas = datadenas;
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public LocalDate getDatadenas() {
        return datadenas;
    }
    
    
    /**
     * @return
     */
    public Endereco getEndereco() {
        return endereco;
    }
    public String getCidadeEndereco(){
        return this.endereco.getCidade();
    }
    public String getUfEndereco(){
        return this.endereco.getUf();
    }
    public String getLogradouroEndereco (){
        return this.endereco.getLogradouro();
    }
    public int getNumeroEndereco(){
        return this.endereco.getNumerodacasa();
    }
    public String getBairroEndereco(){
        return this.endereco.getBairro();
    }
    

}
