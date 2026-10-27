package com.umeng.socialize.bean;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum RequestType extends java.lang.Enum<com.umeng.socialize.bean.RequestType> {
    private static final /* synthetic */ com.umeng.socialize.bean.RequestType[] $VALUES = null;

    @java.lang.Deprecated
    public static final com.umeng.socialize.bean.RequestType ANALYTICS = null;

    @java.lang.Deprecated
    public static final com.umeng.socialize.bean.RequestType API = null;
    public static final com.umeng.socialize.bean.RequestType SOCIAL = null;




    static {
            com.umeng.socialize.bean.RequestType$1 r0 = new com.umeng.socialize.bean.RequestType$1
            java.lang.String r1 = "SOCIAL"
            r2 = 0
            r0.<init>(r1, r2)
            com.umeng.socialize.bean.RequestType.SOCIAL = r0
            com.umeng.socialize.bean.RequestType$2 r1 = new com.umeng.socialize.bean.RequestType$2
            java.lang.String r3 = "ANALYTICS"
            r4 = 1
            r1.<init>(r3, r4)
            com.umeng.socialize.bean.RequestType.ANALYTICS = r1
            com.umeng.socialize.bean.RequestType$3 r3 = new com.umeng.socialize.bean.RequestType$3
            java.lang.String r5 = "API"
            r6 = 2
            r3.<init>(r5, r6)
            com.umeng.socialize.bean.RequestType.API = r3
            r5 = 3
            com.umeng.socialize.bean.RequestType[] r5 = new com.umeng.socialize.bean.RequestType[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            com.umeng.socialize.bean.RequestType.$VALUES = r5
            return
    }

    RequestType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* synthetic */ RequestType(java.lang.String r1, int r2, com.umeng.socialize.bean.RequestType.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.umeng.socialize.bean.RequestType valueOf(java.lang.String r1) {
            java.lang.Class<com.umeng.socialize.bean.RequestType> r0 = com.umeng.socialize.bean.RequestType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.umeng.socialize.bean.RequestType r1 = (com.umeng.socialize.bean.RequestType) r1
            return r1
    }

    public static com.umeng.socialize.bean.RequestType[] values() {
            com.umeng.socialize.bean.RequestType[] r0 = com.umeng.socialize.bean.RequestType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.umeng.socialize.bean.RequestType[] r0 = (com.umeng.socialize.bean.RequestType[]) r0
            return r0
    }
}
