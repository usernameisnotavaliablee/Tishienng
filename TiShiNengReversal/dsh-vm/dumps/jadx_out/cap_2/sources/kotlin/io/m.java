package kotlin.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class m extends kotlin.io.l {
    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.io.h O(@org.jetbrains.annotations.NotNull java.io.File r1, @org.jetbrains.annotations.NotNull kotlin.io.FileWalkDirection r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "direction"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.io.h r0 = new kotlin.io.h
            r0.<init>(r1, r2)
            return r0
    }

    public static /* synthetic */ kotlin.io.h P(java.io.File r0, kotlin.io.FileWalkDirection r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            kotlin.io.FileWalkDirection r1 = kotlin.io.FileWalkDirection.TOP_DOWN
        L6:
            kotlin.io.h r0 = O(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.io.h Q(@org.jetbrains.annotations.NotNull java.io.File r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.io.FileWalkDirection r0 = kotlin.io.FileWalkDirection.BOTTOM_UP
            kotlin.io.h r1 = O(r1, r0)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.io.h R(@org.jetbrains.annotations.NotNull java.io.File r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.io.FileWalkDirection r0 = kotlin.io.FileWalkDirection.TOP_DOWN
            kotlin.io.h r1 = O(r1, r0)
            return r1
    }
}
