
package com.porfolioweb.api.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PorcentajeSkill implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Long procentaje;

    public PorcentajeSkill() {
    }

    public PorcentajeSkill(Long id, Long procentaje) {
        this.id = id;
        this.procentaje = procentaje;
    }
    
    
}
