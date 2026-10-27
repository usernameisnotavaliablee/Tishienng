package kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class k0 extends kotlin.j0 {
    public k0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.internal.InlineOnly
    private static final <R> R l(java.lang.Object r1, kotlin.jvm.functions.Function0<? extends R> r2) {
            java.lang.String r0 = "lock"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r2, r0)
            monitor-enter(r1)
            r0 = 1
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.d0.d(r0)
            monitor-exit(r1)
            kotlin.jvm.internal.d0.c(r0)
            return r2
        L18:
            r2 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            monitor-exit(r1)
            kotlin.jvm.internal.d0.c(r0)
            throw r2
    }
}
