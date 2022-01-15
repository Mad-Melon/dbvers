package esc.db.dbvers.controller;

import esc.db.dbvers.dto.NomenclatureDto;
import esc.db.dbvers.dto.NomenclatureVersionDto;
import esc.db.dbvers.front.NomRequest;
import esc.db.dbvers.repository.NomVersRepo;
import esc.db.dbvers.service.NomServ;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class NomenclatureController {

    NomVersRepo nomVersRepo;
    NomServ nomServ;

    @PostMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateVersion(@RequestBody NomRequest request){
        nomVersRepo.insertNew(new NomenclatureVersionDto(request));
    }

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        return  new ResponseEntity<>(new NomenclatureDto(nomServ.getNom(id)), HttpStatus.OK);
    }
}
