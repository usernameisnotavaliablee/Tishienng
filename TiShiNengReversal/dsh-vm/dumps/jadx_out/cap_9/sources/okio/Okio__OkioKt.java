package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final /* synthetic */ class Okio__OkioKt {
    public Okio__OkioKt() {
            r1 = this;
            r1.<init>()
            return
    }

    @kotlin.jvm.JvmName(name = "blackhole")
    @org.jetbrains.annotations.NotNull
    public static final okio.Sink blackhole() {
            okio.BlackholeSink r0 = new okio.BlackholeSink
            r0.<init>()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSink buffer(@org.jetbrains.annotations.NotNull okio.Sink r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            okio.RealBufferedSink r0 = new okio.RealBufferedSink
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.BufferedSource buffer(@org.jetbrains.annotations.NotNull okio.Source r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            okio.RealBufferedSource r0 = new okio.RealBufferedSource
            r0.<init>(r1)
            return r0
    }

    public static final <T extends java.io.Closeable, R> R use(T r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super T, ? extends R> r4) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 1
            r1 = 0
            java.lang.Object r4 = r4.invoke(r3)     // Catch: java.lang.Throwable -> L1c
            kotlin.jvm.internal.d0.d(r0)
            if (r3 == 0) goto L15
            r3.close()     // Catch: java.lang.Throwable -> L14
            goto L15
        L14:
            r1 = move-exception
        L15:
            kotlin.jvm.internal.d0.c(r0)
            r2 = r1
            r1 = r4
            r4 = r2
            goto L2d
        L1c:
            r4 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            if (r3 == 0) goto L2a
            r3.close()     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r3 = move-exception
            kotlin.l.a(r4, r3)
        L2a:
            kotlin.jvm.internal.d0.c(r0)
        L2d:
            if (r4 != 0) goto L30
            return r1
        L30:
            throw r4
    }
}
