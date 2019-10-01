package com.haidarvm.springkotlinoracle.Repositories

import com.haidarvm.springkotlinoracle.Models.Article
import org.springframework.data.jpa.repository.JpaRepository

/**
 * @author haidarvm on 10/1/19
 */
interface ArticleRepository: JpaRepository<Article, Long> {
}