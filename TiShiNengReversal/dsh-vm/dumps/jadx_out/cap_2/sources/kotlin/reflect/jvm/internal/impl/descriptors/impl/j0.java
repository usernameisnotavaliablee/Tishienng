package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class j0 extends kotlin.reflect.jvm.internal.impl.descriptors.impl.n implements kotlin.reflect.jvm.internal.impl.descriptors.v0 {
    static final /* synthetic */ boolean m = false;
    private boolean e;
    private final boolean f;
    private final kotlin.reflect.jvm.internal.impl.descriptors.Modality g;
    private final kotlin.reflect.jvm.internal.impl.descriptors.w0 h;
    private final boolean i;
    private final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind j;
    private kotlin.reflect.jvm.internal.impl.descriptors.s k;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.descriptors.y l;

    static {
            return
    }

    public j0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Modality r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.w0 r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r6, boolean r7, boolean r8, boolean r9, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r11) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 0
            T(r0)
        L6:
            if (r3 != 0) goto Lc
            r0 = 1
            T(r0)
        Lc:
            if (r4 != 0) goto L12
            r0 = 2
            T(r0)
        L12:
            if (r5 != 0) goto L18
            r0 = 3
            T(r0)
        L18:
            if (r6 != 0) goto L1e
            r0 = 4
            T(r0)
        L1e:
            if (r11 != 0) goto L24
            r0 = 5
            T(r0)
        L24:
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r4.b()
            r1.<init>(r0, r5, r6, r11)
            r5 = 0
            r1.l = r5
            r1.g = r2
            r1.k = r3
            r1.h = r4
            r1.e = r7
            r1.f = r8
            r1.i = r9
            r1.j = r10
            return
    }

    private static /* synthetic */ void T(int r6) {
            switch(r6) {
                case 6: goto L6;
                case 7: goto L3;
                case 8: goto L6;
                case 9: goto L6;
                case 10: goto L6;
                case 11: goto L6;
                case 12: goto L6;
                case 13: goto L6;
                case 14: goto L6;
                case 15: goto L6;
                default: goto L3;
            }
        L3:
            java.lang.String r0 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L8
        L6:
            java.lang.String r0 = "@NotNull method %s.%s must not return null"
        L8:
            r1 = 2
            switch(r6) {
                case 6: goto Le;
                case 7: goto Lc;
                case 8: goto Le;
                case 9: goto Le;
                case 10: goto Le;
                case 11: goto Le;
                case 12: goto Le;
                case 13: goto Le;
                case 14: goto Le;
                case 15: goto Le;
                default: goto Lc;
            }
        Lc:
            r2 = 3
            goto Lf
        Le:
            r2 = 2
        Lf:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl"
            r4 = 0
            switch(r6) {
                case 1: goto L3d;
                case 2: goto L38;
                case 3: goto L33;
                case 4: goto L2e;
                case 5: goto L29;
                case 6: goto L26;
                case 7: goto L21;
                case 8: goto L26;
                case 9: goto L26;
                case 10: goto L26;
                case 11: goto L26;
                case 12: goto L26;
                case 13: goto L26;
                case 14: goto L26;
                case 15: goto L26;
                case 16: goto L1c;
                default: goto L17;
            }
        L17:
            java.lang.String r5 = "modality"
            r2[r4] = r5
            goto L41
        L1c:
            java.lang.String r5 = "overriddenDescriptors"
            r2[r4] = r5
            goto L41
        L21:
            java.lang.String r5 = "substitutor"
            r2[r4] = r5
            goto L41
        L26:
            r2[r4] = r3
            goto L41
        L29:
            java.lang.String r5 = "source"
            r2[r4] = r5
            goto L41
        L2e:
            java.lang.String r5 = "name"
            r2[r4] = r5
            goto L41
        L33:
            java.lang.String r5 = "annotations"
            r2[r4] = r5
            goto L41
        L38:
            java.lang.String r5 = "correspondingProperty"
            r2[r4] = r5
            goto L41
        L3d:
            java.lang.String r5 = "visibility"
            r2[r4] = r5
        L41:
            java.lang.String r4 = "substitute"
            r5 = 1
            switch(r6) {
                case 6: goto L70;
                case 7: goto L47;
                case 8: goto L6d;
                case 9: goto L68;
                case 10: goto L63;
                case 11: goto L5e;
                case 12: goto L59;
                case 13: goto L54;
                case 14: goto L4f;
                case 15: goto L4a;
                default: goto L47;
            }
        L47:
            r2[r5] = r3
            goto L74
        L4a:
            java.lang.String r3 = "getOverriddenDescriptors"
            r2[r5] = r3
            goto L74
        L4f:
            java.lang.String r3 = "getContextReceiverParameters"
            r2[r5] = r3
            goto L74
        L54:
            java.lang.String r3 = "getCorrespondingProperty"
            r2[r5] = r3
            goto L74
        L59:
            java.lang.String r3 = "getCorrespondingVariable"
            r2[r5] = r3
            goto L74
        L5e:
            java.lang.String r3 = "getVisibility"
            r2[r5] = r3
            goto L74
        L63:
            java.lang.String r3 = "getModality"
            r2[r5] = r3
            goto L74
        L68:
            java.lang.String r3 = "getTypeParameters"
            r2[r5] = r3
            goto L74
        L6d:
            r2[r5] = r4
            goto L74
        L70:
            java.lang.String r3 = "getKind"
            r2[r5] = r3
        L74:
            switch(r6) {
                case 6: goto L83;
                case 7: goto L81;
                case 8: goto L83;
                case 9: goto L83;
                case 10: goto L83;
                case 11: goto L83;
                case 12: goto L83;
                case 13: goto L83;
                case 14: goto L83;
                case 15: goto L83;
                case 16: goto L7c;
                default: goto L77;
            }
        L77:
            java.lang.String r3 = "<init>"
            r2[r1] = r3
            goto L83
        L7c:
            java.lang.String r3 = "setOverriddenDescriptors"
            r2[r1] = r3
            goto L83
        L81:
            r2[r1] = r4
        L83:
            java.lang.String r0 = java.lang.String.format(r0, r2)
            switch(r6) {
                case 6: goto L90;
                case 7: goto L8a;
                case 8: goto L90;
                case 9: goto L90;
                case 10: goto L90;
                case 11: goto L90;
                case 12: goto L90;
                case 13: goto L90;
                case 14: goto L90;
                case 15: goto L90;
                default: goto L8a;
            }
        L8a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r0)
            goto L95
        L90:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r0)
        L95:
            throw r6
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> A0() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r2.h0()
            java.util.List r0 = r0.A0()
            if (r0 != 0) goto Lf
            r1 = 14
            T(r1)
        Lf:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y
    public boolean D0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.v0 E0(kotlin.reflect.jvm.internal.impl.descriptors.k r1, kotlin.reflect.jvm.internal.impl.descriptors.Modality r2, kotlin.reflect.jvm.internal.impl.descriptors.s r3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r4, boolean r5) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Accessors must be copied by the corresponding property"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.v0 F0();

    @org.jetbrains.annotations.NotNull
    protected java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.v0> G0(boolean r4) {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = r3.h0()
            java.util.Collection r1 = r1.e()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r2
            if (r4 == 0) goto L25
            kotlin.reflect.jvm.internal.impl.descriptors.x0 r2 = r2.getGetter()
            goto L29
        L25:
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r2 = r2.getSetter()
        L29:
            if (r2 == 0) goto L12
            r0.add(r2)
            goto L12
        L2f:
            return r0
    }

    public void H0(boolean r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void I0(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.y r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public void J0(kotlin.reflect.jvm.internal.impl.descriptors.s r1) {
            r0 = this;
            r0.k = r1
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.Nullable
    public <V> V N(kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<V> r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void R(@org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r1) {
            r0 = this;
            if (r1 != 0) goto L7
            r1 = 16
            T(r1)
        L7:
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y
    public boolean S() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.v0
    public boolean Y() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.v0 r0 = r1.F0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.v0 r0 = r1.F0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.v0 r0 = r1.F0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.v0 r0 = r1.F0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g1
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.l c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = r0.c(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y, kotlin.reflect.jvm.internal.impl.descriptors.g1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.y c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r1) {
            r0 = this;
            if (r1 != 0) goto L6
            r1 = 7
            T(r1)
        L6:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.z0 c0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r1.h0()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r0.c0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor e0(kotlin.reflect.jvm.internal.impl.descriptors.k r1, kotlin.reflect.jvm.internal.impl.descriptors.Modality r2, kotlin.reflect.jvm.internal.impl.descriptors.s r3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r4, boolean r5) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.v0 r1 = r0.E0(r1, r2, r3, r4, r5)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.z0 f0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r1.h0()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r0.f0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> getTypeParameters() {
            r2 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            if (r0 != 0) goto L9
            r1 = 9
            T(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = r2.k
            if (r0 != 0) goto L9
            r1 = 11
            T(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind h() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r0 = r2.j
            if (r0 != 0) goto L8
            r1 = 6
            T(r1)
        L8:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.v0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.w0 h0() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r0 = r2.h
            if (r0 != 0) goto L9
            r1 = 13
            T(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.Modality i() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r2.g
            if (r0 != 0) goto L9
            r1 = 10
            T(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean i0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean isExternal() {
            r1 = this;
            boolean r0 = r1.f
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y
    public boolean isInfix() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y
    public boolean isInline() {
            r1 = this;
            boolean r0 = r1.i
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y
    public boolean isOperator() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y
    public boolean isSuspend() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.y.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.y> n() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Accessors must be copied by the corresponding property"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean n0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.n p0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.v0 r0 = r1.F0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean q0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.y x0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = r1.l
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y
    public boolean y() {
            r1 = this;
            r0 = 0
            return r0
    }
}
