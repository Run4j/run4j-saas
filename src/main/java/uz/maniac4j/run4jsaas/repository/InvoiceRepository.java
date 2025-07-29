package uz.maniac4j.run4jsaas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.maniac4j.run4jsaas.entity.Instance;
import uz.maniac4j.run4jsaas.entity.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {
}
