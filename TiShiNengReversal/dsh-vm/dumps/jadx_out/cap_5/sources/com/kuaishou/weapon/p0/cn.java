package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class cn {
    private android.content.Context a;
    private int b;

    public cn(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
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
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L47
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L47
            r3.<init>()     // Catch: java.lang.Throwable -> L47
            android.content.Context r4 = r0.a     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = "re_po_rt"
            com.kuaishou.weapon.p0.h r4 = com.kuaishou.weapon.p0.h.a(r4, r5)     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = "a1_p_s_p_s"
            boolean r5 = r4.e(r5)     // Catch: java.lang.Throwable -> L47
            java.lang.String r6 = "a1_p_s_p_s_c_b"
            boolean r6 = r4.e(r6)     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = "plc001_b_bcl_ie"
            r8 = 1
            int r7 = r4.b(r7, r8)     // Catch: java.lang.Throwable -> L47
            r9 = 0
            java.lang.String r10 = "RISK"
            if (r7 != r8) goto La6
            if (r5 != 0) goto L2f
            if (r6 == 0) goto La6
        L2f:
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = com.kuaishou.weapon.p0.bh.a(r7)     // Catch: java.lang.Throwable -> L47
            boolean r11 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L47
            if (r11 != 0) goto L4a
            boolean r11 = r7.startsWith(r10)     // Catch: java.lang.Throwable -> L47
            if (r11 != 0) goto L4a
            java.lang.String r11 = "01001"
            r3.put(r11, r7)     // Catch: java.lang.Throwable -> L47
            goto L4a
        L47:
            r1 = r0
            goto Le4a
        L4a:
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = com.kuaishou.weapon.p0.bh.c(r7)     // Catch: java.lang.Throwable -> L47
            boolean r11 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L47
            if (r11 != 0) goto L61
            boolean r11 = r7.startsWith(r10)     // Catch: java.lang.Throwable -> L47
            if (r11 != 0) goto L61
            java.lang.String r11 = "01003"
            r3.put(r11, r7)     // Catch: java.lang.Throwable -> L47
        L61:
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = com.kuaishou.weapon.p0.bh.b(r7, r9)     // Catch: java.lang.Throwable -> L47
            boolean r11 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L47
            if (r11 != 0) goto L78
            boolean r11 = r7.startsWith(r10)     // Catch: java.lang.Throwable -> L47
            if (r11 != 0) goto L78
            java.lang.String r11 = "01019"
            r3.put(r11, r7)     // Catch: java.lang.Throwable -> L47
        L78:
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = com.kuaishou.weapon.p0.bh.b(r7, r8)     // Catch: java.lang.Throwable -> L47
            boolean r11 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L47
            if (r11 != 0) goto L8f
            boolean r11 = r7.startsWith(r10)     // Catch: java.lang.Throwable -> L47
            if (r11 != 0) goto L8f
            java.lang.String r11 = "01004"
            r3.put(r11, r7)     // Catch: java.lang.Throwable -> L47
        L8f:
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = com.kuaishou.weapon.p0.bh.d(r7)     // Catch: java.lang.Throwable -> L47
            boolean r11 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L47
            if (r11 != 0) goto La6
            boolean r11 = r7.startsWith(r10)     // Catch: java.lang.Throwable -> L47
            if (r11 != 0) goto La6
            java.lang.String r11 = "01007"
            r3.put(r11, r7)     // Catch: java.lang.Throwable -> L47
        La6:
            java.lang.String r7 = "plc001_b_bcl_is"
            int r7 = r4.b(r7, r9)     // Catch: java.lang.Throwable -> L47
            if (r7 != r8) goto Lca
            if (r5 != 0) goto Lb2
            if (r6 == 0) goto Lca
        Lb2:
            com.kuaishou.weapon.p0.bg r7 = new com.kuaishou.weapon.p0.bg     // Catch: java.lang.Throwable -> L47
            r7.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r11 = "plc001_b_pry_gsl"
            int r11 = r4.b(r11, r8)     // Catch: java.lang.Throwable -> L47
            if (r11 != r8) goto Lca
            java.lang.String r11 = "10020"
            android.content.Context r12 = r0.a     // Catch: java.lang.Throwable -> L47
            org.json.JSONObject r7 = r7.f(r12)     // Catch: java.lang.Throwable -> L47
            r3.put(r11, r7)     // Catch: java.lang.Throwable -> L47
        Lca:
            java.lang.String r7 = "plc001_b_bcl_ic"
            int r7 = r4.b(r7, r8)     // Catch: java.lang.Throwable -> L47
            if (r7 != r8) goto Le1
            if (r5 != 0) goto Ld6
            if (r6 == 0) goto Le1
        Ld6:
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = com.kuaishou.weapon.p0.bh.e(r7)     // Catch: java.lang.Throwable -> L47
            java.lang.String r11 = "01011"
            r3.put(r11, r7)     // Catch: java.lang.Throwable -> L47
        Le1:
            java.lang.String r7 = "plc001_b_bcl_btm"
            int r7 = r4.b(r7, r8)     // Catch: java.lang.Throwable -> L47
            if (r7 != r8) goto L104
            if (r5 != 0) goto Led
            if (r6 == 0) goto L104
        Led:
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = com.kuaishou.weapon.p0.bh.p(r7)     // Catch: java.lang.Throwable -> L47
            boolean r11 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L47
            if (r11 != 0) goto L104
            boolean r11 = r7.startsWith(r10)     // Catch: java.lang.Throwable -> L47
            if (r11 != 0) goto L104
            java.lang.String r11 = "01016"
            r3.put(r11, r7)     // Catch: java.lang.Throwable -> L47
        L104:
            java.lang.String r7 = "plc001_b_bcl_d"
            int r7 = r4.b(r7, r8)     // Catch: java.lang.Throwable -> L47
            java.lang.String r11 = ""
            if (r7 != r8) goto L708
            if (r5 != 0) goto L112
            if (r6 == 0) goto L134
        L112:
            android.content.Context r7 = r0.a     // Catch: java.lang.Throwable -> L47
            java.lang.String r7 = com.kuaishou.weapon.p0.bh.f(r7)     // Catch: java.lang.Throwable -> L47
            boolean r12 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L47
            if (r12 != 0) goto L129
            boolean r12 = r7.startsWith(r10)     // Catch: java.lang.Throwable -> L47
            if (r12 != 0) goto L129
            java.lang.String r12 = "01013"
            r3.put(r12, r7)     // Catch: java.lang.Throwable -> L47
        L129:
            java.lang.String r7 = "02042"
            android.content.Context r12 = r0.a     // Catch: java.lang.Throwable -> L47
            int r12 = com.kuaishou.weapon.p0.bh.u(r12)     // Catch: java.lang.Throwable -> L47
            r3.put(r7, r12)     // Catch: java.lang.Throwable -> L47
        L134:
            boolean r7 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess     // Catch: java.lang.Throwable -> L47
            java.lang.String r12 = "02018"
            java.lang.String r13 = "02017"
            java.lang.String r14 = "02016"
            java.lang.String r15 = "02015"
            java.lang.String r9 = "02014"
            java.lang.String r8 = "02013"
            r16 = r1
            java.lang.String r1 = "02012"
            java.lang.String r2 = "02011"
            r18 = r7
            java.lang.String r7 = "02010"
            r19 = r6
            java.lang.String r6 = "02009"
            r20 = r5
            java.lang.String r5 = "02008"
            r21 = r10
            java.lang.String r10 = "02007"
            r22 = r4
            java.lang.String r4 = "02006"
            r23 = r11
            java.lang.String r11 = "02005"
            r24 = r12
            java.lang.String r12 = "02004"
            r25 = r13
            java.lang.String r13 = "02003"
            r26 = r14
            java.lang.String r14 = "02002"
            r27 = r15
            java.lang.String r15 = "02001"
            if (r18 == 0) goto L41f
            r18 = r9
            java.lang.String r9 = "02019"
            r28 = r8
            android.content.Context r8 = r0.a     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r8 = com.kuaishou.weapon.p0.bl.b(r8)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            r3.put(r9, r8)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r8 = "02021"
            android.content.Context r9 = r0.a     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r9 = com.kuaishou.weapon.p0.bl.d(r9)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            r3.put(r8, r9)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r8 = "02022"
            android.content.Context r9 = r0.a     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r9 = com.kuaishou.weapon.p0.bl.c(r9)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            r3.put(r8, r9)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r8 = "02030"
            android.content.Context r9 = r0.a     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r9 = com.kuaishou.weapon.p0.bl.f(r9)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            r3.put(r8, r9)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            com.kuaishou.weapon.p0.ce r8 = new com.kuaishou.weapon.p0.ce     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            android.content.Context r9 = r0.a     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r9 = "01014"
            java.lang.String r0 = "01014"
            java.lang.String r0 = r8.a(r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r0 == 0) goto L1be
            java.lang.String r0 = "01014"
            java.lang.String r0 = r8.a(r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L1c0
        L1ba:
            r1 = r29
            goto Le4a
        L1be:
            r0 = r23
        L1c0:
            r3.put(r9, r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = r8.a(r15)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r0 == 0) goto L1ce
            java.lang.String r0 = r8.a(r15)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L1d2
        L1ce:
            java.lang.String r0 = com.kuaishou.weapon.p0.bl.a()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L1d2:
            r3.put(r15, r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = r8.a(r14)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r0 == 0) goto L1e0
            java.lang.String r0 = r8.a(r14)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L1e4
        L1e0:
            java.lang.String r0 = com.kuaishou.weapon.p0.bl.b()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L1e4:
            r3.put(r14, r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = r8.a(r13)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r0 == 0) goto L1f2
            java.lang.String r0 = r8.a(r13)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L1f6
        L1f2:
            java.lang.String r0 = com.kuaishou.weapon.p0.bl.c()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L1f6:
            r3.put(r13, r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = r8.a(r12)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r0 == 0) goto L204
            java.lang.String r0 = r8.a(r12)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L208
        L204:
            java.lang.String r0 = com.kuaishou.weapon.p0.bl.d()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L208:
            r3.put(r12, r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = r8.a(r11)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r0 == 0) goto L216
            java.lang.String r0 = r8.a(r11)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L21a
        L216:
            java.lang.String r0 = com.kuaishou.weapon.p0.bl.e()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L21a:
            r3.put(r11, r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = r8.a(r4)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r0 == 0) goto L228
            java.lang.String r0 = r8.a(r4)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L22c
        L228:
            java.lang.String r0 = com.kuaishou.weapon.p0.bl.f()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L22c:
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = r8.a(r10)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r0 == 0) goto L23a
            java.lang.String r0 = r8.a(r10)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L23e
        L23a:
            java.lang.String r0 = com.kuaishou.weapon.p0.bl.g()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L23e:
            r3.put(r10, r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = r8.a(r5)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r0 == 0) goto L24c
            java.lang.String r0 = r8.a(r5)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L250
        L24c:
            java.lang.String r0 = com.kuaishou.weapon.p0.bl.h()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L250:
            r3.put(r5, r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = r8.a(r6)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r0 == 0) goto L25e
            java.lang.String r0 = r8.a(r6)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L262
        L25e:
            java.lang.String r0 = com.kuaishou.weapon.p0.bl.i()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L262:
            r3.put(r6, r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = r8.a(r7)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r0 == 0) goto L270
            java.lang.String r0 = r8.a(r7)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L274
        L270:
            java.lang.String r0 = com.kuaishou.weapon.p0.bl.j()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L274:
            r3.put(r7, r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = r8.a(r2)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r0 == 0) goto L282
            java.lang.String r0 = r8.a(r2)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L286
        L282:
            java.lang.String r0 = com.kuaishou.weapon.p0.bl.k()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L286:
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r0 == 0) goto L294
            java.lang.String r0 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L298
        L294:
            java.lang.String r0 = com.kuaishou.weapon.p0.bl.l()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L298:
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            r0 = r28
            java.lang.String r1 = r8.a(r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r1 == 0) goto L2a8
            java.lang.String r1 = r8.a(r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L2ac
        L2a8:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.m()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L2ac:
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            r9 = r18
            java.lang.String r0 = r8.a(r9)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r0 == 0) goto L2bc
            java.lang.String r0 = r8.a(r9)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L2c0
        L2bc:
            java.lang.String r0 = com.kuaishou.weapon.p0.bl.n()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L2c0:
            r3.put(r9, r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            r0 = r27
            java.lang.String r1 = r8.a(r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r1 == 0) goto L2d0
            java.lang.String r1 = r8.a(r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L2d4
        L2d0:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.p()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L2d4:
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            r0 = r26
            java.lang.String r1 = r8.a(r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r1 == 0) goto L2e4
            java.lang.String r1 = r8.a(r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L2e8
        L2e4:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.q()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L2e8:
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            r0 = r25
            java.lang.String r1 = r8.a(r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r1 == 0) goto L2f8
            java.lang.String r1 = r8.a(r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L300
        L2f8:
            int r1 = com.kuaishou.weapon.p0.bl.r()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L300:
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            r0 = r24
            java.lang.String r1 = r8.a(r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r1 == 0) goto L310
            java.lang.String r1 = r8.a(r0)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L314
        L310:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.s()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L314:
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = "02020"
            java.lang.String r1 = "02020"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r1 == 0) goto L328
            java.lang.String r1 = "02020"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L32c
        L328:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.u()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L32c:
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = "02023"
            java.lang.String r1 = "02023"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r1 == 0) goto L340
            java.lang.String r1 = "02023"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L342
        L340:
            r1 = r23
        L342:
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = "02031"
            java.lang.String r1 = "02031"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r1 == 0) goto L356
            java.lang.String r1 = "02031"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L35a
        L356:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.y()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L35a:
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = "02032"
            java.lang.String r1 = "02032"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r1 == 0) goto L36e
            java.lang.String r1 = "02032"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L372
        L36e:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.o()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L372:
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = "02033"
            java.lang.String r1 = "02033"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r1 == 0) goto L386
            java.lang.String r1 = "02033"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L38a
        L386:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.x()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L38a:
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = "02034"
            java.lang.String r1 = "02034"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r1 == 0) goto L39e
            java.lang.String r1 = "02034"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L3a2
        L39e:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.z()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L3a2:
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = "02035"
            java.lang.String r1 = "02035"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r1 == 0) goto L3b6
            java.lang.String r1 = "02035"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L3ba
        L3b6:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.A()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L3ba:
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = "02036"
            java.lang.String r1 = "02036"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r1 == 0) goto L3ce
            java.lang.String r1 = "02036"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L3d0
        L3ce:
            r1 = r23
        L3d0:
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = "02037"
            java.lang.String r1 = "02037"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r1 == 0) goto L3e4
            java.lang.String r1 = "02037"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L3e8
        L3e4:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.w()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L3e8:
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = "02038"
            java.lang.String r1 = "02038"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r1 == 0) goto L3fc
            java.lang.String r1 = "02038"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L400
        L3fc:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.v()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L400:
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            java.lang.String r0 = "02045"
            java.lang.String r1 = "02045"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            if (r1 == 0) goto L414
            java.lang.String r1 = "02045"
            java.lang.String r1 = r8.a(r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
            goto L418
        L414:
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.B()     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L418:
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L1ba java.lang.Exception -> L41b
        L41b:
            r1 = r29
            goto L525
        L41f:
            r0 = r8
            java.lang.String r8 = com.kuaishou.weapon.p0.bl.a()     // Catch: java.lang.Throwable -> L1ba
            r3.put(r15, r8)     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r8 = com.kuaishou.weapon.p0.bl.b()     // Catch: java.lang.Throwable -> L1ba
            r3.put(r14, r8)     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r8 = com.kuaishou.weapon.p0.bl.c()     // Catch: java.lang.Throwable -> L1ba
            r3.put(r13, r8)     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r8 = com.kuaishou.weapon.p0.bl.d()     // Catch: java.lang.Throwable -> L1ba
            r3.put(r12, r8)     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r8 = com.kuaishou.weapon.p0.bl.e()     // Catch: java.lang.Throwable -> L1ba
            r3.put(r11, r8)     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r8 = com.kuaishou.weapon.p0.bl.f()     // Catch: java.lang.Throwable -> L1ba
            r3.put(r4, r8)     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r4 = com.kuaishou.weapon.p0.bl.g()     // Catch: java.lang.Throwable -> L1ba
            r3.put(r10, r4)     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r4 = com.kuaishou.weapon.p0.bl.h()     // Catch: java.lang.Throwable -> L1ba
            r3.put(r5, r4)     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r4 = com.kuaishou.weapon.p0.bl.i()     // Catch: java.lang.Throwable -> L1ba
            r3.put(r6, r4)     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r4 = com.kuaishou.weapon.p0.bl.j()     // Catch: java.lang.Throwable -> L1ba
            r3.put(r7, r4)     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r4 = com.kuaishou.weapon.p0.bl.k()     // Catch: java.lang.Throwable -> L1ba
            r3.put(r2, r4)     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r2 = com.kuaishou.weapon.p0.bl.l()     // Catch: java.lang.Throwable -> L1ba
            r3.put(r1, r2)     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r1 = com.kuaishou.weapon.p0.bl.m()     // Catch: java.lang.Throwable -> L1ba
            r3.put(r0, r1)     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r0 = com.kuaishou.weapon.p0.bl.n()     // Catch: java.lang.Throwable -> L1ba
            r3.put(r9, r0)     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r0 = com.kuaishou.weapon.p0.bl.p()     // Catch: java.lang.Throwable -> L1ba
            r1 = r27
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r0 = com.kuaishou.weapon.p0.bl.q()     // Catch: java.lang.Throwable -> L1ba
            r1 = r26
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L1ba
            int r0 = com.kuaishou.weapon.p0.bl.r()     // Catch: java.lang.Throwable -> L1ba
            r1 = r25
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r0 = com.kuaishou.weapon.p0.bl.s()     // Catch: java.lang.Throwable -> L1ba
            r1 = r24
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L1ba
            java.lang.String r0 = "02019"
            r1 = r29
            android.content.Context r2 = r1.a     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r2 = com.kuaishou.weapon.p0.bl.b(r2)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02020"
            java.lang.String r2 = com.kuaishou.weapon.p0.bl.u()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02021"
            android.content.Context r2 = r1.a     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r2 = com.kuaishou.weapon.p0.bl.d(r2)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02022"
            android.content.Context r2 = r1.a     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r2 = com.kuaishou.weapon.p0.bl.c(r2)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02030"
            android.content.Context r2 = r1.a     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r2 = com.kuaishou.weapon.p0.bl.f(r2)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02031"
            java.lang.String r2 = com.kuaishou.weapon.p0.bl.y()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02032"
            java.lang.String r2 = com.kuaishou.weapon.p0.bl.o()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02033"
            java.lang.String r2 = com.kuaishou.weapon.p0.bl.x()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02034"
            java.lang.String r2 = com.kuaishou.weapon.p0.bl.z()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02035"
            java.lang.String r2 = com.kuaishou.weapon.p0.bl.A()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02037"
            java.lang.String r2 = com.kuaishou.weapon.p0.bl.w()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02038"
            java.lang.String r2 = com.kuaishou.weapon.p0.bl.v()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02045"
            java.lang.String r2 = com.kuaishou.weapon.p0.bl.B()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le4a
        L525:
            java.lang.String r0 = "02067"
            android.content.Context r2 = r1.a     // Catch: java.lang.Throwable -> Le4a
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> Le4a
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r2 = r2.getPackageResourcePath()     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = "/data/app/"
            r5 = r23
            java.lang.String r2 = r2.replace(r4, r5)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = "/base.apk"
            java.lang.String r2 = r2.replace(r4, r5)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02039"
            java.lang.String r2 = com.kuaishou.weapon.p0.bh.i()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02040"
            java.lang.String r2 = com.kuaishou.weapon.p0.bh.j()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02041"
            android.content.Context r2 = r1.a     // Catch: java.lang.Throwable -> Le4a
            int r2 = com.kuaishou.weapon.p0.bh.t(r2)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02044"
            java.lang.String r2 = com.kuaishou.weapon.p0.bl.t()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02046"
            java.lang.String r2 = com.kuaishou.weapon.p0.bl.C()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "persist.service.adb.enable"
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a(r0)     // Catch: java.lang.Throwable -> Le4a
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le4a
            if (r2 != 0) goto L586
            java.lang.String r2 = "03058"
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> Le4a
        L586:
            java.lang.String r0 = "sys.resettype"
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a(r0)     // Catch: java.lang.Throwable -> Le4a
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le4a
            if (r2 != 0) goto L597
            java.lang.String r2 = "03057"
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> Le4a
        L597:
            java.lang.String r0 = "ro.boot.bootreason"
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a(r0)     // Catch: java.lang.Throwable -> Le4a
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le4a
            if (r2 != 0) goto L5a8
            java.lang.String r2 = "03056"
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> Le4a
        L5a8:
            java.lang.String r0 = "ro.runtime.firstboot"
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a(r0)     // Catch: java.lang.Throwable -> Le4a
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le4a
            if (r2 != 0) goto L5b9
            java.lang.String r2 = "03055"
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> Le4a
        L5b9:
            java.lang.String r0 = "init.svc.atcmdserver"
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a(r0)     // Catch: java.lang.Throwable -> Le4a
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le4a
            if (r2 != 0) goto L5ca
            java.lang.String r2 = "03054"
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> Le4a
        L5ca:
            java.lang.String r0 = "ro.build.date.utc"
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a(r0)     // Catch: java.lang.Throwable -> Le4a
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le4a
            if (r2 != 0) goto L5db
            java.lang.String r2 = "03061"
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> Le4a
        L5db:
            java.lang.String r0 = "ro.bootimage.build.date.utc"
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a(r0)     // Catch: java.lang.Throwable -> Le4a
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le4a
            if (r2 != 0) goto L5ec
            java.lang.String r2 = "03062"
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> Le4a
        L5ec:
            java.lang.String r0 = "ro.build.date.YmdHM"
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a(r0)     // Catch: java.lang.Throwable -> Le4a
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le4a
            if (r2 != 0) goto L5fd
            java.lang.String r2 = "03063"
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> Le4a
        L5fd:
            java.lang.String r0 = "dhcp.ipv6.wlan0.dns1"
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a(r0)     // Catch: java.lang.Throwable -> Le4a
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le4a
            if (r2 != 0) goto L60e
            java.lang.String r2 = "03067"
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> Le4a
        L60e:
            java.lang.String r0 = "dhcp.ipv6.wlan0.dns2"
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a(r0)     // Catch: java.lang.Throwable -> Le4a
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le4a
            if (r2 != 0) goto L61f
            java.lang.String r2 = "03068"
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> Le4a
        L61f:
            java.lang.String r0 = "dhcp.wlan0.dns1"
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a(r0)     // Catch: java.lang.Throwable -> Le4a
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le4a
            if (r2 != 0) goto L630
            java.lang.String r2 = "03069"
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> Le4a
        L630:
            java.lang.String r0 = "dhcp.wlan0.dns2"
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a(r0)     // Catch: java.lang.Throwable -> Le4a
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le4a
            if (r2 != 0) goto L641
            java.lang.String r2 = "03070"
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> Le4a
        L641:
            java.lang.String r0 = "net.change"
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a(r0)     // Catch: java.lang.Throwable -> Le4a
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le4a
            if (r2 != 0) goto L652
            java.lang.String r2 = "03071"
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> Le4a
        L652:
            java.lang.String r0 = "net.dns1"
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a(r0)     // Catch: java.lang.Throwable -> Le4a
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le4a
            if (r2 != 0) goto L663
            java.lang.String r2 = "03072"
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> Le4a
        L663:
            java.lang.String r0 = "net.dns2"
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.a(r0)     // Catch: java.lang.Throwable -> Le4a
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le4a
            if (r2 != 0) goto L674
            java.lang.String r2 = "03073"
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> Le4a
        L674:
            java.lang.String r0 = "plc001_t_d"
            r6 = -1
            r2 = r22
            long r6 = r2.a(r0, r6)     // Catch: java.lang.Throwable -> Le4a
            r8 = -1
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L68e
            java.lang.String r0 = "03074"
            long r8 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Le4a
            long r6 = r6 + r8
            r3.put(r0, r6)     // Catch: java.lang.Throwable -> Le4a
        L68e:
            android.content.Context r0 = r1.a     // Catch: java.lang.Throwable -> L6b0
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L6b0
            java.lang.String r4 = "screen_brightness_mode"
            int r0 = android.provider.Settings.System.getInt(r0, r4)     // Catch: java.lang.Throwable -> L6b0
            java.lang.String r4 = "03064"
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> L6b0
            android.content.Context r0 = r1.a     // Catch: java.lang.Throwable -> L6b0
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L6b0
            java.lang.String r4 = "accelerometer_rotation"
            int r0 = android.provider.Settings.System.getInt(r0, r4)     // Catch: java.lang.Throwable -> L6b0
            java.lang.String r4 = "03065"
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> L6b0
        L6b0:
            java.lang.String r0 = "03081"
            java.lang.String r4 = com.kuaishou.weapon.p0.bl.L()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "03052"
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            int r4 = com.kuaishou.weapon.p0.bl.i(r4)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "03050"
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            int r4 = com.kuaishou.weapon.p0.bl.h(r4)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "03049"
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            int r4 = com.kuaishou.weapon.p0.bl.g(r4)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02027"
            long r6 = com.kuaishou.weapon.p0.bl.H()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r6)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02028"
            java.lang.String r4 = com.kuaishou.weapon.p0.bl.D()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02029"
            java.lang.String r4 = com.kuaishou.weapon.p0.bl.E()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02057"
            java.lang.String r4 = com.kuaishou.weapon.p0.bl.F()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02058"
            java.lang.String r4 = com.kuaishou.weapon.p0.bl.G()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            goto L713
        L708:
            r16 = r1
            r2 = r4
            r20 = r5
            r19 = r6
            r21 = r10
            r5 = r11
            r1 = r0
        L713:
            java.lang.String r0 = "plc001_b_bcl_r"
            r4 = 1
            int r0 = r2.b(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            if (r0 != r4) goto L8b5
            java.lang.String r0 = "03001"
            long r6 = com.kuaishou.weapon.p0.bo.a()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r6)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "03002"
            long r6 = com.kuaishou.weapon.p0.bo.b()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r6)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "03001"
            long r6 = com.kuaishou.weapon.p0.bo.a()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r6)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "03043"
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r6)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "03044"
            long r6 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r6)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "03045"
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Le4a
            long r8 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Le4a
            long r6 = r6 - r8
            r3.put(r0, r6)     // Catch: java.lang.Throwable -> Le4a
            com.kuaishou.weapon.p0.by r0 = new com.kuaishou.weapon.p0.by     // Catch: java.lang.Throwable -> Le4a
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Le4a
            boolean r4 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess     // Catch: java.lang.Throwable -> Le4a
            if (r4 == 0) goto L80a
            java.lang.String r4 = "03004"
            java.lang.String r6 = "03004"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            if (r6 == 0) goto L773
            java.lang.String r6 = "03004"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            goto L774
        L773:
            r6 = r5
        L774:
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = "03036"
            java.lang.String r6 = "03036"
            org.json.JSONArray r6 = r0.b(r6)     // Catch: java.lang.Throwable -> Le4a
            if (r6 == 0) goto L788
            java.lang.String r6 = "03036"
            org.json.JSONArray r6 = r0.b(r6)     // Catch: java.lang.Throwable -> Le4a
            goto L789
        L788:
            r6 = r5
        L789:
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = "03039"
            java.lang.String r6 = "03039"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            if (r6 == 0) goto L79d
            java.lang.String r6 = "03039"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            goto L79e
        L79d:
            r6 = r5
        L79e:
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = "03040"
            java.lang.String r6 = "03040"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            if (r6 == 0) goto L7b2
            java.lang.String r6 = "03040"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            goto L7b3
        L7b2:
            r6 = r5
        L7b3:
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = "03041"
            java.lang.String r6 = "03041"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            if (r6 == 0) goto L7c7
            java.lang.String r6 = "03041"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            goto L7c8
        L7c7:
            r6 = r5
        L7c8:
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = "03042"
            java.lang.String r6 = "03042"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            if (r6 == 0) goto L7dc
            java.lang.String r6 = "03042"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            goto L7dd
        L7dc:
            r6 = r5
        L7dd:
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = "03079"
            java.lang.String r6 = "03079"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            if (r6 == 0) goto L7f1
            java.lang.String r6 = "03079"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            goto L7f2
        L7f1:
            r6 = 0
        L7f2:
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = "03080"
            java.lang.String r6 = "03080"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            if (r6 == 0) goto L806
            java.lang.String r6 = "03080"
            java.lang.String r0 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            goto L807
        L806:
            r0 = 0
        L807:
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> Le4a
        L80a:
            java.lang.String r0 = "03007"
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = com.kuaishou.weapon.p0.bv.a(r4)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "03008"
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            int r4 = com.kuaishou.weapon.p0.bv.c(r4)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "03011"
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = com.kuaishou.weapon.p0.am.b(r4)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "03012"
            java.lang.String r4 = com.kuaishou.weapon.p0.am.b()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "03014"
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            boolean r4 = com.kuaishou.weapon.p0.bh.g(r4)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "03034"
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            boolean r4 = com.kuaishou.weapon.p0.bh.h(r4)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "03020"
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = com.kuaishou.weapon.p0.bv.b(r4)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "03037"
            java.lang.String r4 = com.kuaishou.weapon.p0.bl.I()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "03038"
            java.lang.String r4 = com.kuaishou.weapon.p0.bl.J()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "03077"
            java.lang.String r4 = com.kuaishou.weapon.p0.bl.K()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            com.kuaishou.weapon.p0.bg r0 = new com.kuaishou.weapon.p0.bg     // Catch: java.lang.Exception -> L8b5 java.lang.Throwable -> Le4a
            r0.<init>()     // Catch: java.lang.Exception -> L8b5 java.lang.Throwable -> Le4a
            android.content.Context r4 = r1.a     // Catch: java.lang.Exception -> L8b5 java.lang.Throwable -> Le4a
            java.lang.String r4 = r0.a(r4)     // Catch: java.lang.Exception -> L8b5 java.lang.Throwable -> Le4a
            java.lang.String r6 = "03006"
            r3.put(r6, r4)     // Catch: java.lang.Exception -> L8b5 java.lang.Throwable -> Le4a
            java.lang.String r4 = "03010"
            android.content.Context r6 = r1.a     // Catch: java.lang.Exception -> L8b5 java.lang.Throwable -> Le4a
            boolean r6 = r0.b(r6)     // Catch: java.lang.Exception -> L8b5 java.lang.Throwable -> Le4a
            r3.put(r4, r6)     // Catch: java.lang.Exception -> L8b5 java.lang.Throwable -> Le4a
            java.lang.String r4 = "03033"
            android.content.Context r6 = r1.a     // Catch: java.lang.Exception -> L8b5 java.lang.Throwable -> Le4a
            boolean r6 = r0.c(r6)     // Catch: java.lang.Exception -> L8b5 java.lang.Throwable -> Le4a
            r3.put(r4, r6)     // Catch: java.lang.Exception -> L8b5 java.lang.Throwable -> Le4a
            java.lang.String r4 = "03021"
            android.content.Context r6 = r1.a     // Catch: java.lang.Exception -> L8b5 java.lang.Throwable -> Le4a
            boolean r6 = r0.e(r6)     // Catch: java.lang.Exception -> L8b5 java.lang.Throwable -> Le4a
            r3.put(r4, r6)     // Catch: java.lang.Exception -> L8b5 java.lang.Throwable -> Le4a
            java.lang.String r4 = "03030"
            android.content.Context r6 = r1.a     // Catch: java.lang.Exception -> L8b5 java.lang.Throwable -> Le4a
            int r6 = com.kuaishou.weapon.p0.bg.d(r6)     // Catch: java.lang.Exception -> L8b5 java.lang.Throwable -> Le4a
            r3.put(r4, r6)     // Catch: java.lang.Exception -> L8b5 java.lang.Throwable -> Le4a
            java.lang.String r4 = "10031"
            int r0 = r0.a()     // Catch: java.lang.Exception -> L8b5 java.lang.Throwable -> Le4a
            r3.put(r4, r0)     // Catch: java.lang.Exception -> L8b5 java.lang.Throwable -> Le4a
        L8b5:
            java.lang.String r0 = "plc001_b_bcl_tc"
            r4 = 0
            int r0 = r2.b(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            r4 = 1
            if (r0 != r4) goto L8e6
            java.lang.String r0 = "03019"
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = com.kuaishou.weapon.p0.bh.k(r4)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            android.content.Context r0 = r1.a     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.m(r0)     // Catch: java.lang.Throwable -> Le4a
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le4a
            if (r4 != 0) goto L8db
            java.lang.String r4 = "03047"
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> Le4a
        L8db:
            java.lang.String r0 = "03018"
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = com.kuaishou.weapon.p0.bh.i(r4)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
        L8e6:
            java.lang.String r0 = "plc001_b_bcl_il"
            r4 = 1
            int r0 = r2.b(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            if (r0 != r4) goto L93d
            java.lang.String r0 = "02059"
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            int r4 = com.kuaishou.weapon.p0.bm.a(r4)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02060"
            org.json.JSONObject r4 = com.kuaishou.weapon.p0.bm.a()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "02062"
            java.lang.String r4 = com.kuaishou.weapon.p0.bm.c()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            boolean r0 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess     // Catch: java.lang.Throwable -> Le4a
            if (r0 == 0) goto L92c
            com.kuaishou.weapon.p0.ca r0 = new com.kuaishou.weapon.p0.ca     // Catch: java.lang.Throwable -> Le4a
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = "08001"
            java.lang.String r6 = "08001"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            if (r6 == 0) goto L928
            java.lang.String r6 = "08001"
            java.lang.String r0 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            goto L929
        L928:
            r0 = r5
        L929:
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> Le4a
        L92c:
            org.json.JSONObject r0 = com.kuaishou.weapon.p0.bm.d()     // Catch: java.lang.Throwable -> Le4a
            if (r0 == 0) goto L93d
            int r4 = r0.length()     // Catch: java.lang.Throwable -> Le4a
            if (r4 <= 0) goto L93d
            java.lang.String r4 = "10050"
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> Le4a
        L93d:
            java.lang.String r0 = "plc001_b_bcl_rp"
            r4 = 1
            int r0 = r2.b(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            if (r0 != r4) goto L955
            if (r20 != 0) goto L94a
            if (r19 == 0) goto L955
        L94a:
            java.lang.String r0 = "03029"
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = com.kuaishou.weapon.p0.bh.j(r4)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
        L955:
            java.lang.String r0 = "plc001_b_bcl_c"
            r4 = 1
            int r0 = r2.b(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            if (r0 != r4) goto L9e6
            boolean r0 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess     // Catch: java.lang.Throwable -> Le4a
            if (r0 == 0) goto L9be
            com.kuaishou.weapon.p0.bz r0 = new com.kuaishou.weapon.p0.bz     // Catch: java.lang.Throwable -> Le4a
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = "04001"
            java.lang.String r6 = "04001"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            if (r6 == 0) goto L97a
            java.lang.String r6 = "04001"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            goto L97b
        L97a:
            r6 = r5
        L97b:
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = "04002"
            java.lang.String r6 = "04002"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            if (r6 == 0) goto L98f
            java.lang.String r6 = "04002"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            goto L990
        L98f:
            r6 = r5
        L990:
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = "04003"
            java.lang.String r6 = "04003"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            if (r6 == 0) goto L9a4
            java.lang.String r6 = "04003"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            goto L9a5
        L9a4:
            r6 = r5
        L9a5:
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = "04004"
            java.lang.String r6 = "04004"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            if (r6 == 0) goto L9b9
            java.lang.String r6 = "04004"
            java.lang.String r0 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            goto L9ba
        L9b9:
            r0 = r5
        L9ba:
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> Le4a
            goto L9e6
        L9be:
            com.kuaishou.weapon.p0.bj r0 = com.kuaishou.weapon.p0.bk.b()     // Catch: java.lang.Exception -> L9e6 java.lang.Throwable -> Le4a
            java.lang.String r4 = "04001"
            java.lang.String r6 = com.kuaishou.weapon.p0.bk.a()     // Catch: java.lang.Exception -> L9e6 java.lang.Throwable -> Le4a
            r3.put(r4, r6)     // Catch: java.lang.Exception -> L9e6 java.lang.Throwable -> Le4a
            java.lang.String r4 = "04002"
            java.lang.String r6 = r0.b()     // Catch: java.lang.Exception -> L9e6 java.lang.Throwable -> Le4a
            r3.put(r4, r6)     // Catch: java.lang.Exception -> L9e6 java.lang.Throwable -> Le4a
            java.lang.String r4 = "04003"
            java.lang.String r6 = r0.c()     // Catch: java.lang.Exception -> L9e6 java.lang.Throwable -> Le4a
            r3.put(r4, r6)     // Catch: java.lang.Exception -> L9e6 java.lang.Throwable -> Le4a
            java.lang.String r4 = "04004"
            int r0 = r0.a()     // Catch: java.lang.Exception -> L9e6 java.lang.Throwable -> Le4a
            r3.put(r4, r0)     // Catch: java.lang.Exception -> L9e6 java.lang.Throwable -> Le4a
        L9e6:
            java.lang.String r0 = "plc001_b_bcl_w"
            r4 = 0
            int r0 = r2.b(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            r4 = 1
            if (r0 != r4) goto La1f
            if (r20 != 0) goto L9f4
            if (r19 == 0) goto La1f
        L9f4:
            org.json.JSONArray r0 = com.kuaishou.weapon.p0.bh.f()     // Catch: java.lang.Throwable -> Le4a
            if (r0 == 0) goto L9ff
            java.lang.String r4 = "06014"
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> Le4a
        L9ff:
            boolean r0 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess     // Catch: java.lang.Throwable -> Le4a
            if (r0 == 0) goto La1f
            com.kuaishou.weapon.p0.cf r0 = new com.kuaishou.weapon.p0.cf     // Catch: java.lang.Throwable -> Le4a
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = "06015"
            java.lang.String r6 = "06015"
            org.json.JSONArray r6 = r0.b(r6)     // Catch: java.lang.Throwable -> Le4a
            if (r6 == 0) goto La1b
            java.lang.String r6 = "06015"
            org.json.JSONArray r0 = r0.b(r6)     // Catch: java.lang.Throwable -> Le4a
            goto La1c
        La1b:
            r0 = r5
        La1c:
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> Le4a
        La1f:
            if (r20 != 0) goto La23
            if (r19 == 0) goto La48
        La23:
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.h()     // Catch: java.lang.Throwable -> Le4a
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le4a
            if (r4 != 0) goto La3b
            r4 = r21
            boolean r4 = r0.startsWith(r4)     // Catch: java.lang.Throwable -> Le4a
            if (r4 != 0) goto La3b
            java.lang.String r4 = "07005"
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> Le4a
            goto La48
        La3b:
            if (r0 != 0) goto La43
            java.lang.String r0 = "07005"
            r3.put(r0, r5)     // Catch: java.lang.Throwable -> Le4a
            goto La48
        La43:
            java.lang.String r4 = "07005"
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> Le4a
        La48:
            java.lang.String r0 = "plc001_b_bcl_n"
            r4 = 0
            int r0 = r2.b(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            r4 = 1
            if (r0 != r4) goto La7f
            if (r20 != 0) goto La56
            if (r19 == 0) goto La7f
        La56:
            boolean r0 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess     // Catch: java.lang.Throwable -> Le4a
            if (r0 == 0) goto La6c
            com.kuaishou.weapon.p0.cc r0 = new com.kuaishou.weapon.p0.cc     // Catch: java.lang.Throwable -> Le4a
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = "07007"
            java.lang.String r6 = "07007"
            java.lang.String r0 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> Le4a
        La6c:
            android.content.Context r0 = r1.a     // Catch: java.lang.Throwable -> Le4a
            org.json.JSONArray r0 = com.kuaishou.weapon.p0.br.a(r0)     // Catch: java.lang.Throwable -> Le4a
            if (r0 == 0) goto La7f
            int r4 = r0.length()     // Catch: java.lang.Throwable -> Le4a
            if (r4 <= 0) goto La7f
            java.lang.String r4 = "03035"
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> Le4a
        La7f:
            if (r20 != 0) goto La83
            if (r19 == 0) goto Lac2
        La83:
            double r6 = com.kuaishou.weapon.p0.bh.b()     // Catch: java.lang.Exception -> Lac2 java.lang.Throwable -> Le4a
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto La9e
            java.lang.String r0 = "09002"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lac2 java.lang.Throwable -> Le4a
            r4.<init>()     // Catch: java.lang.Exception -> Lac2 java.lang.Throwable -> Le4a
            r4.append(r6)     // Catch: java.lang.Exception -> Lac2 java.lang.Throwable -> Le4a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lac2 java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Exception -> Lac2 java.lang.Throwable -> Le4a
        La9e:
            double r6 = com.kuaishou.weapon.p0.bh.c()     // Catch: java.lang.Exception -> Lac2 java.lang.Throwable -> Le4a
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto Lab9
            java.lang.String r0 = "09003"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lac2 java.lang.Throwable -> Le4a
            r4.<init>()     // Catch: java.lang.Exception -> Lac2 java.lang.Throwable -> Le4a
            r4.append(r6)     // Catch: java.lang.Exception -> Lac2 java.lang.Throwable -> Le4a
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lac2 java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Exception -> Lac2 java.lang.Throwable -> Le4a
        Lab9:
            java.lang.String r0 = "09001"
            java.lang.String r4 = com.kuaishou.weapon.p0.bh.d()     // Catch: java.lang.Exception -> Lac2 java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Exception -> Lac2 java.lang.Throwable -> Le4a
        Lac2:
            java.lang.String r0 = "plc001_b_bcl_a"
            r4 = 0
            int r0 = r2.b(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            r4 = 1
            if (r0 != r4) goto Lae1
            if (r20 != 0) goto Lad0
            if (r19 == 0) goto Lae1
        Lad0:
            com.kuaishou.weapon.p0.w r0 = new com.kuaishou.weapon.p0.w     // Catch: java.lang.Throwable -> Le4a
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = "10002"
            r6 = 1
            org.json.JSONArray r0 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> Le4a
        Lae1:
            java.lang.String r0 = "plc001_b_bcl_s"
            r4 = 1
            int r0 = r2.b(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            if (r0 != r4) goto Lb13
            boolean r0 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess     // Catch: java.lang.Throwable -> Le4a
            if (r0 == 0) goto Lb13
            com.kuaishou.weapon.p0.cd r0 = new com.kuaishou.weapon.p0.cd     // Catch: java.lang.Throwable -> Le4a
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = "05001"
            java.lang.String r0 = r0.a(r4)     // Catch: java.lang.Throwable -> Le4a
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Lb13 java.lang.Throwable -> Le4a
            if (r4 != 0) goto Lb13
            int r4 = r0.length()     // Catch: java.lang.Exception -> Lb13 java.lang.Throwable -> Le4a
            r6 = 10
            if (r4 <= r6) goto Lb13
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Exception -> Lb13 java.lang.Throwable -> Le4a
            r4.<init>(r0)     // Catch: java.lang.Exception -> Lb13 java.lang.Throwable -> Le4a
            java.lang.String r0 = "05001"
            r3.put(r0, r4)     // Catch: java.lang.Exception -> Lb13 java.lang.Throwable -> Le4a
        Lb13:
            boolean r0 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess     // Catch: java.lang.Throwable -> Le4a
            if (r0 == 0) goto Lb33
            com.kuaishou.weapon.p0.cb r0 = new com.kuaishou.weapon.p0.cb     // Catch: java.lang.Throwable -> Le4a
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            r0.<init>(r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = "13001"
            java.lang.String r6 = "13001"
            java.lang.String r6 = r0.a(r6)     // Catch: java.lang.Throwable -> Le4a
            if (r6 == 0) goto Lb2f
            java.lang.String r5 = "13001"
            java.lang.String r11 = r0.a(r5)     // Catch: java.lang.Throwable -> Le4a
            goto Lb30
        Lb2f:
            r11 = r5
        Lb30:
            r3.put(r4, r11)     // Catch: java.lang.Throwable -> Le4a
        Lb33:
            java.lang.String r0 = "11000"
            boolean r4 = com.kuaishou.weapon.p0.jni.Engine.loadSuccess     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "11002"
            java.lang.String r4 = com.kuaishou.weapon.p0.jni.Engine.soVersion     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "11003"
            int r4 = com.kuaishou.weapon.p0.bi.v     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "11004"
            int r4 = com.kuaishou.weapon.p0.jni.Engine.loadSoCount     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "11006"
            r4 = r20
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "11029"
            r4 = r19
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "plc001_v"
            java.lang.String r4 = "0.0.0"
            java.lang.String r0 = r2.b(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = "11008"
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "11009"
            android.content.Context r4 = r1.a     // Catch: java.lang.Throwable -> Le4a
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> Le4a
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r4 = com.kuaishou.weapon.p0.bs.a(r4)     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            android.content.Context r0 = r1.a     // Catch: java.lang.Throwable -> Ld74 java.lang.Throwable -> Le4a
            java.lang.String r0 = com.kuaishou.weapon.p0.bh.w(r0)     // Catch: java.lang.Throwable -> Ld74 java.lang.Throwable -> Le4a
            boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Ld74 java.lang.Throwable -> Le4a
            if (r4 != 0) goto Lb8e
            java.lang.String r4 = "01026"
            r3.put(r4, r0)     // Catch: java.lang.Throwable -> Ld74 java.lang.Throwable -> Le4a
        Lb8e:
            java.lang.String r0 = "plc001_b_bcl_u"
            r4 = 1
            int r0 = r2.b(r0, r4)     // Catch: java.lang.Throwable -> Ld74 java.lang.Throwable -> Le4a
            if (r0 != r4) goto Ld74
            com.kwad.sdk.e.b r0 = com.kwad.sdk.e.b.Mo()
            java.lang.String r0 = r0.Md()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto Lbaa
            java.lang.String r2 = "11102"
            r3.put(r2, r0)
        Lbaa:
            java.lang.String r0 = "11104"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.Mk()
            r3.put(r0, r2)
            java.lang.String r0 = "11105"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.getDeviceId()
            r3.put(r0, r2)
            java.lang.String r0 = "11106"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.getIccId()
            r3.put(r0, r2)
            java.lang.String r0 = "11107"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.Mc()
            r3.put(r0, r2)
            java.lang.String r0 = "11108"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.Mf()
            r3.put(r0, r2)
            java.lang.String r0 = "11109"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.Mg()
            r3.put(r0, r2)
            java.lang.String r0 = "11110"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.Mh()
            r3.put(r0, r2)
            java.lang.String r0 = "11111"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.getIp()
            r3.put(r0, r2)
            java.lang.String r0 = "11112"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.getLocation()
            r3.put(r0, r2)
            java.lang.String r0 = "11113"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.getOaid()
            r3.put(r0, r2)
            java.lang.String r0 = "11114"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.Me()
            r3.put(r0, r2)
            java.lang.String r0 = "11115"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.Mj()
            r3.put(r0, r2)
            java.lang.String r0 = "11116"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.Mi()
            r3.put(r0, r2)
            java.lang.String r0 = "11202"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.Md()
            int r2 = com.kuaishou.weapon.p0.bh.b(r2)
            r3.put(r0, r2)
            java.lang.String r0 = "11204"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.Mk()
            int r2 = com.kuaishou.weapon.p0.bh.b(r2)
            r3.put(r0, r2)
            java.lang.String r0 = "11205"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.getDeviceId()
            int r2 = com.kuaishou.weapon.p0.bh.b(r2)
            r3.put(r0, r2)
            java.lang.String r0 = "11206"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.getIccId()
            int r2 = com.kuaishou.weapon.p0.bh.b(r2)
            r3.put(r0, r2)
            java.lang.String r0 = "11207"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.Mc()
            int r2 = com.kuaishou.weapon.p0.bh.b(r2)
            r3.put(r0, r2)
            java.lang.String r0 = "11208"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.Mf()
            int r2 = com.kuaishou.weapon.p0.bh.b(r2)
            r3.put(r0, r2)
            java.lang.String r0 = "11209"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.Mg()
            int r2 = com.kuaishou.weapon.p0.bh.b(r2)
            r3.put(r0, r2)
            java.lang.String r0 = "11210"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.Mh()
            int r2 = com.kuaishou.weapon.p0.bh.b(r2)
            r3.put(r0, r2)
            java.lang.String r0 = "11211"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.getIp()
            int r2 = com.kuaishou.weapon.p0.bh.b(r2)
            r3.put(r0, r2)
            java.lang.String r0 = "11212"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.getLocation()
            int r2 = com.kuaishou.weapon.p0.bh.b(r2)
            r3.put(r0, r2)
            java.lang.String r0 = "11213"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.getOaid()
            int r2 = com.kuaishou.weapon.p0.bh.b(r2)
            r3.put(r0, r2)
            java.lang.String r0 = "11214"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.Me()
            int r2 = com.kuaishou.weapon.p0.bh.b(r2)
            r3.put(r0, r2)
            java.lang.String r0 = "11215"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.Mj()
            int r2 = com.kuaishou.weapon.p0.bh.b(r2)
            r3.put(r0, r2)
            java.lang.String r0 = "11216"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.Mi()
            int r2 = com.kuaishou.weapon.p0.bh.b(r2)
            r3.put(r0, r2)
            java.lang.String r0 = "11301"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.Mn()
            java.lang.String r2 = com.kuaishou.weapon.p0.bh.c(r2)
            r3.put(r0, r2)
            java.lang.String r0 = "11302"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.getSdkVersion()
            java.lang.String r2 = com.kuaishou.weapon.p0.bh.c(r2)
            r3.put(r0, r2)
            java.lang.String r0 = "11303"
            com.kwad.sdk.e.b r2 = com.kwad.sdk.e.b.Mo()
            java.lang.String r2 = r2.getAppId()
            java.lang.String r2 = com.kuaishou.weapon.p0.bh.c(r2)
            r3.put(r0, r2)
        Ld74:
            java.lang.String r0 = "02078"
            java.lang.String r2 = "W_S_V"
            java.lang.String r2 = com.kuaishou.weapon.p0.jni.A.getE(r2)     // Catch: java.lang.Throwable -> Le31
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le31
            java.lang.String r0 = "02079"
            java.lang.String r2 = "W_S_S_V"
            java.lang.String r2 = com.kuaishou.weapon.p0.jni.A.getE(r2)     // Catch: java.lang.Throwable -> Le31
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le31
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Le31
            r2 = 21
            if (r0 <= r2) goto Lda5
            java.lang.String r0 = "02069"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le31
            r2.<init>()     // Catch: java.lang.Throwable -> Le31
            java.lang.String r4 = l.r.a()     // Catch: java.lang.Throwable -> Le31
            r2.append(r4)     // Catch: java.lang.Throwable -> Le31
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Le31
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le31
        Lda5:
            android.content.Context r0 = r1.a     // Catch: java.lang.Throwable -> Le31
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> Le31
            java.lang.String r2 = "Phenotype_boot_count"
            java.lang.String r0 = android.provider.Settings.Global.getString(r0, r2)     // Catch: java.lang.Throwable -> Le31
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le31
            if (r2 != 0) goto Ldc8
            java.lang.String r2 = "03085"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le31
            r4.<init>()     // Catch: java.lang.Throwable -> Le31
            r4.append(r0)     // Catch: java.lang.Throwable -> Le31
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Le31
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> Le31
        Ldc8:
            android.content.Context r0 = r1.a     // Catch: java.lang.Throwable -> Le31
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> Le31
            java.lang.String r2 = "boot_count"
            java.lang.String r0 = android.provider.Settings.Global.getString(r0, r2)     // Catch: java.lang.Throwable -> Le31
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le31
            if (r2 != 0) goto Ldeb
            java.lang.String r2 = "03086"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le31
            r4.<init>()     // Catch: java.lang.Throwable -> Le31
            r4.append(r0)     // Catch: java.lang.Throwable -> Le31
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Le31
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> Le31
        Ldeb:
            android.content.Context r0 = r1.a     // Catch: java.lang.Throwable -> Le31
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> Le31
            java.lang.String r2 = "power_on_times"
            java.lang.String r0 = android.provider.Settings.System.getString(r0, r2)     // Catch: java.lang.Throwable -> Le31
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le31
            if (r2 != 0) goto Le0e
            java.lang.String r2 = "03091"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le31
            r4.<init>()     // Catch: java.lang.Throwable -> Le31
            r4.append(r0)     // Catch: java.lang.Throwable -> Le31
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Le31
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> Le31
        Le0e:
            android.content.Context r0 = r1.a     // Catch: java.lang.Throwable -> Le31
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> Le31
            java.lang.String r2 = "first_boot_flag"
            java.lang.String r0 = android.provider.Settings.System.getString(r0, r2)     // Catch: java.lang.Throwable -> Le31
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> Le31
            if (r2 != 0) goto Le31
            java.lang.String r2 = "03104"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le31
            r4.<init>()     // Catch: java.lang.Throwable -> Le31
            r4.append(r0)     // Catch: java.lang.Throwable -> Le31
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Le31
            r3.put(r2, r0)     // Catch: java.lang.Throwable -> Le31
        Le31:
            java.lang.String r0 = "11007"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Le4a
            long r4 = r4 - r16
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> Le4a
            java.lang.String r0 = "11017"
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> Le4a
            int r2 = r2.length()     // Catch: java.lang.Throwable -> Le4a
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> Le4a
            return r3
        Le4a:
            r0 = 0
            return r0
    }
}
