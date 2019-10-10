package gthree

import grails.testing.mixin.integration.Integration
import grails.transaction.*
import spock.lang.Specification
import org.springframework.beans.factory.annotation.*

@Integration
@Rollback
class ExampleSpec extends Specification {

    @Autowired
    BookService bookService;

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            bookService != null
    }
}
