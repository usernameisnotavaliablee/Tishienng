package okhttp3.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class UnreadableResponseBody extends okhttp3.ResponseBody implements okio.Source {
    private final long contentLength;

    @org.jetbrains.annotations.Nullable
    private final okhttp3.MediaType mediaType;

    public UnreadableResponseBody(@org.jetbrains.annotations.Nullable okhttp3.MediaType r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.mediaType = r1
            r0.contentLength = r2
            return
    }

    public void close() {
            r0 = this;
            return
    }

    public long contentLength() {
            r2 = this;
            long r0 = r2.contentLength
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public okhttp3.MediaType contentType() {
            r1 = this;
            okhttp3.MediaType r0 = r1.mediaType
            return r0
    }

    public long read(@org.jetbrains.annotations.NotNull okio.Buffer r1, long r2) {
            r0 = this;
            java.lang.String r2 = "sink"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)"
            r1.<init>(r2)
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public okio.BufferedSource source() {
            r1 = this;
            okio.BufferedSource r0 = okio.Okio.buffer(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public okio.Timeout timeout() {
            r1 = this;
            okio.Timeout r0 = okio.Timeout.NONE
            return r0
    }
}
