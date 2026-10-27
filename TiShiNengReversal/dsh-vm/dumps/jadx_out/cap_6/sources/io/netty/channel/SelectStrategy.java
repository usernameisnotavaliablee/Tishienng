package io.netty.channel;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface SelectStrategy {
    public static final int BUSY_WAIT = -3;
    public static final int CONTINUE = -2;
    public static final int SELECT = -1;

    int calculateStrategy(io.netty.util.IntSupplier r1, boolean r2) throws java.lang.Exception;
}
