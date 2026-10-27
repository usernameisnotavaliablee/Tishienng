package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Cookie extends io.netty.handler.codec.http.cookie.Cookie {
    @java.lang.Deprecated
    java.lang.String comment();

    @java.lang.Deprecated
    java.lang.String commentUrl();

    @java.lang.Deprecated
    java.lang.String getComment();

    @java.lang.Deprecated
    java.lang.String getCommentUrl();

    @java.lang.Deprecated
    java.lang.String getDomain();

    @java.lang.Deprecated
    long getMaxAge();

    @java.lang.Deprecated
    java.lang.String getName();

    @java.lang.Deprecated
    java.lang.String getPath();

    @java.lang.Deprecated
    java.util.Set<java.lang.Integer> getPorts();

    @java.lang.Deprecated
    java.lang.String getValue();

    @java.lang.Deprecated
    int getVersion();

    @java.lang.Deprecated
    boolean isDiscard();

    @Override // io.netty.handler.codec.http.cookie.Cookie
    @java.lang.Deprecated
    long maxAge();

    @java.lang.Deprecated
    java.util.Set<java.lang.Integer> ports();

    @java.lang.Deprecated
    void setComment(java.lang.String r1);

    @java.lang.Deprecated
    void setCommentUrl(java.lang.String r1);

    @java.lang.Deprecated
    void setDiscard(boolean r1);

    @Override // io.netty.handler.codec.http.cookie.Cookie
    @java.lang.Deprecated
    void setMaxAge(long r1);

    @java.lang.Deprecated
    void setPorts(java.lang.Iterable<java.lang.Integer> r1);

    @java.lang.Deprecated
    void setPorts(int... r1);

    @java.lang.Deprecated
    void setVersion(int r1);

    @java.lang.Deprecated
    int version();
}
