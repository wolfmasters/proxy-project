package com.asia.service;

import com.asia.service.shangjia.TaoBao;

/**
 * TODO
 *
 * @author wangzongkai
 * @version 1.0
 * @date 2020/11/5 10:41 上午
 */
public class ShopMain {

    public static void main(String[] args) {
        TaoBao t = new TaoBao();
        float price = t.sell(1);
        System.out.println(price);
    }
}
