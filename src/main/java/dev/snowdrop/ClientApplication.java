package dev.snowdrop;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import picocli.CommandLine;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@QuarkusMain
@ApplicationScoped
@CommandLine.Command(name = "jira-tool", mixinStandardHelpOptions = true)
public class ClientApplication implements Runnable, QuarkusApplication {

    @Inject
    CommandLine.IFactory factory;

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
            return new CommandLine(this, factory).execute(args);
        }

    }
}

