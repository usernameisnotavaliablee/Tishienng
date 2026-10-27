package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g2 {
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.e1 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.types.m2 r0 = r3.L0()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.e1
            if (r1 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = (kotlin.reflect.jvm.internal.impl.types.e1) r0
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == 0) goto L14
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "This is should be simple type: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.t0 b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r7, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.c2> r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "newArguments"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "newAnnotations"
            kotlin.jvm.internal.g0.p(r9, r0)
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            kotlin.reflect.jvm.internal.impl.types.t0 r7 = e(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.t0 c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.c2> r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.c2> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "newArguments"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "newAnnotations"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "newArgumentsForUpperBound"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L20
            java.util.List r0 = r2.G0()
            if (r3 != r0) goto L27
        L20:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r2.getAnnotations()
            if (r4 != r0) goto L27
            return r2
        L27:
            kotlin.reflect.jvm.internal.impl.types.t1 r0 = r2.H0()
            boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.annotations.o
            if (r1 == 0) goto L3e
            r1 = r4
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.o r1 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.o) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3e
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r4 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r4.b()
        L3e:
            kotlin.reflect.jvm.internal.impl.types.t1 r4 = kotlin.reflect.jvm.internal.impl.types.u1.a(r0, r4)
            kotlin.reflect.jvm.internal.impl.types.m2 r2 = r2.L0()
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.k0
            if (r0 == 0) goto L61
            kotlin.reflect.jvm.internal.impl.types.k0 r2 = (kotlin.reflect.jvm.internal.impl.types.k0) r2
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r2.Q0()
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = d(r0, r3, r4)
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.R0()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = d(r2, r5, r4)
            kotlin.reflect.jvm.internal.impl.types.m2 r2 = kotlin.reflect.jvm.internal.impl.types.w0.e(r3, r2)
            return r2
        L61:
            boolean r5 = r2 instanceof kotlin.reflect.jvm.internal.impl.types.e1
            if (r5 == 0) goto L6c
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = (kotlin.reflect.jvm.internal.impl.types.e1) r2
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = d(r2, r3, r4)
            return r2
        L6c:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.e1 d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r7, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.c2> r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "newArguments"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "newAttributes"
            kotlin.jvm.internal.g0.p(r9, r0)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L1c
            kotlin.reflect.jvm.internal.impl.types.t1 r0 = r7.H0()
            if (r9 != r0) goto L1c
            return r7
        L1c:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L27
            kotlin.reflect.jvm.internal.impl.types.e1 r7 = r7.Q0(r9)
            return r7
        L27:
            boolean r0 = r7 instanceof kotlin.reflect.jvm.internal.impl.types.error.g
            if (r0 == 0) goto L32
            kotlin.reflect.jvm.internal.impl.types.error.g r7 = (kotlin.reflect.jvm.internal.impl.types.error.g) r7
            kotlin.reflect.jvm.internal.impl.types.error.g r7 = r7.U0(r8)
            return r7
        L32:
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r7.I0()
            boolean r3 = r7.J0()
            r5 = 16
            r6 = 0
            r4 = 0
            r2 = r8
            r0 = r9
            kotlin.reflect.jvm.internal.impl.types.e1 r7 = kotlin.reflect.jvm.internal.impl.types.w0.m(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 e(kotlin.reflect.jvm.internal.impl.types.t0 r0, java.util.List r1, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2, java.util.List r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L8
            java.util.List r1 = r0.G0()
        L8:
            r5 = r4 & 2
            if (r5 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r0.getAnnotations()
        L10:
            r4 = r4 & 4
            if (r4 == 0) goto L15
            r3 = r1
        L15:
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = c(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.e1 f(kotlin.reflect.jvm.internal.impl.types.e1 r0, java.util.List r1, kotlin.reflect.jvm.internal.impl.types.t1 r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L8
            java.util.List r1 = r0.G0()
        L8:
            r3 = r3 & 2
            if (r3 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.types.t1 r2 = r0.H0()
        L10:
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = d(r0, r1, r2)
            return r0
    }
}
