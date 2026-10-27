package ms.bz.bd.c.Pgl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h1 {
    static java.lang.String a;
    static java.lang.String b;

    public h1() {
            r1 = this;
            r1.<init>()
            return
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public static synchronized java.lang.String a(android.content.Context r4) {
            java.lang.Class<ms.bz.bd.c.Pgl.h1> r0 = ms.bz.bd.c.Pgl.h1.class
            monitor-enter(r0)
            java.lang.String r1 = ms.bz.bd.c.Pgl.h1.a     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Lf
            java.lang.String r4 = ms.bz.bd.c.Pgl.q1.a(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r4
        Ld:
            r4 = move-exception
            goto L4a
        Lf:
            java.lang.String r1 = "phone"
            java.lang.Object r4 = r4.getSystemService(r1)     // Catch: java.lang.Throwable -> L42
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L3a
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "6765744465766963654964"
            byte[] r3 = ms.bz.bd.c.Pgl.pbla.a(r3)     // Catch: java.lang.Throwable -> L42
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L42
            r3 = 0
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L42
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r4 = r1.invoke(r4, r3)     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L42
            ms.bz.bd.c.Pgl.h1.a = r4     // Catch: java.lang.Throwable -> L42
            goto L42
        L3a:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "null TM"
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L42
            throw r4     // Catch: java.lang.Throwable -> L42
        L42:
            java.lang.String r4 = ms.bz.bd.c.Pgl.h1.a     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = ms.bz.bd.c.Pgl.q1.a(r4)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r4
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r4
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    public static synchronized java.lang.String b(android.content.Context r4) {
            java.lang.Class<ms.bz.bd.c.Pgl.h1> r0 = ms.bz.bd.c.Pgl.h1.class
            monitor-enter(r0)
            java.lang.String r1 = ms.bz.bd.c.Pgl.h1.a     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto Lf
            java.lang.String r4 = ms.bz.bd.c.Pgl.q1.a(r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r4
        Ld:
            r4 = move-exception
            goto L4a
        Lf:
            java.lang.String r1 = "phone"
            java.lang.Object r4 = r4.getSystemService(r1)     // Catch: java.lang.Throwable -> L42
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L3a
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L42
            java.lang.String r3 = "676574537562736372696265724964"
            byte[] r3 = ms.bz.bd.c.Pgl.pbla.a(r3)     // Catch: java.lang.Throwable -> L42
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L42
            r3 = 0
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L42
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r4 = r1.invoke(r4, r3)     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L42
            ms.bz.bd.c.Pgl.h1.b = r4     // Catch: java.lang.Throwable -> L42
            goto L42
        L3a:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "null TM"
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L42
            throw r4     // Catch: java.lang.Throwable -> L42
        L42:
            java.lang.String r4 = ms.bz.bd.c.Pgl.h1.b     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = ms.bz.bd.c.Pgl.q1.a(r4)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return r4
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r4
    }
}
