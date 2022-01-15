package esc.db.dbvers.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public abstract class VersionalModel extends PersistantModel{
    private Long userId;
    @Column(name = "created")
    private LocalDateTime created;
}
