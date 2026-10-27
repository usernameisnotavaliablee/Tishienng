package kotlin.reflect.jvm.internal.impl.km;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.contracts.ExperimentalContracts
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n {
    private int a;

    @org.jetbrains.annotations.Nullable
    private java.lang.Integer b;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.km.i c;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.km.u d;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.n> e;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.n> f;

    public n() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 0
            r0.<init>(r1)
            r2.e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r2.f = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.n> a() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.n> r0 = r1.e
            return r0
    }

    public final int b() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.n> c() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.km.n> r0 = r1.f
            return r0
    }

    public final void d(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.km.i r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public final void e(int r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public final void f(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.km.u r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public final void g(@org.jetbrains.annotations.Nullable java.lang.Integer r1) {
            r0 = this;
            r0.b = r1
            return
    }
}
