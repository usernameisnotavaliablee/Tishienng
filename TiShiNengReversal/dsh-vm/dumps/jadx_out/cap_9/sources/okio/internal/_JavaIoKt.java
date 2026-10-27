package okio.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class _JavaIoKt {
    private static final java.util.logging.Logger logger = null;

    static {
            java.lang.String r0 = "okio.Okio"
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            okio.internal._JavaIoKt.logger = r0
            return
    }

    public _JavaIoKt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final /* synthetic */ java.util.logging.Logger access$getLogger$p() {
            java.util.logging.Logger r0 = okio.internal._JavaIoKt.logger
            return r0
    }

    public static final boolean isAndroidGetsocknameError(@org.jetbrains.annotations.NotNull java.lang.AssertionError r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.Throwable r0 = r4.getCause()
            r1 = 0
            if (r0 == 0) goto L20
            java.lang.String r4 = r4.getMessage()
            if (r4 == 0) goto L1b
            r0 = 2
            r2 = 0
            java.lang.String r3 = "getsockname failed"
            boolean r4 = kotlin.text.u.l3(r4, r3, r1, r0, r2)
            goto L1c
        L1b:
            r4 = 0
        L1c:
            if (r4 == 0) goto L20
            r4 = 1
            return r4
        L20:
            return r1
    }
}
