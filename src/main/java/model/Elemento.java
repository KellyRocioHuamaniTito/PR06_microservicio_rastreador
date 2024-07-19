package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor // lombok
@AllArgsConstructor// lombok
@Data// lombok
public class Elemento {
    private String nombre;
    private String categoria;
    private double precioUnitario;
    private String tienda;
}
