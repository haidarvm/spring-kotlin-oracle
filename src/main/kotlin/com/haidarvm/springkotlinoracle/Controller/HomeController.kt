package com.haidarvm.springkotlinoracle.Controller

import com.haidarvm.springkotlinoracle.Models.Article
import com.haidarvm.springkotlinoracle.Repositories.ArticleRepository
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

/**
 * @author haidarvm on 10/1/19
 */
@Controller
class HomeController(val articleRepository: ArticleRepository) {

    @GetMapping("")
    fun home() = "home"

    @GetMapping("test/{name}")
    fun test(@PathVariable name: String, model: Model): String {
        model.addAttribute("name" , name)
        return "test"
    }

    @GetMapping("insert/{title}")
    fun insert(@PathVariable title: String, model: Model): String {
        val newArticle = Article(0, title, "Your Body Description")
        val savedArticle =  articleRepository.save(newArticle)
        model.addAttribute("article", savedArticle)
        return "article"
    }

    fun check() {

    }
}