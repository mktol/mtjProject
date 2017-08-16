package maks.sample.repository;

import maks.sample.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByFirstName(String username);
    User findByEmail(String email);
}
