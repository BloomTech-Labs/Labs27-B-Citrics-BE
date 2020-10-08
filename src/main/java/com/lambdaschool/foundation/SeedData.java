package com.lambdaschool.foundation;

import com.github.javafaker.Faker;
import com.lambdaschool.foundation.models.City;
import com.lambdaschool.foundation.models.Metric;
import com.lambdaschool.foundation.models.Role;
import com.lambdaschool.foundation.services.CityService;
import com.lambdaschool.foundation.services.MetricService;
import com.lambdaschool.foundation.services.RoleService;
import com.lambdaschool.foundation.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * SeedData puts both known and random data into the database. It implements CommandLineRunner.
 * <p>
 * CoomandLineRunner: Spring Boot automatically runs the run method once and only once
 * after the application context has been loaded.
 */
@Transactional
@Component
public class SeedData
        implements CommandLineRunner {
    /**
     * Connects the Role Service to this process
     */
    @Autowired
    RoleService roleService;

    /**
     * Connects the user service to this process
     */
    @Autowired
    UserService userService;

    @Autowired
    CityService cityService;

    @Autowired
    MetricService metricService;

    /**
     * Generates test, seed data for our application
     * First a set of known data is seeded into our database.
     * Second a random set of data using Java Faker is seeded into our database.
     * Note this process does not remove data from the database. So if data exists in the database
     * prior to running this process, that data remains in the database.
     *
     * @param args The parameter is required by the parent interface but is not used in this process.
     */

    @Transactional
    @Override
    public void run(String[] args) throws
            Exception {
        roleService.deleteAll();
        Role r1 = new Role("admin");
        Role r2 = new Role("user");
        Role r3 = new Role("data");

        r1 = roleService.save(r1);
        r2 = roleService.save(r2);
        r3 = roleService.save(r3);

        // The following is an example user!
        /*
        // admin, data, user
        User u1 = new User("admin",
            "password",
            "admin@lambdaschool.local");
        u1.getRoles()
            .add(new UserRoles(u1,
                r1));
        u1.getRoles()
            .add(new UserRoles(u1,
                r2));
        u1.getRoles()
            .add(new UserRoles(u1,
                r3));
        u1.getUseremails()
            .add(new Useremail(u1,
                "admin@email.local"));
        u1.getUseremails()
            .add(new Useremail(u1,
                "admin@mymail.local"));

        userService.save(u1);
        */

        // Creating random cities for dummy data
        Faker dummyData = new Faker(new Locale("en-US"));
        List<City> dummyCities = new ArrayList<>();
        List<Metric> dummyMetrics = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            String state = dummyData.address().stateAbbr();
            City city = new City(dummyData.address().cityName(),
                    state,
                    dummyData.address().zipCodeByState(state));
            Metric metric = new Metric(dummyData.number().numberBetween(2000, 300000000),
                    dummyData.number().randomDigitNotZero(),
                    city);
            city.getMetric().add(metric);
            dummyMetrics.add(metric);
            dummyCities.add(city);
        }

        for (City city : dummyCities){
            cityService.save(city);
        }
    }
}