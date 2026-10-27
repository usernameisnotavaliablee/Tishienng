package com.beizi.ad.a.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class e {
    private long A;
    private boolean B;
    private boolean C;
    private java.lang.String D;
    private int E;
    private float F;
    private android.animation.AnimatorSet G;
    private java.lang.String H;
    private boolean I;
    private final android.hardware.SensorEventListener J;
    private int K;
    private android.hardware.Sensor L;
    private float M;
    private float N;
    private float[] O;
    private float P;
    private float Q;
    private float R;
    private float S;
    private float T;
    private float U;
    private boolean V;
    private boolean W;
    private long X;
    private boolean Y;
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.ShakeViewBean f6507b;

    /* renamed from: c, reason: collision with root package name */
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.ShakeViewBean f6508c;

    /* renamed from: d, reason: collision with root package name */
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.AliaseShakeViewBean f6509d;

    /* renamed from: e, reason: collision with root package name */
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.CoolShakeViewBean f6510e;

    /* renamed from: f, reason: collision with root package name */
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.PercentPositionBean f6511f;

    /* renamed from: g, reason: collision with root package name */
    private double f6512g;

    /* renamed from: h, reason: collision with root package name */
    private int f6513h;

    /* renamed from: i, reason: collision with root package name */
    private int f6514i;

    /* renamed from: j, reason: collision with root package name */
    private int f6515j;

    /* renamed from: k, reason: collision with root package name */
    private int f6516k;
    private android.hardware.SensorManager l;
    private android.hardware.Sensor m;
    private com.beizi.ad.a.a.e.a n;
    private float o;
    private float p;
    private float q;
    private int r;
    private double s;
    private double t;
    private double u;
    private int v;
    private int w;
    private int x;
    private int y;
    private boolean z;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a();
    }

    public e(android.content.Context r6, com.beizi.fusion.model.AdSpacesBean.BuyerBean.ShakeViewBean r7, java.lang.String r8, java.lang.String r9) {
            r5 = this;
            r5.<init>()
            r0 = 4621706527598287258(0x402399999999999a, double:9.8)
            r5.f6512g = r0
            r0 = -100
            r5.f6513h = r0
            r1 = 0
            r5.f6514i = r1
            r2 = 1
            r5.f6515j = r2
            r3 = 2
            r5.f6516k = r3
            r3 = 0
            r5.n = r3
            float r4 = (float) r0
            r5.o = r4
            float r4 = (float) r0
            r5.p = r4
            float r0 = (float) r0
            r5.q = r0
            r5.r = r1
            r5.x = r1
            r5.y = r1
            r5.z = r2
            r5.B = r1
            r5.C = r1
            r5.D = r3
            r0 = 80
            r5.E = r0
            r0 = 1106247680(0x41f00000, float:30.0)
            r5.F = r0
            r5.I = r1
            com.beizi.ad.a.a.e$4 r0 = new com.beizi.ad.a.a.e$4
            r0.<init>(r5)
            r5.J = r0
            r0 = 814313567(0x3089705f, float:1.0E-9)
            r5.N = r0
            r0 = 3
            float[] r0 = new float[r0]
            r5.O = r0
            r5.a = r6     // Catch: java.lang.Exception -> Lf6
            r5.f6507b = r7     // Catch: java.lang.Exception -> Lf6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lf6
            r6.<init>()     // Catch: java.lang.Exception -> Lf6
            java.lang.String r0 = "beizi_cool_"
            r6.append(r0)     // Catch: java.lang.Exception -> Lf6
            r6.append(r8)     // Catch: java.lang.Exception -> Lf6
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Lf6
            r5.D = r6     // Catch: java.lang.Exception -> Lf6
            java.util.List r6 = r7.getOrderData()     // Catch: java.lang.Exception -> Lf6
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataShakeViewBean r6 = r5.a(r6, r9)     // Catch: java.lang.Exception -> Lf6
            if (r6 == 0) goto L79
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r8 = r6.getShakeView()     // Catch: java.lang.Exception -> Lf6
            if (r8 == 0) goto L79
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r6 = r6.getShakeView()     // Catch: java.lang.Exception -> Lf6
            r5.f6508c = r6     // Catch: java.lang.Exception -> Lf6
        L79:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r6 = r5.f6507b     // Catch: java.lang.Exception -> Lf6
            if (r6 == 0) goto L89
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r6 = r6.getCoolShakeView()     // Catch: java.lang.Exception -> Lf6
            r5.f6510e = r6     // Catch: java.lang.Exception -> Lf6
            int r6 = r7.getRegulatoryAngle()     // Catch: java.lang.Exception -> Lf6
            r5.K = r6     // Catch: java.lang.Exception -> Lf6
        L89:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r6 = r5.f6508c     // Catch: java.lang.Exception -> Lf6
            if (r6 == 0) goto Lba
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$AliaseShakeViewBean r6 = r6.getAliaseShakeView()     // Catch: java.lang.Exception -> Lf6
            r5.f6509d = r6     // Catch: java.lang.Exception -> Lf6
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r6 = r5.f6508c     // Catch: java.lang.Exception -> Lf6
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean r6 = r6.getPosition()     // Catch: java.lang.Exception -> Lf6
            r5.f6511f = r6     // Catch: java.lang.Exception -> Lf6
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r6 = r5.f6508c     // Catch: java.lang.Exception -> Lf6
            java.util.List r6 = r6.getImageURL()     // Catch: java.lang.Exception -> Lf6
            if (r6 == 0) goto Lb1
            int r7 = r6.size()     // Catch: java.lang.Exception -> Lf6
            if (r7 <= 0) goto Lb1
            java.lang.Object r6 = r6.get(r1)     // Catch: java.lang.Exception -> Lf6
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> Lf6
            r5.H = r6     // Catch: java.lang.Exception -> Lf6
        Lb1:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r6 = r5.f6508c     // Catch: java.lang.Exception -> Lf6
            int r6 = r6.getRegulatoryAngle()     // Catch: java.lang.Exception -> Lf6
            r5.K = r6     // Catch: java.lang.Exception -> Lf6
            goto Le2
        Lba:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r6 = r5.f6507b     // Catch: java.lang.Exception -> Lf6
            if (r6 == 0) goto Le2
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$AliaseShakeViewBean r6 = r6.getAliaseShakeView()     // Catch: java.lang.Exception -> Lf6
            r5.f6509d = r6     // Catch: java.lang.Exception -> Lf6
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r6 = r5.f6507b     // Catch: java.lang.Exception -> Lf6
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean r6 = r6.getPosition()     // Catch: java.lang.Exception -> Lf6
            r5.f6511f = r6     // Catch: java.lang.Exception -> Lf6
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r6 = r5.f6507b     // Catch: java.lang.Exception -> Lf6
            java.util.List r6 = r6.getImageURL()     // Catch: java.lang.Exception -> Lf6
            if (r6 == 0) goto Le2
            int r7 = r6.size()     // Catch: java.lang.Exception -> Lf6
            if (r7 <= 0) goto Le2
            java.lang.Object r6 = r6.get(r1)     // Catch: java.lang.Exception -> Lf6
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> Lf6
            r5.H = r6     // Catch: java.lang.Exception -> Lf6
        Le2:
            boolean r6 = r5.f()     // Catch: java.lang.Exception -> Lf6
            if (r6 != 0) goto Leb
            r5.I = r1     // Catch: java.lang.Exception -> Lf6
            return
        Leb:
            r5.I = r2     // Catch: java.lang.Exception -> Lf6
            r5.i()     // Catch: java.lang.Exception -> Lf6
            r5.o()     // Catch: java.lang.Exception -> Lf6
            r5.e()     // Catch: java.lang.Exception -> Lf6
        Lf6:
            return
    }

    private double a(float r7, float r8, float r9) {
            r6 = this;
            double r0 = (double) r7
            double r2 = r6.f6512g     // Catch: java.lang.Exception -> L21
            double r0 = r0 / r2
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r0, r2)     // Catch: java.lang.Exception -> L21
            double r7 = (double) r8     // Catch: java.lang.Exception -> L21
            double r4 = r6.f6512g     // Catch: java.lang.Exception -> L21
            double r7 = r7 / r4
            double r7 = java.lang.Math.pow(r7, r2)     // Catch: java.lang.Exception -> L21
            double r0 = r0 + r7
            double r7 = (double) r9     // Catch: java.lang.Exception -> L21
            double r4 = r6.f6512g     // Catch: java.lang.Exception -> L21
            double r7 = r7 / r4
            double r7 = java.lang.Math.pow(r7, r2)     // Catch: java.lang.Exception -> L21
            double r0 = r0 + r7
            double r7 = java.lang.Math.sqrt(r0)     // Catch: java.lang.Exception -> L21
            return r7
        L21:
            r7 = 0
            return r7
    }

    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataShakeViewBean a(java.util.List<com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataShakeViewBean> r4, java.lang.String r5) {
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
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$OrderDataShakeViewBean r1 = (com.beizi.fusion.model.AdSpacesBean.BuyerBean.OrderDataShakeViewBean) r1
            java.util.List r2 = r1.getOrderList()
            if (r2 == 0) goto La
            boolean r2 = r2.contains(r5)
            if (r2 == 0) goto La
            return r1
        L23:
            return r0
    }

    private void a(android.hardware.SensorEvent r9) {
            r8 = this;
            java.lang.String r0 = "_"
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lbd
            long r3 = r8.A     // Catch: java.lang.Exception -> Lbd
            long r1 = r1 - r3
            r3 = 100
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L11
            goto Lbd
        L11:
            if (r9 == 0) goto Lbd
            boolean r1 = r8.z     // Catch: java.lang.Exception -> Lbd
            if (r1 != 0) goto L19
            goto Lbd
        L19:
            float[] r9 = r9.values     // Catch: java.lang.Exception -> Lbd
            if (r9 == 0) goto Lbd
            int r1 = r9.length     // Catch: java.lang.Exception -> Lbd
            r2 = 3
            if (r1 >= r2) goto L23
            goto Lbd
        L23:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Lbd
            r8.A = r1     // Catch: java.lang.Exception -> Lbd
            r1 = 0
            r2 = r9[r1]     // Catch: java.lang.Exception -> Lbd
            r3 = 1
            r4 = r9[r3]     // Catch: java.lang.Exception -> Lbd
            r5 = 2
            r9 = r9[r5]     // Catch: java.lang.Exception -> Lbd
            double r4 = r8.a(r2, r4, r9)     // Catch: java.lang.Exception -> Lbd
            double r6 = r8.s     // Catch: java.lang.Exception -> Lbd
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L41
            int r9 = r8.f6515j     // Catch: java.lang.Exception -> Lbd
            r8.r = r9     // Catch: java.lang.Exception -> Lbd
            goto L56
        L41:
            double r6 = r8.t     // Catch: java.lang.Exception -> Lbd
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L56
            int r9 = r8.r     // Catch: java.lang.Exception -> Lbd
            int r2 = r8.f6515j     // Catch: java.lang.Exception -> Lbd
            if (r9 != r2) goto L56
            int r9 = r8.f6516k     // Catch: java.lang.Exception -> Lbd
            r8.r = r9     // Catch: java.lang.Exception -> Lbd
            int r9 = r8.x     // Catch: java.lang.Exception -> Lbd
            int r9 = r9 + r3
            r8.x = r9     // Catch: java.lang.Exception -> Lbd
        L56:
            int r9 = r8.v     // Catch: java.lang.Exception -> Lbd
            if (r9 <= 0) goto Lbd
            int r2 = r8.x     // Catch: java.lang.Exception -> Lbd
            if (r2 < r9) goto Lbd
            r8.W = r3     // Catch: java.lang.Exception -> Lbd
            java.lang.String r9 = "ShakeUtil"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbd
            r2.<init>()     // Catch: java.lang.Exception -> Lbd
            java.lang.String r6 = " current: "
            r2.append(r6)     // Catch: java.lang.Exception -> Lbd
            java.lang.String r6 = "%.4f"
            java.lang.Double r4 = java.lang.Double.valueOf(r4)     // Catch: java.lang.Exception -> Lbd
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> Lbd
            r3[r1] = r4     // Catch: java.lang.Exception -> Lbd
            java.lang.String r1 = java.lang.String.format(r6, r3)     // Catch: java.lang.Exception -> Lbd
            r2.append(r1)     // Catch: java.lang.Exception -> Lbd
            java.lang.String r1 = ", execute: "
            r2.append(r1)     // Catch: java.lang.Exception -> Lbd
            int r1 = r8.x     // Catch: java.lang.Exception -> Lbd
            r2.append(r1)     // Catch: java.lang.Exception -> Lbd
            java.lang.String r1 = ", count: "
            r2.append(r1)     // Catch: java.lang.Exception -> Lbd
            int r1 = r8.v     // Catch: java.lang.Exception -> Lbd
            r2.append(r1)     // Catch: java.lang.Exception -> Lbd
            r2.append(r0)     // Catch: java.lang.Exception -> Lbd
            int r1 = r8.w     // Catch: java.lang.Exception -> Lbd
            r2.append(r1)     // Catch: java.lang.Exception -> Lbd
            java.lang.String r1 = ", shake: "
            r2.append(r1)     // Catch: java.lang.Exception -> Lbd
            double r3 = r8.s     // Catch: java.lang.Exception -> Lbd
            r2.append(r3)     // Catch: java.lang.Exception -> Lbd
            r2.append(r0)     // Catch: java.lang.Exception -> Lbd
            double r0 = r8.t     // Catch: java.lang.Exception -> Lbd
            r2.append(r0)     // Catch: java.lang.Exception -> Lbd
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> Lbd
            com.beizi.ad.lance.a.m.b(r9, r0)     // Catch: java.lang.Exception -> Lbd
            boolean r9 = r8.W     // Catch: java.lang.Exception -> Lbd
            if (r9 == 0) goto Lbd
            boolean r9 = r8.V     // Catch: java.lang.Exception -> Lbd
            if (r9 == 0) goto Lbd
            r8.r()     // Catch: java.lang.Exception -> Lbd
        Lbd:
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
            int r5 = r2.E     // Catch: java.lang.Exception -> L16
            long r5 = (long) r5     // Catch: java.lang.Exception -> L16
            r3.setDuration(r5)     // Catch: java.lang.Exception -> L16
            r4.add(r3)     // Catch: java.lang.Exception -> L16
        L16:
            return
    }

    static /* synthetic */ void a(com.beizi.ad.a.a.e r0) {
            r0.j()
            return
    }

    static /* synthetic */ void a(com.beizi.ad.a.a.e r0, android.hardware.SensorEvent r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ android.animation.AnimatorSet b(com.beizi.ad.a.a.e r0) {
            android.animation.AnimatorSet r0 = r0.G
            return r0
    }

    private void b(android.hardware.SensorEvent r15) {
            r14 = this;
            java.lang.String r0 = "%.4f"
            if (r15 == 0) goto L1af
            boolean r1 = r14.Y     // Catch: java.lang.Exception -> L1af
            if (r1 == 0) goto La
            goto L1af
        La:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L1af
            long r3 = r14.X     // Catch: java.lang.Exception -> L1af
            long r1 = r1 - r3
            r3 = 50
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L19
            goto L1af
        L19:
            android.hardware.Sensor r1 = r15.sensor     // Catch: java.lang.Exception -> L1af
            float[] r2 = r15.values     // Catch: java.lang.Exception -> L1af
            int r1 = r1.getType()     // Catch: java.lang.Exception -> L1af
            if (r2 == 0) goto L1af
            r3 = 4
            if (r1 == r3) goto L28
            goto L1af
        L28:
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L1af
            r14.X = r3     // Catch: java.lang.Exception -> L1af
            float r1 = r14.M     // Catch: java.lang.Exception -> L1af
            r3 = 0
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 == 0) goto L1aa
            r4 = 0
            r5 = r2[r4]     // Catch: java.lang.Exception -> L1af
            r6 = 1
            r7 = r2[r6]     // Catch: java.lang.Exception -> L1af
            r8 = 2
            r2 = r2[r8]     // Catch: java.lang.Exception -> L1af
            long r9 = r15.timestamp     // Catch: java.lang.Exception -> L1af
            float r9 = (float) r9     // Catch: java.lang.Exception -> L1af
            float r9 = r9 - r1
            float r1 = r14.N     // Catch: java.lang.Exception -> L1af
            float r9 = r9 * r1
            float[] r1 = r14.O     // Catch: java.lang.Exception -> L1af
            r10 = r1[r4]     // Catch: java.lang.Exception -> L1af
            double r10 = (double) r10     // Catch: java.lang.Exception -> L1af
            float r5 = r5 * r9
            double r12 = (double) r5     // Catch: java.lang.Exception -> L1af
            double r12 = java.lang.Math.toDegrees(r12)     // Catch: java.lang.Exception -> L1af
            double r10 = r10 + r12
            float r5 = (float) r10     // Catch: java.lang.Exception -> L1af
            r1[r4] = r5     // Catch: java.lang.Exception -> L1af
            float[] r1 = r14.O     // Catch: java.lang.Exception -> L1af
            r5 = r1[r6]     // Catch: java.lang.Exception -> L1af
            double r10 = (double) r5     // Catch: java.lang.Exception -> L1af
            float r7 = r7 * r9
            double r12 = (double) r7     // Catch: java.lang.Exception -> L1af
            double r12 = java.lang.Math.toDegrees(r12)     // Catch: java.lang.Exception -> L1af
            double r10 = r10 + r12
            float r5 = (float) r10     // Catch: java.lang.Exception -> L1af
            r1[r6] = r5     // Catch: java.lang.Exception -> L1af
            float[] r1 = r14.O     // Catch: java.lang.Exception -> L1af
            r5 = r1[r8]     // Catch: java.lang.Exception -> L1af
            double r10 = (double) r5     // Catch: java.lang.Exception -> L1af
            float r2 = r2 * r9
            double r12 = (double) r2     // Catch: java.lang.Exception -> L1af
            double r12 = java.lang.Math.toDegrees(r12)     // Catch: java.lang.Exception -> L1af
            double r10 = r10 + r12
            float r2 = (float) r10     // Catch: java.lang.Exception -> L1af
            r1[r8] = r2     // Catch: java.lang.Exception -> L1af
            float[] r1 = r14.O     // Catch: java.lang.Exception -> L1af
            r2 = r1[r4]     // Catch: java.lang.Exception -> L1af
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 <= 0) goto L87
            float r5 = r14.S     // Catch: java.lang.Exception -> L1af
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L8f
            r14.S = r2     // Catch: java.lang.Exception -> L1af
            goto L8f
        L87:
            float r5 = r14.P     // Catch: java.lang.Exception -> L1af
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L8f
            r14.P = r2     // Catch: java.lang.Exception -> L1af
        L8f:
            r2 = r1[r6]     // Catch: java.lang.Exception -> L1af
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 <= 0) goto L9e
            float r5 = r14.T     // Catch: java.lang.Exception -> L1af
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto La6
            r14.T = r2     // Catch: java.lang.Exception -> L1af
            goto La6
        L9e:
            float r5 = r14.Q     // Catch: java.lang.Exception -> L1af
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto La6
            r14.Q = r2     // Catch: java.lang.Exception -> L1af
        La6:
            r1 = r1[r8]     // Catch: java.lang.Exception -> L1af
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 <= 0) goto Lb5
            float r2 = r14.U     // Catch: java.lang.Exception -> L1af
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto Lbd
            r14.U = r1     // Catch: java.lang.Exception -> L1af
            goto Lbd
        Lb5:
            float r2 = r14.R     // Catch: java.lang.Exception -> L1af
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto Lbd
            r14.R = r1     // Catch: java.lang.Exception -> L1af
        Lbd:
            float r1 = r14.P     // Catch: java.lang.Exception -> L1af
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L1af
            int r2 = r14.K     // Catch: java.lang.Exception -> L1af
            float r2 = (float) r2     // Catch: java.lang.Exception -> L1af
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto Ld7
            float r1 = r14.S     // Catch: java.lang.Exception -> L1af
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L1af
            int r2 = r14.K     // Catch: java.lang.Exception -> L1af
            float r2 = (float) r2     // Catch: java.lang.Exception -> L1af
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L10b
        Ld7:
            float r1 = r14.Q     // Catch: java.lang.Exception -> L1af
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L1af
            int r2 = r14.K     // Catch: java.lang.Exception -> L1af
            float r2 = (float) r2     // Catch: java.lang.Exception -> L1af
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto Lf1
            float r1 = r14.T     // Catch: java.lang.Exception -> L1af
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L1af
            int r2 = r14.K     // Catch: java.lang.Exception -> L1af
            float r2 = (float) r2     // Catch: java.lang.Exception -> L1af
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L10b
        Lf1:
            float r1 = r14.R     // Catch: java.lang.Exception -> L1af
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L1af
            int r2 = r14.K     // Catch: java.lang.Exception -> L1af
            float r2 = (float) r2     // Catch: java.lang.Exception -> L1af
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L19f
            float r1 = r14.U     // Catch: java.lang.Exception -> L1af
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L1af
            int r2 = r14.K     // Catch: java.lang.Exception -> L1af
            float r2 = (float) r2     // Catch: java.lang.Exception -> L1af
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L19f
        L10b:
            java.lang.String r1 = "ShakeUtil"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1af
            r2.<init>()     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = "rotate  xMin: "
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            float r3 = r14.P     // Catch: java.lang.Exception -> L1af
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L1af
            r5[r4] = r3     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = java.lang.String.format(r0, r5)     // Catch: java.lang.Exception -> L1af
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = ",xMax: "
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            float r3 = r14.S     // Catch: java.lang.Exception -> L1af
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L1af
            r5[r4] = r3     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = java.lang.String.format(r0, r5)     // Catch: java.lang.Exception -> L1af
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = ",yMin: "
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            float r3 = r14.Q     // Catch: java.lang.Exception -> L1af
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L1af
            r5[r4] = r3     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = java.lang.String.format(r0, r5)     // Catch: java.lang.Exception -> L1af
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = ",yMax: "
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            float r3 = r14.T     // Catch: java.lang.Exception -> L1af
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L1af
            r5[r4] = r3     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = java.lang.String.format(r0, r5)     // Catch: java.lang.Exception -> L1af
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = ",zMin: "
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            float r3 = r14.R     // Catch: java.lang.Exception -> L1af
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L1af
            r5[r4] = r3     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = java.lang.String.format(r0, r5)     // Catch: java.lang.Exception -> L1af
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = ",zMax: "
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            float r3 = r14.U     // Catch: java.lang.Exception -> L1af
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L1af
            r5[r4] = r3     // Catch: java.lang.Exception -> L1af
            java.lang.String r0 = java.lang.String.format(r0, r5)     // Catch: java.lang.Exception -> L1af
            r2.append(r0)     // Catch: java.lang.Exception -> L1af
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L1af
            com.beizi.ad.lance.a.m.a(r1, r0)     // Catch: java.lang.Exception -> L1af
            r14.V = r6     // Catch: java.lang.Exception -> L1af
        L19f:
            boolean r0 = r14.W     // Catch: java.lang.Exception -> L1af
            if (r0 == 0) goto L1aa
            boolean r0 = r14.V     // Catch: java.lang.Exception -> L1af
            if (r0 == 0) goto L1aa
            r14.r()     // Catch: java.lang.Exception -> L1af
        L1aa:
            long r0 = r15.timestamp     // Catch: java.lang.Exception -> L1af
            float r15 = (float) r0     // Catch: java.lang.Exception -> L1af
            r14.M = r15     // Catch: java.lang.Exception -> L1af
        L1af:
            return
    }

    static /* synthetic */ void b(com.beizi.ad.a.a.e r0, android.hardware.SensorEvent r1) {
            r0.b(r1)
            return
    }

    private int[] b(android.view.ViewGroup r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.String r2 = "ShakeUtil"
            java.lang.String r3 = ";"
            java.lang.String r4 = "%"
            r5 = 4
            int[] r5 = new int[r5]
            r9 = 0
            if (r1 == 0) goto L14
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean r10 = r0.f6511f     // Catch: java.lang.Exception -> L1d5
            if (r10 != 0) goto L1c
        L14:
            r16 = 3
            r17 = 2
            r18 = 1
            goto L1bd
        L1c:
            java.lang.String r10 = r10.getCenterX()     // Catch: java.lang.Exception -> L1d5
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean r11 = r0.f6511f     // Catch: java.lang.Exception -> L1d5
            java.lang.String r11 = r11.getCenterY()     // Catch: java.lang.Exception -> L1d5
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean r12 = r0.f6511f     // Catch: java.lang.Exception -> L1d5
            java.lang.String r12 = r12.getWidth()     // Catch: java.lang.Exception -> L1d5
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean r13 = r0.f6511f     // Catch: java.lang.Exception -> L1d5
            java.lang.String r13 = r13.getHeight()     // Catch: java.lang.Exception -> L1d5
            boolean r14 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r15 = "10"
            r16 = 3
            java.lang.String r6 = "0"
            if (r14 != 0) goto L44
            boolean r14 = r6.equals(r10)     // Catch: java.lang.Exception -> L1d5
            if (r14 == 0) goto L45
        L44:
            r10 = r15
        L45:
            boolean r14 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Exception -> L1d5
            if (r14 != 0) goto L51
            boolean r14 = r6.equals(r11)     // Catch: java.lang.Exception -> L1d5
            if (r14 == 0) goto L52
        L51:
            r11 = r15
        L52:
            r1.measure(r9, r9)     // Catch: java.lang.Exception -> L1d5
            android.content.Context r14 = r0.a     // Catch: java.lang.Exception -> L1d5
            int r15 = r1.getMeasuredWidth()     // Catch: java.lang.Exception -> L1d5
            float r15 = (float) r15     // Catch: java.lang.Exception -> L1d5
            int r14 = com.beizi.ad.internal.h.u.b(r14, r15)     // Catch: java.lang.Exception -> L1d5
            android.content.Context r15 = r0.a     // Catch: java.lang.Exception -> L1d5
            r17 = 2
            int r7 = r1.getMeasuredHeight()     // Catch: java.lang.Exception -> L1d5
            float r7 = (float) r7     // Catch: java.lang.Exception -> L1d5
            int r7 = com.beizi.ad.internal.h.u.b(r15, r7)     // Catch: java.lang.Exception -> L1d5
            if (r14 > 0) goto L75
            android.content.Context r14 = r0.a     // Catch: java.lang.Exception -> L1d5
            int r14 = com.beizi.ad.lance.a.q.h(r14)     // Catch: java.lang.Exception -> L1d5
        L75:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1d5
            r15.<init>()     // Catch: java.lang.Exception -> L1d5
            r18 = 1
            java.lang.String r8 = "position containerWidth:"
            r15.append(r8)     // Catch: java.lang.Exception -> L1d5
            r15.append(r14)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r8 = ";containerHeight:"
            r15.append(r8)     // Catch: java.lang.Exception -> L1d5
            r15.append(r7)     // Catch: java.lang.Exception -> L1d5
            r15.append(r3)     // Catch: java.lang.Exception -> L1d5
            android.view.ViewGroup$LayoutParams r8 = r1.getLayoutParams()     // Catch: java.lang.Exception -> L1d5
            int r8 = r8.width     // Catch: java.lang.Exception -> L1d5
            r15.append(r8)     // Catch: java.lang.Exception -> L1d5
            r15.append(r3)     // Catch: java.lang.Exception -> L1d5
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()     // Catch: java.lang.Exception -> L1d5
            int r1 = r1.height     // Catch: java.lang.Exception -> L1d5
            r15.append(r1)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r1 = r15.toString()     // Catch: java.lang.Exception -> L1d5
            com.beizi.ad.lance.a.m.a(r2, r1)     // Catch: java.lang.Exception -> L1d5
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r8 = "20"
            if (r1 != 0) goto Lb9
            boolean r1 = r6.equals(r12)     // Catch: java.lang.Exception -> L1d5
            if (r1 == 0) goto Lba
        Lb9:
            r12 = r8
        Lba:
            boolean r1 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Exception -> L1d5
            if (r1 != 0) goto Lc6
            boolean r1 = r6.equals(r13)     // Catch: java.lang.Exception -> L1d5
            if (r1 == 0) goto Lc7
        Lc6:
            r13 = r8
        Lc7:
            boolean r1 = r10.endsWith(r4)     // Catch: java.lang.Exception -> L1d5
            if (r1 == 0) goto Lde
            int r1 = r10.indexOf(r4)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r1 = r10.substring(r9, r1)     // Catch: java.lang.Exception -> L1d5
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L1d5
            int r1 = r1 * r14
            int r1 = r1 / 100
            goto Lea
        Lde:
            boolean r1 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Exception -> L1d5
            if (r1 != 0) goto Le9
            int r1 = java.lang.Integer.parseInt(r10)     // Catch: java.lang.Exception -> L1d5
            goto Lea
        Le9:
            r1 = 0
        Lea:
            boolean r6 = r11.endsWith(r4)     // Catch: java.lang.Exception -> L1d5
            if (r6 == 0) goto L101
            int r6 = r11.indexOf(r4)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r6 = r11.substring(r9, r6)     // Catch: java.lang.Exception -> L1d5
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> L1d5
            int r7 = r7 * r6
            int r7 = r7 / 100
            goto L10d
        L101:
            boolean r6 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Exception -> L1d5
            if (r6 != 0) goto L10c
            int r7 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.Exception -> L1d5
            goto L10d
        L10c:
            r7 = 0
        L10d:
            boolean r6 = r12.endsWith(r4)     // Catch: java.lang.Exception -> L1d5
            r8 = 20
            if (r6 == 0) goto L126
            int r6 = r12.indexOf(r4)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r6 = r12.substring(r9, r6)     // Catch: java.lang.Exception -> L1d5
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> L1d5
            int r14 = r14 * r6
            int r14 = r14 / 100
            goto L133
        L126:
            boolean r6 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> L1d5
            if (r6 != 0) goto L131
            int r14 = java.lang.Integer.parseInt(r12)     // Catch: java.lang.Exception -> L1d5
            goto L133
        L131:
            r14 = 20
        L133:
            boolean r6 = r13.endsWith(r4)     // Catch: java.lang.Exception -> L1d5
            if (r6 == 0) goto L14a
            int r4 = r13.indexOf(r4)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r4 = r13.substring(r9, r4)     // Catch: java.lang.Exception -> L1d5
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Exception -> L1d5
            int r4 = r4 * r14
            int r8 = r4 / 100
            goto L154
        L14a:
            boolean r4 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> L1d5
            if (r4 != 0) goto L154
            int r8 = java.lang.Integer.parseInt(r13)     // Catch: java.lang.Exception -> L1d5
        L154:
            android.content.Context r4 = r0.a     // Catch: java.lang.Exception -> L1d5
            float r6 = (float) r14     // Catch: java.lang.Exception -> L1d5
            int r4 = com.beizi.ad.internal.h.u.a(r4, r6)     // Catch: java.lang.Exception -> L1d5
            android.content.Context r6 = r0.a     // Catch: java.lang.Exception -> L1d5
            float r8 = (float) r8     // Catch: java.lang.Exception -> L1d5
            int r6 = com.beizi.ad.internal.h.u.a(r6, r8)     // Catch: java.lang.Exception -> L1d5
            android.content.Context r8 = r0.a     // Catch: java.lang.Exception -> L1d5
            float r1 = (float) r1     // Catch: java.lang.Exception -> L1d5
            int r1 = com.beizi.ad.internal.h.u.a(r8, r1)     // Catch: java.lang.Exception -> L1d5
            android.content.Context r8 = r0.a     // Catch: java.lang.Exception -> L1d5
            float r7 = (float) r7     // Catch: java.lang.Exception -> L1d5
            int r7 = com.beizi.ad.internal.h.u.a(r8, r7)     // Catch: java.lang.Exception -> L1d5
            r5[r9] = r4     // Catch: java.lang.Exception -> L1d5
            r5[r18] = r6     // Catch: java.lang.Exception -> L1d5
            if (r1 <= 0) goto L178
            r5[r17] = r1     // Catch: java.lang.Exception -> L1d5
        L178:
            if (r7 <= 0) goto L17c
            r5[r16] = r7     // Catch: java.lang.Exception -> L1d5
        L17c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1d5
            r1.<init>()     // Catch: java.lang.Exception -> L1d5
            java.lang.String r4 = "position widthInt:"
            r1.append(r4)     // Catch: java.lang.Exception -> L1d5
            r4 = r5[r9]     // Catch: java.lang.Exception -> L1d5
            r1.append(r4)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r4 = ";heightInt:"
            r1.append(r4)     // Catch: java.lang.Exception -> L1d5
            r4 = r5[r18]     // Catch: java.lang.Exception -> L1d5
            r1.append(r4)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r4 = ";centerX:"
            r1.append(r4)     // Catch: java.lang.Exception -> L1d5
            r4 = r5[r17]     // Catch: java.lang.Exception -> L1d5
            r1.append(r4)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r4 = ";centerY:"
            r1.append(r4)     // Catch: java.lang.Exception -> L1d5
            r4 = r5[r16]     // Catch: java.lang.Exception -> L1d5
            r1.append(r4)     // Catch: java.lang.Exception -> L1d5
            r1.append(r3)     // Catch: java.lang.Exception -> L1d5
            r1.append(r10)     // Catch: java.lang.Exception -> L1d5
            r1.append(r3)     // Catch: java.lang.Exception -> L1d5
            r1.append(r11)     // Catch: java.lang.Exception -> L1d5
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L1d5
            com.beizi.ad.lance.a.m.a(r2, r1)     // Catch: java.lang.Exception -> L1d5
            return r5
        L1bd:
            android.content.Context r1 = r0.a     // Catch: java.lang.Exception -> L1d5
            r2 = 1101004800(0x41a00000, float:20.0)
            int r1 = com.beizi.ad.internal.h.u.a(r1, r2)     // Catch: java.lang.Exception -> L1d5
            android.content.Context r2 = r0.a     // Catch: java.lang.Exception -> L1d5
            r3 = 1092616192(0x41200000, float:10.0)
            int r2 = com.beizi.ad.internal.h.u.a(r2, r3)     // Catch: java.lang.Exception -> L1d5
            r5[r9] = r1     // Catch: java.lang.Exception -> L1d5
            r5[r18] = r1     // Catch: java.lang.Exception -> L1d5
            r5[r17] = r2     // Catch: java.lang.Exception -> L1d5
            r5[r16] = r2     // Catch: java.lang.Exception -> L1d5
        L1d5:
            return r5
    }

    private boolean f() {
            r9 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r9.f6508c
            r1 = 0
            r3 = 0
            if (r0 == 0) goto L18
            double r4 = r0.getShakeStartAmplitude()
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r9.f6508c
            double r6 = r0.getShakeEndAmplitude()
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r9.f6508c
            int r0 = r0.getShakeCount()
            goto L30
        L18:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r9.f6507b
            if (r0 == 0) goto L2d
            double r4 = r0.getShakeStartAmplitude()
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r9.f6507b
            double r6 = r0.getShakeEndAmplitude()
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r9.f6507b
            int r0 = r0.getShakeCount()
            goto L30
        L2d:
            r4 = r1
            r6 = r4
            r0 = 0
        L30:
            int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r8 <= 0) goto L3c
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 <= 0) goto L3c
            if (r0 <= 0) goto L3c
            r0 = 1
            return r0
        L3c:
            return r3
    }

    private boolean g() {
            r2 = this;
            r0 = 0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r1 = r2.f6510e     // Catch: java.lang.Exception -> L15
            if (r1 != 0) goto L6
            return r0
        L6:
            int r1 = r1.getShakeCount()     // Catch: java.lang.Exception -> L15
            if (r1 > 0) goto L14
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r1 = r2.f6510e     // Catch: java.lang.Exception -> L15
            int r1 = r1.getRotatCount()     // Catch: java.lang.Exception -> L15
            if (r1 <= 0) goto L15
        L14:
            r0 = 1
        L15:
            return r0
    }

    private boolean h() {
            r2 = this;
            r0 = 0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$AliaseShakeViewBean r1 = r2.f6509d     // Catch: java.lang.Exception -> L1f
            if (r1 != 0) goto L6
            return r0
        L6:
            if (r1 == 0) goto L1f
            int r1 = r1.getPassivationTime()     // Catch: java.lang.Exception -> L1f
            if (r1 <= 0) goto L1f
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$AliaseShakeViewBean r1 = r2.f6509d     // Catch: java.lang.Exception -> L1f
            int r1 = r1.getShakeCount()     // Catch: java.lang.Exception -> L1f
            if (r1 > 0) goto L1e
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$AliaseShakeViewBean r1 = r2.f6509d     // Catch: java.lang.Exception -> L1f
            int r1 = r1.getRotatCount()     // Catch: java.lang.Exception -> L1f
            if (r1 <= 0) goto L1f
        L1e:
            r0 = 1
        L1f:
            return r0
    }

    private void i() {
            r2 = this;
            r2.q()     // Catch: java.lang.Exception -> L35
            boolean r0 = r2.n()     // Catch: java.lang.Exception -> L35
            r1 = 0
            if (r0 != 0) goto L14
            boolean r0 = r2.m()     // Catch: java.lang.Exception -> L35
            if (r0 == 0) goto L11
            goto L14
        L11:
            r2.B = r1     // Catch: java.lang.Exception -> L35
            goto L20
        L14:
            boolean r0 = r2.g()     // Catch: java.lang.Exception -> L35
            if (r0 == 0) goto L1e
            r0 = 1
            r2.B = r0     // Catch: java.lang.Exception -> L35
            goto L20
        L1e:
            r2.B = r1     // Catch: java.lang.Exception -> L35
        L20:
            boolean r0 = r2.B     // Catch: java.lang.Exception -> L35
            if (r0 == 0) goto L28
            r2.l()     // Catch: java.lang.Exception -> L35
            return
        L28:
            boolean r0 = r2.h()     // Catch: java.lang.Exception -> L35
            if (r0 == 0) goto L32
            r2.k()     // Catch: java.lang.Exception -> L35
            return
        L32:
            r2.j()     // Catch: java.lang.Exception -> L35
        L35:
            return
    }

    private void j() {
            r2 = this;
            java.lang.String r0 = "ShakeUtil"
            java.lang.String r1 = "setShakeSensitivityNormal"
            com.beizi.ad.lance.a.m.a(r0, r1)     // Catch: java.lang.Exception -> L69
            r2.q()     // Catch: java.lang.Exception -> L69
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r2.f6508c     // Catch: java.lang.Exception -> L69
            if (r0 == 0) goto L3a
            int r0 = r0.getShakeCount()     // Catch: java.lang.Exception -> L69
            r2.b(r0)     // Catch: java.lang.Exception -> L69
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r2.f6508c     // Catch: java.lang.Exception -> L69
            double r0 = r0.getShakeStartAmplitude()     // Catch: java.lang.Exception -> L69
            r2.a(r0)     // Catch: java.lang.Exception -> L69
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r2.f6508c     // Catch: java.lang.Exception -> L69
            double r0 = r0.getShakeEndAmplitude()     // Catch: java.lang.Exception -> L69
            r2.b(r0)     // Catch: java.lang.Exception -> L69
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r2.f6508c     // Catch: java.lang.Exception -> L69
            double r0 = r0.getRotatAmplitude()     // Catch: java.lang.Exception -> L69
            r2.c(r0)     // Catch: java.lang.Exception -> L69
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r2.f6508c     // Catch: java.lang.Exception -> L69
            int r0 = r0.getRotatCount()     // Catch: java.lang.Exception -> L69
            r2.c(r0)     // Catch: java.lang.Exception -> L69
            return
        L3a:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r2.f6507b     // Catch: java.lang.Exception -> L69
            if (r0 == 0) goto L69
            int r0 = r0.getShakeCount()     // Catch: java.lang.Exception -> L69
            r2.b(r0)     // Catch: java.lang.Exception -> L69
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r2.f6507b     // Catch: java.lang.Exception -> L69
            double r0 = r0.getShakeStartAmplitude()     // Catch: java.lang.Exception -> L69
            r2.a(r0)     // Catch: java.lang.Exception -> L69
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r2.f6507b     // Catch: java.lang.Exception -> L69
            double r0 = r0.getShakeEndAmplitude()     // Catch: java.lang.Exception -> L69
            r2.b(r0)     // Catch: java.lang.Exception -> L69
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r2.f6507b     // Catch: java.lang.Exception -> L69
            double r0 = r0.getRotatAmplitude()     // Catch: java.lang.Exception -> L69
            r2.c(r0)     // Catch: java.lang.Exception -> L69
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$ShakeViewBean r0 = r2.f6507b     // Catch: java.lang.Exception -> L69
            int r0 = r0.getRotatCount()     // Catch: java.lang.Exception -> L69
            r2.c(r0)     // Catch: java.lang.Exception -> L69
        L69:
            return
    }

    private void k() {
            r5 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$AliaseShakeViewBean r0 = r5.f6509d     // Catch: java.lang.Exception -> L51
            if (r0 != 0) goto L5
            goto L51
        L5:
            java.lang.String r0 = "ShakeUtil"
            java.lang.String r1 = "setShakeSensitivityAliase"
            com.beizi.ad.lance.a.m.a(r0, r1)     // Catch: java.lang.Exception -> L51
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$AliaseShakeViewBean r0 = r5.f6509d     // Catch: java.lang.Exception -> L51
            int r0 = r0.getShakeCount()     // Catch: java.lang.Exception -> L51
            r5.b(r0)     // Catch: java.lang.Exception -> L51
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$AliaseShakeViewBean r0 = r5.f6509d     // Catch: java.lang.Exception -> L51
            double r0 = r0.getShakeStartAmplitude()     // Catch: java.lang.Exception -> L51
            r5.a(r0)     // Catch: java.lang.Exception -> L51
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$AliaseShakeViewBean r0 = r5.f6509d     // Catch: java.lang.Exception -> L51
            double r0 = r0.getShakeEndAmplitude()     // Catch: java.lang.Exception -> L51
            r5.b(r0)     // Catch: java.lang.Exception -> L51
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$AliaseShakeViewBean r0 = r5.f6509d     // Catch: java.lang.Exception -> L51
            double r0 = r0.getRotatAmplitude()     // Catch: java.lang.Exception -> L51
            r5.c(r0)     // Catch: java.lang.Exception -> L51
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$AliaseShakeViewBean r0 = r5.f6509d     // Catch: java.lang.Exception -> L51
            int r0 = r0.getRotatCount()     // Catch: java.lang.Exception -> L51
            r5.c(r0)     // Catch: java.lang.Exception -> L51
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$AliaseShakeViewBean r0 = r5.f6509d     // Catch: java.lang.Exception -> L51
            int r0 = r0.getPassivationTime()     // Catch: java.lang.Exception -> L51
            int r0 = r5.a(r0)     // Catch: java.lang.Exception -> L51
            android.os.Handler r1 = new android.os.Handler     // Catch: java.lang.Exception -> L51
            r1.<init>()     // Catch: java.lang.Exception -> L51
            com.beizi.ad.a.a.e$1 r2 = new com.beizi.ad.a.a.e$1     // Catch: java.lang.Exception -> L51
            r2.<init>(r5)     // Catch: java.lang.Exception -> L51
            long r3 = (long) r0     // Catch: java.lang.Exception -> L51
            r1.postDelayed(r2, r3)     // Catch: java.lang.Exception -> L51
        L51:
            return
    }

    private void l() {
            r2 = this;
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r0 = r2.f6510e     // Catch: java.lang.Exception -> L39
            if (r0 != 0) goto L5
            goto L39
        L5:
            java.lang.String r0 = "ShakeUtil"
            java.lang.String r1 = "setShakeSensitivityCool"
            com.beizi.ad.lance.a.m.a(r0, r1)     // Catch: java.lang.Exception -> L39
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r0 = r2.f6510e     // Catch: java.lang.Exception -> L39
            int r0 = r0.getShakeCount()     // Catch: java.lang.Exception -> L39
            r2.b(r0)     // Catch: java.lang.Exception -> L39
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r0 = r2.f6510e     // Catch: java.lang.Exception -> L39
            double r0 = r0.getShakeStartAmplitude()     // Catch: java.lang.Exception -> L39
            r2.a(r0)     // Catch: java.lang.Exception -> L39
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r0 = r2.f6510e     // Catch: java.lang.Exception -> L39
            double r0 = r0.getShakeEndAmplitude()     // Catch: java.lang.Exception -> L39
            r2.b(r0)     // Catch: java.lang.Exception -> L39
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r0 = r2.f6510e     // Catch: java.lang.Exception -> L39
            double r0 = r0.getRotatAmplitude()     // Catch: java.lang.Exception -> L39
            r2.c(r0)     // Catch: java.lang.Exception -> L39
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r0 = r2.f6510e     // Catch: java.lang.Exception -> L39
            int r0 = r0.getRotatCount()     // Catch: java.lang.Exception -> L39
            r2.c(r0)     // Catch: java.lang.Exception -> L39
        L39:
            return
    }

    private boolean m() {
            r8 = this;
            r0 = 0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r1 = r8.f6510e     // Catch: java.lang.Exception -> L2c
            if (r1 != 0) goto L6
            return r0
        L6:
            long r1 = r1.getCoolTime()     // Catch: java.lang.Exception -> L2c
            android.content.Context r3 = r8.a     // Catch: java.lang.Exception -> L2c
            java.lang.String r4 = r8.D     // Catch: java.lang.Exception -> L2c
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

    private boolean n() {
            r7 = this;
            r0 = 0
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r1 = r7.f6510e     // Catch: java.lang.Exception -> L1a
            if (r1 != 0) goto L6
            return r0
        L6:
            long r1 = r1.getUserProtectTime()     // Catch: java.lang.Exception -> L1a
            android.content.Context r3 = r7.a     // Catch: java.lang.Exception -> L1a
            long r3 = com.beizi.ad.lance.a.q.a(r3)     // Catch: java.lang.Exception -> L1a
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L1a
            long r5 = r5 - r3
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 >= 0) goto L1a
            r0 = 1
        L1a:
            return r0
    }

    private void o() {
            r4 = this;
            java.lang.String r0 = "ShakeUtil"
            java.lang.String r1 = "registerShakeListener"
            com.beizi.ad.lance.a.m.a(r0, r1)     // Catch: java.lang.Exception -> L3b
            r0 = 1
            r4.C = r0     // Catch: java.lang.Exception -> L3b
            r4.q()     // Catch: java.lang.Exception -> L3b
            android.hardware.SensorManager r1 = r4.l     // Catch: java.lang.Exception -> L3b
            if (r1 != 0) goto L25
            android.content.Context r1 = r4.a     // Catch: java.lang.Exception -> L3b
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Exception -> L3b
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)     // Catch: java.lang.Exception -> L3b
            java.lang.String r2 = "sensor"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Exception -> L3b
            android.hardware.SensorManager r1 = (android.hardware.SensorManager) r1     // Catch: java.lang.Exception -> L3b
            r4.l = r1     // Catch: java.lang.Exception -> L3b
        L25:
            android.hardware.Sensor r1 = r4.m     // Catch: java.lang.Exception -> L3b
            if (r1 != 0) goto L31
            android.hardware.SensorManager r1 = r4.l     // Catch: java.lang.Exception -> L3b
            android.hardware.Sensor r0 = r1.getDefaultSensor(r0)     // Catch: java.lang.Exception -> L3b
            r4.m = r0     // Catch: java.lang.Exception -> L3b
        L31:
            android.hardware.SensorManager r0 = r4.l     // Catch: java.lang.Exception -> L3b
            android.hardware.SensorEventListener r1 = r4.J     // Catch: java.lang.Exception -> L3b
            android.hardware.Sensor r2 = r4.m     // Catch: java.lang.Exception -> L3b
            r3 = 2
            r0.registerListener(r1, r2, r3)     // Catch: java.lang.Exception -> L3b
        L3b:
            return
    }

    private void p() {
            r2 = this;
            java.lang.String r0 = "ShakeUtil"
            java.lang.String r1 = "unRegisterShakeListener"
            com.beizi.ad.lance.a.m.a(r0, r1)     // Catch: java.lang.Exception -> L13
            r0 = 0
            r2.C = r0     // Catch: java.lang.Exception -> L13
            android.hardware.SensorManager r0 = r2.l     // Catch: java.lang.Exception -> L13
            if (r0 == 0) goto L13
            android.hardware.SensorEventListener r1 = r2.J     // Catch: java.lang.Exception -> L13
            r0.unregisterListener(r1)     // Catch: java.lang.Exception -> L13
        L13:
            return
    }

    private void q() {
            r3 = this;
            r0 = 0
            r3.x = r0
            r3.y = r0
            int r1 = r3.f6513h
            float r2 = (float) r1
            r3.o = r2
            float r2 = (float) r1
            r3.p = r2
            float r1 = (float) r1
            r3.q = r1
            int r1 = r3.f6514i
            r3.r = r1
            r1 = 0
            r3.P = r1
            r3.Q = r1
            r3.R = r1
            r3.S = r1
            r3.T = r1
            r3.U = r1
            r3.M = r1
            r3.W = r0
            int r1 = r3.K
            if (r1 <= 0) goto L2b
            r3.V = r0
        L2b:
            r3.Y = r0
            return
    }

    private synchronized void r() {
            r4 = this;
            monitor-enter(r4)
            com.beizi.ad.a.a.e$a r0 = r4.n     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L3d
            if (r0 == 0) goto L39
            boolean r0 = r4.z     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L3d
            if (r0 != 0) goto La
            goto L39
        La:
            boolean r0 = r4.Y     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L3d
            if (r0 == 0) goto L10
            monitor-exit(r4)
            return
        L10:
            r0 = 1
            r4.Y = r0     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L3d
            java.lang.String r0 = "ShakeUtil"
            java.lang.String r1 = "callBackResult"
            com.beizi.ad.lance.a.m.a(r0, r1)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L3d
            r4.b()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L3d
            boolean r0 = r4.B     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L3d
            if (r0 != 0) goto L33
            android.content.Context r0 = r4.a     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L3d
            java.lang.String r1 = r4.D     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L3d
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L3d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L3d
            com.beizi.ad.internal.h.m.c(r0, r1, r2)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L3d
            goto L33
        L31:
            r0 = move-exception
            goto L3b
        L33:
            com.beizi.ad.a.a.e$a r0 = r4.n     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L3d
            r0.a()     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L3d
            goto L3d
        L39:
            monitor-exit(r4)
            return
        L3b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L31
            throw r0
        L3d:
            monitor-exit(r4)
            return
    }

    private void s() {
            r4 = this;
            android.hardware.SensorManager r0 = r4.l     // Catch: java.lang.Exception -> L18
            if (r0 == 0) goto L18
            r1 = 4
            android.hardware.Sensor r0 = r0.getDefaultSensor(r1)     // Catch: java.lang.Exception -> L18
            r4.L = r0     // Catch: java.lang.Exception -> L18
            r1 = 1
            if (r0 == 0) goto L16
            android.hardware.SensorManager r2 = r4.l     // Catch: java.lang.Exception -> L18
            android.hardware.SensorEventListener r3 = r4.J     // Catch: java.lang.Exception -> L18
            r2.registerListener(r3, r0, r1)     // Catch: java.lang.Exception -> L18
            return
        L16:
            r4.V = r1     // Catch: java.lang.Exception -> L18
        L18:
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
            boolean r0 = r1.C     // Catch: java.lang.Exception -> L15
            if (r0 != 0) goto L15
            boolean r0 = r1.I     // Catch: java.lang.Exception -> L15
            if (r0 != 0) goto L9
            goto L15
        L9:
            r0 = 1
            r1.z = r0     // Catch: java.lang.Exception -> L15
            r1.i()     // Catch: java.lang.Exception -> L15
            r1.o()     // Catch: java.lang.Exception -> L15
            r1.e()     // Catch: java.lang.Exception -> L15
        L15:
            return
    }

    public void a(double r1) {
            r0 = this;
            r0.s = r1
            return
    }

    public void a(android.view.ViewGroup r11) {
            r10 = this;
            if (r11 == 0) goto Lbe
            android.content.Context r0 = r10.a     // Catch: java.lang.Exception -> Lbe
            if (r0 == 0) goto Lbe
            boolean r0 = r10.I     // Catch: java.lang.Exception -> Lbe
            if (r0 != 0) goto Lc
            goto Lbe
        Lc:
            android.widget.ImageView r0 = new android.widget.ImageView     // Catch: java.lang.Exception -> Lbe
            android.content.Context r1 = r10.a     // Catch: java.lang.Exception -> Lbe
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lbe
            r1 = 0
            r0.setVisibility(r1)     // Catch: java.lang.Exception -> Lbe
            int r2 = com.beizi.fusion.R.mipmap.beizi_interaction_icon_shake     // Catch: java.lang.Exception -> Lbe
            r0.setImageResource(r2)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r2 = r10.H     // Catch: java.lang.Exception -> Lbe
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> Lbe
            if (r2 != 0) goto L34
            android.content.Context r2 = r10.a     // Catch: java.lang.Exception -> Lbe
            com.beizi.ad.internal.h.i r2 = com.beizi.ad.internal.h.i.a(r2)     // Catch: java.lang.Exception -> Lbe
            java.lang.String r3 = r10.H     // Catch: java.lang.Exception -> Lbe
            com.beizi.ad.a.a.e$2 r4 = new com.beizi.ad.a.a.e$2     // Catch: java.lang.Exception -> Lbe
            r4.<init>(r10, r0)     // Catch: java.lang.Exception -> Lbe
            r2.b(r3, r4)     // Catch: java.lang.Exception -> Lbe
        L34:
            int[] r2 = r10.b(r11)     // Catch: java.lang.Exception -> Lbe
            boolean r3 = r11 instanceof android.widget.RelativeLayout     // Catch: java.lang.Exception -> Lbe
            r4 = 17
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = -2
            r9 = -1
            if (r3 == 0) goto L63
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams     // Catch: java.lang.Exception -> Lbe
            r3.<init>(r9, r8)     // Catch: java.lang.Exception -> Lbe
            r1 = r2[r1]     // Catch: java.lang.Exception -> Lbe
            if (r1 <= 0) goto L4e
            r3.width = r1     // Catch: java.lang.Exception -> Lbe
        L4e:
            r1 = r2[r7]     // Catch: java.lang.Exception -> Lbe
            if (r1 <= 0) goto L54
            r3.height = r1     // Catch: java.lang.Exception -> Lbe
        L54:
            r1 = r2[r6]     // Catch: java.lang.Exception -> Lbe
            r3.leftMargin = r1     // Catch: java.lang.Exception -> Lbe
            r1 = r2[r5]     // Catch: java.lang.Exception -> Lbe
            r3.topMargin = r1     // Catch: java.lang.Exception -> Lbe
            r3.addRule(r4)     // Catch: java.lang.Exception -> Lbe
            r11.addView(r0, r3)     // Catch: java.lang.Exception -> Lbe
            goto Lbb
        L63:
            boolean r3 = r11 instanceof android.widget.FrameLayout     // Catch: java.lang.Exception -> Lbe
            if (r3 == 0) goto L84
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Exception -> Lbe
            r3.<init>(r9, r8, r4)     // Catch: java.lang.Exception -> Lbe
            r1 = r2[r1]     // Catch: java.lang.Exception -> Lbe
            if (r1 <= 0) goto L72
            r3.width = r1     // Catch: java.lang.Exception -> Lbe
        L72:
            r1 = r2[r7]     // Catch: java.lang.Exception -> Lbe
            if (r1 <= 0) goto L78
            r3.height = r1     // Catch: java.lang.Exception -> Lbe
        L78:
            r1 = r2[r6]     // Catch: java.lang.Exception -> Lbe
            r3.leftMargin = r1     // Catch: java.lang.Exception -> Lbe
            r1 = r2[r5]     // Catch: java.lang.Exception -> Lbe
            r3.topMargin = r1     // Catch: java.lang.Exception -> Lbe
            r11.addView(r0, r3)     // Catch: java.lang.Exception -> Lbe
            goto Lbb
        L84:
            boolean r3 = r11 instanceof android.widget.LinearLayout     // Catch: java.lang.Exception -> Lbe
            if (r3 == 0) goto La7
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Exception -> Lbe
            r4 = 1099431936(0x41880000, float:17.0)
            r3.<init>(r9, r8, r4)     // Catch: java.lang.Exception -> Lbe
            r1 = r2[r1]     // Catch: java.lang.Exception -> Lbe
            if (r1 <= 0) goto L95
            r3.width = r1     // Catch: java.lang.Exception -> Lbe
        L95:
            r1 = r2[r7]     // Catch: java.lang.Exception -> Lbe
            if (r1 <= 0) goto L9b
            r3.height = r1     // Catch: java.lang.Exception -> Lbe
        L9b:
            r1 = r2[r6]     // Catch: java.lang.Exception -> Lbe
            r3.leftMargin = r1     // Catch: java.lang.Exception -> Lbe
            r1 = r2[r5]     // Catch: java.lang.Exception -> Lbe
            r3.topMargin = r1     // Catch: java.lang.Exception -> Lbe
            r11.addView(r0, r3)     // Catch: java.lang.Exception -> Lbe
            goto Lbb
        La7:
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams     // Catch: java.lang.Exception -> Lbe
            r3.<init>(r9, r8)     // Catch: java.lang.Exception -> Lbe
            r1 = r2[r1]     // Catch: java.lang.Exception -> Lbe
            if (r1 <= 0) goto Lb2
            r3.width = r1     // Catch: java.lang.Exception -> Lbe
        Lb2:
            r1 = r2[r7]     // Catch: java.lang.Exception -> Lbe
            if (r1 <= 0) goto Lb8
            r3.height = r1     // Catch: java.lang.Exception -> Lbe
        Lb8:
            r11.addView(r0, r3)     // Catch: java.lang.Exception -> Lbe
        Lbb:
            r10.a(r0)     // Catch: java.lang.Exception -> Lbe
        Lbe:
            return
    }

    public void a(android.widget.ImageView r7) {
            r6 = this;
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L49
            r2.<init>()     // Catch: java.lang.Exception -> L49
            java.lang.String r3 = "rotation"
            float r5 = r6.F     // Catch: java.lang.Exception -> L49
            r4 = 0
            r0 = r6
            r1 = r7
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L4a
            java.lang.String r3 = "rotation"
            float r4 = r0.F     // Catch: java.lang.Exception -> L4a
            r5 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L4a
            java.lang.String r3 = "rotation"
            float r7 = r0.F     // Catch: java.lang.Exception -> L4a
            float r5 = -r7
            r4 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L4a
            java.lang.String r3 = "rotation"
            float r7 = r0.F     // Catch: java.lang.Exception -> L4a
            float r4 = -r7
            r5 = 0
            r0.a(r1, r2, r3, r4, r5)     // Catch: java.lang.Exception -> L4a
            int r7 = r2.size()     // Catch: java.lang.Exception -> L4a
            if (r7 <= 0) goto L4a
            android.animation.AnimatorSet r7 = new android.animation.AnimatorSet     // Catch: java.lang.Exception -> L4a
            r7.<init>()     // Catch: java.lang.Exception -> L4a
            r0.G = r7     // Catch: java.lang.Exception -> L4a
            com.beizi.ad.a.a.e$3 r1 = new com.beizi.ad.a.a.e$3     // Catch: java.lang.Exception -> L4a
            r1.<init>(r6)     // Catch: java.lang.Exception -> L4a
            r7.addListener(r1)     // Catch: java.lang.Exception -> L4a
            android.animation.AnimatorSet r7 = r0.G     // Catch: java.lang.Exception -> L4a
            r7.playSequentially(r2)     // Catch: java.lang.Exception -> L4a
            android.animation.AnimatorSet r7 = r0.G     // Catch: java.lang.Exception -> L4a
            r7.start()     // Catch: java.lang.Exception -> L4a
            return
        L49:
            r0 = r6
        L4a:
            return
    }

    public void a(com.beizi.ad.a.a.e.a r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public void b() {
            r1 = this;
            r0 = 0
            r1.z = r0     // Catch: java.lang.Exception -> L9
            r1.p()     // Catch: java.lang.Exception -> L9
            r1.q()     // Catch: java.lang.Exception -> L9
        L9:
            return
    }

    public void b(double r1) {
            r0 = this;
            r0.t = r1
            return
    }

    public void b(int r1) {
            r0 = this;
            r0.v = r1
            return
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.H
            return r0
    }

    public void c(double r1) {
            r0 = this;
            r0.u = r1
            return
    }

    public void c(int r1) {
            r0 = this;
            r0.w = r1
            return
    }

    public void d() {
            r2 = this;
            r2.p()     // Catch: java.lang.Exception -> L1f
            r0 = 0
            r2.f6507b = r0     // Catch: java.lang.Exception -> L1f
            r2.f6508c = r0     // Catch: java.lang.Exception -> L1f
            r2.f6510e = r0     // Catch: java.lang.Exception -> L1f
            r2.f6509d = r0     // Catch: java.lang.Exception -> L1f
            r2.f6511f = r0     // Catch: java.lang.Exception -> L1f
            r2.a = r0     // Catch: java.lang.Exception -> L1f
            r2.l = r0     // Catch: java.lang.Exception -> L1f
            r2.m = r0     // Catch: java.lang.Exception -> L1f
            r2.n = r0     // Catch: java.lang.Exception -> L1f
            android.animation.AnimatorSet r1 = r2.G     // Catch: java.lang.Exception -> L1f
            if (r1 == 0) goto L1d
            r1.removeAllListeners()     // Catch: java.lang.Exception -> L1f
        L1d:
            r2.G = r0     // Catch: java.lang.Exception -> L1f
        L1f:
            return
    }

    public void e() {
            r1 = this;
            int r0 = r1.K
            if (r0 <= 0) goto L8
            r1.s()
            return
        L8:
            r0 = 1
            r1.V = r0
            return
    }
}
