package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class cj {
    private android.content.Context a;

    public cj(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
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
            java.lang.String r1 = "20"
            java.lang.String r2 = "19"
            java.lang.String r3 = "18"
            java.lang.String r4 = "17"
            java.lang.String r5 = "16"
            java.lang.String r6 = "15"
            java.lang.String r7 = "14"
            java.lang.String r8 = "13"
            java.lang.String r9 = "12"
            java.lang.String r10 = "11"
            java.lang.String r11 = "10"
            java.lang.String r12 = "9"
            java.lang.String r13 = "8"
            java.lang.String r14 = "7"
            java.lang.String r15 = "6"
            r16 = r1
            java.lang.String r1 = "5"
            r17 = r2
            java.lang.String r2 = "4"
            r18 = r3
            java.lang.String r3 = "2"
            r19 = r4
            java.lang.String r4 = "1"
            r20 = r5
            java.lang.String r5 = "0"
            r21 = r6
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L481
            r6.<init>()     // Catch: java.lang.Throwable -> L481
            r22 = r7
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L481
            r23 = r8
            java.lang.String r8 = "re_po_rt"
            com.kuaishou.weapon.p0.h r7 = com.kuaishou.weapon.p0.h.a(r7, r8)     // Catch: java.lang.Throwable -> L481
            java.lang.String r8 = "a1_p_s_p_s"
            boolean r8 = r7.e(r8)     // Catch: java.lang.Throwable -> L481
            r24 = r8
            java.lang.String r8 = "a1_p_s_p_s_c_b"
            boolean r8 = r7.e(r8)     // Catch: java.lang.Throwable -> L481
            r25 = r8
            java.lang.String r8 = "plc002_pp_s"
            r26 = r9
            r9 = 1
            int r8 = r7.b(r8, r9)     // Catch: java.lang.Throwable -> L481
            if (r8 != r9) goto L47f
            long r27 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L481
            java.lang.String r8 = "plc002_pp_pcl_cp"
            r9 = 0
            int r8 = r7.b(r8, r9)     // Catch: java.lang.Throwable -> L481
            r9 = 1
            if (r8 != r9) goto L258
            boolean r8 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess     // Catch: java.lang.Throwable -> L481
            if (r8 == 0) goto L258
            com.kuaishou.weapon.p0.ap r8 = new com.kuaishou.weapon.p0.ap     // Catch: java.lang.Throwable -> L481
            android.content.Context r9 = r0.a     // Catch: java.lang.Throwable -> L481
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L481
            java.lang.String r9 = r8.b(r5)     // Catch: java.lang.Throwable -> L481
            r6.put(r5, r9)     // Catch: java.lang.Throwable -> L481
            java.lang.String r5 = r8.b(r4)     // Catch: java.lang.Throwable -> L481
            r6.put(r4, r5)     // Catch: java.lang.Throwable -> L481
            java.lang.String r4 = r8.b(r3)     // Catch: java.lang.Throwable -> L481
            r6.put(r3, r4)     // Catch: java.lang.Throwable -> L481
            java.lang.String r3 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = r8.b(r1)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = r8.b(r15)     // Catch: java.lang.Throwable -> L481
            r6.put(r15, r1)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = r8.b(r14)     // Catch: java.lang.Throwable -> L481
            r6.put(r14, r1)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = r8.b(r13)     // Catch: java.lang.Throwable -> L481
            r6.put(r13, r1)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = r8.b(r12)     // Catch: java.lang.Throwable -> L481
            r6.put(r12, r1)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = r8.b(r11)     // Catch: java.lang.Throwable -> L481
            r6.put(r11, r1)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = r8.b(r10)     // Catch: java.lang.Throwable -> L481
            r6.put(r10, r1)     // Catch: java.lang.Throwable -> L481
            r1 = r26
            java.lang.String r2 = r8.b(r1)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            r1 = r23
            java.lang.String r2 = r8.b(r1)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            r1 = r22
            java.lang.String r2 = r8.b(r1)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            r1 = r21
            java.lang.String r2 = r8.b(r1)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            r1 = r20
            java.lang.String r2 = r8.b(r1)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            r1 = r19
            java.lang.String r2 = r8.b(r1)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            r1 = r18
            java.lang.String r2 = r8.b(r1)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            r1 = r17
            java.lang.String r2 = r8.b(r1)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            r1 = r16
            java.lang.String r2 = r8.b(r1)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "21"
            java.lang.String r2 = "21"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "22"
            java.lang.String r2 = "22"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "23"
            java.lang.String r2 = "23"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "24"
            java.lang.String r2 = "24"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "25"
            java.lang.String r2 = "25"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "26"
            java.lang.String r2 = "26"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "27"
            java.lang.String r2 = "27"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "28"
            java.lang.String r2 = "28"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "29"
            java.lang.String r2 = "29"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "30"
            java.lang.String r2 = "30"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "31"
            java.lang.String r2 = "31"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "32"
            java.lang.String r2 = "32"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "33"
            java.lang.String r2 = "33"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "34"
            java.lang.String r2 = "34"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "35"
            java.lang.String r2 = "35"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "36"
            java.lang.String r2 = "36"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "37"
            java.lang.String r2 = "37"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "38"
            java.lang.String r2 = "38"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "39"
            java.lang.String r2 = "39"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "40"
            java.lang.String r2 = "40"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "41"
            java.lang.String r2 = "41"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "42"
            java.lang.String r2 = "42"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "43"
            java.lang.String r2 = "43"
            org.json.JSONObject r2 = r8.a(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "44"
            java.lang.String r2 = "44"
            org.json.JSONObject r2 = r8.a(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "101"
            java.lang.String r2 = "101"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "102"
            java.lang.String r2 = "102"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "105"
            java.lang.String r2 = "105"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "106"
            java.lang.String r2 = "106"
            java.lang.String r2 = r8.b(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            android.content.Context r1 = r0.a     // Catch: java.lang.Throwable -> L481
            java.util.Set r1 = com.kuaishou.weapon.p0.dl.b(r1)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "49"
            r6.put(r2, r1)     // Catch: java.lang.Throwable -> L481
        L258:
            java.lang.String r1 = "plc002_pp_pcl_gc"
            r9 = 1
            int r1 = r7.b(r1, r9)     // Catch: java.lang.Throwable -> L481
            if (r1 != r9) goto L334
            boolean r1 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess     // Catch: java.lang.Throwable -> L481
            if (r1 == 0) goto L334
            com.kuaishou.weapon.p0.at r1 = new com.kuaishou.weapon.p0.at     // Catch: java.lang.Throwable -> L481
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L481
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "45"
            java.lang.String r3 = "45"
            org.json.JSONArray r3 = r1.d(r3)     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L481
            boolean r2 = r1.a()     // Catch: java.lang.Throwable -> L481
            if (r2 == 0) goto L284
            java.lang.String r2 = "93"
            r9 = 1
            r6.put(r2, r9)     // Catch: java.lang.Throwable -> L481
            goto L285
        L284:
            r9 = 1
        L285:
            boolean r2 = r1.b()     // Catch: java.lang.Throwable -> L481
            if (r2 == 0) goto L290
            java.lang.String r2 = "94"
            r6.put(r2, r9)     // Catch: java.lang.Throwable -> L481
        L290:
            java.lang.String r2 = "46"
            java.lang.String r3 = "46"
            org.json.JSONArray r3 = r1.d(r3)     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "48"
            java.lang.String r3 = "48"
            java.lang.String r3 = r1.a(r3)     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "51"
            java.lang.String r3 = "51"
            org.json.JSONArray r3 = r1.b(r3)     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "52"
            android.content.Context r3 = r0.a     // Catch: java.lang.Throwable -> L481
            java.lang.String r4 = "52"
            r5 = 0
            java.util.Set r3 = r1.a(r3, r4, r5)     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "55"
            java.lang.String r3 = "55"
            java.util.Set r3 = r1.c(r3)     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "66"
            java.lang.String r3 = "66"
            java.lang.String r3 = r1.a(r3)     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "67"
            int r3 = com.kuaishou.weapon.p0.di.d()     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "78"
            java.lang.String r3 = "78"
            java.lang.String r3 = r1.a(r3)     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "79"
            java.lang.String r3 = "79"
            java.lang.String r1 = r1.a(r3)     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r1)     // Catch: java.lang.Throwable -> L481
            com.kuaishou.weapon.p0.az r1 = new com.kuaishou.weapon.p0.az     // Catch: java.lang.Throwable -> L481
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L481
            r3 = 200(0xc8, float:2.8E-43)
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "70"
            java.lang.String r3 = "70"
            org.json.JSONObject r3 = r1.a(r3)     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "71"
            java.lang.String r3 = "71"
            org.json.JSONObject r3 = r1.a(r3)     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "72"
            java.lang.String r3 = "72"
            org.json.JSONObject r3 = r1.a(r3)     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "73"
            java.lang.String r3 = "73"
            org.json.JSONObject r3 = r1.a(r3)     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "74"
            java.lang.String r3 = "74"
            org.json.JSONObject r1 = r1.a(r3)     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r1)     // Catch: java.lang.Throwable -> L481
        L334:
            java.lang.String r1 = "plc002_pp_pcl_pds"
            r9 = 1
            int r1 = r7.b(r1, r9)     // Catch: java.lang.Throwable -> L481
            if (r1 != r9) goto L371
            com.kuaishou.weapon.p0.ax r1 = new com.kuaishou.weapon.p0.ax     // Catch: java.lang.Throwable -> L481
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L481
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "53"
            android.content.Context r3 = r0.a     // Catch: java.lang.Throwable -> L481
            java.lang.String r4 = "53"
            r9 = 1
            java.util.Set r3 = r1.a(r3, r4, r9)     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "56"
            java.lang.String r3 = "56"
            java.lang.String r3 = r1.a(r3)     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "57"
            java.lang.String r3 = "57"
            java.lang.String r1 = r1.a(r3)     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r1)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "64"
            java.lang.String r2 = com.kuaishou.weapon.p0.di.a()     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
        L371:
            java.lang.String r1 = "plc002_pp_pcl_pam"
            r9 = 1
            int r1 = r7.b(r1, r9)     // Catch: java.lang.Throwable -> L481
            if (r1 != r9) goto L3f1
            com.kuaishou.weapon.p0.cs r1 = new com.kuaishou.weapon.p0.cs     // Catch: java.lang.Throwable -> L481
            r1.<init>()     // Catch: java.lang.Throwable -> L481
            org.json.JSONObject r2 = r1.a()     // Catch: java.lang.Throwable -> L481
            java.lang.String r3 = "98"
            r6.put(r3, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "107"
            org.json.JSONObject r1 = r1.b()     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r1)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = com.kuaishou.weapon.p0.am.d()     // Catch: java.lang.Throwable -> L481
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L481
            if (r2 != 0) goto L3a0
            java.lang.String r2 = "77"
            r6.put(r2, r1)     // Catch: java.lang.Throwable -> L481
        L3a0:
            java.lang.String r1 = "104"
            int r2 = com.kuaishou.weapon.p0.am.c()     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "109"
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L481
            int r2 = com.kuaishou.weapon.p0.dl.e(r2)     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            com.kuaishou.weapon.p0.aj r1 = new com.kuaishou.weapon.p0.aj     // Catch: java.lang.Throwable -> L481
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L481
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "82"
            int r3 = r1.h()     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = r1.i()     // Catch: java.lang.Throwable -> L481
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L481
            if (r3 != 0) goto L3d3
            java.lang.String r3 = "83"
            r6.put(r3, r2)     // Catch: java.lang.Throwable -> L481
        L3d3:
            java.lang.String r2 = r1.j()     // Catch: java.lang.Throwable -> L481
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L481
            if (r3 != 0) goto L3e2
            java.lang.String r3 = "84"
            r6.put(r3, r2)     // Catch: java.lang.Throwable -> L481
        L3e2:
            java.lang.String r1 = r1.k()     // Catch: java.lang.Throwable -> L481
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L481
            if (r2 != 0) goto L3f1
            java.lang.String r2 = "86"
            r6.put(r2, r1)     // Catch: java.lang.Throwable -> L481
        L3f1:
            java.lang.String r1 = "plc002_pp_pcl_pke"
            r9 = 1
            int r1 = r7.b(r1, r9)     // Catch: java.lang.Throwable -> L481
            if (r1 != r9) goto L451
            com.kuaishou.weapon.p0.au r1 = new com.kuaishou.weapon.p0.au     // Catch: java.lang.Throwable -> L481
            android.content.Context r2 = r0.a     // Catch: java.lang.Throwable -> L481
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "95"
            java.lang.String r3 = "95"
            java.util.List r3 = r1.b(r3)     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r3)     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "96"
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> L481
            r6.put(r2, r1)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "97"
            org.json.JSONObject r2 = com.kuaishou.weapon.p0.di.e()     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "11301"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L451
            java.lang.String r2 = r2.Mn()     // Catch: java.lang.Throwable -> L451
            java.lang.String r2 = com.kuaishou.weapon.p0.bh.c(r2)     // Catch: java.lang.Throwable -> L451
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L451
            java.lang.String r1 = "11302"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L451
            java.lang.String r2 = r2.getSdkVersion()     // Catch: java.lang.Throwable -> L451
            java.lang.String r2 = com.kuaishou.weapon.p0.bh.c(r2)     // Catch: java.lang.Throwable -> L451
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L451
            java.lang.String r1 = "11303"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()     // Catch: java.lang.Throwable -> L451
            java.lang.String r2 = r2.getAppId()     // Catch: java.lang.Throwable -> L451
            java.lang.String r2 = com.kuaishou.weapon.p0.bh.c(r2)     // Catch: java.lang.Throwable -> L451
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L451
        L451:
            java.lang.String r1 = "11006"
            r2 = r24
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "11029"
            r2 = r25
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "11002"
            java.lang.String r2 = com.kuaishou.weapon.p0.jni.Engine.soVersion     // Catch: java.lang.Throwable -> L481
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = "11007"
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L481
            long r2 = r2 - r27
            r6.put(r1, r2)     // Catch: java.lang.Throwable -> L481
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L481
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L481
            java.lang.String r2 = "11017"
            r6.put(r2, r1)     // Catch: java.lang.Throwable -> L481
            return r6
        L47f:
            r1 = 0
            return r1
        L481:
            r1 = 0
            return r1
    }
}
