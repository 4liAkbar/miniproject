package com.testing.miniproject

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.testing.miniproject.model.InquiryData
import com.testing.miniproject.model.InquiryRequestData
import com.testing.miniproject.model.InquiryResponseData

import org.springframework.ws.server.endpoint.annotation.Endpoint
import org.springframework.ws.server.endpoint.annotation.PayloadRoot
import org.springframework.ws.server.endpoint.annotation.RequestPayload
import org.springframework.ws.server.endpoint.annotation.ResponsePayload


@Endpoint
class InquiryEndpoint(private val inquiryRepository: InquiryRepository) {

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "tools.inquiry")
    @ResponsePayload
    fun getInquiry(@RequestPayload request: InquiryRequestData): InquiryResponseData {
        val response = InquiryResponseData()
        val inqData = InquiryData()

        val mapper = jacksonObjectMapper()
        println(mapper.writeValueAsString(request))

        //jika check db
        //response.setReturn(inquiryRepository.findInquiry(request.transactionID))

        inqData.transactionID = request.transactionID
        inqData.channelID = request.channelID
        inqData.terminalID = request.terminalID
        inqData.transactionDate = request.transactionDate
        inqData.companyCode = request.companyCode
        inqData.customerKey1 = request.customerKey1
        inqData.customerKey2 = request.customerKey2
        inqData.customerKey3 = request.customerKey3
        inqData.billDetail = ""
        inqData.currency = "IDR"
        inqData.amount = ""
        inqData.paidAmount = ""
        inqData.customerName = "LenderStaging"
        inqData.additionalData1 = request.additionalData1
        inqData.additionalData2 = request.additionalData2
        inqData.additionalData3 = request.additionalData3
        inqData.additionalData4 = request.additionalData4
        inqData.flagPayment = ""
        inqData.responseCode = "00"
        inqData.responseDescription = "SUCCESS"

        response._return = inqData

        return response
    }

}

private const val NAMESPACE_URI = "https://test.inquiry/"