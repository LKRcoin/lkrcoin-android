package com.lkrcoin.core.coins.families;

import com.lkrcoin.core.coins.CoinType;
import com.lkrcoin.core.exceptions.AddressMalformedException;
import com.lkrcoin.core.wallet.families.bitcoin.BitAddress;

/**
 * @author John L. Jegutanis
 *
 * This is the classical Bitcoin family that includes Litecoin, Dogecoin, Dash, etc
 */
public abstract class BitFamily extends CoinType {
    {
        family = Families.BITCOIN;
    }

    @Override
    public BitAddress newAddress(String addressStr) throws AddressMalformedException {
        return BitAddress.from(this, addressStr);
    }
}
