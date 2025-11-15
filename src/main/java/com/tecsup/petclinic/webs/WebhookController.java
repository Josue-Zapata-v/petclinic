package com.tecsup.petclinic.webs;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

    @PostMapping("/github-webhook")
    public ResponseEntity<String> receiveWebhook(@RequestBody String payload) {
        System.out.println("Webhook recibido desde GitHub:");
        System.out.println(payload);
        return ResponseEntity.ok("OK");
    }
}
