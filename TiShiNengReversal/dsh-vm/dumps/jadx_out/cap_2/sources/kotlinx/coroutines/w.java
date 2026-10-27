package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class w extends kotlinx.coroutines.f2 implements kotlinx.coroutines.v {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.x e;

    public w(@org.jetbrains.annotations.NotNull kotlinx.coroutines.x r1) {
            r0 = this;
            r0.<init>()
            r0.e = r1
            return
    }

    @Override // kotlinx.coroutines.v
    public boolean b(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            r1 = this;
            kotlinx.coroutines.l2 r0 = r1.A()
            boolean r2 = r0.n0(r2)
            return r2
    }

    @Override // kotlinx.coroutines.v
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.e2 getParent() {
            r1 = this;
            kotlinx.coroutines.l2 r0 = r1.A()
            return r0
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
            kotlinx.coroutines.x r2 = r1.e
            kotlinx.coroutines.l2 r0 = r1.A()
            r2.g(r0)
            return
    }
}
