package com.ndieric.ManePlan.models.plan;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Planconverter {

  public PlanResponse toResponse(Plan plan) {
    PlanResponse response = new PlanResponse();
    response.setDateCreation(plan.getDateCreation());
    response.setDateExecution(plan.getDateExecution());
    response.setDescription(plan.getDescription());
    return response;
  }

  public Plan toEntity(PlanRequest request) {
    Plan plan = new Plan();
    plan.setDateCreation(LocalDate.now());
    plan.setDateExecution(request.getDateExecution());
    plan.setDescription(request.getDescription());
    return plan;
  }
}
