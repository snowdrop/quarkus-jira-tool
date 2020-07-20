package dev.snowdrop;

import javax.enterprise.context.Dependent;

@Dependent
class GreetingService {
    void sayHello(String name) {
        System.out.println("Hello " + name + "!");
    }
}
