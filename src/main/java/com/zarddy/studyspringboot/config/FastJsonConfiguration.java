package com.zarddy.studyspringboot.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * SpringBoot将自动加载类内的配置
 * SpringBoot2.0开始，WebMvcConfigurerAdapter已设为过期
 * 关于过期，可参考https://blog.csdn.net/qq_35299712/article/details/80061532
 */
//@Configuration
//public class FastJsonConfiguration implements WebMvcConfigurer {
//
//    /**
//     * 修改自定义消息转换器
//     * @param converters 消息转换器列表
//     */
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        // 创建fastjson消息转换器
//        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
//        // 创建配置器
//        FastJsonConfig config = new FastJsonConfig();
//        // 修改配置返回内容的过滤
//        config.setSerializerFeatures(
//                SerializerFeature.DisableCircularReferenceDetect, // 消除对同一对象循环引用的问题，默认为false，不配置有可能进入死循环
//                SerializerFeature.WriteMapNullValue, // 是否输出值为null的字段，默认为false
//                SerializerFeature.WriteNullBooleanAsFalse, // Boolean字段如果为null时，输出为false，而非null
//                SerializerFeature.WriteNullListAsEmpty, // List字段为null时，输出[]，而非null
//                SerializerFeature.WriteNullStringAsEmpty // 字符串类型字段如果为null，则输出为""，而非null
//                );
//        fastJsonHttpMessageConverter.setFastJsonConfig(config);
//        // 将fastjson添加到视图消息转换器列表内
//        converters.add(fastJsonHttpMessageConverter);
//    }
//}