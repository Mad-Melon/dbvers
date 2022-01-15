package esc.db.dbvers.dto;

import esc.db.dbvers.model.Nomenclature;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NomenclatureDto {
    private Long id;
    private String name;
    private String pulsCode;
    private String picUrl;

    public NomenclatureDto(Nomenclature nomenclature) {
        this.id = nomenclature.getId();
        this.name = nomenclature.getName();
        this.pulsCode = nomenclature.getVersion().get(0).getPulsCode();
        this.picUrl = nomenclature.getVersion().get(0).getPicUrl();
    }
}
