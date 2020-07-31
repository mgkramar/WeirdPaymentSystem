package com.study.demo.unit.fixtures.transaction;

import com.study.demo.dto.TransactionDTO;
import com.study.demo.unit.fixtures.account.AccountDTOFixtures;

public class TransactionDTOFixtures {

    public static TransactionDTO simpleTransaction() {

        return TransactionDTO.builder().amount(50L).transactionReference("000123321")
                .receiverAccount(AccountDTOFixtures.simpleReceiverAccount())
                .senderAccount(AccountDTOFixtures.simpleSenderAccount()).build();
    }

    public static TransactionDTO transactionMissingAmount() {

        return TransactionDTO.builder().transactionReference("000123321")
                .receiverAccount(AccountDTOFixtures.simpleReceiverAccount())
                .senderAccount(AccountDTOFixtures.simpleSenderAccount()).build();
    }

    public static TransactionDTO transactionWithAmountHigherThanLimit() {
        return TransactionDTO.builder().amount(50000L).transactionReference("000123321")
                .receiverAccount(AccountDTOFixtures.simpleReceiverAccount())
                .senderAccount(AccountDTOFixtures.simpleSenderAccount()).build();
    }

    public static TransactionDTO transactionWithAmountZero() {
        return TransactionDTO.builder().amount(0L).transactionReference("000123321")
                .receiverAccount(AccountDTOFixtures.simpleReceiverAccount())
                .senderAccount(AccountDTOFixtures.simpleSenderAccount()).build();
    }

    public static TransactionDTO transactionWithReferenceToPrevious() {
        return TransactionDTO.builder().amount(50L).transactionReference("000123321")
                .previousTransactionReference("5555555").receiverAccount(AccountDTOFixtures.simpleReceiverAccount())
                .senderAccount(AccountDTOFixtures.simpleSenderAccount()).build();
    }

    public static TransactionDTO transactionWithAccountsFromTheSameBank() {

        return TransactionDTO.builder().amount(50L).transactionReference("000123321")
                .receiverAccount(AccountDTOFixtures.simpleSenderAccount())
                .senderAccount(AccountDTOFixtures.simpleSenderAccount()).build();
    }

    public static TransactionDTO transactionWhoseBankCodeDiffersFromBankCodeOfSenderAccount() {

        return TransactionDTO.builder().amount(50L).transactionReference("000123321")
                .receiverAccount(AccountDTOFixtures.simpleReceiverAccount())
                .senderAccount(AccountDTOFixtures.simpleSenderAccount()).build();
    }
}