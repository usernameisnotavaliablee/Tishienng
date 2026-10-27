package com.huawei.hms.feature.dynamic.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class e implements com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy {
    public static final java.lang.String a = "e";

    static {
            return
    }

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy
    public android.os.Bundle getModuleInfo(android.content.Context r6, java.lang.String r7) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            r5 = this;
            android.os.Bundle r0 = com.huawei.hms.feature.dynamic.DynamicModule.getRemoteModuleInfo(r6, r7)
            java.lang.String r1 = "module_version"
            int r2 = r0.getInt(r1)
            java.lang.String r3 = ":"
            if (r2 <= 0) goto L2f
            java.lang.String r6 = com.huawei.hms.feature.dynamic.e.e.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Prefer remote: The version of remote module "
            r2.append(r4)
            r2.append(r7)
            r2.append(r3)
            int r7 = r0.getInt(r1)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            com.huawei.hms.common.util.Logger.i(r6, r7)
            return r0
        L2f:
            android.os.Bundle r6 = com.huawei.hms.feature.dynamic.DynamicModule.getLocalModuleInfo(r6, r7)
            java.lang.String r0 = "local_module_version"
            int r1 = r6.getInt(r0)
            if (r1 <= 0) goto L5c
            java.lang.String r1 = com.huawei.hms.feature.dynamic.e.e.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Choose local: The version of local module "
            r2.append(r4)
            r2.append(r7)
            r2.append(r3)
            int r7 = r6.getInt(r0)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            com.huawei.hms.common.util.Logger.i(r1, r7)
            return r6
        L5c:
            java.lang.String r6 = com.huawei.hms.feature.dynamic.e.e.a
            java.lang.String r7 = "Cannot get module info in remote or local."
            com.huawei.hms.common.util.Logger.i(r6, r7)
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            return r6
    }
}
