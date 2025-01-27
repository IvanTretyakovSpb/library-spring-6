package ru.gb.springdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.springdemo.entity.ReaderEntity;

/**
 * Репозиторий для взаимодействия с хранилищем читателей в базе данных Н2
 */
@Repository
public interface ReaderRepository extends JpaRepository<ReaderEntity, Long> {

}
