package com.jt.factory;

import java.util.Calendar;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 16:08 2021/4/21
 * @Modified By:
 */
public class StaticFactory {
    public static Calendar getCalendar() {
        return Calendar.getInstance();
    }

}
