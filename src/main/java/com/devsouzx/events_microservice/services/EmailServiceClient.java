package com.devsouzx.events_microservice.services;

import com.devsouzx.events_microservice.dtos.EmailRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "EMAIL-SERVICE")
public interface EmailServiceClient {
    @PostMapping("/api/email")
    void sendEmail(@RequestBody EmailRequest emailRequest);
}
