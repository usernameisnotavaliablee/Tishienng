package com.huawei.hms.feature.dynamic.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class d implements com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy {
    public static final java.lang.String a = "d";

    static {
            return
    }

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy
    public android.os.Bundle getModuleInfo(android.content.Context r7, java.lang.String r8) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            r6 = this;
            android.os.Bundle r0 = com.huawei.hms.feature.dynamic.DynamicModule.getRemoteModuleInfo(r7, r8)
            android.os.Bundle r7 = com.huawei.hms.feature.dynamic.DynamicModule.getLocalModuleInfo(r7, r8)
            java.lang.String r1 = com.huawei.hms.feature.dynamic.e.d.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The version of remote module "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r3 = ":"
            r2.append(r3)
            java.lang.String r4 = "module_version"
            int r5 = r0.getInt(r4)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.huawei.hms.common.util.Logger.i(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "The version of local module "
            r2.append(r5)
            r2.append(r8)
            r2.append(r3)
            java.lang.String r8 = "local_module_version"
            int r3 = r7.getInt(r8)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.huawei.hms.common.util.Logger.i(r1, r2)
            int r2 = r0.getInt(r4)
            int r8 = r7.getInt(r8)
            if (r2 < r8) goto L5c
            java.lang.String r7 = "Choose remote module info."
            com.huawei.hms.common.util.Logger.i(r1, r7)
            return r0
        L5c:
            java.lang.String r8 = "Choose local module info."
            com.huawei.hms.common.util.Logger.i(r1, r8)
            return r7
    }
}
