package tn.esprit.examenblanc.Entities;

import lombok.Data;

@Data
public class KpiResponse {
    private Long totalCategories;
    private Long totalClients;
    private Long totalProducts;
    private Long totalProjects;
    private Long totalDevis;

}
