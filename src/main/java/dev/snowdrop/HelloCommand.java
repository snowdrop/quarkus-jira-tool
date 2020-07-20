package dev.snowdrop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;


@CommandLine.Command(name = "jira-tool", mixinStandardHelpOptions = true)
public class HelloCommand implements Runnable{
    private final Logger logger = LoggerFactory.getLogger(HelloCommand.class);

    @CommandLine.Option(names = {"-n", "--name"}, description = "Who will we greet?", defaultValue = "World")
    String name;

    @Override
    public void run() {
        logger.info("Say hello from the Command");
    }
}
