package esc.db.dbvers.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "nomenclature_versions", schema = "public")
public class NomenclatureVersion extends VersionalModel {

    @Column(name = "puls_code")
    private String pulsCode;
    @Column(name = "pic_url")
    private String picUrl;
    @Column(name = "current")
    private boolean current;
}
