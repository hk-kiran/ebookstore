package io.kiranhk.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.kiranhk.library.models.LibraryUser;

public interface UserRepository extends JpaRepository<LibraryUser, Long> {
}
