package dev.snowdrop;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;

import javax.enterprise.context.ApplicationScoped;

@QuarkusMain
@ApplicationScoped
public class ClientApplication implements Runnable, QuarkusApplication {
    private final Logger logger = LoggerFactory.getLogger(ClientApplication.class);
    HelloCommand helloCmd;

    @Override
    public void run() {
        // business logic
        logger.info("Say from " + helloCmd.name);
    }

    @Override
    public int run(String... args) throws Exception {
        if (args.length <= 0) {
            throw new IllegalArgumentException("No arguments passed");
        } else {
            helloCmd = new HelloCommand();
            CommandLine cl = new CommandLine(helloCmd);
            return cl.execute(args);
        }

    }
}

