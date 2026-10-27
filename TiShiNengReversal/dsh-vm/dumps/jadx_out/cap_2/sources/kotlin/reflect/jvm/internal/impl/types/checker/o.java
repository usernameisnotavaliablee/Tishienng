package kotlin.reflect.jvm.internal.impl.types.checker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nNewCapturedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,290:1\n1#2:291\n1#2:310\n1669#3,8:292\n1617#3,9:300\n1869#3:309\n1870#3:311\n1626#3:312\n1740#3,3:313\n1563#3:316\n1634#3,3:317\n1634#3,3:320\n1563#3:323\n1634#3,3:324\n*S KotlinDebug\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeKt\n*L\n122#1:310\n117#1:292,8\n122#1:300,9\n122#1:309\n122#1:311\n122#1:312\n154#1:313,3\n156#1:316\n156#1:317,3\n176#1:320,3\n81#1:323\n81#1:324,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o {
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> a(kotlin.reflect.jvm.internal.impl.types.m2 r11, kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r12) {
            java.util.List r0 = r11.G0()
            int r0 = r0.size()
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r11.I0()
            java.util.List r1 = r1.getParameters()
            int r1 = r1.size()
            r2 = 0
            if (r0 == r1) goto L18
            return r2
        L18:
            java.util.List r0 = r11.G0()
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L2e
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L2e
            goto L158
        L2e:
            java.util.Iterator r3 = r1.iterator()
        L32:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L158
            java.lang.Object r4 = r3.next()
            kotlin.reflect.jvm.internal.impl.types.c2 r4 = (kotlin.reflect.jvm.internal.impl.types.c2) r4
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = r4.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            if (r4 != r5) goto L47
            goto L32
        L47:
            kotlin.reflect.jvm.internal.impl.types.w1 r3 = r11.I0()
            java.util.List r3 = r3.getParameters()
            java.lang.String r4 = "getParameters(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r1 = kotlin.collections.f0.o6(r1, r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.f0.d0(r1, r4)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L6b:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lb4
            java.lang.Object r4 = r1.next()
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r4.component1()
            kotlin.reflect.jvm.internal.impl.types.c2 r5 = (kotlin.reflect.jvm.internal.impl.types.c2) r5
            java.lang.Object r4 = r4.component2()
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r4
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = r5.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r7 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            if (r6 != r7) goto L8c
            goto Lb0
        L8c:
            boolean r6 = r5.b()
            if (r6 != 0) goto La3
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = r5.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r7 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            if (r6 != r7) goto La3
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = r5.getType()
            kotlin.reflect.jvm.internal.impl.types.m2 r6 = r6.L0()
            goto La4
        La3:
            r6 = r2
        La4:
            kotlin.reflect.jvm.internal.impl.types.checker.i r7 = new kotlin.reflect.jvm.internal.impl.types.checker.i
            kotlin.jvm.internal.g0.m(r4)
            r7.<init>(r12, r6, r5, r4)
            kotlin.reflect.jvm.internal.impl.types.c2 r5 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.e(r7)
        Lb0:
            r3.add(r5)
            goto L6b
        Lb4:
            kotlin.reflect.jvm.internal.impl.types.x1$a r12 = kotlin.reflect.jvm.internal.impl.types.x1.c
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r11.I0()
            kotlin.reflect.jvm.internal.impl.types.f2 r12 = r12.b(r1, r3)
            kotlin.reflect.jvm.internal.impl.types.h2 r12 = r12.c()
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r2 = 0
        Lca:
            if (r2 >= r1) goto L157
            java.lang.Object r4 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.types.c2 r4 = (kotlin.reflect.jvm.internal.impl.types.c2) r4
            java.lang.Object r5 = r3.get(r2)
            kotlin.reflect.jvm.internal.impl.types.c2 r5 = (kotlin.reflect.jvm.internal.impl.types.c2) r5
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = r4.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r7 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            if (r6 == r7) goto L153
            kotlin.reflect.jvm.internal.impl.types.w1 r6 = r11.I0()
            java.util.List r6 = r6.getParameters()
            java.lang.Object r6 = r6.get(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r6
            java.util.List r6 = r6.getUpperBounds()
            java.lang.String r7 = "getUpperBounds(...)"
            kotlin.jvm.internal.g0.o(r6, r7)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L102:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L122
            java.lang.Object r8 = r6.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r8 = (kotlin.reflect.jvm.internal.impl.types.t0) r8
            kotlin.reflect.jvm.internal.impl.types.checker.f$a r9 = kotlin.reflect.jvm.internal.impl.types.checker.f.a.a
            kotlin.reflect.jvm.internal.impl.types.Variance r10 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.t0 r8 = r12.n(r8, r10)
            kotlin.reflect.jvm.internal.impl.types.m2 r8 = r8.L0()
            kotlin.reflect.jvm.internal.impl.types.m2 r8 = r9.b(r8)
            r7.add(r8)
            goto L102
        L122:
            boolean r6 = r4.b()
            if (r6 != 0) goto L141
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = r4.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r8 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            if (r6 != r8) goto L141
            kotlin.reflect.jvm.internal.impl.types.checker.f$a r6 = kotlin.reflect.jvm.internal.impl.types.checker.f.a.a
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.getType()
            kotlin.reflect.jvm.internal.impl.types.m2 r4 = r4.L0()
            kotlin.reflect.jvm.internal.impl.types.m2 r4 = r6.b(r4)
            r7.add(r4)
        L141:
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r5.getType()
            java.lang.String r5 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType"
            kotlin.jvm.internal.g0.n(r4, r5)
            kotlin.reflect.jvm.internal.impl.types.checker.i r4 = (kotlin.reflect.jvm.internal.impl.types.checker.i) r4
            kotlin.reflect.jvm.internal.impl.types.checker.n r4 = r4.S0()
            r4.n(r7)
        L153:
            int r2 = r2 + 1
            goto Lca
        L157:
            return r3
        L158:
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.types.e1 b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r2) {
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "status"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.List r2 = a(r1, r2)
            if (r2 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = c(r1, r2)
            return r1
        L15:
            r1 = 0
            return r1
    }

    private static final kotlin.reflect.jvm.internal.impl.types.e1 c(kotlin.reflect.jvm.internal.impl.types.m2 r7, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.c2> r8) {
            kotlin.reflect.jvm.internal.impl.types.t1 r0 = r7.H0()
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r7.I0()
            boolean r3 = r7.J0()
            r5 = 16
            r6 = 0
            r4 = 0
            r2 = r8
            kotlin.reflect.jvm.internal.impl.types.e1 r7 = kotlin.reflect.jvm.internal.impl.types.w0.m(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }
}
