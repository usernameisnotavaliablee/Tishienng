package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBuiltInsResourceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInsResourceLoader.kt\norg/jetbrains/kotlin/serialization/deserialization/builtins/BuiltInsResourceLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,21:1\n1#2:22\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d {
    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.io.InputStream a(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Class<kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d> r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.d.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 != 0) goto L12
            java.io.InputStream r2 = java.lang.ClassLoader.getSystemResourceAsStream(r2)
            return r2
        L12:
            java.net.URL r2 = r0.getResource(r2)
            if (r2 != 0) goto L1a
            r2 = 0
            return r2
        L1a:
            java.net.URLConnection r2 = r2.openConnection()
            r0 = 0
            r2.setUseCaches(r0)
            java.io.InputStream r2 = r2.getInputStream()
            return r2
    }
}
