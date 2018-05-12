package br.com.modelo;

public class Servico {
	
	private Long cdServico;
	private String dsServico;
	private Double vlServico;
	
	public Long getCdServico() {
		return cdServico;
	}
	public void setCdServico(Long cdServico) {
		this.cdServico = cdServico;
	}
	public String getDsServico() {
		return dsServico;
	}
	public void setDsServico(String dsServico) {
		this.dsServico = dsServico;
	}
	public Double getVlServico() {
		return vlServico;
	}
	public void setVlServico(Double vlServico) {
		this.vlServico = vlServico;
	}
	
	public Servico() {
		// TODO Auto-generated constructor stub
	}
	public Servico(Long cdServico, String dsServico, Double vlServico) {
		super();
		this.cdServico = cdServico;
		this.dsServico = dsServico;
		this.vlServico = vlServico;
	}
	
	

}
