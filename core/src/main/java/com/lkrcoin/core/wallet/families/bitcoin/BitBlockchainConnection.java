package com.lkrcoin.core.wallet.families.bitcoin;

import com.lkrcoin.core.network.AddressStatus;
import com.lkrcoin.core.network.interfaces.BlockchainConnection;

/**
 * @author John L. Jegutanis
 */
public interface BitBlockchainConnection extends BlockchainConnection<BitTransaction> {
    void getUnspentTx(AddressStatus status, BitTransactionEventListener listener);
}
