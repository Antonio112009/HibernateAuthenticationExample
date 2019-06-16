/*
 * Developed by Antonio112009 on 16/06/19 18:16
 * Last Modified 15/06/19 18:04
 * Copyright (c) 2019. All rights reserved
 *
 */

package startApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import startApp.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
