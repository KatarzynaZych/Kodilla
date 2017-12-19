package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        // given
        ArrayList<Country> europeanCountries = new ArrayList<>();
        ArrayList<Country> asianCountries = new ArrayList<>();
        ArrayList<Country> africanCountries = new ArrayList<>();
        ArrayList<Country> northAmericanCountries = new ArrayList<>();
        ArrayList<Country> southAmericanCountries = new ArrayList<>();
        ArrayList<Country> australiansAndOceanicCountries = new ArrayList<>();

        ArrayList<Continent> countinentList = new ArrayList<>();

        europeanCountries.add(new Country("Albania", new BigDecimal("2831741")));
        europeanCountries.add(new Country("Andorra", new BigDecimal("68403")));
        europeanCountries.add(new Country("Armenia", new BigDecimal("3060631")));
        europeanCountries.add(new Country("Austria", new BigDecimal("8169929")));
        europeanCountries.add(new Country("Azerbaijan", new BigDecimal("9165000")));

        asianCountries.add(new Country("Afghanistan", new BigDecimal("34656032")));
        asianCountries.add(new Country("Qatar", new BigDecimal("2924816")));
        asianCountries.add(new Country("Cambodia", new BigDecimal("15762370")));
        asianCountries.add(new Country("Bahrain",	new BigDecimal("1425171")));
        asianCountries.add(new Country("Bangladesh",	new BigDecimal("162951560")));

        africanCountries.add(new Country("Madagascar", new BigDecimal("20653556")));
        africanCountries.add(new Country("Malawi", new BigDecimal("14268711")));
        africanCountries.add(new Country("Mauritius", new BigDecimal("1284264")));
        africanCountries.add(new Country("Mozambique",	new BigDecimal("21669278")));
        africanCountries.add(new Country("Somalia",	new BigDecimal("9832017")));

        northAmericanCountries.add(new Country("Costa Rica", new BigDecimal("4857274")));
        northAmericanCountries.add(new Country("Cuba", new BigDecimal("11475")));
        northAmericanCountries.add(new Country("Curaçao", new BigDecimal("444159")));
        northAmericanCountries.add(new Country("Dominica", new BigDecimal("73543")));
        northAmericanCountries.add(new Country("Dominican Republic", new BigDecimal("10648791")));

        southAmericanCountries.add(new Country("Brazil",new BigDecimal("204519000")));
        southAmericanCountries.add(new Country("Colombia",new BigDecimal("48549000")));
        southAmericanCountries.add(new Country("Argentina",new BigDecimal("43132000")));
        southAmericanCountries.add(new Country("Peru",new BigDecimal("31153000")));
        southAmericanCountries.add(new Country("Venezuela",new BigDecimal("30620000")));

        australiansAndOceanicCountries.add(new Country("Australia", new BigDecimal("23792000")));
        australiansAndOceanicCountries.add(new Country("Papua New Guinea", new BigDecimal("8219000")));
        australiansAndOceanicCountries.add(new Country("New Zealand", new BigDecimal("4579000")));
        australiansAndOceanicCountries.add(new Country("Fiji", new BigDecimal("867000")));
        australiansAndOceanicCountries.add(new Country("Solomon Islands", new BigDecimal("587000")));

        countinentList.add(new Continent("Europa",europeanCountries));
        countinentList.add(new Continent("Asia",asianCountries));
        countinentList.add(new Continent("Africa",africanCountries));
        countinentList.add(new Continent("North America", northAmericanCountries));
        countinentList.add(new Continent("South America", southAmericanCountries));
        countinentList.add(new Continent("Australia and Ocenia", australiansAndOceanicCountries));

        World world = new World(countinentList);

        long europePopulation = 2831741+68403+3060631+8169929+9165000;
        long asiaPopulation = 34656032+2924816+15762370+1425171+162951560;
        long africaPopulation = 20653556+14268711+1284264+21669278+9832017;
        long northAmericanPopulation = 4857274+11475+444159+73543+10648791;
        long southAmericaPopulation = 204519000+48549000+43132000+31153000+30620000;
        long australianAndOceaniaPopulation = 23792000+8219000+4579000+867000+587000;

        long worldPopulation = europePopulation+asiaPopulation+africaPopulation+northAmericanPopulation+southAmericaPopulation+australianAndOceaniaPopulation;
        BigDecimal expectedWorldPopulation = BigDecimal.valueOf(worldPopulation);

        // when

        BigDecimal actualWorldPopulation = world.getPeopleQuantity();

        // then
        Assert.assertEquals(expectedWorldPopulation, actualWorldPopulation);
    }
}
