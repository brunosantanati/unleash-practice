package me.brunosantana;

import io.getunleash.DefaultUnleash;
import io.getunleash.Unleash;
import io.getunleash.util.UnleashConfig;

public class UnleashPractice {

    public static void main(String[] args) throws InterruptedException {
        UnleashConfig config = UnleashConfig.builder()
                .appName("unleash-practice-app")
                .instanceId("my-instance-1")
                .unleashAPI("http://localhost:4242/api/")
                .apiKey("default:development.unleash-insecure-api-token")
                .synchronousFetchOnInitialisation(true)
                .build();

        Unleash unleash = new DefaultUnleash(config);

        if(unleash.isEnabled("MY_FIRST_FT")) {
            System.out.println("FT ENABLED");
        } else {
            System.out.println("FT DISABLED");
        }
    }

}
