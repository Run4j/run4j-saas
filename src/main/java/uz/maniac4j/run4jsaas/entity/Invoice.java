package uz.maniac4j.run4jsaas.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.maniac4j.run4jsaas.base.BaseEntity;
import uz.maniac4j.run4jsaas.enums.InvoiceStatus;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Invoice extends BaseEntity {

    @ManyToOne(optional = false)
    private Subscription subscription;

    @Column(nullable = false, precision = 19, scale = 4)
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private InvoiceStatus status;

    private Instant issuedAt;
    private Instant paidAt;

//    private String paymentMethod; // "CARD", "PAYPAL"

//    private String transactionId; // External system reference
}
