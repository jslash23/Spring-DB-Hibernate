package com.lesson5.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppConfig.class};//теперь у нас наш джава клас который исполняет роль
        //web.xml знает где находится конфигурация
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};// это значит что все запросы пользователя посылаем на диспетчерСервлет
    }
}
