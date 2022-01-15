package esc.db.dbvers.repository;

import esc.db.dbvers.dto.NomenclatureVersionDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@AllArgsConstructor
public class NomVersRepo {
    private final EntityManager entityManager;

    @Transactional
    public void insertNew(NomenclatureVersionDto dto) {
        entityManager.createNativeQuery("INSERT INTO nomenclature_versions (NOMENCLATURE_ID, USER_ID, CREATION_DATE, PULS_CODE, PIC_URL, CURRENT) VALUES (?,?,?,?,?,?)")
                .setParameter(1, dto.getNomenclatureId())
                .setParameter(2, dto.getUserId())
                .setParameter(3, dto.getCreationDate())
                .setParameter(4, dto.getPulsCode())
                .setParameter(5, dto.getPicUrl())
                .setParameter(6, dto.isCurrent())
                .executeUpdate();
    }
}
