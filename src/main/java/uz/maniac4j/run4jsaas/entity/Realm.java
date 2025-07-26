package uz.maniac4j.run4jsaas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import uz.maniac4j.run4jsaas.base.BaseEntity;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
// It's a keycloak realm for each run4j instance
public class Realm extends BaseEntity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String baseUrl;

    private String username;
    private String password;
    @Column(columnDefinition = "text")
    private String publicKey;
}
