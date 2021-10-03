package lab.desenvolvimento.regaluweb.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Long value;
    private Long userRequiringId;
    private Date locateDate;
    private Date returnDate;
    private Long vehicleId;

    public Pedido(){}

    public Pedido(Long value, Long userRequiringId, Date locateDate, Date returnDate, Long vehicleId) {
        this.value = value;
        this.userRequiringId = userRequiringId;
        this.locateDate = locateDate;
        this.returnDate = returnDate;
        this.vehicleId = vehicleId;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public Long getUserRequiringId() {
        return userRequiringId;
    }

    public void setUserRequiringId(Long userRequiringId) {
        this.userRequiringId = userRequiringId;
    }

    public Date getLocateDate() {
        return locateDate;
    }

    public void setLocateDate(Date locateDate) {
        this.locateDate = locateDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", userRequiringId='" + userRequiringId + '\'' +
                ", locateDate='" + locateDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                ", vehicleId=" + vehicleId +
                '}';
    }
}
