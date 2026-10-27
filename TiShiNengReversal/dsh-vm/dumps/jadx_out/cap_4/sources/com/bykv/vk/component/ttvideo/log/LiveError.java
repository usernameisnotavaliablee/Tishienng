package com.bykv.vk.component.ttvideo.log;

@com.bykv.vk.component.ttvideo.player.Keep
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class LiveError extends java.lang.Error {
    public static final int AGAIN_ERROR = -100014;
    public static final int BYTEVC1_URL_IS_NULL = -100017;
    public static final int DNS_PARSE_ERROR = -100010;
    public static final int EMPTY = -100011;
    public static final int INFO_DND_ERROR = -100012;
    public static final int IO_BLOCKED = -100018;
    public static final int LIVE_API_URL_INVALID = -100006;
    public static final int LIVE_DATA_EMPTY = -100005;
    public static final int NETWORK_IO_ERROR = -100008;
    public static final int NO_ERROR = 0;
    public static final int PARSE_JSON = -100000;
    public static final int PLAYER_DATASOURCE = -100002;
    public static final int PLAYER_INTERNAL = -100003;
    public static final int PLAYER_PREPARE = -100001;
    public static final int PLAYER_STALL = -100015;
    public static final int PLAY_DNS_ERROR = -100013;
    public static final int QUIC_LOAD_LIBRARY_ERROR = -499499;
    public static final int RESPONSE_ERROR = -100004;
    public static final int SEI_UPLOAD_TIME_OUT = -100016;
    public static final int STALL_RETRY_TIMEOUT = -100007;
    public static final int STREAM_DRYUP = -100009;
    private static final java.lang.String TAG = "Live Error";
    public int code;
    public java.util.Map info;
    public long timeStamp;

    public LiveError(int r1, java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
            r0 = this;
            r0.<init>(r2)
            r0.code = r1
            r0.info = r3
            long r1 = java.lang.System.currentTimeMillis()
            r0.timeStamp = r1
            return
    }

    public java.lang.String getInfoJSON() {
            r4 = this;
            java.util.Map r0 = r4.info
            if (r0 != 0) goto Lb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.info = r0
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject
            java.util.Map r1 = r4.info
            r0.<init>(r1)
            java.lang.String r1 = "timestamp"
            long r2 = r4.timeStamp     // Catch: org.json.JSONException -> L22
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L22
            java.lang.String r1 = "message"
            java.lang.String r2 = super.toString()     // Catch: org.json.JSONException -> L22
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L22
        L22:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
            r4 = this;
            java.util.Map r0 = r4.info
            if (r0 != 0) goto Lb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.info = r0
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject
            java.util.Map r1 = r4.info
            r0.<init>(r1)
            java.lang.String r1 = "message"
            java.lang.String r2 = super.toString()     // Catch: org.json.JSONException -> L29
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L29
            java.lang.String r1 = "code"
            int r2 = r4.code     // Catch: org.json.JSONException -> L29
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L29
            java.lang.String r1 = "timestamp"
            long r2 = r4.timeStamp     // Catch: org.json.JSONException -> L29
            r0.put(r1, r2)     // Catch: org.json.JSONException -> L29
        L29:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
