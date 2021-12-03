package com.bellintegrator.demo.delegates;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.Random;

@Slf4j
@Component("UnderwriterDecisionDelegate")
public class UnderwriterDecisionDelegate implements JavaDelegate {
    private final Random random = new Random();

    @Override
    public void execute(DelegateExecution delegateExecution) {
        log.info("The decision on the claim has been made.");
        if (random.nextBoolean())
            log.info("DECISION: Claim approved!");
        else
            log.info("DECISION: Claim rejected!");
    }
}
