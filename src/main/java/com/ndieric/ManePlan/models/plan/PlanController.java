package com.ndieric.ManePlan.models.plan;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "plans")
public class PlanController {

  private final PlanService planService;

  public PlanController(PlanService planService) {
    this.planService = planService;
  }

  @PostMapping
  public ResponseEntity<?> doCreate(@RequestBody PlanRequest request) {
    PlanResponse response = this.planService.doCreatePlan(request);
    return new ResponseEntity<>(response, HttpStatus.CREATED);
  }

  @GetMapping
  public ResponseEntity<?> doFetch() {
    List<PlanResponse> responses = this.planService.doFetch();
    return new ResponseEntity<>(responses, HttpStatus.OK);
  }

}
