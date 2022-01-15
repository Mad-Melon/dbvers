package esc.db.dbvers.dto;

import esc.db.dbvers.front.NewVersionRequest;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class NomenclatureVersionDto {
    private Long userId;
    private Long nomenclatureId;
    private LocalDateTime creationDate;
    private String pulsCode;
    private String picUrl;
    private boolean current;

    public NomenclatureVersionDto(NewVersionRequest request) {
        this.userId = request.getUserId();
        this.nomenclatureId = request.getNomenclatureId();
        this.creationDate = LocalDateTime.now();
        this.pulsCode = request.getPulsCode();
        this.picUrl = request.getPicUrl();
        this.current = true;
    }
}
