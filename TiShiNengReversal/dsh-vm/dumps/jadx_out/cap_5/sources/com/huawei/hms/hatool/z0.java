package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class z0 {
    private static com.huawei.hms.hatool.z0 c;
    private boolean a;
    private android.content.Context b;

    static {
            com.huawei.hms.hatool.z0 r0 = new com.huawei.hms.hatool.z0
            r0.<init>()
            com.huawei.hms.hatool.z0.c = r0
            return
    }

    private z0() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            android.content.Context r0 = com.huawei.hms.hatool.y0.q()
            r1.b = r0
            return
    }

    public static com.huawei.hms.hatool.z0 b() {
            com.huawei.hms.hatool.z0 r0 = com.huawei.hms.hatool.z0.c
            return r0
    }

    @android.annotation.TargetApi(24)
    public boolean a() {
            r4 = this;
            boolean r0 = r4.a
            if (r0 != 0) goto L26
            android.content.Context r0 = r4.b
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L24
            java.lang.String r2 = "user"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.os.UserManager r0 = (android.os.UserManager) r0
            if (r0 == 0) goto L21
            boolean r0 = com.huawei.hms.framework.common.f.a(r0)
        L1e:
            r4.a = r0
            goto L26
        L21:
            r4.a = r1
            goto L26
        L24:
            r0 = 1
            goto L1e
        L26:
            boolean r0 = r4.a
            return r0
    }
}
