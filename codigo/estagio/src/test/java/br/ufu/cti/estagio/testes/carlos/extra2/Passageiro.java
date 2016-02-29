package br.ufu.cti.estagio.testes.carlos.extra2;

import java.util.ArrayList;

public class Passageiro {

	private String nome;
	private long cpf;
	private ArrayList<Voo> listaVoos = new ArrayList<Voo>();
	
	public void setNome(String nome) {
		
		this.nome = nome;
	}
	
	public String getNome() {
		
		return nome;
	}
	
	public void setCpf(long cpf) {
		
		this.cpf = cpf;
	}
	
	public long getCpf() {
		
		return cpf;
	}
	
	public void setListaVoos(ArrayList<Voo> listaVoos) {
		
		this.listaVoos = listaVoos;
	}
	
	public ArrayList<Voo> getListaVoos() {
		
		return listaVoos;
	}
	
	public void comprarVoo(Voo num, EmpresaAerea emp, double valor, Passageiro pas) {
		
		if(emp.getListaVoos().contains(num) == true) {
			
			if(this.listaVoos.size() < 150) {
				
				if(valor == 300) {
					
					num.getListaPassageiros().add(pas);
					getListaVoos().add(num);
					String info = "Compra da passagem do Voo " + num + ".";
					FluxoDeCaixa receita = new FluxoDeCaixa(info, valor);
					emp.getCaixa().getListaReceitas().add(receita);
				}
				
				else {
					
					System.out.println("Valor de pagamento (" + valor + "R$) não confere com o preço da passagem (300R$):");
					return;
				}
			}
			
			else {
				
				System.out.println("Não há mais vagas para passageiros.");
				return;
			}
		}
		
		else {
			
			System.out.println("Voo não existe.");
			return;
		}
	}
}
