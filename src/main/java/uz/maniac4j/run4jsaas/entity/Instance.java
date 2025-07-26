package uz.maniac4j.run4jsaas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import uz.maniac4j.run4jsaas.base.BaseEntity;
import uz.maniac4j.run4jsaas.enums.InstanceStatus;
import uz.maniac4j.run4jsaas.enums.InstanceType;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Instance extends BaseEntity {
    @Column(nullable = false)
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Realm realm; // Realm for auth
    @OneToOne(cascade = CascadeType.ALL)
    private Database database;

    @ManyToOne
    private Server server;

    @Enumerated(EnumType.STRING)
    private InstanceStatus status;
    @Enumerated(EnumType.STRING)
    private InstanceType type;
}
