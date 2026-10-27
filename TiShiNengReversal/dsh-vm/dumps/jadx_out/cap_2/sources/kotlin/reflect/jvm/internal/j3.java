package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j3 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.j3 a = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.renderer.m b = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlin.reflect.KParameter$Kind[] r0 = kotlin.reflect.KParameter.Kind.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.KParameter$Kind r1 = kotlin.reflect.KParameter.Kind.EXTENSION_RECEIVER     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.reflect.KParameter$Kind r1 = kotlin.reflect.KParameter.Kind.INSTANCE     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.reflect.KParameter$Kind r1 = kotlin.reflect.KParameter.Kind.VALUE     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.reflect.jvm.internal.j3.a.a = r0
                return
        }
    }

    static {
            kotlin.reflect.jvm.internal.j3 r0 = new kotlin.reflect.jvm.internal.j3
            r0.<init>()
            kotlin.reflect.jvm.internal.j3.a = r0
            kotlin.reflect.jvm.internal.impl.renderer.m r0 = kotlin.reflect.jvm.internal.impl.renderer.m.h
            kotlin.reflect.jvm.internal.j3.b = r0
            return
    }

    private j3() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ java.lang.CharSequence a(kotlin.reflect.jvm.internal.impl.descriptors.q1 r0) {
            java.lang.CharSequence r0 = g(r0)
            return r0
    }

    static /* synthetic */ java.lang.CharSequence b(kotlin.reflect.jvm.internal.impl.descriptors.q1 r0) {
            java.lang.CharSequence r0 = i(r0)
            return r0
    }

    private final void c(java.lang.StringBuilder r2, kotlin.reflect.jvm.internal.impl.descriptors.z0 r3) {
            r1 = this;
            if (r3 == 0) goto L17
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = r3.getType()
            java.lang.String r0 = "getType(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            java.lang.String r3 = r1.l(r3)
            r2.append(r3)
            java.lang.String r3 = "."
            r2.append(r3)
        L17:
            return
    }

    private final void d(java.lang.StringBuilder r3, kotlin.reflect.jvm.internal.impl.descriptors.a r4) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = kotlin.reflect.jvm.internal.p3.k(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r4 = r4.f0()
            r2.c(r3, r0)
            if (r0 == 0) goto L11
            if (r4 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L19
            java.lang.String r1 = "("
            r3.append(r1)
        L19:
            r2.c(r3, r4)
            if (r0 == 0) goto L23
            java.lang.String r4 = ")"
            r3.append(r4)
        L23:
            return
    }

    private final java.lang.String e(kotlin.reflect.jvm.internal.impl.descriptors.a r4) {
            r3 = this;
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.w0
            if (r0 == 0) goto Lb
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r4
            java.lang.String r4 = r3.k(r4)
            return r4
        Lb:
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.y
            if (r0 == 0) goto L16
            kotlin.reflect.jvm.internal.impl.descriptors.y r4 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r4
            java.lang.String r4 = r3.f(r4)
            return r4
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal callable: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private static final java.lang.CharSequence g(kotlin.reflect.jvm.internal.impl.descriptors.q1 r2) {
            kotlin.reflect.jvm.internal.j3 r0 = kotlin.reflect.jvm.internal.j3.a
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.getType()
            java.lang.String r1 = "getType(...)"
            kotlin.jvm.internal.g0.o(r2, r1)
            java.lang.String r2 = r0.l(r2)
            return r2
    }

    private static final java.lang.CharSequence i(kotlin.reflect.jvm.internal.impl.descriptors.q1 r2) {
            kotlin.reflect.jvm.internal.j3 r0 = kotlin.reflect.jvm.internal.j3.a
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.getType()
            java.lang.String r1 = "getType(...)"
            kotlin.jvm.internal.g0.o(r2, r1)
            java.lang.String r2 = r0.l(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r12) {
            r11 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "fun "
            r2.append(r0)
            kotlin.reflect.jvm.internal.j3 r0 = kotlin.reflect.jvm.internal.j3.a
            r0.d(r2, r12)
            kotlin.reflect.jvm.internal.impl.renderer.m r1 = kotlin.reflect.jvm.internal.j3.b
            kotlin.reflect.jvm.internal.impl.name.f r3 = r12.getName()
            java.lang.String r4 = "getName(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            r4 = 1
            java.lang.String r1 = r1.S(r3, r4)
            r2.append(r1)
            java.util.List r1 = r12.g()
            java.lang.String r3 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r1, r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.reflect.jvm.internal.h3 r8 = kotlin.reflect.jvm.internal.h3.a
            r9 = 48
            r10 = 0
            java.lang.String r3 = ", "
            java.lang.String r4 = "("
            java.lang.String r5 = ")"
            r6 = 0
            r7 = 0
            kotlin.collections.f0.p3(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r1 = ": "
            r2.append(r1)
            kotlin.reflect.jvm.internal.impl.types.t0 r12 = r12.getReturnType()
            kotlin.jvm.internal.g0.m(r12)
            java.lang.String r12 = r0.l(r12)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            return r12
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r12) {
            r11 = this;
            java.lang.String r0 = "invoke"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            kotlin.reflect.jvm.internal.j3 r0 = kotlin.reflect.jvm.internal.j3.a
            r0.d(r2, r12)
            java.util.List r1 = r12.g()
            java.lang.String r3 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r1, r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.reflect.jvm.internal.i3 r8 = kotlin.reflect.jvm.internal.i3.a
            r9 = 48
            r10 = 0
            java.lang.String r3 = ", "
            java.lang.String r4 = "("
            java.lang.String r5 = ")"
            r6 = 0
            r7 = 0
            kotlin.collections.f0.p3(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r1 = " -> "
            r2.append(r1)
            kotlin.reflect.jvm.internal.impl.types.t0 r12 = r12.getReturnType()
            kotlin.jvm.internal.g0.m(r12)
            java.lang.String r12 = r0.l(r12)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            return r12
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.d2 r4) {
            r3 = this;
            java.lang.String r0 = "parameter"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.reflect.KParameter$Kind r1 = r4.h()
            int[] r2 = kotlin.reflect.jvm.internal.j3.a.a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L50
            r2 = 2
            if (r1 == r2) goto L4a
            r2 = 3
            if (r1 != r2) goto L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "parameter #"
            r1.append(r2)
            int r2 = r4.getIndex()
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            java.lang.String r2 = r4.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            goto L55
        L44:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L4a:
            java.lang.String r1 = "instance parameter"
            r0.append(r1)
            goto L55
        L50:
            java.lang.String r1 = "extension receiver parameter"
            r0.append(r1)
        L55:
            java.lang.String r1 = " of "
            r0.append(r1)
            kotlin.reflect.jvm.internal.j3 r1 = kotlin.reflect.jvm.internal.j3.a
            kotlin.reflect.jvm.internal.e0 r4 = r4.l()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = r4.Z()
            java.lang.String r4 = r1.e(r4)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.w0 r6) {
            r5 = this;
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r6.C()
            if (r1 == 0) goto L13
            java.lang.String r1 = "var "
            goto L15
        L13:
            java.lang.String r1 = "val "
        L15:
            r0.append(r1)
            kotlin.reflect.jvm.internal.j3 r1 = kotlin.reflect.jvm.internal.j3.a
            r1.d(r0, r6)
            kotlin.reflect.jvm.internal.impl.renderer.m r2 = kotlin.reflect.jvm.internal.j3.b
            kotlin.reflect.jvm.internal.impl.name.f r3 = r6.getName()
            java.lang.String r4 = "getName(...)"
            kotlin.jvm.internal.g0.o(r3, r4)
            r4 = 1
            java.lang.String r2 = r2.S(r3, r4)
            r0.append(r2)
            java.lang.String r2 = ": "
            r0.append(r2)
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = r6.getType()
            java.lang.String r2 = "getType(...)"
            kotlin.jvm.internal.g0.o(r6, r2)
            java.lang.String r6 = r1.l(r6)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.renderer.m r0 = kotlin.reflect.jvm.internal.j3.b
            java.lang.String r2 = r0.T(r2)
            return r2
    }
}
