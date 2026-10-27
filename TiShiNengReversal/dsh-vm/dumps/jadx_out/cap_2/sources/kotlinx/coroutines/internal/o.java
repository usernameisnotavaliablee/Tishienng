package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFastServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,161:1\n77#1,5:162\n77#1,5:168\n131#1,13:183\n1#2:167\n1360#3:173\n1446#3,5:174\n1549#3:179\n1620#3,3:180\n1064#4,2:196\n*S KotlinDebug\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n*L\n60#1:162,5\n61#1:168,5\n117#1:183,13\n99#1:173\n99#1:174,5\n101#1:179\n101#1:180,3\n153#1:196,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.o a = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String b = "META-INF/services/";

    static {
            kotlinx.coroutines.internal.o r0 = new kotlinx.coroutines.internal.o
            r0.<init>()
            kotlinx.coroutines.internal.o.a = r0
            return
    }

    private o() {
            r0 = this;
            r0.<init>()
            return
    }

    private final kotlinx.coroutines.internal.c0 a(java.lang.Class<kotlinx.coroutines.internal.c0> r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            java.lang.ClassLoader r1 = r4.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L19
            r2 = 1
            java.lang.Class r5 = java.lang.Class.forName(r5, r2, r1)     // Catch: java.lang.ClassNotFoundException -> L19
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r0)     // Catch: java.lang.ClassNotFoundException -> L19
            java.lang.Object r5 = r5.newInstance(r0)     // Catch: java.lang.ClassNotFoundException -> L19
            java.lang.Object r4 = r4.cast(r5)     // Catch: java.lang.ClassNotFoundException -> L19
            kotlinx.coroutines.internal.c0 r4 = (kotlinx.coroutines.internal.c0) r4     // Catch: java.lang.ClassNotFoundException -> L19
            return r4
        L19:
            return r0
    }

    private final <S> S b(java.lang.String r2, java.lang.ClassLoader r3, java.lang.Class<S> r4) {
            r1 = this;
            r0 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2, r0, r3)
            boolean r3 = r4.isAssignableFrom(r2)
            if (r3 == 0) goto L19
            r3 = 0
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)
            java.lang.Object r2 = r2.newInstance(r3)
            java.lang.Object r2 = r4.cast(r2)
            return r2
        L19:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Expected service of class "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = ", but found "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    private final <S> java.util.List<S> c(java.lang.Class<S> r1, java.lang.ClassLoader r2) {
            r0 = this;
            java.util.List r1 = r0.e(r1, r2)     // Catch: java.lang.Throwable -> L5
            return r1
        L5:
            java.util.ServiceLoader r1 = java.util.ServiceLoader.load(r1, r2)
            java.util.List r1 = kotlin.collections.f0.a6(r1)
            return r1
    }

    private final java.util.List<java.lang.String> f(java.net.URL r6) {
            r5 = this;
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "jar"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r1 = kotlin.text.u.H2(r0, r1, r2, r3, r4)
            if (r1 == 0) goto L5c
            java.lang.String r6 = "jar:file:"
            java.lang.String r6 = kotlin.text.u.K5(r0, r6, r4, r3, r4)
            r1 = 33
            java.lang.String r6 = kotlin.text.u.R5(r6, r1, r4, r3, r4)
            java.lang.String r1 = "!/"
            java.lang.String r0 = kotlin.text.u.K5(r0, r1, r4, r3, r4)
            java.util.jar.JarFile r1 = new java.util.jar.JarFile
            r1.<init>(r6, r2)
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L48
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L48
            java.util.zip.ZipEntry r3 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L48
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L48
            java.io.InputStream r0 = r1.getInputStream(r3)     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "UTF-8"
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L48
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L48
            kotlinx.coroutines.internal.o r0 = kotlinx.coroutines.internal.o.a     // Catch: java.lang.Throwable -> L4a
            java.util.List r0 = r0.g(r6)     // Catch: java.lang.Throwable -> L4a
            kotlin.io.b.a(r6, r4)     // Catch: java.lang.Throwable -> L48
            r1.close()
            return r0
        L48:
            r6 = move-exception
            goto L51
        L4a:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> L4c
        L4c:
            r2 = move-exception
            kotlin.io.b.a(r6, r0)     // Catch: java.lang.Throwable -> L48
            throw r2     // Catch: java.lang.Throwable -> L48
        L51:
            throw r6     // Catch: java.lang.Throwable -> L52
        L52:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L57
            throw r0
        L57:
            r0 = move-exception
            kotlin.l.a(r6, r0)
            throw r6
        L5c:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r6 = r6.openStream()
            r1.<init>(r6)
            r0.<init>(r1)
            kotlinx.coroutines.internal.o r6 = kotlinx.coroutines.internal.o.a     // Catch: java.lang.Throwable -> L74
            java.util.List r6 = r6.g(r0)     // Catch: java.lang.Throwable -> L74
            kotlin.io.b.a(r0, r4)
            return r6
        L74:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L76
        L76:
            r1 = move-exception
            kotlin.io.b.a(r0, r6)
            throw r1
    }

    private final java.util.List<java.lang.String> g(java.io.BufferedReader r6) {
            r5 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
        L5:
            java.lang.String r1 = r6.readLine()
            if (r1 != 0) goto L10
            java.util.List r6 = kotlin.collections.f0.a6(r0)
            return r6
        L10:
            java.lang.String r2 = "#"
            r3 = 2
            r4 = 0
            java.lang.String r1 = kotlin.text.u.S5(r1, r2, r4, r3, r4)
            java.lang.CharSequence r1 = kotlin.text.u.Z5(r1)
            java.lang.String r1 = r1.toString()
            r2 = 0
        L21:
            int r3 = r1.length()
            if (r2 >= r3) goto L54
            char r3 = r1.charAt(r2)
            r4 = 46
            if (r3 == r4) goto L51
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r3)
            if (r3 == 0) goto L36
            goto L51
        L36:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Illegal service provider class name: "
            r6.append(r0)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L51:
            int r2 = r2 + 1
            goto L21
        L54:
            int r2 = r1.length()
            if (r2 <= 0) goto L5
            r0.add(r1)
            goto L5
    }

    private final <R> R h(java.util.jar.JarFile r3, kotlin.jvm.functions.Function1<? super java.util.jar.JarFile, ? extends R> r4) {
            r2 = this;
            r0 = 1
            java.lang.Object r4 = r4.invoke(r3)     // Catch: java.lang.Throwable -> Lf
            kotlin.jvm.internal.d0.d(r0)
            r3.close()
            kotlin.jvm.internal.d0.c(r0)
            return r4
        Lf:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L11
        L11:
            r1 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            r3.close()     // Catch: java.lang.Throwable -> L1c
            kotlin.jvm.internal.d0.c(r0)
            throw r1
        L1c:
            r3 = move-exception
            kotlin.l.a(r4, r3)
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlinx.coroutines.internal.c0> d() {
            r6 = this;
            boolean r0 = kotlinx.coroutines.internal.p.a()
            java.lang.Class<kotlinx.coroutines.internal.c0> r1 = kotlinx.coroutines.internal.c0.class
            if (r0 != 0) goto L11
            java.lang.ClassLoader r0 = r1.getClassLoader()
            java.util.List r0 = r6.c(r1, r0)
            return r0
        L11:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5a
            r2 = 2
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r2 = "kotlinx.coroutines.android.a"
            r3 = 1
            r4 = 0
            java.lang.ClassLoader r5 = r1.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L32 java.lang.Throwable -> L5a
            java.lang.Class r2 = java.lang.Class.forName(r2, r3, r5)     // Catch: java.lang.ClassNotFoundException -> L32 java.lang.Throwable -> L5a
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch: java.lang.ClassNotFoundException -> L32 java.lang.Throwable -> L5a
            java.lang.Object r2 = r2.newInstance(r4)     // Catch: java.lang.ClassNotFoundException -> L32 java.lang.Throwable -> L5a
            java.lang.Object r2 = r1.cast(r2)     // Catch: java.lang.ClassNotFoundException -> L32 java.lang.Throwable -> L5a
            kotlinx.coroutines.internal.c0 r2 = (kotlinx.coroutines.internal.c0) r2     // Catch: java.lang.ClassNotFoundException -> L32 java.lang.Throwable -> L5a
            goto L34
        L32:
            r2 = r4
        L34:
            if (r2 == 0) goto L39
            r0.add(r2)     // Catch: java.lang.Throwable -> L5a
        L39:
            java.lang.String r2 = "kotlinx.coroutines.test.internal.TestMainDispatcherFactory"
            java.lang.ClassLoader r5 = r1.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L53 java.lang.Throwable -> L5a
            java.lang.Class r2 = java.lang.Class.forName(r2, r3, r5)     // Catch: java.lang.ClassNotFoundException -> L53 java.lang.Throwable -> L5a
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch: java.lang.ClassNotFoundException -> L53 java.lang.Throwable -> L5a
            java.lang.Object r2 = r2.newInstance(r4)     // Catch: java.lang.ClassNotFoundException -> L53 java.lang.Throwable -> L5a
            java.lang.Object r2 = r1.cast(r2)     // Catch: java.lang.ClassNotFoundException -> L53 java.lang.Throwable -> L5a
            kotlinx.coroutines.internal.c0 r2 = (kotlinx.coroutines.internal.c0) r2     // Catch: java.lang.ClassNotFoundException -> L53 java.lang.Throwable -> L5a
            r4 = r2
            goto L54
        L53:
        L54:
            if (r4 == 0) goto L62
            r0.add(r4)     // Catch: java.lang.Throwable -> L5a
            goto L62
        L5a:
            java.lang.ClassLoader r0 = r1.getClassLoader()
            java.util.List r0 = r6.c(r1, r0)
        L62:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final <S> java.util.List<S> e(@org.jetbrains.annotations.NotNull java.lang.Class<S> r5, @org.jetbrains.annotations.NotNull java.lang.ClassLoader r6) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "META-INF/services/"
            r0.append(r1)
            java.lang.String r1 = r5.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.Enumeration r0 = r6.getResources(r0)
            java.util.ArrayList r0 = java.util.Collections.list(r0)
            java.lang.String r1 = "list(this)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r0.next()
            java.net.URL r2 = (java.net.URL) r2
            kotlinx.coroutines.internal.o r3 = kotlinx.coroutines.internal.o.a
            java.util.List r2 = r3.f(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            kotlin.collections.f0.s0(r1, r2)
            goto L2b
        L43:
            java.util.Set r0 = kotlin.collections.f0.f6(r1)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L73
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L5c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            kotlinx.coroutines.internal.o r3 = kotlinx.coroutines.internal.o.a
            java.lang.Object r2 = r3.b(r2, r6, r5)
            r1.add(r2)
            goto L5c
        L72:
            return r1
        L73:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "No providers were loaded with FastServiceLoader"
            r5.<init>(r6)
            throw r5
    }
}
