package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class s4 extends xyz.adscope.common.v2.model.IBaseMacrosMappingModel {

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ABS_ADY__")
    private java.lang.String A;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ABS_WIDTH__")
    private java.lang.String B;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ABS_HEIGHT__")
    private java.lang.String C;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ABS_SRC_DOWN_X__")
    private java.lang.String D;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ABS_SRC_DOWN_Y__")
    private java.lang.String E;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ABS_SRC_UP_X__")
    private java.lang.String F;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ABS_SRC_UP_Y__")
    private java.lang.String G;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ABS_AD_DOWN_X__")
    private java.lang.String H;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ABS_AD_DOWN_Y__")
    private java.lang.String I;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ABS_AD_UP_X__")
    private java.lang.String J;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ABS_AD_UP_Y__")
    private java.lang.String K;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ABS_MAT_DOWN_X__")
    private java.lang.String L;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ABS_MAT_DOWN_Y__")
    private java.lang.String M;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ABS_MAT_UP_X__")
    private java.lang.String N;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ABS_MAT_UP_Y__")
    private java.lang.String O;
    private final java.lang.String a;
    private final android.content.Context b;
    private int c;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__REQUESTUUID__")
    private final java.lang.String d;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__TS__")
    private final java.lang.String e;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ACTION__")
    private final java.lang.String f;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__INTERACTIVE__")
    private java.lang.String g;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ADX__")
    private java.lang.String h;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ADY__")
    private java.lang.String i;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__WIDTH__")
    private java.lang.String j;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__HEIGHT__")
    private java.lang.String k;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__DOWN_TS__")
    private java.lang.String l;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__UP_TS__")
    private java.lang.String m;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__SRC_DOWN_X__")
    private java.lang.String n;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__SRC_DOWN_Y__")
    private java.lang.String o;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__SRC_UP_X__")
    private java.lang.String p;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__SRC_UP_Y__")
    private java.lang.String q;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__AD_DOWN_X__")
    private java.lang.String r;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__AD_DOWN_Y__")
    private java.lang.String s;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__AD_UP_X__")
    private java.lang.String t;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__AD_UP_Y__")
    private java.lang.String u;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__MAT_DOWN_X__")
    private java.lang.String v;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__MAT_DOWN_Y__")
    private java.lang.String w;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__MAT_UP_X__")
    private java.lang.String x;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__MAT_UP_Y__")
    private java.lang.String y;

    @xyz.adscope.common.v2.model.annotation.MacrosReplace(macros = "__ABS_ADX__")
    private java.lang.String z;

    s4(android.content.Context r3, xyz.adscope.ad.l2 r4, xyz.adscope.ad.b1 r5) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "-999"
            r2.a = r0
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r2.b = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = r4.getEventCode()
            r3.append(r4)
            java.lang.String r4 = ""
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.f = r3
            java.lang.String r3 = r5.t()
            r2.d = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            long r0 = java.lang.System.currentTimeMillis()
            r3.append(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.e = r3
            int r3 = r5.m()
            r2.c = r3
            r0 = -1
            if (r3 == r0) goto L5d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r0 = r2.c
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = r3.toString()
        L5d:
            r2.g = r4
            xyz.adscope.ad.i4$b r3 = r5.x()
            if (r3 == 0) goto L7d
            r2.g(r3)
            r2.h(r3)
            r2.f(r3)
            r2.e(r3)
            r2.a(r3)
            r2.b(r3)
            r2.c(r3)
            r2.d(r3)
        L7d:
            return
    }

    private java.lang.String a(float r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = r2.b
            int r3 = xyz.adscope.common.v2.dev.info.ScreenUtil.Calculate.px2dip(r1, r3)
            r0.append(r3)
            java.lang.String r3 = ""
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private void a(xyz.adscope.ad.i4.b r6) {
            r5 = this;
            float r0 = r6.d()
            float r1 = r6.a()
            int r2 = r5.c
            xyz.adscope.ad.n3$a r3 = xyz.adscope.ad.n3.a.c
            int r3 = r3.getEventCode()
            if (r2 == r3) goto L2c
            int r2 = r5.c
            xyz.adscope.ad.n3$a r3 = xyz.adscope.ad.n3.a.d
            int r3 = r3.getEventCode()
            if (r2 != r3) goto L1d
            goto L2c
        L1d:
            java.lang.String r6 = "-999"
            r5.r = r6
            r5.H = r6
            r5.v = r6
            r5.L = r6
            r5.n = r6
            r5.D = r6
            return
        L2c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r3 = r6.c()
            r2.append(r3)
            java.lang.String r6 = ""
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r5.l = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r5.r = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r5.a(r0)
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r5.H = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r5.v = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r5.a(r0)
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            r5.L = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r5.n = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.a(r1)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.D = r6
            return
    }

    private void b(xyz.adscope.ad.i4.b r5) {
            r4 = this;
            float r0 = r5.e()
            float r5 = r5.b()
            int r1 = r4.c
            xyz.adscope.ad.n3$a r2 = xyz.adscope.ad.n3.a.c
            int r2 = r2.getEventCode()
            if (r1 == r2) goto L2c
            int r1 = r4.c
            xyz.adscope.ad.n3$a r2 = xyz.adscope.ad.n3.a.d
            int r2 = r2.getEventCode()
            if (r1 != r2) goto L1d
            goto L2c
        L1d:
            java.lang.String r5 = "-999"
            r4.s = r5
            r4.I = r5
            r4.w = r5
            r4.M = r5
            r4.o = r5
            r4.E = r5
            return
        L2c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r2 = ""
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.s = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r4.a(r0)
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.I = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.w = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r4.a(r0)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r4.M = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.o = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = r4.a(r5)
            r0.append(r5)
            r0.append(r2)
            java.lang.String r5 = r0.toString()
            r4.E = r5
            return
    }

    private void c(xyz.adscope.ad.i4.b r6) {
            r5 = this;
            float r0 = r6.i()
            float r1 = r6.f()
            int r2 = r5.c
            xyz.adscope.ad.n3$a r3 = xyz.adscope.ad.n3.a.c
            int r3 = r3.getEventCode()
            if (r2 == r3) goto L2c
            int r2 = r5.c
            xyz.adscope.ad.n3$a r3 = xyz.adscope.ad.n3.a.d
            int r3 = r3.getEventCode()
            if (r2 != r3) goto L1d
            goto L2c
        L1d:
            java.lang.String r6 = "-999"
            r5.t = r6
            r5.J = r6
            r5.x = r6
            r5.N = r6
            r5.p = r6
            r5.F = r6
            return
        L2c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r3 = r6.h()
            r2.append(r3)
            java.lang.String r6 = ""
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r5.m = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r5.t = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r5.a(r0)
            r2.append(r3)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r5.J = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            r5.x = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = r5.a(r0)
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            r5.N = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r5.p = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.a(r1)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.F = r6
            return
    }

    private void d(xyz.adscope.ad.i4.b r5) {
            r4 = this;
            float r0 = r5.j()
            float r5 = r5.g()
            int r1 = r4.c
            xyz.adscope.ad.n3$a r2 = xyz.adscope.ad.n3.a.c
            int r2 = r2.getEventCode()
            if (r1 == r2) goto L2c
            int r1 = r4.c
            xyz.adscope.ad.n3$a r2 = xyz.adscope.ad.n3.a.d
            int r2 = r2.getEventCode()
            if (r1 != r2) goto L1d
            goto L2c
        L1d:
            java.lang.String r5 = "-999"
            r4.u = r5
            r4.K = r5
            r4.y = r5
            r4.O = r5
            r4.q = r5
            r4.G = r5
            return
        L2c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r2 = ""
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.u = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r4.a(r0)
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.K = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.y = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r4.a(r0)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r4.O = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.q = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = r4.a(r5)
            r0.append(r5)
            r0.append(r2)
            java.lang.String r5 = r0.toString()
            r4.G = r5
            return
    }

    private void e(xyz.adscope.ad.i4.b r3) {
            r2 = this;
            int r3 = r3.k()
            float r3 = (float) r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.k = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r2.a(r3)
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            r2.C = r3
            return
    }

    private void f(xyz.adscope.ad.i4.b r3) {
            r2 = this;
            int r3 = r3.l()
            float r3 = (float) r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.j = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r2.a(r3)
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            r2.B = r3
            return
    }

    private void g(xyz.adscope.ad.i4.b r3) {
            r2 = this;
            float r3 = r3.m()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.h = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r2.a(r3)
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            r2.z = r3
            return
    }

    private void h(xyz.adscope.ad.i4.b r3) {
            r2 = this;
            float r3 = r3.n()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.i = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r2.a(r3)
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            r2.A = r3
            return
    }
}
