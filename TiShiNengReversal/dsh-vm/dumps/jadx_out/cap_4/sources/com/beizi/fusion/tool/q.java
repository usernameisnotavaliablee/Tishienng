package com.beizi.fusion.tool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class q {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.fusion.tool.q$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        private static final com.beizi.fusion.tool.q a = null;

        static {
                com.beizi.fusion.tool.q r0 = new com.beizi.fusion.tool.q
                r1 = 0
                r0.<init>(r1)
                com.beizi.fusion.tool.q.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.beizi.fusion.tool.q a() {
                com.beizi.fusion.tool.q r0 = com.beizi.fusion.tool.q.a.a
                return r0
        }
    }

    private q() {
            r0 = this;
            r0.<init>()
            return
    }

    /* synthetic */ q(com.beizi.fusion.tool.q.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static final com.beizi.fusion.tool.q a() {
            com.beizi.fusion.tool.q r0 = com.beizi.fusion.tool.q.a.a()
            return r0
    }

    private java.lang.String a(java.lang.String r8) {
            r7 = this;
            r0 = 0
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "get"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L22
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L22
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L22
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L22
            r2[r6] = r8     // Catch: java.lang.Throwable -> L22
            java.lang.Object r8 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L22
            if (r8 == 0) goto L22
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L22
            return r8
        L22:
            return r0
    }

    private int b() {
            r6 = this;
            java.lang.String r0 = "ro.hardware"
            java.lang.String r0 = r6.a(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.String r0 = r0.toLowerCase()
            r0.getClass()
            int r2 = r0.hashCode()
            r3 = 2
            r4 = 1
            r5 = -1
            switch(r2) {
                case -1367724016: goto L5f;
                case -822798509: goto L54;
                case 109271: goto L49;
                case 3570999: goto L3e;
                case 3613077: goto L33;
                case 100361430: goto L28;
                case 937844646: goto L1d;
                default: goto L1b;
            }
        L1b:
            r1 = -1
            goto L68
        L1d:
            java.lang.String r1 = "android_x86"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L26
            goto L1b
        L26:
            r1 = 6
            goto L68
        L28:
            java.lang.String r1 = "intel"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L31
            goto L1b
        L31:
            r1 = 5
            goto L68
        L33:
            java.lang.String r1 = "vbox"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3c
            goto L1b
        L3c:
            r1 = 4
            goto L68
        L3e:
            java.lang.String r1 = "ttvm"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L47
            goto L1b
        L47:
            r1 = 3
            goto L68
        L49:
            java.lang.String r1 = "nox"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L52
            goto L1b
        L52:
            r1 = 2
            goto L68
        L54:
            java.lang.String r1 = "vbox86"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5d
            goto L1b
        L5d:
            r1 = 1
            goto L68
        L5f:
            java.lang.String r2 = "cancro"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L68
            goto L1b
        L68:
            switch(r1) {
                case 0: goto L6c;
                case 1: goto L6c;
                case 2: goto L6c;
                case 3: goto L6c;
                case 4: goto L6c;
                case 5: goto L6c;
                case 6: goto L6c;
                default: goto L6b;
            }
        L6b:
            return r3
        L6c:
            return r4
    }

    private boolean b(android.content.Context r2) {
            r1 = this;
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> Lb
            java.lang.String r0 = "android.hardware.camera"
            boolean r2 = r2.hasSystemFeature(r0)     // Catch: java.lang.Exception -> Lb
            return r2
        Lb:
            r2 = 0
            return r2
    }

    private int c() {
            r3 = this;
            java.lang.String r0 = "ro.build.flavor"
            java.lang.String r0 = r3.a(r0)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "vbox"
            boolean r1 = r0.contains(r1)
            r2 = 1
            if (r1 == 0) goto L18
            return r2
        L18:
            java.lang.String r1 = "sdk_gphone"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L21
            return r2
        L21:
            r0 = 2
            return r0
    }

    private boolean c(android.content.Context r2) {
            r1 = this;
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> Lb
            java.lang.String r0 = "android.hardware.camera.flash"
            boolean r2 = r2.hasSystemFeature(r0)     // Catch: java.lang.Exception -> Lb
            return r2
        Lb:
            r2 = 0
            return r2
    }

    private int d() {
            r3 = this;
            java.lang.String r0 = "ro.product.model"
            java.lang.String r0 = r3.a(r0)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "google_sdk"
            boolean r1 = r0.contains(r1)
            r2 = 1
            if (r1 == 0) goto L18
            return r2
        L18:
            java.lang.String r1 = "emulator"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L21
            return r2
        L21:
            java.lang.String r1 = "android sdk built for x86"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L2a
            return r2
        L2a:
            r0 = 2
            return r0
    }

    private boolean d(android.content.Context r2) {
            r1 = this;
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> Lb
            java.lang.String r0 = "android.hardware.bluetooth"
            boolean r2 = r2.hasSystemFeature(r0)     // Catch: java.lang.Exception -> Lb
            return r2
        Lb:
            r2 = 0
            return r2
    }

    private int e() {
            r3 = this;
            java.lang.String r0 = "ro.product.manufacturer"
            java.lang.String r0 = r3.a(r0)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "genymotion"
            boolean r1 = r0.contains(r1)
            r2 = 1
            if (r1 == 0) goto L18
            return r2
        L18:
            java.lang.String r1 = "netease"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L21
            return r2
        L21:
            r0 = 2
            return r0
    }

    private int f() {
            r3 = this;
            java.lang.String r0 = "ro.product.board"
            java.lang.String r0 = r3.a(r0)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "android"
            boolean r1 = r0.contains(r1)
            r2 = 1
            if (r1 == 0) goto L18
            return r2
        L18:
            java.lang.String r1 = "goldfish"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L21
            return r2
        L21:
            r0 = 2
            return r0
    }

    private int g() {
            r2 = this;
            java.lang.String r0 = "ro.board.platform"
            java.lang.String r0 = r2.a(r0)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "android"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L18
            r0 = 1
            return r0
        L18:
            r0 = 2
            return r0
    }

    private int h() {
            r2 = this;
            java.lang.String r0 = "gsm.version.baseband"
            java.lang.String r0 = r2.a(r0)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            java.lang.String r1 = "MS4wLjAuMA=="
            java.lang.String r1 = com.beizi.fusion.tool.d.a(r1)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L18
            r0 = 1
            return r0
        L18:
            r0 = 2
            return r0
    }

    public boolean a(android.content.Context r5) {
            r4 = this;
            r0 = 1
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r4.b()
            r2 = 0
            if (r1 == 0) goto L10
            if (r1 == r0) goto Lf
            r1 = 0
            goto L11
        Lf:
            return r0
        L10:
            r1 = 1
        L11:
            int r3 = r4.c()
            if (r3 == 0) goto L1b
            if (r3 == r0) goto L1a
            goto L1d
        L1a:
            return r0
        L1b:
            int r1 = r1 + 1
        L1d:
            int r3 = r4.d()
            if (r3 == 0) goto L27
            if (r3 == r0) goto L26
            goto L29
        L26:
            return r0
        L27:
            int r1 = r1 + 1
        L29:
            int r3 = r4.e()
            if (r3 == 0) goto L33
            if (r3 == r0) goto L32
            goto L35
        L32:
            return r0
        L33:
            int r1 = r1 + 1
        L35:
            int r3 = r4.f()
            if (r3 == 0) goto L3f
            if (r3 == r0) goto L3e
            goto L41
        L3e:
            return r0
        L3f:
            int r1 = r1 + 1
        L41:
            int r3 = r4.g()
            if (r3 == 0) goto L4b
            if (r3 == r0) goto L4a
            goto L4d
        L4a:
            return r0
        L4b:
            int r1 = r1 + 1
        L4d:
            int r3 = r4.h()
            if (r3 == 0) goto L57
            if (r3 == r0) goto L56
            goto L59
        L56:
            return r0
        L57:
            int r1 = r1 + 2
        L59:
            boolean r3 = r4.c(r5)
            if (r3 != 0) goto L61
            int r1 = r1 + 1
        L61:
            boolean r3 = r4.b(r5)
            if (r3 != 0) goto L69
            int r1 = r1 + 1
        L69:
            boolean r5 = r4.d(r5)
            if (r5 != 0) goto L71
            int r1 = r1 + 1
        L71:
            r5 = 3
            if (r1 <= r5) goto L75
            return r0
        L75:
            return r2
    }
}
