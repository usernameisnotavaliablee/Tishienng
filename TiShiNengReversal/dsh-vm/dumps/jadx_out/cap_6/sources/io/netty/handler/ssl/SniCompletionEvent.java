package io.netty.handler.ssl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class SniCompletionEvent extends io.netty.handler.ssl.SslCompletionEvent {
    private final java.lang.String hostname;

    SniCompletionEvent(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.hostname = r1
            return
    }

    SniCompletionEvent(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r2)
            r0.hostname = r1
            return
    }

    SniCompletionEvent(java.lang.Throwable r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public java.lang.String hostname() {
            r1 = this;
            java.lang.String r0 = r1.hostname
            return r0
    }

    @Override // io.netty.handler.ssl.SslCompletionEvent
    public java.lang.String toString() {
            r3 = this;
            java.lang.Throwable r0 = r3.cause()
            java.lang.Class<io.netty.handler.ssl.SniCompletionEvent> r1 = io.netty.handler.ssl.SniCompletionEvent.class
            if (r0 != 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "(SUCCESS='"
            r0.append(r1)
            java.lang.String r1 = r3.hostname
            r0.append(r1)
            java.lang.String r1 = "'\")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L28:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = r1.getSimpleName()
            r2.append(r1)
            r1 = 40
            r2.append(r1)
            r2.append(r0)
            r0 = 41
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
