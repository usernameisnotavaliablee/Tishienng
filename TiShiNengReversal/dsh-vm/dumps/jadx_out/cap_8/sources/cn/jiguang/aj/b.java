package cn.jiguang.aj;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private static cn.jiguang.aj.a a;

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.Object f499b = null;


    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jiguang.aj.b.f499b = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void a(android.content.Context r8) {
            java.lang.Object r1 = cn.jiguang.aj.b.f499b
            monitor-enter(r1)
            cn.jiguang.aj.a r2 = new cn.jiguang.aj.a     // Catch: java.lang.Throwable -> L18
            cn.jiguang.aj.b$1 r6 = new cn.jiguang.aj.b$1     // Catch: java.lang.Throwable -> L18
            r6.<init>()     // Catch: java.lang.Throwable -> L18
            r3 = 10000(0x2710, double:4.9407E-320)
            r5 = 0
            r7 = r8
            r2.<init>(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L18
            cn.jiguang.aj.b.a = r2     // Catch: java.lang.Throwable -> L18
            r2.start()     // Catch: java.lang.Throwable -> L18
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            return
        L18:
            r0 = move-exception
            r8 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L18
            throw r8
    }

    static /* synthetic */ void a(cn.jiguang.ak.a r0) {
            b(r0)
            return
    }

    private static void b(cn.jiguang.ak.a r4) {
            cn.jiguang.ak.c r0 = new cn.jiguang.ak.c
            r0.<init>()
            java.lang.String r1 = "ANR"
            r0.a(r1)
            cn.jiguang.aj.c r1 = new cn.jiguang.aj.c
            java.lang.Thread r2 = r4.a()
            r3 = 1
            r1.<init>(r0, r4, r2, r3)
            cn.jiguang.aj.h r4 = cn.jiguang.aj.h.a()
            r4.a(r1)
            return
    }
}
