package pl.tuminski.crm.salesman;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesmanRepository extends JpaRepository<Salesman, Long> {

    Salesman findSalesmanById(Long id);

    @Query("SELECT SUM(s.value) FROM BusinessOpportunity s WHERE s.salesman.id = ?1")
    int sumValueWhereId(Long id);
}
