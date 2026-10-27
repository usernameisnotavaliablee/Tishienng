package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class k extends kotlin.reflect.jvm.internal.impl.descriptors.impl.j {
    static final /* synthetic */ boolean p = false;
    private final kotlin.reflect.jvm.internal.impl.descriptors.Modality j;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind k;
    private final kotlin.reflect.jvm.internal.impl.types.w1 l;
    private kotlin.reflect.jvm.internal.impl.resolve.scopes.k m;
    private java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.c> n;
    private kotlin.reflect.jvm.internal.impl.descriptors.c o;

    static {
            return
    }

    public k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Modality r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r11, @org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r13, boolean r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r15) {
            r7 = this;
            if (r8 != 0) goto L6
            r0 = 0
            p0(r0)
        L6:
            if (r9 != 0) goto Lc
            r0 = 1
            p0(r0)
        Lc:
            if (r10 != 0) goto L12
            r0 = 2
            p0(r0)
        L12:
            if (r11 != 0) goto L18
            r0 = 3
            p0(r0)
        L18:
            if (r12 != 0) goto L1e
            r0 = 4
            p0(r0)
        L1e:
            if (r13 != 0) goto L24
            r0 = 5
            p0(r0)
        L24:
            if (r15 != 0) goto L2a
            r0 = 6
            p0(r0)
        L2a:
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r13
            r6 = r14
            r2 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r1.j = r10
            r1.k = r11
            kotlin.reflect.jvm.internal.impl.types.v r8 = new kotlin.reflect.jvm.internal.impl.types.v
            java.util.List r9 = java.util.Collections.EMPTY_LIST
            r8.<init>(r7, r9, r12, r2)
            r1.l = r8
            return
    }

    private static /* synthetic */ void p0(int r6) {
            switch(r6) {
                case 9: goto L6;
                case 10: goto L6;
                case 11: goto L6;
                case 12: goto L3;
                case 13: goto L6;
                case 14: goto L6;
                case 15: goto L6;
                case 16: goto L6;
                case 17: goto L6;
                case 18: goto L6;
                case 19: goto L6;
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
                case 9: goto Le;
                case 10: goto Le;
                case 11: goto Le;
                case 12: goto Lc;
                case 13: goto Le;
                case 14: goto Le;
                case 15: goto Le;
                case 16: goto Le;
                case 17: goto Le;
                case 18: goto Le;
                case 19: goto Le;
                default: goto Lc;
            }
        Lc:
            r2 = 3
            goto Lf
        Le:
            r2 = 2
        Lf:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorImpl"
            r4 = 0
            switch(r6) {
                case 1: goto L47;
                case 2: goto L42;
                case 3: goto L3d;
                case 4: goto L38;
                case 5: goto L33;
                case 6: goto L2e;
                case 7: goto L29;
                case 8: goto L24;
                case 9: goto L21;
                case 10: goto L21;
                case 11: goto L21;
                case 12: goto L1c;
                case 13: goto L21;
                case 14: goto L21;
                case 15: goto L21;
                case 16: goto L21;
                case 17: goto L21;
                case 18: goto L21;
                case 19: goto L21;
                default: goto L17;
            }
        L17:
            java.lang.String r5 = "containingDeclaration"
            r2[r4] = r5
            goto L4b
        L1c:
            java.lang.String r5 = "kotlinTypeRefiner"
            r2[r4] = r5
            goto L4b
        L21:
            r2[r4] = r3
            goto L4b
        L24:
            java.lang.String r5 = "constructors"
            r2[r4] = r5
            goto L4b
        L29:
            java.lang.String r5 = "unsubstitutedMemberScope"
            r2[r4] = r5
            goto L4b
        L2e:
            java.lang.String r5 = "storageManager"
            r2[r4] = r5
            goto L4b
        L33:
            java.lang.String r5 = "source"
            r2[r4] = r5
            goto L4b
        L38:
            java.lang.String r5 = "supertypes"
            r2[r4] = r5
            goto L4b
        L3d:
            java.lang.String r5 = "kind"
            r2[r4] = r5
            goto L4b
        L42:
            java.lang.String r5 = "modality"
            r2[r4] = r5
            goto L4b
        L47:
            java.lang.String r5 = "name"
            r2[r4] = r5
        L4b:
            java.lang.String r4 = "getUnsubstitutedMemberScope"
            r5 = 1
            switch(r6) {
                case 9: goto L7f;
                case 10: goto L7a;
                case 11: goto L75;
                case 12: goto L51;
                case 13: goto L72;
                case 14: goto L6d;
                case 15: goto L68;
                case 16: goto L63;
                case 17: goto L5e;
                case 18: goto L59;
                case 19: goto L54;
                default: goto L51;
            }
        L51:
            r2[r5] = r3
            goto L83
        L54:
            java.lang.String r3 = "getSealedSubclasses"
            r2[r5] = r3
            goto L83
        L59:
            java.lang.String r3 = "getDeclaredTypeParameters"
            r2[r5] = r3
            goto L83
        L5e:
            java.lang.String r3 = "getVisibility"
            r2[r5] = r3
            goto L83
        L63:
            java.lang.String r3 = "getModality"
            r2[r5] = r3
            goto L83
        L68:
            java.lang.String r3 = "getKind"
            r2[r5] = r3
            goto L83
        L6d:
            java.lang.String r3 = "getStaticScope"
            r2[r5] = r3
            goto L83
        L72:
            r2[r5] = r4
            goto L83
        L75:
            java.lang.String r3 = "getConstructors"
            r2[r5] = r3
            goto L83
        L7a:
            java.lang.String r3 = "getTypeConstructor"
            r2[r5] = r3
            goto L83
        L7f:
            java.lang.String r3 = "getAnnotations"
            r2[r5] = r3
        L83:
            switch(r6) {
                case 7: goto L8e;
                case 8: goto L8e;
                case 9: goto L92;
                case 10: goto L92;
                case 11: goto L92;
                case 12: goto L8b;
                case 13: goto L92;
                case 14: goto L92;
                case 15: goto L92;
                case 16: goto L92;
                case 17: goto L92;
                case 18: goto L92;
                case 19: goto L92;
                default: goto L86;
            }
        L86:
            java.lang.String r3 = "<init>"
            r2[r1] = r3
            goto L92
        L8b:
            r2[r1] = r4
            goto L92
        L8e:
            java.lang.String r3 = "initialize"
            r2[r1] = r3
        L92:
            java.lang.String r0 = java.lang.String.format(r0, r2)
            switch(r6) {
                case 9: goto L9f;
                case 10: goto L9f;
                case 11: goto L9f;
                case 12: goto L99;
                case 13: goto L9f;
                case 14: goto L9f;
                case 15: goto L9f;
                case 16: goto L9f;
                case 17: goto L9f;
                case 18: goto L9f;
                case 19: goto L9f;
                default: goto L99;
            }
        L99:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r0)
            goto La4
        L9f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r0)
        La4:
            throw r6
    }

    public final void F0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2, @org.jetbrains.annotations.NotNull java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.c> r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.c r4) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 7
            p0(r0)
        L6:
            if (r3 != 0) goto Ld
            r0 = 8
            p0(r0)
        Ld:
            r1.m = r2
            r1.n = r3
            r1.o = r4
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.c> f() {
            r2 = this;
            java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.c> r0 = r2.n
            if (r0 != 0) goto L9
            r1 = 11
            p0(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.o1<kotlin.reflect.jvm.internal.impl.types.e1> g0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.b()
            if (r0 != 0) goto Ld
            r1 = 9
            p0(r1)
        Ld:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.c0, kotlin.reflect.jvm.internal.impl.descriptors.o
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = kotlin.reflect.jvm.internal.impl.descriptors.r.e
            if (r0 != 0) goto L9
            r1 = 17
            p0(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassKind h() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = r2.k
            if (r0 != 0) goto L9
            r1 = 15
            p0(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.c0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.Modality i() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r2.j
            if (r0 != 0) goto L9
            r1 = 16
            p0(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean i0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean isInline() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g
    public boolean k() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean l0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.w1 o() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r2.l
            if (r0 != 0) goto L9
            r1 = 10
            p0(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k o0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r2 = 12
            p0(r2)
        L7:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r2 = r1.m
            if (r2 != 0) goto L10
            r0 = 13
            p0(r0)
        L10:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean q0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k$c r0 = kotlin.reflect.jvm.internal.impl.resolve.scopes.k.c.b
            if (r0 != 0) goto L9
            r1 = 14
            p0(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.d s0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.g
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> t() {
            r2 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            if (r0 != 0) goto L9
            r1 = 18
            p0(r1)
        L9:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "class "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.name.f r1 = r2.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean u() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean v() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public boolean w() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    public kotlin.reflect.jvm.internal.impl.descriptors.c z() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = r1.o
            return r0
    }
}
