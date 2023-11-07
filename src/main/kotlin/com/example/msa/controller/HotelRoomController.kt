package com.example.msa.controller

import org.springframework.format.annotation.DateTimeFormat
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate

@RestController // @Controller + @ResponseBody
class HotelRoomController {
    @GetMapping("/hotels/{hotelId}/rooms/{roomNumber}")
    fun getHotelRoomByPeriod(
        @PathVariable
        hotelId: Long?,
        @PathVariable
        roomNumber: String?,
        @RequestParam(value= "fromDate", required = false)
        @DateTimeFormat(pattern = "yyyyMMdd")
        fromDate: LocalDate?,
        @RequestParam(value= "toDate", required = false)
    @DateTimeFormat(pattern = "yyyyMMdd")
    toDate: LocalDate?
    ) /*: HotelRoomResponse*/{
        println("body")
    }
}