package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class a1 extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0 {
    public a1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r3) {
            r2 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            r1 = 2
            r2.<init>(r3, r0, r1, r0)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    protected void D(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "result"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    @org.jetbrains.annotations.Nullable
    protected kotlin.reflect.jvm.internal.impl.descriptors.z0 P() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0
    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0.a Z(@org.jetbrains.annotations.NotNull x3.r r8, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r10, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.q1> r11) {
            r7 = this;
            java.lang.String r0 = "method"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r8 = "methodTypeParameters"
            kotlin.jvm.internal.g0.p(r9, r8)
            java.lang.String r8 = "returnType"
            kotlin.jvm.internal.g0.p(r10, r8)
            java.lang.String r8 = "valueParameters"
            kotlin.jvm.internal.g0.p(r11, r8)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.t0$a
            r5 = 0
            java.util.List r6 = kotlin.collections.f0.J()
            r2 = 0
            r4 = r9
            r1 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }
}
