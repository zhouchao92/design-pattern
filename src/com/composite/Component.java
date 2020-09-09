package com.composite;

/**
 * @author 周
 * @title Component
 * @date 2020/6/8 20:39
 * @description 构建组件
 */
public interface Component {
    void operation();
}

/**
 * 叶子组件
 */
interface Leaf extends Component {

}

/**
 * 容器组件
 */
interface Composite extends Component {
    void add(Component c);

    void remove(Component c);

    Component getChild(int index);
}
