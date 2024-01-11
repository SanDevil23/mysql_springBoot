package io.aiven.spring.mysql.mysql_springBoot;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

}
