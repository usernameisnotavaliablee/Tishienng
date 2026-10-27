package cn.jiguang.ad;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class d {
    int a;

    /* renamed from: b, reason: collision with root package name */
    public long f378b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f379c;

    /* renamed from: d, reason: collision with root package name */
    int f380d;

    /* renamed from: e, reason: collision with root package name */
    int f381e;

    /* renamed from: f, reason: collision with root package name */
    long f382f;

    /* renamed from: g, reason: collision with root package name */
    byte[] f383g;

    /* renamed from: h, reason: collision with root package name */
    long f384h;

    /* renamed from: i, reason: collision with root package name */
    long f385i;

    /* renamed from: j, reason: collision with root package name */
    boolean f386j;

    public d(long r2, java.lang.String r4, int r5, int r6, long r7, long r9, byte[] r11) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.f378b = r2
            r1.f379c = r4
            r1.f380d = r5
            r1.f381e = r6
            r1.f382f = r7
            r1.f385i = r9
            r1.f383g = r11
            r2 = 0
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1d
            r2 = 1
            r1.f386j = r2
        L1d:
            return
    }

    public void a() {
            r1 = this;
            int r0 = r1.a
            int r0 = r0 + 1
            r1.a = r0
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "InnerRequest{times="
            r0.append(r1)
            int r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", requestId="
            r0.append(r1)
            long r1 = r3.f378b
            r0.append(r1)
            java.lang.String r1 = ", sdkType='"
            r0.append(r1)
            java.lang.String r1 = r3.f379c
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", command="
            r0.append(r1)
            int r1 = r3.f380d
            r0.append(r1)
            java.lang.String r1 = ", ver="
            r0.append(r1)
            int r1 = r3.f381e
            r0.append(r1)
            java.lang.String r1 = ", rid="
            r0.append(r1)
            long r1 = r3.f382f
            r0.append(r1)
            java.lang.String r1 = ", reqeustTime="
            r0.append(r1)
            long r1 = r3.f384h
            r0.append(r1)
            java.lang.String r1 = ", timeout="
            r0.append(r1)
            long r1 = r3.f385i
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
