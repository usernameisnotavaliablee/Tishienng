package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCapturedTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CapturedTypeConstructor.kt\norg/jetbrains/kotlin/resolve/calls/inference/CapturedTypeConstructorKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,153:1\n1563#2:154\n1634#2,3:155\n37#3:158\n36#3,3:159\n*S KotlinDebug\n*F\n+ 1 CapturedTypeConstructor.kt\norg/jetbrains/kotlin/resolve/calls/inference/CapturedTypeConstructorKt\n*L\n125#1:154\n125#1:155,3\n127#1:158\n127#1:159,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.reflect.jvm.internal.impl.types.a0 {
        final /* synthetic */ boolean d;

        a(kotlin.reflect.jvm.internal.impl.types.f2 r1, boolean r2) {
                r0 = this;
                r0.d = r2
                r0.<init>(r1)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.a0, kotlin.reflect.jvm.internal.impl.types.f2
        public boolean b() {
                r1 = this;
                boolean r0 = r1.d
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.a0, kotlin.reflect.jvm.internal.impl.types.f2
        public kotlin.reflect.jvm.internal.impl.types.c2 e(kotlin.reflect.jvm.internal.impl.types.t0 r4) {
                r3 = this;
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g0.p(r4, r0)
                kotlin.reflect.jvm.internal.impl.types.c2 r0 = super.e(r4)
                r1 = 0
                if (r0 == 0) goto L20
                kotlin.reflect.jvm.internal.impl.types.w1 r4 = r4.I0()
                kotlin.reflect.jvm.internal.impl.descriptors.f r4 = r4.c()
                boolean r2 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
                if (r2 == 0) goto L1b
                r1 = r4
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r1
            L1b:
                kotlin.reflect.jvm.internal.impl.types.c2 r4 = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.e.a(r0, r1)
                return r4
            L20:
                return r1
        }
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.c2 a(kotlin.reflect.jvm.internal.impl.types.c2 r0, kotlin.reflect.jvm.internal.impl.descriptors.j1 r1) {
            kotlin.reflect.jvm.internal.impl.types.c2 r0 = c(r0, r1)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 b(kotlin.reflect.jvm.internal.impl.types.c2 r0) {
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = d(r0)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.types.c2 c(kotlin.reflect.jvm.internal.impl.types.c2 r3, kotlin.reflect.jvm.internal.impl.descriptors.j1 r4) {
            if (r4 == 0) goto L46
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r3.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            if (r0 != r1) goto Lb
            goto L46
        Lb:
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = r4.l()
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r3.c()
            if (r4 != r0) goto L3c
            boolean r4 = r3.b()
            if (r4 == 0) goto L32
            kotlin.reflect.jvm.internal.impl.types.e2 r4 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.z0 r0 = new kotlin.reflect.jvm.internal.impl.types.z0
            kotlin.reflect.jvm.internal.impl.storage.n r1 = kotlin.reflect.jvm.internal.impl.storage.f.e
            java.lang.String r2 = "NO_LOCKS"
            kotlin.jvm.internal.g0.o(r1, r2)
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d r2 = new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d
            r2.<init>(r3)
            r0.<init>(r1, r2)
            r4.<init>(r0)
            return r4
        L32:
            kotlin.reflect.jvm.internal.impl.types.e2 r4 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r3.getType()
            r4.<init>(r3)
            return r4
        L3c:
            kotlin.reflect.jvm.internal.impl.types.e2 r4 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = e(r3)
            r4.<init>(r3)
            return r4
        L46:
            return r3
    }

    private static final kotlin.reflect.jvm.internal.impl.types.t0 d(kotlin.reflect.jvm.internal.impl.types.c2 r1) {
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r1.getType()
            java.lang.String r0 = "getType(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.t0 e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.c2 r8) {
            java.lang.String r0 = "typeProjection"
            kotlin.jvm.internal.g0.p(r8, r0)
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a r1 = new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a
            r6 = 14
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    public static final boolean f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.I0()
            boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.f2 g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r4, boolean r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.types.o0
            if (r0 == 0) goto L5b
            kotlin.reflect.jvm.internal.impl.types.o0 r4 = (kotlin.reflect.jvm.internal.impl.types.o0) r4
            kotlin.reflect.jvm.internal.impl.descriptors.j1[] r0 = r4.j()
            kotlin.reflect.jvm.internal.impl.types.c2[] r1 = r4.i()
            kotlin.reflect.jvm.internal.impl.descriptors.j1[] r4 = r4.j()
            java.util.List r4 = kotlin.collections.n.WA(r1, r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r4, r2)
            r1.<init>(r2)
            java.util.Iterator r4 = r4.iterator()
        L2c:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r4.next()
            kotlin.Pair r2 = (kotlin.Pair) r2
            java.lang.Object r3 = r2.getFirst()
            kotlin.reflect.jvm.internal.impl.types.c2 r3 = (kotlin.reflect.jvm.internal.impl.types.c2) r3
            java.lang.Object r2 = r2.getSecond()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r2
            kotlin.reflect.jvm.internal.impl.types.c2 r2 = c(r3, r2)
            r1.add(r2)
            goto L2c
        L4c:
            r4 = 0
            kotlin.reflect.jvm.internal.impl.types.c2[] r4 = new kotlin.reflect.jvm.internal.impl.types.c2[r4]
            java.lang.Object[] r4 = r1.toArray(r4)
            kotlin.reflect.jvm.internal.impl.types.c2[] r4 = (kotlin.reflect.jvm.internal.impl.types.c2[]) r4
            kotlin.reflect.jvm.internal.impl.types.o0 r1 = new kotlin.reflect.jvm.internal.impl.types.o0
            r1.<init>(r0, r4, r5)
            return r1
        L5b:
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.e$a r0 = new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.e$a
            r0.<init>(r4, r5)
            return r0
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.f2 h(kotlin.reflect.jvm.internal.impl.types.f2 r0, boolean r1, int r2, java.lang.Object r3) {
            r3 = 1
            r2 = r2 & r3
            if (r2 == 0) goto L5
            r1 = 1
        L5:
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = g(r0, r1)
            return r0
    }
}
