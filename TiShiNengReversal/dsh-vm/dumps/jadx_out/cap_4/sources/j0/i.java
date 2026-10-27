package j0;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class i {
    private static final java.lang.String d = "PoseSample";
    private static final int e = 33;
    private static final int f = 3;
    private final java.lang.String a;
    private final java.lang.String b;
    private final java.util.List<com.google.mlkit.vision.common.PointF3D> c;

    public i(java.lang.String r1, java.lang.String r2, java.util.List<com.google.mlkit.vision.common.PointF3D> r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            java.util.List r1 = j0.h.b(r3)
            r0.c = r1
            return
    }

    public static j0.i d(java.lang.String r7, java.lang.String r8) {
            com.google.common.base.Splitter r8 = com.google.common.base.Splitter.onPattern(r8)
            java.util.List r7 = r8.splitToList(r7)
            int r8 = r7.size()
            r0 = 101(0x65, float:1.42E-43)
            r1 = 0
            if (r8 == r0) goto L12
            return r1
        L12:
            r8 = 0
            java.lang.Object r8 = r7.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r0 = 1
            java.lang.Object r0 = r7.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 2
        L26:
            int r4 = r7.size()
            if (r3 >= r4) goto L5f
            java.lang.Object r4 = r7.get(r3)     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L58
            float r4 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.Throwable -> L58
            int r5 = r3 + 1
            java.lang.Object r5 = r7.get(r5)     // Catch: java.lang.Throwable -> L58
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L58
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.Throwable -> L58
            int r6 = r3 + 2
            java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Throwable -> L58
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L58
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.Throwable -> L58
            com.google.mlkit.vision.common.PointF3D r4 = com.google.mlkit.vision.common.PointF3D.from(r4, r5, r6)     // Catch: java.lang.Throwable -> L58
            r2.add(r4)     // Catch: java.lang.Throwable -> L58
            int r3 = r3 + 3
            goto L26
        L58:
            java.lang.Object r7 = r7.get(r3)
            java.lang.String r7 = (java.lang.String) r7
            return r1
        L5f:
            j0.i r7 = new j0.i
            r7.<init>(r8, r0, r2)
            return r7
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }

    public java.util.List<com.google.mlkit.vision.common.PointF3D> b() {
            r1 = this;
            java.util.List<com.google.mlkit.vision.common.PointF3D> r0 = r1.c
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }
}
