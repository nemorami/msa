package com.example.msa.controller
import com.example.msa.domain.Hotel
import com.example.msa.domain.HotelSearchService
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody
@Controller
class ApiController(val hotelSearchService: HotelSearchService) {
    //@ResponseBody
    @GetMapping("/hotels/{hotelId}")
    fun getHotelById(@PathVariable hotelId: Long?): ResponseEntity<Hotel> {
        val hotel = hotelSearchService.getHotelById(hotelId)
        return ResponseEntity.ok(hotel)
    }
}


