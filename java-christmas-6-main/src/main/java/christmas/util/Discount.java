package christmas.util;

import java.util.Set;

public class Discount {
    private static final Set<Integer> WEEKEND_DATES = Set.of(1,2,8,9,15,16,22,23,29,30);
    private static final Set<Integer> STAR_DATES = Set.of(3,10,17,24,25,31);
    private static final int WEEKDAY_DISCOUNT_AMOUNT = 2023;
    private static final int WEEKEND_DISCOUNT_AMOUNT = 2023;
    private static final int SPECIAL_DISCOUNT_AMOUNT = 1000;
    private static final int EVENT_START = 1;
    private static final int CHRISTMAS_EVENT_END = 25;

    public static int calculateChristmasDiscount(int orderDate){
        if(orderDate > CHRISTMAS_EVENT_END){
            return 0;
        }
        return 1000 + 100 * (orderDate - EVENT_START);
    }

    public static int calculateWeekdayDiscount(int orderDate, int dessertCount){
        if(WEEKEND_DATES.contains(orderDate)){
            return 0;
        }
        return dessertCount * WEEKDAY_DISCOUNT_AMOUNT;
    }

    public static int calculateWeekendDiscount(int orderDate, int mainCount){
        if( WEEKEND_DATES.contains(orderDate)){
            return mainCount * WEEKEND_DISCOUNT_AMOUNT;
        }
        return 0;
    }

    public static int calculateSpecialDiscount(int orderDate){
        if(STAR_DATES.contains(orderDate)){
            return SPECIAL_DISCOUNT_AMOUNT;
        }
        return 0;
    }

    public static int[] discountPolicy(int orderDate,int dessertCount, int mainCount){
        int christmasDiscount = calculateChristmasDiscount(orderDate);
        int weekdayDiscount = calculateWeekdayDiscount(orderDate,dessertCount);
        int weekendDiscount = calculateWeekendDiscount(orderDate,mainCount);
        int specialDiscount = calculateSpecialDiscount(orderDate);

        int[] discountResult = new int[]{christmasDiscount,weekdayDiscount,weekendDiscount,specialDiscount};

        return discountResult;
    }
}
