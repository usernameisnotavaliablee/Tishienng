package com.huawei.hms.feature.dynamic.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class c implements com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy {
    public static final java.lang.String a = "c";

    static {
            return
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.huawei.hms.feature.dynamic.DynamicModule.VersionPolicy
    public android.os.Bundle getModuleInfo(android.content.Context r8, java.lang.String r9) throws com.huawei.hms.feature.dynamic.DynamicModule.LoadingException {
            r7 = this;
            android.os.Bundle r0 = com.huawei.hms.feature.dynamic.DynamicModule.getRemoteModuleInfo(r8, r9)     // Catch: com.huawei.hms.feature.dynamic.DynamicModule.LoadingException -> L6
            r1 = 0
            goto L48
        L6:
            r0 = move-exception
            android.os.Bundle r1 = r0.getBundle()
            if (r1 == 0) goto L1b
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r1 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException
            java.lang.String r2 = r0.getMessage()
            android.os.Bundle r3 = r0.getBundle()
            r1.<init>(r2, r3)
            goto L24
        L1b:
            com.huawei.hms.feature.dynamic.DynamicModule$LoadingException r1 = new com.huawei.hms.feature.dynamic.DynamicModule$LoadingException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2)
        L24:
            java.lang.String r2 = com.huawei.hms.feature.dynamic.e.c.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Get remote module info failed: "
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = ". try to query local."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.huawei.hms.common.util.Logger.w(r2, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L48:
            android.os.Bundle r8 = com.huawei.hms.feature.dynamic.DynamicModule.getLocalModuleInfo(r8, r9)
            java.lang.String r2 = com.huawei.hms.feature.dynamic.e.c.a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The version of remote module "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r4 = ":"
            r3.append(r4)
            java.lang.String r5 = "module_version"
            int r6 = r0.getInt(r5)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.huawei.hms.common.util.Logger.i(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "The version of local module "
            r3.append(r6)
            r3.append(r9)
            r3.append(r4)
            java.lang.String r9 = "local_module_version"
            int r4 = r8.getInt(r9)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.huawei.hms.common.util.Logger.i(r2, r3)
            int r3 = r8.getInt(r9)
            if (r3 <= 0) goto La6
            int r9 = r8.getInt(r9)
            int r3 = r0.getInt(r5)
            if (r9 < r3) goto La6
            java.lang.String r9 = "Choose local module info."
            com.huawei.hms.common.util.Logger.i(r2, r9)
            return r8
        La6:
            if (r1 == 0) goto Lb0
            int r8 = r0.getInt(r5)
            if (r8 == 0) goto Laf
            goto Lb0
        Laf:
            throw r1
        Lb0:
            java.lang.String r8 = "Choose remote module info."
            com.huawei.hms.common.util.Logger.i(r2, r8)
            return r0
    }
}
