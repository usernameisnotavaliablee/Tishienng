package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class kp extends com.amap.api.col.p0003l.ko implements java.io.Serializable {

    /* renamed from: j, reason: collision with root package name */
    public int f3654j;

    /* renamed from: k, reason: collision with root package name */
    public int f3655k;
    public int l;
    public int m;
    public int n;

    public kp() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f3654j = r0
            r1.f3655k = r0
            r1.l = r0
            return
    }

    public kp(boolean r1, boolean r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.f3654j = r1
            r0.f3655k = r1
            r0.l = r1
            return
    }

    @Override // com.amap.api.col.p0003l.ko
    public final com.amap.api.col.p0003l.ko a() {
            r3 = this;
            com.amap.api.col.3l.kp r0 = new com.amap.api.col.3l.kp
            boolean r1 = r3.f3652h
            boolean r2 = r3.f3653i
            r0.<init>(r1, r2)
            r0.a(r3)
            int r1 = r3.f3654j
            r0.f3654j = r1
            int r1 = r3.f3655k
            r0.f3655k = r1
            int r1 = r3.l
            r0.l = r1
            int r1 = r3.m
            r0.m = r1
            int r1 = r3.n
            r0.n = r1
            return r0
    }

    @Override // com.amap.api.col.p0003l.ko
    public final /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.amap.api.col.3l.ko r0 = r1.a()
            return r0
    }

    @Override // com.amap.api.col.p0003l.ko
    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AmapCellCdma{sid="
            r0.<init>(r1)
            int r1 = r3.f3654j
            r0.append(r1)
            java.lang.String r1 = ", nid="
            r0.append(r1)
            int r1 = r3.f3655k
            r0.append(r1)
            java.lang.String r1 = ", bid="
            r0.append(r1)
            int r1 = r3.l
            r0.append(r1)
            java.lang.String r1 = ", latitude="
            r0.append(r1)
            int r1 = r3.m
            r0.append(r1)
            java.lang.String r1 = ", longitude="
            r0.append(r1)
            int r1 = r3.n
            r0.append(r1)
            java.lang.String r1 = ", mcc='"
            r0.append(r1)
            java.lang.String r1 = r3.a
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", mnc='"
            r0.append(r2)
            java.lang.String r2 = r3.f3646b
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", signalStrength="
            r0.append(r1)
            int r1 = r3.f3647c
            r0.append(r1)
            java.lang.String r1 = ", asuLevel="
            r0.append(r1)
            int r1 = r3.f3648d
            r0.append(r1)
            java.lang.String r1 = ", lastUpdateSystemMills="
            r0.append(r1)
            long r1 = r3.f3649e
            r0.append(r1)
            java.lang.String r1 = ", lastUpdateUtcMills="
            r0.append(r1)
            long r1 = r3.f3650f
            r0.append(r1)
            java.lang.String r1 = ", age="
            r0.append(r1)
            int r1 = r3.f3651g
            r0.append(r1)
            java.lang.String r1 = ", main="
            r0.append(r1)
            boolean r1 = r3.f3652h
            r0.append(r1)
            java.lang.String r1 = ", newApi="
            r0.append(r1)
            boolean r1 = r3.f3653i
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
