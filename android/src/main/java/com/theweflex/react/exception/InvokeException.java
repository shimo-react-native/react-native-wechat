/*
 * Copyright (c) 2018. chenqiang Inc. All rights reserved.
 */

package com.theweflex.react.exception;

/**
 * 方法加载失败的 Exception
 *
 * @author chenqiang
 * @date 2018/8/9
 */
public class InvokeException extends Exception {

    public InvokeException() {
        super("WeChat API invoke returns false.");
    }
}
