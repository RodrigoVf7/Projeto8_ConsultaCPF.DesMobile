package br.edu.fateczl.localizarcpf;
import java.io.Serializable;

/*
 *@author: RODRIGO VINICIUS FERRAZ DA SILVA
 *@RA: 1110482313043
 */

public class Pessoa implements Serializable {
    private String cpf;
    private String nome;

    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getRegiao() {
        // Extrair o nono dígito do CPF para determinar a região
        char regiaoChar = cpf.charAt(8);
        switch (regiaoChar) {
            case '1': return "Distrito Federal, Goiás, Mato Grosso, Mato Grosso do Sul e Tocantins";
            case '2': return "Pará, Amazonas, Acre, Amapá, Rondônia e Roraima";
            case '3': return "Ceará, Maranhão e Piauí";
            case '4': return "Pernambuco, Rio Grande do Norte, Paraíba e Alagoas";
            case '5': return "Bahia e Sergipe";
            case '6': return "Minas Gerais";
            case '7': return "Rio de Janeiro e Espírito Santo";
            case '8': return "São Paulo";
            case '9': return "Paraná e Santa Catarina";
            case '0': return "Rio Grande do Sul";
            default: return "Região desconhecida";
        }
    }
}

