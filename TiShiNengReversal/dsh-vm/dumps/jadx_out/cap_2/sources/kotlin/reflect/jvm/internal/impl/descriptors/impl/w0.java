package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class w0 extends kotlin.reflect.jvm.internal.impl.descriptors.impl.n implements kotlin.reflect.jvm.internal.impl.descriptors.s1 {
    static final /* synthetic */ boolean f = false;
    protected kotlin.reflect.jvm.internal.impl.types.t0 e;

    static {
            return
    }

    public w0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r4, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r6) {
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
            if (r6 != 0) goto L18
            r0 = 3
            T(r0)
        L18:
            r1.<init>(r2, r3, r4, r6)
            r1.e = r5
            return
    }

    private static /* synthetic */ void T(int r6) {
            switch(r6) {
                case 4: goto L6;
                case 5: goto L6;
                case 6: goto L6;
                case 7: goto L6;
                case 8: goto L6;
                case 9: goto L6;
                case 10: goto L6;
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
                case 4: goto Le;
                case 5: goto Le;
                case 6: goto Le;
                case 7: goto Le;
                case 8: goto Le;
                case 9: goto Le;
                case 10: goto Le;
                default: goto Lc;
            }
        Lc:
            r2 = 3
            goto Lf
        Le:
            r2 = 2
        Lf:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl"
            r4 = 0
            switch(r6) {
                case 1: goto L29;
                case 2: goto L24;
                case 3: goto L1f;
                case 4: goto L1c;
                case 5: goto L1c;
                case 6: goto L1c;
                case 7: goto L1c;
                case 8: goto L1c;
                case 9: goto L1c;
                case 10: goto L1c;
                default: goto L17;
            }
        L17:
            java.lang.String r5 = "containingDeclaration"
            r2[r4] = r5
            goto L2d
        L1c:
            r2[r4] = r3
            goto L2d
        L1f:
            java.lang.String r5 = "source"
            r2[r4] = r5
            goto L2d
        L24:
            java.lang.String r5 = "name"
            r2[r4] = r5
            goto L2d
        L29:
            java.lang.String r5 = "annotations"
            r2[r4] = r5
        L2d:
            r4 = 1
            switch(r6) {
                case 4: goto L52;
                case 5: goto L4d;
                case 6: goto L48;
                case 7: goto L43;
                case 8: goto L3e;
                case 9: goto L39;
                case 10: goto L34;
                default: goto L31;
            }
        L31:
            r2[r4] = r3
            goto L56
        L34:
            java.lang.String r3 = "getReturnType"
            r2[r4] = r3
            goto L56
        L39:
            java.lang.String r3 = "getContextReceiverParameters"
            r2[r4] = r3
            goto L56
        L3e:
            java.lang.String r3 = "getTypeParameters"
            r2[r4] = r3
            goto L56
        L43:
            java.lang.String r3 = "getOverriddenDescriptors"
            r2[r4] = r3
            goto L56
        L48:
            java.lang.String r3 = "getValueParameters"
            r2[r4] = r3
            goto L56
        L4d:
            java.lang.String r3 = "getOriginal"
            r2[r4] = r3
            goto L56
        L52:
            java.lang.String r3 = "getType"
            r2[r4] = r3
        L56:
            switch(r6) {
                case 4: goto L5d;
                case 5: goto L5d;
                case 6: goto L5d;
                case 7: goto L5d;
                case 8: goto L5d;
                case 9: goto L5d;
                case 10: goto L5d;
                default: goto L59;
            }
        L59:
            java.lang.String r3 = "<init>"
            r2[r1] = r3
        L5d:
            java.lang.String r0 = java.lang.String.format(r0, r2)
            switch(r6) {
                case 4: goto L6a;
                case 5: goto L6a;
                case 6: goto L6a;
                case 7: goto L6a;
                case 8: goto L6a;
                case 9: goto L6a;
                case 10: goto L6a;
                default: goto L64;
            }
        L64:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r0)
            goto L6f
        L6a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r0)
        L6f:
            throw r6
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> A0() {
            r2 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            if (r0 != 0) goto L9
            r1 = 9
            T(r1)
        L9:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.s1 E0() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.n r0 = super.p0()
            kotlin.reflect.jvm.internal.impl.descriptors.s1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.s1) r0
            if (r0 != 0) goto Lc
            r1 = 5
            T(r1)
        Lc:
            return r0
    }

    public void F0(kotlin.reflect.jvm.internal.impl.types.t0 r1) {
            r0 = this;
            r0.e = r1
            return
    }

    @org.jetbrains.annotations.Nullable
    public <V> V N(kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<V> r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.s1 r0 = r1.E0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.s1 r0 = r1.E0()
            return r0
    }

    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.l c(kotlin.reflect.jvm.internal.impl.types.h2 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.s1 r1 = r0.c(r1)
            return r1
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.z0 c0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> e() {
            r2 = this;
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            if (r0 != 0) goto L8
            r1 = 7
            T(r1)
        L8:
            return r0
    }

    public kotlin.reflect.jvm.internal.impl.descriptors.z0 f0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.q1> g() {
            r2 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            if (r0 != 0) goto L8
            r1 = 6
            T(r1)
        L8:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 getReturnType() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.getType()
            if (r0 != 0) goto Lb
            r1 = 10
            T(r1)
        Lb:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 getType() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.e
            if (r0 != 0) goto L8
            r1 = 4
            T(r1)
        L8:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> getTypeParameters() {
            r2 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            if (r0 != 0) goto L9
            r1 = 8
            T(r1)
        L9:
            return r0
    }

    public boolean isConst() {
            r1 = this;
            r0 = 0
            return r0
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
            kotlin.reflect.jvm.internal.impl.descriptors.s1 r0 = r1.E0()
            return r0
    }
}
