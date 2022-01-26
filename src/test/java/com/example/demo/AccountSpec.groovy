package com.example.demo


import org.springframework.http.ResponseEntity
import spock.lang.Specification

class AccountSpec extends Specification {
    def "test"(){
        given:
        def account = Linkedlist<AccountController>()
        when:
        AccountController.getAccountsById(1)
        then:
        return new ResponseEntity<>(accounts)
    }
}
