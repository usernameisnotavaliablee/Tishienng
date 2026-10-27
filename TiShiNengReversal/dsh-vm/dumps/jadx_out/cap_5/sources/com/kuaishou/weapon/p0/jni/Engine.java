package com.kuaishou.weapon.p0.jni;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class Engine {
    private static volatile com.kuaishou.weapon.p0.jni.Engine instance;
    public static volatile int loadSoCount;
    public static volatile boolean loadSuccess;
    public static volatile java.lang.String soPath;
    public static volatile java.lang.String soVersion;

    static {
            return
    }

    public Engine() {
            r0 = this;
            r0.<init>()
            return
    }

    public static native java.lang.String abc();

    public static native java.lang.String bcd();

    public static synchronized com.kuaishou.weapon.p0.jni.Engine getInstance(android.content.Context r8) {
            java.lang.Class<com.kuaishou.weapon.p0.jni.Engine> r0 = com.kuaishou.weapon.p0.jni.Engine.class
            monitor-enter(r0)
            java.lang.String r1 = com.kuaishou.weapon.p0.jni.Engine.soVersion     // Catch: java.lang.Throwable -> L21
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto Le7
            boolean r1 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto Le7
            com.kuaishou.weapon.p0.jni.Engine r1 = com.kuaishou.weapon.p0.jni.Engine.instance     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto Le7
            java.lang.String r1 = "weapon"
            com.kuaishou.weapon.p0.jni.Engine r2 = com.kuaishou.weapon.p0.jni.Engine.instance     // Catch: java.lang.Throwable -> L21
            if (r2 != 0) goto L24
            com.kuaishou.weapon.p0.jni.Engine r2 = new com.kuaishou.weapon.p0.jni.Engine     // Catch: java.lang.Throwable -> L21
            r2.<init>()     // Catch: java.lang.Throwable -> L21
            com.kuaishou.weapon.p0.jni.Engine.instance = r2     // Catch: java.lang.Throwable -> L21
            goto L24
        L21:
            r8 = move-exception
            goto Leb
        L24:
            java.lang.String r2 = "re_po_rt"
            com.kuaishou.weapon.p0.h r2 = com.kuaishou.weapon.p0.h.a(r8, r2)     // Catch: java.lang.Throwable -> L21
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r4.<init>()     // Catch: java.lang.Throwable -> L55
            r4.append(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = com.kuaishou.weapon.p0.jni.Engine.soVersion     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = "."
            java.lang.String r7 = ""
            java.lang.String r5 = r5.replace(r6, r7)     // Catch: java.lang.Throwable -> L55
            r4.append(r5)     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = ".so"
            r4.append(r5)     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L55
            boolean r4 = com.kuaishou.weapon.p0.bp.a(r8, r4)     // Catch: java.lang.Throwable -> L55
            if (r4 != 0) goto L57
            com.kuaishou.weapon.p0.jni.Engine.loadSuccess = r3     // Catch: java.lang.Throwable -> L55
            com.kuaishou.weapon.p0.jni.Engine r8 = com.kuaishou.weapon.p0.jni.Engine.instance     // Catch: java.lang.Throwable -> L55
            monitor-exit(r0)
            return r8
        L55:
            r1 = move-exception
            goto Lbd
        L57:
            java.lang.String r4 = "plc001_lss_v_s"
            java.lang.String r5 = ""
            java.lang.String r4 = r2.b(r4, r5)     // Catch: java.lang.Throwable -> L55
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L6c
            java.lang.String r4 = com.kuaishou.weapon.p0.jni.Engine.soVersion     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = "plc001_lss_v_s"
            r2.c(r5, r4, r3)     // Catch: java.lang.Throwable -> L55
        L6c:
            java.lang.String r5 = "plc001_lps_t_p0"
            int r5 = r2.c(r5)     // Catch: java.lang.Throwable -> L55
            com.kuaishou.weapon.p0.jni.Engine.loadSoCount = r5     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = com.kuaishou.weapon.p0.jni.Engine.soVersion     // Catch: java.lang.Throwable -> L55
            boolean r4 = android.text.TextUtils.equals(r4, r5)     // Catch: java.lang.Throwable -> L55
            if (r4 != 0) goto L85
            java.lang.String r4 = com.kuaishou.weapon.p0.jni.Engine.soVersion     // Catch: java.lang.Throwable -> L55
            com.kuaishou.weapon.p0.jni.Engine.loadSoCount = r3     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = "plc001_lss_v_s"
            r2.c(r5, r4, r3)     // Catch: java.lang.Throwable -> L55
        L85:
            int r4 = com.kuaishou.weapon.p0.jni.Engine.loadSoCount     // Catch: java.lang.Throwable -> L55
            r5 = 1
            int r4 = r4 + r5
            r6 = 10
            if (r4 >= r6) goto Le0
            int r4 = com.kuaishou.weapon.p0.jni.Engine.loadSoCount     // Catch: java.lang.Throwable -> L55
            int r4 = r4 + r5
            com.kuaishou.weapon.p0.jni.Engine.loadSoCount = r4     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = "plc001_lps_t_p0"
            int r6 = com.kuaishou.weapon.p0.jni.Engine.loadSoCount     // Catch: java.lang.Throwable -> L55
            r2.d(r4, r6)     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r4.<init>()     // Catch: java.lang.Throwable -> L55
            r4.append(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = com.kuaishou.weapon.p0.jni.Engine.soVersion     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = "."
            java.lang.String r7 = ""
            java.lang.String r1 = r1.replace(r6, r7)     // Catch: java.lang.Throwable -> L55
            r4.append(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L55
            java.lang.System.loadLibrary(r1)     // Catch: java.lang.Throwable -> L55
            bcd()     // Catch: java.lang.Throwable -> L55
            com.kuaishou.weapon.p0.jni.Engine.loadSoCount = r3     // Catch: java.lang.Throwable -> L55
            com.kuaishou.weapon.p0.jni.Engine.loadSuccess = r5     // Catch: java.lang.Throwable -> L55
            goto Le0
        Lbd:
            com.kuaishou.weapon.p0.jni.Engine.loadSuccess = r3     // Catch: java.lang.Throwable -> L21
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> Le0
            r3.<init>()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> Le0
            java.lang.String r4 = "e"
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> Le0
            r3.put(r4, r1)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> Le0
            java.lang.String r1 = "v"
            java.lang.String r4 = com.kuaishou.weapon.p0.jni.Engine.soVersion     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> Le0
            r3.put(r1, r4)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> Le0
            java.lang.String r1 = "l"
            java.lang.String r4 = com.kuaishou.weapon.p0.ck.m     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> Le0
            r3.put(r1, r4)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> Le0
            java.lang.String r1 = com.kuaishou.weapon.p0.ck.a     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> Le0
            com.kuaishou.weapon.p0.bh.a(r8, r1, r3)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> Le0
        Le0:
            java.lang.String r8 = "plc001_lps_t_p0"
            int r1 = com.kuaishou.weapon.p0.jni.Engine.loadSoCount     // Catch: java.lang.Throwable -> L21
            r2.d(r8, r1)     // Catch: java.lang.Throwable -> L21
        Le7:
            com.kuaishou.weapon.p0.jni.Engine r8 = com.kuaishou.weapon.p0.jni.Engine.instance     // Catch: java.lang.Throwable -> L21
            monitor-exit(r0)
            return r8
        Leb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r8
    }

    public static native int mmo(java.lang.reflect.Member r0, int r1, int r2);

    public static native int mqc(java.lang.reflect.Member r0, int r1);

    public static native int off();

    public static native java.lang.String tao(int r0, long r1, java.lang.Object r3);

    public native byte[] ac(byte[] r1, byte[] r2);

    public native byte[] ar(byte[] r1, byte[] r2);

    public native java.lang.String cde();

    public native byte[] dc(byte[] r1, byte[] r2);

    public native java.lang.String def();

    public native byte[] dr(byte[] r1, byte[] r2);

    public native java.lang.String efg();

    public native java.lang.String eopq(int r1, int r2, int r3, java.lang.String r4);

    public native java.lang.String fgh();

    public native java.lang.String ghi();

    public native java.lang.String hij();

    public native java.lang.String klm(int r1, java.lang.String r2);

    public native java.lang.String nop();

    public native java.lang.String pqr(int r1, int r2, int r3, java.lang.String r4);

    public native java.lang.String qrs();

    public native java.lang.String stu(int r1, int r2, int r3, int r4, java.lang.String r5);
}
