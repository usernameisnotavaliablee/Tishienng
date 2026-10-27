package io.netty.handler.codec.http.cookie;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Cookie extends java.lang.Comparable<io.netty.handler.codec.http.cookie.Cookie> {
    public static final long UNDEFINED_MAX_AGE = Long.MIN_VALUE;

    java.lang.String domain();

    boolean isHttpOnly();

    boolean isSecure();

    long maxAge();

    java.lang.String name();

    java.lang.String path();

    void setDomain(java.lang.String r1);

    void setHttpOnly(boolean r1);

    void setMaxAge(long r1);

    void setPath(java.lang.String r1);

    void setSecure(boolean r1);

    void setValue(java.lang.String r1);

    void setWrap(boolean r1);

    java.lang.String value();

    boolean wrap();
}
