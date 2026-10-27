package com.qq.e.comm.constants;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public enum LoginType extends java.lang.Enum<com.qq.e.comm.constants.LoginType> {
    public static final com.qq.e.comm.constants.LoginType QQ = null;
    public static final com.qq.e.comm.constants.LoginType Unknow = null;
    public static final com.qq.e.comm.constants.LoginType WeiXin = null;
    private static final /* synthetic */ com.qq.e.comm.constants.LoginType[] b = null;
    private int a;

    static {
            com.qq.e.comm.constants.LoginType r0 = new com.qq.e.comm.constants.LoginType
            java.lang.String r1 = "Unknow"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.qq.e.comm.constants.LoginType.Unknow = r0
            com.qq.e.comm.constants.LoginType r0 = new com.qq.e.comm.constants.LoginType
            java.lang.String r1 = "WeiXin"
            r2 = 1
            r0.<init>(r1, r2, r2)
            com.qq.e.comm.constants.LoginType.WeiXin = r0
            com.qq.e.comm.constants.LoginType r0 = new com.qq.e.comm.constants.LoginType
            java.lang.String r1 = "QQ"
            r2 = 2
            r0.<init>(r1, r2, r2)
            com.qq.e.comm.constants.LoginType.QQ = r0
            com.qq.e.comm.constants.LoginType[] r0 = a()
            com.qq.e.comm.constants.LoginType.b = r0
            return
    }

    LoginType(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.a = r3
            r0.ordinal()
            return
    }

    private static /* synthetic */ com.qq.e.comm.constants.LoginType[] a() {
            r0 = 3
            com.qq.e.comm.constants.LoginType[] r0 = new com.qq.e.comm.constants.LoginType[r0]
            com.qq.e.comm.constants.LoginType r1 = com.qq.e.comm.constants.LoginType.Unknow
            r2 = 0
            r0[r2] = r1
            com.qq.e.comm.constants.LoginType r1 = com.qq.e.comm.constants.LoginType.WeiXin
            r2 = 1
            r0[r2] = r1
            com.qq.e.comm.constants.LoginType r1 = com.qq.e.comm.constants.LoginType.QQ
            r2 = 2
            r0[r2] = r1
            return r0
    }

    public static com.qq.e.comm.constants.LoginType valueOf(java.lang.String r1) {
            java.lang.Class<com.qq.e.comm.constants.LoginType> r0 = com.qq.e.comm.constants.LoginType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.qq.e.comm.constants.LoginType r1 = (com.qq.e.comm.constants.LoginType) r1
            return r1
    }

    public static com.qq.e.comm.constants.LoginType[] values() {
            com.qq.e.comm.constants.LoginType[] r0 = com.qq.e.comm.constants.LoginType.b
            java.lang.Object r0 = r0.clone()
            com.qq.e.comm.constants.LoginType[] r0 = (com.qq.e.comm.constants.LoginType[]) r0
            return r0
    }

    public int getValue() {
            r1 = this;
            int r0 = r1.a
            return r0
    }
}
