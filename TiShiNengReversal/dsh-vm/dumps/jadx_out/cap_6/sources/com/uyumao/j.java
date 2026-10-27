package com.uyumao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j {
    public static android.content.Context a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        public static final com.uyumao.j a = null;

        static {
                com.uyumao.j r0 = new com.uyumao.j
                r0.<init>()
                com.uyumao.j.a.a = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    public synchronized com.uyumao.i a() {
            r11 = this;
            monitor-enter(r11)
            r0 = 0
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = "android.intent.action.BATTERY_CHANGED"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L62
            android.content.Context r2 = com.uyumao.j.a     // Catch: java.lang.Throwable -> L62
            android.content.Intent r1 = r2.registerReceiver(r0, r1)     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = "level"
            r3 = 0
            int r2 = r1.getIntExtra(r2, r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r4 = "voltage"
            int r4 = r1.getIntExtra(r4, r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = "temperature"
            int r5 = r1.getIntExtra(r5, r3)     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = "status"
            int r6 = r1.getIntExtra(r6, r3)     // Catch: java.lang.Throwable -> L62
            r7 = -1
            r8 = 2
            r9 = 1
            if (r6 == r9) goto L3e
            if (r6 == r8) goto L3d
            r10 = 3
            if (r6 == r10) goto L3b
            r10 = 4
            if (r6 == r10) goto L3b
            r10 = 5
            if (r6 == r10) goto L39
            goto L3e
        L39:
            r7 = 2
            goto L3e
        L3b:
            r7 = 0
            goto L3e
        L3d:
            r7 = 1
        L3e:
            java.lang.String r6 = "plugged"
            int r1 = r1.getIntExtra(r6, r3)     // Catch: java.lang.Throwable -> L62
            if (r1 == r9) goto L4b
            if (r1 == r8) goto L49
            goto L4c
        L49:
            r3 = 2
            goto L4c
        L4b:
            r3 = 1
        L4c:
            com.uyumao.i r1 = new com.uyumao.i     // Catch: java.lang.Throwable -> L62
            r1.<init>()     // Catch: java.lang.Throwable -> L62
            r1.a = r2     // Catch: java.lang.Throwable -> L61
            r1.b = r4     // Catch: java.lang.Throwable -> L61
            r1.d = r7     // Catch: java.lang.Throwable -> L61
            r1.c = r5     // Catch: java.lang.Throwable -> L61
            r1.e = r3     // Catch: java.lang.Throwable -> L61
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L61
            r1.f = r2     // Catch: java.lang.Throwable -> L61
        L61:
            r0 = r1
        L62:
            monitor-exit(r11)
            return r0
    }
}
