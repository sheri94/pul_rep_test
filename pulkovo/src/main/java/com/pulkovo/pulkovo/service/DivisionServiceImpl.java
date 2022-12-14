package com.pulkovo.pulkovo.service;

import com.pulkovo.pulkovo.model.Divisions;
import com.pulkovo.pulkovo.repository.DivisionRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: ProjectWin
 * \* Date: Andrey Volsky
 * \* Time: 23:31
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@Service
public class DivisionServiceImpl implements DivisionService {

    private final DivisionRepository divisionRepository;

    public DivisionServiceImpl(DivisionRepository divisionRepository) {
        this.divisionRepository = divisionRepository;
    }

    @Override
    public Divisions getTreeDivisionsOnSpecificDate(Date specificDate) {
        return null;
    }

    @Override
    public void saveDivision(Divisions divisions) {
        divisionRepository.save(divisions);
    }

    @Override
    public void updateDivision(Divisions divisions) {

    }

    @Override
    public void deleteDivision(Long id) {

    }
}