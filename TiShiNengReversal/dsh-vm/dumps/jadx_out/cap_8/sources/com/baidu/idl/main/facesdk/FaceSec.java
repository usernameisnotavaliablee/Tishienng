package com.baidu.idl.main.facesdk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceSec {
    public static final java.lang.String TAG = "FaceSec";
    public byte[] value;

    static {
            return
    }

    public FaceSec() {
            r0 = this;
            r0.<init>()
            return
    }

    private native java.lang.String decrypt(java.lang.String r1);

    private native java.lang.String encrypt(java.lang.String r1);

    private native int init(android.content.res.AssetManager r1);

    private native java.lang.String sec(byte[] r1);

    public java.lang.String d(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lb
            java.lang.String r2 = r1.decrypt(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public java.lang.String e(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto Lb
            java.lang.String r2 = r1.encrypt(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public java.lang.String e(byte[] r1) {
            r0 = this;
            java.lang.String r1 = r0.sec(r1)
            return r1
    }

    public int i(android.content.Context r2) {
            r1 = this;
            if (r2 == 0) goto L15
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch: java.lang.Exception -> L15
            int r2 = r1.init(r2)     // Catch: java.lang.Exception -> L15
            if (r2 != 0) goto Ld
            return r2
        Ld:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Exception -> L15
            java.lang.String r0 = "face sdk init sec error"
            r2.<init>(r0)     // Catch: java.lang.Exception -> L15
            throw r2     // Catch: java.lang.Exception -> L15
        L15:
            r2 = -1
            return r2
    }
}
