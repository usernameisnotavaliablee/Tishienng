package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class ForceConnectRoutePlanner implements okhttp3.internal.connection.RoutePlanner {

    @org.jetbrains.annotations.NotNull
    private final okhttp3.internal.connection.RealRoutePlanner delegate;

    public ForceConnectRoutePlanner(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealRoutePlanner r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.delegate = r2
            return
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    @org.jetbrains.annotations.NotNull
    public okhttp3.Address getAddress() {
            r1 = this;
            okhttp3.internal.connection.RealRoutePlanner r0 = r1.delegate
            okhttp3.Address r0 = r0.getAddress()
            return r0
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    @org.jetbrains.annotations.NotNull
    public kotlin.collections.m<okhttp3.internal.connection.RoutePlanner.Plan> getDeferredPlans() {
            r1 = this;
            okhttp3.internal.connection.RealRoutePlanner r0 = r1.delegate
            kotlin.collections.m r0 = r0.getDeferredPlans()
            return r0
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public boolean hasNext(@org.jetbrains.annotations.Nullable okhttp3.internal.connection.RealConnection r2) {
            r1 = this;
            okhttp3.internal.connection.RealRoutePlanner r0 = r1.delegate
            boolean r2 = r0.hasNext(r2)
            return r2
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public boolean isCanceled() {
            r1 = this;
            okhttp3.internal.connection.RealRoutePlanner r0 = r1.delegate
            boolean r0 = r0.isCanceled()
            return r0
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    @org.jetbrains.annotations.NotNull
    public okhttp3.internal.connection.RoutePlanner.Plan plan() {
            r1 = this;
            okhttp3.internal.connection.RealRoutePlanner r0 = r1.delegate
            okhttp3.internal.connection.ConnectPlan r0 = r0.planConnect$okhttp()
            return r0
    }

    @Override // okhttp3.internal.connection.RoutePlanner
    public boolean sameHostAndPort(@org.jetbrains.annotations.NotNull okhttp3.HttpUrl r2) {
            r1 = this;
            java.lang.String r0 = "url"
            kotlin.jvm.internal.g0.p(r2, r0)
            okhttp3.internal.connection.RealRoutePlanner r0 = r1.delegate
            boolean r2 = r0.sameHostAndPort(r2)
            return r2
    }
}
