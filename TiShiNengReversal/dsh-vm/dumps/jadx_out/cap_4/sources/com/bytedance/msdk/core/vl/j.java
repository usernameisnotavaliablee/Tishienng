package com.bytedance.msdk.core.vl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    private static final java.util.Map<java.lang.String, com.bytedance.msdk.core.vl.j.InterfaceC0230j> j = null;

    /* renamed from: com.bytedance.msdk.core.vl.j$j, reason: collision with other inner class name */
    public interface InterfaceC0230j {
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            com.bytedance.msdk.core.vl.j.j = r0
            return
    }

    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void j(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            return
        L7:
            xt(r1)
            return
    }

    public static void j(java.lang.String r0, java.lang.String r1) {
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L7
            return
        L7:
            xt(r0)
            return
    }

    private static com.bytedance.msdk.core.vl.j.InterfaceC0230j xt(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.util.Map<java.lang.String, com.bytedance.msdk.core.vl.j$j> r0 = com.bytedance.msdk.core.vl.j.j
            java.lang.Object r1 = r0.remove(r1)
            com.bytedance.msdk.core.vl.j$j r1 = (com.bytedance.msdk.core.vl.j.InterfaceC0230j) r1
            return r1
    }
}
