package pl.michalzawadzki.hotelsapplication.remote.dto.response;

import java.util.List;

public class HotelsCollectionDto {
    private List<HotelDto> hotels;

    public HotelsCollectionDto() {
    }

    public HotelsCollectionDto(List<HotelDto> hotels) {
        this.hotels = hotels;
    }

    public List<HotelDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelDto> hotels) {
        this.hotels = hotels;
    }
}
