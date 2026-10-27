package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface WebSocket {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Factory {
        @org.jetbrains.annotations.NotNull
        okhttp3.WebSocket newWebSocket(@org.jetbrains.annotations.NotNull okhttp3.Request r1, @org.jetbrains.annotations.NotNull okhttp3.WebSocketListener r2);
    }

    void cancel();

    boolean close(int r1, @org.jetbrains.annotations.Nullable java.lang.String r2);

    long queueSize();

    @org.jetbrains.annotations.NotNull
    okhttp3.Request request();

    boolean send(@org.jetbrains.annotations.NotNull java.lang.String r1);

    boolean send(@org.jetbrains.annotations.NotNull okio.ByteString r1);
}
