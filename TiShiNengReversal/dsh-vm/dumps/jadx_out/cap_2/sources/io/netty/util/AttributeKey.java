package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class AttributeKey<T> extends io.netty.util.AbstractConstant<io.netty.util.AttributeKey<T>> {
    private static final io.netty.util.ConstantPool<io.netty.util.AttributeKey<java.lang.Object>> pool = null;


    static {
            io.netty.util.AttributeKey$1 r0 = new io.netty.util.AttributeKey$1
            r0.<init>()
            io.netty.util.AttributeKey.pool = r0
            return
    }

    private AttributeKey(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* synthetic */ AttributeKey(int r1, java.lang.String r2, io.netty.util.AttributeKey.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static boolean exists(java.lang.String r1) {
            io.netty.util.ConstantPool<io.netty.util.AttributeKey<java.lang.Object>> r0 = io.netty.util.AttributeKey.pool
            boolean r1 = r0.exists(r1)
            return r1
    }

    public static <T> io.netty.util.AttributeKey<T> newInstance(java.lang.String r1) {
            io.netty.util.ConstantPool<io.netty.util.AttributeKey<java.lang.Object>> r0 = io.netty.util.AttributeKey.pool
            io.netty.util.Constant r1 = r0.newInstance(r1)
            io.netty.util.AttributeKey r1 = (io.netty.util.AttributeKey) r1
            return r1
    }

    public static <T> io.netty.util.AttributeKey<T> valueOf(java.lang.Class<?> r1, java.lang.String r2) {
            io.netty.util.ConstantPool<io.netty.util.AttributeKey<java.lang.Object>> r0 = io.netty.util.AttributeKey.pool
            io.netty.util.Constant r1 = r0.valueOf(r1, r2)
            io.netty.util.AttributeKey r1 = (io.netty.util.AttributeKey) r1
            return r1
    }

    public static <T> io.netty.util.AttributeKey<T> valueOf(java.lang.String r1) {
            io.netty.util.ConstantPool<io.netty.util.AttributeKey<java.lang.Object>> r0 = io.netty.util.AttributeKey.pool
            io.netty.util.Constant r1 = r0.valueOf(r1)
            io.netty.util.AttributeKey r1 = (io.netty.util.AttributeKey) r1
            return r1
    }
}
