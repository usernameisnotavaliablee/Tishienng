package j0;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class f {
    private static final java.lang.String e = "PoseClassifier";
    private static final int f = 30;
    private static final int g = 10;
    private static final com.google.mlkit.vision.common.PointF3D h = null;
    private final java.util.List<j0.i> a;
    private final int b;
    private final int c;
    private final com.google.mlkit.vision.common.PointF3D d;

    static {
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            com.google.mlkit.vision.common.PointF3D r0 = com.google.mlkit.vision.common.PointF3D.from(r0, r0, r1)
            j0.f.h = r0
            return
    }

    public f(java.util.List<j0.i> r4) {
            r3 = this;
            r0 = 10
            com.google.mlkit.vision.common.PointF3D r1 = j0.f.h
            r2 = 30
            r3.<init>(r4, r2, r0, r1)
            return
    }

    public f(java.util.List<j0.i> r1, int r2, int r3, com.google.mlkit.vision.common.PointF3D r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public static /* synthetic */ int a(android.util.Pair r0, android.util.Pair r1) {
            java.lang.Object r0 = r0.second
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            java.lang.Object r1 = r1.second
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            int r0 = java.lang.Float.compare(r0, r1)
            int r0 = -r0
            return r0
    }

    public static /* synthetic */ int b(android.util.Pair r0, android.util.Pair r1) {
            java.lang.Object r0 = r0.second
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            java.lang.Object r1 = r1.second
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            int r0 = java.lang.Float.compare(r0, r1)
            int r0 = -r0
            return r0
    }

    private static java.util.List<com.google.mlkit.vision.common.PointF3D> f(com.google.mlkit.vision.pose.Pose r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r2 = r2.getAllPoseLandmarks()
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r2.next()
            com.google.mlkit.vision.pose.PoseLandmark r1 = (com.google.mlkit.vision.pose.PoseLandmark) r1
            com.google.mlkit.vision.common.PointF3D r1 = r1.getPosition3D()
            r0.add(r1)
            goto Ld
        L21:
            return r0
    }

    public j0.b c(com.google.mlkit.vision.pose.Pose r1) {
            r0 = this;
            java.util.List r1 = f(r1)
            j0.b r1 = r0.d(r1)
            return r1
    }

    public j0.b d(java.util.List<com.google.mlkit.vision.common.PointF3D> r14) {
            r13 = this;
            j0.b r0 = new j0.b
            r0.<init>()
            boolean r1 = r14.isEmpty()
            if (r1 == 0) goto Ld
            goto L151
        Ld:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r14)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            com.google.mlkit.vision.common.PointF3D r2 = com.google.mlkit.vision.common.PointF3D.from(r2, r3, r3)
            j0.k.i(r1, r2)
            java.util.List r14 = j0.h.b(r14)
            java.util.List r1 = j0.h.b(r1)
            java.util.PriorityQueue r2 = new java.util.PriorityQueue
            int r3 = r13.b
            j0.d r4 = new j0.d
            r4.<init>()
            r2.<init>(r3, r4)
            java.util.List<j0.i> r3 = r13.a
            java.util.Iterator r3 = r3.iterator()
        L37:
            boolean r4 = r3.hasNext()
            r5 = 0
            r6 = 0
            if (r4 == 0) goto Lab
            java.lang.Object r4 = r3.next()
            j0.i r4 = (j0.i) r4
            java.util.List r7 = r4.b()
            r8 = 0
        L4a:
            int r9 = r14.size()
            if (r5 >= r9) goto L8f
            java.lang.Object r9 = r14.get(r5)
            com.google.mlkit.vision.common.PointF3D r9 = (com.google.mlkit.vision.common.PointF3D) r9
            java.lang.Object r10 = r7.get(r5)
            com.google.mlkit.vision.common.PointF3D r10 = (com.google.mlkit.vision.common.PointF3D) r10
            com.google.mlkit.vision.common.PointF3D r9 = j0.k.j(r9, r10)
            com.google.mlkit.vision.common.PointF3D r10 = r13.d
            com.google.mlkit.vision.common.PointF3D r9 = j0.k.g(r9, r10)
            float r9 = j0.k.e(r9)
            float r6 = java.lang.Math.max(r6, r9)
            java.lang.Object r9 = r1.get(r5)
            com.google.mlkit.vision.common.PointF3D r9 = (com.google.mlkit.vision.common.PointF3D) r9
            java.lang.Object r10 = r7.get(r5)
            com.google.mlkit.vision.common.PointF3D r10 = (com.google.mlkit.vision.common.PointF3D) r10
            com.google.mlkit.vision.common.PointF3D r9 = j0.k.j(r9, r10)
            com.google.mlkit.vision.common.PointF3D r10 = r13.d
            com.google.mlkit.vision.common.PointF3D r9 = j0.k.g(r9, r10)
            float r9 = j0.k.e(r9)
            float r8 = java.lang.Math.max(r8, r9)
            int r5 = r5 + 1
            goto L4a
        L8f:
            android.util.Pair r5 = new android.util.Pair
            float r6 = java.lang.Math.min(r6, r8)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r5.<init>(r4, r6)
            r2.add(r5)
            int r4 = r2.size()
            int r5 = r13.b
            if (r4 <= r5) goto L37
            r2.poll()
            goto L37
        Lab:
            java.util.PriorityQueue r3 = new java.util.PriorityQueue
            int r4 = r13.c
            j0.e r7 = new j0.e
            r7.<init>()
            r3.<init>(r4, r7)
            java.util.Iterator r2 = r2.iterator()
        Lbb:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L135
            java.lang.Object r4 = r2.next()
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r4 = r4.first
            j0.i r4 = (j0.i) r4
            java.util.List r7 = r4.b()
            r8 = 0
            r9 = 0
            r10 = 0
        Ld2:
            int r11 = r14.size()
            if (r8 >= r11) goto L111
            java.lang.Object r11 = r14.get(r8)
            com.google.mlkit.vision.common.PointF3D r11 = (com.google.mlkit.vision.common.PointF3D) r11
            java.lang.Object r12 = r7.get(r8)
            com.google.mlkit.vision.common.PointF3D r12 = (com.google.mlkit.vision.common.PointF3D) r12
            com.google.mlkit.vision.common.PointF3D r11 = j0.k.j(r11, r12)
            com.google.mlkit.vision.common.PointF3D r12 = r13.d
            com.google.mlkit.vision.common.PointF3D r11 = j0.k.g(r11, r12)
            float r11 = j0.k.l(r11)
            float r9 = r9 + r11
            java.lang.Object r11 = r1.get(r8)
            com.google.mlkit.vision.common.PointF3D r11 = (com.google.mlkit.vision.common.PointF3D) r11
            java.lang.Object r12 = r7.get(r8)
            com.google.mlkit.vision.common.PointF3D r12 = (com.google.mlkit.vision.common.PointF3D) r12
            com.google.mlkit.vision.common.PointF3D r11 = j0.k.j(r11, r12)
            com.google.mlkit.vision.common.PointF3D r12 = r13.d
            com.google.mlkit.vision.common.PointF3D r11 = j0.k.g(r11, r12)
            float r11 = j0.k.l(r11)
            float r10 = r10 + r11
            int r8 = r8 + 1
            goto Ld2
        L111:
            float r7 = java.lang.Math.min(r9, r10)
            int r8 = r14.size()
            int r8 = r8 * 2
            float r8 = (float) r8
            float r7 = r7 / r8
            android.util.Pair r8 = new android.util.Pair
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r8.<init>(r4, r7)
            r3.add(r8)
            int r4 = r3.size()
            int r7 = r13.c
            if (r4 <= r7) goto Lbb
            r3.poll()
            goto Lbb
        L135:
            java.util.Iterator r14 = r3.iterator()
        L139:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L151
            java.lang.Object r1 = r14.next()
            android.util.Pair r1 = (android.util.Pair) r1
            java.lang.Object r1 = r1.first
            j0.i r1 = (j0.i) r1
            java.lang.String r1 = r1.a()
            r0.e(r1)
            goto L139
        L151:
            return r0
    }

    public int e() {
            r2 = this;
            int r0 = r2.b
            int r1 = r2.c
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }
}
