package com.ndieric.ManePlan.models.plan;

import java.time.LocalDate;

public class PlanRequest {
  private String description;
  private LocalDate dateCreation;
  private LocalDate dateExecution;

  public PlanRequest() {
  }

  public PlanRequest(String description, LocalDate dateCreation, LocalDate dateExecution) {
    this.description = description;
    this.dateCreation = dateCreation;
    this.dateExecution = dateExecution;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getDateCreation() {
    return dateCreation;
  }

  public void setDateCreation(LocalDate dateCreation) {
    this.dateCreation = dateCreation;
  }

  public LocalDate getDateExecution() {
    return dateExecution;
  }

  public void setDateExecution(LocalDate dateExecution) {
    this.dateExecution = dateExecution;
  }

}
