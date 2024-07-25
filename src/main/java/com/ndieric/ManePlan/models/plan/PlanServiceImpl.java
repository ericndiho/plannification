package com.ndieric.ManePlan.models.plan;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PlanServiceImpl implements PlanService {

  private final PlanRepository planRepository;
  private final Planconverter planconverter;

  public PlanServiceImpl(PlanRepository planRepository, Planconverter planconverter) {
    this.planRepository = planRepository;
    this.planconverter = planconverter;
  }

  @Override
  public PlanResponse doCreatePlan(PlanRequest request) {
    Plan plan = this.planconverter.toEntity(request);
    Plan savedPlan = this.planRepository.save(plan);
    return this.planconverter.toResponse(savedPlan);
  }

  @Override
  public List<PlanResponse> doFetch() {
    return this.planRepository.findAll().stream().map(this.planconverter::toResponse).toList();
  }

}
