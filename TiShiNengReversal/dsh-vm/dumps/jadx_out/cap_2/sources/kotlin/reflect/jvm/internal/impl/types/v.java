package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class v extends kotlin.reflect.jvm.internal.impl.types.b {
    private final kotlin.reflect.jvm.internal.impl.descriptors.d d;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> e;
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> f;

    public v(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r2, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r3, @org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r5) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 0
            H(r0)
        L6:
            if (r3 != 0) goto Lc
            r0 = 1
            H(r0)
        Lc:
            if (r4 != 0) goto L12
            r0 = 2
            H(r0)
        L12:
            if (r5 != 0) goto L18
            r0 = 3
            H(r0)
        L18:
            r1.<init>(r5)
            r1.d = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.e = r2
            java.util.Collection r2 = java.util.Collections.unmodifiableCollection(r4)
            r1.f = r2
            return
    }

    private static /* synthetic */ void H(int r10) {
            r0 = 7
            r1 = 6
            r2 = 5
            r3 = 4
            if (r10 == r3) goto Lf
            if (r10 == r2) goto Lf
            if (r10 == r1) goto Lf
            if (r10 == r0) goto Lf
            java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L11
        Lf:
            java.lang.String r4 = "@NotNull method %s.%s must not return null"
        L11:
            r5 = 2
            if (r10 == r3) goto L1c
            if (r10 == r2) goto L1c
            if (r10 == r1) goto L1c
            if (r10 == r0) goto L1c
            r6 = 3
            goto L1d
        L1c:
            r6 = 2
        L1d:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl"
            r8 = 0
            switch(r10) {
                case 1: goto L37;
                case 2: goto L32;
                case 3: goto L2d;
                case 4: goto L2a;
                case 5: goto L2a;
                case 6: goto L2a;
                case 7: goto L2a;
                default: goto L25;
            }
        L25:
            java.lang.String r9 = "classDescriptor"
            r6[r8] = r9
            goto L3b
        L2a:
            r6[r8] = r7
            goto L3b
        L2d:
            java.lang.String r9 = "storageManager"
            r6[r8] = r9
            goto L3b
        L32:
            java.lang.String r9 = "supertypes"
            r6[r8] = r9
            goto L3b
        L37:
            java.lang.String r9 = "parameters"
            r6[r8] = r9
        L3b:
            r8 = 1
            if (r10 == r3) goto L56
            if (r10 == r2) goto L51
            if (r10 == r1) goto L4c
            if (r10 == r0) goto L47
            r6[r8] = r7
            goto L5a
        L47:
            java.lang.String r7 = "getSupertypeLoopChecker"
            r6[r8] = r7
            goto L5a
        L4c:
            java.lang.String r7 = "computeSupertypes"
            r6[r8] = r7
            goto L5a
        L51:
            java.lang.String r7 = "getDeclarationDescriptor"
            r6[r8] = r7
            goto L5a
        L56:
            java.lang.String r7 = "getParameters"
            r6[r8] = r7
        L5a:
            if (r10 == r3) goto L66
            if (r10 == r2) goto L66
            if (r10 == r1) goto L66
            if (r10 == r0) goto L66
            java.lang.String r7 = "<init>"
            r6[r5] = r7
        L66:
            java.lang.String r4 = java.lang.String.format(r4, r6)
            if (r10 == r3) goto L78
            if (r10 == r2) goto L78
            if (r10 == r1) goto L78
            if (r10 == r0) goto L78
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r4)
            goto L7d
        L78:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r4)
        L7d:
            throw r10
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d I() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.d
            if (r0 != 0) goto L8
            r1 = 5
            H(r1)
        L8:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.b, kotlin.reflect.jvm.internal.impl.types.w, kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.I()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    public boolean d() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> getParameters() {
            r2 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> r0 = r2.e
            if (r0 != 0) goto L8
            r1 = 4
            H(r1)
        L8:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    @org.jetbrains.annotations.NotNull
    protected java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> r() {
            r2 = this;
            java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> r0 = r2.f
            if (r0 != 0) goto L8
            r1 = 6
            H(r1)
        L8:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.d
            kotlin.reflect.jvm.internal.impl.name.d r0 = kotlin.reflect.jvm.internal.impl.resolve.i.m(r0)
            java.lang.String r0 = r0.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.descriptors.h1 v() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.h1$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.h1.a.a
            if (r0 != 0) goto L8
            r1 = 7
            H(r1)
        L8:
            return r0
    }
}
