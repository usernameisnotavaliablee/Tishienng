package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nErasureTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErasureTypeAttributes.kt\norg/jetbrains/kotlin/types/ErasureTypeAttributes\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class i0 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.TypeUsage a;

    @org.jetbrains.annotations.Nullable
    private final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.j1> b;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.types.e1 c;

    public i0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeUsage r2, @org.jetbrains.annotations.Nullable java.util.Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.j1> r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.e1 r4) {
            r1 = this;
            java.lang.String r0 = "howThisTypeIsUsed"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.types.e1 a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.TypeUsage b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.j1> c() {
            r1 = this;
            java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.j1> r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.i0 d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r4) {
            r3 = this;
            java.lang.String r0 = "typeParameter"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r0 = r3.b()
            java.util.Set r1 = r3.c()
            if (r1 == 0) goto L15
            java.util.Set r1 = kotlin.collections.u1.D(r1, r4)
            if (r1 != 0) goto L19
        L15:
            java.util.Set r1 = kotlin.collections.u1.f(r4)
        L19:
            kotlin.reflect.jvm.internal.impl.types.e1 r4 = r3.a()
            kotlin.reflect.jvm.internal.impl.types.i0 r2 = new kotlin.reflect.jvm.internal.impl.types.i0
            r2.<init>(r0, r1, r4)
            return r2
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.types.i0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlin.reflect.jvm.internal.impl.types.i0 r4 = (kotlin.reflect.jvm.internal.impl.types.i0) r4
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r4.a()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r3.a()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 == 0) goto L22
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r4 = r4.b()
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r0 = r3.b()
            if (r4 != r0) goto L22
            r4 = 1
            return r4
        L22:
            return r1
    }

    public int hashCode() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r3.a()
            if (r0 == 0) goto Lb
            int r0 = r0.hashCode()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r1 = r0 * 31
            kotlin.reflect.jvm.internal.impl.types.TypeUsage r2 = r3.b()
            int r2 = r2.hashCode()
            int r1 = r1 + r2
            int r0 = r0 + r1
            return r0
    }
}
