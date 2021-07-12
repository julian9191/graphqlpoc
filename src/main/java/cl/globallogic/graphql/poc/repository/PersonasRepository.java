package cl.globallogic.graphql.poc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cl.globallogic.graphql.poc.model.Persona;

@Repository
public interface PersonasRepository extends JpaRepository<Persona, Integer> {

	@Query("SELECT p FROM Persona p WHERE p.id IN (:ids)")
	List<Persona> findByIds(@Param("ids") List<Integer> ids); 
}