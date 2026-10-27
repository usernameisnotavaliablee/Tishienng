package xyz.adscope.common.v2.conn.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class CommonHeader extends java.util.HashMap<java.lang.String, java.lang.String> {
    public static final java.lang.String HEADER_KEY_ACCEPT = "Accept";
    public static final java.lang.String HEADER_KEY_ACCEPT_ENCRYPT = "Accept-Encrypt";
    public static final java.lang.String HEADER_KEY_CONNECTION = "Connection";
    public static final java.lang.String HEADER_KEY_CONTENT_TYPE = "Content-Type";
    public static final java.lang.String HEADER_KEY_LOCATION = "Location";
    public static final java.lang.String HEADER_KEY_USER_AGENT = "User-Agent";
    public static final java.lang.String HEADER_KEY_X_REQUEST = "X-Requested-With";
    public static final java.lang.String HEADER_VALUE_ACCEPT_ALL = "*/*";
    public static final java.lang.String HEADER_VALUE_APPLICATION_STREAM = "application/octet-stream";
    public static final java.lang.String HEADER_VALUE_APPLICATION_URLENCODED = "application/json";
    public static final java.lang.String HEADER_VALUE_KEEP_ALIVE = "keep-alive";

    public CommonHeader() {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "Accept"
            java.lang.String r1 = "*/*"
            r2.put(r0, r1)
            java.lang.String r0 = "Content-Type"
            java.lang.String r1 = "application/json"
            r2.put(r0, r1)
            java.lang.String r0 = "Connection"
            java.lang.String r1 = "keep-alive"
            r2.put(r0, r1)
            return
    }

    public static xyz.adscope.common.v2.conn.http.CommonHeader obtainBasicHeader() {
            xyz.adscope.common.v2.conn.http.CommonHeader r0 = new xyz.adscope.common.v2.conn.http.CommonHeader
            r0.<init>()
            return r0
    }
}
