package com.huawei.hms.framework.network.grs;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class GrsApp {
    private static final java.lang.String BRAND = null;
    private static final com.huawei.hms.framework.network.grs.GrsApp INSTANCE = null;
    private static final java.lang.String TAG = "GrsApp";
    private java.lang.String appConfigName;

    static {
            com.huawei.hms.framework.network.grs.GrsApp r0 = new com.huawei.hms.framework.network.grs.GrsApp
            r0.<init>()
            com.huawei.hms.framework.network.grs.GrsApp.INSTANCE = r0
            java.lang.Class<com.huawei.hms.framework.network.grs.GrsApp> r0 = com.huawei.hms.framework.network.grs.GrsApp.class
            java.lang.Package r0 = r0.getPackage()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.huawei.hms.framework.network.grs"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L1e
            java.lang.String r0 = ""
        L1b:
            com.huawei.hms.framework.network.grs.GrsApp.BRAND = r0
            return
        L1e:
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "current brand is: "
            r1.append(r2)
            r2 = 1
            r3 = r0[r2]
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "GrsApp"
            com.huawei.hms.framework.common.Logger.v(r3, r1)
            r0 = r0[r2]
            goto L1b
    }

    private GrsApp() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.huawei.hms.framework.network.grs.GrsApp getInstance() {
            com.huawei.hms.framework.network.grs.GrsApp r0 = com.huawei.hms.framework.network.grs.GrsApp.INSTANCE
            return r0
    }

    public java.lang.String getAppConfigName() {
            r1 = this;
            java.lang.String r0 = r1.appConfigName
            return r0
    }

    public java.lang.String getBrand(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = com.huawei.hms.framework.network.grs.GrsApp.BRAND
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Lb
            java.lang.String r3 = ""
            return r3
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }

    public java.lang.String getIssueCountryCode(android.content.Context r2) {
            r1 = this;
            r0 = 0
            com.huawei.hms.framework.network.grs.local.model.CountryCodeBean r2 = com.huawei.hms.framework.network.grs.a.a(r2, r0)
            java.lang.String r2 = r2.getCountryCode()
            return r2
    }

    public void setAppConfigName(java.lang.String r1) {
            r0 = this;
            r0.appConfigName = r1
            return
    }
}
