package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJavaTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaTypeAttributes.kt\norg/jetbrains/kotlin/load/java/lazy/types/JavaTypeAttributesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b {
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.TypeUsage r9, boolean r10, boolean r11, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.j1 r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r9, r0)
            if (r12 == 0) goto Ld
            java.util.Set r12 = kotlin.collections.u1.f(r12)
        Lb:
            r5 = r12
            goto Lf
        Ld:
            r12 = 0
            goto Lb
        Lf:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a
            r2 = 0
            r6 = 0
            r7 = 34
            r8 = 0
            r1 = r9
            r4 = r10
            r3 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a b(kotlin.reflect.jvm.internal.impl.types.TypeUsage r1, boolean r2, boolean r3, kotlin.reflect.jvm.internal.impl.descriptors.j1 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            r0 = 0
            if (r6 == 0) goto L6
            r2 = 0
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lb
            r3 = 0
        Lb:
            r5 = r5 & 4
            if (r5 == 0) goto L10
            r4 = 0
        L10:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a r1 = a(r1, r2, r3, r4)
            return r1
    }
}
