package com.testing.miniproject.model

import javax.xml.bind.annotation.*

@XmlRootElement(name = "tools.inquiry")
@XmlAccessorType(XmlAccessType.FIELD)
data class InquiryRequestData (
    @field:XmlElement(name = "TransactionID")
    var transactionID: String? = null,

    @field:XmlElement(name = "ChannelID")
    var channelID: String? = null,

    @field:XmlElement(name = "TerminalID")
    var terminalID: String? = null,

    @field:XmlElement(name = "TransactionDate")
    var transactionDate: String? = null,

    @field:XmlElement(name = "CompanyCode")
    var companyCode: String? = null,

    @field:XmlElement(name = "CustomerKey1")
    var customerKey1: String? = null,

    @field:XmlElement(name = "CustomerKey2")
    var customerKey2: String? = null,

    @field:XmlElement(name = "CustomerKey3")
    var customerKey3: String? = null,

    @field:XmlElement(name = "AdditionalData1")
    var additionalData1: String? = null,

    @field:XmlElement(name = "AdditionalData2")
    var additionalData2: String? = null,

    @field:XmlElement(name = "AdditionalData3")
    var additionalData3: String? = null,

    @field:XmlElement(name = "AdditionalData4")
    var additionalData4: String? = null
)