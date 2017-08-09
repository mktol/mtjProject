package maks.sample.repository;

import maks.sample.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Account repository see {@link Account}
 */
@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
    Account findByUsername(String username);
}
