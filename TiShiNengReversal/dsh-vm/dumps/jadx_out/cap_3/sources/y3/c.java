package y3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nreadPackageFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 readPackageFragment.kt\norg/jetbrains/kotlin/metadata/builtins/ReadPackageFragmentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,23:1\n1#2:24\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class c {
    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.Pair<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment, y3.a> a(@org.jetbrains.annotations.NotNull java.io.InputStream r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            y3.a$a r0 = y3.a.g     // Catch: java.lang.Throwable -> L1e
            y3.a r0 = r0.a(r3)     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r0.h()     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            if (r1 == 0) goto L20
            kotlin.reflect.jvm.internal.impl.protobuf.f r1 = kotlin.reflect.jvm.internal.impl.protobuf.f.d()     // Catch: java.lang.Throwable -> L1e
            y3.b.a(r1)     // Catch: java.lang.Throwable -> L1e
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.parseFrom(r3, r1)     // Catch: java.lang.Throwable -> L1e
            goto L21
        L1e:
            r0 = move-exception
            goto L29
        L20:
            r1 = r2
        L21:
            kotlin.Pair r0 = kotlin.o0.a(r1, r0)     // Catch: java.lang.Throwable -> L1e
            kotlin.io.b.a(r3, r2)
            return r0
        L29:
            throw r0     // Catch: java.lang.Throwable -> L2a
        L2a:
            r1 = move-exception
            kotlin.io.b.a(r3, r0)
            throw r1
    }
}
