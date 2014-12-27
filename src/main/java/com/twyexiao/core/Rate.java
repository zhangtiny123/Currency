package com.twyexiao.core;

/**
 * Created by taozhang on 12/27/14.
 */
public class Rate {
    public double check(Huo_bi this_huo_bi, Huo_bi target_huo_bi) {
        if(this_huo_bi == Huo_bi.RMB && target_huo_bi==Huo_bi.DAO) {
            return 6;
        }
        else if(this_huo_bi == Huo_bi.DAO && target_huo_bi == Huo_bi.RMB) {
            return 1/6;
        }
        else if(this_huo_bi == Huo_bi.RMB && target_huo_bi == Huo_bi.YEN) {
            return 1/10;
        }
        else if(this_huo_bi == Huo_bi.YEN && target_huo_bi == Huo_bi.RMB) {
            return 10;
        }

        return 0;
    }
}
