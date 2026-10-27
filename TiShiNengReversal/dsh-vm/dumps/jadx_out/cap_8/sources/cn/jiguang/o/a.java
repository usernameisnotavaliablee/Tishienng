package cn.jiguang.o;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a extends android.os.Handler {
    private final android.content.Context a;

    public a(android.content.Context r1, android.os.Looper r2) {
            r0 = this;
            r0.<init>(r2)
            r0.a = r1
            return
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message r4) {
            r3 = this;
            int r0 = r4.what     // Catch: java.lang.Throwable -> Ld
            java.lang.Object r4 = r4.obj     // Catch: java.lang.Throwable -> Ld
            cn.jiguang.p.f r1 = cn.jiguang.p.f.a()     // Catch: java.lang.Throwable -> Ld
            android.content.Context r2 = r3.a     // Catch: java.lang.Throwable -> Ld
            r1.a(r2, r0, r4)     // Catch: java.lang.Throwable -> Ld
        Ld:
            return
    }
}
