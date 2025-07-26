package uz.maniac4j.run4jsaas.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import uz.maniac4j.run4jsaas.base.BaseEntity;
import uz.maniac4j.run4jsaas.enums.ServerProvider;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"provider", "server_id"}),
        }
//        ,
//        indexes = {
//                @Index(name = "idx_page_query_id", columnList = "page_id"),
//        }
)
public class Server extends BaseEntity {
    private String name;
    private String ip;
    private Integer totalCpu;
    private Integer totalRam;
    private Integer totalStorage;

    private Boolean active;


    // SSH Login Details
    @Column(nullable = false)
    private String sshUsername;

    @Column(nullable = false)
    private Integer sshPort = 22;

    private String sshPassword;

    @Column(columnDefinition = "TEXT")
    private String sshPrivateKey; // PEM content

    private String sshPassphrase; // if key is encrypted


    // Server Provider Details
    @Enumerated(EnumType.STRING)
    private ServerProvider provider;
    private String serverId;
    @Column(columnDefinition = "text") // Actually json
    private String meta;

}
