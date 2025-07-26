package uz.maniac4j.run4jsaas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import uz.maniac4j.run4jsaas.base.BaseEntity;

import java.math.BigDecimal;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Plan extends BaseEntity {
    @Column(nullable = false)
    private String name;
    @Column(columnDefinition = "text")
    private String description;
    @Column(nullable = false)
    private BigDecimal price;
    @Column(nullable = false)
    private Integer ram; // MB
    @Column(nullable = false)
    private Integer cpu;
    @Column(nullable = false)
    private Integer storage; // GB
    @Column(nullable = false)
    private Integer maxRun;
}
