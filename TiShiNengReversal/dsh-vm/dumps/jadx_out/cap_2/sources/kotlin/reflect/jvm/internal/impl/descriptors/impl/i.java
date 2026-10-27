package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class i extends kotlin.reflect.jvm.internal.impl.descriptors.impl.s implements kotlin.reflect.jvm.internal.impl.descriptors.c {
    static final /* synthetic */ boolean F = false;
    protected final boolean E;

    static {
            return
    }

    protected i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r9, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.j r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r11, boolean r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r14) {
            r8 = this;
            if (r9 != 0) goto L6
            r0 = 0
            T(r0)
        L6:
            if (r11 != 0) goto Lc
            r0 = 1
            T(r0)
        Lc:
            if (r13 != 0) goto L12
            r0 = 2
            T(r0)
        L12:
            if (r14 != 0) goto L18
            r0 = 3
            T(r0)
        L18:
            kotlin.reflect.jvm.internal.impl.name.f r5 = kotlin.reflect.jvm.internal.impl.name.h.j
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r1.E = r12
            return
    }

    private static /* synthetic */ void T(int r8) {
            r0 = 27
            r1 = 21
            if (r8 == r1) goto Le
            if (r8 == r0) goto Le
            switch(r8) {
                case 15: goto Le;
                case 16: goto Le;
                case 17: goto Le;
                case 18: goto Le;
                case 19: goto Le;
                default: goto Lb;
            }
        Lb:
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L10
        Le:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        L10:
            r3 = 2
            if (r8 == r1) goto L1a
            if (r8 == r0) goto L1a
            switch(r8) {
                case 15: goto L1a;
                case 16: goto L1a;
                case 17: goto L1a;
                case 18: goto L1a;
                case 19: goto L1a;
                default: goto L18;
            }
        L18:
            r4 = 3
            goto L1b
        L1a:
            r4 = 2
        L1b:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl"
            r6 = 0
            switch(r8) {
                case 1: goto L53;
                case 2: goto L4e;
                case 3: goto L49;
                case 4: goto L23;
                case 5: goto L53;
                case 6: goto L49;
                case 7: goto L23;
                case 8: goto L53;
                case 9: goto L49;
                case 10: goto L44;
                case 11: goto L3f;
                case 12: goto L3a;
                case 13: goto L44;
                case 14: goto L3f;
                case 15: goto L37;
                case 16: goto L37;
                case 17: goto L37;
                case 18: goto L37;
                case 19: goto L37;
                case 20: goto L32;
                case 21: goto L37;
                case 22: goto L2d;
                case 23: goto L28;
                case 24: goto L4e;
                case 25: goto L53;
                case 26: goto L49;
                case 27: goto L37;
                default: goto L23;
            }
        L23:
            java.lang.String r7 = "containingDeclaration"
            r4[r6] = r7
            goto L57
        L28:
            java.lang.String r7 = "newOwner"
            r4[r6] = r7
            goto L57
        L2d:
            java.lang.String r7 = "overriddenDescriptors"
            r4[r6] = r7
            goto L57
        L32:
            java.lang.String r7 = "originalSubstitutor"
            r4[r6] = r7
            goto L57
        L37:
            r4[r6] = r5
            goto L57
        L3a:
            java.lang.String r7 = "typeParameterDescriptors"
            r4[r6] = r7
            goto L57
        L3f:
            java.lang.String r7 = "visibility"
            r4[r6] = r7
            goto L57
        L44:
            java.lang.String r7 = "unsubstitutedValueParameters"
            r4[r6] = r7
            goto L57
        L49:
            java.lang.String r7 = "source"
            r4[r6] = r7
            goto L57
        L4e:
            java.lang.String r7 = "kind"
            r4[r6] = r7
            goto L57
        L53:
            java.lang.String r7 = "annotations"
            r4[r6] = r7
        L57:
            r6 = 1
            if (r8 == r1) goto L7b
            if (r8 == r0) goto L76
            switch(r8) {
                case 15: goto L71;
                case 16: goto L71;
                case 17: goto L6c;
                case 18: goto L67;
                case 19: goto L62;
                default: goto L5f;
            }
        L5f:
            r4[r6] = r5
            goto L7f
        L62:
            java.lang.String r5 = "getOriginal"
            r4[r6] = r5
            goto L7f
        L67:
            java.lang.String r5 = "getConstructedClass"
            r4[r6] = r5
            goto L7f
        L6c:
            java.lang.String r5 = "getContainingDeclaration"
            r4[r6] = r5
            goto L7f
        L71:
            java.lang.String r5 = "calculateContextReceiverParameters"
            r4[r6] = r5
            goto L7f
        L76:
            java.lang.String r5 = "copy"
            r4[r6] = r5
            goto L7f
        L7b:
            java.lang.String r5 = "getOverriddenDescriptors"
            r4[r6] = r5
        L7f:
            switch(r8) {
                case 4: goto La0;
                case 5: goto La0;
                case 6: goto La0;
                case 7: goto L9b;
                case 8: goto L9b;
                case 9: goto L9b;
                case 10: goto L96;
                case 11: goto L96;
                case 12: goto L96;
                case 13: goto L96;
                case 14: goto L96;
                case 15: goto La4;
                case 16: goto La4;
                case 17: goto La4;
                case 18: goto La4;
                case 19: goto La4;
                case 20: goto L91;
                case 21: goto La4;
                case 22: goto L8c;
                case 23: goto L87;
                case 24: goto L87;
                case 25: goto L87;
                case 26: goto L87;
                case 27: goto La4;
                default: goto L82;
            }
        L82:
            java.lang.String r5 = "<init>"
            r4[r3] = r5
            goto La4
        L87:
            java.lang.String r5 = "createSubstitutedCopy"
            r4[r3] = r5
            goto La4
        L8c:
            java.lang.String r5 = "setOverriddenDescriptors"
            r4[r3] = r5
            goto La4
        L91:
            java.lang.String r5 = "substitute"
            r4[r3] = r5
            goto La4
        L96:
            java.lang.String r5 = "initialize"
            r4[r3] = r5
            goto La4
        L9b:
            java.lang.String r5 = "createSynthesized"
            r4[r3] = r5
            goto La4
        La0:
            java.lang.String r5 = "create"
            r4[r3] = r5
        La4:
            java.lang.String r2 = java.lang.String.format(r2, r4)
            if (r8 == r1) goto Lb5
            if (r8 == r0) goto Lb5
            switch(r8) {
                case 15: goto Lb5;
                case 16: goto Lb5;
                case 17: goto Lb5;
                case 18: goto Lb5;
                case 19: goto Lb5;
                default: goto Laf;
            }
        Laf:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r2)
            goto Lba
        Lb5:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r2)
        Lba:
            throw r8
    }

    @org.jetbrains.annotations.NotNull
    private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> f1() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.k1()
            java.util.List r1 = r0.j0()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L1a
            java.util.List r0 = r0.j0()
            if (r0 != 0) goto L19
            r1 = 15
            T(r1)
        L19:
            return r0
        L1a:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            if (r0 != 0) goto L23
            r1 = 16
            T(r1)
        L23:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.i i1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r9, boolean r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r11) {
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
            kotlin.reflect.jvm.internal.impl.descriptors.impl.i r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.i
            r3 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r6 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
            r2 = r8
            r4 = r9
            r5 = r10
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y F0(kotlin.reflect.jvm.internal.impl.descriptors.k r1, kotlin.reflect.jvm.internal.impl.descriptors.Modality r2, kotlin.reflect.jvm.internal.impl.descriptors.s r3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r4, boolean r5) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.c r1 = r0.h1(r1, r2, r3, r4, r5)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s
    @org.jetbrains.annotations.NotNull
    protected /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.s G0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.y r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r6) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.i r1 = r0.j1(r1, r2, r3, r4, r5, r6)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d J() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.k1()
            if (r0 != 0) goto Lb
            r1 = 18
            T(r1)
        Lb:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void R(@org.jetbrains.annotations.NotNull java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r1) {
            r0 = this;
            if (r1 != 0) goto L7
            r1 = 22
            T(r1)
        L7:
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R W(kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> r1, D r2) {
            r0 = this;
            java.lang.Object r1 = r1.f(r0, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.c a() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = super.a()
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = (kotlin.reflect.jvm.internal.impl.descriptors.c) r0
            if (r0 != 0) goto Ld
            r1 = 19
            T(r1)
        Ld:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.g b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.k1()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.k1()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.y, kotlin.reflect.jvm.internal.impl.descriptors.g1
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.c c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 20
            T(r0)
        L7:
            kotlin.reflect.jvm.internal.impl.descriptors.y r2 = super.c(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.c r2 = (kotlin.reflect.jvm.internal.impl.descriptors.c) r2
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.y, kotlin.reflect.jvm.internal.impl.descriptors.g1
    @org.jetbrains.annotations.Nullable
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.j c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.c r1 = r0.c(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.y, kotlin.reflect.jvm.internal.impl.descriptors.g1
    @org.jetbrains.annotations.Nullable
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.l c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.c r1 = r0.c(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.y, kotlin.reflect.jvm.internal.impl.descriptors.g1
    @org.jetbrains.annotations.Nullable
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.c r1 = r0.c(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.y, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.y> e() {
            r2 = this;
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            if (r0 != 0) goto L9
            r1 = 21
            T(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor e0(kotlin.reflect.jvm.internal.impl.descriptors.k r1, kotlin.reflect.jvm.internal.impl.descriptors.Modality r2, kotlin.reflect.jvm.internal.impl.descriptors.s r3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r4, boolean r5) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.c r1 = r0.h1(r1, r2, r3, r4, r5)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.z0 g1() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.k1()
            boolean r1 = r0.k()
            if (r1 == 0) goto L19
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r0.b()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r1 == 0) goto L19
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r0.V()
            return r0
        L19:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.c h1(kotlin.reflect.jvm.internal.impl.descriptors.k r1, kotlin.reflect.jvm.internal.impl.descriptors.Modality r2, kotlin.reflect.jvm.internal.impl.descriptors.s r3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r4, boolean r5) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = super.F0(r1, r2, r3, r4, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.c r1 = (kotlin.reflect.jvm.internal.impl.descriptors.c) r1
            if (r1 != 0) goto Ld
            r2 = 27
            T(r2)
        Ld:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.descriptors.impl.i j1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r8, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.y r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r10, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r13) {
            r7 = this;
            if (r8 != 0) goto L7
            r9 = 23
            T(r9)
        L7:
            if (r10 != 0) goto Le
            r9 = 24
            T(r9)
        Le:
            if (r12 != 0) goto L15
            r9 = 25
            T(r9)
        L15:
            if (r13 != 0) goto L1c
            r9 = 26
            T(r9)
        L1c:
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r5 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
            if (r10 == r5) goto L4c
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r9 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.SYNTHESIZED
            if (r10 != r9) goto L25
            goto L4c
        L25:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Attempt at creating a constructor that is not a declaration: \ncopy from: "
            r11.append(r12)
            r11.append(r7)
            java.lang.String r12 = "\nnewOwner: "
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = "\nkind: "
            r11.append(r8)
            r11.append(r10)
            java.lang.String r8 = r11.toString()
            r9.<init>(r8)
            throw r9
        L4c:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.i r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.i
            r1 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r1
            boolean r4 = r7.E
            r2 = r7
            r3 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d k1() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = super.b()
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            if (r0 != 0) goto Ld
            r1 = 17
            T(r1)
        Ld:
            return r0
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.impl.i l1(@org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r3) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 13
            T(r0)
        L7:
            if (r3 != 0) goto Le
            r0 = 14
            T(r0)
        Le:
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.k1()
            java.util.List r0 = r0.t()
            r1.m1(r2, r3, r0)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j
    public boolean m0() {
            r1 = this;
            boolean r0 = r1.E
            return r0
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.impl.i m1(@org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r12, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r13) {
            r10 = this;
            if (r11 != 0) goto L7
            r0 = 10
            T(r0)
        L7:
            if (r12 != 0) goto Le
            r0 = 11
            T(r0)
        Le:
            if (r13 != 0) goto L15
            r0 = 12
            T(r0)
        L15:
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r3 = r10.g1()
            java.util.List r4 = r10.f1()
            r7 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r8 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            r2 = 0
            r1 = r10
            r6 = r11
            r9 = r12
            r5 = r13
            super.M0(r2, r3, r4, r5, r6, r7, r8, r9)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.impl.n
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.n p0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = r1.a()
            return r0
    }
}
