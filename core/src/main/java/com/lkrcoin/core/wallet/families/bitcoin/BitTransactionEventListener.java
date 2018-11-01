package com.lkrcoin.core.wallet.families.bitcoin;

import com.lkrcoin.core.network.AddressStatus;
import com.lkrcoin.core.network.ServerClient.UnspentTx;
import com.lkrcoin.core.network.interfaces.TransactionEventListener;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
public interface BitTransactionEventListener extends TransactionEventListener<BitTransaction> {
    void onUnspentTransactionUpdate(AddressStatus status, List<UnspentTx> UnspentTxes);
}
