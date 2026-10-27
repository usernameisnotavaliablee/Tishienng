package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class al {
    private static android.hardware.SensorManager c;
    private int A;
    private boolean B;
    private java.util.Map C;
    private boolean D;
    private double E;
    private float[] F;
    private float[] G;
    private final android.hardware.SensorEventListener H;
    private float I;
    private float J;
    private float K;
    private float L;
    private int M;
    private android.hardware.Sensor N;
    private float O;
    private float P;
    private float[] Q;
    private float R;
    private float S;
    private float T;
    private float U;
    private float V;
    private float W;
    private boolean X;
    private boolean Y;
    private long Z;
    com.beizi.fusion.widget.ShakeView a;
    final float b;
    private android.content.Context d;
    private double e;
    private double f;
    private double g;
    private int h;
    private int i;
    private int j;
    private int k;

    /* renamed from: l, reason: collision with root package name */
    private int f51l;

    /* renamed from: m, reason: collision with root package name */
    private int f52m;

    /* renamed from: n, reason: collision with root package name */
    private float f53n;

    /* renamed from: o, reason: collision with root package name */
    private float f54o;

    /* renamed from: p, reason: collision with root package name */
    private float f55p;

    /* renamed from: q, reason: collision with root package name */
    private int f56q;

    /* renamed from: r, reason: collision with root package name */
    private com.beizi.fusion.tool.al.a f57r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f58s;

    /* renamed from: t, reason: collision with root package name */
    private int f59t;

    /* renamed from: u, reason: collision with root package name */
    private long f60u;

    /* renamed from: v, reason: collision with root package name */
    private com.beizi.fusion.update.ShakeArcView f61v;

    /* renamed from: w, reason: collision with root package name */
    private int f62w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f63x;

    /* renamed from: y, reason: collision with root package name */
    private double f64y;

    /* renamed from: z, reason: collision with root package name */
    private int f65z;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void b();
    }

    public al(android.content.Context r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f51l = r0
            r4.f52m = r0
            r1 = -1027080192(0xffffffffc2c80000, float:-100.0)
            r4.f53n = r1
            r4.f54o = r1
            r4.f55p = r1
            r4.f56q = r0
            r1 = 0
            r4.f57r = r1
            r4.f58s = r0
            r2 = 200(0xc8, float:2.8E-43)
            r4.f59t = r2
            r2 = 0
            r4.f60u = r2
            r4.f61v = r1
            r4.f62w = r0
            r0 = 3
            float[] r1 = new float[r0]
            r4.F = r1
            float[] r1 = new float[r0]
            r4.G = r1
            com.beizi.fusion.tool.al$1 r1 = new com.beizi.fusion.tool.al$1
            r1.<init>(r4)
            r4.H = r1
            r1 = 0
            r4.I = r1
            r4.K = r1
            r4.L = r1
            r1 = 1062836634(0x3f59999a, float:0.85)
            r4.b = r1
            r1 = 814313567(0x3089705f, float:1.0E-9)
            r4.P = r1
            float[] r0 = new float[r0]
            r4.Q = r0
            r4.d = r5
            android.content.Context r5 = r5.getApplicationContext()
            android.content.Context r5 = com.stub.StubApp.getOrigApplicationContext(r5)
            java.lang.String r0 = "sensor"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.hardware.SensorManager r5 = (android.hardware.SensorManager) r5
            com.beizi.fusion.tool.al.c = r5
            return
    }

    private double a(float r5, float r6, float r7) {
            r4 = this;
            double r0 = (double) r5
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r0, r2)
            double r5 = (double) r6
            double r5 = java.lang.Math.pow(r5, r2)
            double r0 = r0 + r5
            double r5 = (double) r7
            double r5 = java.lang.Math.pow(r5, r2)
            double r0 = r0 + r5
            double r5 = java.lang.Math.sqrt(r0)
            return r5
    }

    private double a(float r5, float r6, float r7, double r8) {
            r4 = this;
            double r8 = (double) r5
            r0 = 4621706527598287258(0x402399999999999a, double:9.8)
            double r8 = r8 / r0
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = java.lang.Math.pow(r8, r2)
            double r5 = (double) r6
            double r5 = r5 / r0
            double r5 = java.lang.Math.pow(r5, r2)
            double r8 = r8 + r5
            double r5 = (double) r7
            double r5 = r5 / r0
            double r5 = java.lang.Math.pow(r5, r2)
            double r8 = r8 + r5
            double r5 = java.lang.Math.sqrt(r8)
            return r5
    }

    private void a(double r9, double r11, double r13, double r15) {
            r8 = this;
            com.beizi.fusion.update.ShakeArcView r0 = r8.f61v
            if (r0 != 0) goto L6
            goto L97
        L6:
            int r1 = r8.f62w
            r2 = 2
            if (r1 != r2) goto L12
            int r9 = r8.f51l
            double r9 = (double) r9
            r0.setCurrentProgress(r9)
            return
        L12:
            int r1 = r8.i
            r3 = 4
            r4 = 0
            if (r1 <= 0) goto L63
            double r6 = r8.g
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 <= 0) goto L63
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 < 0) goto L28
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 < 0) goto L28
            goto L3d
        L28:
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 < 0) goto L32
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 < 0) goto L32
            r9 = r11
            goto L3d
        L32:
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 < 0) goto L3c
            int r9 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r9 < 0) goto L3c
            r9 = r13
            goto L3d
        L3c:
            r9 = r4
        L3d:
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r9)
            java.math.BigDecimal r9 = r11.setScale(r2, r3)
            double r9 = r9.doubleValue()
            r11 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 < 0) goto L59
            com.beizi.fusion.update.ShakeArcView r11 = r8.f61v
            r11.setCurrentProgress(r9)
            return
        L59:
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L97
            com.beizi.fusion.update.ShakeArcView r9 = r8.f61v
            r9.setCurrentProgress(r4)
            return
        L63:
            int r9 = r8.h
            if (r9 <= 0) goto L71
            int r10 = r8.f51l
            if (r10 < r9) goto L71
            double r9 = r8.e
            r0.setCurrentProgress(r9)
            return
        L71:
            java.math.BigDecimal r9 = new java.math.BigDecimal
            r10 = r15
            r9.<init>(r10)
            java.math.BigDecimal r9 = r9.setScale(r2, r3)
            double r9 = r9.doubleValue()
            r11 = 4607632778762754458(0x3ff199999999999a, double:1.1)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 < 0) goto L8e
            com.beizi.fusion.update.ShakeArcView r11 = r8.f61v
            r11.setCurrentProgress(r9)
            return
        L8e:
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L97
            com.beizi.fusion.update.ShakeArcView r9 = r8.f61v
            r9.setCurrentProgress(r4)
        L97:
            return
    }

    private void a(android.hardware.SensorEvent r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            if (r1 != 0) goto L8
            goto L170
        L8:
            float[] r2 = r1.values
            if (r2 == 0) goto L170
            int r3 = r2.length
            r4 = 3
            if (r3 >= r4) goto L12
            goto L170
        L12:
            r3 = 0
            r4 = r2[r3]
            r9 = 1
            r5 = r2
            r2 = r5[r9]
            r6 = 2
            r5 = r5[r6]
            float r7 = r0.f53n
            r8 = -1027080192(0xffffffffc2c80000, float:-100.0)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L26
            r0.f53n = r4
        L26:
            float r7 = r0.f54o
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L2e
            r0.f54o = r2
        L2e:
            float r7 = r0.f55p
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L36
            r0.f55p = r5
        L36:
            float r7 = r0.f53n
            float r7 = r4 - r7
            float r7 = java.lang.Math.abs(r7)
            double r7 = (double) r7
            r10 = 4621706527598287258(0x402399999999999a, double:9.8)
            double r7 = r7 / r10
            float r12 = r0.f54o
            float r12 = r2 - r12
            float r12 = java.lang.Math.abs(r12)
            double r12 = (double) r12
            double r12 = r12 / r10
            float r14 = r0.f55p
            float r14 = r5 - r14
            float r14 = java.lang.Math.abs(r14)
            double r14 = (double) r14
            double r14 = r14 / r10
            double r10 = r0.g
            int r16 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r16 <= 0) goto L69
            r16 = 0
            int r3 = r0.f52m
            int r3 = r3 + r9
            r0.f52m = r3
            r0.f53n = r4
            goto L6b
        L69:
            r16 = 0
        L6b:
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 <= 0) goto L76
            int r3 = r0.f52m
            int r3 = r3 + r9
            r0.f52m = r3
            r0.f54o = r2
        L76:
            int r3 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r3 <= 0) goto L81
            int r3 = r0.f52m
            int r3 = r3 + r9
            r0.f52m = r3
            r0.f55p = r5
        L81:
            boolean r3 = r0.D
            if (r3 == 0) goto Lc1
            boolean r3 = r0.B
            if (r3 == 0) goto Lc1
            float[] r3 = r1.values
            java.lang.Object r3 = r3.clone()
            float[] r3 = (float[]) r3
            r0.F = r3
            r10 = r3[r16]
            r11 = 1062836634(0x3f59999a, float:0.85)
            float r10 = r10 * r11
            float[] r1 = r1.values
            r17 = r1[r16]
            r18 = 1041865112(0x3e199998, float:0.14999998)
            float r17 = r17 * r18
            float r10 = r10 + r17
            r3[r16] = r10
            r10 = r3[r9]
            float r10 = r10 * r11
            r16 = r1[r9]
            float r16 = r16 * r18
            float r10 = r10 + r16
            r3[r9] = r10
            r10 = r3[r6]
            float r10 = r10 * r11
            r1 = r1[r6]
            float r1 = r1 * r18
            float r10 = r10 + r1
            r3[r6] = r10
            r0.l()
        Lc1:
            r1 = r4
            r3 = r5
            double r4 = r0.e
            double r10 = r0.a(r1, r2, r3, r4)
            double r4 = r0.e
            int r16 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r16 <= 0) goto Leb
            boolean r4 = r0.D
            if (r4 == 0) goto Le6
            int r4 = r0.f56q
            if (r4 != 0) goto Le6
            double r4 = r0.a(r1, r2, r3)
            r17 = r7
            double r6 = r0.f64y
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 >= 0) goto Le8
            r0.f64y = r4
            goto Le8
        Le6:
            r17 = r7
        Le8:
            r0.f56q = r9
            goto Led
        Leb:
            r17 = r7
        Led:
            int r4 = r0.f56q
            if (r4 != r9) goto L101
            double r4 = r0.f
            boolean r1 = r0.b(r1, r2, r3, r4)
            if (r1 == 0) goto L101
            r1 = 2
            r0.f56q = r1
            int r1 = r0.f51l
            int r1 = r1 + r9
            r0.f51l = r1
        L101:
            r7 = r10
            r3 = r12
            r5 = r14
            r1 = r17
            r0.a(r1, r3, r5, r7)
            int r1 = r0.h
            if (r1 <= 0) goto L111
            int r2 = r0.f51l
            if (r2 >= r1) goto L119
        L111:
            int r1 = r0.i
            if (r1 <= 0) goto L170
            int r2 = r0.f52m
            if (r2 < r1) goto L170
        L119:
            boolean r1 = r0.D
            if (r1 == 0) goto L130
            boolean r1 = r0.B
            if (r1 == 0) goto L130
            double r1 = r0.E
            int r3 = r0.A
            double r3 = (double) r3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L130
            int r1 = r0.f51l
            int r1 = r1 - r9
            r0.f51l = r1
            return
        L130:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "mShakeCount = "
            r1.append(r2)
            int r2 = r0.f51l
            r1.append(r2)
            java.lang.String r2 = ",dstShakeCount = "
            r1.append(r2)
            int r2 = r0.h
            r1.append(r2)
            java.lang.String r2 = ",mRotateCount = "
            r1.append(r2)
            int r2 = r0.f52m
            r1.append(r2)
            java.lang.String r2 = ",dstRotateCount = "
            r1.append(r2)
            int r2 = r0.i
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ShakeUtil"
            com.beizi.fusion.tool.aa.b(r2, r1)
            r0.Y = r9
            boolean r1 = r0.X
            if (r1 != 0) goto L16d
            goto L170
        L16d:
            r0.a()
        L170:
            return
    }

    static /* synthetic */ void a(com.beizi.fusion.tool.al r0, android.hardware.SensorEvent r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ float[] a(com.beizi.fusion.tool.al r0, float[] r1) {
            r0.G = r1
            return r1
    }

    private void b(android.hardware.SensorEvent r15) {
            r14 = this;
            java.lang.String r0 = "%.4f"
            if (r15 == 0) goto L1af
            boolean r1 = r14.f58s     // Catch: java.lang.Exception -> L1af
            if (r1 == 0) goto La
            goto L1af
        La:
            long r1 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L1af
            long r3 = r14.Z     // Catch: java.lang.Exception -> L1af
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
            r14.Z = r3     // Catch: java.lang.Exception -> L1af
            float r1 = r14.O     // Catch: java.lang.Exception -> L1af
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
            float r1 = r14.P     // Catch: java.lang.Exception -> L1af
            float r9 = r9 * r1
            float[] r1 = r14.Q     // Catch: java.lang.Exception -> L1af
            r10 = r1[r4]     // Catch: java.lang.Exception -> L1af
            double r10 = (double) r10     // Catch: java.lang.Exception -> L1af
            float r5 = r5 * r9
            double r12 = (double) r5     // Catch: java.lang.Exception -> L1af
            double r12 = java.lang.Math.toDegrees(r12)     // Catch: java.lang.Exception -> L1af
            double r10 = r10 + r12
            float r5 = (float) r10     // Catch: java.lang.Exception -> L1af
            r1[r4] = r5     // Catch: java.lang.Exception -> L1af
            float[] r1 = r14.Q     // Catch: java.lang.Exception -> L1af
            r5 = r1[r6]     // Catch: java.lang.Exception -> L1af
            double r10 = (double) r5     // Catch: java.lang.Exception -> L1af
            float r7 = r7 * r9
            double r12 = (double) r7     // Catch: java.lang.Exception -> L1af
            double r12 = java.lang.Math.toDegrees(r12)     // Catch: java.lang.Exception -> L1af
            double r10 = r10 + r12
            float r5 = (float) r10     // Catch: java.lang.Exception -> L1af
            r1[r6] = r5     // Catch: java.lang.Exception -> L1af
            float[] r1 = r14.Q     // Catch: java.lang.Exception -> L1af
            r5 = r1[r8]     // Catch: java.lang.Exception -> L1af
            double r10 = (double) r5     // Catch: java.lang.Exception -> L1af
            float r2 = r2 * r9
            double r12 = (double) r2     // Catch: java.lang.Exception -> L1af
            double r12 = java.lang.Math.toDegrees(r12)     // Catch: java.lang.Exception -> L1af
            double r10 = r10 + r12
            float r2 = (float) r10     // Catch: java.lang.Exception -> L1af
            r1[r8] = r2     // Catch: java.lang.Exception -> L1af
            float[] r1 = r14.Q     // Catch: java.lang.Exception -> L1af
            r2 = r1[r4]     // Catch: java.lang.Exception -> L1af
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 <= 0) goto L87
            float r5 = r14.U     // Catch: java.lang.Exception -> L1af
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L8f
            r14.U = r2     // Catch: java.lang.Exception -> L1af
            goto L8f
        L87:
            float r5 = r14.R     // Catch: java.lang.Exception -> L1af
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L8f
            r14.R = r2     // Catch: java.lang.Exception -> L1af
        L8f:
            r2 = r1[r6]     // Catch: java.lang.Exception -> L1af
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 <= 0) goto L9e
            float r5 = r14.V     // Catch: java.lang.Exception -> L1af
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto La6
            r14.V = r2     // Catch: java.lang.Exception -> L1af
            goto La6
        L9e:
            float r5 = r14.S     // Catch: java.lang.Exception -> L1af
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto La6
            r14.S = r2     // Catch: java.lang.Exception -> L1af
        La6:
            r1 = r1[r8]     // Catch: java.lang.Exception -> L1af
            int r2 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r2 <= 0) goto Lb5
            float r2 = r14.W     // Catch: java.lang.Exception -> L1af
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 <= 0) goto Lbd
            r14.W = r1     // Catch: java.lang.Exception -> L1af
            goto Lbd
        Lb5:
            float r2 = r14.T     // Catch: java.lang.Exception -> L1af
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto Lbd
            r14.T = r1     // Catch: java.lang.Exception -> L1af
        Lbd:
            float r1 = r14.R     // Catch: java.lang.Exception -> L1af
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L1af
            int r2 = r14.M     // Catch: java.lang.Exception -> L1af
            float r2 = (float) r2     // Catch: java.lang.Exception -> L1af
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto Ld7
            float r1 = r14.U     // Catch: java.lang.Exception -> L1af
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L1af
            int r2 = r14.M     // Catch: java.lang.Exception -> L1af
            float r2 = (float) r2     // Catch: java.lang.Exception -> L1af
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L10b
        Ld7:
            float r1 = r14.S     // Catch: java.lang.Exception -> L1af
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L1af
            int r2 = r14.M     // Catch: java.lang.Exception -> L1af
            float r2 = (float) r2     // Catch: java.lang.Exception -> L1af
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto Lf1
            float r1 = r14.V     // Catch: java.lang.Exception -> L1af
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L1af
            int r2 = r14.M     // Catch: java.lang.Exception -> L1af
            float r2 = (float) r2     // Catch: java.lang.Exception -> L1af
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L10b
        Lf1:
            float r1 = r14.T     // Catch: java.lang.Exception -> L1af
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L1af
            int r2 = r14.M     // Catch: java.lang.Exception -> L1af
            float r2 = (float) r2     // Catch: java.lang.Exception -> L1af
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L19f
            float r1 = r14.W     // Catch: java.lang.Exception -> L1af
            float r1 = java.lang.Math.abs(r1)     // Catch: java.lang.Exception -> L1af
            int r2 = r14.M     // Catch: java.lang.Exception -> L1af
            float r2 = (float) r2     // Catch: java.lang.Exception -> L1af
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L19f
        L10b:
            java.lang.String r1 = "ShakeUtil"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1af
            r2.<init>()     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = "rotate  xMin: "
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            float r3 = r14.R     // Catch: java.lang.Exception -> L1af
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L1af
            r5[r4] = r3     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = java.lang.String.format(r0, r5)     // Catch: java.lang.Exception -> L1af
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = ",xMax: "
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            float r3 = r14.U     // Catch: java.lang.Exception -> L1af
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L1af
            r5[r4] = r3     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = java.lang.String.format(r0, r5)     // Catch: java.lang.Exception -> L1af
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = ",yMin: "
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            float r3 = r14.S     // Catch: java.lang.Exception -> L1af
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L1af
            r5[r4] = r3     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = java.lang.String.format(r0, r5)     // Catch: java.lang.Exception -> L1af
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = ",yMax: "
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            float r3 = r14.V     // Catch: java.lang.Exception -> L1af
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L1af
            r5[r4] = r3     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = java.lang.String.format(r0, r5)     // Catch: java.lang.Exception -> L1af
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = ",zMin: "
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            float r3 = r14.T     // Catch: java.lang.Exception -> L1af
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L1af
            r5[r4] = r3     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = java.lang.String.format(r0, r5)     // Catch: java.lang.Exception -> L1af
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.String r3 = ",zMax: "
            r2.append(r3)     // Catch: java.lang.Exception -> L1af
            float r3 = r14.W     // Catch: java.lang.Exception -> L1af
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Exception -> L1af
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> L1af
            r5[r4] = r3     // Catch: java.lang.Exception -> L1af
            java.lang.String r0 = java.lang.String.format(r0, r5)     // Catch: java.lang.Exception -> L1af
            r2.append(r0)     // Catch: java.lang.Exception -> L1af
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L1af
            com.beizi.fusion.tool.aa.a(r1, r0)     // Catch: java.lang.Exception -> L1af
            r14.X = r6     // Catch: java.lang.Exception -> L1af
        L19f:
            boolean r0 = r14.Y     // Catch: java.lang.Exception -> L1af
            if (r0 == 0) goto L1aa
            boolean r0 = r14.X     // Catch: java.lang.Exception -> L1af
            if (r0 == 0) goto L1aa
            r14.a()     // Catch: java.lang.Exception -> L1af
        L1aa:
            long r0 = r15.timestamp     // Catch: java.lang.Exception -> L1af
            float r15 = (float) r0     // Catch: java.lang.Exception -> L1af
            r14.O = r15     // Catch: java.lang.Exception -> L1af
        L1af:
            return
    }

    static /* synthetic */ void b(com.beizi.fusion.tool.al r0, android.hardware.SensorEvent r1) {
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

    public static android.util.Pair<java.lang.Integer, java.lang.Boolean> f(int r4) {
            double r0 = java.lang.Math.random()
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r2
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r2
            int r0 = (int) r0
            if (r0 > r4) goto L1a
            android.util.Pair r4 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r4.<init>(r0, r1)
            return r4
        L1a:
            android.util.Pair r4 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r4.<init>(r0, r1)
            return r4
    }

    private void f() {
            r6 = this;
            com.beizi.fusion.update.ShakeArcView r0 = r6.f61v
            if (r0 == 0) goto L2b
            int r1 = r6.f62w
            if (r1 != 0) goto L9
            goto L2b
        L9:
            r2 = 1
            if (r1 != r2) goto L22
            int r1 = r6.i
            if (r1 <= 0) goto L1c
            double r1 = r6.g
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L1c
            r0.setMaxProgress(r1)
            return
        L1c:
            double r1 = r6.e
            r0.setMaxProgress(r1)
            return
        L22:
            r2 = 2
            if (r1 != r2) goto L2b
            int r1 = r6.h
            double r1 = (double) r1
            r0.setMaxProgress(r1)
        L2b:
            return
    }

    private void g() {
            r4 = this;
            int r0 = r4.k
            android.util.Pair r0 = f(r0)
            java.lang.Object r1 = r0.second
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L26
            com.beizi.fusion.tool.al$2 r1 = new com.beizi.fusion.tool.al$2
            r1.<init>(r4)
            int r2 = r4.j
            java.lang.Object r0 = r0.first
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = r0 * 10
            int r2 = r2 + r0
            long r2 = (long) r2
            com.beizi.fusion.tool.u.a(r1, r2)
        L26:
            return
    }

    private java.util.Map h() {
            r8 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "actionType"
            r0.put(r2, r1)
            java.util.Map r1 = r8.C
            java.lang.String r2 = "maxAcc"
            java.lang.String r3 = "angle"
            if (r1 != 0) goto L31
            java.lang.Double r1 = r8.i()
            r1.doubleValue()
            r0.put(r2, r1)
            boolean r1 = r8.B
            if (r1 == 0) goto L8e
            int r1 = r8.j()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r3, r1)
            return r0
        L31:
            boolean r1 = r1.containsKey(r2)
            r4 = 0
            if (r1 == 0) goto L46
            java.util.Map r1 = r8.C
            java.lang.Object r1 = r1.get(r2)
            java.lang.Double r1 = (java.lang.Double) r1
            double r6 = r1.doubleValue()
            goto L47
        L46:
            r6 = r4
        L47:
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 > 0) goto L53
            java.lang.Double r1 = r8.i()
            double r6 = r1.doubleValue()
        L53:
            java.lang.Double r1 = java.lang.Double.valueOf(r6)
            r0.put(r2, r1)
            boolean r1 = r8.B
            if (r1 == 0) goto L8e
            java.util.Map r1 = r8.C
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L78
            java.util.Map r1 = r8.C
            java.lang.Object r1 = r1.get(r3)
            java.lang.Double r1 = (java.lang.Double) r1
            double r1 = r1.doubleValue()
            long r1 = java.lang.Math.round(r1)
            int r2 = (int) r1
            goto L79
        L78:
            r2 = 0
        L79:
            if (r2 <= 0) goto L83
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.put(r3, r1)
            return r0
        L83:
            int r1 = r8.j()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r3, r1)
        L8e:
            return r0
    }

    private java.lang.Double i() {
            r4 = this;
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r1 = 1500(0x5dc, float:2.102E-42)
            int r0 = r0.nextInt(r1)
            double r0 = (double) r0
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 / r2
            r2 = 4624633867356078080(0x402e000000000000, double:15.0)
            double r0 = r0 + r2
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "%.2f"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            double r0 = java.lang.Double.parseDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    private int j() {
            r3 = this;
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r1 = r3.A
            int r1 = 150 - r1
            int r0 = r0.nextInt(r1)
            int r1 = r3.A
            int r1 = r1 + r0
            r0 = 120(0x78, float:1.68E-43)
            if (r1 <= r0) goto L20
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r2 = 30
            int r0 = r0.nextInt(r2)
            int r1 = r1 - r0
        L20:
            return r1
    }

    private java.util.Map k() {
            r4 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "actionType"
            r0.put(r3, r2)
            double r2 = r4.f64y
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "%.2f"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            double r1 = java.lang.Double.parseDouble(r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.String r2 = "maxAcc"
            r0.put(r2, r1)
            boolean r1 = r4.B
            if (r1 == 0) goto L40
            double r1 = r4.E
            long r1 = java.lang.Math.round(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "angle"
            r0.put(r2, r1)
        L40:
            return r0
    }

    private void l() {
            r9 = this;
            r0 = 3
            float[] r0 = new float[r0]
            r1 = 9
            float[] r1 = new float[r1]
            float[] r2 = r9.F
            float[] r3 = r9.G
            r4 = 0
            android.hardware.SensorManager.getRotationMatrix(r1, r4, r2, r3)
            android.hardware.SensorManager.getOrientation(r1, r0)
            r1 = 0
            r2 = r0[r1]
            double r2 = (double) r2
            double r2 = java.lang.Math.toDegrees(r2)
            float r2 = (float) r2
            r0[r1] = r2
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 != 0) goto L23
            return
        L23:
            float r4 = r9.I
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 != 0) goto L2c
            r9.I = r2
            return
        L2c:
            float r2 = r2 - r4
            float r3 = java.lang.Math.abs(r2)
            r4 = 1127481344(0x43340000, float:180.0)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L3c
            r0 = r0[r1]
            r9.I = r0
            return
        L3c:
            float r3 = r9.J
            float r3 = r3 + r2
            r9.J = r3
            float r2 = r9.K
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L49
            r9.K = r3
        L49:
            float r2 = r9.L
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L51
            r9.L = r3
        L51:
            float r2 = r9.L
            float r3 = r9.K
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            double r2 = (double) r2
            r4 = 4645040803167600640(0x4076800000000000, double:360.0)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L65
            goto L74
        L65:
            r6 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L72
            double r4 = r4 - r2
            r9.E = r4
            goto L74
        L72:
            r9.E = r2
        L74:
            double r2 = r9.E
            r4 = 4638144666238189568(0x405e000000000000, double:120.0)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L8b
            java.util.Random r4 = new java.util.Random
            r4.<init>()
            r5 = 30
            int r4 = r4.nextInt(r5)
            double r4 = (double) r4
            double r2 = r2 - r4
            r9.E = r2
        L8b:
            r0 = r0[r1]
            r9.I = r0
            return
    }

    private void m() {
            r4 = this;
            android.hardware.SensorManager r0 = com.beizi.fusion.tool.al.c     // Catch: java.lang.Exception -> L18
            if (r0 == 0) goto L18
            r1 = 4
            android.hardware.Sensor r0 = r0.getDefaultSensor(r1)     // Catch: java.lang.Exception -> L18
            r4.N = r0     // Catch: java.lang.Exception -> L18
            r1 = 1
            if (r0 == 0) goto L16
            android.hardware.SensorManager r2 = com.beizi.fusion.tool.al.c     // Catch: java.lang.Exception -> L18
            android.hardware.SensorEventListener r3 = r4.H     // Catch: java.lang.Exception -> L18
            r2.registerListener(r3, r0, r1)     // Catch: java.lang.Exception -> L18
            return
        L16:
            r4.X = r1     // Catch: java.lang.Exception -> L18
        L18:
            return
    }

    public android.view.View a(int r10, int r11, com.beizi.fusion.model.AdSpacesBean.BuyerBean.PercentPositionBean r12) {
            r9 = this;
            java.lang.String r0 = "enter getShakeView"
            java.lang.String r1 = "BeiZis"
            com.beizi.fusion.tool.aa.a(r1, r0)
            android.content.Context r0 = r9.d
            if (r0 == 0) goto L1c3
            if (r12 != 0) goto Lf
            goto L1c3
        Lf:
            com.beizi.fusion.widget.ShakeView r0 = new com.beizi.fusion.widget.ShakeView
            android.content.Context r2 = r9.d
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
            android.content.Context r4 = r9.d
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
            android.content.Context r3 = r9.d
            float r4 = (float) r8
            int r3 = com.beizi.fusion.tool.ap.a(r3, r4)
            android.content.Context r4 = r9.d
            float r12 = (float) r12
            int r12 = com.beizi.fusion.tool.ap.a(r4, r12)
            android.content.Context r4 = r9.d
            float r0 = (float) r0
            int r0 = com.beizi.fusion.tool.ap.a(r4, r0)
            android.content.Context r4 = r9.d
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
            android.content.Context r2 = r9.d
            float r11 = (float) r11
            int r11 = com.beizi.fusion.tool.ap.a(r2, r11)
            int r2 = r11 / 2
        L165:
            if (r0 != 0) goto L170
            android.content.Context r11 = r9.d
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
            boolean r11 = r9.f63x
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

    protected synchronized void a() {
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "BeiZis"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r1.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "enter callBackShakeHappened and mShakeStateListener != null ? "
            r1.append(r2)     // Catch: java.lang.Throwable -> L5b
            com.beizi.fusion.tool.al$a r2 = r5.f57r     // Catch: java.lang.Throwable -> L5b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            r1.append(r2)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = ",!isCallBack = "
            r1.append(r2)     // Catch: java.lang.Throwable -> L5b
            boolean r2 = r5.f58s     // Catch: java.lang.Throwable -> L5b
            r2 = r2 ^ r3
            r1.append(r2)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L5b
            com.beizi.fusion.tool.aa.a(r0, r1)     // Catch: java.lang.Throwable -> L5b
            com.beizi.fusion.tool.al$a r0 = r5.f57r     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L6e
            boolean r0 = r5.f58s     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L6e
            java.lang.String r0 = "BeiZis"
            java.lang.String r1 = "callback onShakeHappened()"
            com.beizi.fusion.tool.aa.a(r0, r1)     // Catch: java.lang.Throwable -> L5b
            com.beizi.fusion.update.ShakeArcView r0 = r5.f61v     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L5d
            boolean r0 = com.beizi.fusion.tool.ar.b(r0)     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L5d
            java.lang.String r0 = "ShakeUtil"
            java.lang.String r1 = "mShakeCount onShakeHappened mShakeArcView is not show"
            com.beizi.fusion.tool.aa.b(r0, r1)     // Catch: java.lang.Throwable -> L5b
            r0 = -1027080192(0xffffffffc2c80000, float:-100.0)
            r5.f53n = r0     // Catch: java.lang.Throwable -> L5b
            r5.f54o = r0     // Catch: java.lang.Throwable -> L5b
            r5.f55p = r0     // Catch: java.lang.Throwable -> L5b
            r5.f51l = r4     // Catch: java.lang.Throwable -> L5b
            r5.f52m = r4     // Catch: java.lang.Throwable -> L5b
            r5.f56q = r4     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r5)
            return
        L5b:
            r0 = move-exception
            goto L70
        L5d:
            r5.f58s = r3     // Catch: java.lang.Throwable -> L5b
            com.beizi.fusion.tool.al$a r0 = r5.f57r     // Catch: java.lang.Throwable -> L5b
            r0.b()     // Catch: java.lang.Throwable -> L5b
            com.beizi.fusion.widget.ShakeView r0 = r5.a     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L6e
            r0.stopShake()     // Catch: java.lang.Throwable -> L5b
            r5.c()     // Catch: java.lang.Throwable -> L5b
        L6e:
            monitor-exit(r5)
            return
        L70:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L5b
            throw r0
    }

    public void a(double r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void a(int r1) {
            r0 = this;
            r0.f62w = r1
            return
    }

    public void a(int r2, int r3, boolean r4, java.util.Map r5) {
            r1 = this;
            java.lang.String r0 = "forceUnreal"
            r1.f65z = r2     // Catch: java.lang.Exception -> L4c
            r1.A = r3     // Catch: java.lang.Exception -> L4c
            r1.B = r4     // Catch: java.lang.Exception -> L4c
            r1.C = r5     // Catch: java.lang.Exception -> L4c
            if (r3 > 0) goto L10
            r3 = 35
            r1.A = r3     // Catch: java.lang.Exception -> L4c
        L10:
            r3 = 1
            if (r2 != r3) goto L35
            if (r5 != 0) goto L18
            r1.D = r3     // Catch: java.lang.Exception -> L4c
            return
        L18:
            boolean r2 = r5.containsKey(r0)     // Catch: java.lang.Exception -> L4c
            if (r2 != 0) goto L21
            r1.D = r3     // Catch: java.lang.Exception -> L4c
            return
        L21:
            java.lang.Object r2 = r5.get(r0)     // Catch: java.lang.Exception -> L4c
            boolean r5 = r2 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L4c
            if (r5 == 0) goto L30
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L4c
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Exception -> L4c
            goto L31
        L30:
            r2 = 0
        L31:
            if (r2 != 0) goto L35
            r1.D = r3     // Catch: java.lang.Exception -> L4c
        L35:
            boolean r2 = r1.D     // Catch: java.lang.Exception -> L4c
            if (r2 == 0) goto L4c
            if (r4 == 0) goto L4c
            android.hardware.SensorManager r2 = com.beizi.fusion.tool.al.c     // Catch: java.lang.Exception -> L4c
            r4 = 2
            android.hardware.Sensor r2 = r2.getDefaultSensor(r4)     // Catch: java.lang.Exception -> L4c
            if (r2 != 0) goto L45
            goto L4c
        L45:
            android.hardware.SensorManager r4 = com.beizi.fusion.tool.al.c     // Catch: java.lang.Exception -> L4c
            android.hardware.SensorEventListener r5 = r1.H     // Catch: java.lang.Exception -> L4c
            r4.registerListener(r5, r2, r3)     // Catch: java.lang.Exception -> L4c
        L4c:
            return
    }

    public void a(com.beizi.fusion.model.AdSpacesBean.BuyerBean.AliaseShakeViewBean r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L4c
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setShakeAliaseParams mShakeCount:"
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
            int r0 = r3.getShakeCount()     // Catch: java.lang.Exception -> L4c
            r2.b(r0)     // Catch: java.lang.Exception -> L4c
            double r0 = r3.getShakeStartAmplitude()     // Catch: java.lang.Exception -> L4c
            r2.a(r0)     // Catch: java.lang.Exception -> L4c
            double r0 = r3.getShakeEndAmplitude()     // Catch: java.lang.Exception -> L4c
            r2.b(r0)     // Catch: java.lang.Exception -> L4c
            double r0 = r3.getRotatAmplitude()     // Catch: java.lang.Exception -> L4c
            r2.c(r0)     // Catch: java.lang.Exception -> L4c
            int r3 = r3.getRotatCount()     // Catch: java.lang.Exception -> L4c
            r2.e(r3)     // Catch: java.lang.Exception -> L4c
        L4c:
            return
    }

    public void a(com.beizi.fusion.model.AdSpacesBean.BuyerBean.CoolShakeViewBean r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L4c
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
            int r0 = r3.getShakeCount()     // Catch: java.lang.Exception -> L4c
            r2.b(r0)     // Catch: java.lang.Exception -> L4c
            double r0 = r3.getShakeStartAmplitude()     // Catch: java.lang.Exception -> L4c
            r2.a(r0)     // Catch: java.lang.Exception -> L4c
            double r0 = r3.getShakeEndAmplitude()     // Catch: java.lang.Exception -> L4c
            r2.b(r0)     // Catch: java.lang.Exception -> L4c
            double r0 = r3.getRotatAmplitude()     // Catch: java.lang.Exception -> L4c
            r2.c(r0)     // Catch: java.lang.Exception -> L4c
            int r3 = r3.getRotatCount()     // Catch: java.lang.Exception -> L4c
            r2.e(r3)     // Catch: java.lang.Exception -> L4c
        L4c:
            return
    }

    public void a(com.beizi.fusion.model.AdSpacesBean.BuyerBean.ShakeViewBean r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L73
        L3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setShakeParams mShakeCount:"
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
            r0 = -1027080192(0xffffffffc2c80000, float:-100.0)
            r2.f53n = r0     // Catch: java.lang.Exception -> L73
            r2.f54o = r0     // Catch: java.lang.Exception -> L73
            r2.f55p = r0     // Catch: java.lang.Exception -> L73
            r0 = 0
            r2.f51l = r0     // Catch: java.lang.Exception -> L73
            r2.f52m = r0     // Catch: java.lang.Exception -> L73
            r2.f56q = r0     // Catch: java.lang.Exception -> L73
            int r0 = r3.getShakeCount()     // Catch: java.lang.Exception -> L73
            r2.b(r0)     // Catch: java.lang.Exception -> L73
            double r0 = r3.getShakeStartAmplitude()     // Catch: java.lang.Exception -> L73
            r2.a(r0)     // Catch: java.lang.Exception -> L73
            double r0 = r3.getShakeEndAmplitude()     // Catch: java.lang.Exception -> L73
            r2.b(r0)     // Catch: java.lang.Exception -> L73
            double r0 = r3.getRotatAmplitude()     // Catch: java.lang.Exception -> L73
            r2.c(r0)     // Catch: java.lang.Exception -> L73
            int r0 = r3.getRotatCount()     // Catch: java.lang.Exception -> L73
            r2.e(r0)     // Catch: java.lang.Exception -> L73
            int r0 = r3.getRandomClickTime()     // Catch: java.lang.Exception -> L73
            r2.c(r0)     // Catch: java.lang.Exception -> L73
            int r0 = r3.getRandomClickNum()     // Catch: java.lang.Exception -> L73
            r2.d(r0)     // Catch: java.lang.Exception -> L73
            int r3 = r3.getAnimationInterval()     // Catch: java.lang.Exception -> L73
            r2.g(r3)     // Catch: java.lang.Exception -> L73
            r2.f()     // Catch: java.lang.Exception -> L73
        L73:
            return
    }

    public void a(com.beizi.fusion.tool.al.a r1) {
            r0 = this;
            r0.f57r = r1
            return
    }

    public void a(com.beizi.fusion.update.ShakeArcView r1) {
            r0 = this;
            r0.f61v = r1
            return
    }

    public void a(com.beizi.fusion.update.ShakeArcView r3, int r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setShakeFeedback feedback:"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ShakeUtil"
            com.beizi.fusion.tool.aa.c(r1, r0)
            r2.a(r3)
            r2.a(r4)
            r2.f()
            return
    }

    public void a(java.lang.Boolean r1) {
            r0 = this;
            boolean r1 = r1.booleanValue()
            r0.f63x = r1
            return
    }

    public void b() {
            r4 = this;
            android.hardware.SensorManager r0 = com.beizi.fusion.tool.al.c
            if (r0 == 0) goto L11
            android.hardware.SensorEventListener r1 = r4.H
            r2 = 1
            android.hardware.Sensor r2 = r0.getDefaultSensor(r2)
            r3 = 100000(0x186a0, float:1.4013E-40)
            r0.registerListener(r1, r2, r3)
        L11:
            return
    }

    public void b(double r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void b(int r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void c() {
            r2 = this;
            java.lang.String r0 = "BeiZis"
            java.lang.String r1 = "enter unRegisterShakeListenerAndSetDefault"
            com.beizi.fusion.tool.aa.a(r0, r1)
            android.hardware.SensorManager r0 = com.beizi.fusion.tool.al.c
            if (r0 == 0) goto L10
            android.hardware.SensorEventListener r1 = r2.H
            r0.unregisterListener(r1)
        L10:
            r2.d()
            com.beizi.fusion.widget.ShakeView r0 = r2.a
            if (r0 == 0) goto L1a
            r0.stopShake()
        L1a:
            return
    }

    public void c(double r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public void c(int r1) {
            r0 = this;
            r0.j = r1
            return
    }

    protected void d() {
            r3 = this;
            r0 = 0
            r3.f58s = r0
            r3.f51l = r0
            r3.f52m = r0
            r1 = -1027080192(0xffffffffc2c80000, float:-100.0)
            r3.f53n = r1
            r3.f54o = r1
            r3.f55p = r1
            r3.f56q = r0
            r1 = 0
            r3.f57r = r1
            r3.d = r1
            r3.a = r1
            r2 = 200(0xc8, float:2.8E-43)
            r3.f59t = r2
            r3.f61v = r1
            r1 = 0
            r3.R = r1
            r3.S = r1
            r3.T = r1
            r3.U = r1
            r3.V = r1
            r3.W = r1
            r3.O = r1
            r3.Y = r0
            int r1 = r3.M
            if (r1 <= 0) goto L35
            r3.X = r0
        L35:
            return
    }

    public void d(int r1) {
            r0 = this;
            r0.k = r1
            if (r1 <= 0) goto L7
            r0.g()
        L7:
            return
    }

    public java.util.Map e() {
            r3 = this;
            int r0 = r3.f65z
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2 = 2
            if (r0 != r2) goto Le
            java.util.Map r0 = r3.h()
            return r0
        Le:
            r2 = 1
            if (r0 != r2) goto L1f
            boolean r0 = r3.D
            if (r0 == 0) goto L1a
            java.util.Map r0 = r3.k()
            return r0
        L1a:
            java.util.Map r0 = r3.h()
            return r0
        L1f:
            return r1
    }

    public void e(int r1) {
            r0 = this;
            r0.i = r1
            return
    }

    public void g(int r1) {
            r0 = this;
            r0.f59t = r1
            return
    }

    public void h(int r1) {
            r0 = this;
            r0.M = r1
            if (r1 <= 0) goto L8
            r0.m()
            return
        L8:
            r1 = 1
            r0.X = r1
            return
    }
}
