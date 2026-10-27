package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i1 {
    public static int a;
    public static int b;

    public i1() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r1) {
            java.lang.String r0 = "window"
            java.lang.Object r1 = r1.getSystemService(r0)     // Catch: java.lang.Throwable -> L1c
            android.view.WindowManager r1 = (android.view.WindowManager) r1     // Catch: java.lang.Throwable -> L1c
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch: java.lang.Throwable -> L1c
            android.graphics.Point r0 = new android.graphics.Point     // Catch: java.lang.Throwable -> L1c
            r0.<init>()     // Catch: java.lang.Throwable -> L1c
            r1.getRealSize(r0)     // Catch: java.lang.Throwable -> L1c
            int r1 = r0.x     // Catch: java.lang.Throwable -> L1c
            ms.bz.bd.c.Pgl.i1.a = r1     // Catch: java.lang.Throwable -> L1c
            int r1 = r0.y     // Catch: java.lang.Throwable -> L1c
            ms.bz.bd.c.Pgl.i1.b = r1     // Catch: java.lang.Throwable -> L1c
        L1c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r0 = ms.bz.bd.c.Pgl.i1.a
            r1.append(r0)
            java.lang.String r0 = "*"
            r1.append(r0)
            int r0 = ms.bz.bd.c.Pgl.i1.b
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            return r1
    }
}
