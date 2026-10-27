package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class x0 extends kotlin.reflect.jvm.internal.impl.descriptors.impl.w0 {
    static final /* synthetic */ boolean j = false;
    private final boolean g;
    protected kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> h;
    protected kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> i;

    static {
            return
    }

    public x0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r10, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r11, boolean r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r13) {
            r7 = this;
            if (r8 != 0) goto L6
            r0 = 0
            T(r0)
        L6:
            if (r9 != 0) goto Lc
            r0 = 1
            T(r0)
        Lc:
            if (r10 != 0) goto L12
            r0 = 2
            T(r0)
        L12:
            if (r13 != 0) goto L18
            r0 = 3
            T(r0)
        L18:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            r1.g = r12
            return
    }

    private static /* synthetic */ void T(int r7) {
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 5
            r3 = 4
            r4 = 2
            r5 = 0
            r6 = 1
            if (r7 == r6) goto L26
            if (r7 == r4) goto L21
            if (r7 == r0) goto L1c
            if (r7 == r3) goto L17
            if (r7 == r2) goto L17
            java.lang.String r0 = "containingDeclaration"
            r1[r5] = r0
            goto L2a
        L17:
            java.lang.String r0 = "compileTimeInitializerFactory"
            r1[r5] = r0
            goto L2a
        L1c:
            java.lang.String r0 = "source"
            r1[r5] = r0
            goto L2a
        L21:
            java.lang.String r0 = "name"
            r1[r5] = r0
            goto L2a
        L26:
            java.lang.String r0 = "annotations"
            r1[r5] = r0
        L2a:
            java.lang.String r0 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl"
            r1[r6] = r0
            if (r7 == r3) goto L3c
            if (r7 == r2) goto L37
            java.lang.String r7 = "<init>"
            r1[r4] = r7
            goto L40
        L37:
            java.lang.String r7 = "setCompileTimeInitializer"
            r1[r4] = r7
            goto L40
        L3c:
            java.lang.String r7 = "setCompileTimeInitializerFactory"
            r1[r4] = r7
        L40:
            java.lang.String r7 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r7 = java.lang.String.format(r7, r1)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r7)
            throw r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.s1
    public boolean C() {
            r1 = this;
            boolean r0 = r1.g
            return r0
    }

    public void G0(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> r3) {
            r1 = this;
            if (r3 != 0) goto L6
            r0 = 5
            T(r0)
        L6:
            r1.i = r3
            if (r2 == 0) goto Lb
            goto L11
        Lb:
            java.lang.Object r2 = r3.invoke()
            kotlin.reflect.jvm.internal.impl.storage.j r2 = (kotlin.reflect.jvm.internal.impl.storage.j) r2
        L11:
            r1.h = r2
            return
    }

    public void H0(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> r2) {
            r1 = this;
            if (r2 != 0) goto L6
            r0 = 4
            T(r0)
        L6:
            r0 = 0
            r1.G0(r0, r2)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.s1
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> t0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r0 = r1.h
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r0 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }
}
