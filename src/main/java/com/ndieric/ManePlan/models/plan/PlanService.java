package com.ndieric.ManePlan.models.plan;

import java.util.List;

public interface PlanService {

  public PlanResponse doCreatePlan(PlanRequest request);

  public List<PlanResponse> doFetch();
}
