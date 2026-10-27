package kotlin.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class FileSystemException extends java.io.IOException {

    @org.jetbrains.annotations.NotNull
    private final java.io.File file;

    @org.jetbrains.annotations.Nullable
    private final java.io.File other;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String reason;

    public FileSystemException(@org.jetbrains.annotations.NotNull java.io.File r2, @org.jetbrains.annotations.Nullable java.io.File r3, @org.jetbrains.annotations.Nullable java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = kotlin.io.e.a(r2, r3, r4)
            r1.<init>(r0)
            r1.file = r2
            r1.other = r3
            r1.reason = r4
            return
    }

    public /* synthetic */ FileSystemException(java.io.File r2, java.io.File r3, java.lang.String r4, int r5, kotlin.jvm.internal.v r6) {
            r1 = this;
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r3 = r0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r4 = r0
        Lb:
            r1.<init>(r2, r3, r4)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.io.File getFile() {
            r1 = this;
            java.io.File r0 = r1.file
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.io.File getOther() {
            r1 = this;
            java.io.File r0 = r1.other
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReason() {
            r1 = this;
            java.lang.String r0 = r1.reason
            return r0
    }
}
