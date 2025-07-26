package uz.maniac4j.run4jsaas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import uz.maniac4j.run4jsaas.base.BaseEntity;
import uz.maniac4j.run4jsaas.enums.DatabaseType;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
// It's a database for each run4j instance
public class Database extends BaseEntity {
    @Column(nullable = false)
    private String name;
    private String host;
    private int port;
    private String username;
    private String password;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private DatabaseType type;
}
