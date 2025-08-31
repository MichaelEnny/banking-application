package com.banking.syntra.account.service.model.dto;

import lombok.Data;
import com.banking.syntra.account.service.model.AccountStatus;

@Data
public class AccountStatusUpdate {
    AccountStatus accountStatus;
}
