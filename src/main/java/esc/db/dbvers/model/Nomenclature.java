package esc.db.dbvers.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "nomenclature", schema = "public")
public class Nomenclature {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name="nomenclature_id")
    @Where(clause = "current = true")
    private List<NomenclatureVersion> version;
}
