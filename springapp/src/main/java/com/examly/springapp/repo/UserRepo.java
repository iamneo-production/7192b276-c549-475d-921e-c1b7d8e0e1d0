package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.*;

@Repository
public interface UserRepo extends JpaRepository<UserModel, Long>{

    public  UserModel findByEmailId(String emailId);
    public  UserModel findByEmailIdandAndPassword(String emailId , String password);

}


