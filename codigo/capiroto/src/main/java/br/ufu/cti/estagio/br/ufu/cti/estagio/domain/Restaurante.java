package br.ufu.cti.estagio.br.ufu.cti.estagio.domain;

import java.util.List;

import javax.persistence.*;

/**
 * Created by diego on 05/04/16.
 */

@Entity
@Table(name = "RESTAURANTE")
public class Restaurante {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idRestaurante;
    
    private String nomeRestaurante;
    private String enderecoRestaurante;
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy = "restaurante")
    private List<TipoRefeicao> tiposRefeicoes ;
    
  

    public List<TipoRefeicao> getTiposRefeicoes() {
		return tiposRefeicoes;
	}

	public void setTiposRefeicoes(List<TipoRefeicao> tiposRefeicoes) {
		this.tiposRefeicoes = tiposRefeicoes;
	}
	
	public Restaurante(){
		
	}
	public Restaurante(String nomeRestaurante, String enderecoRestaurante) {
        this.enderecoRestaurante = enderecoRestaurante;
        this.nomeRestaurante = nomeRestaurante;
    }

    public String getEnderecoRestaurante() {
        return enderecoRestaurante;
    }

    public void setEnderecoRestaurante(String enderecoRestaurante) {
        this.enderecoRestaurante = enderecoRestaurante;
    }

    public Integer getIdRestaurante() {
        return idRestaurante;
    }

    public void setIdRestaurante(Integer idRestaurante) {
        this.idRestaurante = idRestaurante;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }


    @Override
    public String toString() {
        return "Restaurante{" +
                "enderecoRestaurante='" + enderecoRestaurante + '\'' +
                ", idRestaurante=" + idRestaurante +
                ", nomeRestaurante='" + nomeRestaurante + '\'' +
                '}';
    }
}
