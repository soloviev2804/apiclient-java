package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The [GetTransactionHistory] function result item.
*/
public class TransactionInfoType implements Alignable {

    private Long transactionId;

    /**
    * The transaction ID.
    */
    public Long getTransactionId() {
        return this.transactionId;
    }

    public boolean hasTransactionId() {
        return this.transactionId != null;
    }

    private String accountId;

    /**
    * The account ID.
    */
    public String getAccountId() {
        return this.accountId;
    }

    public boolean hasAccountId() {
        return this.accountId != null;
    }

    @JsonDeserialize(using=com.voximplant.apiclient.util.TimestampDeserializer.class)
    private Date performedAt;

    /**
    * The transaction date in the selected timezone in 24-h format:
    * YYYY-MM-DD HH:mm:ss
    */
    public Date getPerformedAt() {
        return this.performedAt;
    }

    public boolean hasPerformedAt() {
        return this.performedAt != null;
    }

    private BigDecimal amount;

    /**
    * The transaction amount, $.
    */
    public BigDecimal getAmount() {
        return this.amount;
    }

    public boolean hasAmount() {
        return this.amount != null;
    }

    private String currency;

    /**
    * The amount currency (USD, RUR, EUR, ...). 
    */
    public String getCurrency() {
        return this.currency;
    }

    public boolean hasCurrency() {
        return this.currency != null;
    }

    private String transactionType;

    /**
    * The transaction type. The following values are possible:
    * periodic_charge, resource_charge, money_distribution,
    * subscription_charge, subscription_installation_charge,
    * card_periodic_payment, card_overrun_payment, card_payment,
    * robokassa_payment, gift, add_money, subscription_cancel, adjustment,
    * wire_transfer, refund.
    */
    public String getTransactionType() {
        return this.transactionType;
    }

    public boolean hasTransactionType() {
        return this.transactionType != null;
    }

    private String transactionDescription;

    /**
    * The transaction description.
    */
    public String getTransactionDescription() {
        return this.transactionDescription;
    }

    public boolean hasTransactionDescription() {
        return this.transactionDescription != null;
    }

    private String paymentReference;

    /**
    * The external payment reference. See the [TransferMoneyToChildAccount]
    * function.
    */
    public String getPaymentReference() {
        return this.paymentReference;
    }

    public boolean hasPaymentReference() {
        return this.paymentReference != null;
    }

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (transactionId != null) {
            sb.append(aligned)
                .append("\"transactionId\": \"")
                .append(transactionId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accountId != null) {
            sb.append(aligned)
                .append("\"accountId\": \"")
                .append(accountId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (performedAt != null) {
            sb.append(aligned)
                .append("\"performedAt\": \"")
                .append(performedAt)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (amount != null) {
            sb.append(aligned)
                .append("\"amount\": \"")
                .append(amount)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (currency != null) {
            sb.append(aligned)
                .append("\"currency\": \"")
                .append(currency)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (transactionType != null) {
            sb.append(aligned)
                .append("\"transactionType\": \"")
                .append(transactionType)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (transactionDescription != null) {
            sb.append(aligned)
                .append("\"transactionDescription\": \"")
                .append(transactionDescription)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (paymentReference != null) {
            sb.append(aligned)
                .append("\"paymentReference\": \"")
                .append(paymentReference)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}