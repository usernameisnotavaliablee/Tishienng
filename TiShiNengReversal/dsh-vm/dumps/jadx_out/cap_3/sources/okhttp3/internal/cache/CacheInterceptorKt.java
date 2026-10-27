package okhttp3.internal.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class CacheInterceptorKt {
    public CacheInterceptorKt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final /* synthetic */ okhttp3.Request access$requestForCache(okhttp3.Request r0) {
            okhttp3.Request r0 = requestForCache(r0)
            return r0
    }

    private static final okhttp3.Request requestForCache(okhttp3.Request r3) {
            okhttp3.HttpUrl r0 = r3.cacheUrlOverride()
            if (r0 == 0) goto L33
            okhttp3.internal.http.HttpMethod r1 = okhttp3.internal.http.HttpMethod.INSTANCE
            java.lang.String r2 = r3.method()
            boolean r1 = r1.isCacheable(r2)
            if (r1 != 0) goto L1e
            java.lang.String r1 = r3.method()
            java.lang.String r2 = "POST"
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 == 0) goto L33
        L1e:
            okhttp3.Request$Builder r3 = r3.newBuilder()
            okhttp3.Request$Builder r3 = r3.get()
            okhttp3.Request$Builder r3 = r3.url(r0)
            r0 = 0
            okhttp3.Request$Builder r3 = r3.cacheUrlOverride(r0)
            okhttp3.Request r3 = r3.build()
        L33:
            return r3
    }
}
