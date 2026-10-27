package kotlin.io.path;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class IllegalFileNameException extends java.nio.file.FileSystemException {
    public IllegalFileNameException(@org.jetbrains.annotations.NotNull java.nio.file.Path r2) {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            r1.<init>(r2, r0, r0)
            return
    }

    public IllegalFileNameException(@org.jetbrains.annotations.NotNull java.nio.file.Path r2, @org.jetbrains.annotations.Nullable java.nio.file.Path r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = r2.toString()
            if (r3 == 0) goto L10
            java.lang.String r3 = r3.toString()
            goto L11
        L10:
            r3 = 0
        L11:
            r1.<init>(r2, r3, r4)
            return
    }
}
