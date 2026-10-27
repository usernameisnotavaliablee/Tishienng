package com.umeng.socialize.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class URLBuilder {
    private java.lang.String imei;
    private java.lang.String mAppkey;
    private java.lang.String mEntityKey;
    private java.lang.String mHost;
    private java.lang.String mOpId;
    private java.lang.String mPath;
    private java.lang.String mPlatfrom;
    private java.lang.String mReqType;
    private java.lang.String mSessionId;
    private java.lang.String mUID;
    private java.lang.String mac;
    private java.lang.String model;
    private java.lang.String network;
    private java.lang.String os;
    private java.lang.String protoversion;
    private java.lang.String sdkversion;
    private java.lang.String ts;

    public URLBuilder(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "0"
            r2.mReqType = r0
            r0 = 0
            r2.mHost = r0
            r2.mPath = r0
            r2.mAppkey = r0
            r2.mEntityKey = r0
            r2.mOpId = r0
            r2.mUID = r0
            r2.mSessionId = r0
            r2.mPlatfrom = r0
            r2.imei = r0
            r2.mac = r0
            r2.network = r0
            r2.model = r0
            r2.sdkversion = r0
            r2.os = r0
            r2.ts = r0
            r2.protoversion = r0
            java.lang.String r0 = com.umeng.socialize.utils.DeviceConfig.getDeviceId(r3)
            r2.imei = r0
            java.lang.String r0 = com.umeng.socialize.utils.DeviceConfig.getMac(r3)
            r2.mac = r0
            java.lang.String[] r3 = com.umeng.socialize.utils.DeviceConfig.getNetworkAccessMode(r3)
            r0 = 0
            r3 = r3[r0]
            r2.network = r3
            java.lang.String r3 = android.os.Build.MODEL
            r2.model = r3
            java.lang.String r3 = "7.3.2"
            r2.sdkversion = r3
            java.lang.String r3 = "Android"
            r2.os = r3
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = java.lang.String.valueOf(r0)
            r2.ts = r3
            java.lang.String r3 = "3.0"
            r2.protoversion = r3
            return
    }

    private java.lang.String buildParams() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "via="
            r0.append(r1)
            java.lang.String r1 = r2.mPlatfrom
            java.lang.String r1 = r1.toLowerCase()
            r0.append(r1)
            java.lang.String r1 = "&opid="
            r0.append(r1)
            java.lang.String r1 = r2.mOpId
            r0.append(r1)
            java.lang.String r1 = "&ak="
            r0.append(r1)
            java.lang.String r1 = r2.mAppkey
            r0.append(r1)
            java.lang.String r1 = "&pcv="
            r0.append(r1)
            java.lang.String r1 = r2.protoversion
            r0.append(r1)
            java.lang.String r1 = "&tp="
            r0.append(r1)
            java.lang.String r1 = r2.mReqType
            r0.append(r1)
            java.lang.String r1 = r2.imei
            if (r1 == 0) goto L49
            java.lang.String r1 = "&imei="
            r0.append(r1)
            java.lang.String r1 = r2.imei
            r0.append(r1)
        L49:
            java.lang.String r1 = r2.mac
            if (r1 == 0) goto L57
            java.lang.String r1 = "&mac="
            r0.append(r1)
            java.lang.String r1 = r2.mac
            r0.append(r1)
        L57:
            java.lang.String r1 = r2.network
            if (r1 == 0) goto L65
            java.lang.String r1 = "&en="
            r0.append(r1)
            java.lang.String r1 = r2.network
            r0.append(r1)
        L65:
            java.lang.String r1 = r2.model
            if (r1 == 0) goto L73
            java.lang.String r1 = "&de="
            r0.append(r1)
            java.lang.String r1 = r2.model
            r0.append(r1)
        L73:
            java.lang.String r1 = r2.sdkversion
            if (r1 == 0) goto L81
            java.lang.String r1 = "&sdkv="
            r0.append(r1)
            java.lang.String r1 = r2.sdkversion
            r0.append(r1)
        L81:
            java.lang.String r1 = r2.os
            if (r1 == 0) goto L8f
            java.lang.String r1 = "&os="
            r0.append(r1)
            java.lang.String r1 = r2.os
            r0.append(r1)
        L8f:
            java.lang.String r1 = r2.ts
            if (r1 == 0) goto L9d
            java.lang.String r1 = "&dt="
            r0.append(r1)
            java.lang.String r1 = r2.ts
            r0.append(r1)
        L9d:
            java.lang.String r1 = r2.mUID
            if (r1 == 0) goto Lab
            java.lang.String r1 = "&uid="
            r0.append(r1)
            java.lang.String r1 = r2.mUID
            r0.append(r1)
        Lab:
            java.lang.String r1 = r2.mEntityKey
            if (r1 == 0) goto Lb9
            java.lang.String r1 = "&ek="
            r0.append(r1)
            java.lang.String r1 = r2.mEntityKey
            r0.append(r1)
        Lb9:
            java.lang.String r1 = r2.mSessionId
            if (r1 == 0) goto Lc7
            java.lang.String r1 = "&sid="
            r0.append(r1)
            java.lang.String r1 = r2.mSessionId
            r0.append(r1)
        Lc7:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public com.umeng.socialize.utils.URLBuilder setAppkey(java.lang.String r1) {
            r0 = this;
            r0.mAppkey = r1
            return r0
    }

    public com.umeng.socialize.utils.URLBuilder setEntityKey(java.lang.String r1) {
            r0 = this;
            r0.mEntityKey = r1
            return r0
    }

    public com.umeng.socialize.utils.URLBuilder setHost(java.lang.String r1) {
            r0 = this;
            r0.mHost = r1
            return r0
    }

    public com.umeng.socialize.utils.URLBuilder setPath(java.lang.String r1) {
            r0 = this;
            r0.mPath = r1
            return r0
    }

    public java.lang.String to() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.mHost
            r0.append(r1)
            java.lang.String r1 = r2.mPath
            r0.append(r1)
            java.lang.String r1 = r2.mAppkey
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            java.lang.String r1 = r2.mEntityKey
            r0.append(r1)
            java.lang.String r1 = "/?"
            r0.append(r1)
            java.lang.String r1 = r2.buildParams()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toEncript() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.mHost
            r0.append(r1)
            java.lang.String r1 = r2.mPath
            r0.append(r1)
            java.lang.String r1 = r2.mAppkey
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            java.lang.String r1 = r2.mEntityKey
            r0.append(r1)
            java.lang.String r1 = "/?"
            r0.append(r1)
            java.lang.String r1 = r2.buildParams()
            r0.append(r1)     // Catch: java.lang.Exception -> L2b
            goto L2e
        L2b:
            r0.append(r1)
        L2e:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public com.umeng.socialize.utils.URLBuilder withMedia(com.umeng.socialize.bean.SHARE_MEDIA r1) {
            r0 = this;
            java.lang.String r1 = r1.toString()
            r0.mPlatfrom = r1
            return r0
    }

    public com.umeng.socialize.utils.URLBuilder withOpId(java.lang.String r1) {
            r0 = this;
            r0.mOpId = r1
            return r0
    }

    public com.umeng.socialize.utils.URLBuilder withSessionId(java.lang.String r1) {
            r0 = this;
            r0.mSessionId = r1
            return r0
    }

    public com.umeng.socialize.utils.URLBuilder withUID(java.lang.String r1) {
            r0 = this;
            r0.mUID = r1
            return r0
    }
}
