package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMetadataUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetadataUtil.kt\nkotlin/reflect/jvm/internal/MetadataUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,30:1\n1#2:31\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d3 {
    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.d<?> a(@org.jetbrains.annotations.NotNull java.lang.ClassLoader r3, @org.jetbrains.annotations.NotNull java.lang.String r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.name.b r4 = b(r4)
            r0 = 0
            r1 = 2
            r2 = 0
            java.lang.Class r3 = kotlin.reflect.jvm.internal.p3.q(r3, r4, r0, r1, r2)
            if (r3 == 0) goto L1c
            kotlin.reflect.d r3 = k3.a.i(r3)
            return r3
        L1c:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.name.b b(@org.jetbrains.annotations.NotNull java.lang.String r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "."
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = kotlin.text.u.H2(r13, r0, r1, r2, r3)
            if (r0 == 0) goto L1a
            r1 = 1
            java.lang.String r13 = r13.substring(r1)
            java.lang.String r1 = "substring(...)"
            kotlin.jvm.internal.g0.o(r13, r1)
        L1a:
            kotlin.reflect.jvm.internal.impl.name.b r1 = new kotlin.reflect.jvm.internal.impl.name.b
            kotlin.reflect.jvm.internal.impl.name.c r4 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r5 = ""
            r6 = 47
            java.lang.String r7 = kotlin.text.u.T5(r13, r6, r5)
            r11 = 4
            r12 = 0
            r8 = 47
            r9 = 46
            r10 = 0
            java.lang.String r5 = kotlin.text.u.w2(r7, r8, r9, r10, r11, r12)
            r4.<init>(r5)
            kotlin.reflect.jvm.internal.impl.name.c r5 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r13 = kotlin.text.u.N5(r13, r6, r3, r2, r3)
            r5.<init>(r13)
            r1.<init>(r4, r5, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String c(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "."
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = kotlin.text.u.H2(r4, r0, r1, r2, r3)
            if (r0 != 0) goto L1d
            r0 = 47
            java.lang.String r4 = kotlin.text.u.N5(r4, r0, r3, r2, r3)
            r0 = 46
            java.lang.String r4 = kotlin.text.u.N5(r4, r0, r3, r2, r3)
            return r4
        L1d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Local class is not supported: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }
}
