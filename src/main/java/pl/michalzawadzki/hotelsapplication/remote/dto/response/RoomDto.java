package pl.michalzawadzki.hotelsapplication.remote.dto.response;

import java.math.BigDecimal;

public class RoomDto {
    private Integer id;
    private Integer beds;
    private BigDecimal price;

    public RoomDto() {
    }

    public RoomDto(Integer id, Integer beds, BigDecimal price) {
        this.id = id;
        this.beds = beds;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
