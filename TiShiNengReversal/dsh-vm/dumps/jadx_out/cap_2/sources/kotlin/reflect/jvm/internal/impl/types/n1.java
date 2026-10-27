package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n1 extends kotlin.reflect.jvm.internal.impl.types.e implements d4.j {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.w1 f;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.k g;

    public n1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.r r2, boolean r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.w1 r4) {
            r1 = this;
            java.lang.String r0 = "originalTypeVariable"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "constructor"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>(r2, r3)
            r1.f = r4
            kotlin.reflect.jvm.internal.impl.builtins.j r2 = r2.p()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.i()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r2.r()
            r1.g = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.w1 I0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r1.f
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.e
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e S0(boolean r4) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.types.n1 r0 = new kotlin.reflect.jvm.internal.impl.types.n1
            kotlin.reflect.jvm.internal.impl.types.checker.r r1 = r3.R0()
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r3.I0()
            r0.<init>(r1, r4, r2)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.e, kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k r() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r1.g
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.e1
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Stub (BI): "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.types.checker.r r1 = r2.R0()
            r0.append(r1)
            boolean r1 = r2.J0()
            if (r1 == 0) goto L1a
            java.lang.String r1 = "?"
            goto L1c
        L1a:
            java.lang.String r1 = ""
        L1c:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
