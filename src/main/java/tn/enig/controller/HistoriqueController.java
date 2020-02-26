package tn.enig.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import tn.enig.model.Historique;

import tn.enig.service.HistoriqueService;

@RestController
@RequestMapping("/api/historique")
public class HistoriqueController {
	@Autowired
	private HistoriqueService historiqueService;
	
	@GetMapping(path="/")
	public List<Historique> listantenne(){
		return historiqueService.listHistorique();
		}
	@GetMapping(path="/{id}")
	public Optional<Historique> getAntenneById(@PathVariable(value="id") int id) {
		return historiqueService.getHistoriqueById(id);
	}
	
	@PostMapping(path="/")
	public void addHistorique(@RequestBody Historique u) {
		historiqueService.save(u);
	}
	@PutMapping(path="/")
	public void editHistorique(Historique u) {
		historiqueService.save(u);
	}
    
	@DeleteMapping(path="/{id}")
	public void deleteById(@PathVariable(value="id") int id) {
		historiqueService.deleteHisoriqueById(id);;
	}
}
