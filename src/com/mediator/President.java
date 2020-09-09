package com.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 周
 * @title President
 * @date 2020/6/12 19:30
 * @description
 */
public class President implements Mediator {

    private Map<String, Department> map = new HashMap<>();


    @Override
    public void register(String dname, Department d) {
        map.put(dname, d);
    }

    @Override
    public void command(String dname) {
        map.get(dname).selfAction();
    }

}
