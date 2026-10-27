package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class ae {
    public ae() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.tencent.bugly.proguard.bq a(android.content.Context r5, int r6, byte[] r7) {
            com.tencent.bugly.proguard.aa r0 = com.tencent.bugly.proguard.aa.b()
            com.tencent.bugly.proguard.ac r1 = com.tencent.bugly.proguard.ac.a()
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r1 = r1.c()
            r2 = 0
            if (r0 == 0) goto L1a1
            if (r1 != 0) goto L13
            goto L1a1
        L13:
            com.tencent.bugly.proguard.bq r3 = new com.tencent.bugly.proguard.bq     // Catch: java.lang.Throwable -> L198
            r3.<init>()     // Catch: java.lang.Throwable -> L198
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L198
            byte r4 = r0.b     // Catch: java.lang.Throwable -> L3e
            r3.a = r4     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = r0.e()     // Catch: java.lang.Throwable -> L3e
            r3.b = r4     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = r0.c     // Catch: java.lang.Throwable -> L3e
            r3.c = r4     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = r0.o     // Catch: java.lang.Throwable -> L3e
            r3.d = r4     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = r0.s     // Catch: java.lang.Throwable -> L3e
            r3.e = r4     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = r0.h     // Catch: java.lang.Throwable -> L3e
            r3.f = r4     // Catch: java.lang.Throwable -> L3e
            r3.g = r6     // Catch: java.lang.Throwable -> L3e
            if (r7 != 0) goto L41
            java.lang.String r6 = ""
            byte[] r7 = r6.getBytes()     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            r5 = move-exception
            goto L19b
        L41:
            r3.h = r7     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = r0.h()     // Catch: java.lang.Throwable -> L3e
            r3.i = r6     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = r0.k     // Catch: java.lang.Throwable -> L3e
            r3.j = r6     // Catch: java.lang.Throwable -> L3e
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Throwable -> L3e
            r6.<init>()     // Catch: java.lang.Throwable -> L3e
            r3.k = r6     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = r0.d()     // Catch: java.lang.Throwable -> L3e
            r3.l = r6     // Catch: java.lang.Throwable -> L3e
            long r6 = r1.o     // Catch: java.lang.Throwable -> L3e
            r3.m = r6     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = r0.g()     // Catch: java.lang.Throwable -> L3e
            r3.o = r6     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = com.tencent.bugly.proguard.ab.c(r5)     // Catch: java.lang.Throwable -> L3e
            r3.p = r5     // Catch: java.lang.Throwable -> L3e
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L3e
            r3.f16q = r5     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = r0.i()     // Catch: java.lang.Throwable -> L3e
            r3.s = r5     // Catch: java.lang.Throwable -> L3e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r5.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = r0.g()     // Catch: java.lang.Throwable -> L3e
            r5.append(r6)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3e
            r3.v = r5     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = r3.p     // Catch: java.lang.Throwable -> L3e
            r3.w = r5     // Catch: java.lang.Throwable -> L3e
            java.lang.String r5 = "com.tencent.bugly"
            r3.n = r5     // Catch: java.lang.Throwable -> L3e
            java.util.Map<java.lang.String, java.lang.String> r5 = r3.k     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = "A26"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r7.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = r0.s()     // Catch: java.lang.Throwable -> L3e
            r7.append(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L3e
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L3e
            java.util.Map<java.lang.String, java.lang.String> r5 = r3.k     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = "A62"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r7.<init>()     // Catch: java.lang.Throwable -> L3e
            boolean r1 = com.tencent.bugly.proguard.aa.C()     // Catch: java.lang.Throwable -> L3e
            r7.append(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L3e
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L3e
            java.util.Map<java.lang.String, java.lang.String> r5 = r3.k     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = "A63"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r7.<init>()     // Catch: java.lang.Throwable -> L3e
            boolean r1 = com.tencent.bugly.proguard.aa.D()     // Catch: java.lang.Throwable -> L3e
            r7.append(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L3e
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L3e
            java.util.Map<java.lang.String, java.lang.String> r5 = r3.k     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = "F11"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r7.<init>()     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r0.J     // Catch: java.lang.Throwable -> L3e
            r7.append(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L3e
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L3e
            java.util.Map<java.lang.String, java.lang.String> r5 = r3.k     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = "F12"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r7.<init>()     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r0.I     // Catch: java.lang.Throwable -> L3e
            r7.append(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L3e
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L3e
            java.util.Map<java.lang.String, java.lang.String> r5 = r3.k     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = "D3"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e
            r7.<init>()     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = r0.f11q     // Catch: java.lang.Throwable -> L3e
            r7.append(r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L3e
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L3e
            java.util.List<com.tencent.bugly.proguard.o> r5 = com.tencent.bugly.proguard.p.b     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L136
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L3e
        L11c:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r6 == 0) goto L136
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L3e
            com.tencent.bugly.proguard.o r6 = (com.tencent.bugly.proguard.o) r6     // Catch: java.lang.Throwable -> L3e
            java.lang.String r7 = r6.versionKey     // Catch: java.lang.Throwable -> L3e
            if (r7 == 0) goto L11c
            java.lang.String r6 = r6.version     // Catch: java.lang.Throwable -> L3e
            if (r6 == 0) goto L11c
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.k     // Catch: java.lang.Throwable -> L3e
            r1.put(r7, r6)     // Catch: java.lang.Throwable -> L3e
            goto L11c
        L136:
            java.util.Map<java.lang.String, java.lang.String> r5 = r3.k     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = "G15"
            java.lang.String r7 = "G15"
            java.lang.String r1 = ""
            java.lang.String r7 = com.tencent.bugly.proguard.ap.d(r7, r1)     // Catch: java.lang.Throwable -> L3e
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L3e
            java.util.Map<java.lang.String, java.lang.String> r5 = r3.k     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = "G10"
            java.lang.String r7 = "G10"
            java.lang.String r1 = ""
            java.lang.String r7 = com.tencent.bugly.proguard.ap.d(r7, r1)     // Catch: java.lang.Throwable -> L3e
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L3e
            java.util.Map<java.lang.String, java.lang.String> r5 = r3.k     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = "D4"
            java.lang.String r7 = "D4"
            java.lang.String r1 = "0"
            java.lang.String r7 = com.tencent.bugly.proguard.ap.d(r7, r1)     // Catch: java.lang.Throwable -> L3e
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            java.util.Map r5 = r0.x()     // Catch: java.lang.Throwable -> L198
            if (r5 == 0) goto L19a
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Throwable -> L198
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L198
        L172:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L198
            if (r6 == 0) goto L19a
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L198
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch: java.lang.Throwable -> L198
            java.lang.Object r7 = r6.getValue()     // Catch: java.lang.Throwable -> L198
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch: java.lang.Throwable -> L198
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L198
            if (r7 != 0) goto L172
            java.util.Map<java.lang.String, java.lang.String> r7 = r3.k     // Catch: java.lang.Throwable -> L198
            java.lang.Object r0 = r6.getKey()     // Catch: java.lang.Throwable -> L198
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L198
            r7.put(r0, r6)     // Catch: java.lang.Throwable -> L198
            goto L172
        L198:
            r5 = move-exception
            goto L19d
        L19a:
            return r3
        L19b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r5     // Catch: java.lang.Throwable -> L198
        L19d:
            com.tencent.bugly.proguard.al.b(r5)
            return r2
        L1a1:
            java.lang.String r5 = "Can not create request pkg for parameters is invalid."
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            com.tencent.bugly.proguard.al.e(r5, r6)
            return r2
    }

    public static com.tencent.bugly.proguard.br a(byte[] r4) {
            java.lang.Class<com.tencent.bugly.proguard.br> r0 = com.tencent.bugly.proguard.br.class
            r1 = 0
            if (r4 == 0) goto L33
            com.tencent.bugly.proguard.e r2 = new com.tencent.bugly.proguard.e     // Catch: java.lang.Throwable -> L2d
            r2.<init>()     // Catch: java.lang.Throwable -> L2d
            r2.b()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "utf-8"
            r2.a(r3)     // Catch: java.lang.Throwable -> L2d
            r2.a(r4)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = "detail"
            com.tencent.bugly.proguard.br r3 = new com.tencent.bugly.proguard.br     // Catch: java.lang.Throwable -> L2d
            r3.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r4 = r2.b(r4, r3)     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r0.isInstance(r4)     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2f
            java.lang.Object r4 = r0.cast(r4)     // Catch: java.lang.Throwable -> L2d
            com.tencent.bugly.proguard.br r4 = (com.tencent.bugly.proguard.br) r4     // Catch: java.lang.Throwable -> L2d
            return r4
        L2d:
            r4 = move-exception
            goto L30
        L2f:
            return r1
        L30:
            com.tencent.bugly.proguard.al.b(r4)
        L33:
            return r1
    }

    public static com.tencent.bugly.proguard.bu a(com.tencent.bugly.crashreport.biz.UserInfoBean r9) {
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            com.tencent.bugly.proguard.bu r1 = new com.tencent.bugly.proguard.bu
            r1.<init>()
            long r2 = r9.e
            r1.a = r2
            java.lang.String r2 = r9.j
            r1.e = r2
            java.lang.String r2 = r9.c
            r1.d = r2
            java.lang.String r2 = r9.d
            r1.c = r2
            int r2 = r9.o
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L21
            r2 = 1
            goto L22
        L21:
            r2 = 0
        L22:
            r1.h = r2
            int r2 = r9.b
            r5 = 2
            if (r2 == r4) goto L5b
            r6 = 4
            if (r2 == r5) goto L58
            r7 = 3
            if (r2 == r7) goto L55
            if (r2 == r6) goto L52
            r6 = 8
            if (r2 == r6) goto L4f
            r6 = 10
            if (r2 < r6) goto L41
            r6 = 20
            if (r2 >= r6) goto L41
            byte r0 = (byte) r2
            r1.b = r0
            goto L5d
        L41:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r9
            java.lang.String r9 = "unknown uinfo type %d "
            com.tencent.bugly.proguard.al.e(r9, r1)
            return r0
        L4f:
            r1.b = r6
            goto L5d
        L52:
            r1.b = r7
            goto L5d
        L55:
            r1.b = r5
            goto L5d
        L58:
            r1.b = r6
            goto L5d
        L5b:
            r1.b = r4
        L5d:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f = r0
            int r2 = r9.p
            if (r2 < 0) goto L7b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r6 = r9.p
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "C01"
            r0.put(r6, r2)
        L7b:
            int r0 = r9.f8q
            if (r0 < 0) goto L94
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r6 = r9.f8q
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "C02"
            r0.put(r6, r2)
        L94:
            java.util.Map<java.lang.String, java.lang.String> r0 = r9.r
            if (r0 == 0) goto Ld2
            int r0 = r0.size()
            if (r0 <= 0) goto Ld2
            java.util.Map<java.lang.String, java.lang.String> r0 = r9.r
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La8:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Ld2
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Map<java.lang.String, java.lang.String> r6 = r1.f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "C03_"
            r7.<init>(r8)
            java.lang.Object r8 = r2.getKey()
            java.lang.String r8 = (java.lang.String) r8
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.Object r2 = r2.getValue()
            r6.put(r7, r2)
            goto La8
        Ld2:
            java.util.Map<java.lang.String, java.lang.String> r0 = r9.s
            if (r0 == 0) goto L110
            int r0 = r0.size()
            if (r0 <= 0) goto L110
            java.util.Map<java.lang.String, java.lang.String> r0 = r9.s
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Le6:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L110
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.Map<java.lang.String, java.lang.String> r6 = r1.f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "C04_"
            r7.<init>(r8)
            java.lang.Object r8 = r2.getKey()
            java.lang.String r8 = (java.lang.String) r8
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.Object r2 = r2.getValue()
            r6.put(r7, r2)
            goto Le6
        L110:
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            boolean r6 = r9.l
            r6 = r6 ^ r4
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "A36"
            r0.put(r6, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r6 = r9.g
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "F02"
            r0.put(r6, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r6 = r9.h
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "F03"
            r0.put(r6, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = r9.j
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "F04"
            r0.put(r6, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r6 = r9.i
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "F05"
            r0.put(r6, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = r9.m
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = "F06"
            r0.put(r6, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r6 = r9.k
            r2.append(r6)
            java.lang.String r9 = r2.toString()
            java.lang.String r2 = "F10"
            r0.put(r2, r9)
            byte r9 = r1.b
            java.lang.Byte r9 = java.lang.Byte.valueOf(r9)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r3] = r9
            r2[r4] = r0
            java.lang.String r9 = "summary type %d vm:%d"
            com.tencent.bugly.proguard.al.c(r9, r2)
            return r1
    }

    public static <T extends com.tencent.bugly.proguard.m> T a(byte[] r2, java.lang.Class<T> r3) {
            r0 = 0
            if (r2 == 0) goto L1f
            int r1 = r2.length
            if (r1 > 0) goto L7
            goto L1f
        L7:
            java.lang.Object r3 = r3.newInstance()     // Catch: java.lang.Throwable -> L1b
            com.tencent.bugly.proguard.m r3 = (com.tencent.bugly.proguard.m) r3     // Catch: java.lang.Throwable -> L1b
            com.tencent.bugly.proguard.k r1 = new com.tencent.bugly.proguard.k     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r2 = "utf-8"
            r1.a(r2)     // Catch: java.lang.Throwable -> L1b
            r3.a(r1)     // Catch: java.lang.Throwable -> L1b
            return r3
        L1b:
            r2 = move-exception
            com.tencent.bugly.proguard.al.b(r2)
        L1f:
            return r0
    }

    public static byte[] a(com.tencent.bugly.proguard.m r3) {
            com.tencent.bugly.proguard.l r0 = new com.tencent.bugly.proguard.l     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = "utf-8"
            r0.a(r1)     // Catch: java.lang.Throwable -> L26
            r3.a(r0)     // Catch: java.lang.Throwable -> L26
            java.nio.ByteBuffer r3 = r0.a     // Catch: java.lang.Throwable -> L26
            int r3 = r3.position()     // Catch: java.lang.Throwable -> L26
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L26
            java.nio.ByteBuffer r1 = r0.a     // Catch: java.lang.Throwable -> L26
            byte[] r1 = r1.array()     // Catch: java.lang.Throwable -> L26
            java.nio.ByteBuffer r0 = r0.a     // Catch: java.lang.Throwable -> L26
            int r0 = r0.position()     // Catch: java.lang.Throwable -> L26
            r2 = 0
            java.lang.System.arraycopy(r1, r2, r3, r2, r0)     // Catch: java.lang.Throwable -> L26
            return r3
        L26:
            r3 = move-exception
            com.tencent.bugly.proguard.al.b(r3)
            r3 = 0
            return r3
    }

    public static byte[] a(java.lang.Object r2) {
            com.tencent.bugly.proguard.e r0 = new com.tencent.bugly.proguard.e     // Catch: java.lang.Throwable -> L24
            r0.<init>()     // Catch: java.lang.Throwable -> L24
            r0.b()     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "utf-8"
            r0.a(r1)     // Catch: java.lang.Throwable -> L24
            r0.c()     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "RqdServer"
            r0.b(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "sync"
            r0.c(r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "detail"
            r0.a(r1, r2)     // Catch: java.lang.Throwable -> L24
            byte[] r2 = r0.a()     // Catch: java.lang.Throwable -> L24
            return r2
        L24:
            r2 = move-exception
            com.tencent.bugly.proguard.al.b(r2)
            r2 = 0
            return r2
    }
}
