package q0;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    private static volatile q0.a b;
    private int a;

    private a() {
            r0 = this;
            r0.<init>()
            return
    }

    public static q0.a a() {
            q0.a r0 = q0.a.b
            if (r0 != 0) goto L19
            java.lang.Class<q0.a> r0 = q0.a.class
            monitor-enter(r0)
            q0.a r1 = q0.a.b     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            q0.a r1 = new q0.a     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            q0.a.b = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            q0.a r0 = q0.a.b
            return r0
    }

    public void b(int r1) {
            r0 = this;
            if (r1 > 0) goto L3
            return
        L3:
            r0.a = r1
            return
    }

    public int c() {
            r1 = this;
            int r0 = r1.a
            return r0
    }
}
