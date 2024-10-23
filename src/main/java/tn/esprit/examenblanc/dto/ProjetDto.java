package tn.esprit.examenblanc.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;
import tn.esprit.examenblanc.Entities.client;

import java.util.Date;

@Data
public class ProjetDto {

    private Long id;
    private String status;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    private String description;
    private String budget;

    private Long clientId;
    private String clientName;
}
