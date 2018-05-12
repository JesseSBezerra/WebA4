package br.com.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.modelo.Servico;

@Path("/serv")
public class ServicoService {
		@GET
		@Path("/servico")
		@Produces(MediaType.APPLICATION_JSON)
		public Servico getServico() {
			Servico servico = new Servico();
			servico.setCdServico(1L);
			servico.setDsServico("Desenvolvimento de Software");
			servico.setVlServico(35D);
			return servico;		
		}
	}
	
	
