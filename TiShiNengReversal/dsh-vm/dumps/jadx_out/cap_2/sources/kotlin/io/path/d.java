package kotlin.io.path;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.io.path.ExperimentalPathApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class d implements kotlin.io.path.a {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.io.path.d a = null;

    static {
            kotlin.io.path.d r0 = new kotlin.io.path.d
            r0.<init>()
            kotlin.io.path.d.a = r0
            return
    }

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlin.io.path.a
    @org.jetbrains.annotations.NotNull
    public kotlin.io.path.CopyActionResult a(@org.jetbrains.annotations.NotNull java.nio.file.Path r5, @org.jetbrains.annotations.NotNull java.nio.file.Path r6, boolean r7) {
            r4 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.g0.p(r6, r0)
            kotlin.io.path.w r0 = kotlin.io.path.w.a
            java.nio.file.LinkOption[] r7 = r0.a(r7)
            int r0 = r7.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r7, r0)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = kotlin.io.path.b.a(r5, r0)
            if (r0 == 0) goto L3d
            r0 = 1
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            r2 = 0
            java.nio.file.LinkOption r3 = com.huawei.secure.android.common.util.b0.a()
            r1[r2] = r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = kotlin.io.path.b.a(r6, r0)
            if (r0 == 0) goto L3d
            kotlin.n1 r5 = kotlin.n1.a
            goto L54
        L3d:
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.nio.file.CopyOption[] r7 = (java.nio.file.CopyOption[]) r7
            int r0 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.nio.file.CopyOption[] r7 = (java.nio.file.CopyOption[]) r7
            java.nio.file.Path r5 = kotlin.io.path.c.a(r5, r6, r7)
            java.lang.String r6 = "copy(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
        L54:
            kotlin.io.path.CopyActionResult r5 = kotlin.io.path.CopyActionResult.CONTINUE
            return r5
    }
}
