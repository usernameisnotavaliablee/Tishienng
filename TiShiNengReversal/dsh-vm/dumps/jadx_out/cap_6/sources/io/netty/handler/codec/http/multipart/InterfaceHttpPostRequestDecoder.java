package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface InterfaceHttpPostRequestDecoder {
    void cleanFiles();

    io.netty.handler.codec.http.multipart.InterfaceHttpData currentPartialHttpData();

    void destroy();

    io.netty.handler.codec.http.multipart.InterfaceHttpData getBodyHttpData(java.lang.String r1);

    java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> getBodyHttpDatas();

    java.util.List<io.netty.handler.codec.http.multipart.InterfaceHttpData> getBodyHttpDatas(java.lang.String r1);

    int getDiscardThreshold();

    boolean hasNext();

    boolean isMultipart();

    io.netty.handler.codec.http.multipart.InterfaceHttpData next();

    io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder offer(io.netty.handler.codec.http.HttpContent r1);

    void removeHttpDataFromClean(io.netty.handler.codec.http.multipart.InterfaceHttpData r1);

    void setDiscardThreshold(int r1);
}
