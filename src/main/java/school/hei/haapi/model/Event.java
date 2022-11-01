package school.hei.haapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@AllArgsConstructor
@Data
@Table(name="\"event\"")
@NoArgsConstructor
@Builder
@Entity
@EqualsAndHashCode
public class Event implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String id;
  @NotBlank
  @Column(name = "event_type" , nullable = false )
  private String eventType;
  @NotBlank(message = "must not be blank")
  @NotEmpty
  private String startTime;
  @NotBlank
  @NotEmpty
  private String endTime;

  @ManyToOne
  @JoinColumn(name = "id_place")
  @Cascade(CascadeType.REMOVE)
  private Place place;
}
