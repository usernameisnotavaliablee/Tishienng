package io.netty.handler.codec.spdy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface SpdySettingsFrame extends io.netty.handler.codec.spdy.SpdyFrame {
    public static final int SETTINGS_CLIENT_CERTIFICATE_VECTOR_SIZE = 8;
    public static final int SETTINGS_CURRENT_CWND = 5;
    public static final int SETTINGS_DOWNLOAD_BANDWIDTH = 2;
    public static final int SETTINGS_DOWNLOAD_RETRANS_RATE = 6;
    public static final int SETTINGS_INITIAL_WINDOW_SIZE = 7;
    public static final int SETTINGS_MAX_CONCURRENT_STREAMS = 4;
    public static final int SETTINGS_MINOR_VERSION = 0;
    public static final int SETTINGS_ROUND_TRIP_TIME = 3;
    public static final int SETTINGS_UPLOAD_BANDWIDTH = 1;

    boolean clearPreviouslyPersistedSettings();

    int getValue(int r1);

    java.util.Set<java.lang.Integer> ids();

    boolean isPersistValue(int r1);

    boolean isPersisted(int r1);

    boolean isSet(int r1);

    io.netty.handler.codec.spdy.SpdySettingsFrame removeValue(int r1);

    io.netty.handler.codec.spdy.SpdySettingsFrame setClearPreviouslyPersistedSettings(boolean r1);

    io.netty.handler.codec.spdy.SpdySettingsFrame setPersistValue(int r1, boolean r2);

    io.netty.handler.codec.spdy.SpdySettingsFrame setPersisted(int r1, boolean r2);

    io.netty.handler.codec.spdy.SpdySettingsFrame setValue(int r1, int r2);

    io.netty.handler.codec.spdy.SpdySettingsFrame setValue(int r1, int r2, boolean r3, boolean r4);
}
