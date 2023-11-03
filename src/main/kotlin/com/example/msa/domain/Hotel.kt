package com.example.msa.domain

import org.springframework.stereotype.Service
import java.util.*


data class Hotel(val hotelId: Long?, val name: String?, val address: String?, val roomCount: Int?)


@Service
class HotelSearchService {
    fun getHotelById(hotelId: Long?): Hotel {
        return Hotel(
            hotelId!!,
            "The Continental",
            "1 Wall St, New York, NY 10005",
            250
        )
    }
}