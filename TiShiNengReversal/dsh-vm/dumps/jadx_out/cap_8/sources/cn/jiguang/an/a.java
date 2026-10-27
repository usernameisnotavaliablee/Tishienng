package cn.jiguang.an;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends cn.jiguang.am.a {
    private int a;

    public a(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "COLD_BOOT_APP"
            r1.<init>(r2, r0)
            return
    }

    @Override // cn.jiguang.am.a
    public org.json.JSONObject a() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "count"
            int r2 = r3.a     // Catch: java.lang.Throwable -> Lc
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> Lc
        Lc:
            return r0
    }

    public void a(int r1) {
            r0 = this;
            r0.a = r1
            return
    }
}
