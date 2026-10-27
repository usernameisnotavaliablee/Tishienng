package com.google.common.base;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class Ticker {
    private static final com.google.common.base.Ticker SYSTEM_TICKER = null;


    static {
            com.google.common.base.Ticker$1 r0 = new com.google.common.base.Ticker$1
            r0.<init>()
            com.google.common.base.Ticker.SYSTEM_TICKER = r0
            return
    }

    protected Ticker() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.common.base.Ticker systemTicker() {
            com.google.common.base.Ticker r0 = com.google.common.base.Ticker.SYSTEM_TICKER
            return r0
    }

    public abstract long read();
}
