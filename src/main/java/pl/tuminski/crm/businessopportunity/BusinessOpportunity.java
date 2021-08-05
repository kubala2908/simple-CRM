package pl.tuminski.crm.businessopportunity;

import lombok.Getter;
import lombok.Setter;
import pl.tuminski.crm.client.Client;
import pl.tuminski.crm.machine.Machine;
import pl.tuminski.crm.salesman.Salesman;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "BO")
public class BusinessOpportunity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int value;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Client client;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Machine machine;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Salesman salesman;
}
