package com.haidarvm.springkotlinoracle.Repositories

import com.haidarvm.springkotlinoracle.Models.Article
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

/**
 * @author haidarvm on 10/1/19
 */
@RepositoryRestResource(collectionResourceRel = "article", path = "articles")
interface ArticleRepository: JpaRepository<Article, Long> {
}