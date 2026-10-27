package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class t0 extends kotlin.reflect.jvm.internal.impl.descriptors.impl.h {

    @org.jetbrains.annotations.Nullable
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.t0, java.lang.Void> k;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> l;
    private boolean m;

    private t0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r12, boolean r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.Variance r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r15, int r16, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r17, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.t0, java.lang.Void> r18, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.h1 r19, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r20) {
            r10 = this;
            if (r11 != 0) goto L7
            r0 = 19
            T(r0)
        L7:
            if (r12 != 0) goto Le
            r0 = 20
            T(r0)
        Le:
            if (r14 != 0) goto L15
            r0 = 21
            T(r0)
        L15:
            if (r15 != 0) goto L1c
            r0 = 22
            T(r0)
        L1c:
            if (r17 != 0) goto L23
            r0 = 23
            T(r0)
        L23:
            if (r19 != 0) goto L2a
            r0 = 24
            T(r0)
        L2a:
            if (r20 != 0) goto L31
            r0 = 25
            T(r0)
        L31:
            r0 = r10
            r2 = r11
            r3 = r12
            r6 = r13
            r5 = r14
            r4 = r15
            r7 = r16
            r8 = r17
            r9 = r19
            r1 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 1
            r1.<init>(r2)
            r10.l = r1
            r1 = 0
            r10.m = r1
            r1 = r18
            r10.k = r1
            return
    }

    private void I0() {
            r3 = this;
            boolean r0 = r3.m
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Type parameter descriptor is not initialized: "
            r1.append(r2)
            java.lang.String r2 = r3.P0()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private void J0() {
            r3 = this;
            boolean r0 = r3.m
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Type parameter descriptor is already initialized: "
            r1.append(r2)
            java.lang.String r2 = r3.P0()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.t0 K0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r13, boolean r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.Variance r15, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r16, int r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r18, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.t0, java.lang.Void> r19, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.h1 r20, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r21) {
            if (r12 != 0) goto L7
            r0 = 12
            T(r0)
        L7:
            if (r13 != 0) goto Le
            r0 = 13
            T(r0)
        Le:
            if (r15 != 0) goto L15
            r0 = 14
            T(r0)
        L15:
            if (r16 != 0) goto L1c
            r0 = 15
            T(r0)
        L1c:
            if (r18 != 0) goto L23
            r0 = 16
            T(r0)
        L23:
            if (r20 != 0) goto L2a
            r0 = 17
            T(r0)
        L2a:
            if (r21 != 0) goto L31
            r0 = 18
            T(r0)
        L31:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.t0 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.t0
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r1
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.t0 L0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r12, boolean r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.Variance r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r15, int r16, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r18) {
            if (r11 != 0) goto L6
            r0 = 6
            T(r0)
        L6:
            if (r12 != 0) goto Lc
            r0 = 7
            T(r0)
        Lc:
            if (r14 != 0) goto L13
            r0 = 8
            T(r0)
        L13:
            if (r15 != 0) goto L1a
            r0 = 9
            T(r0)
        L1a:
            if (r17 != 0) goto L21
            r0 = 10
            T(r0)
        L21:
            if (r18 != 0) goto L28
            r0 = 11
            T(r0)
        L28:
            r8 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.h1$a r9 = kotlin.reflect.jvm.internal.impl.descriptors.h1.a.a
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r10 = r18
            kotlin.reflect.jvm.internal.impl.descriptors.impl.t0 r11 = K0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.descriptors.j1 M0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r10, boolean r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.Variance r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r13, int r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r15) {
            if (r9 != 0) goto L6
            r0 = 0
            T(r0)
        L6:
            if (r10 != 0) goto Lc
            r0 = 1
            T(r0)
        Lc:
            if (r12 != 0) goto L12
            r0 = 2
            T(r0)
        L12:
            if (r13 != 0) goto L18
            r0 = 3
            T(r0)
        L18:
            if (r15 != 0) goto L1e
            r0 = 4
            T(r0)
        L1e:
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r7 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r8 = r15
            kotlin.reflect.jvm.internal.impl.descriptors.impl.t0 r9 = L0(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlin.reflect.jvm.internal.impl.builtins.j r10 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.m(r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r10 = r10.z()
            r9.H0(r10)
            r9.Q0()
            return r9
    }

    private void N0(kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r1 = this;
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.x0.a(r2)
            if (r0 == 0) goto L7
            return
        L7:
            java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> r0 = r1.l
            r0.add(r2)
            return
    }

    private java.lang.String P0() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.name.f r1 = r2.getName()
            r0.append(r1)
            java.lang.String r1 = " declared in "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r2.b()
            kotlin.reflect.jvm.internal.impl.name.d r1 = kotlin.reflect.jvm.internal.impl.resolve.i.m(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static /* synthetic */ void T(int r8) {
            r0 = 28
            r1 = 5
            if (r8 == r1) goto La
            if (r8 == r0) goto La
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Lc
        La:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Lc:
            r3 = 2
            if (r8 == r1) goto L13
            if (r8 == r0) goto L13
            r4 = 3
            goto L14
        L13:
            r4 = 2
        L14:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl"
            r6 = 0
            switch(r8) {
                case 1: goto L4c;
                case 2: goto L47;
                case 3: goto L42;
                case 4: goto L3d;
                case 5: goto L3a;
                case 6: goto L1c;
                case 7: goto L4c;
                case 8: goto L47;
                case 9: goto L42;
                case 10: goto L35;
                case 11: goto L3d;
                case 12: goto L1c;
                case 13: goto L4c;
                case 14: goto L47;
                case 15: goto L42;
                case 16: goto L35;
                case 17: goto L30;
                case 18: goto L3d;
                case 19: goto L1c;
                case 20: goto L4c;
                case 21: goto L47;
                case 22: goto L42;
                case 23: goto L35;
                case 24: goto L2b;
                case 25: goto L3d;
                case 26: goto L26;
                case 27: goto L21;
                case 28: goto L3a;
                default: goto L1c;
            }
        L1c:
            java.lang.String r7 = "containingDeclaration"
            r4[r6] = r7
            goto L50
        L21:
            java.lang.String r7 = "type"
            r4[r6] = r7
            goto L50
        L26:
            java.lang.String r7 = "bound"
            r4[r6] = r7
            goto L50
        L2b:
            java.lang.String r7 = "supertypeLoopsChecker"
            r4[r6] = r7
            goto L50
        L30:
            java.lang.String r7 = "supertypeLoopsResolver"
            r4[r6] = r7
            goto L50
        L35:
            java.lang.String r7 = "source"
            r4[r6] = r7
            goto L50
        L3a:
            r4[r6] = r5
            goto L50
        L3d:
            java.lang.String r7 = "storageManager"
            r4[r6] = r7
            goto L50
        L42:
            java.lang.String r7 = "name"
            r4[r6] = r7
            goto L50
        L47:
            java.lang.String r7 = "variance"
            r4[r6] = r7
            goto L50
        L4c:
            java.lang.String r7 = "annotations"
            r4[r6] = r7
        L50:
            java.lang.String r6 = "createWithDefaultBound"
            r7 = 1
            if (r8 == r1) goto L5f
            if (r8 == r0) goto L5a
            r4[r7] = r5
            goto L61
        L5a:
            java.lang.String r5 = "resolveUpperBounds"
            r4[r7] = r5
            goto L61
        L5f:
            r4[r7] = r6
        L61:
            switch(r8) {
                case 5: goto L7a;
                case 6: goto L76;
                case 7: goto L76;
                case 8: goto L76;
                case 9: goto L76;
                case 10: goto L76;
                case 11: goto L76;
                case 12: goto L76;
                case 13: goto L76;
                case 14: goto L76;
                case 15: goto L76;
                case 16: goto L76;
                case 17: goto L76;
                case 18: goto L76;
                case 19: goto L71;
                case 20: goto L71;
                case 21: goto L71;
                case 22: goto L71;
                case 23: goto L71;
                case 24: goto L71;
                case 25: goto L71;
                case 26: goto L6c;
                case 27: goto L67;
                case 28: goto L7a;
                default: goto L64;
            }
        L64:
            r4[r3] = r6
            goto L7a
        L67:
            java.lang.String r5 = "reportSupertypeLoopError"
            r4[r3] = r5
            goto L7a
        L6c:
            java.lang.String r5 = "addUpperBound"
            r4[r3] = r5
            goto L7a
        L71:
            java.lang.String r5 = "<init>"
            r4[r3] = r5
            goto L7a
        L76:
            java.lang.String r5 = "createForFurtherModification"
            r4[r3] = r5
        L7a:
            java.lang.String r2 = java.lang.String.format(r2, r4)
            if (r8 == r1) goto L88
            if (r8 == r0) goto L88
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r2)
            goto L8d
        L88:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r2)
        L8d:
            throw r8
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h
    protected void F0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 27
            T(r0)
        L7:
            kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.t0, java.lang.Void> r0 = r1.k
            if (r0 != 0) goto Lc
            return
        Lc:
            r0.invoke(r2)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.h
    @org.jetbrains.annotations.NotNull
    protected java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> G0() {
            r2 = this;
            r2.I0()
            java.util.List<kotlin.reflect.jvm.internal.impl.types.t0> r0 = r2.l
            if (r0 != 0) goto Lc
            r1 = 28
            T(r1)
        Lc:
            return r0
    }

    public void H0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 26
            T(r0)
        L7:
            r1.J0()
            r1.N0(r2)
            return
    }

    public boolean O0() {
            r1 = this;
            boolean r0 = r1.m
            return r0
    }

    public void Q0() {
            r1 = this;
            r1.J0()
            r0 = 1
            r1.m = r0
            return
    }
}
