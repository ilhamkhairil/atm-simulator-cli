package com.ilhamkh.atm_simulator_cli.command;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class CommandArguments {
    private final String[] args;
}
