package otvoreni.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Ponude.
 */
@Entity
@Table(name = "ponude")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Ponude implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Column(name = "sifra_ponude", nullable = false)
    private Integer sifraPonude;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ponude id(Long id) {
        this.id = id;
        return this;
    }

    public Integer getSifraPonude() {
        return this.sifraPonude;
    }

    public Ponude sifraPonude(Integer sifraPonude) {
        this.sifraPonude = sifraPonude;
        return this;
    }

    public void setSifraPonude(Integer sifraPonude) {
        this.sifraPonude = sifraPonude;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Ponude)) {
            return false;
        }
        return id != null && id.equals(((Ponude) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Ponude{" +
            "id=" + getId() +
            ", sifraPonude=" + getSifraPonude() +
            "}";
    }
}
