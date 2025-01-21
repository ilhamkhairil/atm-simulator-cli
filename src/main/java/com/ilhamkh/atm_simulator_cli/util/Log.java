package com.ilhamkh.atm_simulator_cli.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Log {
    default Logger logger() {
        return LoggerFactory.getLogger(this.getClass());
    }
}
