package com.umeng.socialize.tracker.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum a extends java.lang.Enum<com.umeng.socialize.tracker.utils.a> {
    public static final com.umeng.socialize.tracker.utils.a a = null;
    public static final com.umeng.socialize.tracker.utils.a b = null;
    public static final com.umeng.socialize.tracker.utils.a c = null;
    public static final com.umeng.socialize.tracker.utils.a d = null;
    public static final com.umeng.socialize.tracker.utils.a e = null;
    public static final com.umeng.socialize.tracker.utils.a f = null;
    public static final com.umeng.socialize.tracker.utils.a g = null;
    public static final com.umeng.socialize.tracker.utils.a h = null;
    public static final com.umeng.socialize.tracker.utils.a i = null;
    public static final com.umeng.socialize.tracker.utils.a j = null;
    private static final /* synthetic */ com.umeng.socialize.tracker.utils.a[] l = null;
    private final int k;

    static {
            com.umeng.socialize.tracker.utils.a r0 = new com.umeng.socialize.tracker.utils.a
            r1 = 5000(0x1388, float:7.006E-42)
            java.lang.String r2 = "UnKnownCode"
            r3 = 0
            r0.<init>(r2, r3, r1)
            com.umeng.socialize.tracker.utils.a.a = r0
            com.umeng.socialize.tracker.utils.a r1 = new com.umeng.socialize.tracker.utils.a
            r2 = 5001(0x1389, float:7.008E-42)
            java.lang.String r4 = "Timeout"
            r5 = 1
            r1.<init>(r4, r5, r2)
            com.umeng.socialize.tracker.utils.a.b = r1
            com.umeng.socialize.tracker.utils.a r2 = new com.umeng.socialize.tracker.utils.a
            r4 = 5002(0x138a, float:7.009E-42)
            java.lang.String r6 = "NetworkUnavailable"
            r7 = 2
            r2.<init>(r6, r7, r4)
            com.umeng.socialize.tracker.utils.a.c = r2
            com.umeng.socialize.tracker.utils.a r4 = new com.umeng.socialize.tracker.utils.a
            r6 = 5003(0x138b, float:7.01E-42)
            java.lang.String r8 = "SSLException"
            r9 = 3
            r4.<init>(r8, r9, r6)
            com.umeng.socialize.tracker.utils.a.d = r4
            com.umeng.socialize.tracker.utils.a r6 = new com.umeng.socialize.tracker.utils.a
            r8 = 5004(0x138c, float:7.012E-42)
            java.lang.String r10 = "IOException"
            r11 = 4
            r6.<init>(r10, r11, r8)
            com.umeng.socialize.tracker.utils.a.e = r6
            com.umeng.socialize.tracker.utils.a r8 = new com.umeng.socialize.tracker.utils.a
            r10 = 5005(0x138d, float:7.013E-42)
            java.lang.String r12 = "UnKnownHostException"
            r13 = 5
            r8.<init>(r12, r13, r10)
            com.umeng.socialize.tracker.utils.a.f = r8
            com.umeng.socialize.tracker.utils.a r10 = new com.umeng.socialize.tracker.utils.a
            r12 = 5006(0x138e, float:7.015E-42)
            java.lang.String r14 = "HttpError"
            r15 = 6
            r10.<init>(r14, r15, r12)
            com.umeng.socialize.tracker.utils.a.g = r10
            com.umeng.socialize.tracker.utils.a r12 = new com.umeng.socialize.tracker.utils.a
            r14 = 5007(0x138f, float:7.016E-42)
            r16 = 0
            java.lang.String r3 = "EmptyResponse"
            r17 = 1
            r5 = 7
            r12.<init>(r3, r5, r14)
            com.umeng.socialize.tracker.utils.a.h = r12
            com.umeng.socialize.tracker.utils.a r3 = new com.umeng.socialize.tracker.utils.a
            r14 = 5008(0x1390, float:7.018E-42)
            r18 = 7
            java.lang.String r5 = "ErrorResponse"
            r19 = 2
            r7 = 8
            r3.<init>(r5, r7, r14)
            com.umeng.socialize.tracker.utils.a.i = r3
            com.umeng.socialize.tracker.utils.a r5 = new com.umeng.socialize.tracker.utils.a
            r14 = 5009(0x1391, float:7.019E-42)
            r20 = 8
            java.lang.String r7 = "ErrorMakeRequestBody"
            r21 = 3
            r9 = 9
            r5.<init>(r7, r9, r14)
            com.umeng.socialize.tracker.utils.a.j = r5
            r7 = 10
            com.umeng.socialize.tracker.utils.a[] r7 = new com.umeng.socialize.tracker.utils.a[r7]
            r7[r16] = r0
            r7[r17] = r1
            r7[r19] = r2
            r7[r21] = r4
            r7[r11] = r6
            r7[r13] = r8
            r7[r15] = r10
            r7[r18] = r12
            r7[r20] = r3
            r7[r9] = r5
            com.umeng.socialize.tracker.utils.a.l = r7
            return
    }

    a(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.k = r3
            return
    }

    private java.lang.String b() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "错误码："
            r0.append(r1)
            int r1 = r2.k
            r0.append(r1)
            java.lang.String r1 = " 错误信息："
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static com.umeng.socialize.tracker.utils.a valueOf(java.lang.String r1) {
            java.lang.Class<com.umeng.socialize.tracker.utils.a> r0 = com.umeng.socialize.tracker.utils.a.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.umeng.socialize.tracker.utils.a r1 = (com.umeng.socialize.tracker.utils.a) r1
            return r1
    }

    public static com.umeng.socialize.tracker.utils.a[] values() {
            com.umeng.socialize.tracker.utils.a[] r0 = com.umeng.socialize.tracker.utils.a.l
            java.lang.Object r0 = r0.clone()
            com.umeng.socialize.tracker.utils.a[] r0 = (com.umeng.socialize.tracker.utils.a[]) r0
            return r0
    }

    public java.lang.String a() {
            r2 = this;
            com.umeng.socialize.tracker.utils.a r0 = com.umeng.socialize.tracker.utils.a.a
            if (r2 != r0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.b()
            r0.append(r1)
            java.lang.String r1 = "--未知错误--"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L1a:
            com.umeng.socialize.tracker.utils.a r0 = com.umeng.socialize.tracker.utils.a.b
            if (r2 != r0) goto L34
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.b()
            r0.append(r1)
            java.lang.String r1 = "--连接超时--"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L34:
            com.umeng.socialize.tracker.utils.a r0 = com.umeng.socialize.tracker.utils.a.c
            if (r2 != r0) goto L4e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.b()
            r0.append(r1)
            java.lang.String r1 = "--网络不可用--"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L4e:
            com.umeng.socialize.tracker.utils.a r0 = com.umeng.socialize.tracker.utils.a.d
            if (r2 != r0) goto L68
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.b()
            r0.append(r1)
            java.lang.String r1 = "--SSL证书认证失败--"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L68:
            com.umeng.socialize.tracker.utils.a r0 = com.umeng.socialize.tracker.utils.a.e
            if (r2 != r0) goto L82
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.b()
            r0.append(r1)
            java.lang.String r1 = "--IO异常--"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L82:
            com.umeng.socialize.tracker.utils.a r0 = com.umeng.socialize.tracker.utils.a.g
            if (r2 != r0) goto L9c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.b()
            r0.append(r1)
            java.lang.String r1 = "--服务端返回HTTP错误--"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L9c:
            com.umeng.socialize.tracker.utils.a r0 = com.umeng.socialize.tracker.utils.a.h
            if (r2 != r0) goto Lb6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.b()
            r0.append(r1)
            java.lang.String r1 = "--服务端返回数据为空--"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        Lb6:
            com.umeng.socialize.tracker.utils.a r0 = com.umeng.socialize.tracker.utils.a.i
            if (r2 != r0) goto Ld0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.b()
            r0.append(r1)
            java.lang.String r1 = "--服务端返回错误数据--"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        Ld0:
            com.umeng.socialize.tracker.utils.a r0 = com.umeng.socialize.tracker.utils.a.j
            if (r2 != r0) goto Lea
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.b()
            r0.append(r1)
            java.lang.String r1 = "--请求报文构建错误--"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        Lea:
            java.lang.String r0 = "unknown"
            return r0
    }
}
