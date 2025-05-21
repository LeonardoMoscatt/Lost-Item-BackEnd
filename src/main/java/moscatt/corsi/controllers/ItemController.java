package moscatt.corsi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import moscatt.corsi.entities.Lostitem;
import moscatt.corsi.repository.ItemRepository;

@RestController
@RequestMapping("/lostitem")
public class ItemController {
	@Autowired
    private ItemRepository repository;

	@GetMapping
    public List<Lostitem> getAll() {
        return repository.findAll();
    }
	
	 @GetMapping("/found")
	    public List<Lostitem> getAvailable() {
	        return repository.findByFound(true);
	    }
	    
	    @GetMapping("/notfound")
	    public List<Lostitem> getUnavailable() {
	        return repository.findByFound(false);
	    }
	    
	    @PostMapping
	    public Lostitem create(@RequestBody Lostitem lostitem) {
	        return repository.save(lostitem);
	    }
	    
	    @PutMapping("/{id}")
	    public ResponseEntity<Lostitem> update(@PathVariable Long id, @RequestBody Lostitem lostitem) {
	        return repository.findById(id).map(a -> {
	            a.setFound(lostitem.getFound());
	            a.setFoundDate(lostitem.getFoundDate());
	            a.setFoundLocation(lostitem.getFoundLocation());
	            return ResponseEntity.ok(repository.save(a));
	        }).orElseGet(() -> ResponseEntity.notFound().build());
	    }
	    
	    @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id) {
	        repository.deleteById(id);
	    }
}
