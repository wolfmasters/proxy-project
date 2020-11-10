package com.asia.factory;

import com.asia.service.UsbSell;

/**
 * TODO
 *
 * @author wangzongkai
 * @version 1.0
 * @date 2020/11/5 2:36 下午
 */
public class UKingSellFactroy implements UsbSell {
    @Override
    public float sell(int amount) {
        return 25;
    }
}
