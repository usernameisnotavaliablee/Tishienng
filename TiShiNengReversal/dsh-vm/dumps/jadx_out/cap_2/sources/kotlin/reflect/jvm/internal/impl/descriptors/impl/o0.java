package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class o0 extends kotlin.reflect.jvm.internal.impl.descriptors.impl.s implements kotlin.reflect.jvm.internal.impl.descriptors.d1 {
    protected o0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.d1 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r7) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 0
            T(r0)
        L6:
            if (r4 != 0) goto Lc
            r0 = 1
            T(r0)
        Lc:
            if (r5 != 0) goto L12
            r0 = 2
            T(r0)
        L12:
            if (r6 != 0) goto L18
            r0 = 3
            T(r0)
        L18:
            if (r7 != 0) goto L1e
            r0 = 4
            T(r0)
        L1e:
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
    }

    private static /* synthetic */ void T(int r12) {
            r0 = 30
            r1 = 29
            r2 = 24
            r3 = 23
            r4 = 18
            r5 = 13
            if (r12 == r5) goto L1b
            if (r12 == r4) goto L1b
            if (r12 == r3) goto L1b
            if (r12 == r2) goto L1b
            if (r12 == r1) goto L1b
            if (r12 == r0) goto L1b
            java.lang.String r6 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L1d
        L1b:
            java.lang.String r6 = "@NotNull method %s.%s must not return null"
        L1d:
            r7 = 2
            if (r12 == r5) goto L2c
            if (r12 == r4) goto L2c
            if (r12 == r3) goto L2c
            if (r12 == r2) goto L2c
            if (r12 == r1) goto L2c
            if (r12 == r0) goto L2c
            r8 = 3
            goto L2d
        L2c:
            r8 = 2
        L2d:
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r9 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl"
            r10 = 0
            switch(r12) {
                case 1: goto L65;
                case 2: goto L60;
                case 3: goto L5b;
                case 4: goto L56;
                case 5: goto L35;
                case 6: goto L65;
                case 7: goto L60;
                case 8: goto L5b;
                case 9: goto L56;
                case 10: goto L51;
                case 11: goto L4c;
                case 12: goto L47;
                case 13: goto L44;
                case 14: goto L3f;
                case 15: goto L51;
                case 16: goto L4c;
                case 17: goto L47;
                case 18: goto L44;
                case 19: goto L3f;
                case 20: goto L51;
                case 21: goto L4c;
                case 22: goto L47;
                case 23: goto L44;
                case 24: goto L44;
                case 25: goto L3a;
                case 26: goto L5b;
                case 27: goto L65;
                case 28: goto L56;
                case 29: goto L44;
                case 30: goto L44;
                default: goto L35;
            }
        L35:
            java.lang.String r11 = "containingDeclaration"
            r8[r10] = r11
            goto L69
        L3a:
            java.lang.String r11 = "newOwner"
            r8[r10] = r11
            goto L69
        L3f:
            java.lang.String r11 = "contextReceiverParameters"
            r8[r10] = r11
            goto L69
        L44:
            r8[r10] = r9
            goto L69
        L47:
            java.lang.String r11 = "visibility"
            r8[r10] = r11
            goto L69
        L4c:
            java.lang.String r11 = "unsubstitutedValueParameters"
            r8[r10] = r11
            goto L69
        L51:
            java.lang.String r11 = "typeParameters"
            r8[r10] = r11
            goto L69
        L56:
            java.lang.String r11 = "source"
            r8[r10] = r11
            goto L69
        L5b:
            java.lang.String r11 = "kind"
            r8[r10] = r11
            goto L69
        L60:
            java.lang.String r11 = "name"
            r8[r10] = r11
            goto L69
        L65:
            java.lang.String r11 = "annotations"
            r8[r10] = r11
        L69:
            java.lang.String r10 = "initialize"
            r11 = 1
            if (r12 == r5) goto L8a
            if (r12 == r4) goto L8a
            if (r12 == r3) goto L8a
            if (r12 == r2) goto L85
            if (r12 == r1) goto L80
            if (r12 == r0) goto L7b
            r8[r11] = r9
            goto L8c
        L7b:
            java.lang.String r9 = "newCopyBuilder"
            r8[r11] = r9
            goto L8c
        L80:
            java.lang.String r9 = "copy"
            r8[r11] = r9
            goto L8c
        L85:
            java.lang.String r9 = "getOriginal"
            r8[r11] = r9
            goto L8c
        L8a:
            r8[r11] = r10
        L8c:
            switch(r12) {
                case 5: goto L9c;
                case 6: goto L9c;
                case 7: goto L9c;
                case 8: goto L9c;
                case 9: goto L9c;
                case 10: goto L99;
                case 11: goto L99;
                case 12: goto L99;
                case 13: goto La0;
                case 14: goto L99;
                case 15: goto L99;
                case 16: goto L99;
                case 17: goto L99;
                case 18: goto La0;
                case 19: goto L99;
                case 20: goto L99;
                case 21: goto L99;
                case 22: goto L99;
                case 23: goto La0;
                case 24: goto La0;
                case 25: goto L94;
                case 26: goto L94;
                case 27: goto L94;
                case 28: goto L94;
                case 29: goto La0;
                case 30: goto La0;
                default: goto L8f;
            }
        L8f:
            java.lang.String r9 = "<init>"
            r8[r7] = r9
            goto La0
        L94:
            java.lang.String r9 = "createSubstitutedCopy"
            r8[r7] = r9
            goto La0
        L99:
            r8[r7] = r10
            goto La0
        L9c:
            java.lang.String r9 = "create"
            r8[r7] = r9
        La0:
            java.lang.String r6 = java.lang.String.format(r6, r8)
            if (r12 == r5) goto Lb6
            if (r12 == r4) goto Lb6
            if (r12 == r3) goto Lb6
            if (r12 == r2) goto Lb6
            if (r12 == r1) goto Lb6
            if (r12 == r0) goto Lb6
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>(r6)
            goto Lbb
        Lb6:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>(r6)
        Lbb:
            throw r12
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.o0 g1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r12) {
            if (r8 != 0) goto L6
            r0 = 5
            T(r0)
        L6:
            if (r9 != 0) goto Lc
            r0 = 6
            T(r0)
        Lc:
            if (r10 != 0) goto L12
            r0 = 7
            T(r0)
        L12:
            if (r11 != 0) goto L19
            r0 = 8
            T(r0)
        L19:
            if (r12 != 0) goto L20
            r0 = 9
            T(r0)
        L20:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.o0 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.o0
            r3 = 0
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y F0(kotlin.reflect.jvm.internal.impl.descriptors.k r1, kotlin.reflect.jvm.internal.impl.descriptors.Modality r2, kotlin.reflect.jvm.internal.impl.descriptors.s r3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r4, boolean r5) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r1 = r0.f1(r1, r2, r3, r4, r5)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s
    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.descriptors.impl.s G0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r9, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.y r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r11, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r14) {
            r8 = this;
            if (r9 != 0) goto L7
            r0 = 25
            T(r0)
        L7:
            if (r11 != 0) goto Le
            r0 = 26
            T(r0)
        Le:
            if (r13 != 0) goto L15
            r0 = 27
            T(r0)
        L15:
            if (r14 != 0) goto L1c
            r0 = 28
            T(r0)
        L1c:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.o0 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.o0
            r3 = r10
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r3
            if (r12 == 0) goto L29
        L23:
            r2 = r9
            r6 = r11
            r5 = r12
            r4 = r13
            r7 = r14
            goto L2e
        L29:
            kotlin.reflect.jvm.internal.impl.name.f r12 = r8.getName()
            goto L23
        L2e:
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.s M0(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.z0 r1, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.z0 r2, @org.jetbrains.annotations.NotNull java.util.List r3, @org.jetbrains.annotations.NotNull java.util.List r4, @org.jetbrains.annotations.NotNull java.util.List r5, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r6, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.Modality r7, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r8) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.o0 r1 = r0.i1(r1, r2, r3, r4, r5, r6, r7, r8)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = r1.h1()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = r1.h1()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = r1.h1()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = r1.h1()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor e0(kotlin.reflect.jvm.internal.impl.descriptors.k r1, kotlin.reflect.jvm.internal.impl.descriptors.Modality r2, kotlin.reflect.jvm.internal.impl.descriptors.s r3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r4, boolean r5) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r1 = r0.f1(r1, r2, r3, r4, r5)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d1 f1(kotlin.reflect.jvm.internal.impl.descriptors.k r1, kotlin.reflect.jvm.internal.impl.descriptors.Modality r2, kotlin.reflect.jvm.internal.impl.descriptors.s r3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r4, boolean r5) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = super.F0(r1, r2, r3, r4, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r1
            if (r1 != 0) goto Ld
            r2 = 29
            T(r2)
        Ld:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d1 h1() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = super.a()
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r0
            if (r0 != 0) goto Ld
            r1 = 24
            T(r1)
        Ld:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.o0 i1(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.z0 r12, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.z0 r13, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> r14, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r15, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r16, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r17, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.Modality r18, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r19) {
            r11 = this;
            if (r14 != 0) goto L7
            r0 = 14
            T(r0)
        L7:
            if (r15 != 0) goto Le
            r0 = 15
            T(r0)
        Le:
            if (r16 != 0) goto L15
            r0 = 16
            T(r0)
        L15:
            if (r19 != 0) goto L1c
            r0 = 17
            T(r0)
        L1c:
            r10 = 0
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            kotlin.reflect.jvm.internal.impl.descriptors.impl.o0 r12 = r1.j1(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 != 0) goto L35
            r13 = 18
            T(r13)
        L35:
            return r12
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.o0 j1(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.z0 r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.z0 r3, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> r4, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r5, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r6, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r7, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.Modality r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r9, @org.jetbrains.annotations.Nullable java.util.Map<? extends kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<?>, ?> r10) {
            r1 = this;
            if (r4 != 0) goto L7
            r0 = 19
            T(r0)
        L7:
            if (r5 != 0) goto Le
            r0 = 20
            T(r0)
        Le:
            if (r6 != 0) goto L15
            r0 = 21
            T(r0)
        L15:
            if (r9 != 0) goto L1c
            r0 = 22
            T(r0)
        L1c:
            super.M0(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = r1
            if (r10 == 0) goto L2f
            boolean r3 = r10.isEmpty()
            if (r3 != 0) goto L2f
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r10)
            r2.D = r3
        L2f:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.y
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.y.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.d1> n() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r0 = super.n()
            if (r0 != 0) goto Lb
            r1 = 30
            T(r1)
        Lb:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.impl.n
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.n p0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = r1.h1()
            return r0
    }
}
