package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class c0 extends kotlin.reflect.jvm.internal.impl.types.b0 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.e1 b;

    public c0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.b = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 M0(boolean r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.P0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 O0(kotlin.reflect.jvm.internal.impl.types.t1 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.Q0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.e1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 P0(boolean r2) {
            r1 = this;
            boolean r0 = r1.J0()
            if (r2 != r0) goto L7
            return r1
        L7:
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.R0()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r0.P0(r2)
            kotlin.reflect.jvm.internal.impl.types.t1 r0 = r1.H0()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.Q0(r0)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.e1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 Q0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r2) {
            r1 = this;
            java.lang.String r0 = "newAttributes"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.t1 r0 = r1.H0()
            if (r2 == r0) goto L11
            kotlin.reflect.jvm.internal.impl.types.g1 r0 = new kotlin.reflect.jvm.internal.impl.types.g1
            r0.<init>(r1, r2)
            return r0
        L11:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b0
    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.types.e1 R0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.b
            return r0
    }
}
