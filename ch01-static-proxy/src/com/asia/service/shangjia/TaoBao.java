package com.asia.service.shangjia;

import com.asia.service.UsbSell;
import com.asia.service.factory.UsbKingFactory;

/**
 * TODO
 *  淘宝是一个商家，代理金士顿的销售
 * @author wangzongkai
 * @version 1.0
 * @date 2020/11/5 10:36 上午
 */
public class TaoBao implements UsbSell {


    //声明：商家代理的工厂
    private UsbKingFactory usbKingFactory = new UsbKingFactory();

    /**
     * TODO
     *  实现优盘销售的功能
     * @param amount
     * @return
     */
    @Override
    public float sell(int amount) {
        //向厂家发送订单，告诉厂家，我买了u盘，厂家发货
        float price = usbKingFactory.sell(1);
        //商家赚取中间利润.这个就是增强功能
        price = price + 25;
        System.out.println("淘宝商家给你返回优惠券");
        //返回增加以后的价格
        return price;
    }
}
