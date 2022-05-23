package ru.voronezhtsev.sbi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.spi.DocumentationType.OAS_30
import springfox.documentation.spring.web.plugins.Docket

@SpringBootApplication
class Application {

    @Bean
    fun api(): Docket {
        return Docket(OAS_30)
            .select()
            .apis(RequestHandlerSelectors.basePackage("ru.voronezhtsev.sbi"))
            .paths(PathSelectors.any())
            .build()
    }
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
