package com.jose;

public class Empressa {
    private String razaoSocial;
    private String nomeFantasia;
    private CNPJ cnpj;
    
    public Empressa(String razaoSocial, String nomeFantasia, CNPJ cnpj) {
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public CNPJ getCnpj() {
        return cnpj;
    }

    public void setCnpj(CNPJ cnpj) {
        this.cnpj = cnpj;
    }

    public void exibirEmpresa() {
        System.out.printf("%s (%s). CNPJ: %d [%s]\n", getRazaoSocial(), getNomeFantasia(), getCnpj().getNumero(), getCnpj().getSituacaoCadastral());
    }
}
