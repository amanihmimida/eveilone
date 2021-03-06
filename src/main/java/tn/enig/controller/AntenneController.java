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

import tn.enig.model.Antenne;
import tn.enig.service.AntenneService;


@RestController
@RequestMapping("/api/antenne")
public class AntenneController {
	@Autowired
	private AntenneService antenneService;
	
	@GetMapping(path="/")
	public List<Antenne> listantenne(){
		return antenneService.listAntenne();
		}
	@GetMapping(path="/{id}")
	public Optional<Antenne> getAntenneById(@PathVariable(value="id") int id) {
		return antenneService.getAntenneById(id);
	}
	
	@GetMapping(path="/by-num/{num}")
	public Antenne getAntenneByNum(@PathVariable(value="num") String num) throws Exception {
		return antenneService.getAntenneByNum(num);
	}
	
	@PostMapping(path="/")
	public void addAntenne(@RequestBody Antenne a) {
		antenneService.save(a);
	}
	@PutMapping(path="/")
	public void editAntenne(Antenne a) {
		antenneService.save(a);
	}
    
	@DeleteMapping(path="/{id}")
	public void deleteById(@PathVariable(value="id") int id) {
		antenneService.deletAntenneById(id);
	}


}
