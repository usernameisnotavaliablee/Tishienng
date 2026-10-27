package cn.jiguang.ad;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e extends java.lang.Exception {
    public final int a;

    public e(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r2)
            r0.a = r1
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "JException("
            r0.append(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = "):"
            r0.append(r1)
            java.lang.String r1 = r2.getLocalizedMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
