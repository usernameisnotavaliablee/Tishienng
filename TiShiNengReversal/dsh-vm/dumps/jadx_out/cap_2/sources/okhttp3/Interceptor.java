package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface Interceptor {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.Interceptor.Companion Companion = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Chain {
        @org.jetbrains.annotations.NotNull
        okhttp3.Call call();

        int connectTimeoutMillis();

        @org.jetbrains.annotations.Nullable
        okhttp3.Connection connection();

        @org.jetbrains.annotations.NotNull
        okhttp3.Response proceed(@org.jetbrains.annotations.NotNull okhttp3.Request r1) throws java.io.IOException;

        int readTimeoutMillis();

        @org.jetbrains.annotations.NotNull
        okhttp3.Request request();

        @org.jetbrains.annotations.NotNull
        okhttp3.Interceptor.Chain withConnectTimeout(int r1, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r2);

        @org.jetbrains.annotations.NotNull
        okhttp3.Interceptor.Chain withReadTimeout(int r1, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r2);

        @org.jetbrains.annotations.NotNull
        okhttp3.Interceptor.Chain withWriteTimeout(int r1, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r2);

        int writeTimeoutMillis();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        static final /* synthetic */ okhttp3.Interceptor.Companion $$INSTANCE = null;

        static {
                okhttp3.Interceptor$Companion r0 = new okhttp3.Interceptor$Companion
                r0.<init>()
                okhttp3.Interceptor.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public final okhttp3.Interceptor invoke(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super okhttp3.Interceptor.Chain, okhttp3.Response> r2) {
                r1 = this;
                java.lang.String r0 = "block"
                kotlin.jvm.internal.g0.p(r2, r0)
                okhttp3.Interceptor$Companion$invoke$1 r0 = new okhttp3.Interceptor$Companion$invoke$1
                r0.<init>(r2)
                return r0
        }
    }

    static {
            okhttp3.Interceptor$Companion r0 = okhttp3.Interceptor.Companion.$$INSTANCE
            okhttp3.Interceptor.Companion = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    okhttp3.Response intercept(@org.jetbrains.annotations.NotNull okhttp3.Interceptor.Chain r1) throws java.io.IOException;
}
