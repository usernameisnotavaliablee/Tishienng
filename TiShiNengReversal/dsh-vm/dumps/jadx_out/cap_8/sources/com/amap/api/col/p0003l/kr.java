package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class kr extends com.amap.api.col.p0003l.ko implements java.io.Serializable {

    /* renamed from: j, reason: collision with root package name */
    public int f3658j;

    /* renamed from: k, reason: collision with root package name */
    public int f3659k;
    public int l;
    public int m;
    public int n;

    public kr() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f3658j = r0
            r1.f3659k = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.l = r0
            r1.m = r0
            r1.n = r0
            return
    }

    public kr(boolean r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            r2 = 0
            r1.f3658j = r2
            r1.f3659k = r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1.l = r2
            r1.m = r2
            r1.n = r2
            return
    }

    @Override // com.amap.api.col.p0003l.ko
    public final com.amap.api.col.p0003l.ko a() {
            r2 = this;
            com.amap.api.col.3l.kr r0 = new com.amap.api.col.3l.kr
            boolean r1 = r2.f3652h
            r0.<init>(r1)
            r0.a(r2)
            int r1 = r2.f3658j
            r0.f3658j = r1
            int r1 = r2.f3659k
            r0.f3659k = r1
            int r1 = r2.l
            r0.l = r1
            int r1 = r2.m
            r0.m = r1
            int r1 = r2.n
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
            java.lang.String r1 = "AmapCellLte{tac="
            r0.<init>(r1)
            int r1 = r3.f3658j
            r0.append(r1)
            java.lang.String r1 = ", ci="
            r0.append(r1)
            int r1 = r3.f3659k
            r0.append(r1)
            java.lang.String r1 = ", pci="
            r0.append(r1)
            int r1 = r3.l
            r0.append(r1)
            java.lang.String r1 = ", earfcn="
            r0.append(r1)
            int r1 = r3.m
            r0.append(r1)
            java.lang.String r1 = ", timingAdvance="
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
