package com.bxkj.student.v2.common.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class n {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.utils.n a = null;

    static {
            com.bxkj.student.v2.common.utils.n r0 = new com.bxkj.student.v2.common.utils.n
            r0.<init>()
            com.bxkj.student.v2.common.utils.n.a = r0
            return
    }

    private n() {
            r0 = this;
            r0.<init>()
            return
    }

    public final boolean a() {
            r3 = this;
            java.lang.String r0 = "http.proxyHost"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "http.proxyPort"
            java.lang.String r2 = "-1"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            int r1 = java.lang.Integer.parseInt(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1d
            r0 = -1
            if (r1 == r0) goto L1d
            r0 = 1
            return r0
        L1d:
            r0 = 0
            return r0
    }
}
