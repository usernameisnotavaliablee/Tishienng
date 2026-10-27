package cn.jiguang.av;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c {
    private static final java.util.concurrent.atomic.AtomicReference<android.content.Context> a = null;

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            cn.jiguang.av.c.a = r0
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.content.Context a() {
            r0 = 0
            android.content.Context r0 = a(r0)
            return r0
    }

    public static android.content.Context a(android.content.Context r2) {
            java.util.concurrent.atomic.AtomicReference<android.content.Context> r0 = cn.jiguang.av.c.a
            java.lang.Object r1 = r0.get()
            android.content.Context r1 = (android.content.Context) r1
            if (r1 != 0) goto L1d
            if (r2 == 0) goto L15
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            goto L19
        L15:
            android.app.Application r2 = cn.jiguang.av.r.a()
        L19:
            r0.set(r2)
            return r2
        L1d:
            return r1
    }
}
