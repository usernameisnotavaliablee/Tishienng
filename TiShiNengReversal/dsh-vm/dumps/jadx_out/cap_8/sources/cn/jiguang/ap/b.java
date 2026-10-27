package cn.jiguang.ap;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b extends cn.jiguang.ap.k {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f600b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.String f601c;

    /* renamed from: d, reason: collision with root package name */
    private int f602d;

    public b(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.String r1 = ""
            r0.f600b = r1
            r0.f601c = r1
            java.util.concurrent.atomic.AtomicBoolean r1 = cn.jiguang.z.b.f1599b
            boolean r1 = r1.get()
            r1 = r1 ^ 1
            r0.a = r1
            return
    }

    public void b(int r1) {
            r0 = this;
            r0.f602d = r1
            return
    }

    public void b(java.lang.String r1) {
            r0 = this;
            r0.f600b = r1
            return
    }

    public void c(java.lang.String r1) {
            r0 = this;
            r0.f601c = r1
            return
    }

    @Override // cn.jiguang.ap.k
    org.json.JSONObject d() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "is_foreground"
            int r2 = r3.a
            r0.put(r1, r2)
            java.lang.String r1 = "tcp_id"
            java.lang.String r2 = r3.f600b
            r0.put(r1, r2)
            java.lang.String r1 = "host"
            java.lang.String r2 = r3.f601c
            r0.put(r1, r2)
            java.lang.String r1 = "port"
            int r2 = r3.f602d
            r0.put(r1, r2)
            return r0
    }
}
