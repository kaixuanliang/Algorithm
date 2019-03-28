package com.algorithm.linetable;

/**
 * 自定义异常
 * @Author: LiangKaiXuan
 * @Date: 2019/3/27 11:21
 */
public class MyArrayIndexOutOfBoundsException extends RuntimeException{
    public MyArrayIndexOutOfBoundsException() {
        super();
    }

    public MyArrayIndexOutOfBoundsException(String message) {
        super(message);
    }
}
