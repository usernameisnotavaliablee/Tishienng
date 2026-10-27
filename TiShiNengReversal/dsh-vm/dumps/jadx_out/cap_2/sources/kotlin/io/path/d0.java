package kotlin.io.path;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class d0 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.io.path.d0 a = null;
    private static final java.nio.file.Path b = null;
    private static final java.nio.file.Path c = null;

    static {
            kotlin.io.path.d0 r0 = new kotlin.io.path.d0
            r0.<init>()
            kotlin.io.path.d0.a = r0
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = ""
            java.nio.file.Path r1 = com.huawei.secure.android.common.util.g0.a(r2, r1)
            kotlin.io.path.d0.b = r1
            java.lang.String r1 = ".."
            java.lang.String[] r0 = new java.lang.String[r0]
            java.nio.file.Path r0 = com.huawei.secure.android.common.util.g0.a(r1, r0)
            kotlin.io.path.d0.c = r0
            return
    }

    private d0() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.nio.file.Path a(@org.jetbrains.annotations.NotNull java.nio.file.Path r7, @org.jetbrains.annotations.NotNull java.nio.file.Path r8) {
            r6 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.nio.file.Path r8 = kotlin.io.path.y.a(r8)
            java.nio.file.Path r7 = kotlin.io.path.y.a(r7)
            java.nio.file.Path r0 = kotlin.io.path.b0.a(r8, r7)
            int r1 = com.huawei.secure.android.common.util.a0.a(r8)
            int r2 = com.huawei.secure.android.common.util.a0.a(r7)
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            r3 = 0
        L24:
            if (r3 >= r1) goto L47
            java.nio.file.Path r4 = kotlin.io.path.c0.a(r8, r3)
            java.nio.file.Path r5 = kotlin.io.path.d0.c
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r5)
            if (r4 == 0) goto L47
            java.nio.file.Path r4 = kotlin.io.path.c0.a(r7, r3)
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r5)
            if (r4 == 0) goto L3f
            int r3 = r3 + 1
            goto L24
        L3f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Unable to compute relative path"
            r7.<init>(r8)
            throw r7
        L47:
            boolean r1 = kotlin.jvm.internal.g0.g(r7, r8)
            if (r1 != 0) goto L56
            java.nio.file.Path r1 = kotlin.io.path.d0.b
            boolean r8 = kotlin.jvm.internal.g0.g(r8, r1)
            if (r8 == 0) goto L56
            goto L8b
        L56:
            java.lang.String r7 = r0.toString()
            java.nio.file.FileSystem r8 = com.huawei.secure.android.common.util.w.a(r0)
            java.lang.String r8 = kotlin.io.path.z.a(r8)
            java.lang.String r1 = "getSeparator(...)"
            kotlin.jvm.internal.g0.o(r8, r1)
            r1 = 2
            r3 = 0
            boolean r8 = kotlin.text.u.Z1(r7, r8, r2, r1, r3)
            if (r8 == 0) goto L8a
            java.nio.file.FileSystem r8 = com.huawei.secure.android.common.util.w.a(r0)
            java.nio.file.FileSystem r0 = com.huawei.secure.android.common.util.w.a(r0)
            java.lang.String r0 = kotlin.io.path.z.a(r0)
            int r0 = r0.length()
            java.lang.String r7 = kotlin.text.u.d7(r7, r0)
            java.lang.String[] r0 = new java.lang.String[r2]
            java.nio.file.Path r7 = kotlin.io.path.a0.a(r8, r7, r0)
            goto L8b
        L8a:
            r7 = r0
        L8b:
            kotlin.jvm.internal.g0.m(r7)
            return r7
    }
}
