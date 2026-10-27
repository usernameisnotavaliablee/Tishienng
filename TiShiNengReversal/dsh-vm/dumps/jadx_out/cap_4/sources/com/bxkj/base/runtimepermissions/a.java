package com.bxkj.base.runtimepermissions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
enum a extends java.lang.Enum<com.bxkj.base.runtimepermissions.a> {
    public static final com.bxkj.base.runtimepermissions.a a = null;
    public static final com.bxkj.base.runtimepermissions.a b = null;
    public static final com.bxkj.base.runtimepermissions.a c = null;
    private static final /* synthetic */ com.bxkj.base.runtimepermissions.a[] d = null;

    static {
            com.bxkj.base.runtimepermissions.a r0 = new com.bxkj.base.runtimepermissions.a
            java.lang.String r1 = "GRANTED"
            r2 = 0
            r0.<init>(r1, r2)
            com.bxkj.base.runtimepermissions.a.a = r0
            com.bxkj.base.runtimepermissions.a r0 = new com.bxkj.base.runtimepermissions.a
            java.lang.String r1 = "DENIED"
            r2 = 1
            r0.<init>(r1, r2)
            com.bxkj.base.runtimepermissions.a.b = r0
            com.bxkj.base.runtimepermissions.a r0 = new com.bxkj.base.runtimepermissions.a
            java.lang.String r1 = "NOT_FOUND"
            r2 = 2
            r0.<init>(r1, r2)
            com.bxkj.base.runtimepermissions.a.c = r0
            com.bxkj.base.runtimepermissions.a[] r0 = a()
            com.bxkj.base.runtimepermissions.a.d = r0
            return
    }

    a(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private static /* synthetic */ com.bxkj.base.runtimepermissions.a[] a() {
            r0 = 3
            com.bxkj.base.runtimepermissions.a[] r0 = new com.bxkj.base.runtimepermissions.a[r0]
            com.bxkj.base.runtimepermissions.a r1 = com.bxkj.base.runtimepermissions.a.a
            r2 = 0
            r0[r2] = r1
            com.bxkj.base.runtimepermissions.a r1 = com.bxkj.base.runtimepermissions.a.b
            r2 = 1
            r0[r2] = r1
            com.bxkj.base.runtimepermissions.a r1 = com.bxkj.base.runtimepermissions.a.c
            r2 = 2
            r0[r2] = r1
            return r0
    }

    public static com.bxkj.base.runtimepermissions.a valueOf(java.lang.String r1) {
            java.lang.Class<com.bxkj.base.runtimepermissions.a> r0 = com.bxkj.base.runtimepermissions.a.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bxkj.base.runtimepermissions.a r1 = (com.bxkj.base.runtimepermissions.a) r1
            return r1
    }

    public static com.bxkj.base.runtimepermissions.a[] values() {
            com.bxkj.base.runtimepermissions.a[] r0 = com.bxkj.base.runtimepermissions.a.d
            java.lang.Object r0 = r0.clone()
            com.bxkj.base.runtimepermissions.a[] r0 = (com.bxkj.base.runtimepermissions.a[]) r0
            return r0
    }
}
