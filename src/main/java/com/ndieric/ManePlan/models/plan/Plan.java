package com.ndieric.ManePlan.models.plan;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity(name = "Plan")
@Table(name = "tbl_plans")
public class Plan {
  private Long id;
  private String description;
  private LocalDate dateCreation;
  private LocalDate dateExecution;

  public Plan() {
  }

  public Plan(Long id, String description, LocalDate dateCreation, LocalDate dateExecution) {
    this.id = id;
    this.description = description;
    this.dateCreation = dateCreation;
    this.dateExecution = dateExecution;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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
