package com.bytedance.pangle.util;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class oq {
    public oq() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String j(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L9
            java.lang.String r1 = ""
            return r1
        L9:
            byte[] r1 = r1.getBytes()
            r0 = 10
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)
            return r1
    }

    public static java.lang.String xt(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L9
            java.lang.String r1 = ""
            return r1
        L9:
            r0 = 10
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }
}
