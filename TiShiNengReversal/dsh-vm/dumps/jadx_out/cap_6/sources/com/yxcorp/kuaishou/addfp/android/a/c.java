package com.yxcorp.kuaishou.addfp.android.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c {
    private static boolean d = true;
    private static int e;
    private java.lang.String a;
    private java.lang.String b;
    private java.util.concurrent.locks.ReentrantLock c;

    private c() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.b = r0
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r1.c = r0
            return
    }

    /* synthetic */ c(com.yxcorp.kuaishou.addfp.android.a.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            java.lang.String r2 = "KWE_N"
            return r2
        L9:
            java.lang.String r0 = "="
            java.lang.String r1 = ""
            java.lang.String r2 = r2.replace(r0, r1)
            java.lang.String r0 = "&"
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    public static void a(org.json.JSONObject r4) {
            java.util.Iterator r0 = r4.keys()     // Catch: java.lang.Throwable -> L31
        L4:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = "64"
            boolean r2 = r2.equals(r1)     // Catch: java.lang.Throwable -> L31
            r3 = 0
            if (r2 == 0) goto L22
            r2 = 1
            int r2 = r4.optInt(r1, r2)     // Catch: java.lang.Throwable -> L31
            if (r2 != 0) goto L22
            com.yxcorp.kuaishou.addfp.android.a.c.d = r3     // Catch: java.lang.Throwable -> L31
        L22:
            java.lang.String r2 = "64_level"
            boolean r2 = r2.equals(r1)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L4
            int r1 = r4.optInt(r1, r3)     // Catch: java.lang.Throwable -> L31
            com.yxcorp.kuaishou.addfp.android.a.c.e = r1     // Catch: java.lang.Throwable -> L31
            goto L4
        L31:
            return
    }

    public static java.lang.String b() {
            boolean r0 = com.yxcorp.kuaishou.addfp.android.a.c.d     // Catch: java.lang.Throwable -> L68
            if (r0 != 0) goto L7
            java.lang.String r0 = "KWE_NPN"
            return r0
        L7:
            java.lang.String r0 = ""
            int r1 = com.yxcorp.kuaishou.addfp.android.a.c.e     // Catch: java.lang.Throwable -> L68
            if (r1 != 0) goto L61
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L68
            r2 = 33
            r3 = 1
            if (r1 >= r2) goto L48
            r2 = 29
            r4 = 0
            if (r1 < r2) goto L47
            java.lang.String r1 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L68
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L3a
            java.lang.String r2 = r1.toLowerCase()     // Catch: java.lang.Throwable -> L68
            java.lang.String r5 = "redmi"
            boolean r2 = r2.contains(r5)     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto L3a
            java.lang.String r1 = r1.toLowerCase()     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "note 7"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L3a
            r4 = 1
        L3a:
            java.lang.String r1 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "HONOR"
            boolean r1 = r1.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L45
            goto L48
        L45:
            r3 = r4
            goto L48
        L47:
            r3 = 0
        L48:
            if (r3 != 0) goto L61
            com.yxcorp.kuaishou.addfp.android.Orange r1 = com.yxcorp.kuaishou.addfp.android.Orange.getInstance()     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r1.gSer()     // Catch: java.lang.Throwable -> L68
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L61
            java.lang.String r2 = "KWE"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L61
            return r1
        L61:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L68
            if (r1 != 0) goto L68
            return r0
        L68:
            java.lang.String r0 = "KWE_N"
            return r0
    }

    public static com.yxcorp.kuaishou.addfp.android.a.c c() {
            com.yxcorp.kuaishou.addfp.android.a.c r0 = com.yxcorp.kuaishou.addfp.android.a.b.a
            return r0
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a     // Catch: java.lang.Throwable -> Lb
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Lb
            if (r0 != 0) goto Lb
            java.lang.String r0 = r1.a     // Catch: java.lang.Throwable -> Lb
            return r0
        Lb:
            java.lang.String r0 = "KWE_N"
            return r0
    }

    public java.lang.String a(android.content.Context r21, com.yxcorp.kuaishou.addfp.ResponseDfpCallback r22, boolean r23) {
            r20 = this;
            r1 = r20
            r0 = r21
            java.lang.String r2 = "AD_AND"
            java.lang.String r3 = "k14"
            java.lang.String r4 = "&"
            java.lang.String r5 = "="
            java.lang.String r6 = "KWE_N"
            java.lang.String r7 = "KWE_NPN"
            java.lang.String r8 = ""
            java.lang.String r9 = "KWE_PE"
            java.lang.System.currentTimeMillis()
            java.util.concurrent.locks.ReentrantLock r10 = r1.c     // Catch: java.lang.Throwable -> L2c
            r10.lock()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r10 = r1.b     // Catch: java.lang.Throwable -> L2c
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L2c
            if (r10 != 0) goto L2f
            java.lang.String r0 = r1.b     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.locks.ReentrantLock r2 = r1.c
            r2.unlock()
            return r0
        L2c:
            r0 = move-exception
            goto L30d
        L2f:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2c
            r10.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r11 = "k23"
            java.lang.String r12 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L2c
            java.lang.String r12 = a(r12)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r12 = com.yxcorp.kuaishou.addfp.android.b.f.a(r12)     // Catch: java.lang.Throwable -> L2c
            r10.put(r11, r12)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r11 = "k61"
            java.lang.String r12 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L2c
            java.lang.String r12 = a(r12)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r12 = com.yxcorp.kuaishou.addfp.android.b.f.a(r12)     // Catch: java.lang.Throwable -> L2c
            r10.put(r11, r12)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r11 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L2c
            java.lang.String r11 = a(r11)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r12 = "k27"
            java.lang.String r11 = com.yxcorp.kuaishou.addfp.android.b.f.a(r11)     // Catch: java.lang.Throwable -> L2c
            r10.put(r12, r11)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r11 = b()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r12 = "k64"
            java.lang.String r11 = com.yxcorp.kuaishou.addfp.android.b.f.a(r11)     // Catch: java.lang.Throwable -> L2c
            r10.put(r12, r11)     // Catch: java.lang.Throwable -> L2c
            r11 = 0
            java.lang.String r12 = com.yxcorp.kuaishou.addfp.android.b.d.c(r11)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r13 = "k31"
            java.lang.String r12 = com.yxcorp.kuaishou.addfp.android.b.f.a(r12)     // Catch: java.lang.Throwable -> L2c
            r10.put(r13, r12)     // Catch: java.lang.Throwable -> L2c
            r12 = 1
            java.lang.String r13 = com.yxcorp.kuaishou.addfp.android.b.d.c(r12)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r14 = "k117"
            java.lang.String r13 = com.yxcorp.kuaishou.addfp.android.b.f.a(r13)     // Catch: java.lang.Throwable -> L2c
            r10.put(r14, r13)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r13 = "k66"
            java.lang.String r14 = com.yxcorp.kuaishou.addfp.android.b.d.a(r11)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r14 = com.yxcorp.kuaishou.addfp.android.b.f.a(r14)     // Catch: java.lang.Throwable -> L2c
            r10.put(r13, r14)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r13 = "k116"
            java.lang.String r14 = com.yxcorp.kuaishou.addfp.android.b.d.a(r12)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r14 = com.yxcorp.kuaishou.addfp.android.b.f.a(r14)     // Catch: java.lang.Throwable -> L2c
            r10.put(r13, r14)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r13 = "k39"
            long r16 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb1
            long r18 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lb1
            long r16 = r16 - r18
            goto Lb3
        Lb1:
            r16 = 0
        Lb3:
            java.lang.String r16 = java.lang.Long.toString(r16)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r14 = com.yxcorp.kuaishou.addfp.android.b.f.a(r16)     // Catch: java.lang.Throwable -> L2c
            r10.put(r13, r14)     // Catch: java.lang.Throwable -> L2c
            com.yxcorp.kuaishou.addfp.android.Orange r13 = com.yxcorp.kuaishou.addfp.android.Orange.getInstance()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r14 = "0"
            java.lang.String r13 = r13.getResSoc(r14)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r14 = "k101"
            r10.put(r14, r13)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r13 = "k102"
            java.lang.String r14 = com.yxcorp.kuaishou.addfp.android.b.f.a(r7)     // Catch: java.lang.Throwable -> L2c
            r10.put(r13, r14)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r13 = "k57"
            java.lang.String r14 = com.yxcorp.kuaishou.addfp.android.b.d.b(r11)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r14 = com.yxcorp.kuaishou.addfp.android.b.f.a(r14)     // Catch: java.lang.Throwable -> L2c
            r10.put(r13, r14)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r13 = "k118"
            java.lang.String r14 = com.yxcorp.kuaishou.addfp.android.b.d.b(r12)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r14 = com.yxcorp.kuaishou.addfp.android.b.f.a(r14)     // Catch: java.lang.Throwable -> L2c
            r10.put(r13, r14)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r13 = "k68"
            java.lang.String r14 = com.yxcorp.kuaishou.addfp.android.b.d.e(r11)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r14 = com.yxcorp.kuaishou.addfp.android.b.f.a(r14)     // Catch: java.lang.Throwable -> L2c
            r10.put(r13, r14)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r13 = "k120"
            java.lang.String r14 = com.yxcorp.kuaishou.addfp.android.b.d.e(r12)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r14 = com.yxcorp.kuaishou.addfp.android.b.f.a(r14)     // Catch: java.lang.Throwable -> L2c
            r10.put(r13, r14)     // Catch: java.lang.Throwable -> L2c
            com.yxcorp.kuaishou.addfp.android.Orange r13 = com.yxcorp.kuaishou.addfp.android.Orange.getInstance()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r13 = r13.gRdi()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r14 = "k105"
            java.lang.String r13 = com.yxcorp.kuaishou.addfp.android.b.f.a(r13)     // Catch: java.lang.Throwable -> L2c
            r10.put(r14, r13)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r13 = "k83"
            com.yxcorp.kuaishou.addfp.android.a.c r14 = c()     // Catch: java.lang.Throwable -> L135
            java.lang.String r14 = r14.a()     // Catch: java.lang.Throwable -> L135
            com.yxcorp.kuaishou.addfp.KWEGIDDFP r15 = com.yxcorp.kuaishou.addfp.KWEGIDDFP.instance()     // Catch: java.lang.Throwable -> L135
            java.lang.String r14 = r15.getEGidLocal(r0, r14, r11)     // Catch: java.lang.Throwable -> L135
            boolean r15 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L135
            if (r15 == 0) goto L136
            r14 = r6
            goto L136
        L135:
            r14 = r9
        L136:
            java.lang.String r14 = com.yxcorp.kuaishou.addfp.android.b.f.a(r14)     // Catch: java.lang.Throwable -> L2c
            r10.put(r13, r14)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r13 = com.yxcorp.kuaishou.addfp.c.a.a.a(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r14 = "k86"
            java.lang.String r13 = com.yxcorp.kuaishou.addfp.android.b.f.a(r13)     // Catch: java.lang.Throwable -> L2c
            r10.put(r14, r13)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r13 = "k3"
            java.lang.String r14 = r0.getPackageName()     // Catch: java.lang.Throwable -> L159
            java.lang.String r14 = r14.replace(r5, r8)     // Catch: java.lang.Throwable -> L159
            java.lang.String r14 = r14.replace(r4, r8)     // Catch: java.lang.Throwable -> L159
            goto L15a
        L159:
            r14 = r9
        L15a:
            java.lang.String r14 = com.yxcorp.kuaishou.addfp.android.b.f.a(r14)     // Catch: java.lang.Throwable -> L2c
            r10.put(r13, r14)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r13 = "k109"
            com.yxcorp.kuaishou.addfp.android.Orange r14 = com.yxcorp.kuaishou.addfp.android.Orange.getInstance()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r14 = r14.gProps()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r14 = com.yxcorp.kuaishou.addfp.android.b.f.a(r14)     // Catch: java.lang.Throwable -> L2c
            r10.put(r13, r14)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r13 = "k36"
            java.lang.String r14 = "1.4.4.137.dea39c19"
            java.lang.String r14 = com.yxcorp.kuaishou.addfp.android.b.f.a(r14)     // Catch: java.lang.Throwable -> L2c
            r10.put(r13, r14)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r13 = com.yxcorp.kuaishou.addfp.android.b.f.a(r2)     // Catch: java.lang.Throwable -> L2c
            r10.put(r3, r13)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r13 = "k5"
            java.io.File r14 = android.os.Environment.getDataDirectory()     // Catch: java.lang.Throwable -> L1a2
            android.os.StatFs r15 = new android.os.StatFs     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r14 = r14.getPath()     // Catch: java.lang.Throwable -> L1a2
            r15.<init>(r14)     // Catch: java.lang.Throwable -> L1a2
            int r14 = r15.getBlockSize()     // Catch: java.lang.Throwable -> L1a2
            r19 = 1
            long r11 = (long) r14
            int r14 = r15.getBlockCount()     // Catch: java.lang.Throwable -> L1a4
            long r14 = (long) r14
            long r14 = r14 * r11
            goto L1a6
        L1a2:
            r19 = 1
        L1a4:
            r14 = 0
        L1a6:
            java.lang.String r11 = java.lang.Long.toString(r14)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r11 = com.yxcorp.kuaishou.addfp.android.b.f.a(r11)     // Catch: java.lang.Throwable -> L2c
            r10.put(r13, r11)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r11 = "k46"
            java.lang.String r12 = "/proc/meminfo"
            r13 = 0
            java.io.FileReader r14 = new java.io.FileReader     // Catch: java.lang.Throwable -> L1dc
            r14.<init>(r12)     // Catch: java.lang.Throwable -> L1dc
            java.io.BufferedReader r12 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L1dc
            r15 = 8192(0x2000, float:1.148E-41)
            r12.<init>(r14, r15)     // Catch: java.lang.Throwable -> L1dc
            java.lang.String r14 = r12.readLine()     // Catch: java.lang.Throwable -> L1da
            java.lang.String r15 = "\\s+"
            java.lang.String[] r14 = r14.split(r15)     // Catch: java.lang.Throwable -> L1da
            r14 = r14[r19]     // Catch: java.lang.Throwable -> L1da
            long r14 = java.lang.Long.parseLong(r14)     // Catch: java.lang.Throwable -> L1da
            r17 = 1024(0x400, double:5.06E-321)
            long r14 = r14 * r17
            r12.close()     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L1e5
            goto L1e5
        L1da:
            goto L1de
        L1dc:
            r12 = r13
        L1de:
            if (r12 == 0) goto L1e3
            r12.close()     // Catch: java.lang.Throwable -> L2c java.io.IOException -> L1e3
        L1e3:
            r14 = 0
        L1e5:
            java.lang.String r12 = java.lang.Long.toString(r14)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r12 = com.yxcorp.kuaishou.addfp.android.b.f.a(r12)     // Catch: java.lang.Throwable -> L2c
            r10.put(r11, r12)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r11 = "k35"
            java.lang.String r12 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> L1fd
            java.lang.String r5 = r12.replace(r5, r8)     // Catch: java.lang.Throwable -> L1fd
            java.lang.String r4 = r5.replace(r4, r8)     // Catch: java.lang.Throwable -> L1fd
            goto L1fe
        L1fd:
            r4 = r9
        L1fe:
            java.lang.String r4 = com.yxcorp.kuaishou.addfp.android.b.f.a(r4)     // Catch: java.lang.Throwable -> L2c
            r10.put(r11, r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = "k110"
            com.yxcorp.kuaishou.addfp.android.Orange r5 = com.yxcorp.kuaishou.addfp.android.Orange.getInstance()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = r5.gKpsd()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = com.yxcorp.kuaishou.addfp.android.b.f.a(r5)     // Catch: java.lang.Throwable -> L2c
            r10.put(r4, r5)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = "k111"
            java.lang.String r5 = com.yxcorp.kuaishou.addfp.android.b.f.a(r7)     // Catch: java.lang.Throwable -> L2c
            r10.put(r4, r5)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = "k112"
            com.yxcorp.kuaishou.addfp.android.Orange r5 = com.yxcorp.kuaishou.addfp.android.Orange.getInstance()     // Catch: java.lang.Throwable -> L2c
            r8 = 0
            java.lang.String r5 = r5.sted(r13, r8)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = com.yxcorp.kuaishou.addfp.android.b.f.a(r5)     // Catch: java.lang.Throwable -> L2c
            r10.put(r4, r5)     // Catch: java.lang.Throwable -> L2c
            com.yxcorp.kuaishou.addfp.android.Orange r4 = com.yxcorp.kuaishou.addfp.android.Orange.getInstance()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = com.yxcorp.kuaishou.addfp.c.a.a.a()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = r4.gManu(r0, r5)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = "k113"
            java.lang.String r4 = com.yxcorp.kuaishou.addfp.android.b.f.a(r4)     // Catch: java.lang.Throwable -> L2c
            r10.put(r5, r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = com.yxcorp.kuaishou.addfp.android.b.d.d(r19)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r5 = "k115"
            java.lang.String r4 = com.yxcorp.kuaishou.addfp.android.b.f.a(r4)     // Catch: java.lang.Throwable -> L2c
            r10.put(r5, r4)     // Catch: java.lang.Throwable -> L2c
            r16 = 0
            java.lang.String r4 = com.yxcorp.kuaishou.addfp.android.b.d.d(r16)     // Catch: java.lang.Throwable -> L2c
            if (r23 == 0) goto L286
            boolean r5 = r4.equals(r7)     // Catch: java.lang.Throwable -> L2c
            if (r5 != 0) goto L286
            java.lang.String r5 = "KWE"
            boolean r5 = r4.startsWith(r5)     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L286
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2c
            r5 = 29
            if (r4 < r5) goto L27f
            java.util.concurrent.CountDownLatch r4 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.Throwable -> L2c
            r5 = 1
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2c
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L2c java.lang.InterruptedException -> L27c
            r11 = 1000(0x3e8, double:4.94E-321)
            r4.await(r11, r7)     // Catch: java.lang.Throwable -> L2c java.lang.InterruptedException -> L27c
        L27c:
            r16 = 0
            goto L281
        L27f:
            r5 = 1
            goto L27c
        L281:
            java.lang.String r4 = com.yxcorp.kuaishou.addfp.android.b.d.d(r16)     // Catch: java.lang.Throwable -> L2c
            goto L287
        L286:
            r5 = 1
        L287:
            java.lang.String r7 = "k97"
            java.lang.String r4 = com.yxcorp.kuaishou.addfp.android.b.f.a(r4)     // Catch: java.lang.Throwable -> L2c
            r10.put(r7, r4)     // Catch: java.lang.Throwable -> L2c
            java.util.zip.CRC32 r4 = new java.util.zip.CRC32     // Catch: java.lang.Throwable -> L2df
            r4.<init>()     // Catch: java.lang.Throwable -> L2df
            r12 = 1
        L296:
            r5 = 120(0x78, float:1.68E-43)
            if (r12 > r5) goto L2bc
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2df
            java.lang.String r7 = "k"
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L2df
            r5.append(r12)     // Catch: java.lang.Throwable -> L2df
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L2df
            boolean r7 = r10.has(r5)     // Catch: java.lang.Throwable -> L2df
            if (r7 == 0) goto L2b9
            java.lang.String r5 = r10.optString(r5)     // Catch: java.lang.Throwable -> L2df
            byte[] r5 = r5.getBytes()     // Catch: java.lang.Throwable -> L2df
            r4.update(r5)     // Catch: java.lang.Throwable -> L2df
        L2b9:
            int r12 = r12 + 1
            goto L296
        L2bc:
            long r4 = r4.getValue()     // Catch: java.lang.Throwable -> L2df
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L2df
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2df
            r5.<init>()     // Catch: java.lang.Throwable -> L2df
            r5.append(r2)     // Catch: java.lang.Throwable -> L2df
            java.lang.String r2 = ":"
            r5.append(r2)     // Catch: java.lang.Throwable -> L2df
            r5.append(r4)     // Catch: java.lang.Throwable -> L2df
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L2df
            java.lang.String r2 = com.yxcorp.kuaishou.addfp.android.b.f.a(r2)     // Catch: java.lang.Throwable -> L2df
            r10.put(r3, r2)     // Catch: java.lang.Throwable -> L2df
        L2df:
            r10.toString()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = r10.toString()     // Catch: java.lang.Throwable -> L2c
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L2c
            int r2 = r2.length     // Catch: java.lang.Throwable -> L2c
            java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2c
            com.yxcorp.kuaishou.addfp.android.Orange r2 = com.yxcorp.kuaishou.addfp.android.Orange.getInstance()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = r10.toString()     // Catch: java.lang.Throwable -> L2c
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L2c
            r8 = 0
            byte[] r0 = r2.getMagicWrapper(r0, r3, r8)     // Catch: java.lang.Throwable -> L2c
            int r2 = r0.length     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r8)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = "utf-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r2)     // Catch: java.lang.Throwable -> L2c
            r1.b = r0     // Catch: java.lang.Throwable -> L2c
            goto L319
        L30d:
            r1.b = r9     // Catch: java.lang.Throwable -> L32b
            java.lang.String r0 = com.yxcorp.kuaishou.addfp.android.b.f.a(r0)     // Catch: java.lang.Throwable -> L32b
            r2 = -1
            r3 = r22
            r3.onFailed(r2, r0)     // Catch: java.lang.Throwable -> L32b
        L319:
            java.util.concurrent.locks.ReentrantLock r0 = r1.c
            r0.unlock()
            java.lang.String r0 = r1.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L328
            r1.b = r6
        L328:
            java.lang.String r0 = r1.b
            return r0
        L32b:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r2 = r1.c
            r2.unlock()
            throw r0
    }

    public void b(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }
}
