package lab.desenvolvimento.regaluweb.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String modelName;
    private String modelYear;
    private String carDescription;

    public Veiculo(){}

    public Veiculo(String modelName, String modelYear, String description) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.carDescription = description;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public String getCarDescription() {
        return carDescription;
    }

    public void setCarDescription(String carDescription) {
        this.carDescription = carDescription;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", modelName='" + modelName + '\'' +
                ", modelYear='" + modelYear + '\'' +
                ", carDescription=" + carDescription +
                '}';
    }
}

