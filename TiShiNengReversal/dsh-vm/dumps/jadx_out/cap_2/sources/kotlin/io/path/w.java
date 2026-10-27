package kotlin.io.path;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class w {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.io.path.w a = null;

    @org.jetbrains.annotations.NotNull
    private static final java.nio.file.LinkOption[] b = null;

    @org.jetbrains.annotations.NotNull
    private static final java.nio.file.LinkOption[] c = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Set<java.nio.file.FileVisitOption> d = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Set<java.nio.file.FileVisitOption> e = null;

    static {
            kotlin.io.path.w r0 = new kotlin.io.path.w
            r0.<init>()
            kotlin.io.path.w.a = r0
            r0 = 1
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            java.nio.file.LinkOption r1 = com.huawei.secure.android.common.util.b0.a()
            r2 = 0
            r0[r2] = r1
            kotlin.io.path.w.b = r0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r2]
            kotlin.io.path.w.c = r0
            java.util.Set r0 = kotlin.collections.u1.k()
            kotlin.io.path.w.d = r0
            java.nio.file.FileVisitOption r0 = kotlin.io.path.v.a()
            java.util.Set r0 = kotlin.collections.u1.f(r0)
            kotlin.io.path.w.e = r0
            return
    }

    private w() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.nio.file.LinkOption[] a(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            java.nio.file.LinkOption[] r1 = kotlin.io.path.w.c
            return r1
        L5:
            java.nio.file.LinkOption[] r1 = kotlin.io.path.w.b
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Set<java.nio.file.FileVisitOption> b(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            java.util.Set<java.nio.file.FileVisitOption> r1 = kotlin.io.path.w.e
            return r1
        L5:
            java.util.Set<java.nio.file.FileVisitOption> r1 = kotlin.io.path.w.d
            return r1
    }
}
