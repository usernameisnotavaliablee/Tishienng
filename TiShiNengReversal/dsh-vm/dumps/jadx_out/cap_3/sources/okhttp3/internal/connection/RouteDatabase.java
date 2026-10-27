package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class RouteDatabase {

    @org.jetbrains.annotations.NotNull
    private final java.util.Set<okhttp3.Route> _failedRoutes;

    public RouteDatabase() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1._failedRoutes = r0
            return
    }

    public final synchronized void connected(@org.jetbrains.annotations.NotNull okhttp3.Route r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "route"
            kotlin.jvm.internal.g0.p(r2, r0)     // Catch: java.lang.Throwable -> Ld
            java.util.Set<okhttp3.Route> r0 = r1._failedRoutes     // Catch: java.lang.Throwable -> Ld
            r0.remove(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public final synchronized void failed(@org.jetbrains.annotations.NotNull okhttp3.Route r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "failedRoute"
            kotlin.jvm.internal.g0.p(r2, r0)     // Catch: java.lang.Throwable -> Ld
            java.util.Set<okhttp3.Route> r0 = r1._failedRoutes     // Catch: java.lang.Throwable -> Ld
            r0.add(r2)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    @org.jetbrains.annotations.NotNull
    public final synchronized java.util.Set<okhttp3.Route> getFailedRoutes() {
            r1 = this;
            monitor-enter(r1)
            java.util.Set<okhttp3.Route> r0 = r1._failedRoutes     // Catch: java.lang.Throwable -> L9
            java.util.Set r0 = kotlin.collections.f0.f6(r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    public final synchronized boolean shouldPostpone(@org.jetbrains.annotations.NotNull okhttp3.Route r2) {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "route"
            kotlin.jvm.internal.g0.p(r2, r0)     // Catch: java.lang.Throwable -> Le
            java.util.Set<okhttp3.Route> r0 = r1._failedRoutes     // Catch: java.lang.Throwable -> Le
            boolean r2 = r0.contains(r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return r2
        Le:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
    }
}
