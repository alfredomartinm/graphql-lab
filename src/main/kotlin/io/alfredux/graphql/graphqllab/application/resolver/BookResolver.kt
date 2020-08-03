package io.alfredux.graphql.graphqllab.application.resolver

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import io.alfredux.graphql.graphqllab.domain.entity.Book
import org.springframework.stereotype.Component
import java.util.stream.Collectors.toList
import java.util.stream.IntStream

@Component
    class BookResolver() : GraphQLQueryResolver {
    fun books(): List<Book> {
        return IntStream.range(1, 10)
                .boxed()
                .map { i -> Book(
                        id = "$i",
                        name = "name${i}",
                        description = "description${i}") }
                .collect(toList());
    }
}