package com.bytedance.j.xt.up.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class e {
    private int a;

    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private class b extends android.content.BroadcastReceiver {
        final /* synthetic */ com.bytedance.j.xt.up.j.e a;

        private b(com.bytedance.j.xt.up.j.e r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ b(com.bytedance.j.xt.up.j.e r1, com.bytedance.j.xt.up.j.e.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r3, android.content.Intent r4) {
                r2 = this;
                java.lang.String r3 = "android.intent.action.BATTERY_CHANGED"
                java.lang.String r0 = r4.getAction()     // Catch: java.lang.Throwable -> L28
                boolean r3 = r3.equals(r0)     // Catch: java.lang.Throwable -> L28
                if (r3 == 0) goto L28
                java.lang.String r3 = "level"
                r0 = 0
                int r3 = r4.getIntExtra(r3, r0)     // Catch: java.lang.Throwable -> L28
                java.lang.String r0 = "scale"
                r1 = 100
                int r4 = r4.getIntExtra(r0, r1)     // Catch: java.lang.Throwable -> L28
                com.bytedance.j.xt.up.j.e r0 = r2.a     // Catch: java.lang.Throwable -> L28
                float r3 = (float) r3     // Catch: java.lang.Throwable -> L28
                r1 = 1120403456(0x42c80000, float:100.0)
                float r3 = r3 * r1
                float r4 = (float) r4     // Catch: java.lang.Throwable -> L28
                float r3 = r3 / r4
                int r3 = (int) r3     // Catch: java.lang.Throwable -> L28
                com.bytedance.j.xt.up.j.e.b(r0, r3)     // Catch: java.lang.Throwable -> L28
            L28:
                return
        }
    }

    e(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.c(r1)     // Catch: java.lang.Throwable -> L6
        L6:
            return
    }

    static /* synthetic */ int b(com.bytedance.j.xt.up.j.e r0, int r1) {
            r0.a = r1
            return r1
    }

    private void c(android.content.Context r4) {
            r3 = this;
            com.bytedance.j.xt.up.j.e$b r0 = new com.bytedance.j.xt.up.j.e$b
            r1 = 0
            r0.<init>(r3, r1)
            android.content.IntentFilter r1 = new android.content.IntentFilter
            java.lang.String r2 = "android.intent.action.BATTERY_CHANGED"
            r1.<init>(r2)
            r4.registerReceiver(r0, r1)
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.a
            return r0
    }
}
