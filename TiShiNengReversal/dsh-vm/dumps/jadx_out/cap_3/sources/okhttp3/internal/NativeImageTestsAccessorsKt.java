package okhttp3.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class NativeImageTestsAccessorsKt {
    public NativeImageTestsAccessorsKt() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Cache buildCache(@org.jetbrains.annotations.NotNull okio.Path r1, long r2, @org.jetbrains.annotations.NotNull okio.FileSystem r4) {
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "fileSystem"
            kotlin.jvm.internal.g0.p(r4, r0)
            okhttp3.Cache r0 = new okhttp3.Cache
            r0.<init>(r4, r1, r2)
            return r0
    }

    public static final void finishedAccessor(@org.jetbrains.annotations.NotNull okhttp3.Dispatcher r1, @org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall.AsyncCall r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "call"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.finished$okhttp(r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.connection.RealConnection getConnectionAccessor(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.Exchange r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            okhttp3.internal.connection.RealConnection r1 = r1.getConnection$okhttp()
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final okhttp3.internal.connection.Exchange getExchangeAccessor(@org.jetbrains.annotations.NotNull okhttp3.Response r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            okhttp3.internal.connection.Exchange r1 = r1.exchange()
            return r1
    }

    public static final long getIdleAtNsAccessor(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealConnection r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            long r0 = r2.getIdleAtNs()
            return r0
    }

    public static final void setIdleAtNsAccessor(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealConnection r1, long r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1.setIdleAtNs(r2)
            return
    }
}
