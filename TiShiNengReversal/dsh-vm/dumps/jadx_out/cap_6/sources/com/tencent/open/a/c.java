package com.tencent.open.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class c implements com.tencent.open.a.g {
    private java.lang.String a;
    private int b;
    private int c;
    private int d;
    private java.lang.String e;
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> f;

    public c(java.net.HttpURLConnection r1, java.lang.String r2, int r3, int r4, int r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r3
            r0.c = r4
            r0.d = r5
            r0.e = r6
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.f = r2
            if (r1 == 0) goto L21
            java.util.Map r1 = r1.getHeaderFields()
            if (r1 == 0) goto L21
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r2 = r0.f
            r2.putAll(r1)
        L21:
            return
    }

    @Override // com.tencent.open.a.g
    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    @Override // com.tencent.open.a.g
    public int b() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @Override // com.tencent.open.a.g
    public int c() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    @Override // com.tencent.open.a.g
    public int d() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            r1 = 64
            r0.append(r1)
            int r1 = r3.hashCode()
            r0.append(r1)
            r1 = 10
            r0.append(r1)
            java.lang.String r2 = "content = ["
            r0.append(r2)
            java.lang.String r2 = r3.a
            r0.append(r2)
            r2 = 93
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "responseSize = "
            r0.append(r2)
            int r2 = r3.b
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "requestSize = "
            r0.append(r2)
            int r2 = r3.c
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = "resultCode = "
            r0.append(r2)
            int r2 = r3.d
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "errorMsg = "
            r0.append(r1)
            java.lang.String r1 = r3.e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
