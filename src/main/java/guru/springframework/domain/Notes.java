package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(exclude = {"recipe"})
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String recipeNotes;



    @OneToOne
    private Recipe recipe;

    public Notes() {
    }


    protected boolean canEqual(final Object other) {
        return other instanceof Notes;
    }

}
