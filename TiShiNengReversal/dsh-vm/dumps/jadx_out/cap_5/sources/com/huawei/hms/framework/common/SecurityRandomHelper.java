package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class SecurityRandomHelper {

    @android.annotation.SuppressLint({"StaticFieldLeak"})
    public static volatile com.huawei.hms.framework.common.SecurityRandomHelper instance;

    private SecurityRandomHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.huawei.hms.framework.common.SecurityRandomHelper getInstance() {
            com.huawei.hms.framework.common.SecurityRandomHelper r0 = com.huawei.hms.framework.common.SecurityRandomHelper.instance
            if (r0 != 0) goto L1d
            java.lang.Class<com.huawei.hms.framework.common.SecurityRandomHelper> r0 = com.huawei.hms.framework.common.SecurityRandomHelper.class
            monitor-enter(r0)
            com.huawei.hms.framework.common.SecurityRandomHelper r1 = com.huawei.hms.framework.common.SecurityRandomHelper.instance     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            r1 = 1
            c2.b.i(r1)     // Catch: java.lang.Throwable -> L17
            com.huawei.hms.framework.common.SecurityRandomHelper r1 = new com.huawei.hms.framework.common.SecurityRandomHelper     // Catch: java.lang.Throwable -> L17
            r1.<init>()     // Catch: java.lang.Throwable -> L17
            com.huawei.hms.framework.common.SecurityRandomHelper.instance = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r1 = move-exception
            goto L1b
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto L1d
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
        L1d:
            com.huawei.hms.framework.common.SecurityRandomHelper r0 = com.huawei.hms.framework.common.SecurityRandomHelper.instance
            return r0
    }

    public byte[] generateSecureRandom(int r1) {
            r0 = this;
            byte[] r1 = c2.b.d(r1)
            return r1
    }

    public java.lang.String generateSecureRandomStr(int r1) {
            r0 = this;
            java.lang.String r1 = c2.b.e(r1)
            return r1
    }
}
