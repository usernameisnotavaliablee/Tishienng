package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class au {
    private static com.tencent.bugly.proguard.au a;
    private com.tencent.bugly.proguard.ac b;
    private com.tencent.bugly.proguard.aa c;
    private com.tencent.bugly.proguard.as d;
    private android.content.Context e;



    static {
            return
    }

    private au(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            com.tencent.bugly.proguard.at r0 = com.tencent.bugly.proguard.at.a()
            if (r0 != 0) goto La
            return
        La:
            com.tencent.bugly.proguard.ac r1 = com.tencent.bugly.proguard.ac.a()
            r2.b = r1
            com.tencent.bugly.proguard.aa r1 = com.tencent.bugly.proguard.aa.a(r3)
            r2.c = r1
            com.tencent.bugly.proguard.as r0 = r0.s
            r2.d = r0
            r2.e = r3
            com.tencent.bugly.proguard.ak r3 = com.tencent.bugly.proguard.ak.a()
            com.tencent.bugly.proguard.au$1 r0 = new com.tencent.bugly.proguard.au$1
            r0.<init>(r2)
            r3.a(r0)
            return
    }

    static /* synthetic */ com.tencent.bugly.proguard.au a() {
            com.tencent.bugly.proguard.au r0 = com.tencent.bugly.proguard.au.a
            return r0
    }

    public static com.tencent.bugly.proguard.au a(android.content.Context r1) {
            com.tencent.bugly.proguard.au r0 = com.tencent.bugly.proguard.au.a
            if (r0 != 0) goto Lb
            com.tencent.bugly.proguard.au r0 = new com.tencent.bugly.proguard.au
            r0.<init>(r1)
            com.tencent.bugly.proguard.au.a = r0
        Lb:
            com.tencent.bugly.proguard.au r1 = com.tencent.bugly.proguard.au.a
            return r1
    }

    static /* synthetic */ void a(com.tencent.bugly.proguard.au r3) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "[ExtraCrashManager] Trying to notify Bugly agents."
            com.tencent.bugly.proguard.al.c(r2, r1)
            java.lang.String r1 = "com.tencent.bugly.agent.GameAgent"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "com.tencent.bugly"
            com.tencent.bugly.proguard.aa r3 = r3.c     // Catch: java.lang.Throwable -> L22
            r3.getClass()     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = "sdkPackageName"
            com.tencent.bugly.proguard.ap.a(r1, r3, r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = "[ExtraCrashManager] Bugly game agent has been notified."
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L22
            com.tencent.bugly.proguard.al.c(r3, r1)     // Catch: java.lang.Throwable -> L22
            return
        L22:
            java.lang.String r3 = "[ExtraCrashManager] no game agent"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.bugly.proguard.al.a(r3, r0)
            return
    }

    static /* synthetic */ void a(com.tencent.bugly.proguard.au r17, java.lang.Thread r18, int r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.util.Map r23) {
            r0 = r17
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            java.lang.String r6 = "[ExtraCrashManager] Successfully handled."
            if (r18 != 0) goto L15
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            goto L17
        L15:
            r7 = r18
        L17:
            r8 = 4
            r9 = 1
            r10 = 6
            r11 = 8
            r12 = 5
            r13 = 0
            if (r1 == r8) goto L3a
            if (r1 == r12) goto L37
            if (r1 == r10) goto L37
            if (r1 == r11) goto L34
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r13] = r0
            java.lang.String r0 = "[ExtraCrashManager] Unknown extra crash type: %d"
            com.tencent.bugly.proguard.al.d(r0, r1)
            return
        L34:
            java.lang.String r8 = "H5"
            goto L3c
        L37:
            java.lang.String r8 = "Cocos"
            goto L3c
        L3a:
            java.lang.String r8 = "Unity"
        L3c:
            java.lang.Object[] r14 = new java.lang.Object[r9]
            r14[r13] = r8
            java.lang.String r15 = "[ExtraCrashManager] %s Crash Happen"
            com.tencent.bugly.proguard.al.e(r15, r14)
            com.tencent.bugly.proguard.ac r14 = r0.b     // Catch: java.lang.Throwable -> L55
            boolean r14 = r14.b()     // Catch: java.lang.Throwable -> L55
            if (r14 != 0) goto L58
            java.lang.String r14 = "[ExtraCrashManager] There is no remote strategy, but still store it."
            java.lang.Object[] r15 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.proguard.al.d(r14, r15)     // Catch: java.lang.Throwable -> L55
            goto L58
        L55:
            r0 = move-exception
            goto L248
        L58:
            com.tencent.bugly.proguard.ac r14 = r0.b     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r14 = r14.c()     // Catch: java.lang.Throwable -> L55
            boolean r15 = r14.f     // Catch: java.lang.Throwable -> L55
            java.lang.String r9 = "\n"
            if (r15 != 0) goto Lad
            com.tencent.bugly.proguard.ac r15 = r0.b     // Catch: java.lang.Throwable -> L55
            boolean r15 = r15.b()     // Catch: java.lang.Throwable -> L55
            if (r15 == 0) goto Lad
            java.lang.String r1 = "[ExtraCrashManager] Crash report was closed by remote. Will not upload to Bugly , print local for helpful!"
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.proguard.al.e(r1, r5)     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = com.tencent.bugly.proguard.ap.a()     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.proguard.aa r0 = r0.c     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r0.d     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = r7.getName()     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r7.<init>()     // Catch: java.lang.Throwable -> L55
            r7.append(r2)     // Catch: java.lang.Throwable -> L55
            r7.append(r9)     // Catch: java.lang.Throwable -> L55
            r7.append(r3)     // Catch: java.lang.Throwable -> L55
            r7.append(r9)     // Catch: java.lang.Throwable -> L55
            r7.append(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L55
            r3 = 0
            r19 = r0
            r18 = r1
            r21 = r2
            r22 = r3
            r20 = r5
            r17 = r8
            com.tencent.bugly.proguard.as.a(r17, r18, r19, r20, r21, r22)     // Catch: java.lang.Throwable -> L55
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.tencent.bugly.proguard.al.e(r6, r0)
            return
        Lad:
            java.lang.String r15 = "[ExtraCrashManager] %s report is disabled."
            if (r1 == r12) goto Lc8
            if (r1 == r10) goto Lc8
            if (r1 == r11) goto Lb6
            goto Lda
        Lb6:
            boolean r10 = r14.l     // Catch: java.lang.Throwable -> L55
            if (r10 != 0) goto Lda
            r10 = 1
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L55
            r0[r13] = r8     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.proguard.al.e(r15, r0)     // Catch: java.lang.Throwable -> L55
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.tencent.bugly.proguard.al.e(r6, r0)
            return
        Lc8:
            boolean r10 = r14.k     // Catch: java.lang.Throwable -> L55
            if (r10 != 0) goto Lda
            r10 = 1
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L55
            r0[r13] = r8     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.proguard.al.e(r15, r0)     // Catch: java.lang.Throwable -> L55
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.tencent.bugly.proguard.al.e(r6, r0)
            return
        Lda:
            if (r1 != r11) goto Ldd
            goto Lde
        Ldd:
            r12 = r1
        Lde:
            com.tencent.bugly.crashreport.crash.CrashDetailBean r1 = new com.tencent.bugly.crashreport.crash.CrashDetailBean     // Catch: java.lang.Throwable -> L55
            r1.<init>()     // Catch: java.lang.Throwable -> L55
            long r10 = com.tencent.bugly.proguard.ab.j()     // Catch: java.lang.Throwable -> L55
            r1.C = r10     // Catch: java.lang.Throwable -> L55
            long r10 = com.tencent.bugly.proguard.ab.f()     // Catch: java.lang.Throwable -> L55
            r1.D = r10     // Catch: java.lang.Throwable -> L55
            long r10 = com.tencent.bugly.proguard.ab.l()     // Catch: java.lang.Throwable -> L55
            r1.E = r10     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.proguard.aa r10 = r0.c     // Catch: java.lang.Throwable -> L55
            long r10 = r10.k()     // Catch: java.lang.Throwable -> L55
            r1.F = r10     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.proguard.aa r10 = r0.c     // Catch: java.lang.Throwable -> L55
            long r10 = r10.j()     // Catch: java.lang.Throwable -> L55
            r1.G = r10     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.proguard.aa r10 = r0.c     // Catch: java.lang.Throwable -> L55
            long r10 = r10.l()     // Catch: java.lang.Throwable -> L55
            r1.H = r10     // Catch: java.lang.Throwable -> L55
            android.content.Context r10 = r0.e     // Catch: java.lang.Throwable -> L55
            long r10 = com.tencent.bugly.proguard.ab.b(r10)     // Catch: java.lang.Throwable -> L55
            r1.I = r10     // Catch: java.lang.Throwable -> L55
            long r10 = com.tencent.bugly.proguard.ab.g()     // Catch: java.lang.Throwable -> L55
            r1.J = r10     // Catch: java.lang.Throwable -> L55
            long r10 = com.tencent.bugly.proguard.ab.h()     // Catch: java.lang.Throwable -> L55
            r1.K = r10     // Catch: java.lang.Throwable -> L55
            r1.b = r12     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.proguard.aa r10 = r0.c     // Catch: java.lang.Throwable -> L55
            java.lang.String r10 = r10.g()     // Catch: java.lang.Throwable -> L55
            r1.e = r10     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.proguard.aa r10 = r0.c     // Catch: java.lang.Throwable -> L55
            java.lang.String r11 = r10.o     // Catch: java.lang.Throwable -> L55
            r1.f = r11     // Catch: java.lang.Throwable -> L55
            java.lang.String r10 = r10.q()     // Catch: java.lang.Throwable -> L55
            r1.g = r10     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.proguard.aa r10 = r0.c     // Catch: java.lang.Throwable -> L55
            java.lang.String r10 = r10.f()     // Catch: java.lang.Throwable -> L55
            r1.m = r10     // Catch: java.lang.Throwable -> L55
            java.lang.String r10 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L55
            r1.n = r10     // Catch: java.lang.Throwable -> L55
            java.lang.String r10 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L55
            r1.o = r10     // Catch: java.lang.Throwable -> L55
            java.lang.String r10 = ""
            if (r4 == 0) goto L15a
            java.lang.String[] r11 = r4.split(r9)     // Catch: java.lang.Throwable -> L55
            int r12 = r11.length     // Catch: java.lang.Throwable -> L55
            if (r12 <= 0) goto L158
            r10 = r11[r13]     // Catch: java.lang.Throwable -> L55
        L158:
            r11 = r4
            goto L15b
        L15a:
            r11 = r10
        L15b:
            r1.p = r10     // Catch: java.lang.Throwable -> L55
            r1.f10q = r11     // Catch: java.lang.Throwable -> L55
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L55
            r1.r = r10     // Catch: java.lang.Throwable -> L55
            java.lang.String r10 = r1.f10q     // Catch: java.lang.Throwable -> L55
            byte[] r10 = r10.getBytes()     // Catch: java.lang.Throwable -> L55
            java.lang.String r10 = com.tencent.bugly.proguard.ap.c(r10)     // Catch: java.lang.Throwable -> L55
            r1.u = r10     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.proguard.aa r10 = r0.c     // Catch: java.lang.Throwable -> L55
            boolean r10 = r10.Q     // Catch: java.lang.Throwable -> L55
            int r11 = com.tencent.bugly.proguard.at.h     // Catch: java.lang.Throwable -> L55
            java.util.Map r10 = com.tencent.bugly.proguard.ap.a(r10, r11)     // Catch: java.lang.Throwable -> L55
            r1.z = r10     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.proguard.aa r10 = r0.c     // Catch: java.lang.Throwable -> L55
            java.lang.String r10 = r10.d     // Catch: java.lang.Throwable -> L55
            r1.A = r10     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r10.<init>()     // Catch: java.lang.Throwable -> L55
            java.lang.String r11 = r7.getName()     // Catch: java.lang.Throwable -> L55
            r10.append(r11)     // Catch: java.lang.Throwable -> L55
            java.lang.String r11 = "("
            r10.append(r11)     // Catch: java.lang.Throwable -> L55
            long r11 = r7.getId()     // Catch: java.lang.Throwable -> L55
            r10.append(r11)     // Catch: java.lang.Throwable -> L55
            java.lang.String r11 = ")"
            r10.append(r11)     // Catch: java.lang.Throwable -> L55
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L55
            r1.B = r10     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.proguard.aa r10 = r0.c     // Catch: java.lang.Throwable -> L55
            java.lang.String r10 = r10.s()     // Catch: java.lang.Throwable -> L55
            r1.L = r10     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.proguard.aa r10 = r0.c     // Catch: java.lang.Throwable -> L55
            java.util.Map r10 = r10.p()     // Catch: java.lang.Throwable -> L55
            r1.h = r10     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.proguard.aa r10 = r0.c     // Catch: java.lang.Throwable -> L55
            long r11 = r10.a     // Catch: java.lang.Throwable -> L55
            r1.Q = r11     // Catch: java.lang.Throwable -> L55
            boolean r10 = r10.a()     // Catch: java.lang.Throwable -> L55
            r1.R = r10     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.proguard.aa r10 = r0.c     // Catch: java.lang.Throwable -> L55
            int r10 = r10.z()     // Catch: java.lang.Throwable -> L55
            r1.U = r10     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.proguard.aa r10 = r0.c     // Catch: java.lang.Throwable -> L55
            int r11 = r10.x     // Catch: java.lang.Throwable -> L55
            r1.V = r11     // Catch: java.lang.Throwable -> L55
            java.util.Map r10 = r10.t()     // Catch: java.lang.Throwable -> L55
            r1.W = r10     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.proguard.aa r10 = r0.c     // Catch: java.lang.Throwable -> L55
            java.util.Map r10 = r10.y()     // Catch: java.lang.Throwable -> L55
            r1.X = r10     // Catch: java.lang.Throwable -> L55
            byte[] r10 = com.tencent.bugly.proguard.ao.a()     // Catch: java.lang.Throwable -> L55
            r1.y = r10     // Catch: java.lang.Throwable -> L55
            java.util.Map<java.lang.String, java.lang.String> r10 = r1.S     // Catch: java.lang.Throwable -> L55
            if (r10 != 0) goto L1ef
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L55
            r10.<init>()     // Catch: java.lang.Throwable -> L55
            r1.S = r10     // Catch: java.lang.Throwable -> L55
        L1ef:
            if (r5 == 0) goto L1f6
            java.util.Map<java.lang.String, java.lang.String> r10 = r1.S     // Catch: java.lang.Throwable -> L55
            r10.putAll(r5)     // Catch: java.lang.Throwable -> L55
        L1f6:
            java.lang.String r5 = com.tencent.bugly.proguard.ap.a()     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.proguard.aa r10 = r0.c     // Catch: java.lang.Throwable -> L55
            java.lang.String r10 = r10.d     // Catch: java.lang.Throwable -> L55
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L55
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L55
            r11.<init>()     // Catch: java.lang.Throwable -> L55
            r11.append(r2)     // Catch: java.lang.Throwable -> L55
            r11.append(r9)     // Catch: java.lang.Throwable -> L55
            r11.append(r3)     // Catch: java.lang.Throwable -> L55
            r11.append(r9)     // Catch: java.lang.Throwable -> L55
            r11.append(r4)     // Catch: java.lang.Throwable -> L55
            java.lang.String r2 = r11.toString()     // Catch: java.lang.Throwable -> L55
            r23 = r1
            r22 = r2
            r19 = r5
            r21 = r7
            r18 = r8
            r20 = r10
            com.tencent.bugly.proguard.as.a(r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L55
            r1 = r23
            com.tencent.bugly.proguard.as r2 = r0.d     // Catch: java.lang.Throwable -> L55
            com.tencent.bugly.proguard.at r3 = com.tencent.bugly.proguard.at.a()     // Catch: java.lang.Throwable -> L55
            boolean r3 = r3.C     // Catch: java.lang.Throwable -> L55
            r16 = 1
            r3 = r3 ^ 1
            boolean r2 = r2.a(r1, r3)     // Catch: java.lang.Throwable -> L55
            if (r2 != 0) goto L242
            com.tencent.bugly.proguard.as r0 = r0.d     // Catch: java.lang.Throwable -> L55
            r0.b(r1, r13)     // Catch: java.lang.Throwable -> L55
        L242:
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.tencent.bugly.proguard.al.e(r6, r0)
            return
        L248:
            com.tencent.bugly.proguard.al.a(r0)     // Catch: java.lang.Throwable -> L251
            java.lang.Object[] r0 = new java.lang.Object[r13]
            com.tencent.bugly.proguard.al.e(r6, r0)
            return
        L251:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r13]
            com.tencent.bugly.proguard.al.e(r6, r1)
            throw r0
    }

    public static void a(java.lang.Thread r8, int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13) {
            com.tencent.bugly.proguard.ak r0 = com.tencent.bugly.proguard.ak.a()
            com.tencent.bugly.proguard.au$2 r1 = new com.tencent.bugly.proguard.au$2
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.a(r1)
            return
    }
}
