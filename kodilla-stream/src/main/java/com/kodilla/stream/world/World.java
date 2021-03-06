package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> theContinentsList = new ArrayList<>();

    public void addContinent(Continent continent) {
        theContinentsList.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return theContinentsList.stream()
                .flatMap(continent -> continent.getTheCountriesList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}