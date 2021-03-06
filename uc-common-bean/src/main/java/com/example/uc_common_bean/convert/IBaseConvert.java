package com.example.uc_common_bean.convert;

/**
 * @version : 1.0
 * @Description : 类型转换
 * @autho : dongyiming
 * @data : 2017/7/11 17:50
 */
public interface IBaseConvert<V, T> {

    T convert(V v);
}
