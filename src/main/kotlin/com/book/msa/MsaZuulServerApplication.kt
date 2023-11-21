package com.book.msa

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MsaZuulServerApplication

fun main(args: Array<String>) {
    runApplication<MsaZuulServerApplication>(*args)
}
