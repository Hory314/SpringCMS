package pl.coderslab.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.Dao.ArticleDao;

@Controller

public class HomePageController
{
    @Autowired
    ArticleDao articleDao;

    @RequestMapping(path = "/home", produces = "text/html;charset=UTF-8")
    public String main(Model m)
    {
        m.addAttribute("articles", articleDao.findAll(5));
        return "main";
    }
}
