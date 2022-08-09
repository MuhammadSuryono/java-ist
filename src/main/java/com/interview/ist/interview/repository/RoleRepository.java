package com.interview.ist.interview.repository;

import com.interview.ist.interview.domain.dao.ERole;
import com.interview.ist.interview.domain.dao.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
