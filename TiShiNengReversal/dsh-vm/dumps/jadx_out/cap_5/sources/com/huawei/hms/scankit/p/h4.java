package com.huawei.hms.scankit.p;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class h4 extends com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate.Stub {
    private static volatile com.huawei.hms.scankit.p.h4 d;
    android.graphics.Point a;
    int b;
    android.graphics.Rect c;

    static {
            com.huawei.hms.scankit.p.h4 r0 = new com.huawei.hms.scankit.p.h4
            r0.<init>()
            com.huawei.hms.scankit.p.h4.d = r0
            return
    }

    private h4() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            return
    }

    private com.huawei.hms.scankit.p.e6 a(byte[] r6, int r7, int r8, int r9) {
            r5 = this;
            r0 = 0
            if (r9 == 0) goto L53
            r1 = 2
            if (r9 == r1) goto L32
            r1 = 3
            if (r9 == r1) goto Le
            com.huawei.hms.scankit.p.e6 r6 = r5.a(r6, r7, r8)
            return r6
        Le:
            int r9 = r6.length
            byte[] r9 = new byte[r9]
            r1 = 0
        L12:
            if (r1 >= r8) goto L2d
            r2 = 0
        L15:
            if (r2 >= r7) goto L2a
            int r3 = r8 + (-1)
            int r3 = r3 - r1
            int r3 = r3 * r7
            int r3 = r3 + r7
            int r3 = r3 + (-1)
            int r3 = r3 - r2
            int r4 = r1 * r7
            int r4 = r4 + r2
            r4 = r6[r4]
            r9[r3] = r4
            int r2 = r2 + 1
            goto L15
        L2a:
            int r1 = r1 + 1
            goto L12
        L2d:
            com.huawei.hms.scankit.p.e6 r6 = r5.a(r9, r7, r8)
            return r6
        L32:
            int r9 = r6.length
            byte[] r9 = new byte[r9]
            r1 = 0
        L36:
            if (r1 >= r8) goto L4e
            r2 = 0
        L39:
            if (r2 >= r7) goto L4b
            int r3 = r7 + (-1)
            int r3 = r3 - r2
            int r3 = r3 * r8
            int r3 = r3 + r1
            int r4 = r1 * r7
            int r4 = r4 + r2
            r4 = r6[r4]
            r9[r3] = r4
            int r2 = r2 + 1
            goto L39
        L4b:
            int r1 = r1 + 1
            goto L36
        L4e:
            com.huawei.hms.scankit.p.e6 r6 = r5.a(r9, r8, r7)
            return r6
        L53:
            int r9 = r6.length
            byte[] r9 = new byte[r9]
            r1 = 0
        L57:
            if (r1 >= r8) goto L6f
            r2 = 0
        L5a:
            if (r2 >= r7) goto L6c
            int r3 = r2 * r8
            int r3 = r3 + r8
            int r3 = r3 - r1
            int r3 = r3 + (-1)
            int r4 = r1 * r7
            int r4 = r4 + r2
            r4 = r6[r4]
            r9[r3] = r4
            int r2 = r2 + 1
            goto L5a
        L6c:
            int r1 = r1 + 1
            goto L57
        L6f:
            com.huawei.hms.scankit.p.e6 r6 = r5.a(r9, r8, r7)
            return r6
    }

    public static com.huawei.hms.scankit.p.h4 a() {
            com.huawei.hms.scankit.p.h4 r0 = com.huawei.hms.scankit.p.h4.d
            return r0
    }

    public synchronized android.graphics.Rect a(int r4, int r5) {
            r3 = this;
            monitor-enter(r3)
            int r0 = java.lang.Math.min(r4, r5)     // Catch: java.lang.Throwable -> L15
            int r4 = r4 - r0
            int r4 = r4 / 2
            int r5 = r5 - r0
            int r5 = r5 / 2
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L15
            int r2 = r4 + r0
            int r0 = r0 + r5
            r1.<init>(r4, r5, r2, r0)     // Catch: java.lang.Throwable -> L15
            monitor-exit(r3)
            return r1
        L15:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L15
            throw r4
    }

    public com.huawei.hms.scankit.p.e6 a(byte[] r13, int r14, int r15) {
            r12 = this;
            r3 = r15
            android.graphics.Rect r0 = r12.b(r14, r15)
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            int r0 = java.lang.Math.min(r14, r15)
            double r0 = (double) r0
            r4 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r0 = r0 * r4
            int r0 = (int) r0
            int r1 = r14 - r0
            int r1 = r1 / 2
            int r6 = r3 - r0
            int r6 = r6 / 2
            android.graphics.Rect r7 = r12.c
            r8 = 0
            if (r7 == 0) goto Lb4
            int r0 = r7.left
            r1 = -1
            if (r0 != r1) goto L52
            int r0 = r7.right
            if (r0 != r1) goto L52
            int r0 = r7.top
            if (r0 != r1) goto L52
            int r0 = r7.bottom
            if (r0 != r1) goto L52
            double r0 = (double) r14
            r6 = 4605831338911806259(0x3feb333333333333, double:0.85)
            double r0 = r0 * r6
            int r0 = (int) r0
            int r1 = r14 - r0
            int r1 = r1 / 2
            double r6 = (double) r3
            double r4 = r4 * r6
            int r4 = (int) r4
            r9 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            double r6 = r6 * r9
            int r6 = (int) r6
        L4d:
            r11 = r1
            r1 = r0
            r0 = r4
            r4 = r11
            goto Lb6
        L52:
            int r0 = java.lang.Math.min(r14, r15)
            double r0 = (double) r0
            r4 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r0 = r0 * r4
            int r0 = (int) r0
            int r1 = r14 - r0
            int r1 = r1 / 2
            android.graphics.Rect r4 = new android.graphics.Rect
            android.graphics.Rect r5 = r12.c
            int r6 = r5.left
            int r7 = r5.top
            int r9 = r5.right
            int r5 = r5.bottom
            r4.<init>(r6, r7, r9, r5)
            int r5 = java.lang.Math.max(r14, r15)
            android.graphics.Point r6 = r12.a
            if (r6 == 0) goto L7f
            int r7 = r6.x
            int r6 = r6.y
            goto L81
        L7f:
            r6 = r5
            r7 = r6
        L81:
            int r6 = java.lang.Math.max(r7, r6)
            float r5 = (float) r5
            float r6 = (float) r6
            float r5 = r5 / r6
            android.graphics.Rect r6 = r12.c
            int r7 = r6.top
            float r7 = (float) r7
            float r7 = r7 * r5
            int r7 = (int) r7
            r4.top = r7
            int r6 = r6.bottom
            float r6 = (float) r6
            float r6 = r6 * r5
            int r5 = (int) r6
            r4.bottom = r5
            float r4 = (float) r7
            float r6 = (float) r3
            r9 = 1096810496(0x41600000, float:14.0)
            float r6 = r6 / r9
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto La5
            int r4 = (int) r6
            int r7 = r7 - r4
        La5:
            if (r7 >= 0) goto La9
            r6 = 0
            goto Laa
        La9:
            r6 = r7
        Laa:
            int r4 = r5 - r6
            int r5 = r6 + r4
            if (r5 <= r3) goto L4d
            int r4 = r3 - r0
            int r6 = r4 / 2
        Lb4:
            r4 = r1
            r1 = r0
        Lb6:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "top:"
            r5.append(r7)
            r5.append(r6)
            java.lang.String r7 = "scanSizeHeight"
            r5.append(r7)
            r5.append(r0)
            java.lang.String r7 = "mHeight:"
            r5.append(r7)
            r5.append(r15)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "ScanSize"
            com.huawei.hms.scankit.p.o4.a(r7, r5)
            int r5 = r6 + r0
            if (r3 >= r5) goto Le3
            r7 = r3
            r5 = 0
            goto Le5
        Le3:
            r7 = r0
            r5 = r6
        Le5:
            int r0 = r4 + r1
            if (r14 >= r0) goto Lec
            r6 = r14
            r4 = 0
            goto Led
        Lec:
            r6 = r1
        Led:
            com.huawei.hms.scankit.p.e6 r0 = new com.huawei.hms.scankit.p.e6
            r8 = 0
            r1 = r13
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public synchronized android.graphics.Rect b(int r5, int r6) {
            r4 = this;
            monitor-enter(r4)
            android.graphics.Rect r0 = r4.a(r5, r6)     // Catch: java.lang.Throwable -> L3d
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L3d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3d
            android.graphics.Point r0 = new android.graphics.Point     // Catch: java.lang.Throwable -> L3d
            r0.<init>(r5, r6)     // Catch: java.lang.Throwable -> L3d
            android.graphics.Point r5 = r4.a     // Catch: java.lang.Throwable -> L3d
            if (r5 != 0) goto L16
            monitor-exit(r4)
            r5 = 0
            return r5
        L16:
            int r6 = r5.x     // Catch: java.lang.Throwable -> L3d
            int r5 = r5.y     // Catch: java.lang.Throwable -> L3d
            if (r6 >= r5) goto L3f
            int r2 = r1.left     // Catch: java.lang.Throwable -> L3d
            int r3 = r0.y     // Catch: java.lang.Throwable -> L3d
            int r2 = r2 * r3
            int r2 = r2 / r6
            r1.left = r2     // Catch: java.lang.Throwable -> L3d
            int r2 = r1.right     // Catch: java.lang.Throwable -> L3d
            int r2 = r2 * r3
            int r2 = r2 / r6
            r1.right = r2     // Catch: java.lang.Throwable -> L3d
            int r6 = r1.top     // Catch: java.lang.Throwable -> L3d
            int r0 = r0.x     // Catch: java.lang.Throwable -> L3d
            int r6 = r6 * r0
            int r6 = r6 / r5
            r1.top = r6     // Catch: java.lang.Throwable -> L3d
            int r6 = r1.bottom     // Catch: java.lang.Throwable -> L3d
            int r6 = r6 * r0
            int r6 = r6 / r5
            r1.bottom = r6     // Catch: java.lang.Throwable -> L3d
            goto L5f
        L3d:
            r5 = move-exception
            goto L61
        L3f:
            int r2 = r1.top     // Catch: java.lang.Throwable -> L3d
            int r3 = r0.y     // Catch: java.lang.Throwable -> L3d
            int r2 = r2 * r3
            int r2 = r2 / r5
            r1.top = r2     // Catch: java.lang.Throwable -> L3d
            int r2 = r1.bottom     // Catch: java.lang.Throwable -> L3d
            int r2 = r2 * r3
            int r2 = r2 / r5
            r1.bottom = r2     // Catch: java.lang.Throwable -> L3d
            int r5 = r1.left     // Catch: java.lang.Throwable -> L3d
            int r0 = r0.x     // Catch: java.lang.Throwable -> L3d
            int r5 = r5 * r0
            int r5 = r5 / r6
            r1.left = r5     // Catch: java.lang.Throwable -> L3d
            int r5 = r1.right     // Catch: java.lang.Throwable -> L3d
            int r5 = r5 * r0
            int r5 = r5 / r6
            r1.right = r5     // Catch: java.lang.Throwable -> L3d
        L5f:
            monitor-exit(r4)
            return r1
        L61:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
            throw r5
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate
    public com.huawei.hms.scankit.p.s6[] decode(byte[] r6, int r7, int r8, int r9, int r10, com.huawei.hms.feature.dynamic.IObjectWrapper r11) throws android.os.RemoteException {
            r5 = this;
            boolean r0 = com.huawei.hms.scankit.p.r3.A
            if (r0 != 0) goto L7
            com.huawei.hms.scankit.util.OpencvJNI.init()
        L7:
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L52
            java.lang.Object r2 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r11)
            boolean r2 = r2 instanceof android.os.Bundle
            if (r2 == 0) goto L52
            java.lang.Object r2 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r11)
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r3 = "Screen"
            android.os.Parcelable r3 = r2.getParcelable(r3)
            android.graphics.Point r3 = (android.graphics.Point) r3
            r5.a = r3
            java.lang.String r3 = "Rect"
            android.os.Parcelable r2 = r2.getParcelable(r3)
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            r5.c = r2
            java.lang.Object r2 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r11)
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r3 = "USEAPK"
            boolean r2 = r2.getBoolean(r3, r1)
            java.lang.Object r3 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r11)
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r4 = "ROLLBACK"
            boolean r3 = r3.getBoolean(r4, r1)
            java.lang.Object r11 = com.huawei.hms.feature.dynamic.ObjectWrapper.unwrap(r11)
            android.os.Bundle r11 = (android.os.Bundle) r11
            java.lang.String r4 = "ParseResult"
            boolean r11 = r11.getBoolean(r4, r0)
            goto L55
        L52:
            r11 = 1
            r2 = 0
            r3 = 0
        L55:
            com.huawei.hms.scankit.p.r3.f = r11
            if (r3 == 0) goto L68
            boolean r11 = com.huawei.hms.scankit.p.r3.a
            if (r11 != 0) goto L68
            if (r2 == 0) goto L68
            com.huawei.hms.scankit.p.s6 r6 = com.huawei.hms.scankit.p.r6.c()
            com.huawei.hms.scankit.p.s6[] r7 = new com.huawei.hms.scankit.p.s6[r0]
            r7[r1] = r6
            return r7
        L68:
            android.graphics.Rect r11 = r5.c
            if (r11 != 0) goto L74
            android.graphics.Rect r11 = new android.graphics.Rect
            r0 = -1
            r11.<init>(r0, r0, r0, r0)
            r5.c = r11
        L74:
            android.graphics.Point r11 = r5.a
            if (r11 != 0) goto L83
            android.graphics.Point r11 = new android.graphics.Point
            r0 = 1080(0x438, float:1.513E-42)
            r1 = 1920(0x780, float:2.69E-42)
            r11.<init>(r0, r1)
            r5.a = r11
        L83:
            com.huawei.hms.scankit.p.e6 r6 = r5.a(r6, r7, r8, r9)
            byte[] r7 = r6.b()
            com.huawei.hms.scankit.p.x6 r8 = new com.huawei.hms.scankit.p.x6
            int r9 = r6.c()
            int r6 = r6.a()
            r8.<init>(r9, r6, r10)
            int r6 = r5.b
            int r9 = r6 + 1
            r5.b = r9
            com.huawei.hms.scankit.p.x6 r6 = r8.a(r6)
            com.huawei.hms.scankit.p.s6[] r6 = com.huawei.hms.scankit.p.m1.c(r7, r6)
            return r6
    }
}
