package com.beizi.ad.a.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    private static final java.lang.String f6444g = "a";
    private static android.hardware.SensorManager q;
    private float A;
    private com.beizi.ad.a.a.a.InterfaceC0099a B;
    private boolean C;
    private boolean D;
    private java.lang.String E;
    private int F;
    private float G;
    private float H;
    private float I;
    private android.animation.AnimatorSet J;
    private boolean K;
    private java.lang.String L;
    private float M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private android.hardware.SensorEventListener S;
    java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    java.lang.String f6445b;

    /* renamed from: c, reason: collision with root package name */
    java.lang.String f6446c;

    /* renamed from: d, reason: collision with root package name */
    java.lang.String f6447d;

    /* renamed from: e, reason: collision with root package name */
    java.lang.String f6448e;

    /* renamed from: f, reason: collision with root package name */
    java.lang.String f6449f;

    /* renamed from: h, reason: collision with root package name */
    private android.content.Context f6450h;

    /* renamed from: i, reason: collision with root package name */
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewBean f6451i;

    /* renamed from: j, reason: collision with root package name */
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewBean f6452j;

    /* renamed from: k, reason: collision with root package name */
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewRuleBean f6453k;
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewRuleBean l;
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewRuleBean m;
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleRenderBean n;
    private float o;
    private float[] p;
    private android.hardware.Sensor r;
    private double s;
    private double t;
    private double u;
    private java.lang.String v;
    private java.lang.String w;
    private java.lang.String x;
    private boolean y;
    private int z;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.a.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0099a {
        void a();
    }

    static {
            return
    }

    public a(android.content.Context r4, com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleViewBean r5, java.lang.String r6, java.lang.String r7) {
            r3 = this;
            r3.<init>()
            r0 = 814313567(0x3089705f, float:1.0E-9)
            r3.o = r0
            r0 = 3
            float[] r0 = new float[r0]
            r3.p = r0
            r0 = 0
            r3.s = r0
            r3.t = r0
            r3.u = r0
            r0 = 0
            r3.y = r0
            r3.z = r0
            r1 = 1
            r3.C = r1
            r3.D = r0
            r2 = 0
            r3.E = r2
            java.lang.String r2 = "x"
            r3.a = r2
            java.lang.String r2 = "y"
            r3.f6445b = r2
            java.lang.String r2 = "z"
            r3.f6446c = r2
            java.lang.String r2 = "0"
            r3.f6447d = r2
            java.lang.String r2 = "1"
            r3.f6448e = r2
            java.lang.String r2 = "2"
            r3.f6449f = r2
            r2 = 350(0x15e, float:4.9E-43)
            r3.F = r2
            r2 = 1114636288(0x42700000, float:60.0)
            r3.G = r2
            r3.H = r2
            r2 = 1106247680(0x41f00000, float:30.0)
            r3.I = r2
            r3.K = r0
            com.beizi.ad.a.a.a$4 r2 = new com.beizi.ad.a.a.a$4
            r2.<init>(r3)
            r3.S = r2
            r3.f6450h = r4
            r3.f6451i = r5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "beizi_cool_"
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.E = r4
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewBean r4 = r3.f6451i
            java.util.List r4 = r4.getOrderData()
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataEulerAngleViewBean r4 = r3.a(r4, r7)
            if (r4 == 0) goto L80
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewBean r5 = r4.getEulerAngleRule()
            if (r5 == 0) goto L80
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewBean r4 = r4.getEulerAngleRule()
            r3.f6452j = r4
        L80:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewBean r4 = r3.f6451i
            if (r4 == 0) goto L8a
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r4 = r4.getCoolRule()
            r3.m = r4
        L8a:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewBean r4 = r3.f6452j
            if (r4 == 0) goto L9d
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r4 = r4.getNomalRule()
            r3.l = r4
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewBean r4 = r3.f6452j
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleRenderBean r4 = r4.getRender()
            r3.n = r4
            goto Laf
        L9d:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewBean r4 = r3.f6451i
            if (r4 == 0) goto Laf
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r4 = r4.getNomalRule()
            r3.l = r4
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewBean r4 = r3.f6451i
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleRenderBean r4 = r4.getRender()
            r3.n = r4
        Laf:
            boolean r4 = r3.e()
            if (r4 != 0) goto Lb8
            r3.K = r0
            return
        Lb8:
            r3.K = r1
            r3.f()
            r3.l()
            return
    }

    static /* synthetic */ double a(com.beizi.ad.a.a.a r0, double r1) {
            r0.s = r1
            return r1
    }

    static /* synthetic */ float a(com.beizi.ad.a.a.a r0, float r1) {
            r0.A = r1
            return r1
    }

    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataEulerAngleViewBean a(java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataEulerAngleViewBean> r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L23
            if (r5 != 0) goto L6
            goto L23
        L6:
            java.util.Iterator r4 = r4.iterator()
        La:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r4.next()
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataEulerAngleViewBean r1 = (com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataEulerAngleViewBean) r1
            java.util.List r2 = r1.getOrderList()
            if (r2 == 0) goto La
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto La
            return r1
        L23:
            return r0
    }

    private void a(android.hardware.SensorEvent r15) {
            r14 = this;
            java.lang.String r0 = "%.4f"
            if (r15 == 0) goto L12a
            boolean r1 = r14.C     // Catch: java.lang.Exception -> L12a
            if (r1 != 0) goto La
            goto L12a
        La:
            android.hardware.Sensor r1 = r15.sensor     // Catch: java.lang.Exception -> L12a
            float[] r2 = r15.values     // Catch: java.lang.Exception -> L12a
            int r1 = r1.getType()     // Catch: java.lang.Exception -> L12a
            if (r2 == 0) goto L12a
            r3 = 4
            if (r1 == r3) goto L19
            goto L12a
        L19:
            float r1 = r14.A     // Catch: java.lang.Exception -> L12a
            r3 = 0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 == 0) goto L125
            r4 = 0
            r5 = r2[r4]     // Catch: java.lang.Exception -> L12a
            r6 = 1
            r7 = r2[r6]     // Catch: java.lang.Exception -> L12a
            r8 = 2
            r2 = r2[r8]     // Catch: java.lang.Exception -> L12a
            long r9 = r15.timestamp     // Catch: java.lang.Exception -> L12a
            float r9 = (float) r9     // Catch: java.lang.Exception -> L12a
            float r9 = r9 - r1
            float r1 = r14.o     // Catch: java.lang.Exception -> L12a
            float r9 = r9 * r1
            float[] r1 = r14.p     // Catch: java.lang.Exception -> L12a
            r10 = r1[r4]     // Catch: java.lang.Exception -> L12a
            double r10 = (double) r10     // Catch: java.lang.Exception -> L12a
            float r5 = r5 * r9
            double r12 = (double) r5     // Catch: java.lang.Exception -> L12a
            double r12 = java.lang.Math.toDegrees(r12)     // Catch: java.lang.Exception -> L12a
            double r10 = r10 + r12
            float r5 = (float) r10     // Catch: java.lang.Exception -> L12a
            r1[r4] = r5     // Catch: java.lang.Exception -> L12a
            float[] r1 = r14.p     // Catch: java.lang.Exception -> L12a
            r5 = r1[r6]     // Catch: java.lang.Exception -> L12a
            double r10 = (double) r5     // Catch: java.lang.Exception -> L12a
            float r7 = r7 * r9
            double r12 = (double) r7     // Catch: java.lang.Exception -> L12a
            double r12 = java.lang.Math.toDegrees(r12)     // Catch: java.lang.Exception -> L12a
            double r10 = r10 + r12
            float r5 = (float) r10     // Catch: java.lang.Exception -> L12a
            r1[r6] = r5     // Catch: java.lang.Exception -> L12a
            float[] r1 = r14.p     // Catch: java.lang.Exception -> L12a
            r5 = r1[r8]     // Catch: java.lang.Exception -> L12a
            double r10 = (double) r5     // Catch: java.lang.Exception -> L12a
            float r2 = r2 * r9
            double r12 = (double) r2     // Catch: java.lang.Exception -> L12a
            double r12 = java.lang.Math.toDegrees(r12)     // Catch: java.lang.Exception -> L12a
            double r10 = r10 + r12
            float r2 = (float) r10     // Catch: java.lang.Exception -> L12a
            r1[r8] = r2     // Catch: java.lang.Exception -> L12a
            float[] r1 = r14.p     // Catch: java.lang.Exception -> L12a
            r2 = r1[r4]     // Catch: java.lang.Exception -> L12a
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 <= 0) goto L72
            float r5 = r14.P     // Catch: java.lang.Exception -> L12a
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L7a
            r14.P = r2     // Catch: java.lang.Exception -> L12a
            goto L7a
        L72:
            float r5 = r14.M     // Catch: java.lang.Exception -> L12a
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L7a
            r14.M = r2     // Catch: java.lang.Exception -> L12a
        L7a:
            r2 = r1[r6]     // Catch: java.lang.Exception -> L12a
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 <= 0) goto L89
            float r5 = r14.Q     // Catch: java.lang.Exception -> L12a
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L91
            r14.Q = r2     // Catch: java.lang.Exception -> L12a
            goto L91
        L89:
            float r5 = r14.N     // Catch: java.lang.Exception -> L12a
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L91
            r14.N = r2     // Catch: java.lang.Exception -> L12a
        L91:
            r1 = r1[r8]     // Catch: java.lang.Exception -> L12a
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 <= 0) goto La0
            float r2 = r14.R     // Catch: java.lang.Exception -> L12a
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto La8
            r14.R = r1     // Catch: java.lang.Exception -> L12a
            goto La8
        La0:
            float r2 = r14.O     // Catch: java.lang.Exception -> L12a
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto La8
            r14.O = r1     // Catch: java.lang.Exception -> L12a
        La8:
            java.lang.String r1 = com.beizi.ad.a.a.a.f6444g     // Catch: java.lang.Exception -> L12a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L12a
            r2.<init>()     // Catch: java.lang.Exception -> L12a
            java.lang.String r3 = "rotate  x: "
            r2.append(r3)     // Catch: java.lang.Exception -> L12a
            float[] r3 = r14.p     // Catch: java.lang.Exception -> L12a
            r3 = r3[r4]     // Catch: java.lang.Exception -> L12a
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L12a
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L12a
            r5[r4] = r3     // Catch: java.lang.Exception -> L12a
            java.lang.String r3 = java.lang.String.format(r0, r5)     // Catch: java.lang.Exception -> L12a
            r2.append(r3)     // Catch: java.lang.Exception -> L12a
            java.lang.String r3 = ",y: "
            r2.append(r3)     // Catch: java.lang.Exception -> L12a
            float[] r3 = r14.p     // Catch: java.lang.Exception -> L12a
            r3 = r3[r6]     // Catch: java.lang.Exception -> L12a
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L12a
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L12a
            r5[r4] = r3     // Catch: java.lang.Exception -> L12a
            java.lang.String r3 = java.lang.String.format(r0, r5)     // Catch: java.lang.Exception -> L12a
            r2.append(r3)     // Catch: java.lang.Exception -> L12a
            java.lang.String r3 = ",z: "
            r2.append(r3)     // Catch: java.lang.Exception -> L12a
            float[] r3 = r14.p     // Catch: java.lang.Exception -> L12a
            r3 = r3[r8]     // Catch: java.lang.Exception -> L12a
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L12a
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L12a
            r5[r4] = r3     // Catch: java.lang.Exception -> L12a
            java.lang.String r0 = java.lang.String.format(r0, r5)     // Catch: java.lang.Exception -> L12a
            r2.append(r0)     // Catch: java.lang.Exception -> L12a
            java.lang.String r0 = ",x : "
            r2.append(r0)     // Catch: java.lang.Exception -> L12a
            double r3 = r14.s     // Catch: java.lang.Exception -> L12a
            r2.append(r3)     // Catch: java.lang.Exception -> L12a
            java.lang.String r0 = ",y : "
            r2.append(r0)     // Catch: java.lang.Exception -> L12a
            double r3 = r14.t     // Catch: java.lang.Exception -> L12a
            r2.append(r3)     // Catch: java.lang.Exception -> L12a
            java.lang.String r0 = ",z : "
            r2.append(r0)     // Catch: java.lang.Exception -> L12a
            double r3 = r14.u     // Catch: java.lang.Exception -> L12a
            r2.append(r3)     // Catch: java.lang.Exception -> L12a
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L12a
            com.beizi.ad.lance.a.m.a(r1, r0)     // Catch: java.lang.Exception -> L12a
            boolean r0 = r14.n()     // Catch: java.lang.Exception -> L12a
            if (r0 == 0) goto L125
            r14.o()     // Catch: java.lang.Exception -> L12a
        L125:
            long r0 = r15.timestamp     // Catch: java.lang.Exception -> L12a
            float r15 = (float) r0     // Catch: java.lang.Exception -> L12a
            r14.A = r15     // Catch: java.lang.Exception -> L12a
        L12a:
            return
    }

    private void a(android.widget.ImageView r3, java.util.List<android.animation.Animator> r4, java.lang.String r5, float r6, float r7) {
            r2 = this;
            r0 = 2
            float[] r0 = new float[r0]     // Catch: java.lang.Exception -> L16
            r1 = 0
            r0[r1] = r6     // Catch: java.lang.Exception -> L16
            r6 = 1
            r0[r6] = r7     // Catch: java.lang.Exception -> L16
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r3, r5, r0)     // Catch: java.lang.Exception -> L16
            int r5 = r2.F     // Catch: java.lang.Exception -> L16
            long r5 = (long) r5     // Catch: java.lang.Exception -> L16
            r3.setDuration(r5)     // Catch: java.lang.Exception -> L16
            r4.add(r3)     // Catch: java.lang.Exception -> L16
        L16:
            return
    }

    static /* synthetic */ void a(com.beizi.ad.a.a.a r0, android.hardware.SensorEvent r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ float[] a(com.beizi.ad.a.a.a r0) {
            float[] r0 = r0.p
            return r0
    }

    static /* synthetic */ double b(com.beizi.ad.a.a.a r0, double r1) {
            r0.t = r1
            return r1
    }

    static /* synthetic */ android.animation.AnimatorSet b(com.beizi.ad.a.a.a r0) {
            android.animation.AnimatorSet r0 = r0.J
            return r0
    }

    private int[] b(android.view.ViewGroup r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = ";"
            java.lang.String r3 = "%"
            r4 = 4
            int[] r4 = new int[r4]
            r8 = 0
            if (r1 == 0) goto L12
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleRenderBean r9 = r0.n     // Catch: java.lang.Exception -> L1d5
            if (r9 != 0) goto L1a
        L12:
            r16 = 3
            r17 = 2
            r18 = 1
            goto L1bd
        L1a:
            java.lang.String r9 = r9.getCenterX()     // Catch: java.lang.Exception -> L1d5
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleRenderBean r10 = r0.n     // Catch: java.lang.Exception -> L1d5
            java.lang.String r10 = r10.getCenterY()     // Catch: java.lang.Exception -> L1d5
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleRenderBean r11 = r0.n     // Catch: java.lang.Exception -> L1d5
            java.lang.String r11 = r11.getWidth()     // Catch: java.lang.Exception -> L1d5
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleRenderBean r12 = r0.n     // Catch: java.lang.Exception -> L1d5
            java.lang.String r12 = r12.getHeight()     // Catch: java.lang.Exception -> L1d5
            boolean r13 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r14 = "10"
            java.lang.String r15 = "0"
            if (r13 != 0) goto L40
            boolean r13 = r15.equals(r9)     // Catch: java.lang.Exception -> L1d5
            if (r13 == 0) goto L41
        L40:
            r9 = r14
        L41:
            boolean r13 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Exception -> L1d5
            if (r13 != 0) goto L4d
            boolean r13 = r15.equals(r10)     // Catch: java.lang.Exception -> L1d5
            if (r13 == 0) goto L4e
        L4d:
            r10 = r14
        L4e:
            r1.measure(r8, r8)     // Catch: java.lang.Exception -> L1d5
            android.content.Context r13 = r0.f6450h     // Catch: java.lang.Exception -> L1d5
            int r14 = r1.getMeasuredWidth()     // Catch: java.lang.Exception -> L1d5
            float r14 = (float) r14     // Catch: java.lang.Exception -> L1d5
            int r13 = com.beizi.ad.internal.h.u.b(r13, r14)     // Catch: java.lang.Exception -> L1d5
            android.content.Context r14 = r0.f6450h     // Catch: java.lang.Exception -> L1d5
            r16 = 3
            int r5 = r1.getMeasuredHeight()     // Catch: java.lang.Exception -> L1d5
            float r5 = (float) r5     // Catch: java.lang.Exception -> L1d5
            int r5 = com.beizi.ad.internal.h.u.b(r14, r5)     // Catch: java.lang.Exception -> L1d5
            if (r13 > 0) goto L71
            android.content.Context r13 = r0.f6450h     // Catch: java.lang.Exception -> L1d5
            int r13 = com.beizi.ad.lance.a.q.h(r13)     // Catch: java.lang.Exception -> L1d5
        L71:
            java.lang.String r14 = com.beizi.ad.a.a.a.f6444g     // Catch: java.lang.Exception -> L1d5
            r17 = 2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1d5
            r6.<init>()     // Catch: java.lang.Exception -> L1d5
            r18 = 1
            java.lang.String r7 = "position containerWidth:"
            r6.append(r7)     // Catch: java.lang.Exception -> L1d5
            r6.append(r13)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r7 = ";containerHeight:"
            r6.append(r7)     // Catch: java.lang.Exception -> L1d5
            r6.append(r5)     // Catch: java.lang.Exception -> L1d5
            r6.append(r2)     // Catch: java.lang.Exception -> L1d5
            android.view.ViewGroup$LayoutParams r7 = r1.getLayoutParams()     // Catch: java.lang.Exception -> L1d5
            int r7 = r7.width     // Catch: java.lang.Exception -> L1d5
            r6.append(r7)     // Catch: java.lang.Exception -> L1d5
            r6.append(r2)     // Catch: java.lang.Exception -> L1d5
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()     // Catch: java.lang.Exception -> L1d5
            int r1 = r1.height     // Catch: java.lang.Exception -> L1d5
            r6.append(r1)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Exception -> L1d5
            com.beizi.ad.lance.a.m.a(r14, r1)     // Catch: java.lang.Exception -> L1d5
            boolean r1 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r6 = "20"
            if (r1 != 0) goto Lb9
            boolean r1 = r15.equals(r11)     // Catch: java.lang.Exception -> L1d5
            if (r1 == 0) goto Lba
        Lb9:
            r11 = r6
        Lba:
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> L1d5
            if (r1 != 0) goto Lc6
            boolean r1 = r15.equals(r12)     // Catch: java.lang.Exception -> L1d5
            if (r1 == 0) goto Lc7
        Lc6:
            r12 = r6
        Lc7:
            boolean r1 = r9.endsWith(r3)     // Catch: java.lang.Exception -> L1d5
            if (r1 == 0) goto Lde
            int r1 = r9.indexOf(r3)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r1 = r9.substring(r8, r1)     // Catch: java.lang.Exception -> L1d5
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L1d5
            int r1 = r1 * r13
            int r1 = r1 / 100
            goto Lea
        Lde:
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Exception -> L1d5
            if (r1 != 0) goto Le9
            int r1 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Exception -> L1d5
            goto Lea
        Le9:
            r1 = 0
        Lea:
            boolean r6 = r10.endsWith(r3)     // Catch: java.lang.Exception -> L1d5
            if (r6 == 0) goto L101
            int r6 = r10.indexOf(r3)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r6 = r10.substring(r8, r6)     // Catch: java.lang.Exception -> L1d5
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> L1d5
            int r5 = r5 * r6
            int r5 = r5 / 100
            goto L10d
        L101:
            boolean r5 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Exception -> L1d5
            if (r5 != 0) goto L10c
            int r5 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.Exception -> L1d5
            goto L10d
        L10c:
            r5 = 0
        L10d:
            boolean r6 = r11.endsWith(r3)     // Catch: java.lang.Exception -> L1d5
            r7 = 20
            if (r6 == 0) goto L126
            int r6 = r11.indexOf(r3)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r6 = r11.substring(r8, r6)     // Catch: java.lang.Exception -> L1d5
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> L1d5
            int r13 = r13 * r6
            int r13 = r13 / 100
            goto L133
        L126:
            boolean r6 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Exception -> L1d5
            if (r6 != 0) goto L131
            int r13 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.Exception -> L1d5
            goto L133
        L131:
            r13 = 20
        L133:
            boolean r6 = r12.endsWith(r3)     // Catch: java.lang.Exception -> L1d5
            if (r6 == 0) goto L14a
            int r3 = r12.indexOf(r3)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r3 = r12.substring(r8, r3)     // Catch: java.lang.Exception -> L1d5
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Exception -> L1d5
            int r3 = r3 * r13
            int r7 = r3 / 100
            goto L154
        L14a:
            boolean r3 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Exception -> L1d5
            if (r3 != 0) goto L154
            int r7 = java.lang.Integer.parseInt(r12)     // Catch: java.lang.Exception -> L1d5
        L154:
            android.content.Context r3 = r0.f6450h     // Catch: java.lang.Exception -> L1d5
            float r6 = (float) r13     // Catch: java.lang.Exception -> L1d5
            int r3 = com.beizi.ad.internal.h.u.a(r3, r6)     // Catch: java.lang.Exception -> L1d5
            android.content.Context r6 = r0.f6450h     // Catch: java.lang.Exception -> L1d5
            float r7 = (float) r7     // Catch: java.lang.Exception -> L1d5
            int r6 = com.beizi.ad.internal.h.u.a(r6, r7)     // Catch: java.lang.Exception -> L1d5
            android.content.Context r7 = r0.f6450h     // Catch: java.lang.Exception -> L1d5
            float r1 = (float) r1     // Catch: java.lang.Exception -> L1d5
            int r1 = com.beizi.ad.internal.h.u.a(r7, r1)     // Catch: java.lang.Exception -> L1d5
            android.content.Context r7 = r0.f6450h     // Catch: java.lang.Exception -> L1d5
            float r5 = (float) r5     // Catch: java.lang.Exception -> L1d5
            int r5 = com.beizi.ad.internal.h.u.a(r7, r5)     // Catch: java.lang.Exception -> L1d5
            r4[r8] = r3     // Catch: java.lang.Exception -> L1d5
            r4[r18] = r6     // Catch: java.lang.Exception -> L1d5
            if (r1 <= 0) goto L178
            r4[r17] = r1     // Catch: java.lang.Exception -> L1d5
        L178:
            if (r5 <= 0) goto L17c
            r4[r16] = r5     // Catch: java.lang.Exception -> L1d5
        L17c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1d5
            r1.<init>()     // Catch: java.lang.Exception -> L1d5
            java.lang.String r3 = "position widthInt:"
            r1.append(r3)     // Catch: java.lang.Exception -> L1d5
            r3 = r4[r8]     // Catch: java.lang.Exception -> L1d5
            r1.append(r3)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r3 = ";heightInt:"
            r1.append(r3)     // Catch: java.lang.Exception -> L1d5
            r3 = r4[r18]     // Catch: java.lang.Exception -> L1d5
            r1.append(r3)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r3 = ";centerX:"
            r1.append(r3)     // Catch: java.lang.Exception -> L1d5
            r3 = r4[r17]     // Catch: java.lang.Exception -> L1d5
            r1.append(r3)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r3 = ";centerY:"
            r1.append(r3)     // Catch: java.lang.Exception -> L1d5
            r3 = r4[r16]     // Catch: java.lang.Exception -> L1d5
            r1.append(r3)     // Catch: java.lang.Exception -> L1d5
            r1.append(r2)     // Catch: java.lang.Exception -> L1d5
            r1.append(r9)     // Catch: java.lang.Exception -> L1d5
            r1.append(r2)     // Catch: java.lang.Exception -> L1d5
            r1.append(r10)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L1d5
            com.beizi.ad.lance.a.m.a(r14, r1)     // Catch: java.lang.Exception -> L1d5
            return r4
        L1bd:
            android.content.Context r1 = r0.f6450h     // Catch: java.lang.Exception -> L1d5
            r2 = 1101004800(0x41a00000, float:20.0)
            int r1 = com.beizi.ad.internal.h.u.a(r1, r2)     // Catch: java.lang.Exception -> L1d5
            android.content.Context r2 = r0.f6450h     // Catch: java.lang.Exception -> L1d5
            r3 = 1092616192(0x41200000, float:10.0)
            int r2 = com.beizi.ad.internal.h.u.a(r2, r3)     // Catch: java.lang.Exception -> L1d5
            r4[r8] = r1     // Catch: java.lang.Exception -> L1d5
            r4[r18] = r1     // Catch: java.lang.Exception -> L1d5
            r4[r17] = r2     // Catch: java.lang.Exception -> L1d5
            r4[r16] = r2     // Catch: java.lang.Exception -> L1d5
        L1d5:
            return r4
    }

    static /* synthetic */ double c(com.beizi.ad.a.a.a r0, double r1) {
            r0.u = r1
            return r1
    }

    private boolean e() {
            r7 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r0 = r7.l
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.List r0 = r0.getRules()
            if (r0 == 0) goto L3c
            int r2 = r0.size()
            if (r2 != 0) goto L13
            goto L3c
        L13:
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r0.next()
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleRuleBean r2 = (com.beizi.fusion.model.AdSpacesBean.BuyerBean.EulerAngleRuleBean) r2
            if (r2 != 0) goto L26
            goto L17
        L26:
            java.lang.String r3 = r2.getAxis()
            double r4 = r2.getAngle()
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L17
            r2 = 0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L17
            r0 = 1
            return r0
        L3c:
            return r1
    }

    private void f() {
            r2 = this;
            boolean r0 = r2.j()     // Catch: java.lang.Exception -> L30
            r1 = 0
            if (r0 != 0) goto L11
            boolean r0 = r2.i()     // Catch: java.lang.Exception -> L30
            if (r0 == 0) goto Le
            goto L11
        Le:
            r2.y = r1     // Catch: java.lang.Exception -> L30
            goto L1d
        L11:
            boolean r0 = r2.h()     // Catch: java.lang.Exception -> L30
            if (r0 == 0) goto L1b
            r0 = 1
            r2.y = r0     // Catch: java.lang.Exception -> L30
            goto L1d
        L1b:
            r2.y = r1     // Catch: java.lang.Exception -> L30
        L1d:
            boolean r0 = r2.y     // Catch: java.lang.Exception -> L30
            if (r0 == 0) goto L29
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r0 = r2.m     // Catch: java.lang.Exception -> L30
            r2.f6453k = r0     // Catch: java.lang.Exception -> L30
            r2.g()     // Catch: java.lang.Exception -> L30
            return
        L29:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r0 = r2.l     // Catch: java.lang.Exception -> L30
            r2.f6453k = r0     // Catch: java.lang.Exception -> L30
            r2.g()     // Catch: java.lang.Exception -> L30
        L30:
            return
    }

    private void g() {
            r13 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r0 = r13.f6453k     // Catch: java.lang.Exception -> Ld3
            if (r0 != 0) goto L6
            goto Ld3
        L6:
            java.util.List r0 = r0.getRules()     // Catch: java.lang.Exception -> Ld3
            if (r0 == 0) goto Ld3
            int r1 = r0.size()     // Catch: java.lang.Exception -> Ld3
            if (r1 != 0) goto L14
            goto Ld3
        L14:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r1 = r13.f6453k     // Catch: java.lang.Exception -> Ld3
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
            java.lang.String r5 = r13.a     // Catch: java.lang.Exception -> Ld3
            java.lang.String r12 = r4.getAxis()     // Catch: java.lang.Exception -> Ld3
            boolean r5 = r5.equalsIgnoreCase(r12)     // Catch: java.lang.Exception -> Ld3
            if (r5 == 0) goto L61
            if (r1 <= 0) goto L4f
            double r5 = r4.getPangle()     // Catch: java.lang.Exception -> Ld3
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L4f
            double r5 = r4.getPangle()     // Catch: java.lang.Exception -> Ld3
            r13.s = r5     // Catch: java.lang.Exception -> Ld3
            goto L55
        L4f:
            double r5 = r4.getAngle()     // Catch: java.lang.Exception -> Ld3
            r13.s = r5     // Catch: java.lang.Exception -> Ld3
        L55:
            double r5 = r4.getAngle()     // Catch: java.lang.Exception -> Ld3
            java.lang.String r4 = r4.getDirection()     // Catch: java.lang.Exception -> Ld3
            r13.v = r4     // Catch: java.lang.Exception -> Ld3
            r6 = r5
            goto L23
        L61:
            java.lang.String r5 = r13.f6445b     // Catch: java.lang.Exception -> Ld3
            java.lang.String r12 = r4.getAxis()     // Catch: java.lang.Exception -> Ld3
            boolean r5 = r5.equalsIgnoreCase(r12)     // Catch: java.lang.Exception -> Ld3
            if (r5 == 0) goto L8f
            if (r1 <= 0) goto L7e
            double r8 = r4.getPangle()     // Catch: java.lang.Exception -> Ld3
            int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r5 <= 0) goto L7e
            double r8 = r4.getPangle()     // Catch: java.lang.Exception -> Ld3
            r13.t = r8     // Catch: java.lang.Exception -> Ld3
            goto L84
        L7e:
            double r8 = r4.getAngle()     // Catch: java.lang.Exception -> Ld3
            r13.t = r8     // Catch: java.lang.Exception -> Ld3
        L84:
            double r8 = r4.getAngle()     // Catch: java.lang.Exception -> Ld3
            java.lang.String r4 = r4.getDirection()     // Catch: java.lang.Exception -> Ld3
            r13.w = r4     // Catch: java.lang.Exception -> Ld3
            goto L23
        L8f:
            java.lang.String r5 = r13.f6446c     // Catch: java.lang.Exception -> Ld3
            java.lang.String r12 = r4.getAxis()     // Catch: java.lang.Exception -> Ld3
            boolean r5 = r5.equalsIgnoreCase(r12)     // Catch: java.lang.Exception -> Ld3
            if (r5 == 0) goto L23
            if (r1 <= 0) goto Lac
            double r10 = r4.getPangle()     // Catch: java.lang.Exception -> Ld3
            int r5 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r5 <= 0) goto Lac
            double r10 = r4.getPangle()     // Catch: java.lang.Exception -> Ld3
            r13.u = r10     // Catch: java.lang.Exception -> Ld3
            goto Lb2
        Lac:
            double r10 = r4.getAngle()     // Catch: java.lang.Exception -> Ld3
            r13.u = r10     // Catch: java.lang.Exception -> Ld3
        Lb2:
            double r10 = r4.getAngle()     // Catch: java.lang.Exception -> Ld3
            java.lang.String r4 = r4.getDirection()     // Catch: java.lang.Exception -> Ld3
            r13.x = r4     // Catch: java.lang.Exception -> Ld3
            goto L23
        Lbe:
            if (r1 <= 0) goto Ld3
            int r0 = r13.a(r1)     // Catch: java.lang.Exception -> Ld3
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Exception -> Ld3
            r1.<init>()     // Catch: java.lang.Exception -> Ld3
            com.beizi.ad.a.a.a$1 r4 = new com.beizi.ad.a.a.a$1     // Catch: java.lang.Exception -> Ld3
            r5 = r13
            r4.<init>(r5, r6, r8, r10)     // Catch: java.lang.Exception -> Ld3
            long r2 = (long) r0     // Catch: java.lang.Exception -> Ld3
            r1.postDelayed(r4, r2)     // Catch: java.lang.Exception -> Ld3
        Ld3:
            return
    }

    private boolean h() {
            r2 = this;
            r0 = 0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r1 = r2.m     // Catch: java.lang.Exception -> L23
            if (r1 != 0) goto L6
            return r0
        L6:
            if (r1 == 0) goto L23
            java.util.List r1 = r1.getRules()     // Catch: java.lang.Exception -> L23
            if (r1 == 0) goto L23
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r1 = r2.m     // Catch: java.lang.Exception -> L23
            java.util.List r1 = r1.getRules()     // Catch: java.lang.Exception -> L23
            int r1 = r1.size()     // Catch: java.lang.Exception -> L23
            if (r1 <= 0) goto L23
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r1 = r2.m     // Catch: java.lang.Exception -> L23
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleStyleBean r1 = r1.getStyle()     // Catch: java.lang.Exception -> L23
            if (r1 == 0) goto L23
            r0 = 1
        L23:
            return r0
    }

    private boolean i() {
            r8 = this;
            r0 = 0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r1 = r8.m     // Catch: java.lang.Exception -> L2c
            if (r1 != 0) goto L6
            return r0
        L6:
            long r1 = r1.getCoolTime()     // Catch: java.lang.Exception -> L2c
            android.content.Context r3 = r8.f6450h     // Catch: java.lang.Exception -> L2c
            java.lang.String r4 = r8.E     // Catch: java.lang.Exception -> L2c
            r5 = 0
            java.lang.Long r7 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L2c
            java.lang.Object r3 = com.beizi.ad.internal.h.m.d(r3, r4, r7)     // Catch: java.lang.Exception -> L2c
            java.lang.Long r3 = (java.lang.Long) r3     // Catch: java.lang.Exception -> L2c
            long r3 = r3.longValue()     // Catch: java.lang.Exception -> L2c
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L2c
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L2c
            long r5 = r5 - r3
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 >= 0) goto L2c
            r0 = 1
        L2c:
            return r0
    }

    private boolean j() {
            r7 = this;
            r0 = 0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r1 = r7.m     // Catch: java.lang.Exception -> L1a
            if (r1 != 0) goto L6
            return r0
        L6:
            long r1 = r1.getUserProtectTime()     // Catch: java.lang.Exception -> L1a
            android.content.Context r3 = r7.f6450h     // Catch: java.lang.Exception -> L1a
            long r3 = com.beizi.ad.lance.a.q.a(r3)     // Catch: java.lang.Exception -> L1a
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L1a
            long r5 = r5 - r3
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 >= 0) goto L1a
            r0 = 1
        L1a:
            return r0
    }

    private void k() {
            r3 = this;
            r0 = 0
            r3.A = r0
            float[] r1 = r3.p
            r2 = 0
            r1[r2] = r0
            r2 = 1
            r1[r2] = r0
            r2 = 2
            r1[r2] = r0
            r3.M = r0
            r3.N = r0
            r3.O = r0
            r3.P = r0
            r3.Q = r0
            r3.R = r0
            return
    }

    private void l() {
            r4 = this;
            android.hardware.SensorManager r0 = com.beizi.ad.a.a.a.q     // Catch: java.lang.Exception -> L2f
            if (r0 != 0) goto L18
            android.content.Context r0 = r4.f6450h     // Catch: java.lang.Exception -> L2f
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Exception -> L2f
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = "sensor"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Exception -> L2f
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0     // Catch: java.lang.Exception -> L2f
            com.beizi.ad.a.a.a.q = r0     // Catch: java.lang.Exception -> L2f
        L18:
            android.hardware.Sensor r0 = r4.r     // Catch: java.lang.Exception -> L2f
            if (r0 != 0) goto L25
            android.hardware.SensorManager r0 = com.beizi.ad.a.a.a.q     // Catch: java.lang.Exception -> L2f
            r1 = 4
            android.hardware.Sensor r0 = r0.getDefaultSensor(r1)     // Catch: java.lang.Exception -> L2f
            r4.r = r0     // Catch: java.lang.Exception -> L2f
        L25:
            android.hardware.SensorManager r0 = com.beizi.ad.a.a.a.q     // Catch: java.lang.Exception -> L2f
            android.hardware.SensorEventListener r1 = r4.S     // Catch: java.lang.Exception -> L2f
            android.hardware.Sensor r2 = r4.r     // Catch: java.lang.Exception -> L2f
            r3 = 1
            r0.registerListener(r1, r2, r3)     // Catch: java.lang.Exception -> L2f
        L2f:
            return
    }

    private void m() {
            r2 = this;
            java.lang.String r0 = com.beizi.ad.a.a.a.f6444g     // Catch: java.lang.Exception -> L10
            java.lang.String r1 = "enter unRegisterListener"
            com.beizi.ad.lance.a.m.a(r0, r1)     // Catch: java.lang.Exception -> L10
            android.hardware.SensorManager r0 = com.beizi.ad.a.a.a.q     // Catch: java.lang.Exception -> L10
            if (r0 == 0) goto L10
            android.hardware.SensorEventListener r1 = r2.S     // Catch: java.lang.Exception -> L10
            r0.unregisterListener(r1)     // Catch: java.lang.Exception -> L10
        L10:
            return
    }

    private boolean n() {
            r11 = this;
            r0 = 0
            double r1 = r11.s     // Catch: java.lang.Exception -> L185
            java.lang.String r3 = "3"
            r4 = 0
            r6 = 0
            r7 = 1
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 <= 0) goto L86
            java.lang.String r1 = r11.f6449f     // Catch: java.lang.Exception -> L185
            java.lang.String r2 = r11.v     // Catch: java.lang.Exception -> L185
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L185
            if (r1 == 0) goto L2b
            float[] r1 = r11.p     // Catch: java.lang.Exception -> L185
            r1 = r1[r0]     // Catch: java.lang.Exception -> L185
            int r2 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r2 <= 0) goto L86
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L185
            double r1 = (double) r1     // Catch: java.lang.Exception -> L185
            double r8 = r11.s     // Catch: java.lang.Exception -> L185
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 < 0) goto L86
            return r7
        L2b:
            java.lang.String r1 = r11.f6448e     // Catch: java.lang.Exception -> L185
            java.lang.String r2 = r11.v     // Catch: java.lang.Exception -> L185
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L185
            if (r1 == 0) goto L49
            float[] r1 = r11.p     // Catch: java.lang.Exception -> L185
            r1 = r1[r0]     // Catch: java.lang.Exception -> L185
            int r2 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r2 >= 0) goto L86
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L185
            double r1 = (double) r1     // Catch: java.lang.Exception -> L185
            double r8 = r11.s     // Catch: java.lang.Exception -> L185
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 < 0) goto L86
            return r7
        L49:
            java.lang.String r1 = r11.f6447d     // Catch: java.lang.Exception -> L185
            java.lang.String r2 = r11.v     // Catch: java.lang.Exception -> L185
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L185
            if (r1 == 0) goto L63
            float[] r1 = r11.p     // Catch: java.lang.Exception -> L185
            r1 = r1[r0]     // Catch: java.lang.Exception -> L185
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L185
            double r1 = (double) r1     // Catch: java.lang.Exception -> L185
            double r8 = r11.s     // Catch: java.lang.Exception -> L185
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 < 0) goto L86
            return r7
        L63:
            java.lang.String r1 = r11.v     // Catch: java.lang.Exception -> L185
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Exception -> L185
            if (r1 == 0) goto L86
            float r1 = r11.M     // Catch: java.lang.Exception -> L185
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L185
            double r1 = (double) r1     // Catch: java.lang.Exception -> L185
            double r8 = r11.s     // Catch: java.lang.Exception -> L185
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 < 0) goto L86
            float r1 = r11.P     // Catch: java.lang.Exception -> L185
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L185
            double r1 = (double) r1     // Catch: java.lang.Exception -> L185
            double r8 = r11.s     // Catch: java.lang.Exception -> L185
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 <= 0) goto L86
            return r7
        L86:
            double r1 = r11.t     // Catch: java.lang.Exception -> L185
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 <= 0) goto L105
            java.lang.String r1 = r11.f6449f     // Catch: java.lang.Exception -> L185
            java.lang.String r2 = r11.w     // Catch: java.lang.Exception -> L185
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L185
            if (r1 == 0) goto Laa
            float[] r1 = r11.p     // Catch: java.lang.Exception -> L185
            r1 = r1[r7]     // Catch: java.lang.Exception -> L185
            int r2 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r2 >= 0) goto L105
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L185
            double r1 = (double) r1     // Catch: java.lang.Exception -> L185
            double r8 = r11.t     // Catch: java.lang.Exception -> L185
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 < 0) goto L105
            return r7
        Laa:
            java.lang.String r1 = r11.f6448e     // Catch: java.lang.Exception -> L185
            java.lang.String r2 = r11.w     // Catch: java.lang.Exception -> L185
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L185
            if (r1 == 0) goto Lc8
            float[] r1 = r11.p     // Catch: java.lang.Exception -> L185
            r1 = r1[r7]     // Catch: java.lang.Exception -> L185
            int r2 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r2 <= 0) goto L105
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L185
            double r1 = (double) r1     // Catch: java.lang.Exception -> L185
            double r8 = r11.t     // Catch: java.lang.Exception -> L185
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 < 0) goto L105
            return r7
        Lc8:
            java.lang.String r1 = r11.f6447d     // Catch: java.lang.Exception -> L185
            java.lang.String r2 = r11.w     // Catch: java.lang.Exception -> L185
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L185
            if (r1 == 0) goto Le2
            float[] r1 = r11.p     // Catch: java.lang.Exception -> L185
            r1 = r1[r7]     // Catch: java.lang.Exception -> L185
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L185
            double r1 = (double) r1     // Catch: java.lang.Exception -> L185
            double r8 = r11.t     // Catch: java.lang.Exception -> L185
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 < 0) goto L105
            return r7
        Le2:
            java.lang.String r1 = r11.w     // Catch: java.lang.Exception -> L185
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Exception -> L185
            if (r1 == 0) goto L105
            float r1 = r11.N     // Catch: java.lang.Exception -> L185
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L185
            double r1 = (double) r1     // Catch: java.lang.Exception -> L185
            double r8 = r11.t     // Catch: java.lang.Exception -> L185
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 < 0) goto L105
            float r1 = r11.Q     // Catch: java.lang.Exception -> L185
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L185
            double r1 = (double) r1     // Catch: java.lang.Exception -> L185
            double r8 = r11.t     // Catch: java.lang.Exception -> L185
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 <= 0) goto L105
            return r7
        L105:
            double r1 = r11.u     // Catch: java.lang.Exception -> L185
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 <= 0) goto L185
            java.lang.String r1 = r11.f6449f     // Catch: java.lang.Exception -> L185
            java.lang.String r2 = r11.x     // Catch: java.lang.Exception -> L185
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L185
            r2 = 2
            if (r1 == 0) goto L12a
            float[] r1 = r11.p     // Catch: java.lang.Exception -> L185
            r1 = r1[r2]     // Catch: java.lang.Exception -> L185
            int r2 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r2 <= 0) goto L185
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L185
            double r1 = (double) r1     // Catch: java.lang.Exception -> L185
            double r3 = r11.u     // Catch: java.lang.Exception -> L185
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L185
            return r7
        L12a:
            java.lang.String r1 = r11.f6448e     // Catch: java.lang.Exception -> L185
            java.lang.String r4 = r11.x     // Catch: java.lang.Exception -> L185
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Exception -> L185
            if (r1 == 0) goto L148
            float[] r1 = r11.p     // Catch: java.lang.Exception -> L185
            r1 = r1[r2]     // Catch: java.lang.Exception -> L185
            int r2 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r2 >= 0) goto L185
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L185
            double r1 = (double) r1     // Catch: java.lang.Exception -> L185
            double r3 = r11.u     // Catch: java.lang.Exception -> L185
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L185
            return r7
        L148:
            java.lang.String r1 = r11.f6447d     // Catch: java.lang.Exception -> L185
            java.lang.String r4 = r11.x     // Catch: java.lang.Exception -> L185
            boolean r1 = r1.equals(r4)     // Catch: java.lang.Exception -> L185
            if (r1 == 0) goto L162
            float[] r1 = r11.p     // Catch: java.lang.Exception -> L185
            r1 = r1[r2]     // Catch: java.lang.Exception -> L185
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L185
            double r1 = (double) r1     // Catch: java.lang.Exception -> L185
            double r3 = r11.u     // Catch: java.lang.Exception -> L185
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L185
            return r7
        L162:
            java.lang.String r1 = r11.x     // Catch: java.lang.Exception -> L185
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Exception -> L185
            if (r1 == 0) goto L185
            float r1 = r11.O     // Catch: java.lang.Exception -> L185
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L185
            double r1 = (double) r1     // Catch: java.lang.Exception -> L185
            double r3 = r11.u     // Catch: java.lang.Exception -> L185
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L185
            float r1 = r11.R     // Catch: java.lang.Exception -> L185
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L185
            double r1 = (double) r1     // Catch: java.lang.Exception -> L185
            double r3 = r11.u     // Catch: java.lang.Exception -> L185
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L185
            return r7
        L185:
            return r0
    }

    private void o() {
            r4 = this;
            com.beizi.ad.a.a.a$a r0 = r4.B     // Catch: java.lang.Exception -> L2b
            if (r0 == 0) goto L2b
            boolean r0 = r4.C     // Catch: java.lang.Exception -> L2b
            if (r0 != 0) goto L9
            goto L2b
        L9:
            java.lang.String r0 = com.beizi.ad.a.a.a.f6444g     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "onEulerAngleHappened"
            com.beizi.ad.lance.a.m.a(r0, r1)     // Catch: java.lang.Exception -> L2b
            r4.b()     // Catch: java.lang.Exception -> L2b
            boolean r0 = r4.y     // Catch: java.lang.Exception -> L2b
            if (r0 != 0) goto L26
            android.content.Context r0 = r4.f6450h     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = r4.E     // Catch: java.lang.Exception -> L2b
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L2b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L2b
            com.beizi.ad.internal.h.m.c(r0, r1, r2)     // Catch: java.lang.Exception -> L2b
        L26:
            com.beizi.ad.a.a.a$a r0 = r4.B     // Catch: java.lang.Exception -> L2b
            r0.a()     // Catch: java.lang.Exception -> L2b
        L2b:
            return
    }

    public int a(int r5) {
            r4 = this;
            double r0 = java.lang.Math.random()
            double r2 = (double) r5
            double r0 = r0 * r2
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r2
            int r5 = (int) r0
            return r5
    }

    public void a() {
            r1 = this;
            boolean r0 = r1.D
            if (r0 != 0) goto L15
            boolean r0 = r1.K
            if (r0 != 0) goto L9
            goto L15
        L9:
            r0 = 1
            r1.C = r0
            r1.k()
            r1.f()
            r1.l()
        L15:
            return
    }

    public void a(android.view.ViewGroup r11) {
            r10 = this;
            if (r11 == 0) goto Ldc
            android.content.Context r0 = r10.f6450h     // Catch: java.lang.Exception -> Ldc
            if (r0 == 0) goto Ldc
            boolean r0 = r10.K     // Catch: java.lang.Exception -> Ldc
            if (r0 != 0) goto Lc
            goto Ldc
        Lc:
            android.widget.ImageView r0 = new android.widget.ImageView     // Catch: java.lang.Exception -> Ldc
            android.content.Context r1 = r10.f6450h     // Catch: java.lang.Exception -> Ldc
            r0.<init>(r1)     // Catch: java.lang.Exception -> Ldc
            r1 = 0
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> Ldc
            int r2 = com.beizi.fusion.R.mipmap.beizi_interaction_icon_euler_angle     // Catch: java.lang.Exception -> Ldc
            r0.setImageResource(r2)     // Catch: java.lang.Exception -> Ldc
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r2 = r10.f6453k     // Catch: java.lang.Exception -> Ldc
            if (r2 == 0) goto L3a
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleStyleBean r2 = r2.getStyle()     // Catch: java.lang.Exception -> Ldc
            if (r2 == 0) goto L3a
            java.util.List r2 = r2.getImgs()     // Catch: java.lang.Exception -> Ldc
            if (r2 == 0) goto L3a
            int r3 = r2.size()     // Catch: java.lang.Exception -> Ldc
            if (r3 <= 0) goto L3a
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> Ldc
            r10.L = r2     // Catch: java.lang.Exception -> Ldc
        L3a:
            java.lang.String r2 = r10.L     // Catch: java.lang.Exception -> Ldc
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> Ldc
            if (r2 != 0) goto L52
            android.content.Context r2 = r10.f6450h     // Catch: java.lang.Exception -> Ldc
            com.beizi.ad.internal.h.i r2 = com.beizi.ad.internal.h.i.a(r2)     // Catch: java.lang.Exception -> Ldc
            java.lang.String r3 = r10.L     // Catch: java.lang.Exception -> Ldc
            com.beizi.ad.a.a.a$2 r4 = new com.beizi.ad.a.a.a$2     // Catch: java.lang.Exception -> Ldc
            r4.<init>(r10, r0)     // Catch: java.lang.Exception -> Ldc
            r2.b(r3, r4)     // Catch: java.lang.Exception -> Ldc
        L52:
            int[] r2 = r10.b(r11)     // Catch: java.lang.Exception -> Ldc
            boolean r3 = r11 instanceof android.widget.RelativeLayout     // Catch: java.lang.Exception -> Ldc
            r4 = 17
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = -2
            r9 = -1
            if (r3 == 0) goto L81
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams     // Catch: java.lang.Exception -> Ldc
            r3.<init>(r9, r8)     // Catch: java.lang.Exception -> Ldc
            r1 = r2[r1]     // Catch: java.lang.Exception -> Ldc
            if (r1 <= 0) goto L6c
            r3.width = r1     // Catch: java.lang.Exception -> Ldc
        L6c:
            r1 = r2[r7]     // Catch: java.lang.Exception -> Ldc
            if (r1 <= 0) goto L72
            r3.height = r1     // Catch: java.lang.Exception -> Ldc
        L72:
            r1 = r2[r6]     // Catch: java.lang.Exception -> Ldc
            r3.leftMargin = r1     // Catch: java.lang.Exception -> Ldc
            r1 = r2[r5]     // Catch: java.lang.Exception -> Ldc
            r3.topMargin = r1     // Catch: java.lang.Exception -> Ldc
            r3.addRule(r4)     // Catch: java.lang.Exception -> Ldc
            r11.addView(r0, r3)     // Catch: java.lang.Exception -> Ldc
            goto Ld9
        L81:
            boolean r3 = r11 instanceof android.widget.FrameLayout     // Catch: java.lang.Exception -> Ldc
            if (r3 == 0) goto La2
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> Ldc
            r3.<init>(r9, r8, r4)     // Catch: java.lang.Exception -> Ldc
            r1 = r2[r1]     // Catch: java.lang.Exception -> Ldc
            if (r1 <= 0) goto L90
            r3.width = r1     // Catch: java.lang.Exception -> Ldc
        L90:
            r1 = r2[r7]     // Catch: java.lang.Exception -> Ldc
            if (r1 <= 0) goto L96
            r3.height = r1     // Catch: java.lang.Exception -> Ldc
        L96:
            r1 = r2[r6]     // Catch: java.lang.Exception -> Ldc
            r3.leftMargin = r1     // Catch: java.lang.Exception -> Ldc
            r1 = r2[r5]     // Catch: java.lang.Exception -> Ldc
            r3.topMargin = r1     // Catch: java.lang.Exception -> Ldc
            r11.addView(r0, r3)     // Catch: java.lang.Exception -> Ldc
            goto Ld9
        La2:
            boolean r3 = r11 instanceof android.widget.LinearLayout     // Catch: java.lang.Exception -> Ldc
            if (r3 == 0) goto Lc5
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Exception -> Ldc
            r4 = 1099431936(0x41880000, float:17.0)
            r3.<init>(r9, r8, r4)     // Catch: java.lang.Exception -> Ldc
            r1 = r2[r1]     // Catch: java.lang.Exception -> Ldc
            if (r1 <= 0) goto Lb3
            r3.width = r1     // Catch: java.lang.Exception -> Ldc
        Lb3:
            r1 = r2[r7]     // Catch: java.lang.Exception -> Ldc
            if (r1 <= 0) goto Lb9
            r3.height = r1     // Catch: java.lang.Exception -> Ldc
        Lb9:
            r1 = r2[r6]     // Catch: java.lang.Exception -> Ldc
            r3.leftMargin = r1     // Catch: java.lang.Exception -> Ldc
            r1 = r2[r5]     // Catch: java.lang.Exception -> Ldc
            r3.topMargin = r1     // Catch: java.lang.Exception -> Ldc
            r11.addView(r0, r3)     // Catch: java.lang.Exception -> Ldc
            goto Ld9
        Lc5:
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams     // Catch: java.lang.Exception -> Ldc
            r3.<init>(r9, r8)     // Catch: java.lang.Exception -> Ldc
            r1 = r2[r1]     // Catch: java.lang.Exception -> Ldc
            if (r1 <= 0) goto Ld0
            r3.width = r1     // Catch: java.lang.Exception -> Ldc
        Ld0:
            r1 = r2[r7]     // Catch: java.lang.Exception -> Ldc
            if (r1 <= 0) goto Ld6
            r3.height = r1     // Catch: java.lang.Exception -> Ldc
        Ld6:
            r11.addView(r0, r3)     // Catch: java.lang.Exception -> Ldc
        Ld9:
            r10.a(r0)     // Catch: java.lang.Exception -> Ldc
        Ldc:
            return
    }

    public void a(android.widget.ImageView r7) {
            r6 = this;
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2c
            r2.<init>()     // Catch: java.lang.Exception -> L2c
            java.lang.String r0 = r6.v     // Catch: java.lang.Exception -> L2c
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L2c
            if (r0 != 0) goto L6f
            java.lang.String r0 = r6.f6449f     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = r6.v     // Catch: java.lang.Exception -> L2c
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L2c
            if (r0 == 0) goto L2f
            java.lang.String r3 = "rotationX"
            float r0 = r6.G     // Catch: java.lang.Exception -> L2c
            float r5 = -r0
            r4 = 0
            r0 = r6
            r1 = r7
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            java.lang.String r3 = "rotationX"
            float r7 = r0.G     // Catch: java.lang.Exception -> L15b
            float r4 = -r7
            r5 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            goto L71
        L2c:
            r0 = r6
            goto L15b
        L2f:
            r0 = r6
            r1 = r7
            java.lang.String r7 = r0.f6448e     // Catch: java.lang.Exception -> L15b
            java.lang.String r3 = r0.v     // Catch: java.lang.Exception -> L15b
            boolean r7 = r7.equals(r3)     // Catch: java.lang.Exception -> L15b
            if (r7 == 0) goto L4c
            java.lang.String r3 = "rotationX"
            float r5 = r0.G     // Catch: java.lang.Exception -> L15b
            r4 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            java.lang.String r3 = "rotationX"
            float r4 = r0.G     // Catch: java.lang.Exception -> L15b
            r5 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            goto L71
        L4c:
            java.lang.String r3 = "rotationX"
            float r5 = r0.G     // Catch: java.lang.Exception -> L15b
            r4 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            java.lang.String r3 = "rotationX"
            float r4 = r0.G     // Catch: java.lang.Exception -> L15b
            r5 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            java.lang.String r3 = "rotationX"
            float r7 = r0.G     // Catch: java.lang.Exception -> L15b
            float r5 = -r7
            r4 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            java.lang.String r3 = "rotationX"
            float r7 = r0.G     // Catch: java.lang.Exception -> L15b
            float r4 = -r7
            r5 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            goto L71
        L6f:
            r0 = r6
            r1 = r7
        L71:
            java.lang.String r7 = r0.w     // Catch: java.lang.Exception -> L15b
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L15b
            if (r7 != 0) goto Ld3
            java.lang.String r7 = r0.f6449f     // Catch: java.lang.Exception -> L15b
            java.lang.String r3 = r0.w     // Catch: java.lang.Exception -> L15b
            boolean r7 = r7.equals(r3)     // Catch: java.lang.Exception -> L15b
            if (r7 == 0) goto L96
            java.lang.String r3 = "rotationY"
            float r7 = r0.H     // Catch: java.lang.Exception -> L15b
            float r5 = -r7
            r4 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            java.lang.String r3 = "rotationY"
            float r7 = r0.H     // Catch: java.lang.Exception -> L15b
            float r4 = -r7
            r5 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            goto Ld3
        L96:
            java.lang.String r7 = r0.f6448e     // Catch: java.lang.Exception -> L15b
            java.lang.String r3 = r0.w     // Catch: java.lang.Exception -> L15b
            boolean r7 = r7.equals(r3)     // Catch: java.lang.Exception -> L15b
            if (r7 == 0) goto Lb1
            java.lang.String r3 = "rotationY"
            float r5 = r0.H     // Catch: java.lang.Exception -> L15b
            r4 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            java.lang.String r3 = "rotationY"
            float r4 = r0.H     // Catch: java.lang.Exception -> L15b
            r5 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            goto Ld3
        Lb1:
            java.lang.String r3 = "rotationY"
            float r5 = r0.H     // Catch: java.lang.Exception -> L15b
            r4 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            java.lang.String r3 = "rotationY"
            float r4 = r0.H     // Catch: java.lang.Exception -> L15b
            r5 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            java.lang.String r3 = "rotationY"
            float r7 = r0.H     // Catch: java.lang.Exception -> L15b
            float r5 = -r7
            r4 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            java.lang.String r3 = "rotationY"
            float r7 = r0.H     // Catch: java.lang.Exception -> L15b
            float r4 = -r7
            r5 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
        Ld3:
            java.lang.String r7 = r0.x     // Catch: java.lang.Exception -> L15b
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L15b
            if (r7 != 0) goto L135
            java.lang.String r7 = r0.f6449f     // Catch: java.lang.Exception -> L15b
            java.lang.String r3 = r0.x     // Catch: java.lang.Exception -> L15b
            boolean r7 = r7.equals(r3)     // Catch: java.lang.Exception -> L15b
            if (r7 == 0) goto Lf8
            java.lang.String r3 = "rotation"
            float r7 = r0.I     // Catch: java.lang.Exception -> L15b
            float r5 = -r7
            r4 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            java.lang.String r3 = "rotation"
            float r7 = r0.I     // Catch: java.lang.Exception -> L15b
            float r4 = -r7
            r5 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            goto L135
        Lf8:
            java.lang.String r7 = r0.f6448e     // Catch: java.lang.Exception -> L15b
            java.lang.String r3 = r0.x     // Catch: java.lang.Exception -> L15b
            boolean r7 = r7.equals(r3)     // Catch: java.lang.Exception -> L15b
            if (r7 == 0) goto L113
            java.lang.String r3 = "rotation"
            float r5 = r0.I     // Catch: java.lang.Exception -> L15b
            r4 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            java.lang.String r3 = "rotation"
            float r4 = r0.I     // Catch: java.lang.Exception -> L15b
            r5 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            goto L135
        L113:
            java.lang.String r3 = "rotation"
            float r5 = r0.I     // Catch: java.lang.Exception -> L15b
            r4 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            java.lang.String r3 = "rotation"
            float r4 = r0.I     // Catch: java.lang.Exception -> L15b
            r5 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            java.lang.String r3 = "rotation"
            float r7 = r0.I     // Catch: java.lang.Exception -> L15b
            float r5 = -r7
            r4 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
            java.lang.String r3 = "rotation"
            float r7 = r0.I     // Catch: java.lang.Exception -> L15b
            float r4 = -r7
            r5 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L15b
        L135:
            android.animation.AnimatorSet r7 = r0.J     // Catch: java.lang.Exception -> L15b
            if (r7 == 0) goto L13c
            r7 = 0
            r0.J = r7     // Catch: java.lang.Exception -> L15b
        L13c:
            int r7 = r2.size()     // Catch: java.lang.Exception -> L15b
            if (r7 <= 0) goto L15b
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet     // Catch: java.lang.Exception -> L15b
            r7.<init>()     // Catch: java.lang.Exception -> L15b
            r0.J = r7     // Catch: java.lang.Exception -> L15b
            com.beizi.ad.a.a.a$3 r1 = new com.beizi.ad.a.a.a$3     // Catch: java.lang.Exception -> L15b
            r1.<init>(r6)     // Catch: java.lang.Exception -> L15b
            r7.addListener(r1)     // Catch: java.lang.Exception -> L15b
            android.animation.AnimatorSet r7 = r0.J     // Catch: java.lang.Exception -> L15b
            r7.playSequentially(r2)     // Catch: java.lang.Exception -> L15b
            android.animation.AnimatorSet r7 = r0.J     // Catch: java.lang.Exception -> L15b
            r7.start()     // Catch: java.lang.Exception -> L15b
        L15b:
            return
    }

    public void a(com.beizi.ad.a.a.a.InterfaceC0099a r1) {
            r0 = this;
            r0.B = r1
            return
    }

    public void b() {
            r1 = this;
            r0 = 0
            r1.C = r0
            r1.k()
            r1.m()
            return
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.L
            return r0
    }

    public void d() {
            r2 = this;
            r2.m()     // Catch: java.lang.Exception -> L21
            r0 = 0
            r2.f6451i = r0     // Catch: java.lang.Exception -> L21
            r2.f6452j = r0     // Catch: java.lang.Exception -> L21
            r2.f6453k = r0     // Catch: java.lang.Exception -> L21
            r2.l = r0     // Catch: java.lang.Exception -> L21
            r2.m = r0     // Catch: java.lang.Exception -> L21
            r2.n = r0     // Catch: java.lang.Exception -> L21
            r2.f6450h = r0     // Catch: java.lang.Exception -> L21
            r2.B = r0     // Catch: java.lang.Exception -> L21
            com.beizi.ad.a.a.a.q = r0     // Catch: java.lang.Exception -> L21
            r2.r = r0     // Catch: java.lang.Exception -> L21
            android.animation.AnimatorSet r1 = r2.J     // Catch: java.lang.Exception -> L21
            if (r1 == 0) goto L1f
            r1.removeAllListeners()     // Catch: java.lang.Exception -> L21
        L1f:
            r2.J = r0     // Catch: java.lang.Exception -> L21
        L21:
            return
    }
}
