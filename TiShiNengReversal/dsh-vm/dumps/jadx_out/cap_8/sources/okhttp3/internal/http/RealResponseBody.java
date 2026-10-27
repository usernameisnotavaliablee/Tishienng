package okhttp3.internal.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class RealResponseBody extends okhttp3.ResponseBody {
    private final long contentLength;

    @org.jetbrains.annotations.Nullable
    private final java.lang.String contentTypeString;

    @org.jetbrains.annotations.NotNull
    private final okio.BufferedSource source;

    public RealResponseBody(@org.jetbrains.annotations.Nullable java.lang.String r2, long r3, @org.jetbrains.annotations.NotNull okio.BufferedSource r5) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.contentTypeString = r2
            r1.contentLength = r3
            r1.source = r5
            return
    }

    public long contentLength() {
            r2 = this;
            long r0 = r2.contentLength
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public okhttp3.MediaType contentType() {
            r2 = this;
            java.lang.String r0 = r2.contentTypeString
            if (r0 == 0) goto Lb
            okhttp3.MediaType$Companion r1 = okhttp3.MediaType.Companion
            okhttp3.MediaType r0 = r1.parse(r0)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public okio.BufferedSource source() {
            r1 = this;
            okio.BufferedSource r0 = r1.source
            return r0
    }
}
