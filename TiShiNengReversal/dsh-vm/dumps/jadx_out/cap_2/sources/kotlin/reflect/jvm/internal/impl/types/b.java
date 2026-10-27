package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class b extends kotlin.reflect.jvm.internal.impl.types.q {
    public b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 0
            H(r0)
        L6:
            r1.<init>(r2)
            return
    }

    private static /* synthetic */ void H(int r9) {
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = 3
            goto L18
        L17:
            r5 = 2
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
    }

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.d I();

    @Override // kotlin.reflect.jvm.internal.impl.types.w, kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.NotNull
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.I()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w
    protected boolean g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 2
            H(r0)
        L6:
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r0 == 0) goto L16
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.I()
            boolean r2 = r1.e(r0, r2)
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.builtins.j p() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.I()
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.e.m(r0)
            if (r0 != 0) goto Le
            r1 = 1
            H(r1)
        Le:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    @org.jetbrains.annotations.Nullable
    protected kotlin.reflect.jvm.internal.impl.types.t0 s() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r1.I()
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.j.v0(r0)
            if (r0 == 0) goto Lc
            r0 = 0
            return r0
        Lc:
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = r1.p()
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.i()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q
    @org.jetbrains.annotations.NotNull
    protected java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> t(boolean r4) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r3.I()
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = r0.b()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r1 != 0) goto L15
            java.util.List r4 = java.util.Collections.EMPTY_LIST
            if (r4 != 0) goto L14
            r0 = 3
            H(r0)
        L14:
            return r4
        L15:
            kotlin.reflect.jvm.internal.impl.utils.j r1 = new kotlin.reflect.jvm.internal.impl.utils.j
            r1.<init>()
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r0.s()
            r1.add(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r0.s0()
            if (r4 == 0) goto L32
            if (r0 == 0) goto L32
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r0.s()
            r1.add(r4)
        L32:
            return r1
    }
}
