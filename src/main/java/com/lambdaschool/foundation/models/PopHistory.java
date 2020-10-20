package com.lambdaschool.foundation.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PopHistory
{
    private float POP_2016_est;
    private float POP_2017_est;
    private float POP_2018_est;
    private float POP_2019_est;

    public PopHistory()
    {
    }

    public PopHistory(float POP_2016_est, float POP_2017_est, float POP_2018_est, float POP_2019_est)
    {
        this.POP_2016_est = POP_2016_est;
        this.POP_2017_est = POP_2017_est;
        this.POP_2018_est = POP_2018_est;
        this.POP_2019_est = POP_2019_est;
    }

    public float getPOP_2016_est()
    {
        return POP_2016_est;
    }

    public void setPOP_2016_est(float POP_2016_est)
    {
        this.POP_2016_est = POP_2016_est;
    }

    public float getPOP_2017_est()
    {
        return POP_2017_est;
    }

    public void setPOP_2017_est(float POP_2017_est)
    {
        this.POP_2017_est = POP_2017_est;
    }

    public float getPOP_2018_est()
    {
        return POP_2018_est;
    }

    public void setPOP_2018_est(float POP_2018_est)
    {
        this.POP_2018_est = POP_2018_est;
    }

    public float getPOP_2019_est()
    {
        return POP_2019_est;
    }

    public void setPOP_2019_est(float POP_2019_est)
    {
        this.POP_2019_est = POP_2019_est;
    }
}
