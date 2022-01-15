package esc.db.dbvers.service;

import esc.db.dbvers.dto.NomenclatureCurrentVersionDto;
import esc.db.dbvers.repository.NomenclatureRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NomenclatureService {
    private final NomenclatureRepository nomRepo;

    public NomenclatureCurrentVersionDto getNom(Long id) {
        return new NomenclatureCurrentVersionDto(nomRepo.getById(id));
    }
}
