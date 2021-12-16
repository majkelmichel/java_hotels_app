package pl.michalzawadzki.hotelsapplication.remote.dto.response;

import pl.michalzawadzki.hotelsapplication.domain.Status;
import pl.michalzawadzki.hotelsapplication.remote.dto.request.PersonDto;
import pl.michalzawadzki.hotelsapplication.remote.dto.request.RoomReservationDto;

import java.util.List;

public class ReservationDto extends pl.michalzawadzki.hotelsapplication.remote.dto.request.ReservationDto {
    private Integer id;
    private Status status;

    public ReservationDto() {
    }

    public ReservationDto(Integer id, Status status) {
        this.id = id;
        this.status = status;
    }

    public ReservationDto(List<RoomReservationDto> rooms, PersonDto person, Integer id, Status status) {
        super(rooms, person);
        this.id = id;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
