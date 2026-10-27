package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class HttpConstants {
    public static final byte COLON = 58;
    public static final byte COMMA = 44;
    public static final byte CR = 13;
    public static final java.nio.charset.Charset DEFAULT_CHARSET = null;
    public static final byte DOUBLE_QUOTE = 34;
    public static final byte EQUALS = 61;
    public static final byte HT = 9;
    public static final byte LF = 10;
    public static final byte SEMICOLON = 59;
    public static final byte SP = 32;
    public static final char SP_CHAR = ' ';

    static {
            java.nio.charset.Charset r0 = io.netty.util.CharsetUtil.UTF_8
            io.netty.handler.codec.http.HttpConstants.DEFAULT_CHARSET = r0
            return
    }

    private HttpConstants() {
            r0 = this;
            r0.<init>()
            return
    }
}
