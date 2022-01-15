package esc.db.dbvers.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public abstract class VersionalModel extends PersistentModel {
    @Column(name = "created")
    private LocalDateTime created;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private User user;
}
