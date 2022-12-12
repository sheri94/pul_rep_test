package com.pulkovo.pulkovo.service;

import com.pulkovo.pulkovo.model.Divisions;

import java.util.Date;

public interface DivisionService {
Divisions getTreeDivisionsOnSpecificDate(Date specificDate);

void saveDivision(Divisions divisions);

void updateDivision(Divisions divisions);

void deleteDivision(Long id);

}
