package user3647093configlist

import org.springframework.beans.factory.annotation.Value

class BootStrap {

    @Value('${music.drummers}')
    List<String> drummerNames

    def init = { servletContext ->
        println 'Drummers:'
        for(String name : drummerNames) {
            println "\t$name"
        }
    }

    def destroy = {
    }
}
