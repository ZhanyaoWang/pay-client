package com.ruijie.pay.client;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ruijie.pay.model.Order;
import com.ruijie.pay.util.ClientUtil;
import com.ruijie.pay.util.Md5Util;
import com.ruijie.pay.util.RequestUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class HttpClient {


    public static void main(String[] args) throws Exception {

        Order order = getRandomOrder();
        byte[] context = JSON.toJSONString(order).getBytes("UTF-8");
        String sign = Md5Util.sign(new String(context,"UTF-8"), ClientUtil.PUBLIC_KEY, "UTF-8");
        JSONObject jo = new JSONObject();
        jo.put("sign", sign);
        jo.put("context", context);
        jo.put("encryptType", "MD5");
        String result = RequestUtils.doPostJson(ClientUtil.URL, jo.toJSONString());
        System.out.println(result);

    }

    private static Order getRandomOrder() {
        Random random = new Random();
        Order order = new Order();
        order.setMerchNo(ClientUtil.MERCH_NO);
        order.setOrderNo(String.valueOf(random.nextInt(100000)));
        order.setAmount(String.valueOf(random.nextInt(10)));
        order.setCurrency(ClientUtil.CNY);
        order.setOutChannel(ClientUtil.WX);
        order.setProduct("milk");
        order.setUserId("user_001");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        order.setReqTime(now.format(formatter));
        return order;
    }
}
