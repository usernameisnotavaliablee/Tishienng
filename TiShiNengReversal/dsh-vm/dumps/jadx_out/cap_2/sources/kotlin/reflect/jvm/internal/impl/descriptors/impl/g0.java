package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class g0 extends kotlin.reflect.jvm.internal.impl.descriptors.impl.j {
    static final /* synthetic */ boolean r = false;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind j;
    private final boolean k;
    private kotlin.reflect.jvm.internal.impl.descriptors.Modality l;
    private kotlin.reflect.jvm.internal.impl.descriptors.s m;
    private kotlin.reflect.jvm.internal.impl.types.w1 n;
    private java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> o;
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> p;
    private final kotlin.reflect.jvm.internal.impl.storage.n q;

    static {
            return
    }

    public g0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r9, boolean r10, boolean r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r14) {
            r7 = this;
            if (r8 != 0) goto L6
            r0 = 0
            p0(r0)
        L6:
            if (r9 != 0) goto Lc
            r0 = 1
            p0(r0)
        Lc:
            if (r12 != 0) goto L12
            r0 = 2
            p0(r0)
        L12:
            if (r13 != 0) goto L18
            r0 = 3
            p0(r0)
        L18:
            if (r14 != 0) goto L1e
            r0 = 4
            p0(r0)
        L1e:
            r1 = r7
            r3 = r8
            r6 = r11
            r4 = r12
            r5 = r13
            r2 = r14
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r1.p = r8
            r1.q = r2
            r1.j = r9
            r1.k = r10
            return
    }

    private static /* synthetic */ void p0(int r6) {
            switch(r6) {
                case 5: goto L6;
                case 6: goto L3;
                case 7: goto L6;
                case 8: goto L6;
                case 9: goto L3;
                case 10: goto L6;
                case 11: goto L6;
                case 12: goto L3;
                case 13: goto L6;
                case 14: goto L3;
                case 15: goto L6;
                case 16: goto L3;
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
                case 5: goto Le;
                case 6: goto Lc;
                case 7: goto Le;
                case 8: goto Le;
                case 9: goto Lc;
                case 10: goto Le;
                case 11: goto Le;
                case 12: goto Lc;
                case 13: goto Le;
                case 14: goto Lc;
                case 15: goto Le;
                case 16: goto Lc;
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
            java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/MutableClassDescriptor"
            r4 = 0
            switch(r6) {
                case 1: goto L47;
                case 2: goto L42;
                case 3: goto L3d;
                case 4: goto L38;
                case 5: goto L35;
                case 6: goto L30;
                case 7: goto L35;
                case 8: goto L35;
                case 9: goto L2b;
                case 10: goto L35;
                case 11: goto L35;
                case 12: goto L26;
                case 13: goto L35;
                case 14: goto L21;
                case 15: goto L35;
                case 16: goto L1c;
                case 17: goto L35;
                case 18: goto L35;
                case 19: goto L35;
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
            java.lang.String r5 = "typeParameters"
            r2[r4] = r5
            goto L4b
        L26:
            java.lang.String r5 = "supertype"
            r2[r4] = r5
            goto L4b
        L2b:
            java.lang.String r5 = "visibility"
            r2[r4] = r5
            goto L4b
        L30:
            java.lang.String r5 = "modality"
            r2[r4] = r5
            goto L4b
        L35:
            r2[r4] = r3
            goto L4b
        L38:
            java.lang.String r5 = "storageManager"
            r2[r4] = r5
            goto L4b
        L3d:
            java.lang.String r5 = "source"
            r2[r4] = r5
            goto L4b
        L42:
            java.lang.String r5 = "name"
            r2[r4] = r5
            goto L4b
        L47:
            java.lang.String r5 = "kind"
            r2[r4] = r5
        L4b:
            java.lang.String r4 = "getUnsubstitutedMemberScope"
            r5 = 1
            switch(r6) {
                case 5: goto L7f;
                case 6: goto L51;
                case 7: goto L7a;
                case 8: goto L75;
                case 9: goto L51;
                case 10: goto L70;
                case 11: goto L6b;
                case 12: goto L51;
                case 13: goto L66;
                case 14: goto L51;
                case 15: goto L61;
                case 16: goto L51;
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
            java.lang.String r3 = "getStaticScope"
            r2[r5] = r3
            goto L83
        L5e:
            r2[r5] = r4
            goto L83
        L61:
            java.lang.String r3 = "getDeclaredTypeParameters"
            r2[r5] = r3
            goto L83
        L66:
            java.lang.String r3 = "getConstructors"
            r2[r5] = r3
            goto L83
        L6b:
            java.lang.String r3 = "getTypeConstructor"
            r2[r5] = r3
            goto L83
        L70:
            java.lang.String r3 = "getVisibility"
            r2[r5] = r3
            goto L83
        L75:
            java.lang.String r3 = "getKind"
            r2[r5] = r3
            goto L83
        L7a:
            java.lang.String r3 = "getModality"
            r2[r5] = r3
            goto L83
        L7f:
            java.lang.String r3 = "getAnnotations"
            r2[r5] = r3
        L83:
            switch(r6) {
                case 5: goto La1;
                case 6: goto L9d;
                case 7: goto La1;
                case 8: goto La1;
                case 9: goto L98;
                case 10: goto La1;
                case 11: goto La1;
                case 12: goto L93;
                case 13: goto La1;
                case 14: goto L8e;
                case 15: goto La1;
                case 16: goto L8b;
                case 17: goto La1;
                case 18: goto La1;
                case 19: goto La1;
                default: goto L86;
            }
        L86:
            java.lang.String r3 = "<init>"
            r2[r1] = r3
            goto La1
        L8b:
            r2[r1] = r4
            goto La1
        L8e:
            java.lang.String r3 = "setTypeParameterDescriptors"
            r2[r1] = r3
            goto La1
        L93:
            java.lang.String r3 = "addSupertype"
            r2[r1] = r3
            goto La1
        L98:
            java.lang.String r3 = "setVisibility"
            r2[r1] = r3
            goto La1
        L9d:
            java.lang.String r3 = "setModality"
            r2[r1] = r3
        La1:
            java.lang.String r0 = java.lang.String.format(r0, r2)
            switch(r6) {
                case 5: goto Lae;
                case 6: goto La8;
                case 7: goto Lae;
                case 8: goto Lae;
                case 9: goto La8;
                case 10: goto Lae;
                case 11: goto Lae;
                case 12: goto La8;
                case 13: goto Lae;
                case 14: goto La8;
                case 15: goto Lae;
                case 16: goto La8;
                case 17: goto Lae;
                case 18: goto Lae;
                case 19: goto Lae;
                default: goto La8;
            }
        La8:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r0)
            goto Lb3
        Lae:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r0)
        Lb3:
            throw r6
    }

    public void F0() {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.types.v r0 = new kotlin.reflect.jvm.internal.impl.types.v
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r1 = r4.o
            java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> r2 = r4.p
            kotlin.reflect.jvm.internal.impl.storage.n r3 = r4.q
            r0.<init>(r4, r1, r2, r3)
            r4.n = r0
            java.util.Set r0 = r4.G0()
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.y r1 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r1
            kotlin.reflect.jvm.internal.impl.descriptors.impl.i r1 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.i) r1
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r4.s()
            r1.b1(r2)
            goto L15
        L2b:
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.c> G0() {
            r2 = this;
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            if (r0 != 0) goto L9
            r1 = 13
            p0(r1)
        L9:
            return r0
    }

    public void H0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Modality r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 6
            p0(r0)
        L6:
            r1.l = r2
            return
    }

    public void I0(@org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r3) {
            r2 = this;
            if (r3 != 0) goto L7
            r0 = 14
            p0(r0)
        L7:
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r0 = r2.o
            if (r0 != 0) goto L13
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r3)
            r2.o = r0
            return
        L13:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Type parameters are already set for "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.name.f r1 = r2.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public void J0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r0 = 9
            p0(r0)
        L7:
            r1.m = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ java.util.Collection f() {
            r1 = this;
            java.util.Set r0 = r1.G0()
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
            if (r0 != 0) goto Lc
            r1 = 5
            p0(r1)
        Lc:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.c0, kotlin.reflect.jvm.internal.impl.descriptors.o
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = r2.m
            if (r0 != 0) goto L9
            r1 = 10
            p0(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassKind h() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = r2.j
            if (r0 != 0) goto L9
            r1 = 8
            p0(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.descriptors.c0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.Modality i() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r2.l
            if (r0 != 0) goto L8
            r1 = 7
            p0(r1)
        L8:
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
            boolean r0 = r1.k
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
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r2.n
            if (r0 != 0) goto L9
            r1 = 11
            p0(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.z
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k o0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r2 = 16
            p0(r2)
        L7:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k$c r2 = kotlin.reflect.jvm.internal.impl.resolve.scopes.k.c.b
            if (r2 != 0) goto L10
            r0 = 17
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
            r1 = 18
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
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r0 = r2.o
            if (r0 != 0) goto L9
            r1 = 15
            p0(r1)
        L9:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = kotlin.reflect.jvm.internal.impl.descriptors.impl.m.o0(r1)
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
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.c z() {
            r1 = this;
            r0 = 0
            return r0
    }
}
