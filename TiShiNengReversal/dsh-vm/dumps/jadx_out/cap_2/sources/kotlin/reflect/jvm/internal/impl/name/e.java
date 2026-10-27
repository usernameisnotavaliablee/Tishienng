package kotlin.reflect.jvm.internal.impl.name;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFqNamesUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FqNamesUtil.kt\norg/jetbrains/kotlin/name/FqNamesUtilKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n536#2:87\n521#2,6:88\n1#3:94\n*S KotlinDebug\n*F\n+ 1 FqNamesUtil.kt\norg/jetbrains/kotlin/name/FqNamesUtilKt\n*L\n73#1:87\n73#1:88,6\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class e {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a = null;

        static {
                kotlin.reflect.jvm.internal.impl.name.k[] r0 = kotlin.reflect.jvm.internal.impl.name.k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.jvm.internal.impl.name.k r1 = kotlin.reflect.jvm.internal.impl.name.k.a     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.reflect.jvm.internal.impl.name.k r1 = kotlin.reflect.jvm.internal.impl.name.k.c     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.reflect.jvm.internal.impl.name.k r1 = kotlin.reflect.jvm.internal.impl.name.k.b     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.reflect.jvm.internal.impl.name.e.a.a = r0
                return
        }
    }

    @org.jetbrains.annotations.Nullable
    public static final <V> V a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r5, @org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.jvm.internal.impl.name.c, ? extends V> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "values"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L17:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            kotlin.reflect.jvm.internal.impl.name.c r2 = (kotlin.reflect.jvm.internal.impl.name.c) r2
            boolean r3 = kotlin.jvm.internal.g0.g(r5, r2)
            if (r3 != 0) goto L35
            boolean r2 = b(r5, r2)
            if (r2 == 0) goto L17
        L35:
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L17
        L41:
            boolean r6 = r0.isEmpty()
            r1 = 0
            if (r6 != 0) goto L49
            goto L4a
        L49:
            r0 = r1
        L4a:
            if (r0 != 0) goto L4d
            return r1
        L4d:
            java.util.Set r6 = r0.entrySet()
            java.util.Iterator r6 = r6.iterator()
            boolean r0 = r6.hasNext()
            if (r0 != 0) goto L5d
            r0 = r1
            goto La0
        L5d:
            java.lang.Object r0 = r6.next()
            boolean r2 = r6.hasNext()
            if (r2 != 0) goto L68
            goto La0
        L68:
            r2 = r0
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            kotlin.reflect.jvm.internal.impl.name.c r2 = (kotlin.reflect.jvm.internal.impl.name.c) r2
            kotlin.reflect.jvm.internal.impl.name.c r2 = g(r2, r5)
            java.lang.String r2 = r2.a()
            int r2 = r2.length()
        L7d:
            java.lang.Object r3 = r6.next()
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getKey()
            kotlin.reflect.jvm.internal.impl.name.c r4 = (kotlin.reflect.jvm.internal.impl.name.c) r4
            kotlin.reflect.jvm.internal.impl.name.c r4 = g(r4, r5)
            java.lang.String r4 = r4.a()
            int r4 = r4.length()
            if (r2 <= r4) goto L9a
            r0 = r3
            r2 = r4
        L9a:
            boolean r3 = r6.hasNext()
            if (r3 != 0) goto L7d
        La0:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto La9
            java.lang.Object r5 = r0.getValue()
            return r5
        La9:
            return r1
    }

    public static final boolean b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "packageName"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.name.c r1 = f(r1)
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            return r1
    }

    private static final boolean c(java.lang.String r3, java.lang.String r4) {
            r0 = 2
            r1 = 0
            r2 = 0
            boolean r0 = kotlin.text.u.H2(r3, r4, r2, r0, r1)
            if (r0 == 0) goto L17
            int r4 = r4.length()
            char r3 = r3.charAt(r4)
            r4 = 46
            if (r3 != r4) goto L17
            r3 = 1
            return r3
        L17:
            return r2
    }

    public static final boolean d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "packageName"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r3)
            r1 = 1
            if (r0 == 0) goto L12
            return r1
        L12:
            boolean r0 = r3.c()
            if (r0 == 0) goto L19
            return r1
        L19:
            java.lang.String r2 = r2.a()
            java.lang.String r3 = r3.a()
            boolean r2 = c(r2, r3)
            return r2
    }

    public static final boolean e(@org.jetbrains.annotations.Nullable java.lang.String r7) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            kotlin.reflect.jvm.internal.impl.name.k r1 = kotlin.reflect.jvm.internal.impl.name.k.a
            r2 = 0
        L7:
            int r3 = r7.length()
            r4 = 1
            if (r2 >= r3) goto L42
            char r3 = r7.charAt(r2)
            int[] r5 = kotlin.reflect.jvm.internal.impl.name.e.a.a
            int r6 = r1.ordinal()
            r5 = r5[r6]
            if (r5 == r4) goto L36
            r4 = 2
            if (r5 == r4) goto L36
            r4 = 3
            if (r5 != r4) goto L30
            r4 = 46
            if (r3 != r4) goto L29
            kotlin.reflect.jvm.internal.impl.name.k r1 = kotlin.reflect.jvm.internal.impl.name.k.c
            goto L3f
        L29:
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r3)
            if (r3 != 0) goto L3f
            return r0
        L30:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L36:
            boolean r1 = java.lang.Character.isJavaIdentifierStart(r3)
            if (r1 != 0) goto L3d
            return r0
        L3d:
            kotlin.reflect.jvm.internal.impl.name.k r1 = kotlin.reflect.jvm.internal.impl.name.k.b
        L3f:
            int r2 = r2 + 1
            goto L7
        L42:
            kotlin.reflect.jvm.internal.impl.name.k r7 = kotlin.reflect.jvm.internal.impl.name.k.c
            if (r1 == r7) goto L47
            return r4
        L47:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final kotlin.reflect.jvm.internal.impl.name.c f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            boolean r0 = r1.c()
            if (r0 == 0) goto Ld
            r1 = 0
            return r1
        Ld:
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.d()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.name.c g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = d(r1, r2)
            if (r0 == 0) goto L3d
            boolean r0 = r2.c()
            if (r0 == 0) goto L17
            goto L3d
        L17:
            boolean r0 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r0 == 0) goto L20
            kotlin.reflect.jvm.internal.impl.name.c r1 = kotlin.reflect.jvm.internal.impl.name.c.d
            return r1
        L20:
            kotlin.reflect.jvm.internal.impl.name.c r0 = new kotlin.reflect.jvm.internal.impl.name.c
            java.lang.String r1 = r1.a()
            java.lang.String r2 = r2.a()
            int r2 = r2.length()
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r2)
            java.lang.String r2 = "substring(...)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r0.<init>(r1)
            return r0
        L3d:
            return r1
    }
}
