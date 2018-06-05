package com.ldimitrov.pwa.beer;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@AllArgsConstructor
@Component
public class BeerCommandLineRunner implements CommandLineRunner {

    private final BeerRepository repository;

    @Override
    public void run(String... strings) throws Exception {
        Stream.of("Augustiner", "Hacker Pschorr", "Hofbräu", "Löwenbräu", "Paulaner",
                "Spaten", "König Ludwig", "Weihenstephaner", "Giesinger", "Tegernsee")
                .forEach(name ->
                        repository.save(new Beer(name))
                );
        repository.findAll().forEach(System.out::println);
    }
}