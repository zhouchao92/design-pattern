package com.proxy.dynamicproxy;

/**
 * @author 周
 * @title ProxyHandler
 * @description 模拟动态生成代理结构
 * @date 2020/6/7 20:46
 */
public class ProxyHandler implements Star {

    StarHandler handler;

    public ProxyHandler(StarHandler handler) {
        super();
        this.handler = handler;
    }

    @Override
    public void confer() {
        // handler.invoke(this,当前方法,args);
    }

    @Override
    public void signContract() {

    }

    @Override
    public void bookTicket() {

    }

    @Override
    public void sing() {

    }

    @Override
    public void collectionMoney() {

    }
}
