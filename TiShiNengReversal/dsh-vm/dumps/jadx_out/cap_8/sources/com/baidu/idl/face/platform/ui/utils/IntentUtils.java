package com.baidu.idl.face.platform.ui.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class IntentUtils {
    private static com.baidu.idl.face.platform.ui.utils.IntentUtils instance;
    private java.lang.String mBitmap;

    static {
            return
    }

    public IntentUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.baidu.idl.face.platform.ui.utils.IntentUtils getInstance() {
            com.baidu.idl.face.platform.ui.utils.IntentUtils r0 = com.baidu.idl.face.platform.ui.utils.IntentUtils.instance
            if (r0 != 0) goto L19
            java.lang.Class<com.baidu.idl.face.platform.ui.utils.IntentUtils> r0 = com.baidu.idl.face.platform.ui.utils.IntentUtils.class
            monitor-enter(r0)
            com.baidu.idl.face.platform.ui.utils.IntentUtils r1 = com.baidu.idl.face.platform.ui.utils.IntentUtils.instance     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.baidu.idl.face.platform.ui.utils.IntentUtils r1 = new com.baidu.idl.face.platform.ui.utils.IntentUtils     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.baidu.idl.face.platform.ui.utils.IntentUtils.instance = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.baidu.idl.face.platform.ui.utils.IntentUtils r0 = com.baidu.idl.face.platform.ui.utils.IntentUtils.instance
            return r0
    }

    public java.lang.String getBitmap() {
            r1 = this;
            java.lang.String r0 = r1.mBitmap
            return r0
    }

    public void release() {
            r1 = this;
            com.baidu.idl.face.platform.ui.utils.IntentUtils r0 = com.baidu.idl.face.platform.ui.utils.IntentUtils.instance
            if (r0 == 0) goto L7
            r0 = 0
            com.baidu.idl.face.platform.ui.utils.IntentUtils.instance = r0
        L7:
            return
    }

    public void setBitmap(java.lang.String r1) {
            r0 = this;
            r0.mBitmap = r1
            return
    }
}
