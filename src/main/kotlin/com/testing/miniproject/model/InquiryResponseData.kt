package com.testing.miniproject.model

import javax.xml.bind.annotation.*


@XmlRootElement(name = "tools.inquiryResponse")
@XmlAccessorType(XmlAccessType.FIELD)
data class InquiryResponseData(
      @field:XmlElement(name = "return")
      var _return: InquiryData? = null
)