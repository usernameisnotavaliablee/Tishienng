package g2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b implements okhttp3.Interceptor {
    public b(@org.jetbrains.annotations.Nullable android.content.Context r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r2) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.g0.q(r2, r0)
            okhttp3.Request r0 = r2.request()
            okhttp3.Response r2 = r2.proceed(r0)
            return r2
    }
}
