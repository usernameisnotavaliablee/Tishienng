package com.google.common.escape;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class Escaper {
    private final com.google.common.base.Function<java.lang.String, java.lang.String> asFunction;


    protected Escaper() {
            r1 = this;
            r1.<init>()
            com.google.common.escape.Escaper$1 r0 = new com.google.common.escape.Escaper$1
            r0.<init>(r1)
            r1.asFunction = r0
            return
    }

    public final com.google.common.base.Function<java.lang.String, java.lang.String> asFunction() {
            r1 = this;
            com.google.common.base.Function<java.lang.String, java.lang.String> r0 = r1.asFunction
            return r0
    }

    public abstract java.lang.String escape(java.lang.String r1);
}
