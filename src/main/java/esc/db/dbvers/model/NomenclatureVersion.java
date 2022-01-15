package esc.db.dbvers.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@Table(name = "nomenclature_versions", schema = "public")
public class NomenclatureVersion implements Serializable {
    @Id
    @Generated(GenerationTime.INSERT)
    @Column(name = "id")
    private Long id;
    @Column(name = "nomenclature_id")
    private Long nomenclatureId;
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "creation_date")
    private LocalDateTime creationDate;
    @Column(name = "puls_code")
    private String pulsCode;
    @Column(name = "pic_url")
    private String picUrl;
    @Column(name = "current")
    private boolean current;
}
