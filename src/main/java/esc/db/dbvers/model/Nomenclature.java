package esc.db.dbvers.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Entity
@Getter
@Setter
@Table(name = "nomenclature", schema = "public")
public class Nomenclature extends PersistantModel {

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name="nomenclature_id")
    private List<NomenclatureVersion> version;

    @Transient
    public Optional<NomenclatureVersion> getNomenclatureCurrentVersion(){
        return version.stream().filter(NomenclatureVersion::isCurrent).findFirst();
    }
}
