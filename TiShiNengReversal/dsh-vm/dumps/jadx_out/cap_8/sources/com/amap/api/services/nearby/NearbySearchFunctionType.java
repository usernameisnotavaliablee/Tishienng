package com.amap.api.services.nearby;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public enum NearbySearchFunctionType extends java.lang.Enum<com.amap.api.services.nearby.NearbySearchFunctionType> {
    public static final com.amap.api.services.nearby.NearbySearchFunctionType DISTANCE_SEARCH = null;
    public static final com.amap.api.services.nearby.NearbySearchFunctionType DRIVING_DISTANCE_SEARCH = null;
    private static final /* synthetic */ com.amap.api.services.nearby.NearbySearchFunctionType[] a = null;

    static {
            com.amap.api.services.nearby.NearbySearchFunctionType r0 = new com.amap.api.services.nearby.NearbySearchFunctionType
            java.lang.String r1 = "DISTANCE_SEARCH"
            r2 = 0
            r0.<init>(r1, r2)
            com.amap.api.services.nearby.NearbySearchFunctionType.DISTANCE_SEARCH = r0
            com.amap.api.services.nearby.NearbySearchFunctionType r1 = new com.amap.api.services.nearby.NearbySearchFunctionType
            java.lang.String r3 = "DRIVING_DISTANCE_SEARCH"
            r4 = 1
            r1.<init>(r3, r4)
            com.amap.api.services.nearby.NearbySearchFunctionType.DRIVING_DISTANCE_SEARCH = r1
            r3 = 2
            com.amap.api.services.nearby.NearbySearchFunctionType[] r3 = new com.amap.api.services.nearby.NearbySearchFunctionType[r3]
            r3[r2] = r0
            r3[r4] = r1
            com.amap.api.services.nearby.NearbySearchFunctionType.a = r3
            return
    }

    NearbySearchFunctionType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.amap.api.services.nearby.NearbySearchFunctionType valueOf(java.lang.String r1) {
            java.lang.Class<com.amap.api.services.nearby.NearbySearchFunctionType> r0 = com.amap.api.services.nearby.NearbySearchFunctionType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.amap.api.services.nearby.NearbySearchFunctionType r1 = (com.amap.api.services.nearby.NearbySearchFunctionType) r1
            return r1
    }

    public static com.amap.api.services.nearby.NearbySearchFunctionType[] values() {
            com.amap.api.services.nearby.NearbySearchFunctionType[] r0 = com.amap.api.services.nearby.NearbySearchFunctionType.a
            java.lang.Object r0 = r0.clone()
            com.amap.api.services.nearby.NearbySearchFunctionType[] r0 = (com.amap.api.services.nearby.NearbySearchFunctionType[]) r0
            return r0
    }
}
