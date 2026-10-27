package cn.jpush.android.e;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f1785b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f1786c;

    public b(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f1785b = r2
            r0.f1786c = r3
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public java.lang.String b() {
            r1 = this;
            java.lang.String r0 = r1.f1785b
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TokenResult{code="
            r0.<init>(r1)
            int r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", token='"
            r0.append(r1)
            java.lang.String r1 = r3.f1785b
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r2 = ", msg='"
            r0.append(r2)
            java.lang.String r2 = r3.f1786c
            r0.append(r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
