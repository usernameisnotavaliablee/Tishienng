package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class pbll {
    private static int a;

    public pbll() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r1) {
            if (r1 == 0) goto L13
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch: java.lang.Throwable -> L13
            r0.<init>()     // Catch: java.lang.Throwable -> L13
            android.content.res.Resources r1 = r1.getResources()     // Catch: java.lang.Throwable -> L13
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch: java.lang.Throwable -> L13
            int r1 = r1.densityDpi     // Catch: java.lang.Throwable -> L13
            ms.bz.bd.c.Pgl.pbll.a = r1     // Catch: java.lang.Throwable -> L13
        L13:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = ""
            r1.<init>(r0)
            int r0 = ms.bz.bd.c.Pgl.pbll.a
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            return r1
    }
}
