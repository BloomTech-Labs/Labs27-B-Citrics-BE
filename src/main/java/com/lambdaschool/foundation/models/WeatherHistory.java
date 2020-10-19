package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherHistory
{

    private float Oct_precip;
    private float Oct_temp;
    private float Nov_precip;
    private float Nov_temp;
    private float Dec_precip;
    private float Dec_temp;


    public WeatherHistory()
    {
    }

    public WeatherHistory(float oct_precip, float oct_temp, float nov_precip, float nov_temp, float dec_precip, float dec_temp)
    {
        Oct_precip = oct_precip;
        Oct_temp = oct_temp;
        Nov_precip = nov_precip;
        Nov_temp = nov_temp;
        Dec_precip = dec_precip;
        Dec_temp = dec_temp;
    }

    public float getOct_precip()
    {
        return Oct_precip;
    }

    public void setOct_precip(float oct_precip)
    {
        Oct_precip = oct_precip;
    }

    public float getOct_temp()
    {
        return Oct_temp;
    }

    public void setOct_temp(float oct_temp)
    {
        Oct_temp = oct_temp;
    }

    public float getNov_precip()
    {
        return Nov_precip;
    }

    public void setNov_precip(float nov_precip)
    {
        Nov_precip = nov_precip;
    }

    public float getNov_temp()
    {
        return Nov_temp;
    }

    public void setNov_temp(float nov_temp)
    {
        Nov_temp = nov_temp;
    }

    public float getDec_precip()
    {
        return Dec_precip;
    }

    public void setDec_precip(float dec_precip)
    {
        Dec_precip = dec_precip;
    }

    public float getDec_temp()
    {
        return Dec_temp;
    }

    public void setDec_temp(float dec_temp)
    {
        Dec_temp = dec_temp;
    }
}
