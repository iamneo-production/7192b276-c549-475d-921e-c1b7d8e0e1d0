package repo;
import model.BankValutModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepo extends JpaRepository<BankValutModel , Long> {
}
