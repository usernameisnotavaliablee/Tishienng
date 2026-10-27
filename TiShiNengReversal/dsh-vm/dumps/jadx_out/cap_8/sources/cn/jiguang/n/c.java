package cn.jiguang.n;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    public java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f1342b;

    /* renamed from: c, reason: collision with root package name */
    public int f1343c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f1344d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Intent f1345e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Intent f1346f;

    /* renamed from: g, reason: collision with root package name */
    public int f1347g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f1348h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f1349i;

    /* renamed from: j, reason: collision with root package name */
    public int f1350j;

    /* renamed from: k, reason: collision with root package name */
    public int f1351k;
    public java.lang.String l;

    public c() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1347g = r0
            r1.f1351k = r0
            return
    }

    public c(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f1347g = r0
            r1.f1351k = r0
            r1.a = r2
            r1.f1342b = r3
            r1.f1343c = r4
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L22
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L12
            goto L22
        L12:
            cn.jiguang.n.c r5 = (cn.jiguang.n.c) r5
            java.lang.String r2 = r4.a
            java.lang.String r5 = r5.a
            if (r2 == 0) goto L1f
            boolean r5 = r2.equals(r5)
            return r5
        L1f:
            if (r5 != 0) goto L22
            return r0
        L22:
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "JWakeTargetInfo{packageName='"
            r0.append(r1)
            java.lang.String r1 = r3.a
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", serviceName='"
            r0.append(r2)
            java.lang.String r2 = r3.f1342b
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = ", targetVersion="
            r0.append(r2)
            int r2 = r3.f1343c
            r0.append(r2)
            java.lang.String r2 = ", providerAuthority='"
            r0.append(r2)
            java.lang.String r2 = r3.f1344d
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", activityIntent="
            r0.append(r1)
            android.content.Intent r1 = r3.f1345e
            r0.append(r1)
            java.lang.String r1 = ", activityIntentBackup="
            r0.append(r1)
            android.content.Intent r1 = r3.f1346f
            r0.append(r1)
            java.lang.String r1 = ", wakeType="
            r0.append(r1)
            int r1 = r3.f1347g
            r0.append(r1)
            java.lang.String r1 = ", authenType="
            r0.append(r1)
            java.lang.String r1 = r3.f1348h
            r0.append(r1)
            java.lang.String r1 = ", instrumentationName="
            r0.append(r1)
            java.lang.String r1 = r3.f1349i
            r0.append(r1)
            java.lang.String r1 = ", cmd="
            r0.append(r1)
            int r1 = r3.f1350j
            r0.append(r1)
            java.lang.String r1 = ", delaySecTime="
            r0.append(r1)
            int r1 = r3.f1351k
            r0.append(r1)
            java.lang.String r1 = ", uExtra="
            r0.append(r1)
            java.lang.String r1 = r3.l
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
