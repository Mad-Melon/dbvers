package esc.db.dbvers.dto;

import esc.db.dbvers.model.Nomenclature;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NomenclatureCurrentVersionDto {
    private Long id;
    private String name;
    private String pulsCode;
    private String picUrl;

    public NomenclatureCurrentVersionDto(Nomenclature nomenclature) {
        this.id = nomenclature.getId();
        this.name = nomenclature.getName();
        if (nomenclature.getNomenclatureCurrentVersion().isPresent()) { //on practice cant be FALSE coz nomenclature is created with version
            this.pulsCode = nomenclature.getNomenclatureCurrentVersion().get().getPulsCode();
            this.picUrl = nomenclature.getNomenclatureCurrentVersion().get().getPicUrl();
        }
    }
}
