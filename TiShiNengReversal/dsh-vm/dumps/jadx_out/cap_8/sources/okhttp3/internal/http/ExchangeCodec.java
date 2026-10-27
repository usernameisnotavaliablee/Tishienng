package okhttp3.internal.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface ExchangeCodec {

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.http.ExchangeCodec.Companion Companion = null;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Carrier {
        void cancel();

        @org.jetbrains.annotations.NotNull
        okhttp3.Route getRoute();

        void noNewExchanges();

        void trackFailure(@org.jetbrains.annotations.NotNull okhttp3.internal.connection.RealCall r1, @org.jetbrains.annotations.Nullable java.io.IOException r2);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        static final /* synthetic */ okhttp3.internal.http.ExchangeCodec.Companion $$INSTANCE = null;
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

        static {
                okhttp3.internal.http.ExchangeCodec$Companion r0 = new okhttp3.internal.http.ExchangeCodec$Companion
                r0.<init>()
                okhttp3.internal.http.ExchangeCodec.Companion.$$INSTANCE = r0
                return
        }

        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            okhttp3.internal.http.ExchangeCodec$Companion r0 = okhttp3.internal.http.ExchangeCodec.Companion.$$INSTANCE
            okhttp3.internal.http.ExchangeCodec.Companion = r0
            return
    }

    void cancel();

    @org.jetbrains.annotations.NotNull
    okio.Sink createRequestBody(@org.jetbrains.annotations.NotNull okhttp3.Request r1, long r2) throws java.io.IOException;

    void finishRequest() throws java.io.IOException;

    void flushRequest() throws java.io.IOException;

    @org.jetbrains.annotations.NotNull
    okhttp3.internal.http.ExchangeCodec.Carrier getCarrier();

    @org.jetbrains.annotations.NotNull
    /* renamed from: getSocket */
    okio.Socket mo64getSocket();

    boolean isResponseComplete();

    @org.jetbrains.annotations.NotNull
    okio.Source openResponseBodySource(@org.jetbrains.annotations.NotNull okhttp3.Response r1) throws java.io.IOException;

    @org.jetbrains.annotations.Nullable
    okhttp3.Headers peekTrailers() throws java.io.IOException;

    @org.jetbrains.annotations.Nullable
    okhttp3.Response.Builder readResponseHeaders(boolean r1) throws java.io.IOException;

    long reportedContentLength(@org.jetbrains.annotations.NotNull okhttp3.Response r1) throws java.io.IOException;

    void writeRequestHeaders(@org.jetbrains.annotations.NotNull okhttp3.Request r1) throws java.io.IOException;
}
