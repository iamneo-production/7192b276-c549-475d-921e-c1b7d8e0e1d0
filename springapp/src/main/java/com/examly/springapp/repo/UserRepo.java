package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.UserModel;

@Repository
public interface UserRepo extends JpaRepository<UserModel, String>{

}