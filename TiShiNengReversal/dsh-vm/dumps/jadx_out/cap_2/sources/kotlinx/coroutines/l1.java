package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class l1 extends kotlinx.coroutines.k2 {

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.j1 e;

    public l1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.j1 r1) {
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
    public void z(@org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
            r0 = this;
            kotlinx.coroutines.j1 r1 = r0.e
            r1.dispose()
            return
    }
}
