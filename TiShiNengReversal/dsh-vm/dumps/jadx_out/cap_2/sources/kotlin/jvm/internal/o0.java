package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class o0 {
    private static final kotlin.jvm.internal.p0 a = null;
    static final java.lang.String b = " (Kotlin reflection is not available)";
    private static final kotlin.reflect.d[] c = null;

    static {
            r0 = 0
            java.lang.Class<kotlin.reflect.jvm.internal.g3> r1 = kotlin.reflect.jvm.internal.g3.class
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Throwable -> Lb
            kotlin.jvm.internal.p0 r1 = (kotlin.jvm.internal.p0) r1     // Catch: java.lang.Throwable -> Lb
            r0 = r1
            goto Lc
        Lb:
        Lc:
            if (r0 == 0) goto Lf
            goto L14
        Lf:
            kotlin.jvm.internal.p0 r0 = new kotlin.jvm.internal.p0
            r0.<init>()
        L14:
            kotlin.jvm.internal.o0.a = r0
            r0 = 0
            kotlin.reflect.d[] r0 = new kotlin.reflect.d[r0]
            kotlin.jvm.internal.o0.c = r0
            return
    }

    public o0() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static kotlin.reflect.r A(java.lang.Class r3) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.d r3 = d(r3)
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            r2 = 0
            kotlin.reflect.r r3 = r0.s(r3, r1, r2)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static kotlin.reflect.r B(java.lang.Class r2, kotlin.reflect.t r3) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.d r2 = d(r2)
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r1 = 0
            kotlin.reflect.r r2 = r0.s(r2, r3, r1)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static kotlin.reflect.r C(java.lang.Class r3, kotlin.reflect.t r4, kotlin.reflect.t r5) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.d r3 = d(r3)
            r1 = 2
            kotlin.reflect.t[] r1 = new kotlin.reflect.t[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            java.util.List r4 = java.util.Arrays.asList(r1)
            kotlin.reflect.r r3 = r0.s(r3, r4, r2)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static kotlin.reflect.r D(java.lang.Class r2, kotlin.reflect.t... r3) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.d r2 = d(r2)
            java.util.List r3 = kotlin.collections.n.dz(r3)
            r1 = 0
            kotlin.reflect.r r2 = r0.s(r2, r3, r1)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static kotlin.reflect.r E(kotlin.reflect.g r3) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            r2 = 0
            kotlin.reflect.r r3 = r0.s(r3, r1, r2)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static kotlin.reflect.s F(java.lang.Object r1, java.lang.String r2, kotlin.reflect.KVariance r3, boolean r4) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.s r1 = r0.t(r1, r2, r3, r4)
            return r1
    }

    public static kotlin.reflect.d a(java.lang.Class r1) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.d r1 = r0.a(r1)
            return r1
    }

    public static kotlin.reflect.d b(java.lang.Class r1, java.lang.String r2) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.d r1 = r0.b(r1, r2)
            return r1
    }

    public static kotlin.reflect.i c(kotlin.jvm.internal.FunctionReference r1) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.i r1 = r0.c(r1)
            return r1
    }

    public static kotlin.reflect.d d(java.lang.Class r1) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.d r1 = r0.d(r1)
            return r1
    }

    public static kotlin.reflect.d e(java.lang.Class r1, java.lang.String r2) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.d r1 = r0.e(r1, r2)
            return r1
    }

    public static kotlin.reflect.d[] f(java.lang.Class[] r4) {
            int r0 = r4.length
            if (r0 != 0) goto L6
            kotlin.reflect.d[] r4 = kotlin.jvm.internal.o0.c
            return r4
        L6:
            kotlin.reflect.d[] r1 = new kotlin.reflect.d[r0]
            r2 = 0
        L9:
            if (r2 >= r0) goto L16
            r3 = r4[r2]
            kotlin.reflect.d r3 = d(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L9
        L16:
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static kotlin.reflect.h g(java.lang.Class r2) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            java.lang.String r1 = ""
            kotlin.reflect.h r2 = r0.f(r2, r1)
            return r2
    }

    public static kotlin.reflect.h h(java.lang.Class r1, java.lang.String r2) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.h r1 = r0.f(r1, r2)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.6")
    public static kotlin.reflect.r i(kotlin.reflect.r r1) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.r r1 = r0.g(r1)
            return r1
    }

    public static kotlin.reflect.k j(kotlin.jvm.internal.MutablePropertyReference0 r1) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.k r1 = r0.h(r1)
            return r1
    }

    public static kotlin.reflect.l k(kotlin.jvm.internal.MutablePropertyReference1 r1) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.l r1 = r0.i(r1)
            return r1
    }

    public static kotlin.reflect.m l(kotlin.jvm.internal.MutablePropertyReference2 r1) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.m r1 = r0.j(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.6")
    public static kotlin.reflect.r m(kotlin.reflect.r r1) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.r r1 = r0.k(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static kotlin.reflect.r n(java.lang.Class r3) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.d r3 = d(r3)
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            r2 = 1
            kotlin.reflect.r r3 = r0.s(r3, r1, r2)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static kotlin.reflect.r o(java.lang.Class r2, kotlin.reflect.t r3) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.d r2 = d(r2)
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r1 = 1
            kotlin.reflect.r r2 = r0.s(r2, r3, r1)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static kotlin.reflect.r p(java.lang.Class r3, kotlin.reflect.t r4, kotlin.reflect.t r5) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.d r3 = d(r3)
            r1 = 2
            kotlin.reflect.t[] r1 = new kotlin.reflect.t[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            java.util.List r5 = java.util.Arrays.asList(r1)
            kotlin.reflect.r r3 = r0.s(r3, r5, r4)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static kotlin.reflect.r q(java.lang.Class r2, kotlin.reflect.t... r3) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.d r2 = d(r2)
            java.util.List r3 = kotlin.collections.n.dz(r3)
            r1 = 1
            kotlin.reflect.r r2 = r0.s(r2, r3, r1)
            return r2
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static kotlin.reflect.r r(kotlin.reflect.g r3) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            r2 = 1
            kotlin.reflect.r r3 = r0.s(r3, r1, r2)
            return r3
    }

    @kotlin.SinceKotlin(version = "1.6")
    public static kotlin.reflect.r s(kotlin.reflect.r r1, kotlin.reflect.r r2) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.r r1 = r0.l(r1, r2)
            return r1
    }

    public static kotlin.reflect.o t(kotlin.jvm.internal.PropertyReference0 r1) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.o r1 = r0.m(r1)
            return r1
    }

    public static kotlin.reflect.p u(kotlin.jvm.internal.PropertyReference1 r1) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.p r1 = r0.n(r1)
            return r1
    }

    public static kotlin.reflect.q v(kotlin.jvm.internal.PropertyReference2 r1) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            kotlin.reflect.q r1 = r0.o(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.3")
    public static java.lang.String w(kotlin.jvm.internal.c0 r1) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            java.lang.String r1 = r0.p(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.1")
    public static java.lang.String x(kotlin.jvm.internal.Lambda r1) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            java.lang.String r1 = r0.q(r1)
            return r1
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static void y(kotlin.reflect.s r1, kotlin.reflect.r r2) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r0.r(r1, r2)
            return
    }

    @kotlin.SinceKotlin(version = "1.4")
    public static void z(kotlin.reflect.s r1, kotlin.reflect.r... r2) {
            kotlin.jvm.internal.p0 r0 = kotlin.jvm.internal.o0.a
            java.util.List r2 = kotlin.collections.n.dz(r2)
            r0.r(r1, r2)
            return
    }
}
