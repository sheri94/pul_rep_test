package com.pulkovo.pulkovo.config;

import com.pulkovo.pulkovo.model.Divisions;
import com.pulkovo.pulkovo.service.DivisionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
        createDivision();
        System.out.println("Init method run");
    }

    public void createDivision() {

        Divisions direction = new Divisions("GenDi",
                LocalDateTime.of(1994, 12, 15, 16, 00),
                LocalDateTime.of(1993, 12, 15, 16, 00));

        Divisions economic = new Divisions(2L, "economic", direction,
                LocalDateTime.of(1994, 12, 15, 16, 00),
                LocalDateTime.of(1993, 12, 15, 16, 00),
                LocalDateTime.of(1993, 12, 15, 16, 00),
                LocalDateTime.of(1993, 12, 15, 16, 00));

        Divisions laer = new Divisions(3L, "laer", direction,
                LocalDateTime.of(1994, 12, 15, 16, 00),
                LocalDateTime.of(1993, 12, 15, 16, 00),
                LocalDateTime.of(1993, 12, 15, 16, 00),
                LocalDateTime.of(1993, 12, 15, 16, 00));

        Divisions divisionsDirPoProizv = new Divisions(4L, "divisionsDirPoProizv", direction,
                LocalDateTime.of(1994, 12, 15, 16, 00),
                LocalDateTime.of(1993, 12, 15, 16, 00),
                LocalDateTime.of(1993, 12, 15, 16, 00),
                LocalDateTime.of(1993, 12, 15, 16, 00));

        Divisions bilders = new Divisions(5L, "bilders", divisionsDirPoProizv,
                LocalDateTime.of(1994, 12, 15, 16, 00),
                LocalDateTime.of(1993, 12, 15, 16, 00),
                LocalDateTime.of(1993, 12, 15, 16, 00),
                LocalDateTime.of(1993, 12, 15, 16, 00));
        divisionService.saveDivision(direction);
        divisionService.saveDivision(economic);
        divisionService.saveDivision(laer);
        divisionService.saveDivision(divisionsDirPoProizv);
        divisionService.saveDivision(bilders);
    }

}