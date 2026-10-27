package cn.jiguang.commons.c;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class o {
    public int a;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f1077c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f1078d;

    /* renamed from: e, reason: collision with root package name */
    public long f1079e;

    /* renamed from: f, reason: collision with root package name */
    public long f1080f;

    /* renamed from: g, reason: collision with root package name */
    public long f1081g;

    public o() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.a = r0
            java.lang.String r0 = ""
            r2.f1077c = r0
            r2.f1078d = r0
            r0 = 0
            r2.f1079e = r0
            r2.f1080f = r0
            r2.f1081g = r0
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "uid: "
            r0.append(r1)
            int r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", packageName: "
            r0.append(r1)
            java.lang.String r1 = r3.f1078d
            r0.append(r1)
            java.lang.String r1 = ", tcp_rcv: "
            r0.append(r1)
            long r1 = r3.f1079e
            r0.append(r1)
            java.lang.String r1 = ", tcp_snd: "
            r0.append(r1)
            long r1 = r3.f1080f
            r0.append(r1)
            java.lang.String r1 = ", start_time: "
            r0.append(r1)
            long r1 = r3.f1081g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
