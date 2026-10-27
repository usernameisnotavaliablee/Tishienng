package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class k2 extends com.amap.api.col.p0003l.g2 {
    public k2() {
            r1 = this;
            r1.<init>()
            android.content.Context r0 = com.amap.api.col.p0003l.d.f3124f
            java.net.Proxy r0 = com.amap.api.col.p0003l.o4.c(r0)
            r1.setProxy(r0)
            r0 = 5000(0x1388, float:7.006E-42)
            r1.setConnectionTimeout(r0)
            r0 = 50000(0xc350, float:7.0065E-41)
            r1.setSoTimeout(r0)
            return
    }

    private static java.lang.String e(java.lang.String r7) {
            java.lang.String r0 = "&"
            java.lang.String[] r1 = r7.split(r0)
            java.util.Arrays.sort(r1)
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            int r3 = r1.length
            r4 = 0
            r5 = 0
        L11:
            if (r5 >= r3) goto L22
            r6 = r1[r5]
            java.lang.String r6 = f(r6)
            r2.append(r6)
            r2.append(r0)
            int r5 = r5 + 1
            goto L11
        L22:
            java.lang.String r0 = r2.toString()
            int r1 = r0.length()
            r2 = 1
            if (r1 <= r2) goto L38
            int r7 = r0.length()
            int r7 = r7 - r2
            java.lang.CharSequence r7 = r0.subSequence(r4, r7)
            java.lang.String r7 = (java.lang.String) r7
        L38:
            return r7
    }

    private static java.lang.String f(java.lang.String r2) {
            java.lang.String r0 = "AbstractProtocalHandler"
            if (r2 != 0) goto L5
            return r2
        L5:
            java.lang.String r1 = "utf-8"
            java.lang.String r2 = java.net.URLDecoder.decode(r2, r1)     // Catch: java.lang.Exception -> Lc java.io.UnsupportedEncodingException -> Le
            return r2
        Lc:
            r2 = move-exception
            goto L10
        Le:
            r2 = move-exception
            goto L16
        L10:
            java.lang.String r1 = "strReEncoderException"
            com.amap.api.col.p0003l.w5.p(r2, r0, r1)
            goto L1b
        L16:
            java.lang.String r1 = "strReEncoder"
            com.amap.api.col.p0003l.w5.p(r2, r0, r1)
        L1b:
            java.lang.String r2 = ""
            return r2
    }

    protected java.lang.String appendTsScode(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = e(r5)
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = com.amap.api.col.p0003l.h4.a()
            java.lang.String r2 = "&ts="
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r2 = r2.concat(r3)
            r1.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "&scode="
            r2.<init>(r3)
            android.content.Context r3 = com.amap.api.col.p0003l.d.f3124f
            java.lang.String r5 = com.amap.api.col.p0003l.h4.c(r3, r5, r0)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
    }

    @Override // com.amap.api.col.p0003l.Cif
    public java.lang.String getIPV6URL() {
            r2 = this;
            java.lang.String r0 = r2.getURL()
            if (r0 == 0) goto L12
            java.lang.String r1 = "http://restsdk.amap.com/v4/gridmap?"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L12
            java.lang.String r0 = com.amap.api.col.p0003l.b3.y(r0)
        L12:
            return r0
    }

    @Override // com.amap.api.col.p0003l.g2, com.amap.api.col.p0003l.Cif
    public java.util.Map<java.lang.String, java.lang.String> getParams() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public java.util.Map<java.lang.String, java.lang.String> getRequestHead() {
            r5 = this;
            java.util.Hashtable r0 = new java.util.Hashtable
            r1 = 16
            r0.<init>(r1)
            java.lang.String r1 = "User-Agent"
            java.lang.String r2 = com.amap.api.col.p0003l.ha.f3470c
            r0.put(r1, r2)
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r2 = "gzip"
            r0.put(r1, r2)
            java.util.Locale r1 = java.util.Locale.US
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "10.0.600"
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "3dmap"
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "platform=Android&sdkversion=%s&product=%s"
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            java.lang.String r2 = "platinfo"
            r0.put(r2, r1)
            android.content.Context r1 = com.amap.api.col.p0003l.d.f3124f
            java.lang.String r1 = com.amap.api.col.p0003l.h4.b(r1)
            java.lang.String r2 = "x-INFO"
            r0.put(r2, r1)
            android.content.Context r1 = com.amap.api.col.p0003l.d.f3124f
            java.lang.String r1 = com.amap.api.col.p0003l.f4.j(r1)
            java.lang.String r2 = "key"
            r0.put(r2, r1)
            java.lang.String r1 = "logversion"
            java.lang.String r2 = "2.1"
            r0.put(r1, r2)
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public boolean isSupportIPV6() {
            r2 = this;
            java.lang.String r0 = r2.getURL()
            if (r0 == 0) goto L10
            java.lang.String r1 = "http://restsdk.amap.com/v4/gridmap?"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }
}
