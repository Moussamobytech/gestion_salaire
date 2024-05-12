package com.heure.Tp_classe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeController {
	@Autowired
	private EmployerRepository employerRepository ;
	
	@PostMapping("/heure")
	Heure newHeure(@RequestBody Heure newHeure) {
		return employerRepository.save(newHeure);
	}
	@GetMapping("/heures")
	List<Heure> getAllHeure(){
		return employerRepository.findAll();
	}
	
	@DeleteMapping("/heuress/{id}")
	String deleteHeure(@PathVariable Long id) {
		
		employerRepository.deleteById(id);
		return "Heure avec id "+id+"a été suprimer avec succes";
	}
	@PutMapping("/heuress/{id}")
	Heure updateHeure(@RequestBody Heure newHeure ,@PathVariable Long id) {
		return employerRepository.findById(id)
				.map(heure ->{
					heure.setNom(newHeure.getNom());
					heure.setPrenom(newHeure.getPrenom());
					return employerRepository.save(heure);
				}).orElse(null); 
	}
}
 