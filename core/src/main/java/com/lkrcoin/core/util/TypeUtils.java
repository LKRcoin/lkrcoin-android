package com.lkrcoin.core.util;

import com.lkrcoin.core.coins.CoinType;
import com.lkrcoin.core.coins.ValueType;
import com.lkrcoin.core.wallet.AbstractAddress;
import com.lkrcoin.core.wallet.WalletAccount;

/**
 * @author John L. Jegutanis
 */
public class TypeUtils {
    public static boolean is(CoinType myType, WalletAccount other) {
        return other != null && myType.equals(other.getCoinType());
    }
    
    public static boolean is(CoinType myType, ValueType otherType) {
        return otherType != null && myType.equals(otherType);
    }
    
    public static boolean is(CoinType myType, AbstractAddress address) {
        return address != null && myType.equals(address.getType());
    }
}
