package cn.jpush.android.f;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class d implements java.lang.Runnable {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private long f1797b;

    /* renamed from: c, reason: collision with root package name */
    private org.json.JSONObject f1798c;

    public d(java.lang.String r1, long r2, org.json.JSONObject r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.f1797b = r2
            r0.f1798c = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            java.lang.String r0 = r4.a
            long r1 = r4.f1797b
            org.json.JSONObject r3 = r4.f1798c
            cn.jpush.android.f.c.a(r0, r1, r3)
            return
    }
}
