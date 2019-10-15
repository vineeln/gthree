package gthree

import grails.testing.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*
import org.springframework.beans.factory.annotation.*

@Integration
@Rollback
@groovy.util.logging.Slf4j
class ExampleSpec extends Specification {

    static BookService _staticBookService;

    @Autowired
    BookService bookService;


    @javax.annotation.PostConstruct
    public void init() {
log.info "In PostConstruct"
println "In PostConstruct"
//_staticBookService.test();
      _staticBookService=bookService;
    }

    def setup() {
    }

    def cleanup() {
    }

    @Unroll
    void "test something"() {
        given:
          bookService.getAuthors();
            println "In Test"
log.info "In Test"
           
        expect:"fix me"
            bookService != null
            obj != null;
        _staticBookService != null

        where:
            //[obj] << bookService.getAuthors();
            //[obj] << _staticBookService.getAuthors();
            [obj] << ['abc']
    }
}
