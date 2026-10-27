package okhttp3.internal.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface PushObserver {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.PushObserver CANCEL = null;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http2.PushObserver.Companion Companion = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        static final /* synthetic */ okhttp3.internal.http2.PushObserver.Companion $$INSTANCE = null;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private static final class PushObserverCancel implements okhttp3.internal.http2.PushObserver {
            public PushObserverCancel() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onData(int r1, @org.jetbrains.annotations.NotNull okio.BufferedSource r2, int r3, boolean r4) throws java.io.IOException {
                    r0 = this;
                    java.lang.String r1 = "source"
                    kotlin.jvm.internal.g0.p(r2, r1)
                    long r3 = (long) r3
                    r2.skip(r3)
                    r1 = 1
                    return r1
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onHeaders(int r1, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r2, boolean r3) {
                    r0 = this;
                    java.lang.String r1 = "responseHeaders"
                    kotlin.jvm.internal.g0.p(r2, r1)
                    r1 = 1
                    return r1
            }

            @Override // okhttp3.internal.http2.PushObserver
            public boolean onRequest(int r1, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r2) {
                    r0 = this;
                    java.lang.String r1 = "requestHeaders"
                    kotlin.jvm.internal.g0.p(r2, r1)
                    r1 = 1
                    return r1
            }

            @Override // okhttp3.internal.http2.PushObserver
            public void onReset(int r1, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r2) {
                    r0 = this;
                    java.lang.String r1 = "errorCode"
                    kotlin.jvm.internal.g0.p(r2, r1)
                    return
            }
        }

        static {
                okhttp3.internal.http2.PushObserver$Companion r0 = new okhttp3.internal.http2.PushObserver$Companion
                r0.<init>()
                okhttp3.internal.http2.PushObserver.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.internal.http2.PushObserver$Companion r0 = okhttp3.internal.http2.PushObserver.Companion.$$INSTANCE
            okhttp3.internal.http2.PushObserver.Companion = r0
            okhttp3.internal.http2.PushObserver$Companion$PushObserverCancel r0 = new okhttp3.internal.http2.PushObserver$Companion$PushObserverCancel
            r0.<init>()
            okhttp3.internal.http2.PushObserver.CANCEL = r0
            return
    }

    boolean onData(int r1, @org.jetbrains.annotations.NotNull okio.BufferedSource r2, int r3, boolean r4) throws java.io.IOException;

    boolean onHeaders(int r1, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r2, boolean r3);

    boolean onRequest(int r1, @org.jetbrains.annotations.NotNull java.util.List<okhttp3.internal.http2.Header> r2);

    void onReset(int r1, @org.jetbrains.annotations.NotNull okhttp3.internal.http2.ErrorCode r2);
}
