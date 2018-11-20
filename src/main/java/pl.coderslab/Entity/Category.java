package pl.coderslab.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100)
    private String name;
    @Column(columnDefinition = "TEXT", nullable = true)
    private String description;
    @ManyToMany(mappedBy = "categories")
    private List<Article> articles;

    public Category()
    {
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public List<Article> getArticles()
    {
        return articles;
    }

    public void setArticles(List<Article> articles)
    {
        this.articles = articles;
    }
}
