package com.ilhamkh.atm_simulator_cli.command;


import com.ilhamkh.atm_simulator_cli.domain.Customer;
import com.ilhamkh.atm_simulator_cli.domain.Transaction;
import com.ilhamkh.atm_simulator_cli.service.BankService;
import com.ilhamkh.atm_simulator_cli.service.exceptions.BankServiceException;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.util.List;


public class DepositCommand extends AbstractCommand {

    public DepositCommand(@NotNull CommandArguments commandArguments) {
        super(commandArguments);
    }

    @Override
    @NotNull
    public String execute(BankService service) throws BankServiceException {
        if (args.length != 1) {
            throw new IllegalArgumentException("Wrong argument count.\n Correct command format 'deposit [amount]'");
        }

        BigDecimal amount = new BigDecimal(args[0]);
        List<Transaction> transactions = service.deposit(amount);
        Customer customer = service.getCurrentCustomer();
        return new StringBuilder()
                .append(printTransactionStatement(transactions, customer))
                .append(printBalanceStatement(customer))
                .append(printCreditStatement(customer))
                .append(printDebitStatement(customer))
                .toString();
    }
}
