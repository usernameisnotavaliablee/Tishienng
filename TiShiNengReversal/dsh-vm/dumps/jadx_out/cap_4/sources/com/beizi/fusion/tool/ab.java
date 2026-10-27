package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ab {
    private static android.hardware.SensorManager b;
    private float A;
    private float B;
    private float[] C;
    private float D;
    private float E;
    private float F;
    private float G;
    private float H;
    private float I;
    private boolean J;
    private boolean K;
    private long L;
    com.beizi.fusion.widget.ShakeView a;
    private android.content.Context c;
    private double d;
    private double e;
    private double f;
    private int g;
    private int h;
    private int i;
    private int j;
    private float k;

    /* renamed from: l, reason: collision with root package name */
    private float f21l;

    /* renamed from: m, reason: collision with root package name */
    private float f22m;

    /* renamed from: n, reason: collision with root package name */
    private int f23n;

    /* renamed from: o, reason: collision with root package name */
    private com.beizi.fusion.tool.ab.a f24o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f25p;

    /* renamed from: q, reason: collision with root package name */
    private int f26q;

    /* renamed from: r, reason: collision with root package name */
    private android.view.View f27r;

    /* renamed from: s, reason: collision with root package name */
    private long f28s;

    /* renamed from: t, reason: collision with root package name */
    private com.beizi.fusion.model.AdSpacesBean.BuyerBean.CoolShakeViewBean f29t;

    /* renamed from: u, reason: collision with root package name */
    private java.lang.String f30u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f31v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f32w;

    /* renamed from: x, reason: collision with root package name */
    private final android.hardware.SensorEventListener f33x;

    /* renamed from: y, reason: collision with root package name */
    private int f34y;

    /* renamed from: z, reason: collision with root package name */
    private android.hardware.Sensor f35z;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a();
    }

    public ab(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.i = r0
            r3.j = r0
            r1 = -1027080192(0xffffffffc2c80000, float:-100.0)
            r3.k = r1
            r3.f21l = r1
            r3.f22m = r1
            r3.f23n = r0
            r1 = 0
            r3.f24o = r1
            r3.f25p = r0
            r2 = 200(0xc8, float:2.8E-43)
            r3.f26q = r2
            r3.f27r = r1
            r1 = 0
            r3.f28s = r1
            r3.f31v = r0
            com.beizi.fusion.tool.ab$1 r0 = new com.beizi.fusion.tool.ab$1
            r0.<init>(r3)
            r3.f33x = r0
            r0 = 814313567(0x3089705f, float:1.0E-9)
            r3.B = r0
            r0 = 3
            float[] r0 = new float[r0]
            r3.C = r0
            r3.c = r4
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            java.lang.String r0 = "sensor"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.hardware.SensorManager r4 = (android.hardware.SensorManager) r4
            com.beizi.fusion.tool.ab.b = r4
            return
    }

    private void a(android.hardware.SensorEvent r15) {
            r14 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r14.f28s
            long r0 = r0 - r2
            r2 = 200(0xc8, double:9.9E-322)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L10
        Ld:
            r1 = r14
            goto L12a
        L10:
            android.view.View r0 = r14.f27r
            boolean r0 = com.beizi.fusion.tool.ar.a(r0)
            if (r0 != 0) goto L1c
            r14.d()
            return
        L1c:
            boolean r0 = r14.f31v
            if (r0 == 0) goto L41
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r0 = r14.f29t
            if (r0 == 0) goto L41
            java.lang.String r0 = r14.f30u
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L41
            com.beizi.fusion.tool.ak r0 = com.beizi.fusion.tool.ak.a()
            java.lang.String r1 = r14.f30u
            long r0 = r0.b(r1)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L41
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$CoolShakeViewBean r0 = r14.f29t
            r14.a(r0)
        L41:
            float[] r15 = r15.values
            if (r15 == 0) goto Ld
            int r0 = r15.length
            r1 = 3
            if (r0 >= r1) goto L4a
            goto Ld
        L4a:
            r0 = 0
            r2 = r15[r0]
            r0 = 1
            r3 = r15[r0]
            r7 = 2
            r4 = r15[r7]
            float r15 = r14.k
            r1 = -1027080192(0xffffffffc2c80000, float:-100.0)
            int r15 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r15 != 0) goto L5d
            r14.k = r2
        L5d:
            float r15 = r14.f21l
            int r15 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r15 != 0) goto L65
            r14.f21l = r3
        L65:
            float r15 = r14.f22m
            int r15 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r15 != 0) goto L6d
            r14.f22m = r4
        L6d:
            float r15 = r14.k
            float r15 = r2 - r15
            float r15 = java.lang.Math.abs(r15)
            double r5 = (double) r15
            r8 = 4621706527598287258(0x402399999999999a, double:9.8)
            double r5 = r5 / r8
            float r15 = r14.f21l
            float r15 = r3 - r15
            float r15 = java.lang.Math.abs(r15)
            double r10 = (double) r15
            double r10 = r10 / r8
            float r15 = r14.f22m
            float r15 = r4 - r15
            float r15 = java.lang.Math.abs(r15)
            double r12 = (double) r15
            double r12 = r12 / r8
            double r8 = r14.f
            int r15 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r15 <= 0) goto L9d
            int r15 = r14.j
            int r15 = r15 + r0
            r14.j = r15
            r14.k = r2
        L9d:
            int r15 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r15 <= 0) goto La8
            int r15 = r14.j
            int r15 = r15 + r0
            r14.j = r15
            r14.f21l = r3
        La8:
            int r15 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r15 <= 0) goto Lb3
            int r15 = r14.j
            int r15 = r15 + r0
            r14.j = r15
            r14.f22m = r4
        Lb3:
            double r5 = r14.d
            r1 = r14
            boolean r15 = r1.a(r2, r3, r4, r5)
            if (r15 == 0) goto Lbe
            r1.f23n = r0
        Lbe:
            int r15 = r1.f23n
            if (r15 != r0) goto Ld1
            double r5 = r1.e
            boolean r15 = r1.b(r2, r3, r4, r5)
            if (r15 == 0) goto Ld1
            r1.f23n = r7
            int r15 = r1.i
            int r15 = r15 + r0
            r1.i = r15
        Ld1:
            int r15 = r1.g
            if (r15 <= 0) goto Ld9
            int r2 = r1.i
            if (r2 >= r15) goto Le1
        Ld9:
            int r15 = r1.h
            if (r15 <= 0) goto L124
            int r2 = r1.j
            if (r2 < r15) goto L124
        Le1:
            r1.K = r0
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "mShakeCount = "
            r15.append(r0)
            int r0 = r1.i
            r15.append(r0)
            java.lang.String r0 = ",dstShakeCount = "
            r15.append(r0)
            int r0 = r1.g
            r15.append(r0)
            java.lang.String r0 = ",mRotateCount = "
            r15.append(r0)
            int r0 = r1.j
            r15.append(r0)
            java.lang.String r0 = ",dstRotateCount = "
            r15.append(r0)
            int r0 = r1.h
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.String r0 = "ShakeUtil"
            com.beizi.fusion.tool.aa.b(r0, r15)
            boolean r15 = r1.K
            if (r15 == 0) goto L124
            boolean r15 = r1.J
            if (r15 == 0) goto L124
            r14.a()
        L124:
            long r2 = java.lang.System.currentTimeMillis()
            r1.f28s = r2
        L12a:
            return
    }

    static /* synthetic */ void a(com.beizi.fusion.tool.ab r0, android.hardware.SensorEvent r1) {
            r0.a(r1)
            return
    }

    private boolean a(float r7, float r8, float r9, double r10) {
            r6 = this;
            double r0 = (double) r7
            r2 = 4621706527598287258(0x402399999999999a, double:9.8)
            double r0 = r0 / r2
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r0, r4)
            double r7 = (double) r8
            double r7 = r7 / r2
            double r7 = java.lang.Math.pow(r7, r4)
            double r0 = r0 + r7
            double r7 = (double) r9
            double r7 = r7 / r2
            double r7 = java.lang.Math.pow(r7, r4)
            double r0 = r0 + r7
            double r7 = java.lang.Math.sqrt(r0)
            int r9 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r9 <= 0) goto L25
            r7 = 1
            return r7
        L25:
            r7 = 0
            return r7
    }

    private void b(android.hardware.SensorEvent r15) {
            r14 = this;
            java.lang.String r0 = "%.4f"
            if (r15 == 0) goto L1af
            boolean r1 = r14.f25p     // Catch: java.lang.Exception -> L1af
            if (r1 == 0) goto La
            goto L1af
        La:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L1af
            long r3 = r14.L     // Catch: java.lang.Exception -> L1af
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
            r14.L = r3     // Catch: java.lang.Exception -> L1af
            float r1 = r14.A     // Catch: java.lang.Exception -> L1af
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
            float r1 = r14.B     // Catch: java.lang.Exception -> L1af
            float r9 = r9 * r1
            float[] r1 = r14.C     // Catch: java.lang.Exception -> L1af
            r10 = r1[r4]     // Catch: java.lang.Exception -> L1af
            double r10 = (double) r10     // Catch: java.lang.Exception -> L1af
            float r5 = r5 * r9
            double r12 = (double) r5     // Catch: java.lang.Exception -> L1af
            double r12 = java.lang.Math.toDegrees(r12)     // Catch: java.lang.Exception -> L1af
            double r10 = r10 + r12
            float r5 = (float) r10     // Catch: java.lang.Exception -> L1af
            r1[r4] = r5     // Catch: java.lang.Exception -> L1af
            float[] r1 = r14.C     // Catch: java.lang.Exception -> L1af
            r5 = r1[r6]     // Catch: java.lang.Exception -> L1af
            double r10 = (double) r5     // Catch: java.lang.Exception -> L1af
            float r7 = r7 * r9
            double r12 = (double) r7     // Catch: java.lang.Exception -> L1af
            double r12 = java.lang.Math.toDegrees(r12)     // Catch: java.lang.Exception -> L1af
            double r10 = r10 + r12
            float r5 = (float) r10     // Catch: java.lang.Exception -> L1af
            r1[r6] = r5     // Catch: java.lang.Exception -> L1af
            float[] r1 = r14.C     // Catch: java.lang.Exception -> L1af
            r5 = r1[r8]     // Catch: java.lang.Exception -> L1af
            double r10 = (double) r5     // Catch: java.lang.Exception -> L1af
            float r2 = r2 * r9
            double r12 = (double) r2     // Catch: java.lang.Exception -> L1af
            double r12 = java.lang.Math.toDegrees(r12)     // Catch: java.lang.Exception -> L1af
            double r10 = r10 + r12
            float r2 = (float) r10     // Catch: java.lang.Exception -> L1af
            r1[r8] = r2     // Catch: java.lang.Exception -> L1af
            float[] r1 = r14.C     // Catch: java.lang.Exception -> L1af
            r2 = r1[r4]     // Catch: java.lang.Exception -> L1af
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 <= 0) goto L87
            float r5 = r14.G     // Catch: java.lang.Exception -> L1af
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L8f
            r14.G = r2     // Catch: java.lang.Exception -> L1af
            goto L8f
        L87:
            float r5 = r14.D     // Catch: java.lang.Exception -> L1af
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L8f
            r14.D = r2     // Catch: java.lang.Exception -> L1af
        L8f:
            r2 = r1[r6]     // Catch: java.lang.Exception -> L1af
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 <= 0) goto L9e
            float r5 = r14.H     // Catch: java.lang.Exception -> L1af
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto La6
            r14.H = r2     // Catch: java.lang.Exception -> L1af
            goto La6
        L9e:
            float r5 = r14.E     // Catch: java.lang.Exception -> L1af
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto La6
            r14.E = r2     // Catch: java.lang.Exception -> L1af
        La6:
            r1 = r1[r8]     // Catch: java.lang.Exception -> L1af
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 <= 0) goto Lb5
            float r2 = r14.I     // Catch: java.lang.Exception -> L1af
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto Lbd
            r14.I = r1     // Catch: java.lang.Exception -> L1af
            goto Lbd
        Lb5:
            float r2 = r14.F     // Catch: java.lang.Exception -> L1af
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto Lbd
            r14.F = r1     // Catch: java.lang.Exception -> L1af
        Lbd:
            float r1 = r14.D     // Catch: java.lang.Exception -> L1af
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L1af
            int r2 = r14.f34y     // Catch: java.lang.Exception -> L1af
            float r2 = (float) r2     // Catch: java.lang.Exception -> L1af
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto Ld7
            float r1 = r14.G     // Catch: java.lang.Exception -> L1af
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L1af
            int r2 = r14.f34y     // Catch: java.lang.Exception -> L1af
            float r2 = (float) r2     // Catch: java.lang.Exception -> L1af
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L10b
        Ld7:
            float r1 = r14.E     // Catch: java.lang.Exception -> L1af
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L1af
            int r2 = r14.f34y     // Catch: java.lang.Exception -> L1af
            float r2 = (float) r2     // Catch: java.lang.Exception -> L1af
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto Lf1
            float r1 = r14.H     // Catch: java.lang.Exception -> L1af
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L1af
            int r2 = r14.f34y     // Catch: java.lang.Exception -> L1af
            float r2 = (float) r2     // Catch: java.lang.Exception -> L1af
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L10b
        Lf1:
            float r1 = r14.F     // Catch: java.lang.Exception -> L1af
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L1af
            int r2 = r14.f34y     // Catch: java.lang.Exception -> L1af
            float r2 = (float) r2     // Catch: java.lang.Exception -> L1af
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L19f
            float r1 = r14.I     // Catch: java.lang.Exception -> L1af
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L1af
            int r2 = r14.f34y     // Catch: java.lang.Exception -> L1af
            float r2 = (float) r2     // Catch: java.lang.Exception -> L1af
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L19f
        L10b:
            java.lang.String r1 = "ShakeUtil"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1af
            r2.<init>()     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = "rotate  xMin: "
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            float r3 = r14.D     // Catch: java.lang.Exception -> L1af
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L1af
            r5[r4] = r3     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = java.lang.String.format(r0, r5)     // Catch: java.lang.Exception -> L1af
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = ",xMax: "
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            float r3 = r14.G     // Catch: java.lang.Exception -> L1af
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L1af
            r5[r4] = r3     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = java.lang.String.format(r0, r5)     // Catch: java.lang.Exception -> L1af
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = ",yMin: "
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            float r3 = r14.E     // Catch: java.lang.Exception -> L1af
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L1af
            r5[r4] = r3     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = java.lang.String.format(r0, r5)     // Catch: java.lang.Exception -> L1af
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = ",yMax: "
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            float r3 = r14.H     // Catch: java.lang.Exception -> L1af
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L1af
            r5[r4] = r3     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = java.lang.String.format(r0, r5)     // Catch: java.lang.Exception -> L1af
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = ",zMin: "
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            float r3 = r14.F     // Catch: java.lang.Exception -> L1af
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L1af
            r5[r4] = r3     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = java.lang.String.format(r0, r5)     // Catch: java.lang.Exception -> L1af
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = ",zMax: "
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            float r3 = r14.I     // Catch: java.lang.Exception -> L1af
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L1af
            r5[r4] = r3     // Catch: java.lang.Exception -> L1af
            java.lang.String r0 = java.lang.String.format(r0, r5)     // Catch: java.lang.Exception -> L1af
            r2.append(r0)     // Catch: java.lang.Exception -> L1af
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L1af
            com.beizi.fusion.tool.aa.a(r1, r0)     // Catch: java.lang.Exception -> L1af
            r14.J = r6     // Catch: java.lang.Exception -> L1af
        L19f:
            boolean r0 = r14.K     // Catch: java.lang.Exception -> L1af
            if (r0 == 0) goto L1aa
            boolean r0 = r14.J     // Catch: java.lang.Exception -> L1af
            if (r0 == 0) goto L1aa
            r14.a()     // Catch: java.lang.Exception -> L1af
        L1aa:
            long r0 = r15.timestamp     // Catch: java.lang.Exception -> L1af
            float r15 = (float) r0     // Catch: java.lang.Exception -> L1af
            r14.A = r15     // Catch: java.lang.Exception -> L1af
        L1af:
            return
    }

    static /* synthetic */ void b(com.beizi.fusion.tool.ab r0, android.hardware.SensorEvent r1) {
            r0.b(r1)
            return
    }

    private boolean b(float r7, float r8, float r9, double r10) {
            r6 = this;
            double r0 = (double) r7
            r2 = 4621706527598287258(0x402399999999999a, double:9.8)
            double r0 = r0 / r2
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r0, r4)
            double r7 = (double) r8
            double r7 = r7 / r2
            double r7 = java.lang.Math.pow(r7, r4)
            double r0 = r0 + r7
            double r7 = (double) r9
            double r7 = r7 / r2
            double r7 = java.lang.Math.pow(r7, r4)
            double r0 = r0 + r7
            double r7 = java.lang.Math.sqrt(r0)
            int r9 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r9 >= 0) goto L25
            r7 = 1
            return r7
        L25:
            r7 = 0
            return r7
    }

    private void e() {
            r4 = this;
            android.hardware.SensorManager r0 = com.beizi.fusion.tool.ab.b     // Catch: java.lang.Exception -> L18
            if (r0 == 0) goto L18
            r1 = 4
            android.hardware.Sensor r0 = r0.getDefaultSensor(r1)     // Catch: java.lang.Exception -> L18
            r4.f35z = r0     // Catch: java.lang.Exception -> L18
            r1 = 1
            if (r0 == 0) goto L16
            android.hardware.SensorManager r2 = com.beizi.fusion.tool.ab.b     // Catch: java.lang.Exception -> L18
            android.hardware.SensorEventListener r3 = r4.f33x     // Catch: java.lang.Exception -> L18
            r2.registerListener(r3, r0, r1)     // Catch: java.lang.Exception -> L18
            return
        L16:
            r4.J = r1     // Catch: java.lang.Exception -> L18
        L18:
            return
    }

    public android.view.View a(int r10, int r11, com.beizi.fusion.model.AdSpacesBean.BuyerBean.PercentPositionBean r12) {
            r9 = this;
            java.lang.String r0 = "enter getShakeView"
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.a(r1, r0)
            android.content.Context r0 = r9.c
            if (r0 == 0) goto L1c3
            if (r12 != 0) goto Lf
            goto L1c3
        Lf:
            com.beizi.fusion.widget.ShakeView r0 = new com.beizi.fusion.widget.ShakeView
            android.content.Context r2 = r9.c
            r0.<init>(r2)
            r9.a = r0
            java.lang.String r0 = r12.getCenterX()
            java.lang.String r2 = r12.getCenterY()
            java.lang.String r3 = r12.getWidth()
            java.lang.String r12 = r12.getHeight()
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r5 = "50%"
            java.lang.String r6 = "0"
            if (r4 != 0) goto L38
            boolean r4 = r6.equals(r0)
            if (r4 == 0) goto L39
        L38:
            r0 = r5
        L39:
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L45
            boolean r4 = r6.equals(r2)
            if (r4 == 0) goto L46
        L45:
            r2 = r5
        L46:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r5 = "180"
            if (r4 != 0) goto L54
            boolean r4 = r6.equals(r3)
            if (r4 == 0) goto L55
        L54:
            r3 = r5
        L55:
            boolean r4 = android.text.TextUtils.isEmpty(r12)
            if (r4 != 0) goto L61
            boolean r4 = r6.equals(r12)
            if (r4 == 0) goto L62
        L61:
            r12 = r5
        L62:
            android.content.Context r4 = r9.c
            float r4 = com.beizi.fusion.tool.ap.i(r4)
            java.lang.String r5 = "%"
            boolean r6 = r0.endsWith(r5)
            r7 = 0
            if (r6 == 0) goto L82
            int r6 = r0.indexOf(r5)
            java.lang.String r0 = r0.substring(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
            int r0 = r0 * r10
            int r0 = r0 / 100
            goto L86
        L82:
            int r0 = java.lang.Integer.parseInt(r0)
        L86:
            boolean r6 = r2.endsWith(r5)
            if (r6 == 0) goto L9d
            int r6 = r2.indexOf(r5)
            java.lang.String r2 = r2.substring(r7, r6)
            int r2 = java.lang.Integer.parseInt(r2)
            int r2 = r2 * r11
            int r2 = r2 / 100
            goto La1
        L9d:
            int r2 = java.lang.Integer.parseInt(r2)
        La1:
            boolean r6 = r3.endsWith(r5)
            r8 = 400(0x190, float:5.6E-43)
            if (r6 == 0) goto Lc7
            int r6 = r3.indexOf(r5)
            java.lang.String r3 = r3.substring(r7, r6)
            int r3 = java.lang.Integer.parseInt(r3)
            r6 = 1137180672(0x43c80000, float:400.0)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto Lc0
            int r3 = r3 * 400
            int r3 = r3 / 100
            goto Lce
        Lc0:
            int r4 = (int) r4
            int r4 = r4 * r3
            int r4 = r4 / 100
            r8 = r4
            goto Lcf
        Lc7:
            int r3 = java.lang.Integer.parseInt(r3)
            if (r3 < r8) goto Lce
            goto Lcf
        Lce:
            r8 = r3
        Lcf:
            boolean r3 = r12.endsWith(r5)
            if (r3 == 0) goto Le6
            int r3 = r12.indexOf(r5)
            java.lang.String r12 = r12.substring(r7, r3)
            int r12 = java.lang.Integer.parseInt(r12)
            int r12 = r12 * r8
            int r12 = r12 / 100
            goto Lea
        Le6:
            int r12 = java.lang.Integer.parseInt(r12)
        Lea:
            android.content.Context r3 = r9.c
            float r4 = (float) r8
            int r3 = com.beizi.fusion.tool.ap.a(r3, r4)
            android.content.Context r4 = r9.c
            float r12 = (float) r12
            int r12 = com.beizi.fusion.tool.ap.a(r4, r12)
            android.content.Context r4 = r9.c
            float r0 = (float) r0
            int r0 = com.beizi.fusion.tool.ap.a(r4, r0)
            android.content.Context r4 = r9.c
            float r2 = (float) r2
            int r2 = com.beizi.fusion.tool.ap.a(r4, r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "widthInt = "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = ",heightInt = "
            r4.append(r5)
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            com.beizi.fusion.tool.aa.a(r1, r4)
            if (r3 != 0) goto L126
            r3 = 180(0xb4, float:2.52E-43)
        L126:
            if (r12 != 0) goto L129
            r12 = r3
        L129:
            android.view.ViewGroup$MarginLayoutParams r4 = new android.view.ViewGroup$MarginLayoutParams
            r4.<init>(r3, r12)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "centerYInt = "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = ",centerXInt = "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r7 = ",adWidthDp = "
            r6.append(r7)
            r6.append(r10)
            java.lang.String r7 = ",adHeightDp = "
            r6.append(r7)
            r6.append(r11)
            java.lang.String r6 = r6.toString()
            com.beizi.fusion.tool.aa.a(r1, r6)
            if (r2 != 0) goto L165
            android.content.Context r2 = r9.c
            float r11 = (float) r11
            int r11 = com.beizi.fusion.tool.ap.a(r2, r11)
            int r2 = r11 / 2
        L165:
            if (r0 != 0) goto L170
            android.content.Context r11 = r9.c
            float r10 = (float) r10
            int r10 = com.beizi.fusion.tool.ap.a(r11, r10)
            int r0 = r10 / 2
        L170:
            int r10 = r12 / 2
            int r2 = r2 - r10
            r4.topMargin = r2
            int r10 = r3 / 2
            int r0 = r0 - r10
            r4.leftMargin = r0
            com.beizi.fusion.widget.ShakeView r10 = r9.a
            r10.setLayoutParams(r4)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "topMargin = "
            r10.append(r11)
            int r11 = r4.topMargin
            r10.append(r11)
            java.lang.String r11 = ",leftMargin = "
            r10.append(r11)
            int r11 = r4.leftMargin
            r10.append(r11)
            java.lang.String r11 = ",widthInt = "
            r10.append(r11)
            r10.append(r3)
            r10.append(r5)
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            com.beizi.fusion.tool.aa.a(r1, r10)
            com.beizi.fusion.widget.ShakeView r10 = r9.a
            boolean r11 = r9.f32w
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r10.setDownloadApp(r11)
            com.beizi.fusion.widget.ShakeView r10 = r9.a
            r10.startShake()
            r9.b()
            com.beizi.fusion.widget.ShakeView r10 = r9.a
            return r10
        L1c3:
            r10 = 0
            return r10
    }

    public android.view.View a(int r10, int r11, com.beizi.fusion.model.AdSpacesBean.BuyerBean.PercentPositionBean r12, java.lang.String r13) {
            r9 = this;
            java.lang.String r0 = "enter getShakeView"
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.a(r1, r0)
            android.content.Context r0 = r9.c
            if (r0 == 0) goto L1cf
            if (r12 != 0) goto Lf
            goto L1cf
        Lf:
            java.lang.String r0 = r12.getCenterX()
            java.lang.String r2 = r12.getCenterY()
            java.lang.String r3 = r12.getWidth()
            java.lang.String r12 = r12.getHeight()
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r5 = "0"
            if (r4 != 0) goto L2d
            boolean r4 = r5.equals(r0)
            if (r4 == 0) goto L2e
        L2d:
            r0 = r5
        L2e:
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L3a
            boolean r4 = r5.equals(r2)
            if (r4 == 0) goto L3b
        L3a:
            r2 = r5
        L3b:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L47
            boolean r4 = r5.equals(r3)
            if (r4 == 0) goto L49
        L47:
            java.lang.String r3 = "120"
        L49:
            boolean r4 = android.text.TextUtils.isEmpty(r12)
            if (r4 != 0) goto L55
            boolean r4 = r5.equals(r12)
            if (r4 == 0) goto L57
        L55:
            java.lang.String r12 = "36"
        L57:
            android.content.Context r4 = r9.c
            float r4 = com.beizi.fusion.tool.ap.i(r4)
            java.lang.String r5 = "%"
            boolean r6 = r0.endsWith(r5)
            r7 = 0
            if (r6 == 0) goto L77
            int r6 = r0.indexOf(r5)
            java.lang.String r0 = r0.substring(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
            int r0 = r0 * r10
            int r0 = r0 / 100
            goto L7b
        L77:
            int r0 = java.lang.Integer.parseInt(r0)
        L7b:
            boolean r6 = r2.endsWith(r5)
            if (r6 == 0) goto L92
            int r6 = r2.indexOf(r5)
            java.lang.String r2 = r2.substring(r7, r6)
            int r2 = java.lang.Integer.parseInt(r2)
            int r2 = r2 * r11
            int r2 = r2 / 100
            goto L96
        L92:
            int r2 = java.lang.Integer.parseInt(r2)
        L96:
            boolean r6 = r3.endsWith(r5)
            r8 = 400(0x190, float:5.6E-43)
            if (r6 == 0) goto Lbc
            int r6 = r3.indexOf(r5)
            java.lang.String r3 = r3.substring(r7, r6)
            int r3 = java.lang.Integer.parseInt(r3)
            r6 = 1137180672(0x43c80000, float:400.0)
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto Lb5
            int r3 = r3 * 400
            int r3 = r3 / 100
            goto Lc3
        Lb5:
            int r4 = (int) r4
            int r4 = r4 * r3
            int r4 = r4 / 100
            r8 = r4
            goto Lc4
        Lbc:
            int r3 = java.lang.Integer.parseInt(r3)
            if (r3 < r8) goto Lc3
            goto Lc4
        Lc3:
            r8 = r3
        Lc4:
            boolean r3 = r12.endsWith(r5)
            if (r3 == 0) goto Ldb
            int r3 = r12.indexOf(r5)
            java.lang.String r12 = r12.substring(r7, r3)
            int r12 = java.lang.Integer.parseInt(r12)
            int r12 = r12 * r8
            int r12 = r12 / 100
            goto Ldf
        Ldb:
            int r12 = java.lang.Integer.parseInt(r12)
        Ldf:
            android.content.Context r3 = r9.c
            float r4 = (float) r8
            int r3 = com.beizi.fusion.tool.ap.a(r3, r4)
            android.content.Context r4 = r9.c
            float r12 = (float) r12
            int r12 = com.beizi.fusion.tool.ap.a(r4, r12)
            android.content.Context r4 = r9.c
            float r0 = (float) r0
            int r0 = com.beizi.fusion.tool.ap.a(r4, r0)
            android.content.Context r4 = r9.c
            float r2 = (float) r2
            int r2 = com.beizi.fusion.tool.ap.a(r4, r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "widthInt = "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = ",heightInt = "
            r4.append(r5)
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            com.beizi.fusion.tool.aa.a(r1, r4)
            if (r3 != 0) goto L11b
            r3 = 360(0x168, float:5.04E-43)
        L11b:
            if (r12 != 0) goto L11f
            r12 = 108(0x6c, float:1.51E-43)
        L11f:
            android.view.ViewGroup$MarginLayoutParams r4 = new android.view.ViewGroup$MarginLayoutParams
            r4.<init>(r3, r12)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "centerYInt = "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = ",centerXInt = "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r7 = ",adWidthDp = "
            r6.append(r7)
            r6.append(r10)
            java.lang.String r10 = ",adHeightDp = "
            r6.append(r10)
            r6.append(r11)
            java.lang.String r10 = r6.toString()
            com.beizi.fusion.tool.aa.a(r1, r10)
            android.content.Context r10 = r9.c
            float r11 = (float) r11
            int r10 = com.beizi.fusion.tool.ap.a(r10, r11)
            int r10 = r10 - r2
            int r10 = r10 - r12
            r4.topMargin = r10
            r4.leftMargin = r0
            boolean r10 = android.text.TextUtils.isEmpty(r13)
            if (r10 == 0) goto L17a
            android.widget.ImageView r10 = new android.widget.ImageView
            android.content.Context r11 = r9.c
            r10.<init>(r11)
            boolean r11 = r9.f32w
            if (r11 != 0) goto L174
            int r11 = com.beizi.fusion.R.drawable.beizi_icon_shake_native
            r10.setImageResource(r11)
            goto L19a
        L174:
            int r11 = com.beizi.fusion.R.drawable.beizi_icon_shake_native_download
            r10.setImageResource(r11)
            goto L19a
        L17a:
            android.widget.TextView r10 = new android.widget.TextView
            android.content.Context r11 = r9.c
            r10.<init>(r11)
            r10.setText(r13)
            java.lang.String r11 = "#FFFFFFFF"
            int r11 = android.graphics.Color.parseColor(r11)
            r10.setTextColor(r11)
            java.lang.String r11 = "#8C000000"
            int r11 = android.graphics.Color.parseColor(r11)
            r13 = 1084227584(0x40a00000, float:5.0)
            r0 = 1082130432(0x40800000, float:4.0)
            r10.setShadowLayer(r13, r0, r0, r11)
        L19a:
            r10.setLayoutParams(r4)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "topMargin = "
            r11.append(r13)
            int r13 = r4.topMargin
            r11.append(r13)
            java.lang.String r13 = ",leftMargin = "
            r11.append(r13)
            int r13 = r4.leftMargin
            r11.append(r13)
            java.lang.String r13 = ",widthInt = "
            r11.append(r13)
            r11.append(r3)
            r11.append(r5)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.beizi.fusion.tool.aa.a(r1, r11)
            r9.b()
            return r10
        L1cf:
            r10 = 0
            return r10
    }

    protected synchronized void a() {
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "BeiZis"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r1.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = "enter callBackShakeHappened and mShakeStateListener != null ? "
            r1.append(r2)     // Catch: java.lang.Throwable -> L41
            com.beizi.fusion.tool.ab$a r2 = r4.f24o     // Catch: java.lang.Throwable -> L41
            r3 = 1
            if (r2 == 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            r1.append(r2)     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = ",!isCallBack = "
            r1.append(r2)     // Catch: java.lang.Throwable -> L41
            boolean r2 = r4.f25p     // Catch: java.lang.Throwable -> L41
            r2 = r2 ^ r3
            r1.append(r2)     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L41
            com.beizi.fusion.tool.aa.a(r0, r1)     // Catch: java.lang.Throwable -> L41
            com.beizi.fusion.tool.ab$a r0 = r4.f24o     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L43
            boolean r0 = r4.f25p     // Catch: java.lang.Throwable -> L41
            if (r0 != 0) goto L43
            java.lang.String r0 = "BeiZis"
            java.lang.String r1 = "callback onShakeHappened()"
            com.beizi.fusion.tool.aa.a(r0, r1)     // Catch: java.lang.Throwable -> L41
            r4.f25p = r3     // Catch: java.lang.Throwable -> L41
            com.beizi.fusion.tool.ab$a r0 = r4.f24o     // Catch: java.lang.Throwable -> L41
            r0.a()     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r0 = move-exception
            goto L45
        L43:
            monitor-exit(r4)
            return
        L45:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L41
            throw r0
    }

    public void a(double r1) {
            r0 = this;
            r0.d = r1
            return
    }

    public void a(int r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void a(android.view.View r1) {
            r0 = this;
            r0.f27r = r1
            return
    }

    public void a(com.beizi.fusion.model.AdSpacesBean.BuyerBean.CoolShakeViewBean r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L4f
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setShakeCoolParams mShakeCount:"
            r0.append(r1)
            int r1 = r3.getShakeCount()
            r0.append(r1)
            java.lang.String r1 = ";mRotateCount:"
            r0.append(r1)
            int r1 = r3.getRotatCount()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ShakeUtil"
            com.beizi.fusion.tool.aa.c(r1, r0)
            r0 = 0
            r2.f31v = r0     // Catch: java.lang.Exception -> L4f
            int r0 = r3.getShakeCount()     // Catch: java.lang.Exception -> L4f
            r2.a(r0)     // Catch: java.lang.Exception -> L4f
            double r0 = r3.getShakeStartAmplitude()     // Catch: java.lang.Exception -> L4f
            r2.a(r0)     // Catch: java.lang.Exception -> L4f
            double r0 = r3.getShakeEndAmplitude()     // Catch: java.lang.Exception -> L4f
            r2.b(r0)     // Catch: java.lang.Exception -> L4f
            double r0 = r3.getRotatAmplitude()     // Catch: java.lang.Exception -> L4f
            r2.c(r0)     // Catch: java.lang.Exception -> L4f
            int r3 = r3.getRotatCount()     // Catch: java.lang.Exception -> L4f
            r2.b(r3)     // Catch: java.lang.Exception -> L4f
        L4f:
            return
    }

    public void a(com.beizi.fusion.model.AdSpacesBean.BuyerBean.CoolShakeViewBean r1, java.lang.String r2) {
            r0 = this;
            r0.b(r1)
            r0.a(r2)
            return
    }

    public void a(com.beizi.fusion.model.AdSpacesBean.BuyerBean.ShakeViewBean r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L4f
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setShakeParams shakeCount:"
            r0.append(r1)
            int r1 = r3.getShakeCount()
            r0.append(r1)
            java.lang.String r1 = ";rotatCount:"
            r0.append(r1)
            int r1 = r3.getRotatCount()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.a(r1, r0)
            r0 = 1
            r2.f31v = r0     // Catch: java.lang.Exception -> L4f
            int r0 = r3.getShakeCount()     // Catch: java.lang.Exception -> L4f
            r2.a(r0)     // Catch: java.lang.Exception -> L4f
            double r0 = r3.getShakeStartAmplitude()     // Catch: java.lang.Exception -> L4f
            r2.a(r0)     // Catch: java.lang.Exception -> L4f
            double r0 = r3.getShakeEndAmplitude()     // Catch: java.lang.Exception -> L4f
            r2.b(r0)     // Catch: java.lang.Exception -> L4f
            double r0 = r3.getRotatAmplitude()     // Catch: java.lang.Exception -> L4f
            r2.c(r0)     // Catch: java.lang.Exception -> L4f
            int r3 = r3.getRotatCount()     // Catch: java.lang.Exception -> L4f
            r2.b(r3)     // Catch: java.lang.Exception -> L4f
        L4f:
            return
    }

    public void a(com.beizi.fusion.tool.ab.a r1) {
            r0 = this;
            r0.f24o = r1
            return
    }

    public void a(java.lang.Boolean r1) {
            r0 = this;
            boolean r1 = r1.booleanValue()
            r0.f32w = r1
            return
    }

    public void a(java.lang.String r1) {
            r0 = this;
            r0.f30u = r1
            return
    }

    public void a(boolean r1) {
            r0 = this;
            r1 = r1 ^ 1
            r0.f25p = r1
            return
    }

    public void b() {
            r4 = this;
            android.hardware.SensorManager r0 = com.beizi.fusion.tool.ab.b
            if (r0 == 0) goto L11
            android.hardware.SensorEventListener r1 = r4.f33x
            r2 = 1
            android.hardware.Sensor r2 = r0.getDefaultSensor(r2)
            r3 = 100000(0x186a0, float:1.4013E-40)
            r0.registerListener(r1, r2, r3)
        L11:
            return
    }

    public void b(double r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void b(int r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void b(com.beizi.fusion.model.AdSpacesBean.BuyerBean.CoolShakeViewBean r1) {
            r0 = this;
            r0.f29t = r1
            return
    }

    public void c() {
            r2 = this;
            java.lang.String r0 = "BeiZis"
            java.lang.String r1 = "enter unRegisterShakeListenerAndSetDefault"
            com.beizi.fusion.tool.aa.a(r0, r1)
            android.hardware.SensorManager r0 = com.beizi.fusion.tool.ab.b
            if (r0 == 0) goto L10
            android.hardware.SensorEventListener r1 = r2.f33x
            r0.unregisterListener(r1)
        L10:
            r2.d()
            com.beizi.fusion.widget.ShakeView r0 = r2.a
            if (r0 == 0) goto L1a
            r0.stopShake()
        L1a:
            r0 = 0
            r2.f24o = r0
            r2.c = r0
            r2.a = r0
            return
    }

    public void c(double r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void c(int r1) {
            r0 = this;
            r0.f34y = r1
            if (r1 <= 0) goto L8
            r0.e()
            return
        L8:
            r1 = 1
            r0.J = r1
            return
    }

    public void d() {
            r2 = this;
            r0 = -1027080192(0xffffffffc2c80000, float:-100.0)
            r2.k = r0
            r2.f21l = r0
            r2.f22m = r0
            r0 = 0
            r2.f23n = r0
            r1 = 200(0xc8, float:2.8E-43)
            r2.f26q = r1
            r2.i = r0
            r2.j = r0
            r2.f25p = r0
            r1 = 0
            r2.D = r1
            r2.E = r1
            r2.F = r1
            r2.G = r1
            r2.H = r1
            r2.I = r1
            r2.A = r1
            r2.K = r0
            int r1 = r2.f34y
            if (r1 <= 0) goto L2c
            r2.J = r0
        L2c:
            return
    }
}
