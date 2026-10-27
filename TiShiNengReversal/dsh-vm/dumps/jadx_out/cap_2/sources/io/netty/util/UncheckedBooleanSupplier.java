package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface UncheckedBooleanSupplier extends io.netty.util.BooleanSupplier {
    public static final io.netty.util.UncheckedBooleanSupplier FALSE_SUPPLIER = null;
    public static final io.netty.util.UncheckedBooleanSupplier TRUE_SUPPLIER = null;



    static {
            io.netty.util.UncheckedBooleanSupplier$1 r0 = new io.netty.util.UncheckedBooleanSupplier$1
            r0.<init>()
            io.netty.util.UncheckedBooleanSupplier.FALSE_SUPPLIER = r0
            io.netty.util.UncheckedBooleanSupplier$2 r0 = new io.netty.util.UncheckedBooleanSupplier$2
            r0.<init>()
            io.netty.util.UncheckedBooleanSupplier.TRUE_SUPPLIER = r0
            return
    }

    @Override // io.netty.util.BooleanSupplier
    boolean get();
}
