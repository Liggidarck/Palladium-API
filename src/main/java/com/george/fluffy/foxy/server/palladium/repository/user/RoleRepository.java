package com.george.fluffy.foxy.server.palladium.repository.user;

import com.george.fluffy.foxy.server.palladium.model.user.ERole;
import com.george.fluffy.foxy.server.palladium.model.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByName(ERole name);

}