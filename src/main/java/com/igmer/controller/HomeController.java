package com.igmer.controller;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import com.igmer.model.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String goHome() {
		return "home";
		
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String ShowPeliculas(Model model) {
		List<Pelicula> peliculas = getMovies();
		model.addAttribute("peliculas",peliculas);
		return "home";
		
		
	}
	
	
	
	private List<Pelicula> getMovies() {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		List<Pelicula> lista = null;
		try {
			lista = new LinkedList<>();
			Pelicula pelicula1 = new Pelicula();
			pelicula1.setId(1);
			pelicula1.setTitulo("Aquaman");;
			pelicula1.setDuracion(120);
			pelicula1.setClasificacion("Accion");
			pelicula1.setFechaEstreno(format.parse("10-12-2018"));
			
			Pelicula pelicula2 = new Pelicula();
			pelicula2.setId(2);
			pelicula2.setTitulo("Venon");;
			pelicula2.setDuracion(150);
			pelicula2.setClasificacion("Accion");
			pelicula2.setFechaEstreno(format.parse("10-10-2018"));
			 lista.add(pelicula1);
			 lista.add(pelicula2);
			 return lista;
			
			
		}catch(Exception e) {
			System.out.println("Error "+e.getMessage());
			return null;
		}
		
		
	}

}
