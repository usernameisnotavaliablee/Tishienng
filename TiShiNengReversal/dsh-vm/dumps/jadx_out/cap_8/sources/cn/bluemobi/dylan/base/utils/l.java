package cn.bluemobi.dylan.base.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class l {
    private static java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f117b = "INSTALLATION";

    static {
            return
    }

    public l() {
            r0 = this;
            r0.<init>()
            return
    }

    public static synchronized java.lang.String a(android.content.Context r3) {
            java.lang.Class<cn.bluemobi.dylan.base.utils.l> r0 = cn.bluemobi.dylan.base.utils.l.class
            monitor-enter(r0)
            java.lang.String r1 = cn.bluemobi.dylan.base.utils.l.a     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L2d
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L1c
            java.io.File r3 = r3.getFilesDir()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "INSTALLATION"
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L1c
            boolean r3 = r1.exists()     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            if (r3 != 0) goto L20
            c(r1)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            goto L20
        L1c:
            r3 = move-exception
            goto L31
        L1e:
            r3 = move-exception
            goto L27
        L20:
            java.lang.String r3 = b(r1)     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            cn.bluemobi.dylan.base.utils.l.a = r3     // Catch: java.lang.Throwable -> L1c java.lang.Exception -> L1e
            goto L2d
        L27:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1c
        L2d:
            java.lang.String r3 = cn.bluemobi.dylan.base.utils.l.a     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            return r3
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r3
    }

    private static java.lang.String b(java.io.File r3) throws java.io.IOException {
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r1 = "r"
            r0.<init>(r3, r1)
            long r1 = r0.length()
            int r3 = (int) r1
            byte[] r3 = new byte[r3]
            r0.readFully(r3)
            r0.close()
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            return r0
    }

    private static void c(java.io.File r1) throws java.io.IOException {
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            java.lang.String r1 = r1.toString()
            byte[] r1 = r1.getBytes()
            r0.write(r1)
            r0.close()
            return
    }
}
