package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class b extends kotlin.reflect.jvm.internal.impl.descriptors.impl.i implements kotlin.reflect.jvm.internal.impl.load.java.descriptors.a {
    static final /* synthetic */ boolean I = false;
    private java.lang.Boolean G;
    private java.lang.Boolean H;

    static {
            return
    }

    protected b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.load.java.descriptors.b r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4, boolean r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r7) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 0
            T(r0)
        L6:
            if (r4 != 0) goto Lc
            r0 = 1
            T(r0)
        Lc:
            if (r6 != 0) goto L12
            r0 = 2
            T(r0)
        L12:
            if (r7 != 0) goto L18
            r0 = 3
            T(r0)
        L18:
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r2 = r1
            r3 = 0
            r2.G = r3
            r2.H = r3
            return
    }

    private static /* synthetic */ void T(int r9) {
            r0 = 18
            r1 = 11
            if (r9 == r1) goto Lb
            if (r9 == r0) goto Lb
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Ld
        Lb:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Ld:
            r3 = 2
            if (r9 == r1) goto L14
            if (r9 == r0) goto L14
            r4 = 3
            goto L15
        L14:
            r4 = 2
        L15:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor"
            r6 = 0
            switch(r9) {
                case 1: goto L43;
                case 2: goto L3e;
                case 3: goto L39;
                case 4: goto L1d;
                case 5: goto L43;
                case 6: goto L39;
                case 7: goto L34;
                case 8: goto L3e;
                case 9: goto L43;
                case 10: goto L39;
                case 11: goto L31;
                case 12: goto L34;
                case 13: goto L3e;
                case 14: goto L2c;
                case 15: goto L43;
                case 16: goto L27;
                case 17: goto L22;
                case 18: goto L31;
                default: goto L1d;
            }
        L1d:
            java.lang.String r7 = "containingDeclaration"
            r4[r6] = r7
            goto L47
        L22:
            java.lang.String r7 = "enhancedReturnType"
            r4[r6] = r7
            goto L47
        L27:
            java.lang.String r7 = "enhancedValueParameterTypes"
            r4[r6] = r7
            goto L47
        L2c:
            java.lang.String r7 = "sourceElement"
            r4[r6] = r7
            goto L47
        L31:
            r4[r6] = r5
            goto L47
        L34:
            java.lang.String r7 = "newOwner"
            r4[r6] = r7
            goto L47
        L39:
            java.lang.String r7 = "source"
            r4[r6] = r7
            goto L47
        L3e:
            java.lang.String r7 = "kind"
            r4[r6] = r7
            goto L47
        L43:
            java.lang.String r7 = "annotations"
            r4[r6] = r7
        L47:
            java.lang.String r6 = "createSubstitutedCopy"
            java.lang.String r7 = "enhance"
            r8 = 1
            if (r9 == r1) goto L56
            if (r9 == r0) goto L53
            r4[r8] = r5
            goto L58
        L53:
            r4[r8] = r7
            goto L58
        L56:
            r4[r8] = r6
        L58:
            switch(r9) {
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L6b;
                case 7: goto L68;
                case 8: goto L68;
                case 9: goto L68;
                case 10: goto L68;
                case 11: goto L6f;
                case 12: goto L63;
                case 13: goto L63;
                case 14: goto L63;
                case 15: goto L63;
                case 16: goto L60;
                case 17: goto L60;
                case 18: goto L6f;
                default: goto L5b;
            }
        L5b:
            java.lang.String r5 = "<init>"
            r4[r3] = r5
            goto L6f
        L60:
            r4[r3] = r7
            goto L6f
        L63:
            java.lang.String r5 = "createDescriptor"
            r4[r3] = r5
            goto L6f
        L68:
            r4[r3] = r6
            goto L6f
        L6b:
            java.lang.String r5 = "createJavaConstructor"
            r4[r3] = r5
        L6f:
            java.lang.String r2 = java.lang.String.format(r2, r4)
            if (r9 == r1) goto L7d
            if (r9 == r0) goto L7d
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r2)
            goto L82
        L7d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r2)
        L82:
            throw r9
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.load.java.descriptors.b o1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r9, boolean r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r11) {
            if (r8 != 0) goto L6
            r0 = 4
            T(r0)
        L6:
            if (r9 != 0) goto Lc
            r0 = 5
            T(r0)
        Lc:
            if (r11 != 0) goto L12
            r0 = 6
            T(r0)
        L12:
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.b r1 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.b
            r3 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r6 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
            r2 = r8
            r4 = r9
            r5 = r10
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.i, kotlin.reflect.jvm.internal.impl.descriptors.impl.s
    @org.jetbrains.annotations.NotNull
    protected /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.s G0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.y r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r6) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.b r1 = r0.p1(r1, r2, r3, r4, r5, r6)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s
    public boolean L0() {
            r1 = this;
            java.lang.Boolean r0 = r1.G
            boolean r0 = r0.booleanValue()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s
    public void T0(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.G = r1
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s
    public void U0(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.H = r1
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.i
    @org.jetbrains.annotations.NotNull
    protected /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.i j1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.y r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r6) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.b r1 = r0.p1(r1, r2, r3, r4, r5, r6)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.a
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.descriptors.a k0(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r1, @org.jetbrains.annotations.NotNull java.util.List r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3, @org.jetbrains.annotations.Nullable kotlin.Pair r4) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.b r1 = r0.q1(r1, r2, r3, r4)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean n0() {
            r1 = this;
            java.lang.Boolean r0 = r1.H
            boolean r0 = r0.booleanValue()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.load.java.descriptors.b n1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r9, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.load.java.descriptors.b r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r13) {
            r8 = this;
            if (r9 != 0) goto L7
            r0 = 12
            T(r0)
        L7:
            if (r11 != 0) goto Le
            r0 = 13
            T(r0)
        Le:
            if (r12 != 0) goto L15
            r0 = 14
            T(r0)
        L15:
            if (r13 != 0) goto L1c
            r0 = 15
            T(r0)
        L1c:
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.b r1 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.b
            boolean r5 = r8.E
            r2 = r9
            r3 = r10
            r6 = r11
            r7 = r12
            r4 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.load.java.descriptors.b p1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r7, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.y r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r9, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r12) {
            r6 = this;
            if (r7 != 0) goto L6
            r10 = 7
            T(r10)
        L6:
            if (r9 != 0) goto Ld
            r10 = 8
            T(r10)
        Ld:
            if (r11 != 0) goto L14
            r10 = 9
            T(r10)
        L14:
            if (r12 != 0) goto L1b
            r10 = 10
            T(r10)
        L1b:
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r10 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
            if (r9 == r10) goto L4b
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r10 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.SYNTHESIZED
            if (r9 != r10) goto L24
            goto L4b
        L24:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Attempt at creating a constructor that is not a declaration: \ncopy from: "
            r10.append(r11)
            r10.append(r6)
            java.lang.String r11 = "\nnewOwner: "
            r10.append(r11)
            r10.append(r7)
            java.lang.String r7 = "\nkind: "
            r10.append(r7)
            r10.append(r9)
            java.lang.String r7 = r10.toString()
            r8.<init>(r7)
            throw r8
        L4b:
            r1 = r7
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            r2 = r8
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.b r2 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.b) r2
            r0 = r6
            r3 = r9
            r5 = r11
            r4 = r12
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.b r7 = r0.n1(r1, r2, r3, r4, r5)
            boolean r8 = r6.L0()
            r7.T0(r8)
            boolean r8 = r6.n0()
            r7.U0(r8)
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.load.java.descriptors.b q1(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r20, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> r21, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r22, @org.jetbrains.annotations.Nullable kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<?>, ?> r23) {
            r19 = this;
            r0 = r20
            r1 = r21
            if (r1 != 0) goto Lb
            r2 = 16
            T(r2)
        Lb:
            if (r22 != 0) goto L12
            r2 = 17
            T(r2)
        L12:
            kotlin.reflect.jvm.internal.impl.descriptors.d r4 = r19.k1()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r6 = r19.h()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r8 = r19.getAnnotations()
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r9 = r19.getSource()
            r5 = 0
            r7 = 0
            r3 = r19
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.b r10 = r3.p1(r4, r5, r6, r7, r8, r9)
            if (r0 != 0) goto L2f
            r0 = 0
        L2d:
            r11 = r0
            goto L3a
        L2f:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r2.b()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = kotlin.reflect.jvm.internal.impl.resolve.h.i(r10, r0, r2)
            goto L2d
        L3a:
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r12 = r19.c0()
            java.util.List r13 = kotlin.collections.f0.J()
            java.util.List r14 = r19.getTypeParameters()
            java.util.List r0 = r19.g()
            java.util.List r15 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.h.a(r1, r0, r10)
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r17 = r19.i()
            kotlin.reflect.jvm.internal.impl.descriptors.s r18 = r19.getVisibility()
            r16 = r22
            r10.M0(r11, r12, r13, r14, r15, r16, r17, r18)
            if (r23 == 0) goto L6a
            java.lang.Object r0 = r23.getFirst()
            kotlin.reflect.jvm.internal.impl.descriptors.a$a r0 = (kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a) r0
            java.lang.Object r1 = r23.getSecond()
            r10.P0(r0, r1)
        L6a:
            return r10
    }
}
