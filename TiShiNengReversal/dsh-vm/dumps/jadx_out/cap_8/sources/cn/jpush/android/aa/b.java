package cn.jpush.android.aa;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private android.content.SharedPreferences a;

    /* renamed from: b, reason: collision with root package name */
    private android.content.SharedPreferences.Editor f1606b;

    public b(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "cn.jpush.statistics"
            r1 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r0, r1)
            r2.a = r3
            android.content.SharedPreferences$Editor r3 = r3.edit()
            r2.f1606b = r3
            return
    }

    public java.util.Map<java.lang.String, java.lang.Integer> a() {
            r1 = this;
            android.content.SharedPreferences r0 = r1.a
            java.util.Map r0 = r0.getAll()
            return r0
    }

    @android.annotation.SuppressLint({"CommitPrefEdits"})
    public void a(java.lang.String r3) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.a
            r1 = 0
            int r0 = r0.getInt(r3, r1)
            android.content.SharedPreferences$Editor r1 = r2.f1606b
            int r0 = r0 + 1
            r1.putInt(r3, r0)
            android.content.SharedPreferences$Editor r3 = r2.f1606b
            r3.apply()
            return
    }

    public void b() {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = r1.f1606b
            r0.clear()
            android.content.SharedPreferences$Editor r0 = r1.f1606b
            r0.apply()
            return
    }
}
