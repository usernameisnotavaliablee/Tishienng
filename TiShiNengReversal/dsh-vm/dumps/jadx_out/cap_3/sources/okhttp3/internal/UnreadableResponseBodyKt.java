package okhttp3.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class UnreadableResponseBodyKt {
    public UnreadableResponseBodyKt() {
            r1 = this;
            r1.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Response stripBody(@org.jetbrains.annotations.NotNull okhttp3.Response r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            okhttp3.Response$Builder r0 = r5.newBuilder()
            okhttp3.internal.UnreadableResponseBody r1 = new okhttp3.internal.UnreadableResponseBody
            okhttp3.ResponseBody r2 = r5.body()
            okhttp3.MediaType r2 = r2.contentType()
            okhttp3.ResponseBody r5 = r5.body()
            long r3 = r5.contentLength()
            r1.<init>(r2, r3)
            okhttp3.Response$Builder r5 = r0.body(r1)
            okhttp3.Response r5 = r5.build()
            return r5
    }
}
