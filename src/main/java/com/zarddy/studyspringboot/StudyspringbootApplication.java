package com.zarddy.studyspringboot;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * 文章目录
 * https://gitee.com/hengboy/spring-boot-chapter
 */
//@EnableAutoConfiguration
@SpringBootApplication
public class StudyspringbootApplication {
//public class StudyspringbootApplication implements WebMvcConfigurer {

	/**
	 * 修改自定义消息转换器
	 * @param converters 消息转换器列表
	 */
//	@Override
//	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//		WebMvcConfigurer.super.configureMessageConverters(converters);
//		// 创建fastjson消息转换器
//		FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
//		// 创建配置器
//		FastJsonConfig config = new FastJsonConfig();
//		// 修改配置返回内容的过滤
//		config.setSerializerFeatures(
//				SerializerFeature.DisableCircularReferenceDetect, // 消除对同一对象循环引用的问题，默认为false，不配置有可能进入死循环
//				SerializerFeature.WriteMapNullValue, // 是否输出值为null的字段，默认为false
//				SerializerFeature.WriteNullBooleanAsFalse, // Boolean字段如果为null时，输出为false，而非null
//				SerializerFeature.WriteNullListAsEmpty, // List字段为null时，输出[]，而非null
//				SerializerFeature.WriteNullStringAsEmpty // 字符串类型字段如果为null，则输出为""，而非null
//		);
//
//		List<MediaType> mediaTypes = new ArrayList<>();
//		//　中文编码
//		MediaType mediaType = MediaType.APPLICATION_JSON_UTF8;
//		mediaTypes.add(mediaType);
//		fastJsonHttpMessageConverter.setSupportedMediaTypes(mediaTypes);
//
//		fastJsonHttpMessageConverter.setFastJsonConfig(config);
//		// 将fastjson添加到视图消息转换器列表内
//		converters.add(fastJsonHttpMessageConverter);
//	}

	@Bean
	public HttpMessageConverters fastJsonHttpMessageConventers() {
		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
		FastJsonConfig config = new FastJsonConfig();
//		config.setSerializerFeatures(
//				SerializerFeature.PrettyFormat,
//				SerializerFeature.WriteMapNullValue);
		// 修改配置返回内容的过滤
		config.setSerializerFeatures(
				SerializerFeature.DisableCircularReferenceDetect, // 消除对同一对象循环引用的问题，默认为false，不配置有可能进入死循环
				SerializerFeature.WriteMapNullValue, // 是否输出值为null的字段，默认为false
				SerializerFeature.WriteNullBooleanAsFalse, // Boolean字段如果为null时，输出为false，而非null
				SerializerFeature.WriteNullListAsEmpty, // List字段为null时，输出[]，而非null
				SerializerFeature.WriteNullStringAsEmpty // 字符串类型字段如果为null，则输出为""，而非null
		);
		List<MediaType> mediaTypes = new ArrayList<>();
		mediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
		converter.setSupportedMediaTypes(mediaTypes);
		return new HttpMessageConverters(converter);
	}

	public static void main(String[] args) {
		SpringApplication.run(StudyspringbootApplication.class, args);
	}
}
