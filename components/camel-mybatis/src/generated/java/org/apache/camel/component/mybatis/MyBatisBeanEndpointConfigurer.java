/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mybatis;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MyBatisBeanEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("beanName", java.lang.String.class);
        map.put("methodName", java.lang.String.class);
        map.put("executorType", org.apache.ibatis.session.ExecutorType.class);
        map.put("inputHeader", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("outputHeader", java.lang.String.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        MyBatisBeanEndpoint target = (MyBatisBeanEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "executortype":
        case "executorType": target.setExecutorType(property(camelContext, org.apache.ibatis.session.ExecutorType.class, value)); return true;
        case "inputheader":
        case "inputHeader": target.setInputHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "outputheader":
        case "outputHeader": target.setOutputHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        MyBatisBeanEndpoint target = (MyBatisBeanEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "executortype":
        case "executorType": return target.getExecutorType();
        case "inputheader":
        case "inputHeader": return target.getInputHeader();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "outputheader":
        case "outputHeader": return target.getOutputHeader();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}

