package esc.db.dbvers.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "users", schema = "public")
public class User extends PersistentModel {
    @Column(name = "name")
    private String name;
}
