package kotlin.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFilePathComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n1563#2:150\n1634#2,3:151\n*S KotlinDebug\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n*L\n134#1:150\n134#1:151,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class j {
    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.io.File a(@org.jetbrains.annotations.NotNull java.io.File r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = c(r1)
            r0.<init>(r1)
            return r0
    }

    private static final int b(java.lang.String r7) {
            char r1 = java.io.File.separatorChar
            r4 = 4
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r7
            int r7 = kotlin.text.u.G3(r0, r1, r2, r3, r4, r5)
            r6 = 1
            if (r7 != 0) goto L37
            int r7 = r0.length()
            if (r7 <= r6) goto L36
            char r7 = r0.charAt(r6)
            if (r7 != r1) goto L36
            r4 = 4
            r5 = 0
            r2 = 2
            r3 = 0
            int r7 = kotlin.text.u.G3(r0, r1, r2, r3, r4, r5)
            if (r7 < 0) goto L36
            int r2 = r7 + 1
            r4 = 4
            r5 = 0
            r3 = 0
            int r7 = kotlin.text.u.G3(r0, r1, r2, r3, r4, r5)
            if (r7 < 0) goto L31
            int r7 = r7 + r6
            return r7
        L31:
            int r7 = r0.length()
            return r7
        L36:
            return r6
        L37:
            r1 = 58
            if (r7 <= 0) goto L45
            int r2 = r7 + (-1)
            char r2 = r0.charAt(r2)
            if (r2 != r1) goto L45
            int r7 = r7 + r6
            return r7
        L45:
            r2 = -1
            r3 = 0
            if (r7 != r2) goto L56
            r7 = 2
            r2 = 0
            boolean r7 = kotlin.text.u.q3(r0, r1, r3, r7, r2)
            if (r7 == 0) goto L56
            int r7 = r0.length()
            return r7
        L56:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String c(@org.jetbrains.annotations.NotNull java.io.File r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = r2.getPath()
            java.lang.String r1 = "getPath(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.String r2 = r2.getPath()
            kotlin.jvm.internal.g0.o(r2, r1)
            int r2 = b(r2)
            r1 = 0
            java.lang.String r2 = r0.substring(r1, r2)
            java.lang.String r0 = "substring(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            return r2
    }

    public static final boolean d(@org.jetbrains.annotations.NotNull java.io.File r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r1 = r1.getPath()
            java.lang.String r0 = "getPath(...)"
            kotlin.jvm.internal.g0.o(r1, r0)
            int r1 = b(r1)
            if (r1 <= 0) goto L16
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.io.File e(@org.jetbrains.annotations.NotNull java.io.File r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.io.g r1 = f(r1)
            java.io.File r1 = r1.j(r2, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.io.g f(@org.jetbrains.annotations.NotNull java.io.File r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r10 = r10.getPath()
            kotlin.jvm.internal.g0.m(r10)
            int r0 = b(r10)
            r1 = 0
            java.lang.String r2 = r10.substring(r1, r0)
            java.lang.String r3 = "substring(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            java.lang.String r4 = r10.substring(r0)
            kotlin.jvm.internal.g0.o(r4, r3)
            int r10 = r4.length()
            if (r10 != 0) goto L2c
            java.util.List r10 = kotlin.collections.f0.J()
            goto L62
        L2c:
            r10 = 1
            char[] r5 = new char[r10]
            char r10 = java.io.File.separatorChar
            r5[r1] = r10
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            java.util.List r10 = kotlin.text.u.l5(r4, r5, r6, r7, r8, r9)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r10, r1)
            r0.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
        L4c:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L61
            java.lang.Object r1 = r10.next()
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r3 = new java.io.File
            r3.<init>(r1)
            r0.add(r3)
            goto L4c
        L61:
            r10 = r0
        L62:
            kotlin.io.g r0 = new kotlin.io.g
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            r0.<init>(r1, r10)
            return r0
    }
}
