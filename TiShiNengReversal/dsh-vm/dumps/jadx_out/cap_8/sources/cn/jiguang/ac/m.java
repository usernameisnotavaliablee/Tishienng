package cn.jiguang.ac;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class m extends cn.jiguang.ac.i {

    /* renamed from: e, reason: collision with root package name */
    private int f371e;

    /* renamed from: f, reason: collision with root package name */
    private int f372f;

    /* renamed from: g, reason: collision with root package name */
    private int f373g;

    /* renamed from: h, reason: collision with root package name */
    private cn.jiguang.ac.g f374h;

    m() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // cn.jiguang.ac.i
    void a(cn.jiguang.ac.b r2) {
            r1 = this;
            int r0 = r2.g()
            r1.f371e = r0
            int r0 = r2.g()
            r1.f372f = r0
            int r0 = r2.g()
            r1.f373g = r0
            cn.jiguang.ac.g r0 = new cn.jiguang.ac.g
            r0.<init>(r2)
            r1.f374h = r0
            return
    }

    @Override // cn.jiguang.ac.i
    void a(cn.jiguang.ac.c r2, cn.jiguang.ac.a r3, boolean r4) {
            r1 = this;
            int r3 = r1.f371e
            r2.c(r3)
            int r3 = r1.f372f
            r2.c(r3)
            int r3 = r1.f373g
            r2.c(r3)
            cn.jiguang.ac.g r3 = r1.f374h
            r0 = 0
            r3.a(r2, r0, r4)
            return
    }

    @Override // cn.jiguang.ac.i
    java.lang.String b() {
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r4.f371e
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = r4.f372f
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = r4.f373g
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            cn.jiguang.ac.g r1 = r4.f374h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public int j() {
            r1 = this;
            int r0 = r1.f373g
            return r0
    }

    public cn.jiguang.ac.g k() {
            r1 = this;
            cn.jiguang.ac.g r0 = r1.f374h
            return r0
    }
}
