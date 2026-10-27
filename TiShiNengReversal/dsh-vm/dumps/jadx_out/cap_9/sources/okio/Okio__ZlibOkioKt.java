package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final /* synthetic */ class Okio__ZlibOkioKt {
    public Okio__ZlibOkioKt() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.FileSystem openZip(@org.jetbrains.annotations.NotNull okio.FileSystem r2, @org.jetbrains.annotations.NotNull okio.Path r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "zipPath"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            r1 = 4
            okio.ZipFileSystem r2 = okio.internal.ZipFilesKt.openZip$default(r3, r2, r0, r1, r0)
            return r2
    }
}
