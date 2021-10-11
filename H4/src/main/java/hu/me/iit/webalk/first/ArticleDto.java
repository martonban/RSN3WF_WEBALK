package hu.me.iit.webalk.first;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class ArticleDto {

    @NotNull
    private Long Id;

    @NotNull
    @NotBlank
    private String author;
    @NotBlank
    private String title;
    @Min(10)
    private Integer pages;


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "ArticelDto{" +
                "Id=" + Id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleDto that = (ArticleDto) o;
        return Id.equals(that.Id) && author.equals(that.author) && title.equals(that.title) && pages.equals(that.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, author, title, pages);
    }
}
