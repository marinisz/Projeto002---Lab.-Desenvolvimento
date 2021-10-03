package lab.desenvolvimento.regaluweb.dto;

import lab.desenvolvimento.regaluweb.models.Pedido;
import lab.desenvolvimento.regaluweb.models.Usuario;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class RequisicaoNovoPedido {
    @NotNull
    private Long value;
    @NotNull
    private Long userRequiringId;
    @NotNull
    private Date locateDate;
    @NotNull
    private Date returnDate;
    @NotNull
    private Long vehicleId;

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

    public Pedido toPedido(){
        Pedido pedido = new Pedido();
        pedido.setValue(value);
        pedido.setUserRequiringId(userRequiringId);
        pedido.setLocateDate(locateDate);
        pedido.setReturnDate(returnDate);
        pedido.setVehicleId(vehicleId);
        return pedido;
    }

    public String toString() {
        return "Pedido{" +
                "value='" + value + '\'' +
                "userRequiringId='" + userRequiringId + '\'' +
                "locateDate='" + locateDate + '\'' +
                "returnDate='" + returnDate + '\'' +
                ", vehicleId=" + vehicleId +
                '}';
    }
}