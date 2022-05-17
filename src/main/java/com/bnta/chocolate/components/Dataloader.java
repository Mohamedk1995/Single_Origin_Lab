package com.bnta.chocolate.components;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataloader implements ApplicationRunner {

    @Autowired// dependency injection
    ChocolateRepository chocolateRepository;

    @Autowired
    EstateRepository estateRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Estate estate1 = new Estate("Rabot Estate", "St Lucia");
        estateRepository.save(estate1);

        Chocolate chocolate1 = new Chocolate("Praline", 75, estate1);
        chocolateRepository.save(chocolate1);

        Chocolate chocolate2 = new Chocolate("Caramel", 55, estate1);
        chocolateRepository.save(chocolate2);

        Estate estate2 = new Estate("London", "United Kingdom");
        estateRepository.save(estate2);

        Chocolate chocolate3 = new Chocolate("Cookies and Cream", 65, estate2);
        chocolateRepository.save(chocolate3);





    }

}
