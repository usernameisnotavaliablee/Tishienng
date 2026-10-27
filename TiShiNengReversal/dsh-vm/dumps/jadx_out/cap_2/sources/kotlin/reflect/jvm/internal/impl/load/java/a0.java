package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJavaNullabilityAnnotationSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaNullabilityAnnotationSettings.kt\norg/jetbrains/kotlin/load/java/JavaNullabilityAnnotationSettingsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a0 {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.name.c a = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.name.c b = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.name.c c = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.name.c d = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String e = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.name.c[] f = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.load.java.k0<kotlin.reflect.jvm.internal.impl.load.java.b0> g = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.load.java.b0 h = null;

    static {
            kotlin.reflect.jvm.internal.impl.name.c r0 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r1 = "org.jspecify.nullness"
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.load.java.a0.a = r0
            kotlin.reflect.jvm.internal.impl.name.c r1 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r2 = "org.jspecify.annotations"
            r1.<init>(r2)
            kotlin.reflect.jvm.internal.impl.load.java.a0.b = r1
            kotlin.reflect.jvm.internal.impl.name.c r2 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r3 = "io.reactivex.rxjava3.annotations"
            r2.<init>(r3)
            kotlin.reflect.jvm.internal.impl.load.java.a0.c = r2
            kotlin.reflect.jvm.internal.impl.name.c r3 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r4 = "org.checkerframework.checker.nullness.compatqual"
            r3.<init>(r4)
            kotlin.reflect.jvm.internal.impl.load.java.a0.d = r3
            java.lang.String r4 = r2.a()
            kotlin.reflect.jvm.internal.impl.load.java.a0.e = r4
            kotlin.reflect.jvm.internal.impl.name.c r5 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r7 = ".Nullable"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            kotlin.reflect.jvm.internal.impl.name.c r6 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            java.lang.String r4 = ".NonNull"
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r6.<init>(r4)
            r4 = 2
            kotlin.reflect.jvm.internal.impl.name.c[] r7 = new kotlin.reflect.jvm.internal.impl.name.c[r4]
            r8 = 0
            r7[r8] = r5
            r5 = 1
            r7[r5] = r6
            kotlin.reflect.jvm.internal.impl.load.java.a0.f = r7
            kotlin.reflect.jvm.internal.impl.load.java.m0 r6 = new kotlin.reflect.jvm.internal.impl.load.java.m0
            kotlin.reflect.jvm.internal.impl.name.c r7 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r9 = "org.jetbrains.annotations"
            r7.<init>(r9)
            kotlin.reflect.jvm.internal.impl.load.java.b0$a r9 = kotlin.reflect.jvm.internal.impl.load.java.b0.d
            kotlin.reflect.jvm.internal.impl.load.java.b0 r10 = r9.a()
            kotlin.Pair r7 = kotlin.o0.a(r7, r10)
            kotlin.reflect.jvm.internal.impl.name.c r10 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r11 = "androidx.annotation"
            r10.<init>(r11)
            kotlin.reflect.jvm.internal.impl.load.java.b0 r11 = r9.a()
            kotlin.Pair r10 = kotlin.o0.a(r10, r11)
            kotlin.reflect.jvm.internal.impl.name.c r11 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r12 = "android.support.annotation"
            r11.<init>(r12)
            kotlin.reflect.jvm.internal.impl.load.java.b0 r12 = r9.a()
            kotlin.Pair r11 = kotlin.o0.a(r11, r12)
            kotlin.reflect.jvm.internal.impl.name.c r12 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r13 = "android.annotation"
            r12.<init>(r13)
            kotlin.reflect.jvm.internal.impl.load.java.b0 r13 = r9.a()
            kotlin.Pair r12 = kotlin.o0.a(r12, r13)
            kotlin.reflect.jvm.internal.impl.name.c r13 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r14 = "com.android.annotations"
            r13.<init>(r14)
            kotlin.reflect.jvm.internal.impl.load.java.b0 r14 = r9.a()
            kotlin.Pair r13 = kotlin.o0.a(r13, r14)
            kotlin.reflect.jvm.internal.impl.name.c r14 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r15 = "org.eclipse.jdt.annotation"
            r14.<init>(r15)
            kotlin.reflect.jvm.internal.impl.load.java.b0 r15 = r9.a()
            kotlin.Pair r14 = kotlin.o0.a(r14, r15)
            kotlin.reflect.jvm.internal.impl.name.c r15 = new kotlin.reflect.jvm.internal.impl.name.c
            r16 = 0
            java.lang.String r8 = "org.checkerframework.checker.nullness.qual"
            r15.<init>(r8)
            kotlin.reflect.jvm.internal.impl.load.java.b0 r8 = r9.a()
            kotlin.Pair r8 = kotlin.o0.a(r15, r8)
            kotlin.reflect.jvm.internal.impl.load.java.b0 r15 = r9.a()
            kotlin.Pair r3 = kotlin.o0.a(r3, r15)
            kotlin.reflect.jvm.internal.impl.name.c r15 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r4 = "javax.annotation"
            r15.<init>(r4)
            kotlin.reflect.jvm.internal.impl.load.java.b0 r4 = r9.a()
            kotlin.Pair r4 = kotlin.o0.a(r15, r4)
            kotlin.reflect.jvm.internal.impl.name.c r15 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r5 = "edu.umd.cs.findbugs.annotations"
            r15.<init>(r5)
            kotlin.reflect.jvm.internal.impl.load.java.b0 r5 = r9.a()
            kotlin.Pair r5 = kotlin.o0.a(r15, r5)
            kotlin.reflect.jvm.internal.impl.name.c r15 = new kotlin.reflect.jvm.internal.impl.name.c
            r18 = r3
            java.lang.String r3 = "io.reactivex.annotations"
            r15.<init>(r3)
            kotlin.reflect.jvm.internal.impl.load.java.b0 r3 = r9.a()
            kotlin.Pair r3 = kotlin.o0.a(r15, r3)
            kotlin.reflect.jvm.internal.impl.name.c r15 = new kotlin.reflect.jvm.internal.impl.name.c
            r19 = r3
            java.lang.String r3 = "androidx.annotation.RecentlyNullable"
            r15.<init>(r3)
            kotlin.reflect.jvm.internal.impl.load.java.b0 r20 = new kotlin.reflect.jvm.internal.impl.load.java.b0
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r22 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.WARN
            r24 = 4
            r25 = 0
            r21 = r22
            r22 = 0
            r23 = 0
            r20.<init>(r21, r22, r23, r24, r25)
            r3 = r20
            kotlin.Pair r3 = kotlin.o0.a(r15, r3)
            kotlin.reflect.jvm.internal.impl.name.c r15 = new kotlin.reflect.jvm.internal.impl.name.c
            r20 = r3
            java.lang.String r3 = "androidx.annotation.RecentlyNonNull"
            r15.<init>(r3)
            r22 = r21
            kotlin.reflect.jvm.internal.impl.load.java.b0 r21 = new kotlin.reflect.jvm.internal.impl.load.java.b0
            r25 = 4
            r26 = 0
            r24 = 0
            r21.<init>(r22, r23, r24, r25, r26)
            r3 = r21
            r21 = r4
            r4 = r3
            r3 = r22
            kotlin.Pair r4 = kotlin.o0.a(r15, r4)
            kotlin.reflect.jvm.internal.impl.name.c r15 = new kotlin.reflect.jvm.internal.impl.name.c
            r22 = r4
            java.lang.String r4 = "lombok"
            r15.<init>(r4)
            kotlin.reflect.jvm.internal.impl.load.java.b0 r4 = r9.a()
            kotlin.Pair r4 = kotlin.o0.a(r15, r4)
            kotlin.reflect.jvm.internal.impl.load.java.b0 r9 = new kotlin.reflect.jvm.internal.impl.load.java.b0
            kotlin.p r15 = new kotlin.p
            r23 = r4
            r24 = r5
            r4 = 2
            r5 = 1
            r15.<init>(r4, r5)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r4 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.STRICT
            r9.<init>(r3, r15, r4)
            kotlin.Pair r0 = kotlin.o0.a(r0, r9)
            kotlin.reflect.jvm.internal.impl.load.java.b0 r9 = new kotlin.reflect.jvm.internal.impl.load.java.b0
            kotlin.p r15 = new kotlin.p
            r25 = r0
            r0 = 2
            r15.<init>(r0, r5)
            r9.<init>(r3, r15, r4)
            kotlin.Pair r0 = kotlin.o0.a(r1, r9)
            kotlin.reflect.jvm.internal.impl.load.java.b0 r1 = new kotlin.reflect.jvm.internal.impl.load.java.b0
            kotlin.p r9 = new kotlin.p
            r15 = 8
            r9.<init>(r5, r15)
            r1.<init>(r3, r9, r4)
            kotlin.Pair r1 = kotlin.o0.a(r2, r1)
            kotlin.reflect.jvm.internal.impl.name.c r2 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r5 = "jakarta.annotation"
            r2.<init>(r5)
            kotlin.reflect.jvm.internal.impl.load.java.b0 r5 = new kotlin.reflect.jvm.internal.impl.load.java.b0
            kotlin.p r9 = new kotlin.p
            r26 = 8
            r15 = 4
            r27 = r0
            r0 = 2
            r9.<init>(r0, r15)
            r5.<init>(r3, r9, r4)
            kotlin.Pair r2 = kotlin.o0.a(r2, r5)
            r4 = 18
            kotlin.Pair[] r4 = new kotlin.Pair[r4]
            r4[r16] = r7
            r17 = 1
            r4[r17] = r10
            r4[r0] = r11
            r0 = 3
            r4[r0] = r12
            r4[r15] = r13
            r0 = 5
            r4[r0] = r14
            r0 = 6
            r4[r0] = r8
            r0 = 7
            r4[r0] = r18
            r4[r26] = r21
            r0 = 9
            r4[r0] = r24
            r0 = 10
            r4[r0] = r19
            r0 = 11
            r4[r0] = r20
            r0 = 12
            r4[r0] = r22
            r0 = 13
            r4[r0] = r23
            r0 = 14
            r4[r0] = r25
            r0 = 15
            r4[r0] = r27
            r0 = 16
            r4[r0] = r1
            r0 = 17
            r4[r0] = r2
            java.util.Map r0 = kotlin.collections.i1.W(r4)
            r6.<init>(r0)
            kotlin.reflect.jvm.internal.impl.load.java.a0.g = r6
            kotlin.reflect.jvm.internal.impl.load.java.b0 r21 = new kotlin.reflect.jvm.internal.impl.load.java.b0
            r25 = 4
            r26 = 0
            r23 = 0
            r24 = 0
            r22 = r3
            r21.<init>(r22, r23, r24, r25, r26)
            kotlin.reflect.jvm.internal.impl.load.java.a0.h = r21
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.g0 a(@org.jetbrains.annotations.NotNull kotlin.p r6) {
            java.lang.String r0 = "configuredKotlinVersion"
            kotlin.jvm.internal.g0.p(r6, r0)
            kotlin.reflect.jvm.internal.impl.load.java.b0 r0 = kotlin.reflect.jvm.internal.impl.load.java.a0.h
            kotlin.p r1 = r0.d()
            if (r1 == 0) goto L1d
            kotlin.p r1 = r0.d()
            int r6 = r1.a(r6)
            if (r6 > 0) goto L1d
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r6 = r0.b()
        L1b:
            r1 = r6
            goto L22
        L1d:
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r6 = r0.c()
            goto L1b
        L22:
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r2 = b(r1)
            kotlin.reflect.jvm.internal.impl.load.java.g0 r0 = new kotlin.reflect.jvm.internal.impl.load.java.g0
            r4 = 4
            r5 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1) {
            java.lang.String r0 = "globalReportLevel"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r0 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.WARN
            if (r1 != r0) goto La
            r1 = 0
        La:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r1, @org.jetbrains.annotations.NotNull kotlin.p r2) {
            java.lang.String r0 = "annotationFqName"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "configuredKotlinVersion"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.load.java.k0$a r0 = kotlin.reflect.jvm.internal.impl.load.java.k0.a
            kotlin.reflect.jvm.internal.impl.load.java.k0 r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = f(r1, r0, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.name.c d() {
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.load.java.a0.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.name.c[] e() {
            kotlin.reflect.jvm.internal.impl.name.c[] r0 = kotlin.reflect.jvm.internal.impl.load.java.a0.f
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.k0<? extends kotlin.reflect.jvm.internal.impl.load.java.ReportLevel> r2, @org.jetbrains.annotations.NotNull kotlin.p r3) {
            java.lang.String r0 = "annotation"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "configuredReportLevels"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "configuredKotlinVersion"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Object r2 = r2.a(r1)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r2 = (kotlin.reflect.jvm.internal.impl.load.java.ReportLevel) r2
            if (r2 == 0) goto L18
            return r2
        L18:
            kotlin.reflect.jvm.internal.impl.load.java.k0<kotlin.reflect.jvm.internal.impl.load.java.b0> r2 = kotlin.reflect.jvm.internal.impl.load.java.a0.g
            java.lang.Object r1 = r2.a(r1)
            kotlin.reflect.jvm.internal.impl.load.java.b0 r1 = (kotlin.reflect.jvm.internal.impl.load.java.b0) r1
            if (r1 != 0) goto L25
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.IGNORE
            return r1
        L25:
            kotlin.p r2 = r1.d()
            if (r2 == 0) goto L3a
            kotlin.p r2 = r1.d()
            int r2 = r2.a(r3)
            if (r2 > 0) goto L3a
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = r1.b()
            return r1
        L3a:
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = r1.c()
            return r1
    }
}
