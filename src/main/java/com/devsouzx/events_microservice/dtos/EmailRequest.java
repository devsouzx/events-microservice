package com.devsouzx.events_microservice.dtos;

public record EmailRequest(String to, String subject, String body) {
}
