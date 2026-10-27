package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\npropertiesConventionUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 propertiesConventionUtil.kt\norg/jetbrains/kotlin/load/java/PropertiesConventionUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n774#2:103\n865#2,2:104\n*S KotlinDebug\n*F\n+ 1 propertiesConventionUtil.kt\norg/jetbrains/kotlin/load/java/PropertiesConventionUtilKt\n*L\n90#1:103\n90#1:104,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n0 {
    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.name.f> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2) {
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = r2.b()
            java.lang.String r1 = "asString(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            boolean r1 = kotlin.reflect.jvm.internal.impl.load.java.h0.c(r0)
            if (r1 == 0) goto L1d
            kotlin.reflect.jvm.internal.impl.name.f r2 = b(r2)
            java.util.List r2 = kotlin.collections.f0.R(r2)
            return r2
        L1d:
            boolean r0 = kotlin.reflect.jvm.internal.impl.load.java.h0.d(r0)
            if (r0 == 0) goto L28
            java.util.List r2 = f(r2)
            return r2
        L28:
            kotlin.reflect.jvm.internal.impl.load.java.i r0 = kotlin.reflect.jvm.internal.impl.load.java.i.a
            java.util.List r2 = r0.b(r2)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.name.f b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r7) {
            java.lang.String r0 = "methodName"
            kotlin.jvm.internal.g0.p(r7, r0)
            r5 = 12
            r6 = 0
            java.lang.String r2 = "get"
            r3 = 0
            r4 = 0
            r1 = r7
            kotlin.reflect.jvm.internal.impl.name.f r7 = e(r1, r2, r3, r4, r5, r6)
            r0 = r1
            if (r7 != 0) goto L1f
            r4 = 8
            r5 = 0
            java.lang.String r1 = "is"
            r2 = 0
            r3 = 0
            kotlin.reflect.jvm.internal.impl.name.f r7 = e(r0, r1, r2, r3, r4, r5)
        L1f:
            return r7
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.name.f c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r6, boolean r7) {
            java.lang.String r0 = "methodName"
            kotlin.jvm.internal.g0.p(r6, r0)
            if (r7 == 0) goto Lb
            java.lang.String r7 = "is"
        L9:
            r3 = r7
            goto Ld
        Lb:
            r7 = 0
            goto L9
        Ld:
            r4 = 4
            r5 = 0
            java.lang.String r1 = "set"
            r2 = 0
            r0 = r6
            kotlin.reflect.jvm.internal.impl.name.f r6 = e(r0, r1, r2, r3, r4, r5)
            return r6
    }

    private static final kotlin.reflect.jvm.internal.impl.name.f d(kotlin.reflect.jvm.internal.impl.name.f r4, java.lang.String r5, boolean r6, java.lang.String r7) {
            boolean r0 = r4.i()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = r4.getIdentifier()
            java.lang.String r2 = "getIdentifier(...)"
            kotlin.jvm.internal.g0.o(r0, r2)
            r2 = 0
            r3 = 2
            boolean r2 = kotlin.text.u.H2(r0, r5, r2, r3, r1)
            if (r2 != 0) goto L1a
            return r1
        L1a:
            int r2 = r0.length()
            int r3 = r5.length()
            if (r2 != r3) goto L25
            return r1
        L25:
            int r2 = r5.length()
            char r2 = r0.charAt(r2)
            r3 = 97
            if (r3 > r2) goto L36
            r3 = 123(0x7b, float:1.72E-43)
            if (r2 >= r3) goto L36
            return r1
        L36:
            if (r7 == 0) goto L50
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r7)
            java.lang.String r5 = kotlin.text.u.v4(r0, r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.name.f.h(r4)
            return r4
        L50:
            if (r6 != 0) goto L53
            return r4
        L53:
            java.lang.String r4 = kotlin.text.u.v4(r0, r5)
            r5 = 1
            java.lang.String r4 = e4.a.c(r4, r5)
            boolean r5 = kotlin.reflect.jvm.internal.impl.name.f.j(r4)
            if (r5 != 0) goto L63
            return r1
        L63:
            kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.name.f.h(r4)
            return r4
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f e(kotlin.reflect.jvm.internal.impl.name.f r0, java.lang.String r1, boolean r2, java.lang.String r3, int r4, java.lang.Object r5) {
            r5 = r4 & 4
            if (r5 == 0) goto L5
            r2 = 1
        L5:
            r4 = r4 & 8
            if (r4 == 0) goto La
            r3 = 0
        La:
            kotlin.reflect.jvm.internal.impl.name.f r0 = d(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.name.f> f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r4) {
            java.lang.String r0 = "methodName"
            kotlin.jvm.internal.g0.p(r4, r0)
            r0 = 0
            kotlin.reflect.jvm.internal.impl.name.f r1 = c(r4, r0)
            r2 = 1
            kotlin.reflect.jvm.internal.impl.name.f r4 = c(r4, r2)
            r3 = 2
            kotlin.reflect.jvm.internal.impl.name.f[] r3 = new kotlin.reflect.jvm.internal.impl.name.f[r3]
            r3[r0] = r1
            r3[r2] = r4
            java.util.List r4 = kotlin.collections.f0.S(r3)
            return r4
    }
}
