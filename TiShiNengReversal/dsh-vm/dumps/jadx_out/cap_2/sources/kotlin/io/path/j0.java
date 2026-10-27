package kotlin.io.path;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j0 {
    public static final /* synthetic */ boolean a(kotlin.io.path.x r0) {
            boolean r0 = c(r0)
            return r0
    }

    public static final /* synthetic */ java.lang.Object b(java.nio.file.Path r0, java.nio.file.LinkOption[] r1) {
            java.lang.Object r0 = d(r0, r1)
            return r0
    }

    private static final boolean c(kotlin.io.path.x r4) {
            kotlin.io.path.x r0 = r4.c()
        L4:
            if (r0 == 0) goto L36
            java.lang.Object r1 = r0.b()
            r2 = 1
            if (r1 == 0) goto L22
            java.lang.Object r1 = r4.b()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.b()
            java.lang.Object r3 = r4.b()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 == 0) goto L31
            return r2
        L22:
            java.nio.file.Path r1 = r0.d()     // Catch: java.lang.Throwable -> L31
            java.nio.file.Path r3 = r4.d()     // Catch: java.lang.Throwable -> L31
            boolean r1 = kotlin.io.path.i0.a(r1, r3)     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L31
            return r2
        L31:
            kotlin.io.path.x r0 = r0.c()
            goto L4
        L36:
            r4 = 0
            return r4
    }

    private static final java.lang.Object d(java.nio.file.Path r2, java.nio.file.LinkOption[] r3) {
            int r0 = r3.length     // Catch: java.lang.Throwable -> L20
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)     // Catch: java.lang.Throwable -> L20
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3     // Catch: java.lang.Throwable -> L20
            java.lang.Class r0 = com.huawei.secure.android.common.util.z.a()     // Catch: java.lang.Throwable -> L20
            int r1 = r3.length     // Catch: java.lang.Throwable -> L20
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)     // Catch: java.lang.Throwable -> L20
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3     // Catch: java.lang.Throwable -> L20
            java.nio.file.attribute.BasicFileAttributes r2 = com.huawei.secure.android.common.util.q.a(r2, r0, r3)     // Catch: java.lang.Throwable -> L20
            java.lang.String r3 = "readAttributes(...)"
            kotlin.jvm.internal.g0.o(r2, r3)     // Catch: java.lang.Throwable -> L20
            java.lang.Object r2 = kotlin.io.path.e.a(r2)     // Catch: java.lang.Throwable -> L20
            return r2
        L20:
            r2 = 0
            return r2
    }
}
