package com.testing.miniproject

import org.springframework.boot.web.servlet.ServletRegistrationBean
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.ClassPathResource
import org.springframework.ws.config.annotation.EnableWs
import org.springframework.ws.config.annotation.WsConfigurerAdapter
import org.springframework.ws.transport.http.MessageDispatcherServlet
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition
import org.springframework.xml.xsd.SimpleXsdSchema
import org.springframework.xml.xsd.XsdSchema


@EnableWs
@Configuration
class WebServiceConfig : WsConfigurerAdapter() {
    @Bean
    fun messageDispatcherServlet(applicationContext: ApplicationContext): ServletRegistrationBean<MessageDispatcherServlet> {
        val servlet = MessageDispatcherServlet()
        servlet.setApplicationContext(applicationContext)
        servlet.isTransformWsdlLocations = true
        return ServletRegistrationBean(servlet, "/ws/*")
    }

    //CIMB INQUIRY
    @Bean(name = ["inquiry"])
    fun cimbInquiryDefinition(inquirySchema: XsdSchema): DefaultWsdl11Definition {
        val soapInqDefinition = DefaultWsdl11Definition()
        soapInqDefinition.setPortTypeName("InquiryPort")
        soapInqDefinition.setLocationUri("/ws")
        soapInqDefinition.setTargetNamespace("https://test.inquiry/")
        soapInqDefinition.setSchema(inquirySchema)
        return soapInqDefinition
    }
    @Bean
    fun inquirySchema(): XsdSchema {
        return SimpleXsdSchema(ClassPathResource("inquiry.xsd"))
    }
}