package crud.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "car")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @Id
    @Column( name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column( name = "modelName")
    private  String modelName;
    @Column( name = "type")
    private String type;

    public Car(String modelName, String type) {
        this.modelName = modelName;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{ id=" + id + " modelName=" + modelName + " type=" + type + " }";

    }
}
