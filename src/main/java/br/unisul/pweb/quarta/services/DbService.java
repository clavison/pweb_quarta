package br.unisul.pweb.quarta.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.pweb.quarta.domain.Categoria;
import br.unisul.pweb.quarta.domain.Estado;
import br.unisul.pweb.quarta.repositories.CategoriaRepository;
import br.unisul.pweb.quarta.repositories.EstadoRepository;



@Service
public class DbService {

		@Autowired
		private CategoriaRepository catRep;
		
		@Autowired
		private EstadoRepository estRep;
		
		public void inicializaBancoDeDados() throws ParseException {
			
			Categoria cat1 = new Categoria(null, "Informática");
			Categoria cat2 = new Categoria(null, "Escritório");
			Categoria cat3 = new Categoria(null, "Cama mesa e banho");
			Categoria cat4 = new Categoria(null, "Eletrônicos");
			Categoria cat5 = new Categoria(null, "Jardinagem");
			Categoria cat6 = new Categoria(null, "Decoração");
			Categoria cat7 = new Categoria(null, "Perfumaria");
			catRep.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7));
			
			Estado e1 = new Estado(null, "Paraná");
			Estado e2 = new Estado(null, "Santa Catarina");
			Estado e3 = new Estado(null, "Rio Grande do Sul");
			estRep.saveAll(Arrays.asList(e1,e2,e3));
			
			
			
		}

}
