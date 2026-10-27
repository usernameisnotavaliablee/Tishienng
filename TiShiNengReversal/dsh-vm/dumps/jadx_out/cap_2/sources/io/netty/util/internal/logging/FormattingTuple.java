package io.netty.util.internal.logging;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class FormattingTuple {
    private final java.lang.String message;
    private final java.lang.Throwable throwable;

    FormattingTuple(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>()
            r0.message = r1
            r0.throwable = r2
            return
    }

    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }

    public java.lang.Throwable getThrowable() {
            r1 = this;
            java.lang.Throwable r0 = r1.throwable
            return r0
    }
}
