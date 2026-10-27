package com.bytedance.msdk.core.j.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private static com.bytedance.msdk.core.j.j.m cw;
    private static com.bytedance.msdk.core.j.j.m j;
    private static com.bytedance.msdk.core.j.j.m xt;

    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.bytedance.msdk.core.j.j.m j(java.lang.String r1) {
            java.lang.String r0 = "gdt"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L16
            com.bytedance.msdk.core.j.j.m r1 = com.bytedance.msdk.core.j.j.j.j
            if (r1 != 0) goto L13
            com.bytedance.msdk.core.j.j.xt r1 = new com.bytedance.msdk.core.j.j.xt
            r1.<init>()
            com.bytedance.msdk.core.j.j.j.j = r1
        L13:
            com.bytedance.msdk.core.j.j.m r1 = com.bytedance.msdk.core.j.j.j.j
            return r1
        L16:
            java.lang.String r0 = "ks"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L2c
            com.bytedance.msdk.core.j.j.m r1 = com.bytedance.msdk.core.j.j.j.xt
            if (r1 != 0) goto L29
            com.bytedance.msdk.core.j.j.cw r1 = new com.bytedance.msdk.core.j.j.cw
            r1.<init>()
            com.bytedance.msdk.core.j.j.j.xt = r1
        L29:
            com.bytedance.msdk.core.j.j.m r1 = com.bytedance.msdk.core.j.j.j.xt
            return r1
        L2c:
            java.lang.String r0 = "xiaomi"
            boolean r1 = android.text.TextUtils.equals(r1, r0)
            if (r1 == 0) goto L42
            com.bytedance.msdk.core.j.j.m r1 = com.bytedance.msdk.core.j.j.j.cw
            if (r1 != 0) goto L3f
            com.bytedance.msdk.core.j.j.r r1 = new com.bytedance.msdk.core.j.j.r
            r1.<init>()
            com.bytedance.msdk.core.j.j.j.cw = r1
        L3f:
            com.bytedance.msdk.core.j.j.m r1 = com.bytedance.msdk.core.j.j.j.cw
            return r1
        L42:
            r1 = 0
            return r1
    }

    public static void j(java.util.Map<java.lang.String, java.lang.Object> r3) {
            if (r3 == 0) goto L5d
            com.bytedance.msdk.core.j.j.m r0 = com.bytedance.msdk.core.j.j.j.j
            r1 = 0
            if (r0 == 0) goto L21
            java.lang.String r0 = r0.ae()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L21
            com.bytedance.msdk.core.j.j.m r0 = com.bytedance.msdk.core.j.j.j.j
            java.lang.String r0 = r0.ae()
            java.lang.String r2 = "unsupported_gdt_version"
            r3.put(r2, r0)
            com.bytedance.msdk.core.j.j.m r0 = com.bytedance.msdk.core.j.j.j.j
            r0.j(r1)
        L21:
            com.bytedance.msdk.core.j.j.m r0 = com.bytedance.msdk.core.j.j.j.xt
            if (r0 == 0) goto L3f
            java.lang.String r0 = r0.ae()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3f
            com.bytedance.msdk.core.j.j.m r0 = com.bytedance.msdk.core.j.j.j.xt
            java.lang.String r0 = r0.ae()
            java.lang.String r2 = "unsupported_ks_version"
            r3.put(r2, r0)
            com.bytedance.msdk.core.j.j.m r0 = com.bytedance.msdk.core.j.j.j.xt
            r0.j(r1)
        L3f:
            com.bytedance.msdk.core.j.j.m r0 = com.bytedance.msdk.core.j.j.j.cw
            if (r0 == 0) goto L5d
            java.lang.String r0 = r0.ae()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L5d
            com.bytedance.msdk.core.j.j.m r0 = com.bytedance.msdk.core.j.j.j.cw
            java.lang.String r0 = r0.ae()
            java.lang.String r2 = "unsupported_xiaomi_version"
            r3.put(r2, r0)
            com.bytedance.msdk.core.j.j.m r3 = com.bytedance.msdk.core.j.j.j.cw
            r3.j(r1)
        L5d:
            return
    }

    public static boolean xt(java.lang.String r1) {
            java.lang.String r0 = "gdt"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "ks"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "xiaomi"
            boolean r1 = android.text.TextUtils.equals(r1, r0)
            if (r1 == 0) goto L19
            goto L1b
        L19:
            r1 = 0
            return r1
        L1b:
            r1 = 1
            return r1
    }
}
