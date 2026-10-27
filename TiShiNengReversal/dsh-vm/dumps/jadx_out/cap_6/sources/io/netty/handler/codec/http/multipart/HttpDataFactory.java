package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface HttpDataFactory {
    void cleanAllHttpData();

    @java.lang.Deprecated
    void cleanAllHttpDatas();

    void cleanRequestHttpData(io.netty.handler.codec.http.HttpRequest r1);

    @java.lang.Deprecated
    void cleanRequestHttpDatas(io.netty.handler.codec.http.HttpRequest r1);

    io.netty.handler.codec.http.multipart.Attribute createAttribute(io.netty.handler.codec.http.HttpRequest r1, java.lang.String r2);

    io.netty.handler.codec.http.multipart.Attribute createAttribute(io.netty.handler.codec.http.HttpRequest r1, java.lang.String r2, long r3);

    io.netty.handler.codec.http.multipart.Attribute createAttribute(io.netty.handler.codec.http.HttpRequest r1, java.lang.String r2, java.lang.String r3);

    io.netty.handler.codec.http.multipart.FileUpload createFileUpload(io.netty.handler.codec.http.HttpRequest r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.nio.charset.Charset r6, long r7);

    void removeHttpDataFromClean(io.netty.handler.codec.http.HttpRequest r1, io.netty.handler.codec.http.multipart.InterfaceHttpData r2);

    void setMaxLimit(long r1);
}
