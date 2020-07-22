package dev.snowdrop;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;

@QuarkusMain
@CommandLine.Command(name = "jira-tool", mixinStandardHelpOptions = true)
public class ClientApplication implements Runnable, QuarkusApplication {
    private final Logger logger = LoggerFactory.getLogger(ClientApplication.class);

    @CommandLine.Mixin
    HelloCommand helloCmd = new HelloCommand();

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
            ClientApplication clientApplication = new ClientApplication();
            CommandLine cl = new CommandLine(clientApplication);
            return cl.execute(args);
        }

    }
}

