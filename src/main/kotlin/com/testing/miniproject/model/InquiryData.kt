package com.testing.miniproject.model

import javax.xml.bind.annotation.*

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "return")
data class InquiryData (
    @XmlElement(name = "TransactionID")
    var transactionID: String? = null,

    @XmlElement(name = "ChannelID")
    var channelID: String? = null,

    @XmlElement(name = "TerminalID")
    var terminalID: String? = null,

    @XmlElement(name = "TransactionDate")
    var transactionDate: String? = null,

    @XmlElement(name = "CompanyCode")
    var companyCode: String? = null,

    @XmlElement(name = "CustomerKey1")
    var customerKey1: String? = null,

    @XmlElement(name = "CustomerKey2")
    var customerKey2: String? = null,

    @XmlElement(name = "CustomerKey3")
    var customerKey3: String? = null,

    @XmlElement(name = "AdditionalData1")
    var additionalData1: String? = null,

    @XmlElement(name = "AdditionalData2")
    var additionalData2: String? = null,

    @XmlElement(name = "AdditionalData3")
    var additionalData3: String? = null,

    @XmlElement(name = "AdditionalData4")
    var additionalData4: String? = null,

    @XmlElement(name = "BillDetail")
    var billDetail: String? = null,

    @XmlElement(name = "Currency")
    var currency: String? = null,

    @XmlElement(name = "Amount")
    var amount: String? = null,

    @XmlElement(name = "Fee")
    var fee: String? = null,

    @XmlElement(name = "PaidAmount")
    var paidAmount: String? = null,

    @XmlElement(name = "CustomerName")
    var customerName: String? = null,

    @XmlElement(name = "FlagPayment")
    var flagPayment: String? = null,

    @XmlElement(name = "ResponseCode")
    var responseCode: String? = null,

    @XmlElement(name = "ResponseDescription")
    var responseDescription: String? = null
)