package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class l4 extends com.amap.api.col.p0003l.Cif {
    public l4() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.amap.api.col.p0003l.Cif
    public java.lang.String getIPV6URL() {
            r4 = this;
            java.lang.String r0 = r4.getURL()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lf
            java.lang.String r0 = r4.getURL()
            return r0
        Lf:
            java.lang.String r0 = r4.getURL()
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r2 = r1.getAuthority()
            java.lang.String r3 = "dualstack-"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L24
            return r0
        L24:
            java.lang.String r0 = r1.getAuthority()
            java.lang.String r2 = "restsdk.amap.com"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L43
            android.net.Uri$Builder r0 = r1.buildUpon()
            java.lang.String r1 = "dualstack-arestapi.amap.com"
            android.net.Uri$Builder r0 = r0.authority(r1)
            android.net.Uri r0 = r0.build()
            java.lang.String r0 = r0.toString()
            return r0
        L43:
            android.net.Uri$Builder r0 = r1.buildUpon()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            java.lang.String r1 = r1.getAuthority()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.net.Uri$Builder r0 = r0.authority(r1)
            android.net.Uri r0 = r0.build()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.amap.api.col.p0003l.Cif
    public boolean isSupportIPV6() {
            r1 = this;
            r0 = 1
            return r0
    }
}
