package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRawType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawType.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawTypeImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1740#2,3:99\n1563#2:102\n1634#2,3:103\n*S KotlinDebug\n*F\n+ 1 RawType.kt\norg/jetbrains/kotlin/load/java/lazy/types/RawTypeImpl\n*L\n80#1:99,3\n61#1:102\n61#1:103,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j extends kotlin.reflect.jvm.internal.impl.types.k0 implements kotlin.reflect.jvm.internal.impl.types.d1 {
    public j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r3) {
            r1 = this;
            java.lang.String r0 = "lowerBound"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "upperBound"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    private j(kotlin.reflect.jvm.internal.impl.types.e1 r1, kotlin.reflect.jvm.internal.impl.types.e1 r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2)
            if (r3 != 0) goto La
            kotlin.reflect.jvm.internal.impl.types.checker.e r3 = kotlin.reflect.jvm.internal.impl.types.checker.e.a
            r3.d(r1, r2)
        La:
            return
    }

    static /* synthetic */ java.lang.CharSequence T0(java.lang.String r0) {
            java.lang.CharSequence r0 = W0(r0)
            return r0
    }

    private static final java.lang.CharSequence W0(java.lang.String r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "(raw) "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static final boolean X0(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = "out "
            java.lang.String r0 = kotlin.text.u.v4(r2, r0)
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r0)
            if (r1 != 0) goto L17
            java.lang.String r1 = "*"
            boolean r1 = kotlin.jvm.internal.g0.g(r2, r1)
            if (r1 == 0) goto L15
            goto L17
        L15:
            r1 = 0
            return r1
        L17:
            r1 = 1
            return r1
    }

    private static final java.util.List<java.lang.String> Y0(kotlin.reflect.jvm.internal.impl.renderer.m r2, kotlin.reflect.jvm.internal.impl.types.t0 r3) {
            java.util.List r3 = r3.G0()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r3, r1)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L15:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r3.next()
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = (kotlin.reflect.jvm.internal.impl.types.c2) r1
            java.lang.String r1 = r2.U(r1)
            r0.add(r1)
            goto L15
        L29:
            return r0
    }

    private static final java.lang.String Z0(java.lang.String r5, java.lang.String r6) {
            r0 = 60
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r1 = kotlin.text.u.k3(r5, r0, r1, r2, r3)
            if (r1 != 0) goto Lc
            return r5
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = kotlin.text.u.R5(r5, r0, r3, r2, r3)
            r1.append(r4)
            r1.append(r0)
            r1.append(r6)
            r6 = 62
            r1.append(r6)
            java.lang.String r5 = kotlin.text.u.N5(r5, r6, r3, r2, r3)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 K0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.k0 r1 = r0.V0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 M0(boolean r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.j r1 = r0.U0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 N0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.k0 r1 = r0.V0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.m2
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 O0(kotlin.reflect.jvm.internal.impl.types.t1 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.j r1 = r0.a1(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.k0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 P0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.Q0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.k0
    @org.jetbrains.annotations.NotNull
    public java.lang.String S0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.m r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.u r14) {
            r12 = this;
            java.lang.String r0 = "renderer"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.g0.p(r14, r0)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r12.Q0()
            java.lang.String r0 = r13.T(r0)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r12.R0()
            java.lang.String r1 = r13.T(r1)
            boolean r14 = r14.d()
            if (r14 == 0) goto L3f
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "raw ("
            r13.append(r14)
            r13.append(r0)
            java.lang.String r14 = ".."
            r13.append(r14)
            r13.append(r1)
            r14 = 41
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            return r13
        L3f:
            kotlin.reflect.jvm.internal.impl.types.e1 r14 = r12.R0()
            java.util.List r14 = r14.G0()
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L56
            kotlin.reflect.jvm.internal.impl.builtins.j r14 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.o(r12)
            java.lang.String r13 = r13.Q(r0, r1, r14)
            return r13
        L56:
            kotlin.reflect.jvm.internal.impl.types.e1 r14 = r12.Q0()
            java.util.List r14 = Y0(r13, r14)
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r12.R0()
            java.util.List r2 = Y0(r13, r2)
            r3 = r14
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.i r9 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.i.a
            r10 = 30
            r11 = 0
            java.lang.String r4 = ", "
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r14 = kotlin.collections.f0.r3(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.f0.o6(r3, r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L8e
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L8e
            goto Lb1
        L8e:
            java.util.Iterator r2 = r2.iterator()
        L92:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb1
            java.lang.Object r3 = r2.next()
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r4 = r3.getFirst()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getSecond()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = X0(r4, r3)
            if (r3 != 0) goto L92
            goto Lb5
        Lb1:
            java.lang.String r1 = Z0(r1, r14)
        Lb5:
            java.lang.String r14 = Z0(r0, r14)
            boolean r0 = kotlin.jvm.internal.g0.g(r14, r1)
            if (r0 == 0) goto Lc0
            return r14
        Lc0:
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.o(r12)
            java.lang.String r13 = r13.Q(r14, r1, r0)
            return r13
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.load.java.lazy.types.j U0(boolean r4) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.j r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.j
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r3.Q0()
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.P0(r4)
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r3.R0()
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r2.P0(r4)
            r0.<init>(r1, r4)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.k0 V0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r5) {
            r4 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.j r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.j
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r4.Q0()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r5.h(r1)
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"
            kotlin.jvm.internal.g0.n(r1, r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = (kotlin.reflect.jvm.internal.impl.types.e1) r1
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r4.R0()
            kotlin.reflect.jvm.internal.impl.types.t0 r5 = r5.h(r3)
            kotlin.jvm.internal.g0.n(r5, r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r5 = (kotlin.reflect.jvm.internal.impl.types.e1) r5
            r2 = 1
            r0.<init>(r1, r5, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.load.java.lazy.types.j a1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r4) {
            r3 = this;
            java.lang.String r0 = "newAttributes"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.j r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.j
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r3.Q0()
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.Q0(r4)
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r3.R0()
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r2.Q0(r4)
            r0.<init>(r1, r4)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.k0, kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k r() {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r4.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.c()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            r2 = 0
            if (r1 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 == 0) goto L23
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.h r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.h
            r3 = 1
            r1.<init>(r2, r3, r2)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r0.v0(r1)
            java.lang.String r1 = "getMemberScope(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Incorrect classifier: "
            r1.append(r2)
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r4.I0()
            kotlin.reflect.jvm.internal.impl.descriptors.f r2 = r2.c()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
