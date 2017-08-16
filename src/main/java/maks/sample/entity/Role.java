package maks.sample.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Role {

    private String name;

    public Role() {
    }

    public Role(String name) {
        this.name = name;
    }

    public Role(Collection<User> users){
        this.users = users;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
