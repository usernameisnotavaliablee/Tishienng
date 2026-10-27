package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class cl {
    private android.content.Context a;
    private int b;
    private int c;

    public cl(android.content.Context r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public java.lang.String a(java.lang.String r4) {
            r3 = this;
            r0 = 0
            com.kuaishou.weapon.p0.cm r1 = new com.kuaishou.weapon.p0.cm     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = com.kuaishou.weapon.p0.ck.l     // Catch: java.lang.Throwable -> L22
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L22
            android.content.Context r4 = r3.a     // Catch: java.lang.Throwable -> L22
            org.json.JSONObject r4 = r1.a(r4)     // Catch: java.lang.Throwable -> L22
            if (r4 != 0) goto L11
            return r0
        L11:
            org.json.JSONObject r1 = r3.a()     // Catch: java.lang.Throwable -> L22
            if (r1 != 0) goto L18
            return r0
        L18:
            java.lang.String r2 = "module_section"
            r4.put(r2, r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L22
            return r4
        L22:
            return r0
    }

    public org.json.JSONObject a() {
            r29 = this;
            r0 = r29
            java.lang.String r1 = "70"
            java.lang.String r2 = "50"
            java.lang.String r3 = "85"
            java.lang.String r4 = "64"
            java.lang.String r5 = "63"
            java.lang.String r6 = "62"
            java.lang.String r7 = "91"
            java.lang.String r8 = "46"
            java.lang.String r9 = "45"
            java.lang.String r10 = "40"
            java.lang.String r11 = "38"
            java.lang.String r12 = "37"
            java.lang.String r13 = "23"
            java.lang.String r14 = "48"
            java.lang.String r15 = "47"
            r16 = r1
            java.lang.String r1 = "6"
            r17 = r2
            java.lang.String r2 = "41"
            long r18 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L99e
            r20 = r3
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L99e
            r3.<init>()     // Catch: java.lang.Throwable -> L99e
            r21 = r4
            android.content.Context r4 = r0.a     // Catch: java.lang.Throwable -> L99e
            r22 = r5
            java.lang.String r5 = "re_po_rt"
            com.kuaishou.weapon.p0.h r4 = com.kuaishou.weapon.p0.h.a(r4, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r5 = "a1_p_s_p_s"
            boolean r5 = r4.e(r5)     // Catch: java.lang.Throwable -> L99e
            r23 = r5
            java.lang.String r5 = "a1_p_s_p_s_c_b"
            boolean r5 = r4.e(r5)     // Catch: java.lang.Throwable -> L99e
            r24 = r5
            com.kuaishou.weapon.p0.aj r5 = new com.kuaishou.weapon.p0.aj     // Catch: java.lang.Throwable -> L99e
            r25 = r6
            android.content.Context r6 = r0.a     // Catch: java.lang.Throwable -> L99e
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "0"
            r26 = r5
            int r5 = r26.d()     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r5 = "1"
            int r6 = r26.a()     // Catch: java.lang.Throwable -> L99e
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r5 = "2"
            java.lang.String r6 = r26.c()     // Catch: java.lang.Throwable -> L99e
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r5 = "3"
            int r6 = r26.f()     // Catch: java.lang.Throwable -> L99e
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r5 = "24"
            int r6 = r26.e()     // Catch: java.lang.Throwable -> L99e
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r5 = "35"
            boolean r6 = com.kuaishou.weapon.p0.ab.b()     // Catch: java.lang.Throwable -> L99e
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r5 = "36"
            android.content.Context r6 = r0.a     // Catch: java.lang.Throwable -> L99e
            boolean r6 = com.kuaishou.weapon.p0.ab.a(r6)     // Catch: java.lang.Throwable -> L99e
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L99e
            android.content.Context r5 = r0.a     // Catch: java.lang.Throwable -> L99e
            org.json.JSONObject r5 = com.kuaishou.weapon.p0.ai.a(r5)     // Catch: java.lang.Throwable -> L99e
            if (r5 == 0) goto La8
            java.lang.String r6 = "4"
            r3.put(r6, r5)     // Catch: java.lang.Throwable -> L99e
        La8:
            com.kuaishou.weapon.p0.z r5 = new com.kuaishou.weapon.p0.z     // Catch: java.lang.Throwable -> L99e
            r5.<init>()     // Catch: java.lang.Throwable -> L99e
            android.content.Context r6 = r0.a     // Catch: java.lang.Throwable -> L99e
            org.json.JSONArray r6 = r5.a(r6)     // Catch: java.lang.Throwable -> L99e
            r26 = r5
            java.lang.String r5 = "49"
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r5 = "146"
            r27 = r6
            java.util.Set r6 = r26.e()     // Catch: java.lang.Throwable -> L99e
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r5 = "154"
            int r6 = r26.a()     // Catch: java.lang.Throwable -> L99e
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r5 = "168"
            java.lang.Integer r6 = com.kuaishou.weapon.p0.dj.b(r27)     // Catch: java.lang.Throwable -> L99e
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r5 = "169"
            java.lang.Integer r6 = com.kuaishou.weapon.p0.dj.a(r27)     // Catch: java.lang.Throwable -> L99e
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r5 = "185"
            org.json.JSONObject r6 = r26.d()     // Catch: java.lang.Throwable -> L99e
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r5 = "191"
            java.util.Set r6 = r26.c()     // Catch: java.lang.Throwable -> L99e
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L99e
            java.util.Set r5 = r26.b()     // Catch: java.lang.Throwable -> L99e
            if (r5 == 0) goto L101
            java.lang.String r5 = "161"
            java.util.Set r6 = r26.b()     // Catch: java.lang.Throwable -> L99e
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L99e
        L101:
            java.lang.String r5 = "22"
            java.lang.String r6 = com.kuaishou.weapon.p0.ab.a()     // Catch: java.lang.Throwable -> L99e
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L99e
            com.kuaishou.weapon.p0.ac r5 = new com.kuaishou.weapon.p0.ac     // Catch: java.lang.Throwable -> L99e
            r5.<init>()     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "7"
            r26 = r7
            boolean r7 = r5.a()     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            android.content.Context r6 = r0.a     // Catch: java.lang.Throwable -> L99e
            boolean r6 = r5.a(r6)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r7 = "8"
            r3.put(r7, r6)     // Catch: java.lang.Throwable -> L99e
            if (r6 == 0) goto L132
            java.lang.String r6 = "61"
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L99e
            java.lang.String r7 = r5.b(r7)     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
        L132:
            android.content.Context r6 = r0.a     // Catch: java.lang.Throwable -> L99e
            boolean r6 = r5.f(r6)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r7 = "181"
            r3.put(r7, r6)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "9"
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L99e
            org.json.JSONArray r7 = r5.d(r7)     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "10"
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L99e
            int r7 = r5.e(r7)     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "11"
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L99e
            java.lang.String r5 = r5.c(r7)     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r5)     // Catch: java.lang.Throwable -> L99e
            com.kuaishou.weapon.p0.ae r5 = new com.kuaishou.weapon.p0.ae     // Catch: java.lang.Throwable -> L99e
            r5.<init>()     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "26"
            java.lang.String r7 = "cpuinfo"
            boolean r7 = r5.a(r7)     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "27"
            java.lang.String r7 = "meminfo"
            boolean r7 = r5.a(r7)     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "28"
            java.lang.String r7 = "/proc/cpuinfo"
            boolean r7 = r5.b(r7)     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "29"
            java.lang.String r7 = "/proc/meminfo"
            boolean r7 = r5.b(r7)     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "96"
            org.json.JSONObject r7 = r5.a()     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "134"
            org.json.JSONObject r5 = r5.b()     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r5)     // Catch: java.lang.Throwable -> L99e
            com.kuaishou.weapon.p0.an r5 = new com.kuaishou.weapon.p0.an     // Catch: java.lang.Throwable -> L99e
            r5.<init>()     // Catch: java.lang.Throwable -> L99e
            java.util.Set r6 = r5.b()     // Catch: java.lang.Throwable -> L99e
            java.util.Set r7 = r5.c()     // Catch: java.lang.Throwable -> L99e
            r27 = r8
            java.lang.String r8 = "30"
            r28 = r9
            r9 = 1
            if (r7 == 0) goto L1c5
            r3.put(r8, r9)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r8 = "32"
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L99e
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L99e
            r3.put(r8, r9)     // Catch: java.lang.Throwable -> L99e
            goto L1c9
        L1c5:
            r9 = 0
            r3.put(r8, r9)     // Catch: java.lang.Throwable -> L99e
        L1c9:
            java.lang.String r8 = "31"
            if (r6 == 0) goto L1dc
            r9 = 1
            r3.put(r8, r9)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r8 = "33"
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L99e
            r9.<init>(r6)     // Catch: java.lang.Throwable -> L99e
            r3.put(r8, r9)     // Catch: java.lang.Throwable -> L99e
            goto L1e0
        L1dc:
            r9 = 0
            r3.put(r8, r9)     // Catch: java.lang.Throwable -> L99e
        L1e0:
            java.util.Set r8 = r5.a()     // Catch: java.lang.Throwable -> L99e
            if (r8 == 0) goto L27c
            java.lang.String r9 = "34"
            r3.put(r9, r8)     // Catch: java.lang.Throwable -> L99e
            if (r6 != 0) goto L1ef
            if (r7 == 0) goto L27c
        L1ef:
            java.util.HashSet r8 = new java.util.HashSet     // Catch: java.lang.Throwable -> L99e
            r8.<init>()     // Catch: java.lang.Throwable -> L99e
            if (r6 == 0) goto L1f9
            r8.add(r6)     // Catch: java.lang.Throwable -> L99e
        L1f9:
            if (r7 == 0) goto L1fe
            r8.add(r7)     // Catch: java.lang.Throwable -> L99e
        L1fe:
            java.lang.String r6 = "13"
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L99e
            r9 = 13
            int r7 = r5.a(r7, r9, r8)     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "14"
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L99e
            r9 = 14
            int r7 = r5.a(r7, r9, r8)     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "15"
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L99e
            r9 = 15
            int r7 = r5.a(r7, r9, r8)     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "16"
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L99e
            r9 = 16
            int r7 = r5.a(r7, r9, r8)     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "17"
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L99e
            r9 = 17
            int r7 = r5.a(r7, r9, r8)     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "18"
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L99e
            r9 = 18
            int r7 = r5.a(r7, r9, r8)     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "19"
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L99e
            r9 = 19
            int r7 = r5.a(r7, r9, r8)     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "20"
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L99e
            r9 = 20
            int r7 = r5.a(r7, r9, r8)     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "21"
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L99e
            r9 = 21
            int r7 = r5.a(r7, r9, r8)     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            org.json.JSONObject r5 = r5.b(r8)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "130"
            r3.put(r6, r5)     // Catch: java.lang.Throwable -> L99e
        L27c:
            com.kuaishou.weapon.p0.ao r5 = new com.kuaishou.weapon.p0.ao     // Catch: java.lang.Throwable -> L99e
            r5.<init>()     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "65"
            boolean r7 = r5.d()     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            boolean r6 = r5.b()     // Catch: java.lang.Throwable -> L99e
            java.lang.String r7 = "66"
            r3.put(r7, r6)     // Catch: java.lang.Throwable -> L99e
            if (r6 == 0) goto L29e
            java.lang.String r6 = "67"
            boolean r7 = r5.a()     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
        L29e:
            java.lang.String r6 = "68"
            boolean r7 = r5.f()     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "69"
            java.lang.String r7 = r5.e()     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "101"
            boolean r7 = r5.c()     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "102"
            boolean r5 = r5.g()     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r5)     // Catch: java.lang.Throwable -> L99e
            com.kuaishou.weapon.p0.af r5 = new com.kuaishou.weapon.p0.af     // Catch: java.lang.Throwable -> L99e
            r5.<init>()     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "99"
            int r5 = r5.a()     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r5)     // Catch: java.lang.Throwable -> L99e
            com.kuaishou.weapon.p0.ad r5 = new com.kuaishou.weapon.p0.ad     // Catch: java.lang.Throwable -> L99e
            r5.<init>()     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "103"
            boolean r5 = r5.a()     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r5)     // Catch: java.lang.Throwable -> L99e
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L99e
            r5.<init>()     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "03007"
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L99e
            java.lang.String r7 = com.kuaishou.weapon.p0.bv.a(r7)     // Catch: java.lang.Throwable -> L99e
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "03014"
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L99e
            boolean r7 = com.kuaishou.weapon.p0.bh.g(r7)     // Catch: java.lang.Throwable -> L99e
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "03020"
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L99e
            java.lang.String r7 = com.kuaishou.weapon.p0.bv.b(r7)     // Catch: java.lang.Throwable -> L99e
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "03030"
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L99e
            int r7 = com.kuaishou.weapon.p0.bg.d(r7)     // Catch: java.lang.Throwable -> L99e
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "51"
            r3.put(r6, r5)     // Catch: java.lang.Throwable -> L99e
            com.kuaishou.weapon.p0.an r5 = new com.kuaishou.weapon.p0.an     // Catch: java.lang.Throwable -> L99e
            r5.<init>()     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "107"
            org.json.JSONObject r7 = r5.d()     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "155"
            org.json.JSONObject r7 = r5.e()     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "170"
            org.json.JSONObject r7 = r5.g()     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "190"
            org.json.JSONObject r5 = r5.f()     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r5)     // Catch: java.lang.Throwable -> L99e
            com.kuaishou.weapon.p0.ah r5 = new com.kuaishou.weapon.p0.ah     // Catch: java.lang.Throwable -> L99e
            r5.<init>()     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "131"
            org.json.JSONObject r7 = r5.a()     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "145"
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L99e
            org.json.JSONObject r5 = r5.a(r7)     // Catch: java.lang.Throwable -> L99e
            r3.put(r6, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r5 = "132"
            org.json.JSONObject r6 = com.kuaishou.weapon.p0.dk.a()     // Catch: java.lang.Throwable -> L99e
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L99e
            com.kuaishou.weapon.p0.aj r5 = new com.kuaishou.weapon.p0.aj     // Catch: java.lang.Throwable -> L99e
            android.content.Context r6 = r0.a     // Catch: java.lang.Throwable -> L99e
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L99e
            org.json.JSONObject r5 = r5.g()     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "133"
            r3.put(r6, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r5 = "plc001_r_rcl_xp"
            r9 = 1
            int r5 = r4.b(r5, r9)     // Catch: java.lang.Throwable -> L99e
            if (r5 != r9) goto L3b2
            android.content.Context r5 = r0.a     // Catch: java.lang.Throwable -> L99e
            int r5 = com.kuaishou.weapon.p0.dl.c(r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "139"
            r3.put(r6, r5)     // Catch: java.lang.Throwable -> L99e
            android.content.Context r5 = r0.a     // Catch: java.lang.Throwable -> L99e
            int r5 = com.kuaishou.weapon.p0.dl.d(r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "140"
            r3.put(r6, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r5 = "147"
            int r6 = com.kuaishou.weapon.p0.dl.a()     // Catch: java.lang.Throwable -> L99e
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r5 = com.kuaishou.weapon.p0.di.b()     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "148"
            r3.put(r6, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r5 = "149"
            java.util.Set r6 = com.kuaishou.weapon.p0.di.c()     // Catch: java.lang.Throwable -> L99e
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r5 = "151"
            int r6 = com.kuaishou.weapon.p0.dk.b()     // Catch: java.lang.Throwable -> L99e
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L99e
        L3b2:
            java.lang.String r5 = "plc001_r_rcl_vl"
            r9 = 0
            int r5 = r4.b(r5, r9)     // Catch: java.lang.Throwable -> L99e
            r9 = 1
            if (r5 != r9) goto L3c5
            java.lang.String r5 = "128"
            boolean r6 = com.kuaishou.weapon.p0.ad.b()     // Catch: java.lang.Throwable -> L99e
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L99e
        L3c5:
            boolean r5 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess     // Catch: java.lang.Throwable -> L99e
            if (r5 == 0) goto L8c5
            com.kuaishou.weapon.p0.as r5 = new com.kuaishou.weapon.p0.as     // Catch: java.lang.Throwable -> L99e
            android.content.Context r6 = r0.a     // Catch: java.lang.Throwable -> L99e
            r7 = 100
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = r5.a(r1)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r6)     // Catch: java.lang.Throwable -> L99e
            org.json.JSONObject r1 = r5.a()     // Catch: java.lang.Throwable -> L99e
            org.json.JSONArray r1 = r5.a(r1, r2)     // Catch: java.lang.Throwable -> L99e
            if (r1 == 0) goto L40e
            int r6 = r1.length()     // Catch: java.lang.Throwable -> L99e
            if (r6 <= 0) goto L40e
            org.json.JSONObject r6 = r5.a()     // Catch: java.lang.Throwable -> L99e
            org.json.JSONArray r6 = r5.c(r6, r2)     // Catch: java.lang.Throwable -> L99e
            org.json.JSONObject r8 = r5.a()     // Catch: java.lang.Throwable -> L99e
            org.json.JSONArray r8 = r5.b(r8, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r9 = "42"
            r3.put(r9, r6)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r9 = "43"
            r3.put(r9, r8)     // Catch: java.lang.Throwable -> L99e
            org.json.JSONArray r1 = r5.a(r1, r6)     // Catch: java.lang.Throwable -> L99e
            org.json.JSONArray r1 = r5.a(r1, r8)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r1)     // Catch: java.lang.Throwable -> L99e
        L40e:
            java.lang.String r1 = r5.a(r15)     // Catch: java.lang.Throwable -> L99e
            r3.put(r15, r1)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = r5.a(r14)     // Catch: java.lang.Throwable -> L99e
            r3.put(r14, r1)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = r5.a(r13)     // Catch: java.lang.Throwable -> L99e
            r3.put(r13, r1)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = r5.a(r12)     // Catch: java.lang.Throwable -> L99e
            r3.put(r12, r1)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = r5.a(r11)     // Catch: java.lang.Throwable -> L99e
            r3.put(r11, r1)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = r5.b(r10)     // Catch: java.lang.Throwable -> L99e
            r3.put(r10, r1)     // Catch: java.lang.Throwable -> L99e
            r1 = r28
            java.lang.String r2 = r5.b(r1)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            r1 = r27
            java.lang.String r2 = r5.e(r1)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            r1 = r26
            java.lang.String r2 = r5.a(r1)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            r1 = r25
            org.json.JSONArray r2 = r5.c(r1)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            r1 = r22
            org.json.JSONArray r2 = r5.c(r1)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            r1 = r21
            org.json.JSONArray r2 = r5.c(r1)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            r1 = r20
            org.json.JSONObject r2 = r5.d(r1)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            r1 = r17
            java.lang.String r2 = r5.a(r1)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            r1 = r16
            org.json.JSONArray r2 = r5.c(r1)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "39"
            java.lang.String r2 = "39"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "52"
            java.lang.String r2 = "52"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "53"
            java.lang.String r2 = "53"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "54"
            java.lang.String r2 = "54"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "55"
            java.lang.String r2 = "55"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "73"
            java.lang.String r2 = "73"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "74"
            java.lang.String r2 = "74"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "104"
            java.lang.String r2 = "104"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "plc001_r_rcl_dv"
            r9 = 1
            int r1 = r4.b(r1, r9)     // Catch: java.lang.Throwable -> L99e
            if (r1 != r9) goto L513
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L99e
            r2 = 23
            if (r1 >= r2) goto L513
            com.kuaishou.weapon.p0.ar r1 = new com.kuaishou.weapon.p0.ar     // Catch: java.lang.Throwable -> L99e
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L99e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "57"
            java.lang.String r2 = r1.a(r2)     // Catch: java.lang.Throwable -> L99e
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L99e
            if (r6 != 0) goto L513
            java.lang.String r6 = "57"
            r3.put(r6, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "56"
            java.lang.String r6 = "56"
            java.lang.String r1 = r1.a(r6)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r1)     // Catch: java.lang.Throwable -> L99e
        L513:
            java.lang.String r1 = "77"
            java.lang.String r2 = "77"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "78"
            java.lang.String r2 = "78"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "79"
            java.lang.String r2 = "79"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "84"
            java.lang.String r2 = "84"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "80"
            java.lang.String r2 = "80"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "81"
            java.lang.String r2 = "81"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "82"
            java.lang.String r2 = "82"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "83"
            java.lang.String r2 = "83"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "87"
            java.lang.String r2 = "87"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "89"
            java.lang.String r2 = "89"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "90"
            java.lang.String r2 = "90"
            org.json.JSONObject r2 = r5.d(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "75"
            java.lang.String r2 = "75"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "88"
            java.lang.String r2 = "88"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "92"
            java.lang.String r2 = "92"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "93"
            java.lang.String r2 = "93"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "94"
            java.lang.String r2 = "94"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "95"
            java.lang.String r2 = "95"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "98"
            java.lang.String r2 = "98"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "100"
            java.lang.String r2 = "100"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "105"
            java.lang.String r2 = "105"
            java.lang.String r2 = r5.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "plc001_r_rcl_li"
            r9 = 1
            int r1 = r4.b(r1, r9)     // Catch: java.lang.Throwable -> L99e
            if (r1 != r9) goto L621
            com.kuaishou.weapon.p0.aq r1 = new com.kuaishou.weapon.p0.aq     // Catch: java.lang.Throwable -> L99e
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L99e
            r9 = 0
            r1.<init>(r2, r9)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "108"
            java.lang.String r5 = "108"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "109"
            java.lang.String r5 = "109"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "111"
            java.lang.String r5 = "111"
            java.lang.String r1 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r1)     // Catch: java.lang.Throwable -> L99e
        L621:
            java.lang.String r1 = "plc001_r_rcl_em"
            r9 = 1
            int r1 = r4.b(r1, r9)     // Catch: java.lang.Throwable -> L99e
            if (r1 != r9) goto L6b2
            com.kuaishou.weapon.p0.aq r1 = new com.kuaishou.weapon.p0.aq     // Catch: java.lang.Throwable -> L99e
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L99e
            r1.<init>(r2, r9)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "112"
            java.lang.String r5 = "112"
            java.util.Set r5 = r1.b(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "113"
            java.lang.String r5 = "113"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "114"
            java.lang.String r5 = "114"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "115"
            java.lang.String r5 = "115"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "116"
            java.lang.String r5 = "116"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "117"
            java.lang.String r5 = "117"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "120"
            java.lang.String r5 = "120"
            java.lang.String r1 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r1)     // Catch: java.lang.Throwable -> L99e
            com.kuaishou.weapon.p0.aq r1 = new com.kuaishou.weapon.p0.aq     // Catch: java.lang.Throwable -> L99e
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L99e
            r5 = 4
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "124"
            java.lang.String r5 = "124"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "125"
            java.lang.String r5 = "125"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "126"
            java.lang.String r5 = "126"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "127"
            java.lang.String r5 = "127"
            java.lang.String r1 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r1)     // Catch: java.lang.Throwable -> L99e
        L6b2:
            java.lang.String r1 = "plc001_r_rcl_vp"
            r9 = 0
            int r1 = r4.b(r1, r9)     // Catch: java.lang.Throwable -> L99e
            r9 = 1
            if (r1 != r9) goto L719
            com.kuaishou.weapon.p0.av r1 = new com.kuaishou.weapon.p0.av     // Catch: java.lang.Throwable -> L99e
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L99e
            r1.<init>(r2, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "97"
            java.lang.String r5 = "97"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "118"
            java.lang.String r5 = "118"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "119"
            java.lang.String r5 = "119"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "135"
            java.lang.String r5 = "135"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "174"
            java.lang.String r5 = "174"
            java.lang.String r1 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r1)     // Catch: java.lang.Throwable -> L99e
            com.kuaishou.weapon.p0.av r1 = new com.kuaishou.weapon.p0.av     // Catch: java.lang.Throwable -> L99e
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L99e
            r5 = 200(0xc8, float:2.8E-43)
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "173"
            java.lang.String r5 = "173"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "182"
            java.lang.String r5 = "182"
            java.lang.String r1 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r1)     // Catch: java.lang.Throwable -> L99e
        L719:
            java.lang.String r1 = "plc001_r_rcl_rcd"
            r9 = 1
            int r1 = r4.b(r1, r9)     // Catch: java.lang.Throwable -> L99e
            if (r1 != r9) goto L79e
            com.kuaishou.weapon.p0.be r1 = new com.kuaishou.weapon.p0.be     // Catch: java.lang.Throwable -> L99e
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L99e
            r5 = 4
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "129"
            java.lang.String r5 = "129"
            java.lang.String r1 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r1)     // Catch: java.lang.Throwable -> L99e
            com.kuaishou.weapon.p0.be r1 = new com.kuaishou.weapon.p0.be     // Catch: java.lang.Throwable -> L99e
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L99e
            r9 = 1
            r1.<init>(r2, r9)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "121"
            org.json.JSONObject r5 = r1.a()     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "121"
            org.json.JSONArray r1 = r1.a(r5, r6)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r1)     // Catch: java.lang.Throwable -> L99e
            com.kuaishou.weapon.p0.be r1 = new com.kuaishou.weapon.p0.be     // Catch: java.lang.Throwable -> L99e
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L99e
            r5 = 2
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "137"
            java.lang.String r5 = "137"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "138"
            java.lang.String r5 = "138"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "141"
            java.lang.String r5 = "141"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "142"
            java.lang.String r5 = "142"
            java.lang.String r1 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r1)     // Catch: java.lang.Throwable -> L99e
            com.kuaishou.weapon.p0.bf r1 = new com.kuaishou.weapon.p0.bf     // Catch: java.lang.Throwable -> L99e
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L99e
            r5 = 3
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "150"
            org.json.JSONArray r2 = r1.b(r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r5 = "150"
            r3.put(r5, r2)     // Catch: java.lang.Throwable -> L99e
            if (r2 == 0) goto L79e
            java.lang.String r5 = "188"
            org.json.JSONObject r1 = r1.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r5, r1)     // Catch: java.lang.Throwable -> L99e
        L79e:
            java.lang.String r1 = "plc001_r_rcl_re"
            r9 = 1
            int r1 = r4.b(r1, r9)     // Catch: java.lang.Throwable -> L99e
            if (r1 != r9) goto L810
            com.kuaishou.weapon.p0.ba r1 = new com.kuaishou.weapon.p0.ba     // Catch: java.lang.Throwable -> L99e
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L99e
            r1.<init>(r2, r7)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "152"
            java.lang.String r5 = "152"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "153"
            java.lang.String r5 = "153"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "156"
            java.lang.String r5 = "156"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "157"
            java.lang.String r5 = "157"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "163"
            java.lang.String r5 = "163"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "171"
            java.lang.String r5 = "171"
            r9 = 1
            org.json.JSONObject r5 = r1.a(r5, r9)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "172"
            java.lang.String r5 = "172"
            org.json.JSONObject r1 = r1.b(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r1)     // Catch: java.lang.Throwable -> L99e
            com.kuaishou.weapon.p0.ba r1 = new com.kuaishou.weapon.p0.ba     // Catch: java.lang.Throwable -> L99e
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L99e
            r5 = 500(0x1f4, float:7.0E-43)
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "177"
            java.lang.String r5 = "177"
            org.json.JSONObject r1 = r1.d(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r1)     // Catch: java.lang.Throwable -> L99e
        L810:
            if (r23 != 0) goto L814
            if (r24 == 0) goto L832
        L814:
            java.lang.String r1 = "plc001_r_rcl_hk"
            r9 = 0
            int r1 = r4.b(r1, r9)     // Catch: java.lang.Throwable -> L99e
            r9 = 1
            if (r1 != r9) goto L832
            com.kuaishou.weapon.p0.ba r1 = new com.kuaishou.weapon.p0.ba     // Catch: java.lang.Throwable -> L99e
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L99e
            r5 = 300(0x12c, float:4.2E-43)
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "158"
            java.lang.String r5 = "158"
            org.json.JSONObject r1 = r1.b(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r1)     // Catch: java.lang.Throwable -> L99e
        L832:
            java.lang.String r1 = "plc001_r_rcl_ud"
            r9 = 0
            int r1 = r4.b(r1, r9)     // Catch: java.lang.Throwable -> L99e
            r9 = 1
            if (r1 != r9) goto L892
            com.kuaishou.weapon.p0.bd r1 = new com.kuaishou.weapon.p0.bd     // Catch: java.lang.Throwable -> L99e
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L99e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "162"
            java.lang.String r5 = "162"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "160"
            org.json.JSONObject r5 = r1.a()     // Catch: java.lang.Throwable -> L99e
            java.lang.String r6 = "160"
            org.json.JSONArray r1 = r1.a(r5, r6)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r1)     // Catch: java.lang.Throwable -> L99e
            com.kuaishou.weapon.p0.ba r1 = new com.kuaishou.weapon.p0.ba     // Catch: java.lang.Throwable -> L99e
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L99e
            r5 = 400(0x190, float:5.6E-43)
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "164"
            java.lang.String r5 = "164"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "165"
            java.lang.String r5 = "165"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "166"
            java.lang.String r5 = "166"
            org.json.JSONArray r5 = r1.c(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "167"
            java.lang.String r5 = "167"
            java.lang.String r1 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r1)     // Catch: java.lang.Throwable -> L99e
        L892:
            java.lang.String r1 = "plc001_r_rcl_sc"
            r9 = 1
            int r1 = r4.b(r1, r9)     // Catch: java.lang.Throwable -> L99e
            if (r1 != r9) goto L8c5
            com.kuaishou.weapon.p0.ay r1 = new com.kuaishou.weapon.p0.ay     // Catch: java.lang.Throwable -> L99e
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L99e
            r5 = 600(0x258, float:8.41E-43)
            r1.<init>(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "179"
            java.lang.String r5 = "179"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "186"
            java.lang.String r5 = "186"
            java.lang.String r5 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r5)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "189"
            java.lang.String r5 = "189"
            java.lang.String r1 = r1.a(r5)     // Catch: java.lang.Throwable -> L99e
            r3.put(r2, r1)     // Catch: java.lang.Throwable -> L99e
        L8c5:
            java.lang.String r1 = "60"
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L99e
            boolean r2 = com.kuaishou.weapon.p0.ab.b(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "11000"
            boolean r2 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "11002"
            java.lang.String r2 = com.kuaishou.weapon.p0.jni.Engine.soVersion     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "plc001_v"
            java.lang.String r2 = "0.0.0"
            java.lang.String r1 = r4.b(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = "11008"
            r3.put(r2, r1)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "11009"
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L99e
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L99e
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r2 = com.kuaishou.weapon.p0.bs.a(r2)     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "11301"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L931
            java.lang.String r2 = r2.Mn()     // Catch: java.lang.Throwable -> L931
            java.lang.String r2 = com.kuaishou.weapon.p0.bh.c(r2)     // Catch: java.lang.Throwable -> L931
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L931
            java.lang.String r1 = "11302"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L931
            java.lang.String r2 = r2.getSdkVersion()     // Catch: java.lang.Throwable -> L931
            java.lang.String r2 = com.kuaishou.weapon.p0.bh.c(r2)     // Catch: java.lang.Throwable -> L931
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L931
            java.lang.String r1 = "11303"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L931
            java.lang.String r2 = r2.getAppId()     // Catch: java.lang.Throwable -> L931
            java.lang.String r2 = com.kuaishou.weapon.p0.bh.c(r2)     // Catch: java.lang.Throwable -> L931
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L931
        L931:
            java.lang.String r1 = "plc001_scc_e"
            java.lang.String r2 = ""
            r9 = 1
            java.lang.String r1 = r4.b(r1, r2, r9)     // Catch: java.lang.Throwable -> L99e
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L99e
            if (r2 != 0) goto L94c
            java.lang.String r2 = "183"
            r3.put(r2, r1)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "plc001_scc_e"
            java.lang.String r2 = ""
            r4.c(r1, r2)     // Catch: java.lang.Throwable -> L99e
        L94c:
            java.lang.String r1 = "11006"
            r2 = r23
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "11029"
            r2 = r24
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "11028"
            java.lang.String r2 = com.kuaishou.weapon.p0.WeaponHI.sKSSdkver     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "20000"
            int r2 = r0.b     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "20001"
            int r2 = r0.c     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "02078"
            java.lang.String r2 = "W_S_V"
            java.lang.String r2 = com.kuaishou.weapon.p0.jni.A.getE(r2)     // Catch: java.lang.Throwable -> L985
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L985
            java.lang.String r1 = "02079"
            java.lang.String r2 = "W_S_S_V"
            java.lang.String r2 = com.kuaishou.weapon.p0.jni.A.getE(r2)     // Catch: java.lang.Throwable -> L985
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L985
        L985:
            java.lang.String r1 = "11007"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L99e
            long r4 = r4 - r18
            r3.put(r1, r4)     // Catch: java.lang.Throwable -> L99e
            java.lang.String r1 = "11017"
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L99e
            int r2 = r2.length()     // Catch: java.lang.Throwable -> L99e
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L99e
            return r3
        L99e:
            r1 = 0
            return r1
    }
}
