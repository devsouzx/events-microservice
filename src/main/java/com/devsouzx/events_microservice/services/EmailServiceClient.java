package com.devsouzx.events_microservice.services;

import com.devsouzx.events_microservice.dtos.EmailRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "email-service", url = "http://localhost:8090/api/email")
public interface EmailServiceClient {
    @PostMapping
    void sendEmail(@RequestBody EmailRequest emailRequest);
}
