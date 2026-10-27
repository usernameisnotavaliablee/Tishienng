package okhttp3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface Connection {
    @org.jetbrains.annotations.Nullable
    okhttp3.Handshake handshake();

    @org.jetbrains.annotations.NotNull
    okhttp3.Protocol protocol();

    @org.jetbrains.annotations.NotNull
    okhttp3.Route route();

    @org.jetbrains.annotations.NotNull
    java.net.Socket socket();
}
