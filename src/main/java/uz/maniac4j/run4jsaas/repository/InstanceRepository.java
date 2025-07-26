package uz.maniac4j.run4jsaas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.maniac4j.run4jsaas.entity.Database;
import uz.maniac4j.run4jsaas.entity.Instance;

public interface InstanceRepository extends JpaRepository<Instance,Integer> {
}
