package com.algorithm.linetable;

/**
 * 线性表接口
 * 和存储结构无关
 * @Author: LiangKaiXuan
 * @Date: 2019/3/27 10:47
 */
public interface List {
    //返回线性表的大小，即线性表元素的个数
    int size();

    //返回线性表中序号为i的数据
    Object get(int i);

    //如果线性表为空返回true，否则返回false
    boolean isEmpty();

    //判断线性表是否包含数据元素e
    boolean contains(Object e);

    //返回元素在线性表中的位置
    int indexOf(Object e);

    //将数据元素插入到第i个位置
    void add(int i,Object e);

    //将数据元素插入末尾
    void add(Object e);

    //删除线性表中第i个元素，并返回
    Object remove(int i);

    //删除线性表中第一个与e相同的元素
    boolean remove(Object e);

    //替换线性表中序号为i的数据元素为e，返回原数据元素
    Object replace(int i,Object e);
}
