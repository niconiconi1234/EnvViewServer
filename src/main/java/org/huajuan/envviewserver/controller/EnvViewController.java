package org.huajuan.envviewserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvViewController {

    @GetMapping("/env")
    public String env() {
        var env = System.getenv();
        var sb = new StringBuilder();
        for (var key : env.keySet()) {
            sb.append(key).append("=").append(env.get(key)).append("\n");
        }
        return sb.toString();
    }

}
