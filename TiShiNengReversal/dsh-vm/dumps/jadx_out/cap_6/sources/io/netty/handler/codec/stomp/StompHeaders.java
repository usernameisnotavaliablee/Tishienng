package io.netty.handler.codec.stomp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface StompHeaders extends io.netty.handler.codec.Headers<java.lang.CharSequence, java.lang.CharSequence, io.netty.handler.codec.stomp.StompHeaders> {
    public static final io.netty.util.AsciiString ACCEPT_VERSION = null;
    public static final io.netty.util.AsciiString ACK = null;
    public static final io.netty.util.AsciiString CONTENT_LENGTH = null;
    public static final io.netty.util.AsciiString CONTENT_TYPE = null;
    public static final io.netty.util.AsciiString DESTINATION = null;
    public static final io.netty.util.AsciiString HEART_BEAT = null;
    public static final io.netty.util.AsciiString HOST = null;
    public static final io.netty.util.AsciiString ID = null;
    public static final io.netty.util.AsciiString LOGIN = null;
    public static final io.netty.util.AsciiString MESSAGE = null;
    public static final io.netty.util.AsciiString MESSAGE_ID = null;
    public static final io.netty.util.AsciiString PASSCODE = null;
    public static final io.netty.util.AsciiString RECEIPT = null;
    public static final io.netty.util.AsciiString RECEIPT_ID = null;
    public static final io.netty.util.AsciiString SERVER = null;
    public static final io.netty.util.AsciiString SESSION = null;
    public static final io.netty.util.AsciiString SUBSCRIPTION = null;
    public static final io.netty.util.AsciiString TRANSACTION = null;
    public static final io.netty.util.AsciiString VERSION = null;

    static {
            java.lang.String r0 = "accept-version"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.stomp.StompHeaders.ACCEPT_VERSION = r0
            java.lang.String r0 = "host"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.stomp.StompHeaders.HOST = r0
            java.lang.String r0 = "login"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.stomp.StompHeaders.LOGIN = r0
            java.lang.String r0 = "passcode"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.stomp.StompHeaders.PASSCODE = r0
            java.lang.String r0 = "heart-beat"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.stomp.StompHeaders.HEART_BEAT = r0
            java.lang.String r0 = "version"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.stomp.StompHeaders.VERSION = r0
            java.lang.String r0 = "session"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.stomp.StompHeaders.SESSION = r0
            java.lang.String r0 = "server"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.stomp.StompHeaders.SERVER = r0
            java.lang.String r0 = "destination"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.stomp.StompHeaders.DESTINATION = r0
            java.lang.String r0 = "id"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.stomp.StompHeaders.ID = r0
            java.lang.String r0 = "ack"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.stomp.StompHeaders.ACK = r0
            java.lang.String r0 = "transaction"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.stomp.StompHeaders.TRANSACTION = r0
            java.lang.String r0 = "receipt"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.stomp.StompHeaders.RECEIPT = r0
            java.lang.String r0 = "message-id"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.stomp.StompHeaders.MESSAGE_ID = r0
            java.lang.String r0 = "subscription"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.stomp.StompHeaders.SUBSCRIPTION = r0
            java.lang.String r0 = "receipt-id"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.stomp.StompHeaders.RECEIPT_ID = r0
            java.lang.String r0 = "message"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.stomp.StompHeaders.MESSAGE = r0
            java.lang.String r0 = "content-length"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.stomp.StompHeaders.CONTENT_LENGTH = r0
            java.lang.String r0 = "content-type"
            io.netty.util.AsciiString r0 = io.netty.util.AsciiString.cached(r0)
            io.netty.handler.codec.stomp.StompHeaders.CONTENT_TYPE = r0
            return
    }

    boolean contains(java.lang.CharSequence r1, java.lang.CharSequence r2, boolean r3);

    java.util.List<java.lang.String> getAllAsString(java.lang.CharSequence r1);

    java.lang.String getAsString(java.lang.CharSequence r1);

    java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> iteratorAsString();
}
