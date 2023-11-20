package com.book.msa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@SpringBootApplication
@EnableZuulProxy
class MsaZuulServerApplication

fun main(args: Array<String>) {
    runApplication<MsaZuulServerApplication>(*args)
}
