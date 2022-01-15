package esc.db.dbvers.repository;

import esc.db.dbvers.model.Nomenclature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NomRepo extends JpaRepository<Nomenclature, Long> {
}
