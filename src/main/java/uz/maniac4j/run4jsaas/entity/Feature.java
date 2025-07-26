package uz.maniac4j.run4jsaas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import uz.maniac4j.run4jsaas.base.BaseEntity;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Feature extends BaseEntity {

    private String name;

    @ManyToOne
    private Plan plan;

    private Boolean enabled;
}
