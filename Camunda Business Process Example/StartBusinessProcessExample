package com.example.test.rest;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class BusinessProcessResource {
    private final RuntimeService runtimeService;

    @ApiOperation("Start camunda engine business process")
    @GetMapping("/{businessProcessKey}/{businessKey}")
    public void startBusinessProcess(@PathVariable("businessProcessKey") String businessProcessKey,
                                     @PathVariable("businessKey") String businessKey) {
        runtimeService.startProcessInstanceByKey(businessProcessKey, businessKey);
    }
}
