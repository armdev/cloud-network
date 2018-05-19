package io.project.wiki.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping(path = "/api/v1/wiki", produces = MediaType.APPLICATION_JSON_VALUE)
public class ConfigClientController {

    @Value("${message}")
    private String message;

    @GetMapping("/secret/message")
    public String hello() {
        return this.message;
    }
}
