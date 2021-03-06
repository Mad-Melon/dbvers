package esc.db.dbvers.front;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class NewVersionRequest {
    private Long nomenclatureId;
    private Long userId;
    private String pulsCode;
    private String picUrl;
}
