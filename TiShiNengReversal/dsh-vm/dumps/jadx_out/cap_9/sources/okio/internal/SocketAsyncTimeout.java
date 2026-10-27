package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class SocketAsyncTimeout extends okio.AsyncTimeout {

    @org.jetbrains.annotations.NotNull
    private final java.net.Socket socket;

    public SocketAsyncTimeout(@org.jetbrains.annotations.NotNull java.net.Socket r2) {
            r1 = this;
            java.lang.String r0 = "socket"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.socket = r2
            return
    }

    @Override // okio.AsyncTimeout
    @org.jetbrains.annotations.NotNull
    protected java.io.IOException newTimeoutException(@org.jetbrains.annotations.Nullable java.io.IOException r3) {
            r2 = this;
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r3 == 0) goto Lc
            r0.initCause(r3)
        Lc:
            return r0
    }

    @Override // okio.AsyncTimeout
    protected void timedOut() {
            r5 = this;
            java.lang.String r0 = "Failed to close timed out socket "
            java.net.Socket r1 = r5.socket     // Catch: java.lang.AssertionError -> L8 java.lang.Exception -> La
            r1.close()     // Catch: java.lang.AssertionError -> L8 java.lang.Exception -> La
            return
        L8:
            r1 = move-exception
            goto Lc
        La:
            r1 = move-exception
            goto L2e
        Lc:
            boolean r2 = okio.internal._JavaIoKt.isAndroidGetsocknameError(r1)
            if (r2 == 0) goto L2d
            java.util.logging.Logger r2 = okio.internal._JavaIoKt.access$getLogger$p()
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.net.Socket r0 = r5.socket
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.log(r3, r0, r1)
            goto L48
        L2d:
            throw r1
        L2e:
            java.util.logging.Logger r2 = okio.internal._JavaIoKt.access$getLogger$p()
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.net.Socket r0 = r5.socket
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.log(r3, r0, r1)
        L48:
            return
    }
}
