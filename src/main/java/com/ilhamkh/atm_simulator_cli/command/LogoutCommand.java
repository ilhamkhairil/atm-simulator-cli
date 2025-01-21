package com.ilhamkh.atm_simulator_cli.command;


import com.ilhamkh.atm_simulator_cli.domain.Customer;
import com.ilhamkh.atm_simulator_cli.service.BankService;
import com.ilhamkh.atm_simulator_cli.service.exceptions.BankServiceException;
import org.jetbrains.annotations.NotNull;


public class LogoutCommand extends AbstractCommand {

    public LogoutCommand(@NotNull CommandArguments commandArguments) {
        super(commandArguments);
    }

    @Override
    @NotNull
    public String execute(BankService service) throws BankServiceException {
        if (args.length != 0) {
            throw new IllegalArgumentException("Wrong argument count.\n Correct command format 'logout'");
        }

        Customer customer = service.logout();
        return new StringBuilder()
                .append("Goodbye, ")
                .append(customer.getLoginName())
                .append("!")
                .append("\n")
                .append("\n")
                .toString();
    }
}

