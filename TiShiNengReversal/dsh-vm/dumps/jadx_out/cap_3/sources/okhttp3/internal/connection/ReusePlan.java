package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class ReusePlan implements okhttp3.internal.connection.RoutePlanner.Plan {

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RealConnection connection;
    private final boolean isReady;

    public ReusePlan(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealConnection r2) {
            r1 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.connection = r2
            r2 = 1
            r1.isReady = r2
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
    /* renamed from: cancel */
    public /* bridge */ /* synthetic */ void mo5cancel() {
            r0 = this;
            r0.cancel()
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Void connectTcp() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: connectTcp, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ okhttp3.internal.connection.RoutePlanner.ConnectResult mo13connectTcp() {
            r1 = this;
            java.lang.Void r0 = r1.connectTcp()
            okhttp3.internal.connection.RoutePlanner$ConnectResult r0 = (okhttp3.internal.connection.RoutePlanner.ConnectResult) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Void connectTlsEtc() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    /* renamed from: connectTlsEtc, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ okhttp3.internal.connection.RoutePlanner.ConnectResult mo14connectTlsEtc() {
            r1 = this;
            java.lang.Void r0 = r1.connectTlsEtc()
            okhttp3.internal.connection.RoutePlanner$ConnectResult r0 = (okhttp3.internal.connection.RoutePlanner.ConnectResult) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final okhttp3.internal.connection.RealConnection getConnection() {
            r1 = this;
            okhttp3.internal.connection.RealConnection r0 = r1.connection
            return r0
    }

    @Override // okhttp3.internal.connection.RoutePlanner.Plan
    @org.jetbrains.annotations.NotNull
    /* renamed from: handleSuccess */
    public okhttp3.internal.connection.RealConnection mo6handleSuccess() {
            r1 = this;
            okhttp3.internal.connection.RealConnection r0 = r1.connection
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
    /* renamed from: retry */
    public /* bridge */ /* synthetic */ okhttp3.internal.connection.RoutePlanner.Plan mo7retry() {
            r1 = this;
            java.lang.Void r0 = r1.retry()
            okhttp3.internal.connection.RoutePlanner$Plan r0 = (okhttp3.internal.connection.RoutePlanner.Plan) r0
            return r0
    }
}
