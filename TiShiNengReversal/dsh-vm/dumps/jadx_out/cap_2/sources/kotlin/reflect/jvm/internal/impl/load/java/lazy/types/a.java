package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a extends kotlin.reflect.jvm.internal.impl.types.i0 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.TypeUsage d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility e;
    private final boolean f;
    private final boolean g;

    @org.jetbrains.annotations.Nullable
    private final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.j1> h;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.types.e1 i;

    public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeUsage r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r3, boolean r4, boolean r5, @org.jetbrains.annotations.Nullable java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r6, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.e1 r7) {
            r1 = this;
            java.lang.String r0 = "howThisTypeIsUsed"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "flexibility"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>(r2, r6, r7)
            r1.d = r2
            r1.e = r3
            r1.f = r4
            r1.g = r5
            r1.h = r6
            r1.i = r7
            return
    }

    public /* synthetic */ a(kotlin.reflect.jvm.internal.impl.types.TypeUsage r8, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r9, boolean r10, boolean r11, java.util.Set r12, kotlin.reflect.jvm.internal.impl.types.e1 r13, int r14, kotlin.jvm.internal.v r15) {
            r7 = this;
            r15 = r14 & 2
            if (r15 == 0) goto L6
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r9 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.INFLEXIBLE
        L6:
            r2 = r9
            r9 = r14 & 4
            r15 = 0
            if (r9 == 0) goto Le
            r3 = 0
            goto Lf
        Le:
            r3 = r10
        Lf:
            r9 = r14 & 8
            if (r9 == 0) goto L15
            r4 = 0
            goto L16
        L15:
            r4 = r11
        L16:
            r9 = r14 & 16
            r10 = 0
            if (r9 == 0) goto L1d
            r5 = r10
            goto L1e
        L1d:
            r5 = r12
        L1e:
            r9 = r14 & 32
            if (r9 == 0) goto L26
            r6 = r10
        L23:
            r0 = r7
            r1 = r8
            goto L28
        L26:
            r6 = r13
            goto L23
        L28:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a f(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r0, kotlin.reflect.jvm.internal.impl.types.TypeUsage r1, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r2, boolean r3, boolean r4, java.util.Set r5, kotlin.reflect.jvm.internal.impl.types.e1 r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            if (r8 == 0) goto L6
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r1 = r0.d
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Lc
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r2 = r0.e
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L12
            boolean r3 = r0.f
        L12:
            r8 = r7 & 8
            if (r8 == 0) goto L18
            boolean r4 = r0.g
        L18:
            r8 = r7 & 16
            if (r8 == 0) goto L1e
            java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.j1> r5 = r0.h
        L1e:
            r7 = r7 & 32
            if (r7 == 0) goto L24
            kotlin.reflect.jvm.internal.impl.types.e1 r6 = r0.i
        L24:
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            r2 = r0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r0 = r2.e(r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i0
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.types.e1 a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.i
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.TypeUsage b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r0 = r1.d
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i0
    @org.jetbrains.annotations.Nullable
    public java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.j1> c() {
            r1 = this;
            java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.j1> r0 = r1.h
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.i0 d(kotlin.reflect.jvm.internal.impl.descriptors.j1 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r1 = r0.m(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeUsage r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r10, boolean r11, boolean r12, @org.jetbrains.annotations.Nullable java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r13, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.e1 r14) {
            r8 = this;
            java.lang.String r0 = "howThisTypeIsUsed"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "flexibility"
            kotlin.jvm.internal.g0.p(r10, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r1 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i0
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r4 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a) r4
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r4.a()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r3.a()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 == 0) goto L34
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r0 = r4.b()
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r2 = r3.b()
            if (r0 != r2) goto L34
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r0 = r4.e
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r2 = r3.e
            if (r0 != r2) goto L34
            boolean r0 = r4.f
            boolean r2 = r3.f
            if (r0 != r2) goto L34
            boolean r4 = r4.g
            boolean r0 = r3.g
            if (r4 != r0) goto L34
            r4 = 1
            return r4
        L34:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility g() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r0 = r1.e
            return r0
    }

    public final boolean h() {
            r1 = this;
            boolean r0 = r1.g
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.i0
    public int hashCode() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r3.a()
            if (r0 == 0) goto Lb
            int r0 = r0.hashCode()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r1 = r0 * 31
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r2 = r3.b()
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            int r0 = r0 + r1
            int r1 = r0 * 31
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r2 = r3.e
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            int r0 = r0 + r1
            int r1 = r0 * 31
            boolean r2 = r3.f
            int r1 = r1 + r2
            int r0 = r0 + r1
            int r1 = r0 * 31
            boolean r2 = r3.g
            int r1 = r1 + r2
            int r0 = r0 + r1
            return r0
    }

    public final boolean i() {
            r1 = this;
            boolean r0 = r1.f
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a j(boolean r10) {
            r9 = this;
            r7 = 59
            r8 = 0
            r1 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r3 = r10
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r10 = f(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a k(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.e1 r10) {
            r9 = this;
            r7 = 31
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r9
            r6 = r10
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r10 = f(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r11) {
            r10 = this;
            java.lang.String r0 = "flexibility"
            kotlin.jvm.internal.g0.p(r11, r0)
            r8 = 61
            r9 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = r10
            r3 = r11
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r11 = f(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r10) {
            r9 = this;
            java.lang.String r0 = "typeParameter"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.util.Set r0 = r9.c()
            if (r0 == 0) goto L15
            java.util.Set r0 = r9.c()
            java.util.Set r10 = kotlin.collections.u1.D(r0, r10)
        L13:
            r5 = r10
            goto L1a
        L15:
            java.util.Set r10 = kotlin.collections.u1.f(r10)
            goto L13
        L1a:
            r7 = 47
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r0 = r9
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r10 = f(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "JavaTypeAttributes(howThisTypeIsUsed="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", flexibility="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", isRaw="
            r0.append(r1)
            boolean r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", isForAnnotationParameter="
            r0.append(r1)
            boolean r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", visitedTypeParameters="
            r0.append(r1)
            java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.j1> r1 = r2.h
            r0.append(r1)
            java.lang.String r1 = ", defaultType="
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r2.i
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
