package pl.michalzawadzki.hotelsapplication.remote.dto.request;

import java.util.List;

public class ReservationDto {
    protected List<RoomReservationDto> rooms;
    protected PersonDto person;

    public ReservationDto() {
    }

    public ReservationDto(List<RoomReservationDto> rooms, PersonDto person) {
        this.rooms = rooms;
        this.person = person;
    }

    public List<RoomReservationDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomReservationDto> rooms) {
        this.rooms = rooms;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }
}
