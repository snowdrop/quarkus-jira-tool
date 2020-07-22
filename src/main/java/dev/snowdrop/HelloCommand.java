package dev.snowdrop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;

public class HelloCommand {
    private final Logger logger = LoggerFactory.getLogger(HelloCommand.class);

    @CommandLine.Option(names = {"-n", "--name"}, description = "Who will we greet?", defaultValue = "World")
    String name;
}
