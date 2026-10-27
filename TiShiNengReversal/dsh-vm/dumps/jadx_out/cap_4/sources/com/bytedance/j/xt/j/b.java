package com.bytedance.j.xt.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b extends android.os.FileObserver {
    private final com.bytedance.j.xt.j.a a;
    private final int b;
    private volatile boolean c;

    private final class a extends com.bytedance.sdk.component.oq.r.cw {
        private int a;
        final /* synthetic */ com.bytedance.j.xt.j.b b;

        a(com.bytedance.j.xt.j.b r1, int r2) {
                r0 = this;
                r0.b = r1
                java.lang.String r1 = "ANRFileObserver$RestartMonitorThread"
                r0.<init>(r1)
                r0.a = r2
                return
        }

        public void run() {
                r2 = this;
                int r0 = r2.a
                long r0 = (long) r0
                android.os.SystemClock.sleep(r0)
                com.bytedance.j.xt.j.b r0 = r2.b
                r1 = 1
                com.bytedance.j.xt.j.b.a(r0, r1)
                return
        }
    }

    public b(com.bytedance.j.xt.j.a r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r3 = 5000(0x1388, float:7.006E-42)
            r0.b = r3
            r3 = 1
            r0.c = r3
            if (r1 == 0) goto L15
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L15
            r0.a = r1
            return
        L15:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "params is not right path is null or ANRManager is null"
            r1.<init>(r2)
            throw r1
    }

    static /* synthetic */ boolean a(com.bytedance.j.xt.j.b r0, boolean r1) {
            r0.c = r1
            return r1
    }

    @Override // android.os.FileObserver
    public void onEvent(int r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r2.c
            if (r0 == 0) goto L36
            r0 = 8
            if (r3 != r0) goto L36
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L36
            java.lang.String r3 = "trace"
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L36
            com.bytedance.j.xt.j.a r3 = r2.a
            if (r3 == 0) goto L36
            r3 = 0
            r2.c = r3
            com.bytedance.j.xt.j.a r3 = r2.a
            java.lang.String r0 = "/data/anr/"
            java.lang.String r4 = r0.concat(r4)
            r0 = 80
            r1 = 200(0xc8, float:2.8E-43)
            r3.e(r1, r4, r0)
            com.bytedance.j.xt.j.b$a r3 = new com.bytedance.j.xt.j.b$a
            r4 = 5000(0x1388, float:7.006E-42)
            r3.<init>(r2, r4)
            r3.start()
        L36:
            return
    }
}
