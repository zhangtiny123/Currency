package com.twyexiao.core;

/**
 * Created by taozhang on 12/27/14.
 */
public abstract class Currency {
    protected Huo_bi huo_bi;
    protected double value;
    public abstract Currency add(Currency currency);
}
