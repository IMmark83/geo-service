package ru.netology.geo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static ru.netology.geo.GeoServiceImpl.MOSCOW_IP;


class GeoServiceImplTest {
    @Test
    void testByIp() {
        GeoService geoService = new GeoServiceImpl();
        Location actual = geoService.byIp("172.");
        Location expected = new Location("Moscow", Country.RUSSIA, "Lenina", 15);
        Assertions.assertEquals(expected, actual);

    }

}