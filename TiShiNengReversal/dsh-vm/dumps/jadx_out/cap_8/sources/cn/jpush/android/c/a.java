package cn.jpush.android.c;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private int f1741b;

    /* renamed from: c, reason: collision with root package name */
    private android.os.Bundle f1742c;

    public a(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f1741b = r2
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.f1741b
            return r0
    }

    public void a(android.os.Bundle r1) {
            r0 = this;
            r0.f1742c = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CmdMessage{cmd='"
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", errorCode="
            r0.append(r1)
            int r1 = r2.f1741b
            r0.append(r1)
            java.lang.String r1 = ", extra="
            r0.append(r1)
            android.os.Bundle r1 = r2.f1742c
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
