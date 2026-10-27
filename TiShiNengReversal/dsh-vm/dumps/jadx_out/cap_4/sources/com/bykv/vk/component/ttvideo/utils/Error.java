package com.bykv.vk.component.ttvideo.utils;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class Error {
    public static final int AUDIO_HARDWARE_DECODER_WRITE_ERROR = -499978;
    public static final int BUFFERING_TIME_OUT_ERROR = -499982;
    public static final java.lang.String DataLoaderPreload = "kTTVideoErrorDomainDataLoaderPreload";
    public static final int ERROR_TYPE_CDN = 1003;
    public static final int ERROR_TYPE_PLAYER = 1002;
    public static final int OPEN_TIME_OUT_ERROR = -1414092869;
    public static final int PlayerStateIllegal = -9992;
    public static final int PreloadInvalidParameter = -100001;
    public static final int PreloadMDLStateError = -100002;
    public static final int PreloadSameKeyError = -100003;
    public static final int PreloadTrackEmptyError = -100004;
    public static final int TCP_READ_NETWORK_TIMEOUT = -499793;
    public static final int VIDEO_HARDWARE_DECODER_WRITE_ERROR = -499977;
    public static final java.lang.String VideoOSPlayer = "kTTVideoErrorDomainVideoOSPlayer";
    public static final java.lang.String VideoOwnPlayer = "kTTVideoErrorDomainVideoOwnPlayer";
    public int a;
    public int b;
    public java.lang.String c;
    public java.lang.String d;
    public java.util.Map e;

    public Error(java.lang.String r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public Error(java.lang.String r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public Error(java.lang.String r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.a = r2
            r0.b = r3
            r0.d = r4
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.e = r1
            return
    }

    public Error(java.lang.String r2, int r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public int getCode() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    public java.lang.String getDomain() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    public int getInternalCode() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public java.util.Map getParameters() {
            r1 = this;
            java.util.Map r0 = r1.e
            return r0
    }

    public int getType() {
            r2 = this;
            java.lang.String r0 = r2.c
            java.lang.String r1 = "kTTVideoErrorDomainVideoOwnPlayer"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L13
            boolean r0 = r2.needRestartPlayer()
            if (r0 == 0) goto L13
            r0 = 1002(0x3ea, float:1.404E-42)
            return r0
        L13:
            r0 = 1003(0x3eb, float:1.406E-42)
            return r0
    }

    public boolean needFallbackOS() {
            r2 = this;
            int r0 = r2.a
            r1 = -499978(0xfffffffffff85ef6, float:NaN)
            if (r0 == r1) goto Le
            r1 = -499977(0xfffffffffff85ef7, float:NaN)
            if (r0 == r1) goto Le
            r0 = 0
            return r0
        Le:
            r0 = 1
            return r0
    }

    public boolean needRestartPlayer() {
            r2 = this;
            int r0 = r2.a
            r1 = -499999(0xfffffffffff85ee1, float:NaN)
            if (r0 == r1) goto L2c
            r1 = -499997(0xfffffffffff85ee3, float:NaN)
            if (r0 == r1) goto L2c
            r1 = -499996(0xfffffffffff85ee4, float:NaN)
            if (r0 == r1) goto L2c
            r1 = -499992(0xfffffffffff85ee8, float:NaN)
            if (r0 == r1) goto L2c
            r1 = -499991(0xfffffffffff85ee9, float:NaN)
            if (r0 == r1) goto L2c
            r1 = -499990(0xfffffffffff85eea, float:NaN)
            if (r0 == r1) goto L2c
            r1 = -499989(0xfffffffffff85eeb, float:NaN)
            if (r0 == r1) goto L2c
            r1 = -2139062143(0xffffffff80808081, float:-1.1801042E-38)
            if (r0 == r1) goto L2c
            r0 = 0
            return r0
        L2c:
            r0 = 1
            return r0
    }

    public boolean notNeedRetry() {
            r2 = this;
            int r0 = r2.a
            r1 = -499982(0xfffffffffff85ef2, float:NaN)
            if (r0 == r1) goto L13
            r1 = -499793(0xfffffffffff85faf, float:NaN)
            if (r0 == r1) goto L13
            r1 = -1414092869(0xffffffffabb6a7bb, float:-1.2978432E-12)
            if (r0 == r1) goto L13
            r0 = 0
            return r0
        L13:
            r0 = 1
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.String r0 = r6.c
            int r1 = r6.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r6.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = r6.d
            if (r3 != 0) goto L14
            java.lang.String r3 = ""
        L14:
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 3
            r4[r0] = r3
            java.lang.String r0 = "domain:%s, code:%d, internalCode:%d, description:%s"
            java.lang.String r0 = java.lang.String.format(r0, r4)
            return r0
    }
}
