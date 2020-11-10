package com.asia.service.factory;

import com.asia.service.UsbSell;

/**
 * TODO
 *  目标类：金士顿厂家，不接受用户单独购买
 * @author wangzongkai
 * @version 1.0
 * @date 2020/11/5 10:35 上午
 */
public class UsbKingFactory implements UsbSell {


    @Override
    public float sell(int amount) {
        return 0;
    }


}
