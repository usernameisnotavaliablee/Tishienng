package okio;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmName(name = "-GzipSourceExtensions")
/* renamed from: okio.-GzipSourceExtensions, reason: invalid class name */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class GzipSourceExtensions {
    private static final int FCOMMENT = 4;
    private static final int FEXTRA = 2;
    private static final int FHCRC = 1;
    private static final int FNAME = 3;
    private static final byte SECTION_BODY = 1;
    private static final byte SECTION_DONE = 3;
    private static final byte SECTION_HEADER = 0;
    private static final byte SECTION_TRAILER = 2;

    public GzipSourceExtensions() {
            r1 = this;
            r1.<init>()
            return
    }

    private static final boolean getBit(int r0, int r1) {
            int r0 = r0 >> r1
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L6
            return r1
        L6:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final okio.GzipSource gzip(@org.jetbrains.annotations.NotNull okio.Source r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            okio.GzipSource r0 = new okio.GzipSource
            r0.<init>(r1)
            return r0
    }
}
