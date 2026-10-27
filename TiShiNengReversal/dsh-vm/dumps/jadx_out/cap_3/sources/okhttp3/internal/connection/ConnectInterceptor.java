package okhttp3.internal.connection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class ConnectInterceptor implements okhttp3.Interceptor {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.connection.ConnectInterceptor INSTANCE = null;

    static {
            okhttp3.internal.connection.ConnectInterceptor r0 = new okhttp3.internal.connection.ConnectInterceptor
            r0.<init>()
            okhttp3.internal.connection.ConnectInterceptor.INSTANCE = r0
            return
    }

    private ConnectInterceptor() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r11) throws java.io.IOException {
            r10 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.g0.p(r11, r0)
            r1 = r11
            okhttp3.internal.http.RealInterceptorChain r1 = (okhttp3.internal.http.RealInterceptorChain) r1
            okhttp3.internal.connection.RealCall r11 = r1.getCall$okhttp()
            okhttp3.internal.connection.Exchange r3 = r11.initExchange$okhttp(r1)
            r8 = 61
            r9 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            okhttp3.internal.http.RealInterceptorChain r11 = okhttp3.internal.http.RealInterceptorChain.copy$okhttp$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            okhttp3.Request r0 = r1.getRequest$okhttp()
            okhttp3.Response r11 = r11.proceed(r0)
            return r11
    }
}
