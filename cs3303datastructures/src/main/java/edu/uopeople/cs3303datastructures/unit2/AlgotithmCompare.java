package edu.uopeople.cs3303datastructures.unit2;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ：mmzs
 * @date ：Created in 2021/6/28 16:35
 * @description：AP
 * @modified By：
 * @version: 1$
 */
@Slf4j
public class AlgotithmCompare {

    public static void main(String[] args) {
        new AlgotithmCompare();
    }

    public AlgotithmCompare() {
        for (long i = 1; i < Long.MAX_VALUE; i++) {
            if (1000 * Math.pow(i, 3) < Math.pow(2, i)) {
                log.info("it happens when the steps amount to " + i);
                break;
            }
        }
    }
}
