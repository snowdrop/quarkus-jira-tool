package dev.snowdrop;

import picocli.CommandLine;

public class Args {
    @CommandLine.Option(names = {"-n", "--name"}, description = "Who will we greet?", defaultValue = "World")
    String name;
}
