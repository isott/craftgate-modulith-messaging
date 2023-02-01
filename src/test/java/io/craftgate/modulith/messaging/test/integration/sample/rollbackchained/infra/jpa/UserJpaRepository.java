package io.craftgate.modulith.messaging.test.integration.sample.rollbackchained.infra.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long>  {

    Optional<UserEntity> findByUsername(String username);
}
