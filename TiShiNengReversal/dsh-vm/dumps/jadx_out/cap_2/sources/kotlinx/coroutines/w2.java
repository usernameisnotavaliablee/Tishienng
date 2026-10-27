package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class w2 extends kotlinx.coroutines.k2 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.e<kotlin.n1> e;

    public w2(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r1) {
            r0 = this;
            r0.<init>()
            r0.e = r1
            return
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ kotlin.n1 invoke(java.lang.Throwable r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.z(r1)
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    @Override // kotlinx.coroutines.f0
    public void z(@org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
            r1 = this;
            kotlin.coroutines.e<kotlin.n1> r2 = r1.e
            kotlin.Result$a r0 = kotlin.Result.Companion
            kotlin.n1 r0 = kotlin.n1.a
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)
            r2.resumeWith(r0)
            return
    }
}
