package esc.db.dbvers.repository;

import esc.db.dbvers.model.Nomenclature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NomenclatureRepository extends JpaRepository<Nomenclature, Long> {
}
