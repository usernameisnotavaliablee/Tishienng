package com.bxkj.student.run.app.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class d0 {
    private static com.bxkj.student.run.app.utils.d0 b;
    private java.util.concurrent.ExecutorService a;

    private d0() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            r1.a = r0
            return
    }

    public static /* synthetic */ void a(com.bxkj.student.run.app.utils.d0 r0, android.content.Context r1, java.util.List r2) {
            r0.i(r1, r2)
            return
    }

    public static /* synthetic */ void b(int[] r6, java.util.List r7, android.content.Context r8, android.media.MediaPlayer r9, java.util.concurrent.CountDownLatch r10, android.media.AudioManager r11, android.media.MediaPlayer r12) {
            r12.reset()
            r0 = 0
            r1 = r6[r0]
            int r1 = r1 + 1
            r6[r0] = r1
            int r2 = r7.size()
            if (r1 >= r2) goto L3c
            android.content.res.Resources r8 = r8.getResources()     // Catch: java.lang.Exception -> L38
            r6 = r6[r0]     // Catch: java.lang.Exception -> L38
            java.lang.Object r6 = r7.get(r6)     // Catch: java.lang.Exception -> L38
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Exception -> L38
            int r6 = r6.intValue()     // Catch: java.lang.Exception -> L38
            android.content.res.AssetFileDescriptor r6 = r8.openRawResourceFd(r6)     // Catch: java.lang.Exception -> L38
            java.io.FileDescriptor r1 = r6.getFileDescriptor()     // Catch: java.lang.Exception -> L38
            long r2 = r6.getStartOffset()     // Catch: java.lang.Exception -> L38
            long r4 = r6.getLength()     // Catch: java.lang.Exception -> L38
            r0 = r9
            r0.setDataSource(r1, r2, r4)     // Catch: java.lang.Exception -> L38
            r12.prepare()     // Catch: java.lang.Exception -> L38
            return
        L38:
            r10.countDown()
            return
        L3c:
            r12.release()
            r6 = 0
            r11.abandonAudioFocus(r6)
            r10.countDown()
            return
    }

    public static /* synthetic */ void c(android.media.MediaPlayer r0) {
            r0.start()
            return
    }

    public static synchronized com.bxkj.student.run.app.utils.d0 e() {
            java.lang.Class<com.bxkj.student.run.app.utils.d0> r0 = com.bxkj.student.run.app.utils.d0.class
            monitor-enter(r0)
            com.bxkj.student.run.app.utils.d0 r1 = com.bxkj.student.run.app.utils.d0.b     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            com.bxkj.student.run.app.utils.d0 r1 = new com.bxkj.student.run.app.utils.d0     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            com.bxkj.student.run.app.utils.d0.b = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            com.bxkj.student.run.app.utils.d0 r1 = com.bxkj.student.run.app.utils.d0.b     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    private int h(android.content.Context r5) {
            r4 = this;
            java.lang.String r0 = "audio"
            java.lang.Object r5 = r5.getSystemService(r0)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            r0 = 2
            int r5 = r5.getStreamMaxVolume(r0)
            double r0 = (double) r5
            r2 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r0 = r0 * r2
            int r5 = (int) r0
            return r5
    }

    private /* synthetic */ void i(android.content.Context r1, java.util.List r2) {
            r0 = this;
            r0.m(r1, r2)
            return
    }

    private void j(android.content.Context r3, int r4) {
            r2 = this;
            java.lang.String r0 = "audio"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            r0 = 2
            r1 = 0
            r3.setStreamVolume(r0, r4, r1)
            return
    }

    private void k(android.content.Context r3, int r4) {
            r2 = this;
            java.lang.String r0 = "audio"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            r0 = 3
            r1 = 0
            r3.setStreamVolume(r0, r4, r1)
            return
    }

    private void m(android.content.Context r14, java.util.List<java.lang.Integer> r15) {
            r13 = this;
            monitor-enter(r13)
            java.util.concurrent.CountDownLatch r5 = new java.util.concurrent.CountDownLatch     // Catch: java.lang.Throwable -> L69
            r0 = 1
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L69
            android.media.MediaPlayer r4 = new android.media.MediaPlayer     // Catch: java.lang.Throwable -> L69
            r4.<init>()     // Catch: java.lang.Throwable -> L69
            if (r15 == 0) goto L84
            int r0 = r15.size()     // Catch: java.lang.Throwable -> L69
            if (r0 <= 0) goto L84
            r0 = 0
            int[] r1 = new int[]{r0}     // Catch: java.lang.Throwable -> L69
            r2 = 0
            java.lang.String r3 = "audio"
            java.lang.Object r3 = r14.getSystemService(r3)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            android.media.AudioManager r3 = (android.media.AudioManager) r3     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            r6 = 2
            r7 = 3
            r3.requestAudioFocus(r2, r7, r6)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            android.content.res.Resources r6 = r14.getResources()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            r0 = r1[r0]     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            java.lang.Object r0 = r15.get(r0)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            android.content.res.AssetFileDescriptor r12 = r6.openRawResourceFd(r0)     // Catch: java.lang.Throwable -> L72 java.lang.Exception -> L75
            r4.setAudioStreamType(r7)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            java.io.FileDescriptor r7 = r12.getFileDescriptor()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            long r8 = r12.getStartOffset()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            long r10 = r12.getLength()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            r6 = r4
            r6.setDataSource(r7, r8, r10)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            r4 = r6
            r4.prepareAsync()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            com.bxkj.student.run.app.utils.a0 r0 = new com.bxkj.student.run.app.utils.a0     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            r4.setOnPreparedListener(r0)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            com.bxkj.student.run.app.utils.b0 r0 = new com.bxkj.student.run.app.utils.b0     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            r2 = r15
            r6 = r3
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            r4.setOnCompletionListener(r0)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            r12.close()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L84
            goto L84
        L69:
            r0 = move-exception
            r14 = r0
            goto L8c
        L6c:
            r0 = move-exception
            r14 = r0
            r2 = r12
            goto L7e
        L70:
            r2 = r12
            goto L75
        L72:
            r0 = move-exception
            r14 = r0
            goto L7e
        L75:
            r5.countDown()     // Catch: java.lang.Throwable -> L72
            if (r2 == 0) goto L84
            r2.close()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L84
            goto L84
        L7e:
            if (r2 == 0) goto L83
            r2.close()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L83
        L83:
            throw r14     // Catch: java.lang.Throwable -> L69
        L84:
            r5.await()     // Catch: java.lang.Throwable -> L69 java.lang.InterruptedException -> L8a
            r13.notifyAll()     // Catch: java.lang.Throwable -> L69 java.lang.InterruptedException -> L8a
        L8a:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L69
            return
        L8c:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L69
            throw r14
    }

    public int d(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "audio"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.media.AudioManager r2 = (android.media.AudioManager) r2
            r0 = 2
            int r2 = r2.getStreamVolume(r0)
            return r2
    }

    public int f(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "audio"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.media.AudioManager r2 = (android.media.AudioManager) r2
            r0 = 3
            int r2 = r2.getStreamMaxVolume(r0)
            return r2
    }

    public int g(android.content.Context r3) {
            r2 = this;
            java.lang.String r0 = "audio"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " audioManager.getMode()="
            r0.append(r1)
            int r1 = r3.getMode()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.orhanobut.logger.j.c(r0)
            r0 = 3
            int r3 = r3.getStreamVolume(r0)
            return r3
    }

    public void l(android.content.Context r3, java.util.List<java.lang.Integer> r4) {
            r2 = this;
            java.util.concurrent.ExecutorService r0 = r2.a
            if (r0 == 0) goto Lc
            com.bxkj.student.run.app.utils.c0 r1 = new com.bxkj.student.run.app.utils.c0
            r1.<init>(r2, r3, r4)
            r0.execute(r1)
        Lc:
            return
    }
}
