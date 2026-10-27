package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class SslCompletionEvent {
    private final java.lang.Throwable cause;

    SslCompletionEvent() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.cause = r0
            return
    }

    SslCompletionEvent(java.lang.Throwable r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "cause"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r1.cause = r2
            return
    }

    public final java.lang.Throwable cause() {
            r1 = this;
            java.lang.Throwable r0 = r1.cause
            return r0
    }

    public final boolean isSuccess() {
            r1 = this;
            java.lang.Throwable r0 = r1.cause
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.Throwable r0 = r3.cause()
            if (r0 != 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "(SUCCESS)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L20:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r1.append(r2)
            r2 = 40
            r1.append(r2)
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
