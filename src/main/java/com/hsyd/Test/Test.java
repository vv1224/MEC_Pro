package com.hsyd.Test;

import com.google.common.annotations.VisibleForTesting;
import com.hsyd.utils.Common;

/**
 * @author : sunwei
 *         Date : 2017/4/19
 *         Time : 17:40
 */
public class Test {


    @VisibleForTesting
    public void testListNum(){
        Common common = new Common();
        System.out.print(common.getOrderId());
    }
}
