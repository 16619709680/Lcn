package com.jn.controller;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.jn.dao.OrdersDao;
import com.jn.entity.Orders;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class LcnOrderController {


    @Autowired
    OrdersDao orderDao;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    @Transactional(rollbackFor = Exception.class)
    @LcnTransaction
    public String pay(@RequestBody Orders order) {

        JSONObject date = new JSONObject();
        date.put("id", order.getId());
        date.put("payname", "支付订单：" + order.getOrdername());
        restTemplate.postForEntity("http://localhost:90/pay", date, String.class);

        orderDao.insert(order);
        //int i = 1 / 0;
        return "Success";
    }


}
