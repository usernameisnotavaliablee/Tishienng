package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class SequentialExchangeFinder implements okhttp3.internal.connection.ExchangeFinder {

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RoutePlanner routePlanner;

    public SequentialExchangeFinder(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RoutePlanner r2) {
            r1 = this;
            java.lang.String r0 = "routePlanner"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.routePlanner = r2
            return
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    @org.jetbrains.annotations.NotNull
    public okhttp3.internal.connection.RealConnection find() {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            okhttp3.internal.connection.RoutePlanner r2 = r5.getRoutePlanner()
            boolean r2 = r2.isCanceled()
            if (r2 != 0) goto L5d
            okhttp3.internal.connection.RoutePlanner r2 = r5.getRoutePlanner()     // Catch: java.io.IOException -> L29
            okhttp3.internal.connection.RoutePlanner$Plan r2 = r2.plan()     // Catch: java.io.IOException -> L29
            boolean r3 = r2.isReady()     // Catch: java.io.IOException -> L29
            if (r3 != 0) goto L44
            okhttp3.internal.connection.RoutePlanner$ConnectResult r3 = r2.mo13connectTcp()     // Catch: java.io.IOException -> L29
            boolean r4 = r3.isSuccess()     // Catch: java.io.IOException -> L29
            if (r4 == 0) goto L2b
            okhttp3.internal.connection.RoutePlanner$ConnectResult r3 = r2.mo14connectTlsEtc()     // Catch: java.io.IOException -> L29
            goto L2b
        L29:
            r2 = move-exception
            goto L49
        L2b:
            okhttp3.internal.connection.RoutePlanner$Plan r4 = r3.component2()     // Catch: java.io.IOException -> L29
            java.lang.Throwable r3 = r3.component3()     // Catch: java.io.IOException -> L29
            if (r3 != 0) goto L43
            if (r4 == 0) goto L44
            okhttp3.internal.connection.RoutePlanner r2 = r5.getRoutePlanner()     // Catch: java.io.IOException -> L29
            kotlin.collections.m r2 = r2.getDeferredPlans()     // Catch: java.io.IOException -> L29
            r2.addFirst(r4)     // Catch: java.io.IOException -> L29
            goto L2
        L43:
            throw r3     // Catch: java.io.IOException -> L29
        L44:
            okhttp3.internal.connection.RealConnection r0 = r2.mo6handleSuccess()     // Catch: java.io.IOException -> L29
            return r0
        L49:
            if (r1 != 0) goto L4d
            r1 = r2
            goto L50
        L4d:
            kotlin.l.a(r1, r2)
        L50:
            okhttp3.internal.connection.RoutePlanner r2 = r5.getRoutePlanner()
            r3 = 1
            boolean r2 = okhttp3.internal.connection.c.a(r2, r0, r3, r0)
            if (r2 == 0) goto L5c
            goto L2
        L5c:
            throw r1
        L5d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)
            throw r0
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    @org.jetbrains.annotations.NotNull
    public okhttp3.internal.connection.RoutePlanner getRoutePlanner() {
            r1 = this;
            okhttp3.internal.connection.RoutePlanner r0 = r1.routePlanner
            return r0
    }
}
