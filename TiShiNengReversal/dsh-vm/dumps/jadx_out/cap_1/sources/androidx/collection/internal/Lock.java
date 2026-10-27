package androidx.collection.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class Lock {
    public Lock() {
            r0 = this;
            r0.<init>()
            return
    }

    public final <T> T synchronizedImpl(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r2, r0)
            monitor-enter(r1)
            r0 = 1
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L13
            kotlin.jvm.internal.d0.d(r0)
            monitor-exit(r1)
            kotlin.jvm.internal.d0.c(r0)
            return r2
        L13:
            r2 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            monitor-exit(r1)
            kotlin.jvm.internal.d0.c(r0)
            throw r2
    }
}
