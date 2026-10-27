package kotlin.reflect.jvm.internal.impl.resolve;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.resolve.g a = null;

    static {
            kotlin.reflect.jvm.internal.impl.resolve.g r0 = new kotlin.reflect.jvm.internal.impl.resolve.g
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.resolve.g.a = r0
            return
    }

    private g() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ boolean a(kotlin.reflect.jvm.internal.impl.descriptors.k r0, kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            boolean r0 = p(r0, r1)
            return r0
    }

    static /* synthetic */ boolean b(kotlin.reflect.jvm.internal.impl.descriptors.k r0, kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            boolean r0 = g(r0, r1)
            return r0
    }

    static /* synthetic */ boolean c(boolean r0, kotlin.reflect.jvm.internal.impl.descriptors.a r1, kotlin.reflect.jvm.internal.impl.descriptors.a r2, kotlin.reflect.jvm.internal.impl.types.w1 r3, kotlin.reflect.jvm.internal.impl.types.w1 r4) {
            boolean r0 = h(r0, r1, r2, r3, r4)
            return r0
    }

    static /* synthetic */ boolean d(kotlin.reflect.jvm.internal.impl.descriptors.a r0, kotlin.reflect.jvm.internal.impl.descriptors.a r1, kotlin.reflect.jvm.internal.impl.descriptors.k r2, kotlin.reflect.jvm.internal.impl.descriptors.k r3) {
            boolean r0 = i(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ boolean f(kotlin.reflect.jvm.internal.impl.resolve.g r7, kotlin.reflect.jvm.internal.impl.descriptors.a r8, kotlin.reflect.jvm.internal.impl.descriptors.a r9, boolean r10, boolean r11, boolean r12, kotlin.reflect.jvm.internal.impl.types.checker.g r13, int r14, java.lang.Object r15) {
            r15 = r14 & 8
            if (r15 == 0) goto L7
            r11 = 1
            r4 = 1
            goto L8
        L7:
            r4 = r11
        L8:
            r11 = r14 & 16
            if (r11 == 0) goto L14
            r12 = 0
            r5 = 0
        Le:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r6 = r13
            goto L16
        L14:
            r5 = r12
            goto Le
        L16:
            boolean r7 = r0.e(r1, r2, r3, r4, r5, r6)
            return r7
    }

    private static final boolean g(kotlin.reflect.jvm.internal.impl.descriptors.k r0, kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            r0 = 0
            return r0
    }

    private static final boolean h(boolean r2, kotlin.reflect.jvm.internal.impl.descriptors.a r3, kotlin.reflect.jvm.internal.impl.descriptors.a r4, kotlin.reflect.jvm.internal.impl.types.w1 r5, kotlin.reflect.jvm.internal.impl.types.w1 r6) {
            java.lang.String r0 = "c1"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "c2"
            kotlin.jvm.internal.g0.p(r6, r0)
            boolean r0 = kotlin.jvm.internal.g0.g(r5, r6)
            if (r0 == 0) goto L12
            r2 = 1
            return r2
        L12:
            kotlin.reflect.jvm.internal.impl.descriptors.f r5 = r5.c()
            kotlin.reflect.jvm.internal.impl.descriptors.f r6 = r6.c()
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
            if (r0 == 0) goto L33
            boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
            if (r0 != 0) goto L23
            goto L33
        L23:
            kotlin.reflect.jvm.internal.impl.resolve.g r0 = kotlin.reflect.jvm.internal.impl.resolve.g.a
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r5
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r6
            kotlin.reflect.jvm.internal.impl.resolve.f r1 = new kotlin.reflect.jvm.internal.impl.resolve.f
            r1.<init>(r3, r4)
            boolean r2 = r0.n(r5, r6, r2, r1)
            return r2
        L33:
            r2 = 0
            return r2
    }

    private static final boolean i(kotlin.reflect.jvm.internal.impl.descriptors.a r0, kotlin.reflect.jvm.internal.impl.descriptors.a r1, kotlin.reflect.jvm.internal.impl.descriptors.k r2, kotlin.reflect.jvm.internal.impl.descriptors.k r3) {
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r0 == 0) goto Le
            boolean r0 = kotlin.jvm.internal.g0.g(r3, r1)
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    private final boolean j(kotlin.reflect.jvm.internal.impl.descriptors.d r1, kotlin.reflect.jvm.internal.impl.descriptors.d r2) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.o()
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r2.o()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            return r1
    }

    public static /* synthetic */ boolean l(kotlin.reflect.jvm.internal.impl.resolve.g r0, kotlin.reflect.jvm.internal.impl.descriptors.k r1, kotlin.reflect.jvm.internal.impl.descriptors.k r2, boolean r3, boolean r4, int r5, java.lang.Object r6) {
            r5 = r5 & 8
            if (r5 == 0) goto L5
            r4 = 1
        L5:
            boolean r0 = r0.k(r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ boolean o(kotlin.reflect.jvm.internal.impl.resolve.g r0, kotlin.reflect.jvm.internal.impl.descriptors.j1 r1, kotlin.reflect.jvm.internal.impl.descriptors.j1 r2, boolean r3, kotlin.jvm.functions.Function2 r4, int r5, java.lang.Object r6) {
            r5 = r5 & 8
            if (r5 == 0) goto L6
            kotlin.reflect.jvm.internal.impl.resolve.c r4 = kotlin.reflect.jvm.internal.impl.resolve.c.a
        L6:
            boolean r0 = r0.n(r1, r2, r3, r4)
            return r0
    }

    private static final boolean p(kotlin.reflect.jvm.internal.impl.descriptors.k r0, kotlin.reflect.jvm.internal.impl.descriptors.k r1) {
            r0 = 0
            return r0
    }

    private final boolean q(kotlin.reflect.jvm.internal.impl.descriptors.k r8, kotlin.reflect.jvm.internal.impl.descriptors.k r9, kotlin.jvm.functions.Function2<? super kotlin.reflect.jvm.internal.impl.descriptors.k, ? super kotlin.reflect.jvm.internal.impl.descriptors.k, java.lang.Boolean> r10, boolean r11) {
            r7 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r8.b()
            kotlin.reflect.jvm.internal.impl.descriptors.k r2 = r9.b()
            boolean r8 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r8 != 0) goto L1c
            boolean r8 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r8 == 0) goto L11
            goto L1c
        L11:
            r5 = 8
            r6 = 0
            r4 = 0
            r0 = r7
            r3 = r11
            boolean r8 = l(r0, r1, r2, r3, r4, r5, r6)
            return r8
        L1c:
            java.lang.Object r8 = r10.invoke(r1, r2)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.e1 r(kotlin.reflect.jvm.internal.impl.descriptors.a r4) {
            r3 = this;
        L0:
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r0 == 0) goto L26
            r0 = r4
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r1 = r0.h()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r2 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
            if (r1 == r2) goto L10
            goto L26
        L10:
            java.util.Collection r4 = r0.e()
            java.lang.String r0 = "getOverriddenDescriptors(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.Object r4 = kotlin.collections.f0.n5(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4
            if (r4 == 0) goto L24
            goto L0
        L24:
            r4 = 0
            return r4
        L26:
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r4 = r4.getSource()
            return r4
    }

    public final boolean e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r5, boolean r6, boolean r7, boolean r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r9) {
            r3 = this;
            java.lang.String r0 = "a"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r9, r0)
            boolean r0 = kotlin.jvm.internal.g0.g(r4, r5)
            r1 = 1
            if (r0 == 0) goto L17
            return r1
        L17:
            kotlin.reflect.jvm.internal.impl.name.f r0 = r4.getName()
            kotlin.reflect.jvm.internal.impl.name.f r2 = r5.getName()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            r2 = 0
            if (r0 != 0) goto L27
            return r2
        L27:
            if (r7 == 0) goto L42
            boolean r7 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.c0
            if (r7 == 0) goto L42
            boolean r7 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.c0
            if (r7 == 0) goto L42
            r7 = r4
            kotlin.reflect.jvm.internal.impl.descriptors.c0 r7 = (kotlin.reflect.jvm.internal.impl.descriptors.c0) r7
            boolean r7 = r7.q0()
            r0 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.c0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.c0) r0
            boolean r0 = r0.q0()
            if (r7 == r0) goto L42
            return r2
        L42:
            kotlin.reflect.jvm.internal.impl.descriptors.k r7 = r4.b()
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r5.b()
            boolean r7 = kotlin.jvm.internal.g0.g(r7, r0)
            if (r7 == 0) goto L62
            if (r6 != 0) goto L53
            return r2
        L53:
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r7 = r3.r(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r0 = r3.r(r5)
            boolean r7 = kotlin.jvm.internal.g0.g(r7, r0)
            if (r7 != 0) goto L62
            return r2
        L62:
            boolean r7 = kotlin.reflect.jvm.internal.impl.resolve.i.E(r4)
            if (r7 != 0) goto La2
            boolean r7 = kotlin.reflect.jvm.internal.impl.resolve.i.E(r5)
            if (r7 == 0) goto L6f
            goto La2
        L6f:
            kotlin.reflect.jvm.internal.impl.resolve.d r7 = kotlin.reflect.jvm.internal.impl.resolve.d.a
            boolean r7 = r3.q(r4, r5, r7, r6)
            if (r7 != 0) goto L78
            return r2
        L78:
            kotlin.reflect.jvm.internal.impl.resolve.e r7 = new kotlin.reflect.jvm.internal.impl.resolve.e
            r7.<init>(r6, r4, r5)
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r6 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.i(r9, r7)
            java.lang.String r7 = "create(...)"
            kotlin.jvm.internal.g0.o(r6, r7)
            r7 = r8 ^ 1
            r9 = 0
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r7 = r6.E(r4, r5, r9, r7)
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r7 = r7.c()
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r0 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE
            if (r7 != r0) goto La2
            r7 = r8 ^ 1
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r4 = r6.E(r5, r4, r9, r7)
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r4 = r4.c()
            if (r4 != r0) goto La2
            return r1
        La2:
            return r2
    }

    public final boolean k(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.k r10, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.k r11, boolean r12, boolean r13) {
            r9 = this;
            boolean r0 = r10 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r0 == 0) goto L11
            boolean r0 = r11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r0 == 0) goto L11
            kotlin.reflect.jvm.internal.impl.descriptors.d r10 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r10
            kotlin.reflect.jvm.internal.impl.descriptors.d r11 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r11
            boolean r10 = r9.j(r10, r11)
            return r10
        L11:
            boolean r0 = r10 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
            if (r0 == 0) goto L2a
            boolean r0 = r11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.j1
            if (r0 == 0) goto L2a
            r2 = r10
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r2
            r3 = r11
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r3
            r6 = 8
            r7 = 0
            r5 = 0
            r1 = r9
            r4 = r12
            boolean r10 = o(r1, r2, r3, r4, r5, r6, r7)
            return r10
        L2a:
            r3 = r12
            boolean r12 = r10 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a
            if (r12 == 0) goto L46
            boolean r12 = r11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a
            if (r12 == 0) goto L46
            r1 = r10
            kotlin.reflect.jvm.internal.impl.descriptors.a r1 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r1
            r2 = r11
            kotlin.reflect.jvm.internal.impl.descriptors.a r2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r2
            kotlin.reflect.jvm.internal.impl.types.checker.g$a r6 = kotlin.reflect.jvm.internal.impl.types.checker.g.a.a
            r7 = 16
            r8 = 0
            r5 = 0
            r0 = r9
            r4 = r13
            boolean r10 = f(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
        L46:
            boolean r12 = r10 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
            if (r12 == 0) goto L5f
            boolean r12 = r11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0
            if (r12 == 0) goto L5f
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r10 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r10
            kotlin.reflect.jvm.internal.impl.name.c r10 = r10.d()
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r11 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r11
            kotlin.reflect.jvm.internal.impl.name.c r11 = r11.d()
            boolean r10 = kotlin.jvm.internal.g0.g(r10, r11)
            return r10
        L5f:
            boolean r10 = kotlin.jvm.internal.g0.g(r10, r11)
            return r10
    }

    @kotlin.jvm.JvmOverloads
    public final boolean m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r10, boolean r11) {
            r8 = this;
            java.lang.String r0 = "a"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.g0.p(r10, r0)
            r6 = 8
            r7 = 0
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            boolean r9 = o(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    @kotlin.jvm.JvmOverloads
    public final boolean n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r5, boolean r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlin.reflect.jvm.internal.impl.descriptors.k, ? super kotlin.reflect.jvm.internal.impl.descriptors.k, java.lang.Boolean> r7) {
            r3 = this;
            java.lang.String r0 = "a"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "equivalentCallables"
            kotlin.jvm.internal.g0.p(r7, r0)
            boolean r0 = kotlin.jvm.internal.g0.g(r4, r5)
            r1 = 1
            if (r0 == 0) goto L17
            return r1
        L17:
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r4.b()
            kotlin.reflect.jvm.internal.impl.descriptors.k r2 = r5.b()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            r2 = 0
            if (r0 == 0) goto L27
            return r2
        L27:
            boolean r6 = r3.q(r4, r5, r7, r6)
            if (r6 != 0) goto L2e
            return r2
        L2e:
            int r4 = r4.getIndex()
            int r5 = r5.getIndex()
            if (r4 != r5) goto L39
            return r1
        L39:
            return r2
    }
}
