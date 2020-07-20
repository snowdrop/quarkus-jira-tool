package dev.snowdrop;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import picocli.CommandLine;

import javax.enterprise.context.ApplicationScoped;

@QuarkusMain
@ApplicationScoped
public class ClientApplication implements Runnable, QuarkusApplication {

    @Override
    public void run() {
        // business logic
        System.out.println("Say hello");
    }

    @Override
    public int run(String... args) throws Exception {
        if (args.length <= 0) {
            throw new IllegalArgumentException("No arguments passed");
        } else {
            HelloCommand helloCmd = new HelloCommand();
            CommandLine cl = new CommandLine(helloCmd);
            return cl.execute(args);
        }

    }
}

