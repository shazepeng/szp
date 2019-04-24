package com.xa.menu;

import com.xa.menu.dto.MenuDto;
import com.xa.menu.service.MenuService;
import com.xa.pojo.Menu;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        MenuService menuService = context.getBean(MenuService.class);
        List<MenuDto> menu = menuService.getAllMenu(1);
        System.out.println(menu);

    }
}
