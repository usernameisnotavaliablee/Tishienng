package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class i1 implements kotlinx.coroutines.j1 {

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.Future<?> a;

    public i1(@org.jetbrains.annotations.NotNull java.util.concurrent.Future<?> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // kotlinx.coroutines.j1
    public void dispose() {
            r2 = this;
            java.util.concurrent.Future<?> r0 = r2.a
            r1 = 0
            r0.cancel(r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DisposableFutureHandle["
            r0.append(r1)
            java.util.concurrent.Future<?> r1 = r2.a
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
