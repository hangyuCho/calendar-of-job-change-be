package info.h9.domain.home;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="HOME")
public class Home {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "CONTENT")
    private String content;

}
