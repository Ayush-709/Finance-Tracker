package org.demos.finance_tracker.entity;

import jakarta.persistence.*;
import lombok.*;
import org.demos.finance_tracker.enums.Status;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ModeOfPayment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true)
    private String paymentModeName;
    @Enumerated(EnumType.STRING)
    private Status status;
}
