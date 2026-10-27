package kotlin.reflect.jvm.internal.impl.renderer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRenderingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderingUtils.kt\norg/jetbrains/kotlin/renderer/RenderingUtilsKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,78:1\n1088#2,2:79\n*S KotlinDebug\n*F\n+ 1 RenderingUtils.kt\norg/jetbrains/kotlin/renderer/RenderingUtilsKt\n*L\n30#1:79,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a0 {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.d r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.util.List r1 = r1.h()
            java.lang.String r1 = c(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = e(r3)
            java.lang.String r1 = "asString(...)"
            if (r0 == 0) goto L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r3.b()
            kotlin.jvm.internal.g0.o(r3, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 96
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = r0.toString()
            return r3
        L35:
            java.lang.String r3 = r3.b()
            kotlin.jvm.internal.g0.o(r3, r1)
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String c(@org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.name.f> r3) {
            java.lang.String r0 = "pathSegments"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        Le:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r3.next()
            kotlin.reflect.jvm.internal.impl.name.f r1 = (kotlin.reflect.jvm.internal.impl.name.f) r1
            int r2 = r0.length()
            if (r2 <= 0) goto L25
            java.lang.String r2 = "."
            r0.append(r2)
        L25:
            java.lang.String r1 = b(r1)
            r0.append(r1)
            goto Le
        L2d:
            java.lang.String r3 = r0.toString()
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String d(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8) {
            java.lang.String r0 = "lowerRendered"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "lowerPrefix"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "upperRendered"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "upperPrefix"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "foldedPrefix"
            kotlin.jvm.internal.g0.p(r8, r0)
            r0 = 0
            r1 = 2
            r2 = 0
            boolean r3 = kotlin.text.u.H2(r4, r5, r0, r1, r2)
            if (r3 == 0) goto L6e
            boolean r0 = kotlin.text.u.H2(r6, r7, r0, r1, r2)
            if (r0 == 0) goto L6e
            int r5 = r5.length()
            java.lang.String r4 = r4.substring(r5)
            java.lang.String r5 = "substring(...)"
            kotlin.jvm.internal.g0.o(r4, r5)
            int r7 = r7.length()
            java.lang.String r6 = r6.substring(r7)
            kotlin.jvm.internal.g0.o(r6, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            boolean r7 = kotlin.jvm.internal.g0.g(r4, r6)
            if (r7 == 0) goto L56
            return r5
        L56:
            boolean r4 = f(r4, r6)
            if (r4 == 0) goto L6e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            r5 = 33
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            return r4
        L6e:
            return r2
    }

    private static final boolean e(kotlin.reflect.jvm.internal.impl.name.f r4) {
            java.lang.String r4 = r4.b()
            java.lang.String r0 = "asString(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            java.util.Set<java.lang.String> r0 = kotlin.reflect.jvm.internal.impl.renderer.z.a
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto L3e
            r0 = 0
            r1 = 0
        L13:
            int r2 = r4.length()
            if (r1 >= r2) goto L2b
            char r2 = r4.charAt(r1)
            boolean r3 = java.lang.Character.isLetterOrDigit(r2)
            if (r3 != 0) goto L28
            r3 = 95
            if (r2 == r3) goto L28
            goto L3e
        L28:
            int r1 = r1 + 1
            goto L13
        L2b:
            int r1 = r4.length()
            if (r1 != 0) goto L32
            goto L3e
        L32:
            int r4 = r4.codePointAt(r0)
            boolean r4 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r4 != 0) goto L3d
            goto L3e
        L3d:
            return r0
        L3e:
            r4 = 1
            return r4
    }

    public static final boolean f(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.NotNull java.lang.String r8) {
            java.lang.String r0 = "lower"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "upper"
            kotlin.jvm.internal.g0.p(r8, r0)
            r5 = 4
            r6 = 0
            java.lang.String r2 = "?"
            java.lang.String r3 = ""
            r4 = 0
            r1 = r8
            java.lang.String r8 = kotlin.text.u.x2(r1, r2, r3, r4, r5, r6)
            boolean r8 = kotlin.jvm.internal.g0.g(r7, r8)
            if (r8 != 0) goto L5c
            r8 = 2
            r0 = 0
            java.lang.String r2 = "?"
            r3 = 0
            boolean r8 = kotlin.text.u.Z1(r1, r2, r3, r8, r0)
            if (r8 == 0) goto L3e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r0 = 63
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            boolean r8 = kotlin.jvm.internal.g0.g(r8, r1)
            if (r8 != 0) goto L5c
        L3e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r0 = 40
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = ")?"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            boolean r7 = kotlin.jvm.internal.g0.g(r7, r1)
            if (r7 == 0) goto L5b
            goto L5c
        L5b:
            return r3
        L5c:
            r7 = 1
            return r7
    }
}
