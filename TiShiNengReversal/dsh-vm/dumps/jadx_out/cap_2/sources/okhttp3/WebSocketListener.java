package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class WebSocketListener {
    public WebSocketListener() {
            r0 = this;
            r0.<init>()
            return
    }

    public void onClosed(@org.jetbrains.annotations.NotNull okhttp3.WebSocket r1, int r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r0 = this;
            java.lang.String r2 = "webSocket"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.lang.String r1 = "reason"
            kotlin.jvm.internal.g0.p(r3, r1)
            return
    }

    public void onClosing(@org.jetbrains.annotations.NotNull okhttp3.WebSocket r1, int r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r0 = this;
            java.lang.String r2 = "webSocket"
            kotlin.jvm.internal.g0.p(r1, r2)
            java.lang.String r1 = "reason"
            kotlin.jvm.internal.g0.p(r3, r1)
            return
    }

    public void onFailure(@org.jetbrains.annotations.NotNull okhttp3.WebSocket r1, @org.jetbrains.annotations.NotNull java.lang.Throwable r2, @org.jetbrains.annotations.Nullable okhttp3.Response r3) {
            r0 = this;
            java.lang.String r3 = "webSocket"
            kotlin.jvm.internal.g0.p(r1, r3)
            java.lang.String r1 = "t"
            kotlin.jvm.internal.g0.p(r2, r1)
            return
    }

    public void onMessage(@org.jetbrains.annotations.NotNull okhttp3.WebSocket r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "webSocket"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "text"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    public void onMessage(@org.jetbrains.annotations.NotNull okhttp3.WebSocket r2, @org.jetbrains.annotations.NotNull okio.ByteString r3) {
            r1 = this;
            java.lang.String r0 = "webSocket"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "bytes"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }

    public void onOpen(@org.jetbrains.annotations.NotNull okhttp3.WebSocket r2, @org.jetbrains.annotations.NotNull okhttp3.Response r3) {
            r1 = this;
            java.lang.String r0 = "webSocket"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "response"
            kotlin.jvm.internal.g0.p(r3, r2)
            return
    }
}
