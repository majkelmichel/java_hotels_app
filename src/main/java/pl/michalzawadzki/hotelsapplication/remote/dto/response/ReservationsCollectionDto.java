package pl.michalzawadzki.hotelsapplication.remote.dto.response;

import java.util.List;

public class ReservationsCollectionDto {
    private List<ReservationDto> reservations;

    public ReservationsCollectionDto() {
    }

    public ReservationsCollectionDto(List<ReservationDto> reservations) {
        this.reservations = reservations;
    }

    public List<ReservationDto> getReservations() {
        return reservations;
    }

    public void setReservations(List<ReservationDto> reservations) {
        this.reservations = reservations;
    }
}
