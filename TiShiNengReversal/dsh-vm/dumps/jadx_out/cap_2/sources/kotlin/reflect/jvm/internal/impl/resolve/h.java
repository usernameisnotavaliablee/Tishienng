package kotlin.reflect.jvm.internal.impl.resolve;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class h {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a extends kotlin.reflect.jvm.internal.impl.descriptors.impl.i {
        public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r10, boolean r11) {
                r8 = this;
                if (r9 != 0) goto L6
                r0 = 0
                T(r0)
            L6:
                if (r10 != 0) goto Lc
                r0 = 1
                T(r0)
            Lc:
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r0.b()
                r5 = 1
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r6 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
                r3 = 0
                r1 = r8
                r2 = r9
                r7 = r10
                r1.<init>(r2, r3, r4, r5, r6, r7)
                java.util.List r9 = java.util.Collections.EMPTY_LIST
                kotlin.reflect.jvm.internal.impl.descriptors.s r10 = kotlin.reflect.jvm.internal.impl.resolve.i.k(r2, r11)
                r8.l1(r9, r10)
                return
        }

        private static /* synthetic */ void T(int r3) {
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1 = 0
                r2 = 1
                if (r3 == r2) goto Lc
                java.lang.String r3 = "containingClass"
                r0[r1] = r3
                goto L10
            Lc:
                java.lang.String r3 = "source"
                r0[r1] = r3
            L10:
                java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor"
                r0[r2] = r3
                r3 = 2
                java.lang.String r1 = "<init>"
                r0[r3] = r1
                java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r3 = java.lang.String.format(r3, r0)
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r0.<init>(r3)
                throw r0
        }
    }

    private static /* synthetic */ void a(int r11) {
            r0 = 25
            r1 = 23
            r2 = 12
            if (r11 == r2) goto Lf
            if (r11 == r1) goto Lf
            if (r11 == r0) goto Lf
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L11
        Lf:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        L11:
            r4 = 2
            if (r11 == r2) goto L1a
            if (r11 == r1) goto L1a
            if (r11 == r0) goto L1a
            r5 = 3
            goto L1b
        L1a:
            r5 = 2
        L1b:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory"
            r7 = 0
            switch(r11) {
                case 1: goto L53;
                case 2: goto L4e;
                case 3: goto L23;
                case 4: goto L53;
                case 5: goto L4e;
                case 6: goto L49;
                case 7: goto L23;
                case 8: goto L53;
                case 9: goto L4e;
                case 10: goto L44;
                case 11: goto L49;
                case 12: goto L41;
                case 13: goto L23;
                case 14: goto L53;
                case 15: goto L23;
                case 16: goto L53;
                case 17: goto L23;
                case 18: goto L53;
                case 19: goto L49;
                case 20: goto L3c;
                case 21: goto L37;
                case 22: goto L32;
                case 23: goto L41;
                case 24: goto L32;
                case 25: goto L41;
                case 26: goto L32;
                case 27: goto L2d;
                case 28: goto L2d;
                case 29: goto L2d;
                case 30: goto L28;
                case 31: goto L53;
                case 32: goto L28;
                case 33: goto L53;
                case 34: goto L28;
                case 35: goto L53;
                default: goto L23;
            }
        L23:
            java.lang.String r8 = "propertyDescriptor"
            r5[r7] = r8
            goto L57
        L28:
            java.lang.String r8 = "owner"
            r5[r7] = r8
            goto L57
        L2d:
            java.lang.String r8 = "descriptor"
            r5[r7] = r8
            goto L57
        L32:
            java.lang.String r8 = "enumClass"
            r5[r7] = r8
            goto L57
        L37:
            java.lang.String r8 = "source"
            r5[r7] = r8
            goto L57
        L3c:
            java.lang.String r8 = "containingClass"
            r5[r7] = r8
            goto L57
        L41:
            r5[r7] = r6
            goto L57
        L44:
            java.lang.String r8 = "visibility"
            r5[r7] = r8
            goto L57
        L49:
            java.lang.String r8 = "sourceElement"
            r5[r7] = r8
            goto L57
        L4e:
            java.lang.String r8 = "parameterAnnotations"
            r5[r7] = r8
            goto L57
        L53:
            java.lang.String r8 = "annotations"
            r5[r7] = r8
        L57:
            java.lang.String r7 = "createSetter"
            java.lang.String r8 = "createEnumValuesMethod"
            java.lang.String r9 = "createEnumValueOfMethod"
            r10 = 1
            if (r11 == r2) goto L6d
            if (r11 == r1) goto L6a
            if (r11 == r0) goto L67
            r5[r10] = r6
            goto L6f
        L67:
            r5[r10] = r9
            goto L6f
        L6a:
            r5[r10] = r8
            goto L6f
        L6d:
            r5[r10] = r7
        L6f:
            switch(r11) {
                case 3: goto Laf;
                case 4: goto Laf;
                case 5: goto Laf;
                case 6: goto Laf;
                case 7: goto Laf;
                case 8: goto Laf;
                case 9: goto Laf;
                case 10: goto Laf;
                case 11: goto Laf;
                case 12: goto Lb1;
                case 13: goto Laa;
                case 14: goto Laa;
                case 15: goto La5;
                case 16: goto La5;
                case 17: goto La5;
                case 18: goto La5;
                case 19: goto La5;
                case 20: goto La0;
                case 21: goto La0;
                case 22: goto L9d;
                case 23: goto Lb1;
                case 24: goto L9a;
                case 25: goto Lb1;
                case 26: goto L95;
                case 27: goto L90;
                case 28: goto L8b;
                case 29: goto L86;
                case 30: goto L81;
                case 31: goto L81;
                case 32: goto L7c;
                case 33: goto L7c;
                case 34: goto L77;
                case 35: goto L77;
                default: goto L72;
            }
        L72:
            java.lang.String r6 = "createDefaultSetter"
            r5[r4] = r6
            goto Lb1
        L77:
            java.lang.String r6 = "createContextReceiverParameterForClass"
            r5[r4] = r6
            goto Lb1
        L7c:
            java.lang.String r6 = "createContextReceiverParameterForCallable"
            r5[r4] = r6
            goto Lb1
        L81:
            java.lang.String r6 = "createExtensionReceiverParameterForCallable"
            r5[r4] = r6
            goto Lb1
        L86:
            java.lang.String r6 = "isEnumSpecialMethod"
            r5[r4] = r6
            goto Lb1
        L8b:
            java.lang.String r6 = "isEnumValueOfMethod"
            r5[r4] = r6
            goto Lb1
        L90:
            java.lang.String r6 = "isEnumValuesMethod"
            r5[r4] = r6
            goto Lb1
        L95:
            java.lang.String r6 = "createEnumEntriesProperty"
            r5[r4] = r6
            goto Lb1
        L9a:
            r5[r4] = r9
            goto Lb1
        L9d:
            r5[r4] = r8
            goto Lb1
        La0:
            java.lang.String r6 = "createPrimaryConstructorForObject"
            r5[r4] = r6
            goto Lb1
        La5:
            java.lang.String r6 = "createGetter"
            r5[r4] = r6
            goto Lb1
        Laa:
            java.lang.String r6 = "createDefaultGetter"
            r5[r4] = r6
            goto Lb1
        Laf:
            r5[r4] = r7
        Lb1:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r11 == r2) goto Lc1
            if (r11 == r1) goto Lc1
            if (r11 == r0) goto Lc1
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r3)
            goto Lc6
        Lc1:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r11.<init>(r3)
        Lc6:
            throw r11
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.descriptors.z0 b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r4, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r6, int r7) {
            if (r3 != 0) goto L7
            r0 = 32
            a(r0)
        L7:
            if (r6 != 0) goto Le
            r0 = 33
            a(r0)
        Le:
            r0 = 0
            if (r4 != 0) goto L12
            return r0
        L12:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.n0 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.n0
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.c r2 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.c
            r2.<init>(r3, r4, r5, r0)
            kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.name.g.a(r7)
            r1.<init>(r3, r2, r6, r4)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.descriptors.z0 c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r4, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r6, int r7) {
            if (r3 != 0) goto L7
            r0 = 34
            a(r0)
        L7:
            if (r6 != 0) goto Le
            r0 = 35
            a(r0)
        Le:
            r0 = 0
            if (r4 != 0) goto L12
            return r0
        L12:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.n0 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.n0
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.b r2 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.b
            r2.<init>(r3, r4, r5, r0)
            kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.name.g.a(r7)
            r1.<init>(r3, r2, r6, r4)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.w0 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3) {
            if (r2 != 0) goto L7
            r0 = 13
            a(r0)
        L7:
            if (r3 != 0) goto Le
            r0 = 14
            a(r0)
        Le:
            r0 = 1
            r1 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r2 = j(r2, r3, r0, r1, r1)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.m0 e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.w0 r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r10) {
            if (r8 != 0) goto L6
            r0 = 0
            a(r0)
        L6:
            if (r9 != 0) goto Lc
            r0 = 1
            a(r0)
        Lc:
            if (r10 != 0) goto L12
            r0 = 2
            a(r0)
        L12:
            r6 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r7 = r8.getSource()
            r4 = 1
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            kotlin.reflect.jvm.internal.impl.descriptors.impl.m0 r8 = n(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.descriptors.w0 f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r23) {
            if (r23 != 0) goto L7
            r0 = 26
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = kotlin.reflect.jvm.internal.impl.resolve.i.g(r23)
            kotlin.reflect.jvm.internal.impl.resolve.t r1 = kotlin.reflect.jvm.internal.impl.resolve.u.a(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.a(r0)
            r1 = 0
            if (r0 != 0) goto L17
            return r1
        L17:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r2.b()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r5 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            kotlin.reflect.jvm.internal.impl.descriptors.s r6 = kotlin.reflect.jvm.internal.impl.descriptors.r.e
            kotlin.reflect.jvm.internal.impl.name.f r8 = kotlin.reflect.jvm.internal.impl.builtins.o.e
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r9 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.SYNTHESIZED
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r10 = r23.getSource()
            r15 = 0
            r16 = 0
            r7 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r3 = r23
            kotlin.reflect.jvm.internal.impl.descriptors.impl.k0 r17 = kotlin.reflect.jvm.internal.impl.descriptors.impl.k0.K0(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r3 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.l0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r7 = r2.b()
            r14 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r15 = r23.getSource()
            r10 = 0
            r8 = r5
            r13 = r9
            r5 = r3
            r9 = r6
            r6 = r17
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r6.Q0(r5, r1)
            kotlin.reflect.jvm.internal.impl.types.t1$a r1 = kotlin.reflect.jvm.internal.impl.types.t1.b
            kotlin.reflect.jvm.internal.impl.types.t1 r1 = r1.k()
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.o()
            kotlin.reflect.jvm.internal.impl.types.e2 r2 = new kotlin.reflect.jvm.internal.impl.types.e2
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r23.s()
            r2.<init>(r3)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r3 = 0
            kotlin.reflect.jvm.internal.impl.types.e1 r18 = kotlin.reflect.jvm.internal.impl.types.w0.j(r1, r0, r2, r3)
            java.util.List r19 = java.util.Collections.EMPTY_LIST
            r20 = 0
            r21 = 0
            r22 = r19
            r17.X0(r18, r19, r20, r21, r22)
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r6.getReturnType()
            r5.L0(r0)
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.descriptors.d1 g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r18) {
            r0 = r18
            if (r0 != 0) goto L9
            r1 = 24
            a(r1)
        L9:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r1.b()
            kotlin.reflect.jvm.internal.impl.name.f r3 = kotlin.reflect.jvm.internal.impl.builtins.o.f
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r4 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.SYNTHESIZED
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r5 = r0.getSource()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.o0 r6 = kotlin.reflect.jvm.internal.impl.descriptors.impl.o0.g1(r0, r2, r3, r4, r5)
            r7 = r6
            kotlin.reflect.jvm.internal.impl.descriptors.impl.u0 r6 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.u0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r10 = r1.b()
            java.lang.String r1 = "value"
            kotlin.reflect.jvm.internal.impl.name.f r11 = kotlin.reflect.jvm.internal.impl.name.f.h(r1)
            kotlin.reflect.jvm.internal.impl.builtins.j r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.m(r0)
            kotlin.reflect.jvm.internal.impl.types.e1 r12 = r1.X()
            r16 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r17 = r0.getSource()
            r8 = 0
            r9 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.util.List r9 = java.util.Collections.EMPTY_LIST
            java.util.List r11 = java.util.Collections.singletonList(r6)
            kotlin.reflect.jvm.internal.impl.types.e1 r12 = r0.s()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r13 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            kotlin.reflect.jvm.internal.impl.descriptors.s r14 = kotlin.reflect.jvm.internal.impl.descriptors.r.e
            r6 = r7
            r7 = 0
            r10 = r9
            kotlin.reflect.jvm.internal.impl.descriptors.impl.o0 r0 = r6.i1(r7, r8, r9, r10, r11, r12, r13, r14)
            if (r0 != 0) goto L5a
            r1 = 25
            a(r1)
        L5a:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.descriptors.d1 h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r13) {
            if (r13 != 0) goto L7
            r0 = 22
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.b()
            kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.builtins.o.d
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r2 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.SYNTHESIZED
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r3 = r13.getSource()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.o0 r4 = kotlin.reflect.jvm.internal.impl.descriptors.impl.o0.g1(r13, r0, r1, r2, r3)
            java.util.List r7 = java.util.Collections.EMPTY_LIST
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.m(r13)
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.e1 r13 = r13.s()
            kotlin.reflect.jvm.internal.impl.types.e1 r10 = r0.m(r1, r13)
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r11 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            kotlin.reflect.jvm.internal.impl.descriptors.s r12 = kotlin.reflect.jvm.internal.impl.descriptors.r.e
            r5 = 0
            r6 = 0
            r8 = r7
            r9 = r7
            kotlin.reflect.jvm.internal.impl.descriptors.impl.o0 r13 = r4.i1(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r13 != 0) goto L3c
            r0 = 23
            a(r0)
        L3c:
            return r13
    }

    @org.jetbrains.annotations.Nullable
    public static kotlin.reflect.jvm.internal.impl.descriptors.z0 i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r5) {
            if (r3 != 0) goto L7
            r0 = 30
            a(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 31
            a(r0)
        Le:
            r0 = 0
            if (r4 != 0) goto L12
            return r0
        L12:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.n0 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.n0
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.d r2 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.d
            r2.<init>(r3, r4, r0)
            r1.<init>(r3, r2, r5)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.w0 r7, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r8, boolean r9, boolean r10, boolean r11) {
            if (r7 != 0) goto L7
            r0 = 15
            a(r0)
        L7:
            if (r8 != 0) goto Le
            r0 = 16
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r6 = r7.getSource()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r7 = k(r1, r2, r3, r4, r5, r6)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.w0 r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r13, boolean r14, boolean r15, boolean r16, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r17) {
            if (r12 != 0) goto L7
            r0 = 17
            a(r0)
        L7:
            if (r13 != 0) goto Le
            r0 = 18
            a(r0)
        Le:
            if (r17 != 0) goto L15
            r0 = 19
            a(r0)
        L15:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l0 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.l0
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = r12.i()
            kotlin.reflect.jvm.internal.impl.descriptors.s r5 = r12.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r9 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
            r10 = 0
            r2 = r12
            r3 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r11 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.i l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r3) {
            if (r2 != 0) goto L7
            r0 = 20
            a(r0)
        L7:
            if (r3 != 0) goto Le
            r0 = 21
            a(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.resolve.h$a r0 = new kotlin.reflect.jvm.internal.impl.resolve.h$a
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.m0 m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.w0 r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r14, boolean r15, boolean r16, boolean r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r18, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r19) {
            if (r12 != 0) goto L6
            r0 = 7
            a(r0)
        L6:
            if (r13 != 0) goto Ld
            r0 = 8
            a(r0)
        Ld:
            if (r14 != 0) goto L14
            r0 = 9
            a(r0)
        L14:
            if (r18 != 0) goto L1b
            r0 = 10
            a(r0)
        L1b:
            if (r19 != 0) goto L22
            r0 = 11
            a(r0)
        L22:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.m0 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.m0
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = r12.i()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r9 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
            r10 = 0
            r2 = r12
            r3 = r13
            r6 = r15
            r7 = r16
            r8 = r17
            r5 = r18
            r11 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            kotlin.reflect.jvm.internal.impl.types.t0 r12 = r12.getType()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.u0 r12 = kotlin.reflect.jvm.internal.impl.descriptors.impl.m0.K0(r1, r12, r14)
            r1.M0(r12)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.m0 n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.w0 r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r11, boolean r12, boolean r13, boolean r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r15) {
            if (r9 != 0) goto L6
            r0 = 3
            a(r0)
        L6:
            if (r10 != 0) goto Lc
            r0 = 4
            a(r0)
        Lc:
            if (r11 != 0) goto L12
            r0 = 5
            a(r0)
        L12:
            if (r15 != 0) goto L18
            r0 = 6
            a(r0)
        L18:
            kotlin.reflect.jvm.internal.impl.descriptors.s r7 = r9.getVisibility()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r8 = r15
            kotlin.reflect.jvm.internal.impl.descriptors.impl.m0 r9 = m(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    private static boolean o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r2) {
            if (r2 != 0) goto L7
            r0 = 29
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r0 = r2.h()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r1 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.SYNTHESIZED
            if (r0 != r1) goto L1b
            kotlin.reflect.jvm.internal.impl.descriptors.k r2 = r2.b()
            boolean r2 = kotlin.reflect.jvm.internal.impl.resolve.i.A(r2)
            if (r2 == 0) goto L1b
            r2 = 1
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public static boolean p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r2) {
            if (r2 != 0) goto L7
            r0 = 28
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.name.f r0 = r2.getName()
            kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.builtins.o.f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1b
            boolean r2 = o(r2)
            if (r2 == 0) goto L1b
            r2 = 1
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public static boolean q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.y r2) {
            if (r2 != 0) goto L7
            r0 = 27
            a(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.name.f r0 = r2.getName()
            kotlin.reflect.jvm.internal.impl.name.f r1 = kotlin.reflect.jvm.internal.impl.builtins.o.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1b
            boolean r2 = o(r2)
            if (r2 == 0) goto L1b
            r2 = 1
            return r2
        L1b:
            r2 = 0
            return r2
    }
}
