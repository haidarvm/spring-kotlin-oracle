package com.haidarvm.springkotlinoracle.Controller

import com.haidarvm.springkotlinoracle.Repositories.ArticleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author haidarvm on 10/1/19
 */
@RestController
@RequestMapping("api/article")
class ApiController {

    @Autowired
    lateinit var articleRepository: ArticleRepository

    @GetMapping("")
    fun findAll() = articleRepository.findAll()

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long) = articleRepository.findById(id)
}