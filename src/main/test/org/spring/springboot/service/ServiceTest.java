package org.spring.springboot.service;

import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.spring.springboot.BaseTest;
import org.spring.springboot.domain.City;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yyb
 * @time 2019/3/27
 */
public class ServiceTest extends BaseTest {
    @Autowired
    private CityService cityService ;

    @Test
    public void addCity(){
        City city = new City();
        city.setCityName("南京");
        city.setDescription("三大火炉");
        city.setProvinceId(5214L);
        int i = cityService.addCity(city);
        System.out.println(i);
    }

    @Test
    public void findByCityName(){
        City shenzhen = cityService.findCityByName("shenzhen");
        System.out.println(JSON.toJSON(shenzhen));
    }
}
