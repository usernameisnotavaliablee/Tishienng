package com.ss.android.socialbase.downloader.ws;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class up implements android.os.Handler.Callback {
    private volatile android.os.Handler j;

    private static class j {
        private static final android.os.Looper j = null;

        static {
                android.os.HandlerThread r0 = new android.os.HandlerThread
                java.lang.String r1 = "DownloadWatchDog"
                r0.<init>(r1)
                r0.start()
                android.os.Looper r0 = r0.getLooper()
                com.ss.android.socialbase.downloader.ws.up.j.j = r0
                return
        }

        public j() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ android.os.Looper j() {
                android.os.Looper r0 = com.ss.android.socialbase.downloader.ws.up.j.j
                return r0
        }
    }

    public interface xt {
        long j();
    }

    public up() {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = com.ss.android.socialbase.downloader.ws.up.j.j()
            r0.<init>(r1, r2)
            r2.j = r0
            return
    }

    public static android.os.Looper j() {
            android.os.Looper r0 = com.ss.android.socialbase.downloader.ws.up.j.j()
            return r0
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@androidx.annotation.NonNull android.os.Message r6) {
            r5 = this;
            int r0 = r6.what
            if (r0 == 0) goto L5
            goto L1b
        L5:
            java.lang.Object r6 = r6.obj     // Catch: java.lang.Throwable -> L17
            com.ss.android.socialbase.downloader.ws.up$xt r6 = (com.ss.android.socialbase.downloader.ws.up.xt) r6     // Catch: java.lang.Throwable -> L17
            long r0 = r6.j()     // Catch: java.lang.Throwable -> L17
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1b
            r5.j(r6, r0)     // Catch: java.lang.Throwable -> L17
            goto L1b
        L17:
            r6 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r6)
        L1b:
            r6 = 1
            return r6
    }

    public void j(com.ss.android.socialbase.downloader.ws.up.xt r4, long r5) {
            r3 = this;
            android.os.Handler r0 = r3.j
            if (r0 != 0) goto L5
            return
        L5:
            android.os.Message r1 = android.os.Message.obtain()
            r2 = 0
            r1.what = r2
            r1.obj = r4
            r0.sendMessageDelayed(r1, r5)
            return
    }

    public void xt() {
            r2 = this;
            android.os.Handler r0 = r2.j
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            r2.j = r1
            r0.removeCallbacksAndMessages(r1)
            return
    }
}
