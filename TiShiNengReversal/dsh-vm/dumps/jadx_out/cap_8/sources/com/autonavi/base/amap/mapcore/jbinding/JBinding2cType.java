package com.autonavi.base.amap.mapcore.jbinding;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public enum JBinding2cType extends java.lang.Enum<com.autonavi.base.amap.mapcore.jbinding.JBinding2cType> {
    private static final /* synthetic */ com.autonavi.base.amap.mapcore.jbinding.JBinding2cType[] $VALUES = null;
    public static final com.autonavi.base.amap.mapcore.jbinding.JBinding2cType EXCLUDE = null;
    public static final com.autonavi.base.amap.mapcore.jbinding.JBinding2cType INCLUDE = null;

    static {
            com.autonavi.base.amap.mapcore.jbinding.JBinding2cType r0 = new com.autonavi.base.amap.mapcore.jbinding.JBinding2cType
            java.lang.String r1 = "INCLUDE"
            r2 = 0
            r0.<init>(r1, r2)
            com.autonavi.base.amap.mapcore.jbinding.JBinding2cType.INCLUDE = r0
            com.autonavi.base.amap.mapcore.jbinding.JBinding2cType r1 = new com.autonavi.base.amap.mapcore.jbinding.JBinding2cType
            java.lang.String r3 = "EXCLUDE"
            r4 = 1
            r1.<init>(r3, r4)
            com.autonavi.base.amap.mapcore.jbinding.JBinding2cType.EXCLUDE = r1
            r3 = 2
            com.autonavi.base.amap.mapcore.jbinding.JBinding2cType[] r3 = new com.autonavi.base.amap.mapcore.jbinding.JBinding2cType[r3]
            r3[r2] = r0
            r3[r4] = r1
            com.autonavi.base.amap.mapcore.jbinding.JBinding2cType.$VALUES = r3
            return
    }

    JBinding2cType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.autonavi.base.amap.mapcore.jbinding.JBinding2cType valueOf(java.lang.String r1) {
            java.lang.Class<com.autonavi.base.amap.mapcore.jbinding.JBinding2cType> r0 = com.autonavi.base.amap.mapcore.jbinding.JBinding2cType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.autonavi.base.amap.mapcore.jbinding.JBinding2cType r1 = (com.autonavi.base.amap.mapcore.jbinding.JBinding2cType) r1
            return r1
    }

    public static com.autonavi.base.amap.mapcore.jbinding.JBinding2cType[] values() {
            com.autonavi.base.amap.mapcore.jbinding.JBinding2cType[] r0 = com.autonavi.base.amap.mapcore.jbinding.JBinding2cType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.autonavi.base.amap.mapcore.jbinding.JBinding2cType[] r0 = (com.autonavi.base.amap.mapcore.jbinding.JBinding2cType[]) r0
            return r0
    }
}
