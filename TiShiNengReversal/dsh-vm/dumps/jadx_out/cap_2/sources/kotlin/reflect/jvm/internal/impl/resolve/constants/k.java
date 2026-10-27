package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nconstantValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 constantValues.kt\norg/jetbrains/kotlin/resolve/constants/EnumValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,320:1\n1#2:321\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class k extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<kotlin.Pair<? extends kotlin.reflect.jvm.internal.impl.name.b, ? extends kotlin.reflect.jvm.internal.impl.name.f>> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.b b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.f c;

    public k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3) {
            r1 = this;
            java.lang.String r0 = "enumClassId"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "enumEntryName"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.Pair r0 = kotlin.o0.a(r2, r3)
            r1.<init>(r0)
            r1.b = r2
            r1.c = r3
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.f b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = r1.c
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 getType(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r3) {
            r2 = this;
            java.lang.String r0 = "module"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.name.b r0 = r2.b
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = kotlin.reflect.jvm.internal.impl.descriptors.x.b(r3, r0)
            if (r3 == 0) goto L1e
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.i.A(r3)
            if (r0 == 0) goto L14
            goto L15
        L14:
            r3 = 0
        L15:
            if (r3 == 0) goto L1e
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r3.s()
            if (r3 == 0) goto L1e
            return r3
        L1e:
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r3 = kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.ERROR_ENUM_TYPE
            kotlin.reflect.jvm.internal.impl.name.b r0 = r2.b
            java.lang.String r0 = r0.toString()
            kotlin.reflect.jvm.internal.impl.name.f r1 = r2.c
            java.lang.String r1 = r1.toString()
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            kotlin.reflect.jvm.internal.impl.types.error.g r3 = kotlin.reflect.jvm.internal.impl.types.error.i.d(r3, r0)
            return r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.name.b r1 = r2.b
            kotlin.reflect.jvm.internal.impl.name.f r1 = r1.h()
            r0.append(r1)
            r1 = 46
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.name.f r1 = r2.c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
