package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJvmNameResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmNameResolver.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/JvmNameResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1#2:35\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e extends kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes h;

    public e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes r4, @org.jetbrains.annotations.NotNull java.lang.String[] r5) {
            r3 = this;
            java.lang.String r0 = "types"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "strings"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.List r0 = r4.getLocalNameList()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L19
            java.util.Set r0 = kotlin.collections.u1.k()
            goto L22
        L19:
            kotlin.jvm.internal.g0.m(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = kotlin.collections.f0.f6(r0)
        L22:
            java.util.List r1 = r4.getRecordList()
            java.lang.String r2 = "getRecordList(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            java.util.List r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g.a(r1)
            r3.<init>(r5, r0, r1)
            r3.h = r4
            return
    }
}
