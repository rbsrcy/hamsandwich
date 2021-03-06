package org.hamsandwich.example.testMatchers;

import static org.hamsandwich.example.testMatchers.Colour.*;
import static org.hamsandwich.example.testMatchers.CountryOfOrigin.*;

public enum Brand {
    Coxes(Red, England), GoldenDelicious(Yellow, US), GrannySmith(Green, Australia);

    public final Colour perfectColour;
    public final CountryOfOrigin countryOfOrigin;

    private Brand(Colour perfectColour, CountryOfOrigin countryOfOrigin) {
        this.perfectColour = perfectColour;
        this.countryOfOrigin = countryOfOrigin;
    }
}
