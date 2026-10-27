package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class f extends kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 implements kotlin.reflect.jvm.internal.impl.load.java.descriptors.a {
    private final boolean E;

    @org.jetbrains.annotations.Nullable
    private final kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<?>, ?> F;
    private kotlin.reflect.jvm.internal.impl.types.t0 G;

    protected f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r18, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Modality r19, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r20, boolean r21, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r22, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r23, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.w0 r24, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r25, boolean r26, @org.jetbrains.annotations.Nullable kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<?>, ?> r27) {
            r16 = this;
            if (r17 != 0) goto L6
            r0 = 0
            T(r0)
        L6:
            if (r18 != 0) goto Lc
            r0 = 1
            T(r0)
        Lc:
            if (r19 != 0) goto L12
            r0 = 2
            T(r0)
        L12:
            if (r20 != 0) goto L18
            r0 = 3
            T(r0)
        L18:
            if (r22 != 0) goto L1e
            r0 = 4
            T(r0)
        L1e:
            if (r23 != 0) goto L24
            r0 = 5
            T(r0)
        L24:
            if (r25 != 0) goto L2a
            r0 = 6
            T(r0)
        L2a:
            r14 = 0
            r15 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r9 = r23
            r2 = r24
            r8 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = 0
            r0.G = r1
            r1 = r26
            r0.E = r1
            r1 = r27
            r0.F = r1
            return
    }

    private static /* synthetic */ void T(int r7) {
            r0 = 21
            if (r7 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 2
            if (r7 == r0) goto Le
            r3 = 3
            goto Lf
        Le:
            r3 = 2
        Lf:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor"
            r5 = 0
            switch(r7) {
                case 1: goto L5b;
                case 2: goto L56;
                case 3: goto L51;
                case 4: goto L4c;
                case 5: goto L47;
                case 6: goto L42;
                case 7: goto L17;
                case 8: goto L5b;
                case 9: goto L56;
                case 10: goto L51;
                case 11: goto L4c;
                case 12: goto L47;
                case 13: goto L3d;
                case 14: goto L38;
                case 15: goto L33;
                case 16: goto L42;
                case 17: goto L2e;
                case 18: goto L47;
                case 19: goto L29;
                case 20: goto L24;
                case 21: goto L21;
                case 22: goto L1c;
                default: goto L17;
            }
        L17:
            java.lang.String r6 = "containingDeclaration"
            r3[r5] = r6
            goto L5f
        L1c:
            java.lang.String r6 = "inType"
            r3[r5] = r6
            goto L5f
        L21:
            r3[r5] = r4
            goto L5f
        L24:
            java.lang.String r6 = "enhancedReturnType"
            r3[r5] = r6
            goto L5f
        L29:
            java.lang.String r6 = "enhancedValueParameterTypes"
            r3[r5] = r6
            goto L5f
        L2e:
            java.lang.String r6 = "newName"
            r3[r5] = r6
            goto L5f
        L33:
            java.lang.String r6 = "newVisibility"
            r3[r5] = r6
            goto L5f
        L38:
            java.lang.String r6 = "newModality"
            r3[r5] = r6
            goto L5f
        L3d:
            java.lang.String r6 = "newOwner"
            r3[r5] = r6
            goto L5f
        L42:
            java.lang.String r6 = "kind"
            r3[r5] = r6
            goto L5f
        L47:
            java.lang.String r6 = "source"
            r3[r5] = r6
            goto L5f
        L4c:
            java.lang.String r6 = "name"
            r3[r5] = r6
            goto L5f
        L51:
            java.lang.String r6 = "visibility"
            r3[r5] = r6
            goto L5f
        L56:
            java.lang.String r6 = "modality"
            r3[r5] = r6
            goto L5f
        L5b:
            java.lang.String r6 = "annotations"
            r3[r5] = r6
        L5f:
            java.lang.String r5 = "enhance"
            r6 = 1
            if (r7 == r0) goto L67
            r3[r6] = r4
            goto L69
        L67:
            r3[r6] = r5
        L69:
            switch(r7) {
                case 7: goto L7e;
                case 8: goto L7e;
                case 9: goto L7e;
                case 10: goto L7e;
                case 11: goto L7e;
                case 12: goto L7e;
                case 13: goto L79;
                case 14: goto L79;
                case 15: goto L79;
                case 16: goto L79;
                case 17: goto L79;
                case 18: goto L79;
                case 19: goto L76;
                case 20: goto L76;
                case 21: goto L82;
                case 22: goto L71;
                default: goto L6c;
            }
        L6c:
            java.lang.String r4 = "<init>"
            r3[r2] = r4
            goto L82
        L71:
            java.lang.String r4 = "setInType"
            r3[r2] = r4
            goto L82
        L76:
            r3[r2] = r5
            goto L82
        L79:
            java.lang.String r4 = "createSubstitutedCopy"
            r3[r2] = r4
            goto L82
        L7e:
            java.lang.String r4 = "create"
            r3[r2] = r4
        L82:
            java.lang.String r1 = java.lang.String.format(r1, r3)
            if (r7 == r0) goto L8e
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r1)
            goto L93
        L8e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r1)
        L93:
            throw r7
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.load.java.descriptors.f b1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Modality r15, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r16, boolean r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r18, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r19, boolean r20) {
            if (r13 != 0) goto L6
            r0 = 7
            T(r0)
        L6:
            if (r14 != 0) goto Ld
            r0 = 8
            T(r0)
        Ld:
            if (r15 != 0) goto L14
            r0 = 9
            T(r0)
        L14:
            if (r16 != 0) goto L1b
            r0 = 10
            T(r0)
        L1b:
            if (r18 != 0) goto L22
            r0 = 11
            T(r0)
        L22:
            if (r19 != 0) goto L29
            r0 = 12
            T(r0)
        L29:
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.f r1 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.f
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r10 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
            r12 = 0
            r9 = 0
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r11 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k0
    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 L0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Modality r15, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r16, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.w0 r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r18, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r19, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r20) {
            r13 = this;
            if (r14 != 0) goto L7
            r0 = 13
            T(r0)
        L7:
            if (r15 != 0) goto Le
            r0 = 14
            T(r0)
        Le:
            if (r16 != 0) goto L15
            r0 = 15
            T(r0)
        L15:
            if (r18 != 0) goto L1c
            r0 = 16
            T(r0)
        L1c:
            if (r19 != 0) goto L23
            r0 = 17
            T(r0)
        L23:
            if (r20 != 0) goto L2a
            r0 = 18
            T(r0)
        L2a:
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.f r1 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.f
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3 = r13.getAnnotations()
            boolean r6 = r13.C()
            boolean r11 = r13.E
            kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.a$a<?>, ?> r12 = r13.F
            r2 = r14
            r4 = r15
            r5 = r16
            r9 = r17
            r10 = r18
            r7 = r19
            r8 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k0, kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.Nullable
    public <V> V N(kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<V> r2) {
            r1 = this;
            kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.a$a<?>, ?> r0 = r1.F
            if (r0 == 0) goto L17
            java.lang.Object r0 = r0.getFirst()
            kotlin.reflect.jvm.internal.impl.descriptors.a$a r0 = (kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a) r0
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L17
            kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.a$a<?>, ?> r2 = r1.F
            java.lang.Object r2 = r2.getSecond()
            return r2
        L17:
            r2 = 0
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k0
    public void V0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 22
            T(r0)
        L7:
            r1.G = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.k0, kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.s1
    public boolean isConst() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.getType()
            boolean r1 = r2.E
            if (r1 == 0) goto L1c
            boolean r1 = kotlin.reflect.jvm.internal.impl.descriptors.h.a(r0)
            if (r1 == 0) goto L1c
            boolean r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.o1.i(r0)
            if (r1 == 0) goto L1a
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.j.w0(r0)
            if (r0 == 0) goto L1c
        L1a:
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.a
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.load.java.descriptors.a k0(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r26, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> r27, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r28, @org.jetbrains.annotations.Nullable kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<?>, ?> r29) {
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r28
            if (r27 != 0) goto Ld
            r3 = 19
            T(r3)
        Ld:
            if (r2 != 0) goto L14
            r3 = 20
            T(r3)
        L14:
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r3 = r0.a()
            r4 = 0
            if (r3 != r0) goto L1d
            r13 = r4
            goto L22
        L1d:
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r3 = r0.a()
            r13 = r3
        L22:
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.f r15 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.f
            kotlin.reflect.jvm.internal.impl.descriptors.k r6 = r0.b()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r7 = r0.getAnnotations()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r8 = r0.i()
            kotlin.reflect.jvm.internal.impl.descriptors.s r9 = r0.getVisibility()
            boolean r10 = r0.C()
            kotlin.reflect.jvm.internal.impl.name.f r11 = r0.getName()
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r12 = r0.getSource()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r14 = r0.h()
            r5 = r15
            boolean r15 = r0.E
            r16 = r29
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r15 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r3 = r0.N0()
            if (r3 == 0) goto L8f
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r14 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.l0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r16 = r3.getAnnotations()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r17 = r3.i()
            kotlin.reflect.jvm.internal.impl.descriptors.s r18 = r3.getVisibility()
            boolean r19 = r3.Y()
            boolean r20 = r3.isExternal()
            boolean r21 = r3.isInline()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r22 = r0.h()
            if (r13 != 0) goto L76
            r23 = r4
            goto L7c
        L76:
            kotlin.reflect.jvm.internal.impl.descriptors.x0 r5 = r13.getGetter()
            r23 = r5
        L7c:
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r24 = r3.getSource()
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            kotlin.reflect.jvm.internal.impl.descriptors.y r3 = r3.x0()
            r14.I0(r3)
            r14.L0(r2)
            r3 = r14
            goto L90
        L8f:
            r3 = r4
        L90:
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r5 = r0.getSetter()
            if (r5 == 0) goto Ldc
            kotlin.reflect.jvm.internal.impl.descriptors.impl.m0 r14 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.m0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r16 = r5.getAnnotations()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r17 = r5.i()
            kotlin.reflect.jvm.internal.impl.descriptors.s r18 = r5.getVisibility()
            boolean r19 = r5.Y()
            boolean r20 = r5.isExternal()
            boolean r21 = r5.isInline()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r22 = r0.h()
            if (r13 != 0) goto Lb9
            r23 = r4
            goto Lbf
        Lb9:
            kotlin.reflect.jvm.internal.impl.descriptors.y0 r6 = r13.getSetter()
            r23 = r6
        Lbf:
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r24 = r5.getSource()
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            kotlin.reflect.jvm.internal.impl.descriptors.y r6 = r14.x0()
            r14.I0(r6)
            java.util.List r5 = r5.g()
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r5 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r5
            r14.M0(r5)
            goto Ldd
        Ldc:
            r14 = r4
        Ldd:
            kotlin.reflect.jvm.internal.impl.descriptors.v r5 = r0.O()
            kotlin.reflect.jvm.internal.impl.descriptors.v r6 = r0.D()
            r15.R0(r3, r14, r5, r6)
            boolean r3 = r0.S0()
            r15.W0(r3)
            kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> r3 = r0.i
            if (r3 == 0) goto Lf8
            kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r5 = r0.h
            r15.G0(r5, r3)
        Lf8:
            java.util.Collection r3 = r0.e()
            r15.R(r3)
            if (r1 != 0) goto L103
        L101:
            r5 = r4
            goto L10e
        L103:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r3 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3 = r3.b()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r4 = kotlin.reflect.jvm.internal.impl.resolve.h.i(r0, r1, r3)
            goto L101
        L10e:
            java.util.List r3 = r0.getTypeParameters()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r4 = r0.c0()
            java.util.List r6 = kotlin.collections.f0.J()
            r1 = r15
            r1.X0(r2, r3, r4, r5, r6)
            return r15
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean n0() {
            r1 = this;
            r0 = 0
            return r0
    }
}
