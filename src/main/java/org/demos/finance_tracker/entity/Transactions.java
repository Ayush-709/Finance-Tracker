package org.demos.finance_tracker.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.demos.finance_tracker.enums.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private LocalDate transactionDate = LocalDate.now();
    @Enumerated(EnumType.STRING)
    private TransactionType type;
    private String modeOFPayment;
    private String description;
    private String transactionCategory;
    private BigDecimal amount = BigDecimal.ZERO;
    private String tags;
    private boolean recurring;

    @PrePersist
    @PreUpdate
    public void formatTransactionDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.transactionDate = LocalDate.parse(this.transactionDate.format(formatter), formatter);
    }
}
