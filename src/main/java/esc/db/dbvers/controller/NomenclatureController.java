package esc.db.dbvers.controller;

import esc.db.dbvers.dto.NomenclatureVersionDto;
import esc.db.dbvers.front.NewVersionRequest;
import esc.db.dbvers.repository.NomenclatureVersionRepository;
import esc.db.dbvers.service.NomenclatureService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class NomenclatureController {

    NomenclatureVersionRepository nomVersRepo;
    NomenclatureService nomServ;

    @PostMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateVersion(@RequestBody NewVersionRequest request){
        nomVersRepo.insertNew(new NomenclatureVersionDto(request));
    }

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        return  new ResponseEntity<>(nomServ.getNom(id), HttpStatus.OK);
    }
}
