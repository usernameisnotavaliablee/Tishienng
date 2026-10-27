package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class cw implements java.lang.Runnable {
    private android.content.Context a;


    public cw(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private com.kuaishou.weapon.p0.y b(java.lang.String r22) {
            r21 = this;
            java.lang.String r0 = "p"
            java.lang.String r1 = "btm"
            java.lang.String r2 = "ic"
            java.lang.String r3 = "ie"
            java.lang.String r4 = "n"
            java.lang.String r5 = "w"
            java.lang.String r6 = "d"
            java.lang.String r7 = "c"
            java.lang.String r8 = "r"
            java.lang.String r9 = "ac"
            java.lang.String r10 = "a"
            java.lang.String r11 = "mc"
            java.lang.String r12 = "is"
            com.kuaishou.weapon.p0.y r14 = new com.kuaishou.weapon.p0.y     // Catch: java.lang.Exception -> L4de
            r14.<init>()     // Catch: java.lang.Exception -> L4de
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch: java.lang.Exception -> L4de
            r13 = r22
            r16 = 0
            r15.<init>(r13)     // Catch: java.lang.Exception -> L4e0
            java.lang.String r13 = "status"
            r17 = r0
            r0 = 1
            int r13 = r15.optInt(r13, r0)     // Catch: java.lang.Exception -> L4e0
            r14.e(r13)     // Catch: java.lang.Exception -> L4e0
            int r13 = r14.z()     // Catch: java.lang.Exception -> L4e0
            if (r13 == r0) goto L3b
            return r16
        L3b:
            java.lang.String r13 = "bwc"
            r0 = 0
            int r13 = r15.optInt(r13, r0)     // Catch: java.lang.Exception -> L4e0
            r14.f(r13)     // Catch: java.lang.Exception -> L4e0
            java.lang.String r13 = "blpc"
            r0 = 1
            int r13 = r15.optInt(r13, r0)     // Catch: java.lang.Exception -> L4e0
            r14.g(r13)     // Catch: java.lang.Exception -> L4e0
            java.lang.String r0 = "scc"
            r13 = 0
            int r0 = r15.optInt(r0, r13)     // Catch: java.lang.Exception -> L4e0
            r14.h(r0)     // Catch: java.lang.Exception -> L4e0
            java.lang.String r0 = "dpver"
            java.lang.String r0 = r15.optString(r0)     // Catch: java.lang.Exception -> L4e0
            r14.j(r0)     // Catch: java.lang.Exception -> L4e0
            java.lang.String r0 = "bver"
            java.lang.String r0 = r15.optString(r0)     // Catch: java.lang.Exception -> L4e0
            r14.k(r0)     // Catch: java.lang.Exception -> L4e0
            java.lang.String r0 = "dpd"
            r13 = 12
            int r0 = r15.optInt(r0, r13)     // Catch: java.lang.Exception -> L4e0
            r14.d(r0)     // Catch: java.lang.Exception -> L4e0
            java.lang.String r0 = "aar"
            r13 = 30
            int r0 = r15.optInt(r0, r13)     // Catch: java.lang.Exception -> L4e0
            r14.b(r0)     // Catch: java.lang.Exception -> L4e0
            java.lang.String r0 = "dir"
            java.lang.String r0 = r15.optString(r0)     // Catch: java.lang.Exception -> L4e0
            r14.e(r0)     // Catch: java.lang.Exception -> L4e0
            java.lang.String r0 = r15.optString(r12)     // Catch: java.lang.Exception -> L4e0
            r14.f(r0)     // Catch: java.lang.Exception -> L4e0
            java.lang.String r0 = "ii"
            int r0 = r15.optInt(r0)     // Catch: java.lang.Exception -> L4e0
            r14.a(r0)     // Catch: java.lang.Exception -> L4e0
            java.lang.String r0 = "act"
            r13 = 0
            int r0 = r15.optInt(r0, r13)     // Catch: java.lang.Exception -> L4e0
            r14.c(r0)     // Catch: java.lang.Exception -> L4e0
            java.lang.String r0 = "aver"
            java.lang.String r0 = r15.optString(r0)     // Catch: java.lang.Exception -> Lf0
            r14.h(r0)     // Catch: java.lang.Exception -> Lf0
            org.json.JSONObject r0 = r15.getJSONObject(r10)     // Catch: java.lang.Exception -> Lf0
            if (r0 == 0) goto Lf0
            com.kuaishou.weapon.p0.y$a r13 = new com.kuaishou.weapon.p0.y$a     // Catch: java.lang.Exception -> Lf0
            r13.<init>()     // Catch: java.lang.Exception -> Lf0
            r19 = r1
            java.lang.String r1 = "as"
            r20 = r2
            r2 = 0
            int r1 = r0.optInt(r1, r2)     // Catch: java.lang.Exception -> Lf4
            r13.c(r1)     // Catch: java.lang.Exception -> Lf4
            r1 = 3
            int r2 = r0.optInt(r9, r1)     // Catch: java.lang.Exception -> Lf4
            r13.d(r2)     // Catch: java.lang.Exception -> Lf4
            java.lang.String r1 = "ai"
            r2 = 8
            int r1 = r0.optInt(r1, r2)     // Catch: java.lang.Exception -> Lf4
            r13.e(r1)     // Catch: java.lang.Exception -> Lf4
            java.lang.String r1 = "ab"
            r2 = 0
            int r1 = r0.optInt(r1, r2)     // Catch: java.lang.Exception -> Lf4
            r13.b(r1)     // Catch: java.lang.Exception -> Lf4
            java.lang.String r1 = "am"
            int r0 = r0.optInt(r1, r2)     // Catch: java.lang.Exception -> Lf4
            r13.a(r0)     // Catch: java.lang.Exception -> Lf4
            r14.a(r13)     // Catch: java.lang.Exception -> Lf4
            goto Lf4
        Lf0:
            r19 = r1
        Lf2:
            r20 = r2
        Lf4:
            java.lang.String r0 = "acver"
            java.lang.String r0 = r15.optString(r0)     // Catch: java.lang.Exception -> L12a
            r14.b(r0)     // Catch: java.lang.Exception -> L12a
            org.json.JSONObject r0 = r15.getJSONObject(r9)     // Catch: java.lang.Exception -> L12a
            if (r0 == 0) goto L12a
            com.kuaishou.weapon.p0.y$b r1 = new com.kuaishou.weapon.p0.y$b     // Catch: java.lang.Exception -> L12a
            r1.<init>()     // Catch: java.lang.Exception -> L12a
            java.lang.String r2 = "acs"
            r9 = 1
            int r2 = r0.optInt(r2, r9)     // Catch: java.lang.Exception -> L12a
            r1.a(r2)     // Catch: java.lang.Exception -> L12a
            java.lang.String r2 = "acc"
            r9 = 3
            int r2 = r0.optInt(r2, r9)     // Catch: java.lang.Exception -> L12a
            r1.b(r2)     // Catch: java.lang.Exception -> L12a
            java.lang.String r2 = "aci"
            r9 = 8
            int r0 = r0.optInt(r2, r9)     // Catch: java.lang.Exception -> L12a
            r1.c(r0)     // Catch: java.lang.Exception -> L12a
            r14.a(r1)     // Catch: java.lang.Exception -> L12a
        L12a:
            java.lang.String r0 = "rver"
            java.lang.String r0 = r15.optString(r0)     // Catch: java.lang.Exception -> L201
            r14.a(r0)     // Catch: java.lang.Exception -> L201
            com.kuaishou.weapon.p0.y$g r0 = new com.kuaishou.weapon.p0.y$g     // Catch: java.lang.Exception -> L201
            r0.<init>()     // Catch: java.lang.Exception -> L201
            org.json.JSONObject r1 = r15.getJSONObject(r8)     // Catch: java.lang.Exception -> L201
            if (r1 == 0) goto L201
            java.lang.String r2 = "rs"
            r9 = 1
            int r2 = r1.optInt(r2, r9)     // Catch: java.lang.Exception -> L201
            r0.b(r2)     // Catch: java.lang.Exception -> L201
            java.lang.String r2 = "rc"
            r9 = 6
            int r2 = r1.optInt(r2, r9)     // Catch: java.lang.Exception -> L201
            r0.c(r2)     // Catch: java.lang.Exception -> L201
            java.lang.String r2 = "ri"
            r9 = 4
            int r2 = r1.optInt(r2, r9)     // Catch: java.lang.Exception -> L201
            r0.d(r2)     // Catch: java.lang.Exception -> L201
            java.lang.String r2 = "ro"
            r9 = 5
            int r2 = r1.optInt(r2, r9)     // Catch: java.lang.Exception -> L201
            r0.e(r2)     // Catch: java.lang.Exception -> L201
            java.lang.String r2 = "rb"
            r13 = 0
            int r2 = r1.optInt(r2, r13)     // Catch: java.lang.Exception -> L201
            r0.a(r2)     // Catch: java.lang.Exception -> L201
            java.lang.String r2 = "rcl"
            org.json.JSONObject r1 = r1.getJSONObject(r2)     // Catch: java.lang.Exception -> L201
            com.kuaishou.weapon.p0.y$g$a r2 = new com.kuaishou.weapon.p0.y$g$a     // Catch: java.lang.Exception -> L201
            r2.<init>()     // Catch: java.lang.Exception -> L201
            java.lang.String r9 = "da"
            r13 = 1
            int r9 = r1.optInt(r9, r13)     // Catch: java.lang.Exception -> L201
            r2.l(r9)     // Catch: java.lang.Exception -> L201
            java.lang.String r9 = "em"
            int r9 = r1.optInt(r9, r13)     // Catch: java.lang.Exception -> L201
            r2.b(r9)     // Catch: java.lang.Exception -> L201
            java.lang.String r9 = "li"
            int r9 = r1.optInt(r9, r13)     // Catch: java.lang.Exception -> L201
            r2.m(r9)     // Catch: java.lang.Exception -> L201
            java.lang.String r9 = "rcd"
            int r9 = r1.optInt(r9, r13)     // Catch: java.lang.Exception -> L201
            r2.f(r9)     // Catch: java.lang.Exception -> L201
            java.lang.String r9 = "dv"
            int r9 = r1.optInt(r9, r13)     // Catch: java.lang.Exception -> L201
            r2.g(r9)     // Catch: java.lang.Exception -> L201
            java.lang.String r9 = "re"
            int r9 = r1.optInt(r9, r13)     // Catch: java.lang.Exception -> L201
            r2.h(r9)     // Catch: java.lang.Exception -> L201
            java.lang.String r9 = "fr"
            int r9 = r1.optInt(r9, r13)     // Catch: java.lang.Exception -> L201
            r2.c(r9)     // Catch: java.lang.Exception -> L201
            java.lang.String r9 = "hk"
            r13 = 0
            int r9 = r1.optInt(r9, r13)     // Catch: java.lang.Exception -> L201
            r2.a(r9)     // Catch: java.lang.Exception -> L201
            java.lang.String r9 = "vp"
            int r9 = r1.optInt(r9, r13)     // Catch: java.lang.Exception -> L201
            r2.k(r9)     // Catch: java.lang.Exception -> L201
            int r9 = r1.optInt(r11, r13)     // Catch: java.lang.Exception -> L201
            r2.i(r9)     // Catch: java.lang.Exception -> L201
            java.lang.String r9 = "sc"
            r13 = 1
            int r9 = r1.optInt(r9, r13)     // Catch: java.lang.Exception -> L201
            r2.e(r9)     // Catch: java.lang.Exception -> L201
            java.lang.String r9 = "ud"
            int r9 = r1.optInt(r9, r13)     // Catch: java.lang.Exception -> L201
            r2.d(r9)     // Catch: java.lang.Exception -> L201
            java.lang.String r9 = "xp"
            int r9 = r1.optInt(r9, r13)     // Catch: java.lang.Exception -> L201
            r2.j(r9)     // Catch: java.lang.Exception -> L201
            java.lang.String r9 = "vl"
            r13 = 0
            int r1 = r1.optInt(r9, r13)     // Catch: java.lang.Exception -> L201
            r2.n(r1)     // Catch: java.lang.Exception -> L201
            r0.a(r2)     // Catch: java.lang.Exception -> L201
            r14.a(r0)     // Catch: java.lang.Exception -> L201
        L201:
            r0 = 2
            com.kuaishou.weapon.p0.y$c r1 = new com.kuaishou.weapon.p0.y$c     // Catch: java.lang.Exception -> L344
            r1.<init>()     // Catch: java.lang.Exception -> L344
            java.lang.String r2 = "b"
            org.json.JSONObject r2 = r15.getJSONObject(r2)     // Catch: java.lang.Exception -> L344
            java.lang.String r9 = "bc"
            int r9 = r2.optInt(r9, r0)     // Catch: java.lang.Exception -> L344
            r1.b(r9)     // Catch: java.lang.Exception -> L344
            java.lang.String r9 = "bi"
            r13 = 12
            int r9 = r2.optInt(r9, r13)     // Catch: java.lang.Exception -> L344
            r1.c(r9)     // Catch: java.lang.Exception -> L344
            java.lang.String r9 = "bs"
            r13 = 1
            int r9 = r2.optInt(r9, r13)     // Catch: java.lang.Exception -> L344
            r1.a(r9)     // Catch: java.lang.Exception -> L344
            java.lang.String r9 = "pry"
            org.json.JSONObject r9 = r2.getJSONObject(r9)     // Catch: java.lang.Exception -> L28e
            com.kuaishou.weapon.p0.y$c$b r13 = new com.kuaishou.weapon.p0.y$c$b     // Catch: java.lang.Exception -> L28e
            r13.<init>()     // Catch: java.lang.Exception -> L28e
            java.lang.String r0 = "gifa"
            r18 = r15
            r15 = 1
            int r0 = r9.optInt(r0, r15)     // Catch: java.lang.Exception -> L290
            r13.e(r0)     // Catch: java.lang.Exception -> L290
            java.lang.String r0 = "gnci"
            int r0 = r9.optInt(r0, r15)     // Catch: java.lang.Exception -> L290
            r13.d(r0)     // Catch: java.lang.Exception -> L290
            java.lang.String r0 = "gsl"
            int r0 = r9.optInt(r0, r15)     // Catch: java.lang.Exception -> L290
            r13.f(r0)     // Catch: java.lang.Exception -> L290
            java.lang.String r0 = "gso"
            int r0 = r9.optInt(r0, r15)     // Catch: java.lang.Exception -> L290
            r13.c(r0)     // Catch: java.lang.Exception -> L290
            java.lang.String r0 = "gno"
            int r0 = r9.optInt(r0, r15)     // Catch: java.lang.Exception -> L290
            r13.a(r0)     // Catch: java.lang.Exception -> L290
            java.lang.String r0 = "gnon"
            int r0 = r9.optInt(r0, r15)     // Catch: java.lang.Exception -> L290
            r13.b(r0)     // Catch: java.lang.Exception -> L290
            java.lang.String r0 = "rl"
            int r0 = r9.optInt(r0, r15)     // Catch: java.lang.Exception -> L290
            r13.g(r0)     // Catch: java.lang.Exception -> L290
            java.lang.String r0 = "grs"
            int r0 = r9.optInt(r0, r15)     // Catch: java.lang.Exception -> L290
            r13.i(r0)     // Catch: java.lang.Exception -> L290
            java.lang.String r0 = "grt"
            int r0 = r9.optInt(r0, r15)     // Catch: java.lang.Exception -> L290
            r13.h(r0)     // Catch: java.lang.Exception -> L290
            r1.a(r13)     // Catch: java.lang.Exception -> L290
            goto L290
        L28e:
            r18 = r15
        L290:
            java.lang.String r0 = "bcl"
            org.json.JSONObject r0 = r2.getJSONObject(r0)     // Catch: java.lang.Exception -> L33d
            com.kuaishou.weapon.p0.y$c$a r2 = new com.kuaishou.weapon.p0.y$c$a     // Catch: java.lang.Exception -> L33d
            r2.<init>()     // Catch: java.lang.Exception -> L33d
            r13 = 1
            int r9 = r0.optInt(r10, r13)     // Catch: java.lang.Exception -> L33d
            r2.a(r9)     // Catch: java.lang.Exception -> L33d
            int r8 = r0.optInt(r8, r13)     // Catch: java.lang.Exception -> L33d
            r2.i(r8)     // Catch: java.lang.Exception -> L33d
            int r8 = r0.optInt(r7, r13)     // Catch: java.lang.Exception -> L33d
            r2.b(r8)     // Catch: java.lang.Exception -> L33d
            java.lang.String r8 = "s"
            int r8 = r0.optInt(r8, r13)     // Catch: java.lang.Exception -> L33d
            r2.j(r8)     // Catch: java.lang.Exception -> L33d
            int r8 = r0.optInt(r6, r13)     // Catch: java.lang.Exception -> L33d
            r2.d(r8)     // Catch: java.lang.Exception -> L33d
            java.lang.String r8 = "u"
            int r8 = r0.optInt(r8, r13)     // Catch: java.lang.Exception -> L33d
            r2.k(r8)     // Catch: java.lang.Exception -> L33d
            r13 = 0
            int r8 = r0.optInt(r5, r13)     // Catch: java.lang.Exception -> L33d
            r2.m(r8)     // Catch: java.lang.Exception -> L33d
            int r8 = r0.optInt(r4, r13)     // Catch: java.lang.Exception -> L33d
            r2.f(r8)     // Catch: java.lang.Exception -> L33d
            r9 = 1
            int r8 = r0.optInt(r3, r9)     // Catch: java.lang.Exception -> L33d
            r2.p(r8)     // Catch: java.lang.Exception -> L33d
            int r8 = r0.optInt(r12, r13)     // Catch: java.lang.Exception -> L33d
            r2.e(r8)     // Catch: java.lang.Exception -> L33d
            r8 = r20
            int r10 = r0.optInt(r8, r9)     // Catch: java.lang.Exception -> L338
            r2.n(r10)     // Catch: java.lang.Exception -> L338
            r10 = r19
            int r13 = r0.optInt(r10, r9)     // Catch: java.lang.Exception -> L335
            r2.o(r13)     // Catch: java.lang.Exception -> L335
            int r13 = r0.optInt(r11, r9)     // Catch: java.lang.Exception -> L335
            r2.l(r13)     // Catch: java.lang.Exception -> L335
            java.lang.String r13 = "rp"
            int r13 = r0.optInt(r13, r9)     // Catch: java.lang.Exception -> L335
            r2.q(r13)     // Catch: java.lang.Exception -> L335
            java.lang.String r13 = "tc"
            int r13 = r0.optInt(r13, r9)     // Catch: java.lang.Exception -> L335
            r2.g(r13)     // Catch: java.lang.Exception -> L335
            java.lang.String r13 = "il"
            int r13 = r0.optInt(r13, r9)     // Catch: java.lang.Exception -> L335
            r2.c(r13)     // Catch: java.lang.Exception -> L335
            r13 = r17
            int r15 = r0.optInt(r13, r9)     // Catch: java.lang.Exception -> L347
            r2.h(r15)     // Catch: java.lang.Exception -> L347
            java.lang.String r15 = "l"
            int r0 = r0.optInt(r15, r9)     // Catch: java.lang.Exception -> L347
            r2.r(r0)     // Catch: java.lang.Exception -> L347
            r1.a(r2)     // Catch: java.lang.Exception -> L347
            r14.a(r1)     // Catch: java.lang.Exception -> L347
            goto L347
        L335:
            r13 = r17
            goto L347
        L338:
            r13 = r17
            r10 = r19
            goto L347
        L33d:
            r13 = r17
            r10 = r19
            r8 = r20
            goto L347
        L344:
            r18 = r15
            goto L33d
        L347:
            java.lang.String r0 = "cver"
            r1 = r18
            java.lang.String r0 = r1.optString(r0)     // Catch: java.lang.Exception -> L3d3
            r14.g(r0)     // Catch: java.lang.Exception -> L3d3
            com.kuaishou.weapon.p0.y$d r0 = new com.kuaishou.weapon.p0.y$d     // Catch: java.lang.Exception -> L3d3
            r0.<init>()     // Catch: java.lang.Exception -> L3d3
            org.json.JSONObject r2 = r1.getJSONObject(r7)     // Catch: java.lang.Exception -> L3d3
            java.lang.String r7 = "cc"
            r9 = 2
            int r7 = r2.optInt(r7, r9)     // Catch: java.lang.Exception -> L3d3
            r0.b(r7)     // Catch: java.lang.Exception -> L3d3
            java.lang.String r7 = "ci"
            r9 = 12
            int r7 = r2.optInt(r7, r9)     // Catch: java.lang.Exception -> L3d3
            r0.c(r7)     // Catch: java.lang.Exception -> L3d3
            java.lang.String r7 = "cs"
            r9 = 1
            int r7 = r2.optInt(r7, r9)     // Catch: java.lang.Exception -> L3d3
            r0.a(r7)     // Catch: java.lang.Exception -> L3d3
            java.lang.String r7 = "cb"
            r9 = 0
            int r7 = r2.optInt(r7, r9)     // Catch: java.lang.Exception -> L3d3
            r0.d(r7)     // Catch: java.lang.Exception -> L3d3
            java.lang.String r7 = "ccl"
            org.json.JSONObject r2 = r2.getJSONObject(r7)     // Catch: java.lang.Exception -> L3d3
            com.kuaishou.weapon.p0.y$d$a r7 = new com.kuaishou.weapon.p0.y$d$a     // Catch: java.lang.Exception -> L3d3
            r7.<init>()     // Catch: java.lang.Exception -> L3d3
            r9 = 1
            int r6 = r2.optInt(r6, r9)     // Catch: java.lang.Exception -> L3d3
            r7.a(r6)     // Catch: java.lang.Exception -> L3d3
            int r6 = r2.optInt(r11, r9)     // Catch: java.lang.Exception -> L3d3
            r7.b(r6)     // Catch: java.lang.Exception -> L3d3
            r6 = 0
            int r5 = r2.optInt(r5, r6)     // Catch: java.lang.Exception -> L3d3
            r7.c(r5)     // Catch: java.lang.Exception -> L3d3
            int r5 = r2.optInt(r12, r9)     // Catch: java.lang.Exception -> L3d3
            r7.d(r5)     // Catch: java.lang.Exception -> L3d3
            int r5 = r2.optInt(r8, r9)     // Catch: java.lang.Exception -> L3d3
            r7.e(r5)     // Catch: java.lang.Exception -> L3d3
            int r5 = r2.optInt(r10, r9)     // Catch: java.lang.Exception -> L3d3
            r7.f(r5)     // Catch: java.lang.Exception -> L3d3
            int r3 = r2.optInt(r3, r9)     // Catch: java.lang.Exception -> L3d3
            r7.g(r3)     // Catch: java.lang.Exception -> L3d3
            r6 = 0
            int r2 = r2.optInt(r4, r6)     // Catch: java.lang.Exception -> L3d3
            r7.h(r2)     // Catch: java.lang.Exception -> L3d3
            r0.a(r7)     // Catch: java.lang.Exception -> L3d3
            r14.a(r0)     // Catch: java.lang.Exception -> L3d3
            goto L3d3
        L3d1:
            r1 = r18
        L3d3:
            java.lang.String r0 = "pgver"
            java.lang.String r0 = r1.optString(r0)     // Catch: java.lang.Exception -> L447
            r14.i(r0)     // Catch: java.lang.Exception -> L447
            org.json.JSONObject r0 = r1.optJSONObject(r13)     // Catch: java.lang.Exception -> L447
            if (r0 == 0) goto L447
            com.kuaishou.weapon.p0.y$f r2 = new com.kuaishou.weapon.p0.y$f     // Catch: java.lang.Exception -> L447
            r2.<init>()     // Catch: java.lang.Exception -> L447
            java.lang.String r3 = "ps"
            r9 = 1
            int r3 = r0.optInt(r3, r9)     // Catch: java.lang.Exception -> L447
            r2.a(r3)     // Catch: java.lang.Exception -> L447
            java.lang.String r3 = "pc"
            r9 = 2
            int r3 = r0.optInt(r3, r9)     // Catch: java.lang.Exception -> L447
            r2.b(r3)     // Catch: java.lang.Exception -> L447
            java.lang.String r3 = "pi"
            r9 = 12
            int r3 = r0.optInt(r3, r9)     // Catch: java.lang.Exception -> L447
            r2.c(r3)     // Catch: java.lang.Exception -> L447
            java.lang.String r3 = "pcl"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch: java.lang.Exception -> L447
            if (r0 == 0) goto L444
            com.kuaishou.weapon.p0.y$f$a r3 = new com.kuaishou.weapon.p0.y$f$a     // Catch: java.lang.Exception -> L447
            r3.<init>()     // Catch: java.lang.Exception -> L447
            java.lang.String r4 = "cp"
            r9 = 1
            int r4 = r0.optInt(r4, r9)     // Catch: java.lang.Exception -> L447
            r3.d(r4)     // Catch: java.lang.Exception -> L447
            java.lang.String r4 = "gc"
            int r4 = r0.optInt(r4, r9)     // Catch: java.lang.Exception -> L447
            r3.c(r4)     // Catch: java.lang.Exception -> L447
            java.lang.String r4 = "pke"
            int r4 = r0.optInt(r4, r9)     // Catch: java.lang.Exception -> L447
            r3.b(r4)     // Catch: java.lang.Exception -> L447
            java.lang.String r4 = "pds"
            int r4 = r0.optInt(r4, r9)     // Catch: java.lang.Exception -> L447
            r3.e(r4)     // Catch: java.lang.Exception -> L447
            java.lang.String r4 = "pam"
            int r0 = r0.optInt(r4, r9)     // Catch: java.lang.Exception -> L447
            r3.a(r0)     // Catch: java.lang.Exception -> L447
            r2.a(r3)     // Catch: java.lang.Exception -> L447
        L444:
            r14.a(r2)     // Catch: java.lang.Exception -> L447
        L447:
            java.lang.String r0 = "socver"
            java.lang.String r0 = r1.optString(r0)     // Catch: java.lang.Exception -> L489
            r14.m(r0)     // Catch: java.lang.Exception -> L489
            java.lang.String r0 = "soc"
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch: java.lang.Exception -> L489
            if (r0 == 0) goto L489
            com.kuaishou.weapon.p0.y$h r2 = new com.kuaishou.weapon.p0.y$h     // Catch: java.lang.Exception -> L489
            r2.<init>()     // Catch: java.lang.Exception -> L489
            java.lang.String r3 = "socs"
            r13 = 0
            int r3 = r0.optInt(r3, r13)     // Catch: java.lang.Exception -> L489
            r2.c(r3)     // Catch: java.lang.Exception -> L489
            java.lang.String r3 = "socc"
            r9 = 2
            int r3 = r0.optInt(r3, r9)     // Catch: java.lang.Exception -> L489
            r2.d(r3)     // Catch: java.lang.Exception -> L489
            java.lang.String r3 = "soci"
            r9 = 12
            int r3 = r0.optInt(r3, r9)     // Catch: java.lang.Exception -> L489
            r2.b(r3)     // Catch: java.lang.Exception -> L489
            java.lang.String r3 = "snack"
            r13 = 0
            int r0 = r0.optInt(r3, r13)     // Catch: java.lang.Exception -> L489
            r2.a(r0)     // Catch: java.lang.Exception -> L489
            r14.a(r2)     // Catch: java.lang.Exception -> L489
        L489:
            java.lang.String r0 = "hver"
            java.lang.String r0 = r1.optString(r0)     // Catch: java.lang.Exception -> L4dd
            r14.d(r0)     // Catch: java.lang.Exception -> L4dd
            java.lang.String r0 = "h"
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch: java.lang.Exception -> L4dd
            if (r0 == 0) goto L4dd
            com.kuaishou.weapon.p0.y$e r1 = new com.kuaishou.weapon.p0.y$e     // Catch: java.lang.Exception -> L4dd
            r1.<init>()     // Catch: java.lang.Exception -> L4dd
            java.lang.String r2 = "hs"
            r9 = 1
            int r2 = r0.optInt(r2, r9)     // Catch: java.lang.Exception -> L4dd
            r1.b(r2)     // Catch: java.lang.Exception -> L4dd
            java.lang.String r2 = "hc"
            r9 = 2
            int r2 = r0.optInt(r2, r9)     // Catch: java.lang.Exception -> L4dd
            r1.c(r2)     // Catch: java.lang.Exception -> L4dd
            java.lang.String r2 = "hi"
            r9 = 12
            int r2 = r0.optInt(r2, r9)     // Catch: java.lang.Exception -> L4dd
            r1.a(r2)     // Catch: java.lang.Exception -> L4dd
            java.lang.String r2 = "hsdc"
            r9 = 1
            int r2 = r0.optInt(r2, r9)     // Catch: java.lang.Exception -> L4dd
            r1.d(r2)     // Catch: java.lang.Exception -> L4dd
            java.lang.String r2 = "hlbr"
            int r2 = r0.optInt(r2, r9)     // Catch: java.lang.Exception -> L4dd
            r1.e(r2)     // Catch: java.lang.Exception -> L4dd
            java.lang.String r2 = "pr"
            java.lang.String r0 = r0.optString(r2)     // Catch: java.lang.Exception -> L4dd
            r1.a(r0)     // Catch: java.lang.Exception -> L4dd
            r14.a(r1)     // Catch: java.lang.Exception -> L4dd
        L4dd:
            return r14
        L4de:
            r16 = 0
        L4e0:
            return r16
    }

    public void a(java.lang.String r4) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L44
            r0.<init>(r4)     // Catch: java.lang.Exception -> L44
            java.lang.String r1 = "result"
            r2 = 0
            int r1 = r0.optInt(r1, r2)     // Catch: java.lang.Exception -> L44
            r2 = 1
            if (r1 != r2) goto L44
            java.lang.String r1 = "antispamPluginRsp"
            java.lang.String r0 = r0.getString(r1)     // Catch: java.lang.Exception -> L44
            com.kuaishou.weapon.p0.bn r1 = new com.kuaishou.weapon.p0.bn     // Catch: java.lang.Exception -> L44
            android.content.Context r2 = r3.a     // Catch: java.lang.Exception -> L44
            r1.<init>(r2)     // Catch: java.lang.Exception -> L44
            java.lang.String r0 = r1.a(r0)     // Catch: java.lang.Exception -> L44
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L44
            if (r1 == 0) goto L27
            goto L44
        L27:
            com.kuaishou.weapon.p0.y r0 = r3.b(r0)     // Catch: java.lang.Exception -> L44
            if (r0 == 0) goto L37
            android.content.Context r1 = r3.a     // Catch: java.lang.Exception -> L44
            com.kuaishou.weapon.p0.df r1 = com.kuaishou.weapon.p0.df.a(r1)     // Catch: java.lang.Exception -> L44
            r1.a(r4, r0)     // Catch: java.lang.Exception -> L44
            return
        L37:
            android.content.Context r4 = r3.a     // Catch: java.lang.Exception -> L44
            com.kuaishou.weapon.p0.df r4 = com.kuaishou.weapon.p0.df.a(r4)     // Catch: java.lang.Exception -> L44
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L44
            r4.b(r0)     // Catch: java.lang.Exception -> L44
        L44:
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L71
            r0.<init>()     // Catch: java.lang.Exception -> L71
            java.lang.String r1 = com.kuaishou.weapon.p0.cu.a     // Catch: java.lang.Exception -> L71
            r0.append(r1)     // Catch: java.lang.Exception -> L71
            java.lang.String r1 = com.kuaishou.weapon.p0.cu.d     // Catch: java.lang.Exception -> L71
            r0.append(r1)     // Catch: java.lang.Exception -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L71
            android.content.Context r1 = r5.a     // Catch: java.lang.Exception -> L71
            java.lang.String r1 = com.kuaishou.weapon.p0.cv.a(r1)     // Catch: java.lang.Exception -> L71
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L71
            if (r2 != 0) goto L33
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L71
            r2.<init>()     // Catch: java.lang.Exception -> L71
            r2.append(r0)     // Catch: java.lang.Exception -> L71
            java.lang.String r0 = "?"
            r2.append(r0)     // Catch: java.lang.Exception -> L71
            r2.append(r1)     // Catch: java.lang.Exception -> L71
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L71
        L33:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L71
            r1.<init>()     // Catch: java.lang.Exception -> L71
            android.content.Context r2 = r5.a     // Catch: java.lang.Exception -> L71
            org.json.JSONObject r2 = com.kuaishou.weapon.p0.cv.b(r2)     // Catch: java.lang.Exception -> L71
            if (r2 == 0) goto L54
            com.kuaishou.weapon.p0.bn r3 = new com.kuaishou.weapon.p0.bn     // Catch: java.lang.Exception -> L71
            android.content.Context r4 = r5.a     // Catch: java.lang.Exception -> L71
            r3.<init>(r4)     // Catch: java.lang.Exception -> L71
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L71
            java.lang.String r2 = r3.c(r2)     // Catch: java.lang.Exception -> L71
            java.lang.String r3 = "data"
            r1.put(r3, r2)     // Catch: java.lang.Exception -> L71
        L54:
            android.content.Context r2 = r5.a     // Catch: java.lang.Exception -> L71
            com.kuaishou.weapon.p0.l r2 = com.kuaishou.weapon.p0.l.a(r2)     // Catch: java.lang.Exception -> L71
            com.kuaishou.weapon.p0.m r3 = new com.kuaishou.weapon.p0.m     // Catch: java.lang.Exception -> L71
            r3.<init>(r0, r1)     // Catch: java.lang.Exception -> L71
            java.lang.String r0 = com.kuaishou.weapon.p0.WeaponHI.cookieData     // Catch: java.lang.Exception -> L71
            r3.a(r0)     // Catch: java.lang.Exception -> L71
            java.lang.String r0 = com.kuaishou.weapon.p0.WeaponHI.encryENV     // Catch: java.lang.Exception -> L71
            r3.b(r0)     // Catch: java.lang.Exception -> L71
            com.kuaishou.weapon.p0.cw$1 r0 = new com.kuaishou.weapon.p0.cw$1     // Catch: java.lang.Exception -> L71
            r0.<init>(r5)     // Catch: java.lang.Exception -> L71
            r2.b(r3, r0)     // Catch: java.lang.Exception -> L71
        L71:
            return
    }
}
