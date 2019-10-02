package com.haidarvm.springkotlinoracle.Models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * @author haidarvm on 10/1/19
 */
@Entity
class Article(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var articleId: Long = 0,
        var title: String = "",
        var body: String =""
)