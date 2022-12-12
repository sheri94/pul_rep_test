package com.pulkovo.pulkovo.config;

import com.pulkovo.pulkovo.model.Divisions;
import com.pulkovo.pulkovo.service.DivisionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ProjectWin
 * \* Date: Andrey Volsky
 * \* Time: 23:20
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Component
@AllArgsConstructor
public class Datainitializer {
    private final DivisionService divisionService;

    @PostConstruct
    public void init() {
//        createDivision();
        System.out.println("Init method run");
    }

    public void createDivision() {
//Divisions divisions = new Divisions();
////        Divisions direction = new Divisions(1L, "GenDir", new Divisions(), new Date(), new Date(), new Date(), new Date());
//        divisionService.saveDivision(divisions);
    }

}