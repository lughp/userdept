package br.eti.lug.userdept.repositories;

import br.eti.lug.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
