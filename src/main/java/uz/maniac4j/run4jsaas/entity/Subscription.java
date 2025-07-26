package uz.maniac4j.run4jsaas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import uz.maniac4j.run4jsaas.base.BaseEntity;
import uz.maniac4j.run4jsaas.enums.BillingCycle;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Subscription extends BaseEntity {
    @ManyToOne(optional = false)
    private Plan plan;

    @ManyToOne(optional = false)
    private Instance instance;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BillingCycle billingCycle;

    private Instant startTime;
    private Instant endTime;

    @Column(nullable = false)
    private boolean active = true;

    @Column(precision = 19, scale = 4)
    private BigDecimal paidAmount;

    private boolean autoRenew = true;

    private Instant cancellationTime;
}
