package xyz.adscope.common.network.connect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface Connection extends java.io.Closeable {
    void disconnect();

    int getCode();

    java.util.Map<java.lang.String, java.util.List<java.lang.String>> getHeaders();

    java.io.InputStream getInputStream();

    java.lang.String getLocationUrl();

    java.io.OutputStream getOutputStream();
}
