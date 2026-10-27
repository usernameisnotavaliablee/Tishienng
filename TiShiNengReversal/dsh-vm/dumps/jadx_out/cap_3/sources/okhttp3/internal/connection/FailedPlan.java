package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class FailedPlan implements okhttp3.internal.connection.RoutePlanner.Plan {
    private final boolean isReady;

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RoutePlanner.ConnectResult result;

    public FailedPlan(@org.jetbrains.annotations.NotNull java.lang.Throwable r8) {
            r7 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.g0.p(r8, r0)
            r7.<init>()
            okhttp3.internal.connection.RoutePlanner$ConnectResult r1 = new okhttp3.internal.connection.RoutePlanner$ConnectResult
            r5 = 2
            r6 = 0
            r3 = 0
            r2 = r7
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r2.result = r1
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Void cancel() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected cancel"
            r0.<init>(r1)
            throw r0
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: cancel, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo5cancel() {
            r0 = this;
            r0.cancel()
            return
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    @org.jetbrains.annotations.NotNull
    /* renamed from: connectTcp */
    public okhttp3.internal.connection.RoutePlanner.ConnectResult mo13connectTcp() {
            r1 = this;
            okhttp3.internal.connection.RoutePlanner$ConnectResult r0 = r1.result
            return r0
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    @org.jetbrains.annotations.NotNull
    /* renamed from: connectTlsEtc */
    public okhttp3.internal.connection.RoutePlanner.ConnectResult mo14connectTlsEtc() {
            r1 = this;
            okhttp3.internal.connection.RoutePlanner$ConnectResult r0 = r1.result
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.RoutePlanner.ConnectResult getResult() {
            r1 = this;
            okhttp3.internal.connection.RoutePlanner$ConnectResult r0 = r1.result
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Void handleSuccess() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected call"
            r0.<init>(r1)
            throw r0
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: handleSuccess, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ okhttp3.internal.connection.RealConnection mo6handleSuccess() {
            r1 = this;
            java.lang.Void r0 = r1.handleSuccess()
            okhttp3.internal.connection.RealConnection r0 = (okhttp3.internal.connection.RealConnection) r0
            return r0
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    public boolean isReady() {
            r1 = this;
            boolean r0 = r1.isReady
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Void retry() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected retry"
            r0.<init>(r1)
            throw r0
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: retry, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ okhttp3.internal.connection.RoutePlanner.Plan mo7retry() {
            r1 = this;
            java.lang.Void r0 = r1.retry()
            okhttp3.internal.connection.RoutePlanner$Plan r0 = (okhttp3.internal.connection.RoutePlanner.Plan) r0
            return r0
    }
}
