package com.huawei.hms.mlsdk.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class AppSettingHolder<T> {
    private final java.lang.String persistenceKey;
    private final T setting;

    private AppSettingHolder(java.lang.String r1, T r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L14
            if (r2 == 0) goto Lc
            r0.persistenceKey = r1
            r0.setting = r2
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null setting"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "Null PersistentKey"
            r1.<init>(r2)
            throw r1
    }

    public static <T> com.huawei.hms.mlsdk.common.AppSettingHolder<T> create(java.lang.String r1, T r2) {
            com.huawei.hms.mlsdk.common.AppSettingHolder r0 = new com.huawei.hms.mlsdk.common.AppSettingHolder
            r0.<init>(r1, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.huawei.hms.mlsdk.common.AppSettingHolder
            r2 = 0
            if (r1 == 0) goto L20
            com.huawei.hms.mlsdk.common.AppSettingHolder r5 = (com.huawei.hms.mlsdk.common.AppSettingHolder) r5
            java.lang.String r1 = r4.persistenceKey
            java.lang.String r3 = r5.persistenceKey
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L20
            T r1 = r4.setting
            T r5 = r5.setting
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L20
            return r0
        L20:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.persistenceKey
            T r1 = r4.setting
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            int r0 = java.util.Arrays.hashCode(r2)
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = r4.persistenceKey
            T r1 = r4.setting
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r3 = r3 + 97
            int r1 = r1.length()
            int r3 = r3 + r1
            r2.<init>(r3)
            java.lang.String r1 = "MlModelDriverInstanceKey{persistentKey="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ", setting="
            r2.append(r0)
            T r0 = r4.setting
            r2.append(r0)
            java.lang.String r0 = "}"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
    }
}
