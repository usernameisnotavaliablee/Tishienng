package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class l extends kotlinx.coroutines.n {

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.Future<?> a;

    public l(@org.jetbrains.annotations.NotNull java.util.concurrent.Future<?> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.n1 invoke(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.l(r1)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    @Override // kotlinx.coroutines.o
    public void l(@org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
            r1 = this;
            if (r2 == 0) goto L8
            java.util.concurrent.Future<?> r2 = r1.a
            r0 = 0
            r2.cancel(r0)
        L8:
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "CancelFutureOnCancel["
            r0.append(r1)
            java.util.concurrent.Future<?> r1 = r2.a
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
