package com.lambdaschool.foundation.models;


import javax.persistence.*;


@Entity
@Table(name = "city")
public class City extends Auditable
{
    @Id
    private long city_id;

    private String city;

    /**
     * City's state
     */
    private String statename;

    /**
     * City's two letter state abbreviation
     */
    private String abbrev;

    /**
     * City's zipcodes
     */
    private String ziplist;

    /**
     * City's timezone
     */
    private String timezone;

    /**
     * City's counties
     */
    private String counties;

    /**
     * City's latitude
     */
    private Double latitude;

    /**
     * City's longitude
     */
    private Double longitude;

    /**
     * City's FIPS
     */
    private String FIPS;

    /**
     * City's GNIS
     */
    private String GNIS;

    /**
     * City's Wikipedia image url
     */
    private String wiki_img_url;

    /**
     * City's website
     */
    private String website;

    /**
     * City's population
     */
    private Double pop;

    /**
     * City's density per square mile
     */
    private Double density_mi_sq;

    /**
     * City's density per square kilometer
     */
    private Double density_km_sq;

    /**
     * City's historical average population
     */
//    private PopHistory pop_hist; // done

    /**
     * City's average age
     */
    private Double age;

    /**
     * City's average household income
     */
    private Double household;

    /**
     * City's average individual income
     */
    private Double individual;

    /**
     * City's historical average income
     */
//    private String income_hist; // confused

    /**
     * City's average house cost
     */
    private Double house;

//    /**
//     * City's historical average home cost
//     */
//    private String home_hist;

    /**
     * City's average rent
     */
    private Double rent;

    /**
     * City's cost of living index
     */
    private Double COLI;

    /**
     * City's ACA status
     */
    private String ACA_status;

    /**
     * City's historical weather
     */
//    private WeatherHistory weather_hist;

//    /**
//     * City's Covid-19 cases
//     */
//    private String jhcovid;


    public City()
    {
    }


    public City(String city, String statename, String abbrev, String ziplist, String timezone, String counties, Double latitude, Double longitude, String FIPS, String GNIS, String wiki_img_url, String website, Double pop, Double density_mi_sq, Double density_km_sq, Double age, Double household, Double individual, Double house, Double rent, Double COLI, String ACA_status)
    {
        this.city = city;
        this.statename = statename;
        this.abbrev = abbrev;
        this.ziplist = ziplist;
        this.timezone = timezone;
        this.counties = counties;
        this.latitude = latitude;
        this.longitude = longitude;
        this.FIPS = FIPS;
        this.GNIS = GNIS;
        this.wiki_img_url = wiki_img_url;
        this.website = website;
        this.pop = pop;
        this.density_mi_sq = density_mi_sq;
        this.density_km_sq = density_km_sq;
        this.age = age;
        this.household = household;
        this.individual = individual;
        this.house = house;
        this.rent = rent;
        this.COLI = COLI;
        this.ACA_status = ACA_status;
    }


    public long getCity_id()
    {
        return city_id;
    }

    public void setCity_id(long city_id)
    {
        this.city_id = city_id;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getStatename()
    {
        return statename;
    }

    public void setStatename(String statename)
    {
        this.statename = statename;
    }

    public String getAbbrev()
    {
        return abbrev;
    }

    public void setAbbrev(String abbrev)
    {
        this.abbrev = abbrev;
    }

    public String getZiplist()
    {
        return ziplist;
    }

    public void setZiplist(String ziplist)
    {
        this.ziplist = ziplist;
    }

    public String getTimezone()
    {
        return timezone;
    }

    public void setTimezone(String timezone)
    {
        this.timezone = timezone;
    }

    public String getCounties()
    {
        return counties;
    }

    public void setCounties(String counties)
    {
        this.counties = counties;
    }

    public Double getLatitude()
    {
        return latitude;
    }

    public void setLatitude(Double latitude)
    {
        this.latitude = latitude;
    }

    public Double getLongitude()
    {
        return longitude;
    }

    public void setLongitude(Double longitude)
    {
        this.longitude = longitude;
    }

    public String getFIPS()
    {
        return FIPS;
    }

    public void setFIPS(String FIPS)
    {
        this.FIPS = FIPS;
    }

    public String getGNIS()
    {
        return GNIS;
    }

    public void setGNIS(String GNIS)
    {
        this.GNIS = GNIS;
    }

    public String getWiki_img_url()
    {
        return wiki_img_url;
    }

    public void setWiki_img_url(String wiki_img_url)
    {
        this.wiki_img_url = wiki_img_url;
    }

    public String getWebsite()
    {
        return website;
    }

    public void setWebsite(String website)
    {
        this.website = website;
    }

    public Double getPop()
    {
        return pop;
    }

    public void setPop(Double pop)
    {
        this.pop = pop;
    }

    public Double getDensity_mi_sq()
    {
        return density_mi_sq;
    }

    public void setDensity_mi_sq(Double density_mi_sq)
    {
        this.density_mi_sq = density_mi_sq;
    }

    public Double getDensity_km_sq()
    {
        return density_km_sq;
    }

    public void setDensity_km_sq(Double density_km_sq)
    {
        this.density_km_sq = density_km_sq;
    }

    public Double getAge()
    {
        return age;
    }

    public void setAge(Double age)
    {
        this.age = age;
    }

    public Double getHousehold()
    {
        return household;
    }

    public void setHousehold(Double household)
    {
        this.household = household;
    }

    public Double getIndividual()
    {
        return individual;
    }

    public void setIndividual(Double individual)
    {
        this.individual = individual;
    }

    public Double getHouse()
    {
        return house;
    }

    public void setHouse(Double house)
    {
        this.house = house;
    }

    public Double getRent()
    {
        return rent;
    }

    public void setRent(Double rent)
    {
        this.rent = rent;
    }

    public Double getCOLI()
    {
        return COLI;
    }

    public void setCOLI(Double COLI)
    {
        this.COLI = COLI;
    }

    public String getACA_status()
    {
        return ACA_status;
    }

    public void setACA_status(String ACA_status)
    {
        this.ACA_status = ACA_status;
    }
}
