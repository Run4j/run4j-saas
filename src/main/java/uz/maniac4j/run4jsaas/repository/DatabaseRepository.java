package uz.maniac4j.run4jsaas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.maniac4j.run4jsaas.entity.Database;

public interface DatabaseRepository extends JpaRepository<Database,Integer> {
}
