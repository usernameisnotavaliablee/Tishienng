package com.huawei.hms.feature.dynamic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class d {
    public static final java.lang.String b = "d";
    public static final com.huawei.hms.feature.dynamic.d c = null;
    public java.util.Set<java.lang.String> a;

    static {
            com.huawei.hms.feature.dynamic.d r0 = new com.huawei.hms.feature.dynamic.d
            r0.<init>()
            com.huawei.hms.feature.dynamic.d.c = r0
            return
    }

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.huawei.hms.feature.dynamic.d a() {
            com.huawei.hms.feature.dynamic.d r0 = com.huawei.hms.feature.dynamic.d.c
            return r0
    }

    public void a(android.os.Bundle r4) {
            r3 = this;
            java.lang.String r0 = "installed_module_name"
            java.util.ArrayList r4 = r4.getStringArrayList(r0)
            if (r4 == 0) goto L2d
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Lf
            goto L2d
        Lf:
            java.lang.String r0 = com.huawei.hms.feature.dynamic.d.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Installed module name:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.huawei.hms.common.util.Logger.i(r0, r1)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r4)
            r3.a = r0
            return
        L2d:
            java.lang.String r4 = com.huawei.hms.feature.dynamic.d.b
            java.lang.String r0 = "Get installed module name failed."
            com.huawei.hms.common.util.Logger.w(r4, r0)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r3.a = r4
            return
    }
}
