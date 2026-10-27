package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class c extends kotlin.reflect.jvm.internal.impl.descriptors.impl.m implements kotlin.reflect.jvm.internal.impl.descriptors.z0 {
    public c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 0
            T(r0)
        L6:
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.h.i
            r1.<init>(r2, r0)
            return
    }

    public c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 1
            T(r0)
        L6:
            if (r3 != 0) goto Lc
            r0 = 2
            T(r0)
        Lc:
            r1.<init>(r2, r3)
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
                case 11: goto L6;
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
                case 11: goto Le;
                default: goto Lc;
            }
        Lc:
            r2 = 3
            goto Lf
        Le:
            r2 = 2
        Lf:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor"
            r4 = 0
            switch(r6) {
                case 2: goto L24;
                case 3: goto L1f;
                case 4: goto L1c;
                case 5: goto L1c;
                case 6: goto L1c;
                case 7: goto L1c;
                case 8: goto L1c;
                case 9: goto L1c;
                case 10: goto L1c;
                case 11: goto L1c;
                default: goto L17;
            }
        L17:
            java.lang.String r5 = "annotations"
            r2[r4] = r5
            goto L28
        L1c:
            r2[r4] = r3
            goto L28
        L1f:
            java.lang.String r5 = "substitutor"
            r2[r4] = r5
            goto L28
        L24:
            java.lang.String r5 = "name"
            r2[r4] = r5
        L28:
            r4 = 1
            switch(r6) {
                case 4: goto L52;
                case 5: goto L4d;
                case 6: goto L48;
                case 7: goto L43;
                case 8: goto L3e;
                case 9: goto L39;
                case 10: goto L34;
                case 11: goto L2f;
                default: goto L2c;
            }
        L2c:
            r2[r4] = r3
            goto L56
        L2f:
            java.lang.String r3 = "getSource"
            r2[r4] = r3
            goto L56
        L34:
            java.lang.String r3 = "getOriginal"
            r2[r4] = r3
            goto L56
        L39:
            java.lang.String r3 = "getVisibility"
            r2[r4] = r3
            goto L56
        L3e:
            java.lang.String r3 = "getOverriddenDescriptors"
            r2[r4] = r3
            goto L56
        L43:
            java.lang.String r3 = "getValueParameters"
            r2[r4] = r3
            goto L56
        L48:
            java.lang.String r3 = "getType"
            r2[r4] = r3
            goto L56
        L4d:
            java.lang.String r3 = "getTypeParameters"
            r2[r4] = r3
            goto L56
        L52:
            java.lang.String r3 = "getContextReceiverParameters"
            r2[r4] = r3
        L56:
            switch(r6) {
                case 3: goto L5e;
                case 4: goto L62;
                case 5: goto L62;
                case 6: goto L62;
                case 7: goto L62;
                case 8: goto L62;
                case 9: goto L62;
                case 10: goto L62;
                case 11: goto L62;
                default: goto L59;
            }
        L59:
            java.lang.String r3 = "<init>"
            r2[r1] = r3
            goto L62
        L5e:
            java.lang.String r3 = "substitute"
            r2[r1] = r3
        L62:
            java.lang.String r0 = java.lang.String.format(r0, r2)
            switch(r6) {
                case 4: goto L6f;
                case 5: goto L6f;
                case 6: goto L6f;
                case 7: goto L6f;
                case 8: goto L6f;
                case 9: goto L6f;
                case 10: goto L6f;
                case 11: goto L6f;
                default: goto L69;
            }
        L69:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r0)
            goto L74
        L6f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r0)
        L74:
            throw r6
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.z0> A0() {
            r2 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            if (r0 != 0) goto L8
            r1 = 4
            T(r1)
        L8:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.Nullable
    public <V> V N(kotlin.reflect.jvm.internal.impl.descriptors.a.InterfaceC0029a<V> r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R W(kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> r1, D r2) {
            r0 = this;
            java.lang.Object r1 = r1.g(r0, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r0 = r1.p0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.t0 r0 = r1.p0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g1
    @org.jetbrains.annotations.Nullable
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.l c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r1 = r0.c(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.z0, kotlin.reflect.jvm.internal.impl.descriptors.g1
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.z0 c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r4) {
            r3 = this;
            if (r4 != 0) goto L6
            r0 = 3
            T(r0)
        L6:
            boolean r0 = r4.k()
            if (r0 == 0) goto Ld
            goto L34
        Ld:
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r3.b()
            boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r0 == 0) goto L20
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r3.getType()
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.p(r0, r1)
            goto L2a
        L20:
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r3.getType()
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = r4.p(r0, r1)
        L2a:
            if (r4 != 0) goto L2e
            r4 = 0
            return r4
        L2e:
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r3.getType()
            if (r4 != r0) goto L35
        L34:
            return r3
        L35:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.n0 r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.n0
            kotlin.reflect.jvm.internal.impl.descriptors.k r1 = r3.b()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.k r2 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.k
            r2.<init>(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r3.getAnnotations()
            r0.<init>(r1, r2, r4)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.z0 c0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a> e() {
            r2 = this;
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            if (r0 != 0) goto L9
            r1 = 8
            T(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.Nullable
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
            r1 = 7
            T(r1)
        L8:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.types.t0 getReturnType() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.getType()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.e1 getSource() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r0 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            if (r0 != 0) goto L9
            r1 = 11
            T(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 getType() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r0 = r2.getValue()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.getType()
            if (r0 != 0) goto Le
            r1 = 6
            T(r1)
        Le:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> getTypeParameters() {
            r2 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            if (r0 != 0) goto L8
            r1 = 5
            T(r1)
        L8:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = kotlin.reflect.jvm.internal.impl.descriptors.r.f
            if (r0 != 0) goto L9
            r1 = 9
            T(r1)
        L9:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.a
    public boolean n0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.t0 p0() {
            r0 = this;
            return r0
    }
}
