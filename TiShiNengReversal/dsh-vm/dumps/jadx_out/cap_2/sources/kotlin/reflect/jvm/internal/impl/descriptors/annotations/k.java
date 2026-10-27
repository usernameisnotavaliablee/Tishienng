package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class k implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.c {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.builtins.j a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.c b;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> c;
    private final boolean d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s e;

    public k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.j r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r3, @org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r4, boolean r5) {
            r1 = this;
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "allValueArguments"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            kotlin.LazyThreadSafetyMode r2 = kotlin.LazyThreadSafetyMode.PUBLICATION
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.j r3 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.j
            r3.<init>(r1)
            kotlin.s r2 = kotlin.t.b(r2, r3)
            r1.e = r2
            return
    }

    public /* synthetic */ k(kotlin.reflect.jvm.internal.impl.builtins.j r1, kotlin.reflect.jvm.internal.impl.name.c r2, java.util.Map r3, boolean r4, int r5, kotlin.jvm.internal.v r6) {
            r0 = this;
            r5 = r5 & 8
            if (r5 == 0) goto L5
            r4 = 0
        L5:
            r0.<init>(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.e1 b(kotlin.reflect.jvm.internal.impl.descriptors.annotations.k r0) {
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = c(r0)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.types.e1 c(kotlin.reflect.jvm.internal.impl.descriptors.annotations.k r1) {
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = r1.a
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.d()
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r0.p(r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r1.s()
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @org.jetbrains.annotations.NotNull
    public java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
            r1 = this;
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> r0 = r1.c
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.name.c d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r1.b
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.e1 getSource() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r0 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            java.lang.String r1 = "NO_SOURCE"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 getType() {
            r2 = this;
            kotlin.s r0 = r2.e
            java.lang.Object r0 = r0.getValue()
            java.lang.String r1 = "getValue(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
            return r0
    }
}
