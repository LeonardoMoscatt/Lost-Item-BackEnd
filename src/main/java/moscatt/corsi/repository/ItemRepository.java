package moscatt.corsi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import moscatt.corsi.entities.Lostitem;

@Repository
public interface ItemRepository extends JpaRepository<Lostitem, Long> {
	 List<Lostitem> findByFound(Boolean found);
}