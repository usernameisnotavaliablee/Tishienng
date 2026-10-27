package com.huawei.hms.mlsdk.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class MLException extends java.lang.Exception {
    public static final int ANALYSIS_FAILURE = 11;
    public static final int AUTHENTICATION_REQUIRED = 15;
    public static final int DATA_MISSING = 14;
    public static final int DISCARDED = 1;
    public static final int DUPLICATE_FOUND = 8;
    public static final int EXCEED_RANGE = 13;
    public static final int HASH_MISS = 18;
    public static final int ILLEGAL_PARAMETER = 5;
    public static final int INACTIVE = 3;
    public static final int INNER = 2;
    public static final int INSUFFICIENT_RESOURCE = 10;
    public static final int INSUFFICIENT_SPACE = 17;
    public static final int INTERRUPTED = 12;
    public static final int NOT_SUPPORTED = 4;
    public static final int NO_FOUND = 7;
    public static final int NO_PERMISSION = 9;
    public static final int OVERDUE = 6;
    public static final int SUCCESS = 0;
    public static final int TFLITE_NOT_COMPATIBLE = 16;
    public static final int TOKEN_INVALID = 19;
    public static final int UNKNOWN = -1;
    private final int code;

    public MLException(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.code = r2
            return
    }

    public MLException(java.lang.String r1, int r2, java.lang.Throwable r3) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.code = r2
            return
    }

    public int getErrCode() {
            r1 = this;
            int r0 = r1.code
            return r0
    }
}
