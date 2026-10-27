package j0;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g {
    private static final java.lang.String h = "PoseClassifierProcessor";
    private final java.lang.String a;
    private final java.lang.String[] b;
    private final boolean c;
    private j0.c d;
    private java.util.List<j0.j> e;
    private j0.f f;
    private java.lang.String g;

    @androidx.annotation.WorkerThread
    public g(android.content.Context r3, boolean r4, java.lang.String r5, java.lang.String[] r6) {
            r2 = this;
            r2.<init>()
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 == r1) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            com.google.common.base.Preconditions.checkState(r0)
            r2.c = r4
            if (r4 == 0) goto L29
            j0.c r4 = new j0.c
            r4.<init>()
            r2.d = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.e = r4
            java.lang.String r4 = ""
            r2.g = r4
        L29:
            r2.a = r5
            r2.b = r6
            r2.b(r3)
            return
    }

    private void b(android.content.Context r6) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.io.IOException -> L2b
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L2b
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch: java.io.IOException -> L2b
            java.lang.String r3 = r5.a     // Catch: java.io.IOException -> L2b
            java.io.InputStream r6 = r6.open(r3)     // Catch: java.io.IOException -> L2b
            r2.<init>(r6)     // Catch: java.io.IOException -> L2b
            r1.<init>(r2)     // Catch: java.io.IOException -> L2b
            java.lang.String r6 = r1.readLine()     // Catch: java.io.IOException -> L2b
        L1d:
            if (r6 == 0) goto L35
            java.lang.String r2 = ","
            j0.i r6 = j0.i.d(r6, r2)     // Catch: java.io.IOException -> L2b
            if (r6 == 0) goto L2d
            r0.add(r6)     // Catch: java.io.IOException -> L2b
            goto L2d
        L2b:
            r6 = move-exception
            goto L32
        L2d:
            java.lang.String r6 = r1.readLine()     // Catch: java.io.IOException -> L2b
            goto L1d
        L32:
            r6.toString()
        L35:
            j0.f r6 = new j0.f
            r6.<init>(r0)
            r5.f = r6
            boolean r6 = r5.c
            if (r6 == 0) goto L55
            java.lang.String[] r6 = r5.b
            int r0 = r6.length
            r1 = 0
        L44:
            if (r1 >= r0) goto L55
            r2 = r6[r1]
            java.util.List<j0.j> r3 = r5.e
            j0.j r4 = new j0.j
            r4.<init>(r2)
            r3.add(r4)
            int r1 = r1 + 1
            goto L44
        L55:
            return
    }

    @androidx.annotation.WorkerThread
    public java.util.List<java.lang.String> a(com.google.mlkit.vision.pose.Pose r7) {
            r6 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            r3 = 1
            if (r0 == r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            com.google.common.base.Preconditions.checkState(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            j0.f r1 = r6.f
            j0.b r1 = r1.c(r7)
            boolean r4 = r6.c
            if (r4 == 0) goto L78
            j0.c r4 = r6.d
            j0.b r1 = r4.a(r1)
            java.util.List r7 = r7.getAllPoseLandmarks()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L37
            java.lang.String r7 = r6.g
            r0.add(r7)
            return r0
        L37:
            java.util.List<j0.j> r7 = r6.e
            java.util.Iterator r7 = r7.iterator()
        L3d:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L72
            java.lang.Object r4 = r7.next()
            j0.j r4 = (j0.j) r4
            int r5 = r4.c()
            int r4 = r4.a(r1)
            if (r4 <= r5) goto L3d
            android.media.ToneGenerator r7 = new android.media.ToneGenerator
            r1 = 5
            r5 = 100
            r7.<init>(r1, r5)
            r1 = 24
            r7.startTone(r1)
            java.util.Locale r7 = java.util.Locale.US
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r1
            java.lang.String r1 = "%d"
            java.lang.String r7 = java.lang.String.format(r7, r1, r3)
            r6.g = r7
        L72:
            java.lang.String r7 = r6.g
            r0.add(r7)
            return r0
        L78:
            java.util.List r7 = r7.getAllPoseLandmarks()
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto Lb1
            java.lang.String r7 = r1.d()
            r0.add(r7)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            float r7 = r1.c(r7)
            j0.f r1 = r6.f
            int r1 = r1.e()
            float r1 = (float) r1
            float r7 = r7 / r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r7 = r7 * r1
            int r7 = java.lang.Math.round(r7)
            r2.append(r7)
            java.lang.String r7 = ""
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r0.add(r7)
        Lb1:
            return r0
    }
}
