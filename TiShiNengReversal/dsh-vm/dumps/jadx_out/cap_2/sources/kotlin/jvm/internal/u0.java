package kotlin.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class u0 {
    public u0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int A(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlin.jvm.internal.c0
            if (r0 == 0) goto Lb
            kotlin.jvm.internal.c0 r1 = (kotlin.jvm.internal.c0) r1
            int r1 = r1.getArity()
            return r1
        Lb:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function0
            if (r0 == 0) goto L11
            r1 = 0
            return r1
        L11:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function1
            if (r0 == 0) goto L17
            r1 = 1
            return r1
        L17:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function2
            if (r0 == 0) goto L1d
            r1 = 2
            return r1
        L1d:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function3
            if (r0 == 0) goto L23
            r1 = 3
            return r1
        L23:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function4
            if (r0 == 0) goto L29
            r1 = 4
            return r1
        L29:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function5
            if (r0 == 0) goto L2f
            r1 = 5
            return r1
        L2f:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function6
            if (r0 == 0) goto L35
            r1 = 6
            return r1
        L35:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function7
            if (r0 == 0) goto L3b
            r1 = 7
            return r1
        L3b:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function8
            if (r0 == 0) goto L42
            r1 = 8
            return r1
        L42:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function9
            if (r0 == 0) goto L49
            r1 = 9
            return r1
        L49:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function10
            if (r0 == 0) goto L50
            r1 = 10
            return r1
        L50:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function11
            if (r0 == 0) goto L57
            r1 = 11
            return r1
        L57:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function12
            if (r0 == 0) goto L5e
            r1 = 12
            return r1
        L5e:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function13
            if (r0 == 0) goto L65
            r1 = 13
            return r1
        L65:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function14
            if (r0 == 0) goto L6c
            r1 = 14
            return r1
        L6c:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function15
            if (r0 == 0) goto L73
            r1 = 15
            return r1
        L73:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function16
            if (r0 == 0) goto L7a
            r1 = 16
            return r1
        L7a:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function17
            if (r0 == 0) goto L81
            r1 = 17
            return r1
        L81:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function18
            if (r0 == 0) goto L88
            r1 = 18
            return r1
        L88:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function19
            if (r0 == 0) goto L8f
            r1 = 19
            return r1
        L8f:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function20
            if (r0 == 0) goto L96
            r1 = 20
            return r1
        L96:
            boolean r0 = r1 instanceof kotlin.jvm.functions.Function21
            if (r0 == 0) goto L9d
            r1 = 21
            return r1
        L9d:
            boolean r1 = r1 instanceof kotlin.jvm.functions.Function22
            if (r1 == 0) goto La4
            r1 = 22
            return r1
        La4:
            r1 = -1
            return r1
    }

    public static boolean B(java.lang.Object r1, int r2) {
            boolean r0 = r1 instanceof kotlin.n
            if (r0 == 0) goto Lc
            int r1 = A(r1)
            if (r1 != r2) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static boolean C(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto Le
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Lc
            boolean r1 = r1 instanceof l3.b
            if (r1 == 0) goto Le
        Lc:
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static boolean D(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.lang.Iterable
            if (r0 == 0) goto Le
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Lc
            boolean r1 = r1 instanceof l3.c
            if (r1 == 0) goto Le
        Lc:
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static boolean E(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.util.Iterator
            if (r0 == 0) goto Le
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Lc
            boolean r1 = r1 instanceof l3.d
            if (r1 == 0) goto Le
        Lc:
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static boolean F(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto Le
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Lc
            boolean r1 = r1 instanceof l3.e
            if (r1 == 0) goto Le
        Lc:
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static boolean G(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.util.ListIterator
            if (r0 == 0) goto Le
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Lc
            boolean r1 = r1 instanceof l3.f
            if (r1 == 0) goto Le
        Lc:
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static boolean H(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.util.Map
            if (r0 == 0) goto Le
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Lc
            boolean r1 = r1 instanceof l3.g
            if (r1 == 0) goto Le
        Lc:
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static boolean I(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.util.Map.Entry
            if (r0 == 0) goto Le
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Lc
            boolean r1 = r1 instanceof l3.g.a
            if (r1 == 0) goto Le
        Lc:
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static boolean J(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.util.Set
            if (r0 == 0) goto Le
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Lc
            boolean r1 = r1 instanceof l3.h
            if (r1 == 0) goto Le
        Lc:
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    private static <T extends java.lang.Throwable> T K(T r1) {
            java.lang.Class<kotlin.jvm.internal.u0> r0 = kotlin.jvm.internal.u0.class
            java.lang.String r0 = r0.getName()
            java.lang.Throwable r1 = kotlin.jvm.internal.g0.B(r1, r0)
            return r1
    }

    public static java.lang.ClassCastException L(java.lang.ClassCastException r0) {
            java.lang.Throwable r0 = K(r0)
            java.lang.ClassCastException r0 = (java.lang.ClassCastException) r0
            throw r0
    }

    public static void M(java.lang.Object r1, java.lang.String r2) {
            if (r1 != 0) goto L5
            java.lang.String r1 = "null"
            goto Ld
        L5:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " cannot be cast to "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            N(r1)
            return
    }

    public static void N(java.lang.String r1) {
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>(r1)
            java.lang.ClassCastException r1 = L(r0)
            throw r1
    }

    public static java.util.Collection a(java.lang.Object r1) {
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Ld
            boolean r0 = r1 instanceof l3.b
            if (r0 != 0) goto Ld
            java.lang.String r0 = "kotlin.collections.MutableCollection"
            M(r1, r0)
        Ld:
            java.util.Collection r1 = s(r1)
            return r1
    }

    public static java.util.Collection b(java.lang.Object r1, java.lang.String r2) {
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Lb
            boolean r0 = r1 instanceof l3.b
            if (r0 != 0) goto Lb
            N(r2)
        Lb:
            java.util.Collection r1 = s(r1)
            return r1
    }

    public static java.lang.Iterable c(java.lang.Object r1) {
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Ld
            boolean r0 = r1 instanceof l3.c
            if (r0 != 0) goto Ld
            java.lang.String r0 = "kotlin.collections.MutableIterable"
            M(r1, r0)
        Ld:
            java.lang.Iterable r1 = t(r1)
            return r1
    }

    public static java.lang.Iterable d(java.lang.Object r1, java.lang.String r2) {
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Lb
            boolean r0 = r1 instanceof l3.c
            if (r0 != 0) goto Lb
            N(r2)
        Lb:
            java.lang.Iterable r1 = t(r1)
            return r1
    }

    public static java.util.Iterator e(java.lang.Object r1) {
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Ld
            boolean r0 = r1 instanceof l3.d
            if (r0 != 0) goto Ld
            java.lang.String r0 = "kotlin.collections.MutableIterator"
            M(r1, r0)
        Ld:
            java.util.Iterator r1 = u(r1)
            return r1
    }

    public static java.util.Iterator f(java.lang.Object r1, java.lang.String r2) {
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Lb
            boolean r0 = r1 instanceof l3.d
            if (r0 != 0) goto Lb
            N(r2)
        Lb:
            java.util.Iterator r1 = u(r1)
            return r1
    }

    public static java.util.List g(java.lang.Object r1) {
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Ld
            boolean r0 = r1 instanceof l3.e
            if (r0 != 0) goto Ld
            java.lang.String r0 = "kotlin.collections.MutableList"
            M(r1, r0)
        Ld:
            java.util.List r1 = v(r1)
            return r1
    }

    public static java.util.List h(java.lang.Object r1, java.lang.String r2) {
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Lb
            boolean r0 = r1 instanceof l3.e
            if (r0 != 0) goto Lb
            N(r2)
        Lb:
            java.util.List r1 = v(r1)
            return r1
    }

    public static java.util.ListIterator i(java.lang.Object r1) {
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Ld
            boolean r0 = r1 instanceof l3.f
            if (r0 != 0) goto Ld
            java.lang.String r0 = "kotlin.collections.MutableListIterator"
            M(r1, r0)
        Ld:
            java.util.ListIterator r1 = w(r1)
            return r1
    }

    public static java.util.ListIterator j(java.lang.Object r1, java.lang.String r2) {
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Lb
            boolean r0 = r1 instanceof l3.f
            if (r0 != 0) goto Lb
            N(r2)
        Lb:
            java.util.ListIterator r1 = w(r1)
            return r1
    }

    public static java.util.Map k(java.lang.Object r1) {
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Ld
            boolean r0 = r1 instanceof l3.g
            if (r0 != 0) goto Ld
            java.lang.String r0 = "kotlin.collections.MutableMap"
            M(r1, r0)
        Ld:
            java.util.Map r1 = x(r1)
            return r1
    }

    public static java.util.Map l(java.lang.Object r1, java.lang.String r2) {
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Lb
            boolean r0 = r1 instanceof l3.g
            if (r0 != 0) goto Lb
            N(r2)
        Lb:
            java.util.Map r1 = x(r1)
            return r1
    }

    public static java.util.Map.Entry m(java.lang.Object r1) {
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Ld
            boolean r0 = r1 instanceof l3.g.a
            if (r0 != 0) goto Ld
            java.lang.String r0 = "kotlin.collections.MutableMap.MutableEntry"
            M(r1, r0)
        Ld:
            java.util.Map$Entry r1 = y(r1)
            return r1
    }

    public static java.util.Map.Entry n(java.lang.Object r1, java.lang.String r2) {
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Lb
            boolean r0 = r1 instanceof l3.g.a
            if (r0 != 0) goto Lb
            N(r2)
        Lb:
            java.util.Map$Entry r1 = y(r1)
            return r1
    }

    public static java.util.Set o(java.lang.Object r1) {
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Ld
            boolean r0 = r1 instanceof l3.h
            if (r0 != 0) goto Ld
            java.lang.String r0 = "kotlin.collections.MutableSet"
            M(r1, r0)
        Ld:
            java.util.Set r1 = z(r1)
            return r1
    }

    public static java.util.Set p(java.lang.Object r1, java.lang.String r2) {
            boolean r0 = r1 instanceof l3.a
            if (r0 == 0) goto Lb
            boolean r0 = r1 instanceof l3.h
            if (r0 != 0) goto Lb
            N(r2)
        Lb:
            java.util.Set r1 = z(r1)
            return r1
    }

    public static java.lang.Object q(java.lang.Object r2, int r3) {
            if (r2 == 0) goto L1c
            boolean r0 = B(r2, r3)
            if (r0 != 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "kotlin.jvm.functions.Function"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            M(r2, r3)
        L1c:
            return r2
    }

    public static java.lang.Object r(java.lang.Object r0, int r1, java.lang.String r2) {
            if (r0 == 0) goto Lb
            boolean r1 = B(r0, r1)
            if (r1 != 0) goto Lb
            N(r2)
        Lb:
            return r0
    }

    public static java.util.Collection s(java.lang.Object r0) {
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.ClassCastException -> L3
            return r0
        L3:
            r0 = move-exception
            java.lang.ClassCastException r0 = L(r0)
            throw r0
    }

    public static java.lang.Iterable t(java.lang.Object r0) {
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.ClassCastException -> L3
            return r0
        L3:
            r0 = move-exception
            java.lang.ClassCastException r0 = L(r0)
            throw r0
    }

    public static java.util.Iterator u(java.lang.Object r0) {
            java.util.Iterator r0 = (java.util.Iterator) r0     // Catch: java.lang.ClassCastException -> L3
            return r0
        L3:
            r0 = move-exception
            java.lang.ClassCastException r0 = L(r0)
            throw r0
    }

    public static java.util.List v(java.lang.Object r0) {
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.ClassCastException -> L3
            return r0
        L3:
            r0 = move-exception
            java.lang.ClassCastException r0 = L(r0)
            throw r0
    }

    public static java.util.ListIterator w(java.lang.Object r0) {
            java.util.ListIterator r0 = (java.util.ListIterator) r0     // Catch: java.lang.ClassCastException -> L3
            return r0
        L3:
            r0 = move-exception
            java.lang.ClassCastException r0 = L(r0)
            throw r0
    }

    public static java.util.Map x(java.lang.Object r0) {
            java.util.Map r0 = (java.util.Map) r0     // Catch: java.lang.ClassCastException -> L3
            return r0
        L3:
            r0 = move-exception
            java.lang.ClassCastException r0 = L(r0)
            throw r0
    }

    public static java.util.Map.Entry y(java.lang.Object r0) {
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.ClassCastException -> L3
            return r0
        L3:
            r0 = move-exception
            java.lang.ClassCastException r0 = L(r0)
            throw r0
    }

    public static java.util.Set z(java.lang.Object r0) {
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.ClassCastException -> L3
            return r0
        L3:
            r0 = move-exception
            java.lang.ClassCastException r0 = L(r0)
            throw r0
    }
}
