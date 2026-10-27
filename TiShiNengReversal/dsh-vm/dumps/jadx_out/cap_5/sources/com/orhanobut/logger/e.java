package com.orhanobut.logger;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e implements com.orhanobut.logger.h {

    @androidx.annotation.NonNull
    private final android.os.Handler a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends android.os.Handler {

        @androidx.annotation.NonNull
        private final java.lang.String a;
        private final int b;

        a(@androidx.annotation.NonNull android.os.Looper r1, @androidx.annotation.NonNull java.lang.String r2, int r3) {
                r0 = this;
                java.lang.Object r1 = com.orhanobut.logger.n.a(r1)
                android.os.Looper r1 = (android.os.Looper) r1
                r0.<init>(r1)
                java.lang.Object r1 = com.orhanobut.logger.n.a(r2)
                java.lang.String r1 = (java.lang.String) r1
                r0.a = r1
                r0.b = r3
                return
        }

        private java.io.File a(@androidx.annotation.NonNull java.lang.String r11, @androidx.annotation.NonNull java.lang.String r12) {
                r10 = this;
                com.orhanobut.logger.n.a(r11)
                com.orhanobut.logger.n.a(r12)
                java.io.File r0 = new java.io.File
                r0.<init>(r11)
                boolean r11 = r0.exists()
                if (r11 != 0) goto L14
                r0.mkdirs()
            L14:
                java.io.File r11 = new java.io.File
                r1 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                r3 = 2
                java.lang.Object[] r4 = new java.lang.Object[r3]
                r4[r1] = r12
                r5 = 1
                r4[r5] = r2
                java.lang.String r2 = "%s_%s.csv"
                java.lang.String r4 = java.lang.String.format(r2, r4)
                r11.<init>(r0, r4)
                r4 = 0
                r6 = 0
            L2e:
                boolean r7 = r11.exists()
                if (r7 == 0) goto L4c
                int r6 = r6 + r5
                java.io.File r4 = new java.io.File
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                java.lang.Object[] r8 = new java.lang.Object[r3]
                r8[r1] = r12
                r8[r5] = r7
                java.lang.String r7 = java.lang.String.format(r2, r8)
                r4.<init>(r0, r7)
                r9 = r4
                r4 = r11
                r11 = r9
                goto L2e
            L4c:
                if (r4 == 0) goto L5b
                long r0 = r4.length()
                int r12 = r10.b
                long r2 = (long) r12
                int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r12 < 0) goto L5a
                goto L5b
            L5a:
                return r4
            L5b:
                return r11
        }

        private void b(@androidx.annotation.NonNull java.io.FileWriter r1, @androidx.annotation.NonNull java.lang.String r2) throws java.io.IOException {
                r0 = this;
                com.orhanobut.logger.n.a(r1)
                com.orhanobut.logger.n.a(r2)
                r1.append(r2)
                return
        }

        @Override // android.os.Handler
        public void handleMessage(@androidx.annotation.NonNull android.os.Message r5) {
                r4 = this;
                java.lang.Object r5 = r5.obj
                java.lang.String r5 = (java.lang.String) r5
                java.lang.String r0 = r4.a
                java.lang.String r1 = "logs"
                java.io.File r0 = r4.a(r0, r1)
                r1 = 0
                java.io.FileWriter r2 = new java.io.FileWriter     // Catch: java.io.IOException -> L20
                r3 = 1
                r2.<init>(r0, r3)     // Catch: java.io.IOException -> L20
                r4.b(r2, r5)     // Catch: java.io.IOException -> L1d
                r2.flush()     // Catch: java.io.IOException -> L1d
                r2.close()     // Catch: java.io.IOException -> L1d
                return
            L1d:
                r1 = r2
                goto L21
            L20:
            L21:
                if (r1 == 0) goto L29
                r1.flush()     // Catch: java.io.IOException -> L29
                r1.close()     // Catch: java.io.IOException -> L29
            L29:
                return
        }
    }

    public e(@androidx.annotation.NonNull android.os.Handler r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.orhanobut.logger.n.a(r1)
            android.os.Handler r1 = (android.os.Handler) r1
            r0.a = r1
            return
    }

    @Override // com.orhanobut.logger.h
    public void a(int r1, @androidx.annotation.Nullable java.lang.String r2, @androidx.annotation.NonNull java.lang.String r3) {
            r0 = this;
            com.orhanobut.logger.n.a(r3)
            android.os.Handler r2 = r0.a
            android.os.Message r1 = r2.obtainMessage(r1, r3)
            r2.sendMessage(r1)
            return
    }
}
