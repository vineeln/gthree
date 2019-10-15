package gthree

import grails.gorm.transactions.Transactional

@groovy.util.logging.Slf4j
@Transactional
class BookService {

    def getAuthors() {
      log.info "In GetAuthors"
      [ 'auth1', 'auth2' ]
    }
    def serviceMethod() {

    }
}
