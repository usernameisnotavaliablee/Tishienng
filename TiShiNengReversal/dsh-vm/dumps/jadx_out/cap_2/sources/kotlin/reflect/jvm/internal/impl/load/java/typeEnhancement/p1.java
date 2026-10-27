package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\ntypeEnhancementUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeEnhancementUtils.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n1#2:74\n1#2:85\n1#2:98\n1#2:111\n1617#3,9:75\n1869#3:84\n1870#3:86\n1626#3:87\n1617#3,9:88\n1869#3:97\n1870#3:99\n1626#3:100\n1617#3,9:101\n1869#3:110\n1870#3:112\n1626#3:113\n1761#3,3:114\n*S KotlinDebug\n*F\n+ 1 typeEnhancementUtils.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementUtilsKt\n*L\n43#1:85\n45#1:98\n47#1:111\n43#1:75,9\n43#1:84\n43#1:86\n43#1:87\n45#1:88,9\n45#1:97\n45#1:99\n45#1:100\n47#1:101,9\n47#1:110\n47#1:112\n47#1:113\n58#1:114,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class p1 {
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6, @org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h> r7, boolean r8, boolean r9, boolean r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "superQualifiers"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r7.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r2 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h) r2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r2 = b(r2)
            if (r2 == 0) goto L15
            r0.add(r2)
            goto L15
        L2b:
            java.util.Set r0 = kotlin.collections.f0.f6(r0)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = b(r6)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = f(r0, r1, r8)
            if (r0 != 0) goto L65
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r7.iterator()
        L42:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L58
            java.lang.Object r3 = r2.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r3 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h) r3
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = r3.f()
            if (r3 == 0) goto L42
            r1.add(r3)
            goto L42
        L58:
            java.util.Set r1 = kotlin.collections.f0.f6(r1)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r2 = r6.f()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = f(r1, r2, r8)
            goto L66
        L65:
            r1 = r0
        L66:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r7.iterator()
        L6f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L85
            java.lang.Object r4 = r3.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r4 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h) r4
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r4 = r4.e()
            if (r4 == 0) goto L6f
            r2.add(r4)
            goto L6f
        L85:
            java.util.Set r2 = kotlin.collections.f0.f6(r2)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r5 = r6.e()
            java.lang.Object r8 = e(r2, r3, r4, r5, r8)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r8 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier) r8
            r2 = 0
            if (r1 == 0) goto La2
            if (r10 != 0) goto La2
            if (r9 == 0) goto La3
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r9 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            if (r1 != r9) goto La3
        La2:
            r1 = r2
        La3:
            r9 = 0
            r10 = 1
            if (r1 == 0) goto Lab
            if (r0 != 0) goto Lab
            r0 = 1
            goto Lac
        Lab:
            r0 = 0
        Lac:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            if (r1 != r2) goto Ld7
            boolean r6 = d(r6, r0)
            if (r6 != 0) goto Ld6
            r6 = r7
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto Lc0
            goto Ld7
        Lc0:
            java.util.Iterator r6 = r7.iterator()
        Lc4:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Ld7
            java.lang.Object r7 = r6.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r7 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h) r7
            boolean r7 = d(r7, r0)
            if (r7 == 0) goto Lc4
        Ld6:
            r9 = 1
        Ld7:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r6 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h
            r6.<init>(r1, r8, r9, r0)
            return r6
    }

    private static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier b(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r1) {
            boolean r0 = r1.g()
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = r1.f()
            return r1
    }

    public static final boolean c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.i2 r2, @org.jetbrains.annotations.NotNull d4.g r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.load.java.i0.v
            java.lang.String r1 = "ENHANCED_NULLABILITY_ANNOTATION"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r2 = r2.T(r3, r0)
            return r2
    }

    private static final boolean d(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r1, boolean r2) {
            boolean r0 = r1.g()
            if (r0 != r2) goto Le
            boolean r1 = r1.d()
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    private static final <T> T e(java.util.Set<? extends T> r1, T r2, T r3, T r4, boolean r5) {
            if (r5 == 0) goto L25
            boolean r5 = r1.contains(r2)
            r0 = 0
            if (r5 == 0) goto Lb
            r1 = r2
            goto L14
        Lb:
            boolean r1 = r1.contains(r3)
            if (r1 == 0) goto L13
            r1 = r3
            goto L14
        L13:
            r1 = r0
        L14:
            boolean r2 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r2 == 0) goto L21
            boolean r2 = kotlin.jvm.internal.g0.g(r4, r3)
            if (r2 == 0) goto L21
            return r0
        L21:
            if (r4 != 0) goto L24
            return r1
        L24:
            return r4
        L25:
            if (r4 == 0) goto L33
            java.util.Set r2 = kotlin.collections.u1.D(r1, r4)
            java.util.Set r2 = kotlin.collections.f0.f6(r2)
            if (r2 != 0) goto L32
            goto L33
        L32:
            r1 = r2
        L33:
            java.lang.Object r1 = kotlin.collections.f0.n5(r1)
            return r1
    }

    private static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier f(java.util.Set<? extends kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier> r2, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3, boolean r4) {
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            if (r3 != r0) goto L5
            return r0
        L5:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            java.lang.Object r2 = e(r2, r0, r1, r3, r4)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r2 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier) r2
            return r2
    }
}
