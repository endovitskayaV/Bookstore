package ru.vsu.bookstore.domain.newspaper;

import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Proxy;
import ru.vsu.bookstore.domain.product.ProductEntity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Proxy(lazy = false)
@EqualsAndHashCode(callSuper = true)
@Table(name="newspaper")
public class NewspaperEntity extends ProductEntity implements Serializable {

    private int issue;

    @Override
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public long getId() {
        return super.getId();
    }

    @Override
    @Column(name="name")
    public String getName() {
        return super.getName();
    }

    @Column(name="issue")
    public int getIssue() {
        return issue;
    }

    @Override
    @Column(name="release_year")
    //@Check(constraints = "release_year>-1 and release_year<extract(year from now())")
    public int getReleaseYear() {
        return super.getReleaseYear();
    }


    @Override
    public void setId(long id){
        super.setId(id);
    }

    @Override
    public NewspaperEntity setName(String name){
        return (NewspaperEntity) super.setName(name);
    }

    public NewspaperEntity setIssue(int issue) {
        this.issue = issue;
        return this;
    }

    @Override
    public NewspaperEntity setReleaseYear(int releaseDate) {
      return (NewspaperEntity) super.setReleaseYear(releaseDate);
    }
}
