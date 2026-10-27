package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class g2 extends com.amap.api.col.p0003l.Cif {
    protected boolean isPostFlag;

    public g2() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.isPostFlag = r0
            return
    }

    @Override // com.amap.api.col.p0003l.Cif
    public java.util.Map<java.lang.String, java.lang.String> getParams() {
            r1 = this;
            r0 = 0
            return r0
    }

    protected byte[] makeHttpRequest() throws com.amap.api.col.p0003l.fk {
            r1 = this;
            com.amap.api.col.3l.a7 r0 = r1.makeHttpRequestNeedHeader()
            if (r0 == 0) goto L9
            byte[] r0 = r0.a
            return r0
        L9:
            r0 = 0
            return r0
    }

    protected com.amap.api.col.p0003l.a7 makeHttpRequestNeedHeader() throws com.amap.api.col.p0003l.fk {
            r2 = this;
            android.content.Context r0 = com.amap.api.col.p0003l.d.f3124f
            if (r0 == 0) goto L16
            android.content.Context r0 = com.amap.api.col.p0003l.d.f3124f
            com.amap.api.col.3l.p4 r1 = com.amap.api.col.p0003l.b3.s()
            com.amap.api.col.3l.n4 r0 = com.amap.api.col.p0003l.ft.a(r0, r1)
            com.amap.api.col.3l.ft$c r0 = r0.a
            com.amap.api.col.3l.ft$c r1 = com.amap.api.col.3l.ft.c.a
            if (r0 == r1) goto L16
            r0 = 0
            return r0
        L16:
            int r0 = com.amap.api.maps.MapsInitializer.getProtocol()
            r1 = 1
            if (r0 != r1) goto L20
            com.amap.api.col.3l.if$c r0 = com.amap.api.col.p0003l.Cif.c.a
            goto L22
        L20:
            com.amap.api.col.3l.if$c r0 = com.amap.api.col.p0003l.Cif.c.f3539b
        L22:
            r2.setHttpProtocol(r0)
            com.amap.api.col.p0003l.z6.p()
            boolean r0 = r2.isPostFlag
            if (r0 == 0) goto L31
            com.amap.api.col.3l.a7 r0 = com.amap.api.col.p0003l.s6.d(r2)
            return r0
        L31:
            com.amap.api.col.3l.a7 r0 = com.amap.api.col.p0003l.z6.r(r2)
            return r0
    }

    public byte[] makeHttpRequestWithInterrupted() throws com.amap.api.col.p0003l.fk {
            r1 = this;
            com.amap.api.col.3l.if$a r0 = com.amap.api.col.p0003l.Cif.a.f3525b
            r1.setDegradeAbility(r0)
            byte[] r0 = r1.makeHttpRequest()
            return r0
    }
}
