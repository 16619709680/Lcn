package com.jn.controller;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.jn.dao.OrderDao;
import com.jn.entity.Order;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@RestController
public class LcnOrderController {


    @Autowired
    OrderDao orderDao;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/pay")
    @LcnTransaction
    @Transactional(rollbackFor = Exception.class)
    public String pay() {
        Order order = new Order();
        order.setOrdername("订单：" + new Random(100));

        JSONObject date = new JSONObject();
        date.put("payname", "支付订单：" + order.getOrdername());

        restTemplate.postForEntity("http://localhost:90/pay", date, String.class);

        orderDao.insert(order);
        return "Success";
    }


}
