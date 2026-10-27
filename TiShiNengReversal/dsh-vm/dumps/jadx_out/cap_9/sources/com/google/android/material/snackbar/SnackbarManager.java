package com.google.android.material.snackbar;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class SnackbarManager {
    private static final int LONG_DURATION_MS = 2750;
    static final int MSG_TIMEOUT = 0;
    private static final int SHORT_DURATION_MS = 1500;
    private static com.google.android.material.snackbar.SnackbarManager snackbarManager;

    @androidx.annotation.Nullable
    private com.google.android.material.snackbar.SnackbarManager.SnackbarRecord currentSnackbar;

    @androidx.annotation.NonNull
    private final android.os.Handler handler;

    @androidx.annotation.NonNull
    private final java.lang.Object lock;

    @androidx.annotation.Nullable
    private com.google.android.material.snackbar.SnackbarManager.SnackbarRecord nextSnackbar;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface Callback {
        void dismiss(int r1);

        void show();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SnackbarRecord {

        @androidx.annotation.NonNull
        final java.lang.ref.WeakReference<com.google.android.material.snackbar.SnackbarManager.Callback> callback;
        int duration;
        boolean paused;

        SnackbarRecord(int r2, com.google.android.material.snackbar.SnackbarManager.Callback r3) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r3)
                r1.callback = r0
                r1.duration = r2
                return
        }

        boolean isSnackbar(@androidx.annotation.Nullable com.google.android.material.snackbar.SnackbarManager.Callback r2) {
                r1 = this;
                if (r2 == 0) goto Lc
                java.lang.ref.WeakReference<com.google.android.material.snackbar.SnackbarManager$Callback> r0 = r1.callback
                java.lang.Object r0 = r0.get()
                if (r0 != r2) goto Lc
                r2 = 1
                return r2
            Lc:
                r2 = 0
                return r2
        }
    }

    private SnackbarManager() {
            r3 = this;
            r3.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.lock = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            com.google.android.material.snackbar.SnackbarManager$1 r2 = new com.google.android.material.snackbar.SnackbarManager$1
            r2.<init>(r3)
            r0.<init>(r1, r2)
            r3.handler = r0
            return
    }

    private boolean cancelSnackbarLocked(@androidx.annotation.NonNull com.google.android.material.snackbar.SnackbarManager.SnackbarRecord r3, int r4) {
            r2 = this;
            java.lang.ref.WeakReference<com.google.android.material.snackbar.SnackbarManager$Callback> r0 = r3.callback
            java.lang.Object r0 = r0.get()
            com.google.android.material.snackbar.SnackbarManager$Callback r0 = (com.google.android.material.snackbar.SnackbarManager.Callback) r0
            if (r0 == 0) goto L14
            android.os.Handler r1 = r2.handler
            r1.removeCallbacksAndMessages(r3)
            r0.dismiss(r4)
            r3 = 1
            return r3
        L14:
            r3 = 0
            return r3
    }

    static com.google.android.material.snackbar.SnackbarManager getInstance() {
            com.google.android.material.snackbar.SnackbarManager r0 = com.google.android.material.snackbar.SnackbarManager.snackbarManager
            if (r0 != 0) goto Lb
            com.google.android.material.snackbar.SnackbarManager r0 = new com.google.android.material.snackbar.SnackbarManager
            r0.<init>()
            com.google.android.material.snackbar.SnackbarManager.snackbarManager = r0
        Lb:
            com.google.android.material.snackbar.SnackbarManager r0 = com.google.android.material.snackbar.SnackbarManager.snackbarManager
            return r0
    }

    private boolean isCurrentSnackbarLocked(com.google.android.material.snackbar.SnackbarManager.Callback r2) {
            r1 = this;
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r0 = r1.currentSnackbar
            if (r0 == 0) goto Lc
            boolean r2 = r0.isSnackbar(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    private boolean isNextSnackbarLocked(com.google.android.material.snackbar.SnackbarManager.Callback r2) {
            r1 = this;
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r0 = r1.nextSnackbar
            if (r0 == 0) goto Lc
            boolean r2 = r0.isSnackbar(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    private void scheduleTimeoutLocked(@androidx.annotation.NonNull com.google.android.material.snackbar.SnackbarManager.SnackbarRecord r5) {
            r4 = this;
            int r0 = r5.duration
            r1 = -2
            if (r0 != r1) goto L6
            return
        L6:
            if (r0 <= 0) goto L9
            goto L11
        L9:
            r1 = -1
            if (r0 != r1) goto Lf
            r0 = 1500(0x5dc, float:2.102E-42)
            goto L11
        Lf:
            r0 = 2750(0xabe, float:3.854E-42)
        L11:
            android.os.Handler r1 = r4.handler
            r1.removeCallbacksAndMessages(r5)
            android.os.Handler r1 = r4.handler
            r2 = 0
            android.os.Message r5 = android.os.Message.obtain(r1, r2, r5)
            long r2 = (long) r0
            r1.sendMessageDelayed(r5, r2)
            return
    }

    private void showNextSnackbarLocked() {
            r2 = this;
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r0 = r2.nextSnackbar
            if (r0 == 0) goto L19
            r2.currentSnackbar = r0
            r1 = 0
            r2.nextSnackbar = r1
            java.lang.ref.WeakReference<com.google.android.material.snackbar.SnackbarManager$Callback> r0 = r0.callback
            java.lang.Object r0 = r0.get()
            com.google.android.material.snackbar.SnackbarManager$Callback r0 = (com.google.android.material.snackbar.SnackbarManager.Callback) r0
            if (r0 == 0) goto L17
            r0.show()
            return
        L17:
            r2.currentSnackbar = r1
        L19:
            return
    }

    public void dismiss(com.google.android.material.snackbar.SnackbarManager.Callback r3, int r4) {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            boolean r1 = r2.isCurrentSnackbarLocked(r3)     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto L11
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r3 = r2.currentSnackbar     // Catch: java.lang.Throwable -> Lf
            r2.cancelSnackbarLocked(r3, r4)     // Catch: java.lang.Throwable -> Lf
            goto L1c
        Lf:
            r3 = move-exception
            goto L1e
        L11:
            boolean r3 = r2.isNextSnackbarLocked(r3)     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto L1c
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r3 = r2.nextSnackbar     // Catch: java.lang.Throwable -> Lf
            r2.cancelSnackbarLocked(r3, r4)     // Catch: java.lang.Throwable -> Lf
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    void handleTimeout(@androidx.annotation.NonNull com.google.android.material.snackbar.SnackbarManager.SnackbarRecord r3) {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r1 = r2.currentSnackbar     // Catch: java.lang.Throwable -> Lc
            if (r1 == r3) goto Le
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r1 = r2.nextSnackbar     // Catch: java.lang.Throwable -> Lc
            if (r1 != r3) goto L12
            goto Le
        Lc:
            r3 = move-exception
            goto L14
        Le:
            r1 = 2
            r2.cancelSnackbarLocked(r3, r1)     // Catch: java.lang.Throwable -> Lc
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r3
    }

    public boolean isCurrent(com.google.android.material.snackbar.SnackbarManager.Callback r2) {
            r1 = this;
            java.lang.Object r0 = r1.lock
            monitor-enter(r0)
            boolean r2 = r1.isCurrentSnackbarLocked(r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public boolean isCurrentOrNext(com.google.android.material.snackbar.SnackbarManager.Callback r3) {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            boolean r1 = r2.isCurrentSnackbarLocked(r3)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            boolean r3 = r2.isNextSnackbarLocked(r3)     // Catch: java.lang.Throwable -> L12
            if (r3 == 0) goto L10
            goto L14
        L10:
            r3 = 0
            goto L15
        L12:
            r3 = move-exception
            goto L17
        L14:
            r3 = 1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r3
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    public void onDismissed(com.google.android.material.snackbar.SnackbarManager.Callback r2) {
            r1 = this;
            java.lang.Object r0 = r1.lock
            monitor-enter(r0)
            boolean r2 = r1.isCurrentSnackbarLocked(r2)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L16
            r2 = 0
            r1.currentSnackbar = r2     // Catch: java.lang.Throwable -> L14
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r2 = r1.nextSnackbar     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L16
            r1.showNextSnackbarLocked()     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r2 = move-exception
            goto L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r2
    }

    public void onShown(com.google.android.material.snackbar.SnackbarManager.Callback r2) {
            r1 = this;
            java.lang.Object r0 = r1.lock
            monitor-enter(r0)
            boolean r2 = r1.isCurrentSnackbarLocked(r2)     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r2 = r1.currentSnackbar     // Catch: java.lang.Throwable -> Lf
            r1.scheduleTimeoutLocked(r2)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r2 = move-exception
            goto L13
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    public void pauseTimeout(com.google.android.material.snackbar.SnackbarManager.Callback r3) {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            boolean r3 = r2.isCurrentSnackbarLocked(r3)     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L1a
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r3 = r2.currentSnackbar     // Catch: java.lang.Throwable -> L18
            boolean r1 = r3.paused     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L1a
            r1 = 1
            r3.paused = r1     // Catch: java.lang.Throwable -> L18
            android.os.Handler r1 = r2.handler     // Catch: java.lang.Throwable -> L18
            r1.removeCallbacksAndMessages(r3)     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r3 = move-exception
            goto L1c
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            return
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L18
            throw r3
    }

    public void restoreTimeoutIfPaused(com.google.android.material.snackbar.SnackbarManager.Callback r3) {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            boolean r3 = r2.isCurrentSnackbarLocked(r3)     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L18
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r3 = r2.currentSnackbar     // Catch: java.lang.Throwable -> L16
            boolean r1 = r3.paused     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            r1 = 0
            r3.paused = r1     // Catch: java.lang.Throwable -> L16
            r2.scheduleTimeoutLocked(r3)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r3 = move-exception
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r3
    }

    public void show(int r3, com.google.android.material.snackbar.SnackbarManager.Callback r4) {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
            boolean r1 = r2.isCurrentSnackbarLocked(r4)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1b
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r4 = r2.currentSnackbar     // Catch: java.lang.Throwable -> L19
            r4.duration = r3     // Catch: java.lang.Throwable -> L19
            android.os.Handler r3 = r2.handler     // Catch: java.lang.Throwable -> L19
            r3.removeCallbacksAndMessages(r4)     // Catch: java.lang.Throwable -> L19
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r3 = r2.currentSnackbar     // Catch: java.lang.Throwable -> L19
            r2.scheduleTimeoutLocked(r3)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r3 = move-exception
            goto L42
        L1b:
            boolean r1 = r2.isNextSnackbarLocked(r4)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L26
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r4 = r2.nextSnackbar     // Catch: java.lang.Throwable -> L19
            r4.duration = r3     // Catch: java.lang.Throwable -> L19
            goto L2d
        L26:
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r1 = new com.google.android.material.snackbar.SnackbarManager$SnackbarRecord     // Catch: java.lang.Throwable -> L19
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L19
            r2.nextSnackbar = r1     // Catch: java.lang.Throwable -> L19
        L2d:
            com.google.android.material.snackbar.SnackbarManager$SnackbarRecord r3 = r2.currentSnackbar     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L3a
            r4 = 4
            boolean r3 = r2.cancelSnackbarLocked(r3, r4)     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L3a:
            r3 = 0
            r2.currentSnackbar = r3     // Catch: java.lang.Throwable -> L19
            r2.showNextSnackbarLocked()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
    }
}
