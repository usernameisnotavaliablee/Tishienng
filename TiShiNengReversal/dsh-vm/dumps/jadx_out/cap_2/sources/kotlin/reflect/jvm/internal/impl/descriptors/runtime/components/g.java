package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReflectKotlinClassFinder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectKotlinClassFinder.kt\norg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClassFinder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g implements kotlin.reflect.jvm.internal.impl.load.kotlin.v {

    @org.jetbrains.annotations.NotNull
    private final java.lang.ClassLoader a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d b;

    public g(@org.jetbrains.annotations.NotNull java.lang.ClassLoader r2) {
            r1 = this;
            java.lang.String r0 = "classLoader"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d r2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d
            r2.<init>()
            r1.b = r2
            return
    }

    private final kotlin.reflect.jvm.internal.impl.load.kotlin.v.a d(java.lang.String r4) {
            r3 = this;
            java.lang.ClassLoader r0 = r3.a
            java.lang.Class r4 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.e.a(r0, r4)
            r0 = 0
            if (r4 == 0) goto L18
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f$a r1 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f.c
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f r4 = r1.a(r4)
            if (r4 == 0) goto L18
            kotlin.reflect.jvm.internal.impl.load.kotlin.v$a$b r1 = new kotlin.reflect.jvm.internal.impl.load.kotlin.v$a$b
            r2 = 2
            r1.<init>(r4, r0, r2, r0)
            return r1
        L18:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.v
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.load.kotlin.v.a a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.b r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r3) {
            r1 = this;
            java.lang.String r0 = "classId"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "metadataVersion"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r2 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.h.a(r2)
            kotlin.reflect.jvm.internal.impl.load.kotlin.v$a r2 = r1.d(r2)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.v
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.load.kotlin.v.a b(@org.jetbrains.annotations.NotNull x3.g r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.c r3) {
            r1 = this;
            java.lang.String r0 = "javaClass"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "metadataVersion"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.name.c r2 = r2.d()
            if (r2 == 0) goto L1c
            java.lang.String r2 = r2.a()
            if (r2 != 0) goto L17
            goto L1c
        L17:
            kotlin.reflect.jvm.internal.impl.load.kotlin.v$a r2 = r1.d(r2)
            return r2
        L1c:
            r2 = 0
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.z
    @org.jetbrains.annotations.Nullable
    public java.io.InputStream c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r3) {
            r2 = this;
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.builtins.o.A
            boolean r0 = r3.h(r0)
            if (r0 != 0) goto Lf
            r3 = 0
            return r3
        Lf:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d r0 = r2.b
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.r
            java.lang.String r3 = r1.r(r3)
            java.io.InputStream r3 = r0.a(r3)
            return r3
    }
}
