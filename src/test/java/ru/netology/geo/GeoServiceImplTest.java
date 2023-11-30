package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

class GeoServiceImplTest {
    @Test
    void testByIp() {
        GeoService geoService = new GeoServiceImpl();
        Location expected = new Location(("Moscow"), Country.RUSSIA, null, 0);
        Location actual = geoService.byIp("172.");
        Assertions.assertEquals(expected.getCity(), actual.getCity());
        Assertions.assertEquals(expected.getCountry(), actual.getCountry());

    }

}