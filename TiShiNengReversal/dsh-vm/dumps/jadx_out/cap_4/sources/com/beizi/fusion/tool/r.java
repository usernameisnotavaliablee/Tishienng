package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class r {
    private static android.hardware.SensorManager j;
    private float A;
    private float B;
    private float C;
    private float D;
    private float E;
    private android.hardware.SensorEventListener F;
    private android.content.Context a;
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewBean b;
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewBean c;
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewRuleBean d;
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewRuleBean e;
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewRuleBean f;
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleRenderBean g;
    private float h;
    private float[] i;
    private android.hardware.Sensor k;

    /* renamed from: l, reason: collision with root package name */
    private double f66l;

    /* renamed from: m, reason: collision with root package name */
    private double f67m;

    /* renamed from: n, reason: collision with root package name */
    private double f68n;

    /* renamed from: o, reason: collision with root package name */
    private java.lang.String f69o;

    /* renamed from: p, reason: collision with root package name */
    private java.lang.String f70p;

    /* renamed from: q, reason: collision with root package name */
    private java.lang.String f71q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f72r;

    /* renamed from: s, reason: collision with root package name */
    private int f73s;

    /* renamed from: t, reason: collision with root package name */
    private float f74t;

    /* renamed from: u, reason: collision with root package name */
    private com.beizi.fusion.widget.EulerAngleView f75u;

    /* renamed from: v, reason: collision with root package name */
    private com.beizi.fusion.tool.r.a f76v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f77w;

    /* renamed from: x, reason: collision with root package name */
    private java.lang.String f78x;

    /* renamed from: y, reason: collision with root package name */
    private java.lang.Boolean f79y;

    /* renamed from: z, reason: collision with root package name */
    private float f80z;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a();
    }

    public r(android.content.Context r3, java.lang.String r4, com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewBean r5, com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewBean r6) {
            r2 = this;
            r2.<init>()
            r0 = 814313567(0x3089705f, float:1.0E-9)
            r2.h = r0
            r0 = 3
            float[] r0 = new float[r0]
            r2.i = r0
            r0 = 0
            r2.f66l = r0
            r2.f67m = r0
            r2.f68n = r0
            r0 = 0
            r2.f72r = r0
            r2.f73s = r0
            r2.f77w = r0
            r0 = 0
            r2.f78x = r0
            com.beizi.fusion.tool.r$1 r0 = new com.beizi.fusion.tool.r$1
            r0.<init>(r2)
            r2.F = r0
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            java.lang.String r1 = "sensor"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0
            com.beizi.fusion.tool.r.j = r0
            r2.a = r3
            r2.b = r5
            r2.c = r6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "splash_cool_"
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.f78x = r3
            r2.c()
            r2.d()
            return
    }

    static /* synthetic */ double a(com.beizi.fusion.tool.r r0, double r1) {
            r0.f66l = r1
            return r1
    }

    static /* synthetic */ float a(com.beizi.fusion.tool.r r0, float r1) {
            r0.f74t = r1
            return r1
    }

    private void a(android.hardware.SensorEvent r24) {
            r23 = this;
            r0 = r23
            r1 = r24
            java.lang.String r2 = "%.4f"
            if (r1 == 0) goto L155
            boolean r3 = r0.f77w     // Catch: java.lang.Exception -> L155
            if (r3 == 0) goto Le
            goto L155
        Le:
            android.hardware.Sensor r3 = r1.sensor     // Catch: java.lang.Exception -> L155
            float[] r4 = r1.values     // Catch: java.lang.Exception -> L155
            int r3 = r3.getType()     // Catch: java.lang.Exception -> L155
            if (r4 == 0) goto L155
            r5 = 4
            if (r3 == r5) goto L1d
            goto L155
        L1d:
            float r3 = r0.f74t     // Catch: java.lang.Exception -> L155
            r5 = 0
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 == 0) goto L150
            r6 = 0
            r7 = r4[r6]     // Catch: java.lang.Exception -> L155
            r8 = 1
            r9 = r4[r8]     // Catch: java.lang.Exception -> L155
            r10 = 2
            r4 = r4[r10]     // Catch: java.lang.Exception -> L155
            long r11 = r1.timestamp     // Catch: java.lang.Exception -> L155
            float r11 = (float) r11     // Catch: java.lang.Exception -> L155
            float r11 = r11 - r3
            float r3 = r0.h     // Catch: java.lang.Exception -> L155
            float r11 = r11 * r3
            float[] r3 = r0.i     // Catch: java.lang.Exception -> L155
            r12 = r3[r6]     // Catch: java.lang.Exception -> L155
            double r12 = (double) r12     // Catch: java.lang.Exception -> L155
            float r7 = r7 * r11
            double r14 = (double) r7     // Catch: java.lang.Exception -> L155
            double r14 = java.lang.Math.toDegrees(r14)     // Catch: java.lang.Exception -> L155
            double r12 = r12 + r14
            float r7 = (float) r12     // Catch: java.lang.Exception -> L155
            r3[r6] = r7     // Catch: java.lang.Exception -> L155
            float[] r3 = r0.i     // Catch: java.lang.Exception -> L155
            r7 = r3[r8]     // Catch: java.lang.Exception -> L155
            double r12 = (double) r7     // Catch: java.lang.Exception -> L155
            float r9 = r9 * r11
            double r14 = (double) r9     // Catch: java.lang.Exception -> L155
            double r14 = java.lang.Math.toDegrees(r14)     // Catch: java.lang.Exception -> L155
            double r12 = r12 + r14
            float r7 = (float) r12     // Catch: java.lang.Exception -> L155
            r3[r8] = r7     // Catch: java.lang.Exception -> L155
            float[] r3 = r0.i     // Catch: java.lang.Exception -> L155
            r7 = r3[r10]     // Catch: java.lang.Exception -> L155
            double r12 = (double) r7     // Catch: java.lang.Exception -> L155
            float r4 = r4 * r11
            double r14 = (double) r4     // Catch: java.lang.Exception -> L155
            double r14 = java.lang.Math.toDegrees(r14)     // Catch: java.lang.Exception -> L155
            double r12 = r12 + r14
            float r4 = (float) r12     // Catch: java.lang.Exception -> L155
            r3[r10] = r4     // Catch: java.lang.Exception -> L155
            float[] r3 = r0.i     // Catch: java.lang.Exception -> L155
            r4 = r3[r6]     // Catch: java.lang.Exception -> L155
            int r7 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r7 <= 0) goto L76
            float r7 = r0.C     // Catch: java.lang.Exception -> L155
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 <= 0) goto L7e
            r0.C = r4     // Catch: java.lang.Exception -> L155
            goto L7e
        L76:
            float r7 = r0.f80z     // Catch: java.lang.Exception -> L155
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 >= 0) goto L7e
            r0.f80z = r4     // Catch: java.lang.Exception -> L155
        L7e:
            r4 = r3[r8]     // Catch: java.lang.Exception -> L155
            int r7 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r7 <= 0) goto L8d
            float r7 = r0.D     // Catch: java.lang.Exception -> L155
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 <= 0) goto L95
            r0.D = r4     // Catch: java.lang.Exception -> L155
            goto L95
        L8d:
            float r7 = r0.A     // Catch: java.lang.Exception -> L155
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 >= 0) goto L95
            r0.A = r4     // Catch: java.lang.Exception -> L155
        L95:
            r3 = r3[r10]     // Catch: java.lang.Exception -> L155
            int r4 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r4 <= 0) goto La4
            float r4 = r0.E     // Catch: java.lang.Exception -> L155
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto Lac
            r0.E = r3     // Catch: java.lang.Exception -> L155
            goto Lac
        La4:
            float r4 = r0.B     // Catch: java.lang.Exception -> L155
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto Lac
            r0.B = r3     // Catch: java.lang.Exception -> L155
        Lac:
            com.beizi.fusion.widget.EulerAngleView r11 = r0.f75u     // Catch: java.lang.Exception -> L155
            if (r11 == 0) goto Ld3
            double r12 = r0.f66l     // Catch: java.lang.Exception -> L155
            double r14 = r0.f67m     // Catch: java.lang.Exception -> L155
            double r3 = r0.f68n     // Catch: java.lang.Exception -> L155
            r16 = r3
            r11.setAngle(r12, r14, r16)     // Catch: java.lang.Exception -> L155
            com.beizi.fusion.widget.EulerAngleView r3 = r0.f75u     // Catch: java.lang.Exception -> L155
            float[] r4 = r0.i     // Catch: java.lang.Exception -> L155
            r5 = r4[r6]     // Catch: java.lang.Exception -> L155
            double r11 = (double) r5     // Catch: java.lang.Exception -> L155
            r5 = r4[r8]     // Catch: java.lang.Exception -> L155
            double r13 = (double) r5     // Catch: java.lang.Exception -> L155
            r4 = r4[r10]     // Catch: java.lang.Exception -> L155
            double r4 = (double) r4     // Catch: java.lang.Exception -> L155
            r16 = r3
            r21 = r4
            r17 = r11
            r19 = r13
            r16.setCurrentProgress(r17, r19, r21)     // Catch: java.lang.Exception -> L155
        Ld3:
            java.lang.String r3 = "ShakeUtil"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L155
            r4.<init>()     // Catch: java.lang.Exception -> L155
            java.lang.String r5 = "rotate  x: "
            r4.append(r5)     // Catch: java.lang.Exception -> L155
            float[] r5 = r0.i     // Catch: java.lang.Exception -> L155
            r5 = r5[r6]     // Catch: java.lang.Exception -> L155
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch: java.lang.Exception -> L155
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L155
            r7[r6] = r5     // Catch: java.lang.Exception -> L155
            java.lang.String r5 = java.lang.String.format(r2, r7)     // Catch: java.lang.Exception -> L155
            r4.append(r5)     // Catch: java.lang.Exception -> L155
            java.lang.String r5 = ",y: "
            r4.append(r5)     // Catch: java.lang.Exception -> L155
            float[] r5 = r0.i     // Catch: java.lang.Exception -> L155
            r5 = r5[r8]     // Catch: java.lang.Exception -> L155
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch: java.lang.Exception -> L155
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L155
            r7[r6] = r5     // Catch: java.lang.Exception -> L155
            java.lang.String r5 = java.lang.String.format(r2, r7)     // Catch: java.lang.Exception -> L155
            r4.append(r5)     // Catch: java.lang.Exception -> L155
            java.lang.String r5 = ",z: "
            r4.append(r5)     // Catch: java.lang.Exception -> L155
            float[] r5 = r0.i     // Catch: java.lang.Exception -> L155
            r5 = r5[r10]     // Catch: java.lang.Exception -> L155
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch: java.lang.Exception -> L155
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L155
            r7[r6] = r5     // Catch: java.lang.Exception -> L155
            java.lang.String r2 = java.lang.String.format(r2, r7)     // Catch: java.lang.Exception -> L155
            r4.append(r2)     // Catch: java.lang.Exception -> L155
            java.lang.String r2 = ",x : "
            r4.append(r2)     // Catch: java.lang.Exception -> L155
            double r5 = r0.f66l     // Catch: java.lang.Exception -> L155
            r4.append(r5)     // Catch: java.lang.Exception -> L155
            java.lang.String r2 = ",y : "
            r4.append(r2)     // Catch: java.lang.Exception -> L155
            double r5 = r0.f67m     // Catch: java.lang.Exception -> L155
            r4.append(r5)     // Catch: java.lang.Exception -> L155
            java.lang.String r2 = ",z : "
            r4.append(r2)     // Catch: java.lang.Exception -> L155
            double r5 = r0.f68n     // Catch: java.lang.Exception -> L155
            r4.append(r5)     // Catch: java.lang.Exception -> L155
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L155
            com.beizi.fusion.tool.aa.a(r3, r2)     // Catch: java.lang.Exception -> L155
            boolean r2 = r0.e()     // Catch: java.lang.Exception -> L155
            if (r2 == 0) goto L150
            r0.f()     // Catch: java.lang.Exception -> L155
        L150:
            long r1 = r1.timestamp     // Catch: java.lang.Exception -> L155
            float r1 = (float) r1     // Catch: java.lang.Exception -> L155
            r0.f74t = r1     // Catch: java.lang.Exception -> L155
        L155:
            return
    }

    static /* synthetic */ void a(com.beizi.fusion.tool.r r0, android.hardware.SensorEvent r1) {
            r0.a(r1)
            return
    }

    private boolean a(long r6) {
            r5 = this;
            android.content.Context r0 = r5.a     // Catch: java.lang.Exception -> L23
            java.lang.String r1 = r5.f78x     // Catch: java.lang.Exception -> L23
            r2 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L23
            java.lang.Object r0 = com.beizi.fusion.tool.an.b(r0, r1, r4)     // Catch: java.lang.Exception -> L23
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Exception -> L23
            long r0 = r0.longValue()     // Catch: java.lang.Exception -> L23
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L23
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L23
            long r2 = r2 - r0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L23
            r6 = 1
            return r6
        L23:
            r6 = 0
            return r6
    }

    static /* synthetic */ boolean a(com.beizi.fusion.tool.r r0, boolean r1) {
            r0.f72r = r1
            return r1
    }

    static /* synthetic */ float[] a(com.beizi.fusion.tool.r r0) {
            float[] r0 = r0.i
            return r0
    }

    static /* synthetic */ double b(com.beizi.fusion.tool.r r0, double r1) {
            r0.f67m = r1
            return r1
    }

    private boolean b(long r5) {
            r4 = this;
            android.content.Context r0 = r4.a     // Catch: java.lang.Exception -> L15
            java.lang.Long r0 = com.beizi.fusion.tool.ap.o(r0)     // Catch: java.lang.Exception -> L15
            long r0 = r0.longValue()     // Catch: java.lang.Exception -> L15
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L15
            long r2 = r2 - r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L15
            r5 = 1
            return r5
        L15:
            r5 = 0
            return r5
    }

    static /* synthetic */ double c(com.beizi.fusion.tool.r r0, double r1) {
            r0.f68n = r1
            return r1
    }

    private void c() {
            r5 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewBean r0 = r5.b     // Catch: java.lang.Exception -> L66
            if (r0 == 0) goto La
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r0 = r0.getCoolRule()     // Catch: java.lang.Exception -> L66
            r5.f = r0     // Catch: java.lang.Exception -> L66
        La:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewBean r0 = r5.c     // Catch: java.lang.Exception -> L66
            if (r0 == 0) goto L1d
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r0 = r0.getNomalRule()     // Catch: java.lang.Exception -> L66
            r5.e = r0     // Catch: java.lang.Exception -> L66
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewBean r0 = r5.c     // Catch: java.lang.Exception -> L66
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleRenderBean r0 = r0.getRender()     // Catch: java.lang.Exception -> L66
            r5.g = r0     // Catch: java.lang.Exception -> L66
            goto L2f
        L1d:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewBean r0 = r5.b     // Catch: java.lang.Exception -> L66
            if (r0 == 0) goto L2f
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r0 = r0.getNomalRule()     // Catch: java.lang.Exception -> L66
            r5.e = r0     // Catch: java.lang.Exception -> L66
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewBean r0 = r5.b     // Catch: java.lang.Exception -> L66
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleRenderBean r0 = r0.getRender()     // Catch: java.lang.Exception -> L66
            r5.g = r0     // Catch: java.lang.Exception -> L66
        L2f:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r0 = r5.f     // Catch: java.lang.Exception -> L66
            r1 = 1
            if (r0 != 0) goto L3b
            r5.f72r = r1     // Catch: java.lang.Exception -> L66
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r0 = r5.e     // Catch: java.lang.Exception -> L66
            r5.d = r0     // Catch: java.lang.Exception -> L66
            return
        L3b:
            long r2 = r0.getCoolTime()     // Catch: java.lang.Exception -> L66
            boolean r0 = r5.a(r2)     // Catch: java.lang.Exception -> L66
            r2 = 0
            if (r0 == 0) goto L4d
            r5.f72r = r2     // Catch: java.lang.Exception -> L66
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r0 = r5.f     // Catch: java.lang.Exception -> L66
            r5.d = r0     // Catch: java.lang.Exception -> L66
            return
        L4d:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r0 = r5.f     // Catch: java.lang.Exception -> L66
            long r3 = r0.getUserProtectTime()     // Catch: java.lang.Exception -> L66
            boolean r0 = r5.b(r3)     // Catch: java.lang.Exception -> L66
            if (r0 == 0) goto L60
            r5.f72r = r2     // Catch: java.lang.Exception -> L66
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r0 = r5.f     // Catch: java.lang.Exception -> L66
            r5.d = r0     // Catch: java.lang.Exception -> L66
            return
        L60:
            r5.f72r = r1     // Catch: java.lang.Exception -> L66
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r0 = r5.e     // Catch: java.lang.Exception -> L66
            r5.d = r0     // Catch: java.lang.Exception -> L66
        L66:
            return
    }

    private void d() {
            r13 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r0 = r13.d     // Catch: java.lang.Exception -> Ld3
            if (r0 != 0) goto L6
            goto Ld3
        L6:
            java.util.List r0 = r0.getRules()     // Catch: java.lang.Exception -> Ld3
            if (r0 == 0) goto Ld3
            int r1 = r0.size()     // Catch: java.lang.Exception -> Ld3
            if (r1 != 0) goto L14
            goto Ld3
        L14:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r1 = r13.d     // Catch: java.lang.Exception -> Ld3
            int r1 = r1.getPassivationTime()     // Catch: java.lang.Exception -> Ld3
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> Ld3
            r2 = 0
            r6 = r2
            r8 = r6
            r10 = r8
        L23:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Exception -> Ld3
            if (r4 == 0) goto Lbe
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Exception -> Ld3
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleRuleBean r4 = (com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleRuleBean) r4     // Catch: java.lang.Exception -> Ld3
            if (r4 != 0) goto L32
            goto L23
        L32:
            java.lang.String r5 = "x"
            java.lang.String r12 = r4.getAxis()     // Catch: java.lang.Exception -> Ld3
            boolean r5 = r5.equalsIgnoreCase(r12)     // Catch: java.lang.Exception -> Ld3
            if (r5 == 0) goto L61
            if (r1 <= 0) goto L4f
            double r5 = r4.getPangle()     // Catch: java.lang.Exception -> Ld3
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L4f
            double r5 = r4.getPangle()     // Catch: java.lang.Exception -> Ld3
            r13.f66l = r5     // Catch: java.lang.Exception -> Ld3
            goto L55
        L4f:
            double r5 = r4.getAngle()     // Catch: java.lang.Exception -> Ld3
            r13.f66l = r5     // Catch: java.lang.Exception -> Ld3
        L55:
            double r5 = r4.getAngle()     // Catch: java.lang.Exception -> Ld3
            java.lang.String r4 = r4.getDirection()     // Catch: java.lang.Exception -> Ld3
            r13.f69o = r4     // Catch: java.lang.Exception -> Ld3
            r6 = r5
            goto L23
        L61:
            java.lang.String r5 = "y"
            java.lang.String r12 = r4.getAxis()     // Catch: java.lang.Exception -> Ld3
            boolean r5 = r5.equalsIgnoreCase(r12)     // Catch: java.lang.Exception -> Ld3
            if (r5 == 0) goto L8f
            if (r1 <= 0) goto L7e
            double r8 = r4.getPangle()     // Catch: java.lang.Exception -> Ld3
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 <= 0) goto L7e
            double r8 = r4.getPangle()     // Catch: java.lang.Exception -> Ld3
            r13.f67m = r8     // Catch: java.lang.Exception -> Ld3
            goto L84
        L7e:
            double r8 = r4.getAngle()     // Catch: java.lang.Exception -> Ld3
            r13.f67m = r8     // Catch: java.lang.Exception -> Ld3
        L84:
            double r8 = r4.getAngle()     // Catch: java.lang.Exception -> Ld3
            java.lang.String r4 = r4.getDirection()     // Catch: java.lang.Exception -> Ld3
            r13.f70p = r4     // Catch: java.lang.Exception -> Ld3
            goto L23
        L8f:
            java.lang.String r5 = "z"
            java.lang.String r12 = r4.getAxis()     // Catch: java.lang.Exception -> Ld3
            boolean r5 = r5.equalsIgnoreCase(r12)     // Catch: java.lang.Exception -> Ld3
            if (r5 == 0) goto L23
            if (r1 <= 0) goto Lac
            double r10 = r4.getPangle()     // Catch: java.lang.Exception -> Ld3
            int r5 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r5 <= 0) goto Lac
            double r10 = r4.getPangle()     // Catch: java.lang.Exception -> Ld3
            r13.f68n = r10     // Catch: java.lang.Exception -> Ld3
            goto Lb2
        Lac:
            double r10 = r4.getAngle()     // Catch: java.lang.Exception -> Ld3
            r13.f68n = r10     // Catch: java.lang.Exception -> Ld3
        Lb2:
            double r10 = r4.getAngle()     // Catch: java.lang.Exception -> Ld3
            java.lang.String r4 = r4.getDirection()     // Catch: java.lang.Exception -> Ld3
            r13.f71q = r4     // Catch: java.lang.Exception -> Ld3
            goto L23
        Lbe:
            if (r1 <= 0) goto Ld3
            int r0 = com.beizi.fusion.tool.af.b(r1)     // Catch: java.lang.Exception -> Ld3
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Exception -> Ld3
            r1.<init>()     // Catch: java.lang.Exception -> Ld3
            com.beizi.fusion.tool.r$2 r4 = new com.beizi.fusion.tool.r$2     // Catch: java.lang.Exception -> Ld3
            r5 = r13
            r4.<init>(r5, r6, r8, r10)     // Catch: java.lang.Exception -> Ld3
            long r2 = (long) r0     // Catch: java.lang.Exception -> Ld3
            r1.postDelayed(r4, r2)     // Catch: java.lang.Exception -> Ld3
        Ld3:
            return
    }

    private boolean e() {
            r14 = this;
            r0 = 0
            double r1 = r14.f66l     // Catch: java.lang.Exception -> L179
            java.lang.String r3 = "3"
            java.lang.String r4 = "0"
            java.lang.String r5 = "1"
            java.lang.String r6 = "2"
            r7 = 0
            r9 = 0
            r10 = 1
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 <= 0) goto L86
            java.lang.String r1 = r14.f69o     // Catch: java.lang.Exception -> L179
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Exception -> L179
            if (r1 == 0) goto L2f
            float[] r1 = r14.i     // Catch: java.lang.Exception -> L179
            r1 = r1[r0]     // Catch: java.lang.Exception -> L179
            int r2 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r2 <= 0) goto L86
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L179
            double r1 = (double) r1     // Catch: java.lang.Exception -> L179
            double r11 = r14.f66l     // Catch: java.lang.Exception -> L179
            int r13 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r13 < 0) goto L86
            return r10
        L2f:
            java.lang.String r1 = r14.f69o     // Catch: java.lang.Exception -> L179
            boolean r1 = r5.equals(r1)     // Catch: java.lang.Exception -> L179
            if (r1 == 0) goto L4b
            float[] r1 = r14.i     // Catch: java.lang.Exception -> L179
            r1 = r1[r0]     // Catch: java.lang.Exception -> L179
            int r2 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r2 >= 0) goto L86
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L179
            double r1 = (double) r1     // Catch: java.lang.Exception -> L179
            double r11 = r14.f66l     // Catch: java.lang.Exception -> L179
            int r13 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r13 < 0) goto L86
            return r10
        L4b:
            java.lang.String r1 = r14.f69o     // Catch: java.lang.Exception -> L179
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Exception -> L179
            if (r1 == 0) goto L63
            float[] r1 = r14.i     // Catch: java.lang.Exception -> L179
            r1 = r1[r0]     // Catch: java.lang.Exception -> L179
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L179
            double r1 = (double) r1     // Catch: java.lang.Exception -> L179
            double r11 = r14.f66l     // Catch: java.lang.Exception -> L179
            int r13 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r13 < 0) goto L86
            return r10
        L63:
            java.lang.String r1 = r14.f69o     // Catch: java.lang.Exception -> L179
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Exception -> L179
            if (r1 == 0) goto L86
            float r1 = r14.f80z     // Catch: java.lang.Exception -> L179
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L179
            double r1 = (double) r1     // Catch: java.lang.Exception -> L179
            double r11 = r14.f66l     // Catch: java.lang.Exception -> L179
            int r13 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r13 < 0) goto L86
            float r1 = r14.C     // Catch: java.lang.Exception -> L179
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L179
            double r1 = (double) r1     // Catch: java.lang.Exception -> L179
            double r11 = r14.f66l     // Catch: java.lang.Exception -> L179
            int r13 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r13 <= 0) goto L86
            return r10
        L86:
            double r1 = r14.f67m     // Catch: java.lang.Exception -> L179
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 <= 0) goto Lff
            java.lang.String r1 = r14.f70p     // Catch: java.lang.Exception -> L179
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Exception -> L179
            if (r1 == 0) goto La8
            float[] r1 = r14.i     // Catch: java.lang.Exception -> L179
            r1 = r1[r10]     // Catch: java.lang.Exception -> L179
            int r2 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r2 >= 0) goto Lff
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L179
            double r1 = (double) r1     // Catch: java.lang.Exception -> L179
            double r11 = r14.f67m     // Catch: java.lang.Exception -> L179
            int r13 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r13 < 0) goto Lff
            return r10
        La8:
            java.lang.String r1 = r14.f70p     // Catch: java.lang.Exception -> L179
            boolean r1 = r5.equals(r1)     // Catch: java.lang.Exception -> L179
            if (r1 == 0) goto Lc4
            float[] r1 = r14.i     // Catch: java.lang.Exception -> L179
            r1 = r1[r10]     // Catch: java.lang.Exception -> L179
            int r2 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r2 <= 0) goto Lff
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L179
            double r1 = (double) r1     // Catch: java.lang.Exception -> L179
            double r11 = r14.f67m     // Catch: java.lang.Exception -> L179
            int r13 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r13 < 0) goto Lff
            return r10
        Lc4:
            java.lang.String r1 = r14.f70p     // Catch: java.lang.Exception -> L179
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Exception -> L179
            if (r1 == 0) goto Ldc
            float[] r1 = r14.i     // Catch: java.lang.Exception -> L179
            r1 = r1[r10]     // Catch: java.lang.Exception -> L179
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L179
            double r1 = (double) r1     // Catch: java.lang.Exception -> L179
            double r11 = r14.f67m     // Catch: java.lang.Exception -> L179
            int r13 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r13 < 0) goto Lff
            return r10
        Ldc:
            java.lang.String r1 = r14.f70p     // Catch: java.lang.Exception -> L179
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Exception -> L179
            if (r1 == 0) goto Lff
            float r1 = r14.A     // Catch: java.lang.Exception -> L179
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L179
            double r1 = (double) r1     // Catch: java.lang.Exception -> L179
            double r11 = r14.f67m     // Catch: java.lang.Exception -> L179
            int r13 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r13 < 0) goto Lff
            float r1 = r14.D     // Catch: java.lang.Exception -> L179
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L179
            double r1 = (double) r1     // Catch: java.lang.Exception -> L179
            double r11 = r14.f67m     // Catch: java.lang.Exception -> L179
            int r13 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r13 <= 0) goto Lff
            return r10
        Lff:
            double r1 = r14.f68n     // Catch: java.lang.Exception -> L179
            int r11 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r11 <= 0) goto L179
            java.lang.String r1 = r14.f71q     // Catch: java.lang.Exception -> L179
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Exception -> L179
            r2 = 2
            if (r1 == 0) goto L122
            float[] r1 = r14.i     // Catch: java.lang.Exception -> L179
            r1 = r1[r2]     // Catch: java.lang.Exception -> L179
            int r2 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r2 <= 0) goto L179
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L179
            double r1 = (double) r1     // Catch: java.lang.Exception -> L179
            double r3 = r14.f68n     // Catch: java.lang.Exception -> L179
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L179
            return r10
        L122:
            java.lang.String r1 = r14.f71q     // Catch: java.lang.Exception -> L179
            boolean r1 = r5.equals(r1)     // Catch: java.lang.Exception -> L179
            if (r1 == 0) goto L13e
            float[] r1 = r14.i     // Catch: java.lang.Exception -> L179
            r1 = r1[r2]     // Catch: java.lang.Exception -> L179
            int r2 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r2 >= 0) goto L179
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L179
            double r1 = (double) r1     // Catch: java.lang.Exception -> L179
            double r3 = r14.f68n     // Catch: java.lang.Exception -> L179
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L179
            return r10
        L13e:
            java.lang.String r1 = r14.f71q     // Catch: java.lang.Exception -> L179
            boolean r1 = r4.equals(r1)     // Catch: java.lang.Exception -> L179
            if (r1 == 0) goto L156
            float[] r1 = r14.i     // Catch: java.lang.Exception -> L179
            r1 = r1[r2]     // Catch: java.lang.Exception -> L179
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L179
            double r1 = (double) r1     // Catch: java.lang.Exception -> L179
            double r3 = r14.f68n     // Catch: java.lang.Exception -> L179
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L179
            return r10
        L156:
            java.lang.String r1 = r14.f71q     // Catch: java.lang.Exception -> L179
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Exception -> L179
            if (r1 == 0) goto L179
            float r1 = r14.B     // Catch: java.lang.Exception -> L179
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L179
            double r1 = (double) r1     // Catch: java.lang.Exception -> L179
            double r3 = r14.f68n     // Catch: java.lang.Exception -> L179
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L179
            float r1 = r14.E     // Catch: java.lang.Exception -> L179
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L179
            double r1 = (double) r1     // Catch: java.lang.Exception -> L179
            double r3 = r14.f68n     // Catch: java.lang.Exception -> L179
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L179
            return r10
        L179:
            return r0
    }

    private void f() {
            r4 = this;
            com.beizi.fusion.tool.r$a r0 = r4.f76v     // Catch: java.lang.Exception -> L3c
            if (r0 != 0) goto L5
            goto L3c
        L5:
            boolean r0 = r4.f77w     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto La
            goto L3c
        La:
            com.beizi.fusion.widget.EulerAngleView r0 = r4.f75u     // Catch: java.lang.Exception -> L3c
            boolean r0 = com.beizi.fusion.tool.ar.b(r0)     // Catch: java.lang.Exception -> L3c
            if (r0 != 0) goto L13
            goto L3c
        L13:
            r0 = 1
            r4.f77w = r0     // Catch: java.lang.Exception -> L3c
            boolean r0 = r4.f72r     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto L2d
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r0 = r4.f     // Catch: java.lang.Exception -> L3c
            if (r0 == 0) goto L2d
            android.content.Context r0 = r4.a     // Catch: java.lang.Exception -> L3c
            java.lang.String r1 = r4.f78x     // Catch: java.lang.Exception -> L3c
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L3c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L3c
            com.beizi.fusion.tool.an.a(r0, r1, r2)     // Catch: java.lang.Exception -> L3c
        L2d:
            com.beizi.fusion.tool.r$a r0 = r4.f76v     // Catch: java.lang.Exception -> L3c
            r0.a()     // Catch: java.lang.Exception -> L3c
            r4.b()     // Catch: java.lang.Exception -> L3c
            java.lang.String r0 = "ShakeUtil"
            java.lang.String r1 = "onEulerAngleHappened"
            com.beizi.fusion.tool.aa.a(r0, r1)     // Catch: java.lang.Exception -> L3c
        L3c:
            return
    }

    public void a() {
            r4 = this;
            android.hardware.SensorManager r0 = com.beizi.fusion.tool.r.j     // Catch: java.lang.Exception -> L15
            if (r0 == 0) goto L15
            r1 = 4
            android.hardware.Sensor r0 = r0.getDefaultSensor(r1)     // Catch: java.lang.Exception -> L15
            r4.k = r0     // Catch: java.lang.Exception -> L15
            if (r0 == 0) goto L15
            android.hardware.SensorManager r1 = com.beizi.fusion.tool.r.j     // Catch: java.lang.Exception -> L15
            android.hardware.SensorEventListener r2 = r4.F     // Catch: java.lang.Exception -> L15
            r3 = 1
            r1.registerListener(r2, r0, r3)     // Catch: java.lang.Exception -> L15
        L15:
            return
    }

    public void a(android.view.ViewGroup r11, int r12, int r13) {
            r10 = this;
            java.lang.String r0 = "%"
            android.content.Context r1 = r10.a     // Catch: java.lang.NumberFormatException -> L1b0
            if (r1 == 0) goto L1b0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleRenderBean r1 = r10.g     // Catch: java.lang.NumberFormatException -> L1b0
            if (r1 == 0) goto L1b0
            if (r11 != 0) goto Le
            goto L1b0
        Le:
            if (r1 == 0) goto L27
            java.lang.String r1 = r1.getCenterX()     // Catch: java.lang.NumberFormatException -> L1b0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleRenderBean r2 = r10.g     // Catch: java.lang.NumberFormatException -> L1b0
            java.lang.String r2 = r2.getCenterY()     // Catch: java.lang.NumberFormatException -> L1b0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleRenderBean r3 = r10.g     // Catch: java.lang.NumberFormatException -> L1b0
            java.lang.String r3 = r3.getWidth()     // Catch: java.lang.NumberFormatException -> L1b0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleRenderBean r4 = r10.g     // Catch: java.lang.NumberFormatException -> L1b0
            java.lang.String r4 = r4.getHeight()     // Catch: java.lang.NumberFormatException -> L1b0
            goto L2b
        L27:
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L2b:
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.NumberFormatException -> L1b0
            java.lang.String r6 = "0"
            if (r5 != 0) goto L39
            boolean r5 = r6.equals(r1)     // Catch: java.lang.NumberFormatException -> L1b0
            if (r5 == 0) goto L3b
        L39:
            java.lang.String r1 = "85%"
        L3b:
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.NumberFormatException -> L1b0
            if (r5 != 0) goto L47
            boolean r5 = r6.equals(r2)     // Catch: java.lang.NumberFormatException -> L1b0
            if (r5 == 0) goto L49
        L47:
            java.lang.String r2 = "50%"
        L49:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.NumberFormatException -> L1b0
            java.lang.String r7 = "120"
            if (r5 != 0) goto L57
            boolean r5 = r6.equals(r3)     // Catch: java.lang.NumberFormatException -> L1b0
            if (r5 == 0) goto L58
        L57:
            r3 = r7
        L58:
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.NumberFormatException -> L1b0
            if (r5 != 0) goto L64
            boolean r5 = r6.equals(r4)     // Catch: java.lang.NumberFormatException -> L1b0
            if (r5 == 0) goto L65
        L64:
            r4 = r7
        L65:
            android.content.Context r5 = r10.a     // Catch: java.lang.NumberFormatException -> L1b0
            float r5 = com.beizi.fusion.tool.ap.i(r5)     // Catch: java.lang.NumberFormatException -> L1b0
            boolean r6 = r1.endsWith(r0)     // Catch: java.lang.NumberFormatException -> L1b0
            r7 = 100
            r8 = 0
            if (r6 == 0) goto L84
            int r6 = r1.indexOf(r0)     // Catch: java.lang.NumberFormatException -> L1b0
            java.lang.String r1 = r1.substring(r8, r6)     // Catch: java.lang.NumberFormatException -> L1b0
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L1b0
            int r1 = r1 * r12
            int r1 = r1 / r7
            goto L88
        L84:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L1b0
        L88:
            boolean r6 = r2.endsWith(r0)     // Catch: java.lang.NumberFormatException -> L1b0
            if (r6 == 0) goto L9e
            int r6 = r2.indexOf(r0)     // Catch: java.lang.NumberFormatException -> L1b0
            java.lang.String r2 = r2.substring(r8, r6)     // Catch: java.lang.NumberFormatException -> L1b0
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L1b0
            int r2 = r2 * r13
            int r2 = r2 / r7
            goto La2
        L9e:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L1b0
        La2:
            boolean r6 = r3.endsWith(r0)     // Catch: java.lang.NumberFormatException -> L1b0
            if (r6 == 0) goto Lb9
            int r6 = r3.indexOf(r0)     // Catch: java.lang.NumberFormatException -> L1b0
            java.lang.String r3 = r3.substring(r8, r6)     // Catch: java.lang.NumberFormatException -> L1b0
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L1b0
            int r5 = (int) r5     // Catch: java.lang.NumberFormatException -> L1b0
            int r5 = r5 * r3
            int r5 = r5 / r7
            goto Lbd
        Lb9:
            int r5 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L1b0
        Lbd:
            boolean r3 = r4.endsWith(r0)     // Catch: java.lang.NumberFormatException -> L1b0
            if (r3 == 0) goto Ld3
            int r0 = r4.indexOf(r0)     // Catch: java.lang.NumberFormatException -> L1b0
            java.lang.String r0 = r4.substring(r8, r0)     // Catch: java.lang.NumberFormatException -> L1b0
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L1b0
            int r0 = r0 * r5
            int r0 = r0 / r7
            goto Ld7
        Ld3:
            int r0 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L1b0
        Ld7:
            if (r5 != 0) goto Ldb
            r5 = 100
        Ldb:
            if (r0 != 0) goto Lde
            goto Ldf
        Lde:
            r7 = r0
        Ldf:
            if (r2 != 0) goto Lea
            android.content.Context r0 = r10.a     // Catch: java.lang.NumberFormatException -> L1b0
            float r2 = (float) r13     // Catch: java.lang.NumberFormatException -> L1b0
            int r0 = com.beizi.fusion.tool.ap.a(r0, r2)     // Catch: java.lang.NumberFormatException -> L1b0
            int r2 = r0 / 2
        Lea:
            if (r1 != 0) goto Lf5
            android.content.Context r0 = r10.a     // Catch: java.lang.NumberFormatException -> L1b0
            float r1 = (float) r12     // Catch: java.lang.NumberFormatException -> L1b0
            int r0 = com.beizi.fusion.tool.ap.a(r0, r1)     // Catch: java.lang.NumberFormatException -> L1b0
            int r1 = r0 / 2
        Lf5:
            android.content.Context r0 = r10.a     // Catch: java.lang.NumberFormatException -> L1b0
            float r3 = (float) r5     // Catch: java.lang.NumberFormatException -> L1b0
            int r0 = com.beizi.fusion.tool.ap.a(r0, r3)     // Catch: java.lang.NumberFormatException -> L1b0
            android.content.Context r3 = r10.a     // Catch: java.lang.NumberFormatException -> L1b0
            float r4 = (float) r7     // Catch: java.lang.NumberFormatException -> L1b0
            int r3 = com.beizi.fusion.tool.ap.a(r3, r4)     // Catch: java.lang.NumberFormatException -> L1b0
            android.content.Context r4 = r10.a     // Catch: java.lang.NumberFormatException -> L1b0
            float r1 = (float) r1     // Catch: java.lang.NumberFormatException -> L1b0
            int r1 = com.beizi.fusion.tool.ap.a(r4, r1)     // Catch: java.lang.NumberFormatException -> L1b0
            android.content.Context r4 = r10.a     // Catch: java.lang.NumberFormatException -> L1b0
            float r2 = (float) r2     // Catch: java.lang.NumberFormatException -> L1b0
            int r2 = com.beizi.fusion.tool.ap.a(r4, r2)     // Catch: java.lang.NumberFormatException -> L1b0
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.NumberFormatException -> L1b0
            r5 = -2
            r4.<init>(r5, r5)     // Catch: java.lang.NumberFormatException -> L1b0
            com.beizi.fusion.widget.EulerAngleView r5 = new com.beizi.fusion.widget.EulerAngleView     // Catch: java.lang.NumberFormatException -> L1b0
            android.content.Context r6 = r10.a     // Catch: java.lang.NumberFormatException -> L1b0
            r5.<init>(r6)     // Catch: java.lang.NumberFormatException -> L1b0
            r10.f75u = r5     // Catch: java.lang.NumberFormatException -> L1b0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r6 = r10.d     // Catch: java.lang.NumberFormatException -> L1b0
            r5.setEulerAngleViewRuleBean(r6)     // Catch: java.lang.NumberFormatException -> L1b0
            com.beizi.fusion.widget.EulerAngleView r5 = r10.f75u     // Catch: java.lang.NumberFormatException -> L1b0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleRenderBean r6 = r10.g     // Catch: java.lang.NumberFormatException -> L1b0
            r5.setEulerAngleRenderBean(r6)     // Catch: java.lang.NumberFormatException -> L1b0
            com.beizi.fusion.widget.EulerAngleView r5 = r10.f75u     // Catch: java.lang.NumberFormatException -> L1b0
            r5.setAnimationViewWidthAndHeight(r0, r3)     // Catch: java.lang.NumberFormatException -> L1b0
            com.beizi.fusion.widget.EulerAngleView r5 = r10.f75u     // Catch: java.lang.NumberFormatException -> L1b0
            java.lang.Boolean r6 = r10.f79y     // Catch: java.lang.NumberFormatException -> L1b0
            r5.setDownloadApp(r6)     // Catch: java.lang.NumberFormatException -> L1b0
            com.beizi.fusion.widget.EulerAngleView r5 = r10.f75u     // Catch: java.lang.NumberFormatException -> L1b0
            r5.buildEulerAngleView()     // Catch: java.lang.NumberFormatException -> L1b0
            com.beizi.fusion.widget.EulerAngleView r5 = r10.f75u     // Catch: java.lang.NumberFormatException -> L1b0
            r5.measure(r8, r8)     // Catch: java.lang.NumberFormatException -> L1b0
            com.beizi.fusion.widget.EulerAngleView r5 = r10.f75u     // Catch: java.lang.NumberFormatException -> L1b0
            int r5 = r5.getMeasuredWidth()     // Catch: java.lang.NumberFormatException -> L1b0
            com.beizi.fusion.widget.EulerAngleView r6 = r10.f75u     // Catch: java.lang.NumberFormatException -> L1b0
            int r6 = r6.getMeasuredHeight()     // Catch: java.lang.NumberFormatException -> L1b0
            java.lang.String r7 = "BeiZis"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L1b0
            r8.<init>()     // Catch: java.lang.NumberFormatException -> L1b0
            java.lang.String r9 = "centerYInt = "
            r8.append(r9)     // Catch: java.lang.NumberFormatException -> L1b0
            r8.append(r2)     // Catch: java.lang.NumberFormatException -> L1b0
            java.lang.String r9 = ",centerXInt = "
            r8.append(r9)     // Catch: java.lang.NumberFormatException -> L1b0
            r8.append(r1)     // Catch: java.lang.NumberFormatException -> L1b0
            java.lang.String r9 = ",adWidthDp = "
            r8.append(r9)     // Catch: java.lang.NumberFormatException -> L1b0
            r8.append(r12)     // Catch: java.lang.NumberFormatException -> L1b0
            java.lang.String r12 = ",adHeightDp = "
            r8.append(r12)     // Catch: java.lang.NumberFormatException -> L1b0
            r8.append(r13)     // Catch: java.lang.NumberFormatException -> L1b0
            java.lang.String r12 = ",widthInt = "
            r8.append(r12)     // Catch: java.lang.NumberFormatException -> L1b0
            r8.append(r0)     // Catch: java.lang.NumberFormatException -> L1b0
            java.lang.String r12 = ",heightInt = "
            r8.append(r12)     // Catch: java.lang.NumberFormatException -> L1b0
            r8.append(r3)     // Catch: java.lang.NumberFormatException -> L1b0
            java.lang.String r12 = ",viewWidth = "
            r8.append(r12)     // Catch: java.lang.NumberFormatException -> L1b0
            r8.append(r5)     // Catch: java.lang.NumberFormatException -> L1b0
            java.lang.String r12 = ",viewHeight = "
            r8.append(r12)     // Catch: java.lang.NumberFormatException -> L1b0
            r8.append(r6)     // Catch: java.lang.NumberFormatException -> L1b0
            java.lang.String r12 = r8.toString()     // Catch: java.lang.NumberFormatException -> L1b0
            com.beizi.fusion.tool.aa.a(r7, r12)     // Catch: java.lang.NumberFormatException -> L1b0
            int r6 = r6 / 2
            int r2 = r2 - r6
            r4.topMargin = r2     // Catch: java.lang.NumberFormatException -> L1b0
            int r5 = r5 / 2
            int r1 = r1 - r5
            r4.leftMargin = r1     // Catch: java.lang.NumberFormatException -> L1b0
            com.beizi.fusion.widget.EulerAngleView r12 = r10.f75u     // Catch: java.lang.NumberFormatException -> L1b0
            r11.addView(r12, r4)     // Catch: java.lang.NumberFormatException -> L1b0
            com.beizi.fusion.widget.EulerAngleView r11 = r10.f75u     // Catch: java.lang.NumberFormatException -> L1b0
            r11.startContinuousRotations()     // Catch: java.lang.NumberFormatException -> L1b0
        L1b0:
            return
    }

    public void a(com.beizi.fusion.tool.r.a r1) {
            r0 = this;
            r0.f76v = r1
            return
    }

    public void a(java.lang.Boolean r1) {
            r0 = this;
            r0.f79y = r1
            return
    }

    public void b() {
            r2 = this;
            java.lang.String r0 = "BeiZis"
            java.lang.String r1 = "enter unRegisterListener"
            com.beizi.fusion.tool.aa.a(r0, r1)     // Catch: java.lang.Exception -> L1e
            android.hardware.SensorManager r0 = com.beizi.fusion.tool.r.j     // Catch: java.lang.Exception -> L1e
            if (r0 == 0) goto L10
            android.hardware.SensorEventListener r1 = r2.F     // Catch: java.lang.Exception -> L1e
            r0.unregisterListener(r1)     // Catch: java.lang.Exception -> L1e
        L10:
            com.beizi.fusion.widget.EulerAngleView r0 = r2.f75u     // Catch: java.lang.Exception -> L1e
            if (r0 == 0) goto L17
            r0.onDestroy()     // Catch: java.lang.Exception -> L1e
        L17:
            r0 = 0
            r2.f75u = r0     // Catch: java.lang.Exception -> L1e
            r2.a = r0     // Catch: java.lang.Exception -> L1e
            r2.f76v = r0     // Catch: java.lang.Exception -> L1e
        L1e:
            return
    }
}
